package phone.nikolas.com.castflow.activity.forgotpassword;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import phone.nikolas.com.castflow.BaseApp;
import phone.nikolas.com.castflow.R;
import phone.nikolas.com.castflow.base.BaseActivity;
import phone.nikolas.com.castflow.databinding.ActivityForgotPasswordBinding;

/**
 * Created by Pleret on 4/25/2017.
 */

public class ForgotPasswordActivity extends BaseActivity<ActivityForgotPasswordBinding, ForgotPasswordViewModel, ForgotPasswordPresenter>
        implements ForgotPasswordView {
    @Override
    protected void initInjection() {
        ((BaseApp)getApplication()).getAppComponent().inject(this);
    }

    @Override
    protected void initBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_forgot_password);
    }

    @Override
    protected void initViewModel() {
        viewModel = new ForgotPasswordViewModel();
        binding.setViewModel(viewModel);
    }

    @Override
    protected void initPresenter() {
        presenter = new ForgotPasswordPresenter();
        presenter.setViewModel(viewModel);
        presenter.setView(this);
    }

    @Override
    protected void onViewReady(Bundle savedinstance) {
        ForgotPasswordHandler handler = new ForgotPasswordHandler();
        handler.setPresenter(presenter);
        binding.setHandler(handler);
    }
}
