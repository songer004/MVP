package mvp.core.model;

import mvp.core.Presenter.BasePresenter;

public abstract class BaseModel <P extends BasePresenter, CONTRACT>{
	
	protected P p;
	
	public BaseModel(P p) {
		this.p = p;
	}
	
	public abstract CONTRACT getContract();

}
