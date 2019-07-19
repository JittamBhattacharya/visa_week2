package com.visa.prj.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.hibernate.metamodel.source.binder.Orderable;
import org.springframework.stereotype.Repository;

import com.visa.prj.entity.Order;
@Repository
public class OrderDaoJpaImpl implements OrderDao {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void placeOrder(Order o) {
		em.persist(o);
	}

	@Override
	public List<Order> getOrders() {
		TypedQuery<Order> query = em.createQuery("from order" , Order.class);
		return query.getResultList();
	}

}
