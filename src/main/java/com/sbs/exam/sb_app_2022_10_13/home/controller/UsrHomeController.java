package com.sbs.exam.sb_app_2022_10_13.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {
  private int count;

  public UsrHomeController() {
    count = 0;
  }
  @RequestMapping("/usr/home/main")
  @ResponseBody
  public String showMain1() {
    return "안녕하세요!";
  }

  @RequestMapping("/usr/home/main2")
  @ResponseBody
  public int showMain2() {
    count++;
    return count;
  }


}
