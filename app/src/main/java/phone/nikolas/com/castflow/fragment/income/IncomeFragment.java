package phone.nikolas.com.castflow.fragment.income;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import phone.nikolas.com.castflow.R;
import phone.nikolas.com.castflow.base.BaseFragment;
import phone.nikolas.com.castflow.databinding.FragmentIncomeBinding;

/**
 * Created by Pleret on 7/15/2017.
 */

public class IncomeFragment extends BaseFragment<FragmentIncomeBinding, IncomeViewModel, IncomePresenter> implements IncomeView {

    @Override
    protected View initBinding(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_income, container, false);
        return binding.getRoot();
    }

    @Override
    protected void initViewModel() {
        viewModel = new IncomeViewModel();
        binding.setViewModel(viewModel);
    }

    @Override
    protected void initPresenter() {
        presenter = new IncomePresenter();
        presenter.setView(this);
        presenter.setViewModel(viewModel);
    }

    @Override
    protected void onViewReady(Bundle savedInstanceState) {

    }
}
