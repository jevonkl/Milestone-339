package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.ProductsDataService;
import com.gcu.data.entity.ProductEntity;
import com.gcu.model.ProductModel;

public class ProductBusinessService implements ProductBusinessServiceInterface {

	@Override
	public void test() {
		System.out.println("Called from ProductBusinessService");

	}

	@Autowired
	ProductsDataService service;

	@Override
	public List<ProductModel> getProducts() {

		List<ProductEntity> productEntity = service.findAll();

		// Iterates over the Entity orders and create a list of Domain Orders
		List<ProductModel> productsDomain = new ArrayList<ProductModel>();
		for (ProductEntity entity : productEntity) {
			productsDomain.add(new ProductModel(entity.getId(), entity.getGameNo(), entity.getGameName(),
					entity.getPrice(), entity.getQuantity()));
		}
		// returns list of domain orders
		return productsDomain;

	}

	@Override
	public void init() {
		System.out.println("In the OrdersBusinessService.init()");
	}

	@Override
	public void destroy() {
		System.out.println("In the OrdersBusinessService.destroy()");
	}

}
