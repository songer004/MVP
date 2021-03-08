package mvp.test.login;

import mvp.core.entity.BaseEntity;

public interface LoginContrat {
	
	/************************************************
	 * 
	 * Model ��Ӧ�ṩ��Presenter�Ľӿڣ���Ҫ�� Presenter����ã���ȡ������
	 * 
	 * ************************************************/
	
	public interface Model{
		void excuteLogin(String name, String password) throws Exception;
	}
	
	
	
	

	/************************************************
	 * 
	 * View ��Ӧ�ṩ��Presenter�Ľӿڣ���Ҫ�� Presenter����ã���ȡ���ݺ����
	 * 
	 * ************************************************/
	
	public interface View<T extends BaseEntity>{
		void handleResult(T t);
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
		void requestLogin(String name, String password);
		
		
		
		/************************************************
		 * 
		 * Presenter ��Ӧ�ṩModel�Ľӿ�
		 * 
		 * ************************************************/
		void responseResult(T t);
		
	}

}
