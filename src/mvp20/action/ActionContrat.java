package mvp20.action;

import java.util.Map;

import mvp.base.BaseEntity;

public interface ActionContrat {
	
	/************************************************
	 * 
	 * Model 层应提供给Presenter的接口，主要是 Presenter层调用，获取数据用
	 * 
	 * ************************************************/
	
	public interface Model{
		void excuteAction(String actionName, Map para) throws Exception;
	}
	
	
	
	

	/************************************************
	 * 
	 * View 层应提供给Presenter的接口，主要是 Presenter层调用，获取数据后调用
	 * 
	 * ************************************************/
	
	public interface View<T extends BaseEntity>{
		void handleResult(String actionName, T t);
	}
	
	
	
	/************************************************
	 * 
	 * Presenter 层应提供的接口，用于连接View层和Model层，所以，提供的接口应考虑这两层的需求
	 * 
	 * ************************************************/
	public interface Presenter<T extends BaseEntity>{
		
		/************************************************
		 * 
		 * Presenter 层应提供View的接口
		 * 
		 * ************************************************/
		void requestAction(String actionName, Map para);
		
		
		
		/************************************************
		 * 
		 * Presenter 层应提供Model的接口
		 * 
		 * ************************************************/
		void responseActionResult(String actionName, T t);
		
	}

}
