package com.training.ifaces;

import java.util.List;

public interface DAO<T> {
	
	public Object add(T t);
	public T find(Object obj);
	public List<T> findAll();
	public T update(T t);
	public boolean delete(Object obj);
}
