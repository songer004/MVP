package mvp20.action;

import java.util.HashMap;

import mvp.base.BaseEntity;
import mvp.base.MVPAction;
import mvp20.action.ActionContrat.View;
import mvp20.core.view.BaseView;

public class ActionView extends BaseView<ActionPresenter, ActionContrat.View>{
	
	
	/************************************************
	 * 
	 *  -模拟View一次点击事件
	 *  -p 在父类的生命周期onCreate()已经初始化
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
		 *  -在父类的生命周期onCreate()调用
		 * 
		 * ************************************************/
		return new ActionPresenter();
	}

	@Override
	public View getContract() {
		/************************************************
		 * 
		 *  -在Presenter需要和View交互的时候调用（缺点，每次都要new）
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
						System.out.println("登录失败!");
					}
					break;
				case MVPAction.ACTION_LOGOUT:
					System.out.println("退出成功!");
					break;
				case MVPAction.ACTION_GET_LIST:
					System.out.println("获取数据成功!");
					break;

				default:
					break;
				}
				
			}
			
		};
	}


}
