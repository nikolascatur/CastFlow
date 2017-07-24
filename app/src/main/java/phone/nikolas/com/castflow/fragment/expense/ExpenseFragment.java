package phone.nikolas.com.castflow.fragment.expense;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

import phone.nikolas.com.castflow.R;
import phone.nikolas.com.castflow.base.BaseFragment;
import phone.nikolas.com.castflow.databinding.FragmentExpenseBinding;

/**
 * Created by Pleret on 7/15/2017.
 */

public class ExpenseFragment extends BaseFragment<FragmentExpenseBinding, ExpenseViewModel, ExpensePresenter>
        implements ExpenseView {

    @Override
    protected View initBinding(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_expense,container,false);

        return binding.getRoot();
    }

    @Override
    protected void initViewModel() {
        viewModel = new ExpenseViewModel();
        binding.setViewModel(viewModel);
    }

    @Override
    protected void initPresenter() {
        presenter = new ExpensePresenter();
        presenter.setView(this);
        presenter.setViewModel(viewModel);
    }

    @Override
    protected void onViewReady(Bundle savedInstanceState) {

    }
}
