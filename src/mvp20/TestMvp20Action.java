package mvp20;

import mvp20.action.ActionView;

public class TestMvp20Action {
	
	public static void main(String [] args) {
		
		
		
		/************************************************
		 * 
		 *  -��MVP�ܹ����÷��ͣ�����ͨ�����
		 *  -��MVP�ṹ�������߼�����
		 *  
		 *  -MVPͨ������д���е�࣬ÿ����һ��ģ�飬Ҫ������ģʽ���Ӷ����
		 *  -2.0ÿ���ֻ��һ���ļ����ɣ�����ҵ��������࣬Model�㽫�ǳ����أ���Ϊ���еĴ����߼�����������Model�㣬Presenter��ֻ������ת�����ҿ�������һ���ļ�����������ɳ�ͻ
		 *  -2.0Ҳ���Ը��ݲ�ͬ��ҵ��㣬���岻ͬ�Ĳ�ʵ�֣������¼ģ�顢Mainģ���
		 *  
		 *  -��mvp�ĺô��ǣ�ͬһģ�飬�����µĹ��ܣ����øĶ�̫��ط���ֻ���޸�Model���View���ʵ���߼�
		 *  
		 * ************************************************/
		

		
		/************************************************
		 * 
		 *  1.ģ��һ��View���ڰ�׿ʵ����Ŀ�У�ֱ�Ӿ���Activity
		 * 
		 * ************************************************/
		ActionView loginView = new ActionView();
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
		

		loginView.doLogout();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		loginView.doGetList();
		
		
	}

}
