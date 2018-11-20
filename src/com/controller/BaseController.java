package com.controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public class BaseController {
	/**
	 * 使用@InitBinder解决SpringMVC日期类型无法绑定   还有其他几种方法 但目前这种最为简单
	 * @param dataBinder
	 */
	@InitBinder
	public void initBinder(WebDataBinder dataBinder){
		System.out.println("initBinder=======================");
		  
		dataBinder.registerCustomEditor(Date.class, 
				new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
}
