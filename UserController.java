package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import service.UserEjb;
import model.UserInfo;


@ManagedBean(name="usercontroller")
@SessionScoped
public class UserController {
	
	@EJB
	UserEjb userservice;
	
	@ManagedProperty(value="#{userinfo}")
	private UserInfo userinfo;
	
	public void addNewUser()
	{
		//System.out.println("is in use");
		userservice.addNew(userinfo.getEntity());
	}

	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}
	
	
	

}
