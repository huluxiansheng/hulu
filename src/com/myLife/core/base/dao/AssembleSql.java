package com.myLife.core.base.dao;

import java.io.Serializable;

import org.apache.ibatis.jdbc.SQL;

/**
 * @author HuYang 
 * @date 2016��11��9�� ����4:49:09
 */
public class AssembleSql<T,PK extends Serializable> {

	public String insert(T o){
		return new SQL(){{
			SELECT("");
			FROM("");
			WHERE("");
		}}.toString();
	}
}
