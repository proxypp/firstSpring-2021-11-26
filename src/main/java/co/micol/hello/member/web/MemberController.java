package co.micol.hello.member.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.micol.hello.member.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberDao;
	
	@RequestMapping("/memberList.do")
	public String memberList(Model model) {
		model.addAttribute("member", memberDao.memberSelectList());  //request.setAttribute("members", memberDao.memberSelectList);
		return "member/memberList";
		
		//member 처리하는 모든 작성
		
	}
	@PostMapping("/memberLogin.do") 
	public String memberLogin(Model model) {
		return "member/memberLogin";
	}
	@RequestMapping("/memberSelect.do") 
	public String memberSelect(Model model) {
		
		
		return "member/memberSelect";
	}
}
