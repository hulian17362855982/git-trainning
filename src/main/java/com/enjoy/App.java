fpackage com.enjoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App {

	/**
	 * 通过main方法，作为启动的入口
	 * */
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello, this is fisrt use git ---->  fetch from github!";
	}
	
}


