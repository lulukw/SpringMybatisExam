package com.sakila.MybatisImpl;

import java.sql.SQLException;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hand.AOP.CanAddToDb;
import com.hand.Dao.BasicIdEntityDao;
import com.hand.Entity.EntityWithID;
import com.sakila.Entity.Customer;
import com.sakila.Entity.Film;

public class CustomerDaoSp extends SqlSessionDaoSupport implements CanAddToDb,BasicIdEntityDao{

	public EntityWithID getByID(long ID) throws SQLException {
		return this.getSqlSession().selectOne("getByID_Customer",ID);
	}
	
	public void delByID(long ID) throws SQLException {
		this.getSqlSession().delete("delByID_Customer",ID);

	}

	public void ModifyIdEntity(EntityWithID entity) throws SQLException {
		this.getSqlSession().update("ModifyIdEntity_Customer", entity);

	}
	
	public void AddIdEntity(EntityWithID entity) throws SQLException {
		this.getSqlSession().insert("AddIdEntity_Customer", entity);

	}
	
	public Customer[] getByFirstName_Customer(String first_name) throws SQLException{
		List<Customer> lc=this.getSqlSession().selectList("getByFirstName_Customer", first_name);
		Customer[] res=new Customer[lc.size()];
		res=lc.toArray(res);
		return res;
	}
	
	public Customer getLastCustomer() throws SQLException{
		return this.getSqlSession().selectOne("getLastCustomer_Customer");
	}

	public Film getLastFilm() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
