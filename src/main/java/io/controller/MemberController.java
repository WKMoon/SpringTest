package io.controller;

import io.service.MemberService;
import io.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class MemberController {

    @Resource(name="memberService")
    private MemberService memberService;

    @RequestMapping("/")
    public String index(){return "index";}


    @RequestMapping(value="/login", method= RequestMethod.POST)
    public String login(MemberVO memberVO){
        MemberVO loginCheck = memberService.login(memberVO);
        System.out.println("loginCheck: " + loginCheck.getId());
        String result = "";
        if(loginCheck.getId() == memberVO.getId()){
            result = memberVO.getId();
        }else{
            result = "anonymous";
        }
        return result;
    }
}
