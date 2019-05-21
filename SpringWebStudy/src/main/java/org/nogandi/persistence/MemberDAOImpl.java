package org.nogandi.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.nogandi.domain.MemberVO;
import org.springframework.stereotype.Repository;

//DAO를 스프링에 인식시키기 위해서 주로 사용
@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "org.nogandi.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}
	
	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember",vo);
	}
	
	@Override
	public MemberVO readMember(String userId) throws Exception {
		return (MemberVO)
		sqlSession.selectOne(namespace+".selectMember",userId);
	}
	
	@Override
	public MemberVO readWithPw(String userId, String pw) throws Exception{
		
		Map<String, Object> paramMap = new HashMap<String,Object>();
		
		paramMap.put("userid", userId);
		paramMap.put("userpw",pw);
		
		return sqlSession.selectOne(namespace+".readWithPw", paramMap);
	}
	

}
