package cn.ekgc.mycloud.demo;

import cn.ekgc.mycloud.entity.User;
import cn.ekgc.mycloud.fallback.MyFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "mycloud-provider", fallback= MyFallBack.class)
@RequestMapping("/hello")
public interface InteDemo {
	@PostMapping("/say")
	String sayHello(@RequestParam String name) throws Exception;

	@PostMapping("marry")
	String marry(@RequestBody User user) throws Exception;
}
