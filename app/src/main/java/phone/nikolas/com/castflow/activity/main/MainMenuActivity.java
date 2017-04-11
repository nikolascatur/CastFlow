package phone.nikolas.com.castflow.activity.main;

import android.app.Application;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;

import phone.nikolas.com.castflow.BaseApp;
import phone.nikolas.com.castflow.R;
import phone.nikolas.com.castflow.base.BaseActivity;
import phone.nikolas.com.castflow.databinding.ActivityMainMenuBinding;
import phone.nikolas.com.castflow.depen.component.AppComponent;

/**
 * Created by Pleret on 4/11/2017.
 */

public class MainMenuActivity extends BaseActivity<ActivityMainMenuBinding,MainMenuViewModel,MainMenuPresenter> implements MainMenuView {
    @Override
    protected void initInjection() {
        ((BaseApp)getApplication()).getAppComponent().inject(this);
    }

    @Override
    protected void initBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_menu);
    }

    @Override
    protected void initViewModel() {
        viewModel = new MainMenuViewModel();
        binding.setViewModel(viewModel);
    }

    @Override
    protected void initPresenter() {
        presenter = new MainMenuPresenter();
        presenter.setView(this);
        presenter.setViewModel(viewModel);
    }

    @Override
    protected void onViewReady(Bundle savedinstance) {
        MainMenuHandler handler = new MainMenuHandler();
        handler.setPresenter(presenter);
        binding.setHandler(handler);
    }
}
