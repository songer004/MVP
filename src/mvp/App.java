package mvp;

import mvp.test.LoginView;

public class App {
	
	public static void main(String [] args) {

		LoginView loginView = new LoginView();
		loginView.onCreate();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		loginView.doLogin();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
