package io.service;

import io.dao.MemberDAO;
import io.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
    @Autowired
    protected MemberDAO memberDAO;

    @Override
    public boolean login(MemberVO memberVO) {
        return memberDAO.login(memberVO);
    }
}
