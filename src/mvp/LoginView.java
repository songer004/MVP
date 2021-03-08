package mvp;

import mvp.LoginContrat.View;
import mvp.base.UserInfo;
import mvp.core.view.BaseView;

public class LoginView extends BaseView<LoginPresenter, LoginContrat.View>{
	
	
	/************************************************
	 * 
	 *  -ģ��Viewһ�ε���¼�
	 *  -p �ڸ������������onCreate()�Ѿ���ʼ��
	 * 
	 * ************************************************/
	public void doLogin() {
		p.getContract().requestLogin("song", "123");
	}
	

	@Override
	public LoginPresenter getPresenter() {
		/************************************************
		 * 
		 *  -�ڸ������������onCreate()����
		 * 
		 * ************************************************/
		return new LoginPresenter();
	}

	@Override
	public View getContract() {
		/************************************************
		 * 
		 *  -��Presenter��Ҫ��View������ʱ����ã�ȱ�㣬ÿ�ζ�Ҫnew��
		 * 
		 * ************************************************/
		return new LoginContrat.View<UserInfo>() {

			@Override
			public void handleResult(UserInfo t) {
				// TODO Auto-generated method stub
				if(t!=null) {
					System.out.println(t.toString());
				}else {
					System.out.println("��¼ʧ��!");
				}
			}
			
		};
	}


}
