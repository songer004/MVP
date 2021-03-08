package mvp.test.login;

import mvp.core.Presenter.BasePresenter;

public class LoginPresenter extends BasePresenter<LoginView, LoginModel, LoginContrat.Presenter>{

	@Override
	public LoginContrat.Presenter getContract() {
		/************************************************
		 * 
		 *  -��Presenter��Ҫ��View������ʱ����ã�ȱ�㣬ÿ�ζ�Ҫnew��
		 * 
		 * ************************************************/
		return new LoginContrat.Presenter<UserInfo>() {

			@Override
			public void requestLogin(String name, String password) {
				try {
					System.out.println("LoginPresenter n : " + name + "  p : " + password);
					getModel().getContract().excuteLogin(name, password);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}

			@Override
			public void responseResult(UserInfo t) {
				getView().getContract().handleResult(t);
			}
			
		};
	}

	@Override
	public LoginModel getModel() {
		/************************************************
		 * 
		 *  -��Presenter����Model��ȱ�㣬ÿ�ζ�Ҫnew��
		 * 
		 * ************************************************/
		return new LoginModel(this);
	}


}
