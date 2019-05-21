package org.nogandi.persistence;

import org.nogandi.domain.MemberVO;

public interface MemberDAO {

	public String getTime();
	
	public void insertMember(MemberVO vo);
	
	public MemberVO readMember(String userId) throws Exception;
	
	public MemberVO readWithPw(String userId,String userPw) throws Exception;
	
}
