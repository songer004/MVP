package mvp;

import mvp.test.LoginView;

public class App {
	
	public static void main(String [] args) {

		
		/************************************************
		 * 
		 *  1.ģ��һ��View
		 * 
		 * ************************************************/
		LoginView loginView = new LoginView();
		/************************************************
		 * 
		 *  2.ģ��View����������
		 * 
		 * ************************************************/
		loginView.onCreate();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		/************************************************
		 * 
		 *  3.ģ��Viewһ�ε���¼�
		 * 
		 * ************************************************/
		loginView.doLogin();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
