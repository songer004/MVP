package mvp;

import mvp.LoginContrat.Model;
import mvp.base.UserInfo;
import mvp.core.model.BaseModel;

public class LoginModel extends BaseModel<LoginPresenter, LoginContrat.Model>{

	public LoginModel(LoginPresenter p) {

		/************************************************
		 * 
		 *  -��ʼ����ʱ�򣬳���Presenter������
		 * 
		 * ************************************************/
		super(p);
	}

	@Override
	public LoginContrat.Model getContract() {
		/************************************************
		 * 
		 *  -��Presenter��Ҫ��Model������ʱ����ã�ȱ�㣬ÿ�ζ�Ҫnew��
		 * 
		 * ************************************************/
		return new LoginContrat.Model() {
			
			@Override
			public void excuteLogin(String name, String password) throws Exception {
				// TODO Auto-generated method stub
				System.out.println("LoginModel n : " + name + "  p : " + password);
				if("song".equals(name) && "123".equals(password)) {
					p.getContract().responseResult(new UserInfo("������", "��׿����ʦ"));
				}else {
					p.getContract().responseResult(null);
				}
			}
		};
	}

}
