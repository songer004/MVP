package mvp20.core.model;

import mvp20.core.presenter.BasePresenter;

public abstract class BaseModel <P extends BasePresenter, CONTRACT>{
	
	/************************************************
	 * 
	 *  -在Model层持有Presenter的引用
	 * 
	 * ************************************************/
	protected P p;
	
	public BaseModel(P p) {
		this.p = p;
	}
	
	/************************************************
	 * 
	 * Model 层应提供给Presenter的接口，主要是 Presenter层调用，获取数据用
	 * 
	 * ************************************************/
	public abstract CONTRACT getContract();

}
