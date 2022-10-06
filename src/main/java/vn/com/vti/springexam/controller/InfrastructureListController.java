package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.entity.Infrastructure;
import vn.com.vti.springexam.entity.InfrastructureExample;
import vn.com.vti.springexam.mapper.InfrastructureMapper;


@Controller
@RequestMapping("/infrastructureList")
public class InfrastructureListController {
	@Autowired
	private InfrastructureMapper infrastructureMapper;
	
	@RequestMapping("/show")
	public String index(Model model) {
	InfrastructureExample infrastructureExample = new InfrastructureExample();
	infrastructureExample.setOrderByClause("ID");
	List<Infrastructure> infrastructureList = infrastructureMapper.selectByExample(infrastructureExample);
	model.addAttribute("infrasList",infrastructureList);
	return "infrasList";
	}
}
