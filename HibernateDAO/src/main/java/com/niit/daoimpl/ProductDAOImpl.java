package com.niit.daoimpl;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.niit.dao.ProductDAO;
import com.niit.model.Product;

@Transactional
@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean addProduct(Product p) {
	sessionFactory.getCurrentSession().save(p);
	return true;
	}
	
	@Override
	public boolean updateProduct(Product p) {
		sessionFactory.getCurrentSession().saveOrUpdate(p);
		return true;
	}

	@Override
	public boolean deleteProduct(Product p) {
		sessionFactory.getCurrentSession().delete(p);
		return true;
	}

	@Override
	public List<Product> displayProduct() {
		 return sessionFactory.getCurrentSession().createCriteria(Product.class).list();
	}

	@Override
	public Product displayProductById(int bookid) {
		Query query =sessionFactory.getCurrentSession().createQuery("from com.niit.model.Product where prodId= :id");
		query.setParameter("id",bookid);
		return (Product)query.getResultList().get(0);
	}

}