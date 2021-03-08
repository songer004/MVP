package mvp20.action;

import java.util.Map;

import mvp.base.MVPAction;
import mvp.base.UserInfo;
import mvp20.action.ActionContrat.Model;
import mvp20.core.model.BaseModel;

public class ActionModel extends BaseModel<ActionPresenter, ActionContrat.Model>{

	public ActionModel(ActionPresenter p) {

		/************************************************
		 * 
		 *  -初始化的时候，持有Presenter的引用
		 * 
		 * ************************************************/
		super(p);
	}

	@Override
	public ActionContrat.Model getContract() {
		/************************************************
		 * 
		 *  -在Presenter需要和Model交互的时候调用（缺点，每次都要new）
		 * 
		 * ************************************************/
		return new ActionContrat.Model() {
			
			@Override
			public void excuteAction(String actionName, Map para) throws Exception {
				// TODO Auto-generated method stub
				System.out.println("LoginModel 2.0 n : " + actionName + "  para : " + para.toString());
				switch (actionName) {
				case MVPAction.ACTION_LOGIN:
					if("song".equals(para.get("name")) && "123".equals(para.get("password"))) {
						p.getContract().responseActionResult(actionName, new UserInfo("大数据", "安卓工程师"));
					}else {
						p.getContract().responseActionResult(actionName, null);
					}
					break;
				case MVPAction.ACTION_LOGOUT:
					p.getContract().responseActionResult(actionName, null);
					break;
				case MVPAction.ACTION_GET_LIST:
					p.getContract().responseActionResult(actionName, null);
					break;

				default:
					break;
				}
			}
		};
	}

}
