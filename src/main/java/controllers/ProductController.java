package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import model.Product;

import services.ProductService;

@Controller
public class ProductController {

	private final ProductService productService;
	
	public ProductController(
			ProductService productService) { // DI to get the service bean
		this.productService = productService;
	}
	
	
	@GetMapping("/products")                  
	public String viewProducts(Model model) {  // ACTION    
	    var products = productService.findAll();    
	    model.addAttribute("products", products);  // i'm passing a list of products retrieved from the service 
	    return "products.html";                     
	}

	@PostMapping("/products")
	public String addProduct(           // we can even pass the parameters directly to the object
			//@RequestParam String name,
			//@RequestParam double price,
			Product p,
			Model model
			) {
		//Product p = new Product();
		//p.setName(name);
		//p.setPrice(price);
		productService.addProduct(p);
		
		var products = productService.findAll();
		model.addAttribute("products", products);
		return "products.html";
	}

	
	
}
