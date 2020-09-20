package cn.ekgc.mycloud.controller;

import cn.ekgc.mycloud.demo.InteDemo;
import cn.ekgc.mycloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("demoController")
@RequestMapping("/request")
public class DemoController {
	@Autowired
	private InteDemo inteDemo;

	@GetMapping("/demo")
	@ResponseBody
	public String say(String name) throws Exception {
		return inteDemo.sayHello(name);
	}

	@GetMapping("/marry")
	@ResponseBody
	public String marry(User user) throws Exception {
		return inteDemo.marry(user);
	}
}
