package com.mini.Lulu02_MS1_Products.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mini.Lulu02_MS1_Products.entity.Products;
import com.mini.Lulu02_MS1_Products.repository.ProductRepo;

@RequestMapping("/pps")
@RestController
public class ProductController {
	@Autowired
	ProductRepo productRepo;
	
	@GetMapping("/getProduct")
	public List<Products> getJPQL() {

		return productRepo.findAll(); // select * from <TableName>;
	}
	@PostMapping("/addProduct")
	public Products createuser(@RequestBody Products prod) {
		return productRepo.save(prod);
	}
	@PutMapping("/updateProduct/{id}")
	public ResponseEntity<Object> updateStudent(@RequestBody Products product, @PathVariable int id) {

	Optional<Products> productOptional = productRepo.findById(id);

	if (productOptional.isEmpty())
		return ResponseEntity.notFound().build();
	product.setId(id);
	productRepo.save(product);
	return ResponseEntity.noContent().build();
	}
	@DeleteMapping("/deleteProduct/{id}")
	public void deletProduct(@PathVariable("id") Integer id  ) {
		productRepo.deleteById(id); 
		}

}
