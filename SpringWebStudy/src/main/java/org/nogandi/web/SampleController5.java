package org.nogandi.web;

import org.nogandi.domain.ProductVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController5 {
	
	@RequestMapping("doJSON")
	public @ResponseBody ProductVO doJSON() {
		
		ProductVO vo = new ProductVO("ป๙วรป๙วร", 30000);
		
		return vo;
	} 
}
