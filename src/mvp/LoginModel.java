package mvp;

import mvp.LoginContrat.Model;
import mvp.base.UserInfo;
import mvp.core.model.BaseModel;

public class LoginModel extends BaseModel<LoginPresenter, LoginContrat.Model>{

	public LoginModel(LoginPresenter p) {

		/************************************************
		 * 
		 *  -初始化的时候，持有Presenter的引用
		 * 
		 * ************************************************/
		super(p);
	}

	@Override
	public LoginContrat.Model getContract() {
		/************************************************
		 * 
		 *  -在Presenter需要和Model交互的时候调用（缺点，每次都要new）
		 * 
		 * ************************************************/
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
