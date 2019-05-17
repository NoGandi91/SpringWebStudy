package org.nogandi.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//스프링mvc의 컨트롤러 객체임을 명시하는 어노테이션
@Controller 
public class SampleController {
	
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("doA")
	public void doA() {
		
		logger.info("doA called.........................");
	}
	
	@RequestMapping("doB")
	public void doB() {
		
		logger.info("doB called.........................");
	}
}
