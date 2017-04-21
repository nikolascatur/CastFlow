package phone.nikolas.com.castflow.activity.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.ActionBar;

import phone.nikolas.com.castflow.BaseApp;
import phone.nikolas.com.castflow.R;
import phone.nikolas.com.castflow.base.BaseActivity;
import phone.nikolas.com.castflow.databinding.ActivityMainMenuBinding;
import phone.nikolas.com.castflow.depen.component.AppComponent;
import phone.nikolas.com.castflow.listener.MainNavigationListener;

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
        setSupportActionBar(binding.toolbar);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        NavigationView.OnNavigationItemSelectedListener listener = new MainNavigationListener();
        binding.navView.setNavigationItemSelectedListener(listener);

        if(savedinstance == null) {
            listener.onNavigationItemSelected(binding.navView.getMenu().getItem(0));
        }

    }
}
