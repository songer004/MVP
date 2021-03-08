package mvp.test.login;

import mvp.core.Presenter.BasePresenter;

public class LoginPresenter extends BasePresenter<LoginView, LoginModel, LoginContrat.Presenter>{

	@Override
	public LoginContrat.Presenter getContract() {
		/************************************************
		 * 
		 *  -在Presenter需要和View交互的时候调用（缺点，每次都要new）
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
		 *  -在Presenter持有Model（缺点，每次都要new）
		 * 
		 * ************************************************/
		return new LoginModel(this);
	}


}
