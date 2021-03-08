package mvp.test;

import mvp.core.view.BaseView;
import mvp.test.LoginContrat.View;

public class LoginView extends BaseView<LoginPresenter, LoginContrat.View>{
	
	
	public void doLogin() {
		p.getContract().requestLogin("song", "123");
	}
	

	@Override
	public LoginPresenter getPresenter() {
		// TODO Auto-generated method stub
		return new LoginPresenter();
	}

	@Override
	public View getContract() {
		// TODO Auto-generated method stub
		return new LoginContrat.View<UserInfo>() {

			@Override
			public void handleResult(UserInfo t) {
				// TODO Auto-generated method stub
				if(t!=null) {
					System.out.println(t.toString());
				}else {
					System.out.println("µÇÂ¼Ê§°Ü!");
				}
			}
			
		};
	}


}
