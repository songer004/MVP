package mvp.core.view;

import mvp.core.Presenter.BasePresenter;

public abstract class BaseView <P extends BasePresenter, CONTRACT> extends LifeCycleView{
	
	protected P p;
	
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

