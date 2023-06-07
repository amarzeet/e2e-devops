package com.airbus.management.controller;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.airbus.management.model.Product;
import com.airbus.management.service.ProductService;

@SpringBootTest
public class ContollerTest {
	
	@InjectMocks
	private MainController mainController;
	
	@Mock
	private ProductService productService;
	
	@Test
	public void testGetAllProducts() {
		Product product =new Product();
		
		product.setProductId("A01");
		product.setProductName("Airport_test");
		
		List<Product> productList=new ArrayList<>();
		
		productList.add(product);
		
		when(productService.getAllProducts()).thenReturn(productList);
		
		Object result=mainController.getAllProducts();
		
		assertNotNull(result);
	}

}
