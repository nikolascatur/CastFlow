package phone.nikolas.com.castflow.activity.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;


import java.util.ArrayList;
import java.util.List;

import phone.nikolas.com.castflow.BaseApp;
import phone.nikolas.com.castflow.R;
import phone.nikolas.com.castflow.adapter.ViewPagerAdapter;
import phone.nikolas.com.castflow.base.BaseActivity;
import phone.nikolas.com.castflow.databinding.ActivityMainMenuBinding;
import phone.nikolas.com.castflow.fragment.expense.ExpenseFragment;
import phone.nikolas.com.castflow.fragment.income.IncomeFragment;
import phone.nikolas.com.castflow.fragment.main.MainFragment;
import phone.nikolas.com.castflow.fragment.report.ReportFragment;

/**
 * Created by Pleret on 4/11/2017.
 */

public class MainMenuActivity extends BaseActivity<ActivityMainMenuBinding, MainMenuViewModel, MainMenuPresenter>
        implements MainMenuView {

    List<Fragment> mFragments;
    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void initInjection() {
        ((BaseApp) getApplication()).getAppComponent().inject(this);
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
        binding.setManager(getSupportFragmentManager());

        initTabLayout();
        /*setSupportActionBar(binding.toolbar);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        NavigationView.OnNavigationItemSelectedListener listener = new MainNavigationListener();
        binding.navView.setNavigationItemSelectedListener(listener);

        if(savedinstance == null) {
            listener.onNavigationItemSelected(binding.navView.getMenu().getItem(0));
        }*/

    }

    @Override
    public void initTabLayout() {
        mFragments = new ArrayList<Fragment>();
        mFragments.add(new MainFragment());
        mFragments.add(new ExpenseFragment());
        mFragments.add(new IncomeFragment());
        mFragments.add(new ReportFragment());

        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),mFragments));
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
