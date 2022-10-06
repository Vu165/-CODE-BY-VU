package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.entity.Prefecture;
import vn.com.vti.springexam.entity.PrefectureExample;
import vn.com.vti.springexam.mapper.PrefectureMapper;

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	@Autowired
	private PrefectureMapper prefectureMapper;
	
	@RequestMapping("/index")
	public String idx() {
		return "sample";
	}
	
	@RequestMapping("/hi")
	public String idx1(Model model) {
		PrefectureExample example = new PrefectureExample();
		example.setOrderByClause("ID");
		List<Prefecture> pres = prefectureMapper.selectByExample(example);
		model.addAttribute("pres", pres);
		return "sample";
	}
}

