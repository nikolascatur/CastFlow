package phone.nikolas.com.castflow.activity.signup;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import phone.nikolas.com.castflow.BaseApp;
import phone.nikolas.com.castflow.R;
import phone.nikolas.com.castflow.base.BaseActivity;
import phone.nikolas.com.castflow.databinding.ActivitySignupBinding;

/**
 * Created by Pleret on 4/25/2017.
 */

public class SignupActivity extends BaseActivity<ActivitySignupBinding,SignupViewModel,SignupPresenter> implements SignupView{
    @Override
    protected void initInjection() {
        ((BaseApp)getApplication()).getAppComponent().inject(this);
    }

    @Override
    protected void initBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_signup);
    }

    @Override
    protected void initViewModel() {
        viewModel = new SignupViewModel();
        binding.setViewModel(viewModel);
    }

    @Override
    protected void initPresenter() {
        presenter = new SignupPresenter();
        presenter.setView(this);
        presenter.setViewModel(viewModel);
    }

    @Override
    protected void onViewReady(Bundle savedinstance) {
        SignupHandler handler = new SignupHandler();
        handler.setPresenter(presenter);
        binding.setHandler(handler);
    }
}
