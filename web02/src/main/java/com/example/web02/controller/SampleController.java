package com.example.web02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.web02.service.SampleService;
import com.example.web02.vo.Sample;


@Controller
public class SampleController {
	
	@Autowired private SampleService sampleService;
	
	@GetMapping("/sampleList")
	 public String sampleList(Model model) {
		 List<Sample> list = sampleService.getSelectList();
		 model.addAttribute("list", list);
		 
		 return "sampleList";
	 }
}
