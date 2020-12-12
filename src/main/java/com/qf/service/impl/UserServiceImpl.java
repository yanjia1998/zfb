package com.qf.service.impl;

import com.qf.common.BaseResp;
import com.qf.dao.UserRepository;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    JavaMailSender javaMailSender;


    @Value("${spring.mail.username}")
    private String from;

    @Override
    public String sendEmail(String email, HttpServletRequest request) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(email);
        //发送的主题
        simpleMailMessage.setSubject("注册验证码");
        Random random = new Random();
        Integer codes = random.nextInt(9000)+1000;
        String code = codes.toString();
        //发送的内容
        simpleMailMessage.setText(code);
        //发送
        javaMailSender.send(simpleMailMessage);
        HttpSession session = request.getSession();
        session.setAttribute(email,code);
        return "success";
    }

    @Override
    public BaseResp findById(Integer id) {
        Optional<User> byId = userRepository.findById(id);
        BaseResp baseResp = new BaseResp();
        if(byId.isPresent()){
            baseResp.setMessage("查询成功");
            baseResp.setData(byId.get());
            baseResp.setCode(200);
        }else{
            baseResp.setMessage("查询失败");
            baseResp.setCode(201);
        }
        return baseResp;
    }

    @Override
    public BaseResp login(@RequestBody User user) {
        BaseResp baseResp = new BaseResp();

            User byNameAndPassword = userRepository.findByNameAndPassword(user.getName(), user.getPassword());
            if(byNameAndPassword != null){
                baseResp.setData(byNameAndPassword);
                baseResp.setCode(200);
                baseResp.setMessage("登录成功");
                return baseResp;
            }else{
                baseResp.setCode(201);
                baseResp.setMessage("登录失败");
                return baseResp;
        }
    }

    @Override
    public BaseResp registry(User user, HttpServletRequest request) {
        HttpSession session = request.getSession();
        //从session中根据email获取验证码
        String code = (String)session.getAttribute(user.getEmail());
        BaseResp baseResp = new BaseResp();
        if(code != null &&  code.equals(user.getCode())){

                userRepository.saveAndFlush(user);
                baseResp.setMessage("用户注册成功");
                baseResp.setCode(200);
                return baseResp;

        }else{
            baseResp.setMessage("验证码错误");
            baseResp.setCode(200);
            return baseResp;
        }

    }

}
