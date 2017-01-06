package com.myLife.system.security.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.myLife.core.base.dao.ICoreDao;
import com.myLife.system.security.entity.User;

/**
 * 用户数据操作接口
 * @author HuYang 
 * @date 2016年11月4日 下午4:52:46
 */
public interface IUserDao extends ICoreDao<User, Integer> {

	
}
