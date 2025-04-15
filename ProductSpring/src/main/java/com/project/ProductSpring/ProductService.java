package com.project.ProductSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
    @Autowired
	productRepo repo;
    
    
    public List<Product> showData(){
		 
		
		return repo.findAll();
	} 
    public void Save(Product product) {
    	repo.save(product);
    }
    public Product get(int id) {
    	return repo.findById(id).get();
    	
    }
    public void delete(int id) {
    	repo.deleteById(id);
    }
	
}
