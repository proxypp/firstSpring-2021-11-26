package co.micol.hello.member.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import co.micol.hello.member.service.MemberMapper;
import co.micol.hello.member.service.MemberService;
import co.micol.hello.member.service.MemberVO;

@Repository("memberDao")  //3개중 아무거나 써도 된다 하지만기능은 다르다???.   //Ioc 컨테이너에 레파지토리를 등록한다.
//@Service
//@Component
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper map;
	
	
	@Override
	public List<MemberVO> memberSelectList() {
		// TODO Auto-generated method stub
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberDelete(vo);
	}

	@Override
	public boolean memberIdCheck(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberIdCheck(vo);
	}

	@Override
	public int memberAuthorUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberAuthorUpdate(vo);
	}

}
