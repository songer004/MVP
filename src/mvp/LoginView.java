package mvp;

import mvp.LoginContrat.View;
import mvp.base.UserInfo;
import mvp.core.view.BaseView;

public class LoginView extends BaseView<LoginPresenter, LoginContrat.View>{
	
	
	/************************************************
	 * 
	 *  -模拟View一次点击事件
	 *  -p 在父类的生命周期onCreate()已经初始化
	 * 
	 * ************************************************/
	public void doLogin() {
		p.getContract().requestLogin("song", "123");
	}
	

	@Override
	public LoginPresenter getPresenter() {
		/************************************************
		 * 
		 *  -在父类的生命周期onCreate()调用
		 * 
		 * ************************************************/
		return new LoginPresenter();
	}

	@Override
	public View getContract() {
		/************************************************
		 * 
		 *  -在Presenter需要和View交互的时候调用（缺点，每次都要new）
		 * 
		 * ************************************************/
		return new LoginContrat.View<UserInfo>() {

			@Override
			public void handleResult(UserInfo t) {
				// TODO Auto-generated method stub
				if(t!=null) {
					System.out.println(t.toString());
				}else {
					System.out.println("登录失败!");
				}
			}
			
		};
	}


}
