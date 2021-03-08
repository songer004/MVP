package mvp.test.login;

import mvp.core.entity.BaseEntity;

public class UserInfo extends BaseEntity{
	
	public String company;
	public String name;
	
	public UserInfo(String company, String name) {
		this.company = company;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "company = " + company + ",   name = " + name;
	}

}
