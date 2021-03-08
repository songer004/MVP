package mvp.test;

import mvp.core.model.BaseModel;
import mvp.test.LoginContrat.Model;

public class LoginModel extends BaseModel<LoginPresenter, LoginContrat.Model>{

	public LoginModel(LoginPresenter p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public LoginContrat.Model getContract() {
		// TODO Auto-generated method stub
		return new LoginContrat.Model() {
			
			@Override
			public void excuteLogin(String name, String password) throws Exception {
				// TODO Auto-generated method stub
				System.out.println("LoginModel n : " + name + "  p : " + password);
				if("song".equals(name) && "123".equals(password)) {
					p.getContract().responseResult(new UserInfo("大数据", "安卓工程师"));
				}else {
					p.getContract().responseResult(null);
				}
			}
		};
	}

}
