package io.dao;

import io.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO{

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public boolean login(MemberVO memberVO) {
        return (Integer) sqlSessionTemplate.selectOne("sql.login", memberVO) == 1;



    }
}
