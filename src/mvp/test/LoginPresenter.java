package mvp.test;

import mvp.core.Presenter.BasePresenter;

public class LoginPresenter extends BasePresenter<LoginView, LoginModel, LoginContrat.Presenter>{

	@Override
	public LoginContrat.Presenter getContract() {
		// TODO Auto-generated method stub
		return new LoginContrat.Presenter<UserInfo>() {

			@Override
			public void requestLogin(String name, String password) {
				// TODO Auto-generated method stub
				try {
					System.out.println("LoginPresenter n : " + name + "  p : " + password);
					getModel().getContract().excuteLogin(name, password);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}

			@Override
			public void responseResult(UserInfo t) {
				// TODO Auto-generated method stub
				getView().getContract().handleResult(t);
			}
			
		};
	}

	@Override
	public LoginModel getModel() {
		// TODO Auto-generated method stub
		return new LoginModel(this);
	}

	@Override
	public LoginView getView() {
		// TODO Auto-generated method stub
		return new LoginView();
	}
	

}
