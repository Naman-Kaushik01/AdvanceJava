package com.project.ProductSpring;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyController  {
	
	@Autowired
	ProductService prService;
	
	
	
	
	@RequestMapping("/")
	public String call(Model model) {
		
		List<Product> list =prService.showData();
		for(Product p:list) {
			System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
		}
		model.addAttribute("data", list);
		return "index";
	}
	
	@RequestMapping("/new")
	public String addData(Model model) {
		Product product= new Product();
		model.addAttribute("product", product);
		return "NewProduct";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addNewData(@ModelAttribute("product")Product product) {
		prService.Save(product);
		return "redirect:/";
		
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable (name="id")int id) {
		
		ModelAndView view = new ModelAndView("edit_product");
		Product product = prService.get(id);
		view.addObject("product", product);
		return view;
		
		
	}
	@RequestMapping("/delete/{id}")
	public String DeleteProductPage(@PathVariable (name="id")int id) {
		
		prService.delete(id);
		return "redirect:/";
		
		 
	}


}
