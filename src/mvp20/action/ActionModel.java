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
		 *  -��ʼ����ʱ�򣬳���Presenter������
		 * 
		 * ************************************************/
		super(p);
	}

	@Override
	public ActionContrat.Model getContract() {
		/************************************************
		 * 
		 *  -��Presenter��Ҫ��Model������ʱ����ã�ȱ�㣬ÿ�ζ�Ҫnew��
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
						p.getContract().responseActionResult(actionName, new UserInfo("������", "��׿����ʦ"));
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
