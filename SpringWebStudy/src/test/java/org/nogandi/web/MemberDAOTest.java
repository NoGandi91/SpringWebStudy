package org.nogandi.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nogandi.domain.MemberVO;
import org.nogandi.persistence.MemberDAO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception{
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testInserMember() throws Exception{
		
		MemberVO vo = new MemberVO();
		vo.setUserId("user00");
		vo.setUserPw("user00");
		vo.setUserName("USER00");
		vo.setEmail("user00@aaa.com");
		
		dao.insertMember(vo);
	}
}
