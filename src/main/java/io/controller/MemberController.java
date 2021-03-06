package io.controller;

import io.service.MemberService;
import io.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MemberController {

    @Resource(name="memberService")
    private MemberService memberService;

    @RequestMapping("/")
    public String index(){return "index";}


    @RequestMapping(value="/login", method= RequestMethod.POST)
    @ResponseBody
    public String login(MemberVO memberVO){
        boolean loginCheck = memberService.login(memberVO);

        String result = "";

        if(loginCheck == true){
            result = memberVO.getId();
        }else{
            result = "anonymous";
        }
        return result;
    }
}
