package com.sakila.MybatisImpl;

import java.sql.SQLException;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hand.Dao.IDDao;
import com.hand.Entity.EntityWithID;

public class CountryDaoSp extends SqlSessionDaoSupport implements IDDao {

	public EntityWithID getByID(long ID) throws SQLException {
		return this.getSqlSession().selectOne("getByID_Country",ID);
	}

	public void delByID(long ID) throws SQLException {
		this.getSqlSession().delete("delByID_Country",ID);
	}

}
