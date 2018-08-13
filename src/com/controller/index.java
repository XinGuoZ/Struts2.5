package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Admin;
import com.po.SInfo;
import com.services.AdminService;
import com.services.impl.AdminServiceimpl;

public class index extends ActionSupport {

	private SInfo infos;
	private AdminService adminServiceimpl;
	
	


	public void setAdminServiceimpl(AdminService adminServiceimpl) {
		this.adminServiceimpl = adminServiceimpl;
	}


	public SInfo getInfos() {
		return infos;
	}


	public void setInfos(SInfo infos) {
		this.infos = infos;
	}


	public String indexs() {
		Admin admin = new Admin();
		admin.setAdminname("admin");
		admin.setUserpass("test");
		admin.setState(1);
		int i = adminServiceimpl.insert(admin);
		System.out.println(i);
		infos=new SInfo();
		infos.setName("cc"+i);
		return"index";
		
	}

}
