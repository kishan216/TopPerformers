package com.training.daos;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.Department;
import com.training.ifaces.DAO;

public class DepartmentDAO extends HibernateDaoSupport implements DAO<Department> {

	@Override
	public Object add(Department t) {
		Serializable key=getHibernateTemplate().save(t);
		return key;
	}

	@Override
	public Department find(Object obj) {
		Department d=getHibernateTemplate().get(Department.class,(Serializable)obj);
		return d;
	}

	@Override
	public List<Department> findAll() {
		@SuppressWarnings("unchecked")
		List<Department> dlist=(List<Department>) getHibernateTemplate().find("from Department");
		return dlist;
	}

	@Override
	public Department update(Department t) {
		getHibernateTemplate().update(t);
		return null;
	}

	@Override
	public boolean delete(Object obj) {
		Department d=find(obj);
		getHibernateTemplate().delete(d);
		return false;
	}
}
