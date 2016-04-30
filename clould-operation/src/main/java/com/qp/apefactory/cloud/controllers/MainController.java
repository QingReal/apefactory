package com.qp.apefactory.cloud.controllers;

import com.qp.apefactory.cloud.models.accounting.User;
import com.qp.apefactory.cloud.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.data.domain.Pageable;
import javax.annotation.Resource;

@Controller
public class MainController {

  Logger logger = LoggerFactory.getLogger(MainController.class);

  @Resource
  private UserService service;
  @RequestMapping("/")
  public String index(Pageable pageable) {
    User u = new User();
    u.setName("ะกร๗");
    u.setPassword("123456");
    u.setEmail("857617647@qq.com");
    u.setMobile("18826411766");
    User user = service.save(u);
    logger.info("username-->"+u.getName());
    service.findAll(pageable);
    return "index";
  }

}
