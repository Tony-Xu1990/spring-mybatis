package org.framestudy.spring_mybatis.usermag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.pojos.Pager;
import org.framestudy.spring_mybatis.usermag.beans.UserInfo;
import org.framestudy.spring_mybatis.usermag.dao.IUserDao;
import org.framestudy.spring_mybatis.usermag.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements IUserService {

	@Resource
	private IUserDao userDaoImpl;
	public int saveUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return userDaoImpl.saveUserInfo(user);
	}

	public int updateUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return userDaoImpl.updateUserInfo(user);
	}

	public int deleteUserInfo(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.deleteUserInfo(id);
	}

	public UserInfo getUserInfoById(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserInfoById(id);
	}

	public UserInfo getUserByLoginNameAndPwd(String loginName, String pwd) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserByLoginNameAndPwd(loginName, pwd);
	}

	public List<UserInfo> queryUserListByMap(Map map) {
		// TODO Auto-generated method stub
		return userDaoImpl.queryUserListByMap(map);
	}

	public int batchSaveUserInfo(List<UserInfo> user) {
		// TODO Auto-generated method stub
		return userDaoImpl.batchSaveUserInfo(user);
	}

	public int batchDeleteUserInfo(List<UserInfo> user) {
		// TODO Auto-generated method stub
		return userDaoImpl.batchDeleteUserInfo(user);
	}

	@Override
	public Pager getUserListByMapToPager(Map map) {
		// TODO Auto-generated method stub
		int totalRows = userDaoImpl.countUserListByMapToPager(map);
		List<?> datas = userDaoImpl.getUserListByMapToPager(map);
		int page = (int) map.get("page");
		int rows = (int) map.get("rows");
		return new Pager(page,rows,totalRows,datas);
	}

}
