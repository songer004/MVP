package mvp20.action;

import java.util.Map;

import mvp.base.BaseEntity;
import mvp20.core.presenter.BasePresenter;

public class ActionPresenter extends BasePresenter<ActionView, ActionModel, ActionContrat.Presenter>{

	@Override
	public ActionContrat.Presenter getContract() {
		/************************************************
		 * 
		 *  -��Presenter��Ҫ��View������ʱ����ã�ȱ�㣬ÿ�ζ�Ҫnew��
		 * 
		 * ************************************************/
		return new ActionContrat.Presenter<BaseEntity>() {

			@Override
			public void requestAction(String actionName, Map para) {
				try {
					System.out.println("LoginPresenter 2.0 n : " + actionName + "  para : " + para.toString());
					getModel().getContract().excuteAction(actionName, para);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}

			@Override
			public void responseActionResult(String actionName, BaseEntity t) {
				getView().getContract().handleResult(actionName, t);
			}
			
		};
	}

	@Override
	public ActionModel getModel() {
		/************************************************
		 * 
		 *  -��Presenter����Model��ȱ�㣬ÿ�ζ�Ҫnew��
		 * 
		 * ************************************************/
		return new ActionModel(this);
	}


}
