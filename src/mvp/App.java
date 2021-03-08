package mvp;

import mvp.test.LoginView;

public class App {
	
	public static void main(String [] args) {

		
		/************************************************
		 * 
		 *  1.模拟一个View
		 * 
		 * ************************************************/
		LoginView loginView = new LoginView();
		/************************************************
		 * 
		 *  2.模拟View的生命周期
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
		 *  3.模拟View一次点击事件
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
