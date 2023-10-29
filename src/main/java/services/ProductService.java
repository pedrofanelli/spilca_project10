package services;

import org.springframework.stereotype.Service;
import model.Product;
import java.util.ArrayList;
import java.util.List;

/*
 * A controller will call the USE CASES implemented by the service
 * A controller fulfills ACTIONS
 * So the use cases allow to acomplish the actions
 */

@Service
public class ProductService {

	private List<Product> products = new ArrayList<>();
	
	public void addProduct(Product p) {
		products.add(p);
	}
	public List<Product> findAll() {
		return this.products;
	}
}
