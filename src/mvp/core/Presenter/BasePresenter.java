package mvp.core.Presenter;

import java.lang.ref.WeakReference;

import mvp.core.model.BaseModel;
import mvp.core.view.BaseView;

public abstract class BasePresenter<V extends BaseView, M extends BaseModel, CONTRACT>{
	
	/************************************************
	 * 
	 *  -��Presenter�����View��Model������
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
	 * Presenter ��Ӧ�ṩ�Ľӿڣ���������View���Model�㣬���ԣ��ṩ�Ľӿ�Ӧ���������������
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
