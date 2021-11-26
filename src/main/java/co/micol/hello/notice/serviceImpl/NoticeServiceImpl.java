package co.micol.hello.notice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import co.micol.hello.notice.service.NoticeMapper;
import co.micol.hello.notice.service.NoticeService;
import co.micol.hello.notice.service.NoticeVO;

//@Repository("noticeDao")
@Service("noticeDao")
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeMapper map;
	
	@Override
	public List<NoticeVO> noticeSelectList() {
		// TODO Auto-generated method stub
		return map.noticeSelectList();
	}

	@Override
	public NoticeVO noticeSelect(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeSelect(vo);
	}

	@Override
	public int noticeInsert(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeInsert(vo);
	}

	@Override
	public int noticeUpdate(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeUpdate(vo);
	}

	@Override
	public int noticeDelete(NoticeVO vo) {
		// TODO Auto-generated method stub
		return map.noticeDelete(vo);
	}

	@Override
	public List<NoticeVO> noticeSearchList(String searchKey) {
		// TODO Auto-generated method stub
		return map.noticeSearchList(searchKey);
	}

}
