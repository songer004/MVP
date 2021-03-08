package mvp20.core.view;

import mvp.base.LifeCycleView;
import mvp20.core.presenter.BasePresenter;

/************************************************
 * 
 * LifeCycleView �����Ҫ��ģ�ⰲ׿Activity���������ڣ�ʵ�ʿ����У����滻��Activity
 * 
 * ************************************************/

public abstract class BaseView <P extends BasePresenter, CONTRACT> extends LifeCycleView{
	
	/************************************************
	 * 
	 *  -��View�����Presenter������
	 * 
	 * ************************************************/
	protected P p;
	
	/************************************************
	 * 
	 * View ��Ӧ�ṩ��Presenter�Ľӿڣ���Ҫ�� Presenter����ã���ȡ���ݺ����
	 * 
	 * ************************************************/
	public abstract CONTRACT getContract();
	
	public abstract P getPresenter();
	
	@Override
	public void onCreate() {
		super.onCreate();
		p = getPresenter();
		p.bindView(this);
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		p.unBindView();
	}


}

