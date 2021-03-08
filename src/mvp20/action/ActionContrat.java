package mvp20.action;

import java.util.Map;

import mvp.base.BaseEntity;

public interface ActionContrat {
	
	/************************************************
	 * 
	 * Model ��Ӧ�ṩ��Presenter�Ľӿڣ���Ҫ�� Presenter����ã���ȡ������
	 * 
	 * ************************************************/
	
	public interface Model{
		void excuteAction(String actionName, Map para) throws Exception;
	}
	
	
	
	

	/************************************************
	 * 
	 * View ��Ӧ�ṩ��Presenter�Ľӿڣ���Ҫ�� Presenter����ã���ȡ���ݺ����
	 * 
	 * ************************************************/
	
	public interface View<T extends BaseEntity>{
		void handleResult(String actionName, T t);
	}
	
	
	
	/************************************************
	 * 
	 * Presenter ��Ӧ�ṩ�Ľӿڣ���������View���Model�㣬���ԣ��ṩ�Ľӿ�Ӧ���������������
	 * 
	 * ************************************************/
	public interface Presenter<T extends BaseEntity>{
		
		/************************************************
		 * 
		 * Presenter ��Ӧ�ṩView�Ľӿ�
		 * 
		 * ************************************************/
		void requestAction(String actionName, Map para);
		
		
		
		/************************************************
		 * 
		 * Presenter ��Ӧ�ṩModel�Ľӿ�
		 * 
		 * ************************************************/
		void responseActionResult(String actionName, T t);
		
	}

}
