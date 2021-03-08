package mvp20;

import mvp20.action.ActionView;

public class TestMvp20Action {
	
	public static void main(String [] args) {
		
		
		
		/************************************************
		 * 
		 *  -此MVP架构采用泛型，泛型通用灵活
		 *  -此MVP结构清晰，逻辑清晰
		 *  
		 *  -MVP通病，类写的有点多，每增加一个模块，要按照这模式增加多个类
		 *  -2.0每层可只用一个文件即可，但是业务如果过多，Model层将非常繁重，因为所有的处理逻辑都集中在了Model层，Presenter层只负责中转，而且开发都在一个文件，很容易造成冲突
		 *  -2.0也可以根据不同的业务层，定义不同的层实现，例如登录模块、Main模块等
		 *  
		 *  -此mvp的好处是，同一模块，新增新的功能，不用改动太多地方。只需修改Model层和View层的实现逻辑
		 *  
		 * ************************************************/
		

		
		/************************************************
		 * 
		 *  1.模拟一个View，在安卓实际项目中，直接就是Activity
		 * 
		 * ************************************************/
		ActionView loginView = new ActionView();
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
		

		loginView.doLogout();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		loginView.doGetList();
		
		
	}

}
