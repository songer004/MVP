package mvp;

public class TestMvp10Login {
	
	public static void main(String [] args) {
		
		
		
		/************************************************
		 * 
		 *  -此MVP架构采用泛型，泛型通用灵活
		 *  -此MVP结构清晰，逻辑清晰
		 *  
		 *  -MVP通病，类写的有点多，每增加一个模块，要按照这模式增加多个类
		 *  -Presenter层只负责中转，当然，某些业务也可以放在Presenter层
		 *  -各个业务模块，自行负责自己的模块，例如Login模块。就负责自己模块内的业务逻辑。Main模块就负责Main模块的业务逻辑
		 *  
		 *  -此MVP如要在模块内新增一个新方法，需要修改多个文件，例如：增加logout功能，需要Presenter层、Model层、View层、约束层都要新增相应的代码
		 *  
		 * ************************************************/
		

		
		/************************************************
		 * 
		 *  1.模拟一个View，在安卓实际项目中，直接就是Activity
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
