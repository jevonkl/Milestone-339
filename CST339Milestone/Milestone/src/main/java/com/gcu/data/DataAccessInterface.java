package com.gcu.data;

import java.util.List;

//<T> is a place holder for the model(parameter data type)
//<t> is the placeholder for the parameter name
public interface DataAccessInterface<T> {
	public List<T> findAll();

	public T findById(int id);

	public boolean create(T t);

	public boolean update(T t);

	public boolean delete(T t);

}
