package com.circle.socialcircle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {
  private final IDemoService demoService;

  public DemoController(IDemoService demoService) {
    this.demoService = demoService;
  }

  @GetMapping("index")
  public DemoOutput showMessage(DemoInput input) {
    DemoOutput result = new DemoOutput();
    String outputMessage = demoService.showMessage(input.getMessage());
    result.setMessage(outputMessage);
    return result;
  }
}
