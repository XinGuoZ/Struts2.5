package com.services.impl;

import com.mapper.AdminMapper;
import com.po.Admin;
import com.po.AdminExample;
import com.services.AdminService;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service(value="adminServiceimpl")
public class AdminServiceimpl implements AdminService{

	@Autowired
	private AdminMapper adminmaper;
	
	
	public void setAdminmaper(AdminMapper adminmaper) {
		this.adminmaper = adminmaper;
	}

	@Override
	public int countByExample(AdminExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(AdminExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Integer adminid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Admin record) {
		// TODO Auto-generated method stub
		return adminmaper.insertSelective(record);
	}

	@Override
	public int insertSelective(Admin record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Admin> selectByExample(AdminExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin selectByPrimaryKey(Integer adminid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Admin record, AdminExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Admin record, AdminExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Admin record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Admin record) {
		// TODO Auto-generated method stub
		return 0;
	}
}