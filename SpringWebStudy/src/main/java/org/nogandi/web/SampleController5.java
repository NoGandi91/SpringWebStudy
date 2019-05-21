package org.nogandi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nogandi.domain.ProductVO;

@Controller
public class SampleController5 {
	
	@RequestMapping("doJSON")
	public @ResponseBody ProductVO doJSON() {
		
		ProductVO vo = new ProductVO("���û���", 30000);
		
		return vo;
	}
}
