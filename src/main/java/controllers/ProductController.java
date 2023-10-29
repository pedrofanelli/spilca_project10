package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import services.ProductService;

@Controller
public class ProductController {

	private final ProductService productService;
	
	public ProductController(
			ProductService productService) { // DI to get the service bean
		this.productService = productService;
	}
	
	
	@RequestMapping("/products")                  
	public String viewProducts(Model model) {     
	    var products = productService.findAll();    
	    model.addAttribute("products", products);   
	 
	    return "products.html";                     
	}


	
	
}
