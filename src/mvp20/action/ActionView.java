package mvp20.action;

import java.util.HashMap;

import mvp.base.BaseEntity;
import mvp.base.MVPAction;
import mvp20.action.ActionContrat.View;
import mvp20.core.view.BaseView;

public class ActionView extends BaseView<ActionPresenter, ActionContrat.View>{
	
	
	/************************************************
	 * 
	 *  -ģ��Viewһ�ε���¼�
	 *  -p �ڸ������������onCreate()�Ѿ���ʼ��
	 * 
	 * ************************************************/
	public void doLogin() {
		HashMap<String, String> para = new HashMap<>();
		para.put("name", "song");
		para.put("password", "123");
		p.getContract().requestAction(MVPAction.ACTION_LOGIN, para);
	}
	

	public void doLogout() {
		HashMap<String, String> para = new HashMap<>();
		p.getContract().requestAction(MVPAction.ACTION_LOGOUT, para);
	}
	
	public void doGetList() {
		HashMap<String, String> para = new HashMap<>();
		para.put("sno", "-1");
		para.put("url", "https://***********");
		p.getContract().requestAction(MVPAction.ACTION_GET_LIST, para);
	}

	@Override
	public ActionPresenter getPresenter() {
		/************************************************
		 * 
		 *  -�ڸ������������onCreate()����
		 * 
		 * ************************************************/
		return new ActionPresenter();
	}

	@Override
	public View getContract() {
		/************************************************
		 * 
		 *  -��Presenter��Ҫ��View������ʱ����ã�ȱ�㣬ÿ�ζ�Ҫnew��
		 * 
		 * ************************************************/
		return new ActionContrat.View<BaseEntity>() {

			@Override
			public void handleResult(String actionName, BaseEntity t) {
				switch (actionName) {
				case MVPAction.ACTION_LOGIN:
					if(t!=null) {
						System.out.println(t.toString());
					}else {
						System.out.println("��¼ʧ��!");
					}
					break;
				case MVPAction.ACTION_LOGOUT:
					System.out.println("�˳��ɹ�!");
					break;
				case MVPAction.ACTION_GET_LIST:
					System.out.println("��ȡ���ݳɹ�!");
					break;

				default:
					break;
				}
				
			}
			
		};
	}


}
