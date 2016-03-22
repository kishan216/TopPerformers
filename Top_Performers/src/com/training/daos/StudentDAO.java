package com.training.daos;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.Department;
import com.training.entity.Student;
import com.training.ifaces.DAO;

public class StudentDAO extends HibernateDaoSupport implements DAO<Student> {

	@Override
	public Serializable add(Student t) {
		Serializable key=getHibernateTemplate().save(t);
		return key;
	}

	@Override
	public Student find(Object obj) {
		Student s=getHibernateTemplate().get(Student.class,(Serializable)obj);
		return s;
	}

	@Override
	public List<Student> findAll() {
		@SuppressWarnings("unchecked")
		List<Student> slist=(List<Student>) getHibernateTemplate().find("from Student");
		return slist;
	}

	@Override
	public Student update(Student t) {
		getHibernateTemplate().update(t);
		return null;
	}

	@Override
	public boolean delete(Object obj) {
		Student s=find(obj);
		getHibernateTemplate().delete(s);
		return false;
	}
	
	public List<Student> findTop(int id) {
		@SuppressWarnings("unchecked")
		Query q=getSession().createQuery("from Student where dept.deptId="+id+" order by grade desc");
		q.setMaxResults(3);
		return q.list();
	}
}
