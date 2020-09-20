package cn.ekgc.mycloud.fallback;

import cn.ekgc.mycloud.demo.InteDemo;
import cn.ekgc.mycloud.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component("myFallBack")
@RequestMapping("/exception")
public class MyFallBack implements InteDemo {
	@Override
	public String sayHello(String name) throws Exception {
		return "此时远程调用出现异常";
	}

	@Override
	public String marry(User user) throws Exception {
		return "此时远程调用出现异常";
	}
}
