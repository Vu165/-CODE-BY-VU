package vn.com.vti.springexam.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FortuneController {
	@RequestMapping("/fortune")
	public String index(Model model) {
		Random rnd = new Random();
		int value = rnd.nextInt(3);
		String text = "";
		if (value==1) {
			text = "Lucky";
		}else if(value==2) {
			text = "Normal";
		}else {
			text = "Bad";
		}
		model.addAttribute("forturnRandom",text);
		return "forturn";
		
	}
	
}
