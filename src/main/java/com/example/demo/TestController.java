package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sai on 2017/7/19. this 17:19
 */
@RestController
@RefreshScope
public class TestController {

  @Value("${test.from}")
  private String from;

  /**
   * 向带有bus的client访问（post方式）/bus/refresh 重新向git获取更新数据
   */
  @GetMapping("/from")
  public String getFrom(){
    String s = "<form action=\"/bus/refresh\" method=\"post\">\n" +
      "  <input type=\"submit\" value=\"提交\">\n" +
      "</form>";
    return this.from + s;
  }
}
