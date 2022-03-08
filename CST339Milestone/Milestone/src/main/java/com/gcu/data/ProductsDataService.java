package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcu.data.entity.ProductEntity;
import com.gcu.data.repository.ProductsRepository;

@Service
public class ProductsDataService implements DataAccessInterface<ProductEntity> {
	/*
	 * autowiring enables injection of an object dependency implicitly internally
	 * uses a constructor injection cannot be used to injection primitive & string
	 * values
	 */
	@Autowired
	private ProductsRepository productsRepository;

	/*
	 * Provides JavaBean framework provides a type data can access to it in the form
	 * of input streams & output streams Non-default constructor for constructor
	 * injection
	 */
	public ProductsDataService(ProductsRepository productsRepository) {
		this.productsRepository = productsRepository;
	}

	/**
	 * CRUD to return all entities
	 */

	@Override
	public ProductEntity findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductEntity> findAll() {

		List<ProductEntity> products = new ArrayList<ProductEntity>();
		try {
			// Get All the entity orders
			Iterable<ProductEntity> productsIterable = productsRepository.findAll();

			// Converts to a List and returns said list
			products = new ArrayList<ProductEntity>();
			productsIterable.forEach(products::add);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Returns List
		return products;
	}

	@Override
	public boolean create(ProductEntity product) {
		try {
			this.productsRepository.save(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean update(ProductEntity t) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(ProductEntity t) {
		// TODO Auto-generated method stub
		return true;
	}
}
