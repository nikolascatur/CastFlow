package phone.nikolas.com.castflow.activity.addexpense;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import phone.nikolas.com.castflow.BaseApp;
import phone.nikolas.com.castflow.R;
import phone.nikolas.com.castflow.base.BaseActivity;
import phone.nikolas.com.castflow.databinding.ActivityAddExpenseBinding;

/**
 * Created by Pleret on 7/19/2017.
 */

public class AddExpenseActivity extends BaseActivity<ActivityAddExpenseBinding, AddExpenseViewModel, AddExpensePresenter>
        implements AddExpenseView {
    @Override
    protected void initInjection() {
        ((BaseApp) getApplication()).getAppComponent().inject(this);
    }

    @Override
    protected void initBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_expense);
    }

    @Override
    protected void initViewModel() {
        viewModel = new AddExpenseViewModel();
        binding.setViewModel(viewModel);
    }

    @Override
    protected void initPresenter() {
        presenter = new AddExpensePresenter();
        presenter.setViewModel(viewModel);
        presenter.setView(this);
    }

    @Override
    protected void onViewReady(Bundle savedinstance) {
        AddExpenseHandler handler = new AddExpenseHandler();
        handler.setPresenter(presenter);
        binding.setHandler(handler);
    }
}
