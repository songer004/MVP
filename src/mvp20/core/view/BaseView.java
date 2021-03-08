package mvp20.core.view;

import mvp.base.LifeCycleView;
import mvp20.core.presenter.BasePresenter;

/************************************************
 * 
 * LifeCycleView 这个主要是模拟安卓Activity的生命周期，实际开发中，可替换成Activity
 * 
 * ************************************************/

public abstract class BaseView <P extends BasePresenter, CONTRACT> extends LifeCycleView{
	
	/************************************************
	 * 
	 *  -在View层持有Presenter的引用
	 * 
	 * ************************************************/
	protected P p;
	
	/************************************************
	 * 
	 * View 层应提供给Presenter的接口，主要是 Presenter层调用，获取数据后调用
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

