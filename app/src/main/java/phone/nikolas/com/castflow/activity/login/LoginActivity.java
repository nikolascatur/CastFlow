package phone.nikolas.com.castflow.activity.login;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import phone.nikolas.com.castflow.BaseApp;
import phone.nikolas.com.castflow.R;
import phone.nikolas.com.castflow.base.BaseActivity;
import phone.nikolas.com.castflow.databinding.ActivityLoginBinding;

/**
 * Created by Pleret on 4/24/2017.
 */

public class LoginActivity extends BaseActivity<ActivityLoginBinding,LoginViewModel,LoginPresenter> implements LoginView{
    @Override
    protected void initInjection() {
        ((BaseApp)getApplication()).getAppComponent().inject(this);
    }

    @Override
    protected void initBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
    }

    @Override
    protected void initViewModel() {
        viewModel = new LoginViewModel();
        binding.setViewModel(viewModel);
    }

    @Override
    protected void initPresenter() {
        presenter = new LoginPresenter();
        presenter.setView(this);
        presenter.setViewModel(viewModel);
    }

    @Override
    protected void onViewReady(Bundle savedinstance) {
        LoginHandler handler = new LoginHandler();
        handler.setPresenter(presenter);
        binding.setHandler(handler);
    }
}
