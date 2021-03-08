package mvp.core.Presenter;

import java.lang.ref.WeakReference;

import mvp.core.model.BaseModel;
import mvp.core.view.BaseView;

public abstract class BasePresenter<V extends BaseView, M extends BaseModel, CONTRACT>{
	
	/************************************************
	 * 
	 *  -在Presenter层持有View和Model的引用
	 * 
	 * ************************************************/
	
	public M m;
	private WeakReference<V> vWeakReference;
	
	
	public void bindView(V v) {
		vWeakReference = new WeakReference<>(v);
	}
	
	public void unBindView() {
		if(vWeakReference!=null) {
			vWeakReference.clear();
			vWeakReference = null;
			System.gc();
		}
	}

	/************************************************
	 * 
	 * Presenter 层应提供的接口，用于连接View层和Model层，所以，提供的接口应考虑这两层的需求
	 * 
	 * ************************************************/
	public abstract CONTRACT getContract();
	
	
	public abstract M getModel();
	

	public V getView() {
		if(vWeakReference!=null) {
			return vWeakReference.get();
		}
		return null;
	};
	
	
}
