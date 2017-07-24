package phone.nikolas.com.castflow.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.support.v4.app.Fragment;

/**
 * Created by Pleret on 4/12/2017.
 */

public abstract class BaseFragment<B,V,P> extends Fragment {
    protected B binding;
    protected V viewModel;
    protected P presenter;
    protected View mViewRoot;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mViewRoot = initBinding(inflater, container, savedInstanceState);
        initPresenter();
        initViewModel();
        onViewReady(savedInstanceState);
        return mViewRoot;
    }

    protected abstract View initBinding(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);
    protected abstract void initViewModel();
    protected abstract void initPresenter();
    protected abstract void onViewReady(Bundle savedInstanceState);
}
