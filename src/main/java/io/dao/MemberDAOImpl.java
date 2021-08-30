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
    public MemberVO login(MemberVO memberVO) {
        System.out.println("DaoIMPL Enter");
        System.out.println(memberVO.getId());
        MemberVO vo = sqlSessionTemplate.selectOne("sql.login", memberVO);
        System.out.println("voID: " + vo.getId());
        return vo;

    }
}
