package co.micol.hello.notice.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.micol.hello.member.service.MemberVO;
import co.micol.hello.notice.service.NoticeService;
import co.micol.hello.notice.service.NoticeVO;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeDao; //noticeImpl을 자동 주입하라
	//private MemberService memberDao는 안된다. @autowired는 두개 선언이 안된다. 맨 위에 하나만 선언 가능하다. 그래서 쓸려면 2번 선언해야된다. 
	
	@RequestMapping("/noticeList.do") // 게시글 목록 보기.
	public String noticeList(Model model) {
		model.addAttribute("notices",noticeDao.noticeSelectList());
		
		return "notice/noticeList";
	}
	@RequestMapping("/noticeForm.do")
	public String noticeForm() {
		
		return "notice/noticeForm";
	}
	@RequestMapping("/noticeR.do")
	public String noticeResister(NoticeVO vo, Model model, HttpSession session) {   //스프링에서는 이제 request 객체나 response 객체를 사용하지않는 경향이 있다.
		//public String noticeResister(@Param("bigo") String bigo)방식으로 넣어준다. @Param("bigo") String bigo 파라미터로 전달되는 bigo라는 네임속성을 가지고 있는 값이 넘어오면 String bigo라는 변수에 담겠다는 의미이다. form에서 넘어오는 건 전부 문자로 변환 되는데 String bigo 대신 int bigo라고 쓰면 숫자형으로 바뀐다. 
		//Spring은 형변환을 따로 해주지않아도 알아서 타입 변환을 해준다.
		String path = null;     //모델 과 뷰를 같이 선택하지 않아도 보낼수 있다. modelandview를 쓰지않고 스트링으로 선언해서 보내주는 방식이다.
		if (vo!=null) {			
			model.addAttribute("message", "입력이 성공했다.");
			path = "notice/noticeSuccerss";
		}else {
			model.addAttribute("message", "입력이 실패했다.");
			path = "notice/noticeFail";
		}
		return path;
		
//		session.setAttribute("id", vo.getId());
//		session.setAttribute("author", vo.getTitle());
//		System.out.println(session.getAttribute("id")+"==================");
//		System.out.println(session.getAttribute("author")+"==================");
//		System.out.println(vo.getId());
//		System.out.println(vo.getTitle());
//		System.out.println(vo.getBigo()+20);
//		noticeDao.noticeInsert(vo);
//		return "redirect:noticeList.do";  //jsp .do를 호출하고 싶을 때는 redirect:키워드를 붙여준다.
	}
	//@Param("id") String id
	@PostMapping("/noticeResister.do")
	public ModelAndView noticeResister(MemberVO vo, ModelAndView mv) {  //모델과 뷰를 같이 선택해서 보낼떄.
		if(vo!=null) {
			mv.addObject("message", "성공했다");
			mv.setViewName("notice/noticeSuccess");
		}else {
			mv.addObject("message", "실패했다.");
			mv.setViewName("notice/noticeFail");
		}
		return mv;
	}
}
