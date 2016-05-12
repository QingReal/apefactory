package com.qp.apefactory.cloud.controllers;

import com.qp.apefactory.cloud.models.accounting.Role;
import com.qp.apefactory.cloud.models.accounting.User;
import com.qp.apefactory.cloud.services.accounting.RoleService;
import com.qp.apefactory.cloud.services.accounting.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.data.domain.Pageable;
import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

@Controller
public class MainController {

  Logger logger = LoggerFactory.getLogger(MainController.class);

  @Resource
  private UserService service;

  @Resource
  private RoleService roleService;



  @RequestMapping("/")
  public String index(Pageable pageable) {

   // logger.info("username-->"+roleService.save(role).getName());
    service.save(new User());
    return "index";
  }

}
