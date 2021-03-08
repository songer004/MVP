package mvp.core.model;

import mvp.core.Presenter.BasePresenter;

public abstract class BaseModel <P extends BasePresenter, CONTRACT>{
	
	/************************************************
	 * 
	 *  -��Model�����Presenter������
	 * 
	 * ************************************************/
	protected P p;
	
	public BaseModel(P p) {
		this.p = p;
	}
	
	/************************************************
	 * 
	 * Model ��Ӧ�ṩ��Presenter�Ľӿڣ���Ҫ�� Presenter����ã���ȡ������
	 * 
	 * ************************************************/
	public abstract CONTRACT getContract();

}
