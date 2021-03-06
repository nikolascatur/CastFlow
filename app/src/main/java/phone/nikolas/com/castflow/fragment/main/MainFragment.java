package phone.nikolas.com.castflow.fragment.main;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import phone.nikolas.com.castflow.R;
import phone.nikolas.com.castflow.activity.addexpense.AddExpenseActivity;
import phone.nikolas.com.castflow.base.BaseFragment;
import phone.nikolas.com.castflow.databinding.FragmentMainBinding;

/**
 * Created by Pleret on 4/12/2017.
 */

public class MainFragment extends BaseFragment<FragmentMainBinding, MainViewModel, MainPresenter> implements MainView {

    @Override
    protected View initBinding(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);
        return binding.getRoot();
    }

    @Override
    protected void initViewModel() {
        viewModel = new MainViewModel();
        binding.setViewModel(viewModel);
    }

    @Override
    protected void initPresenter() {
        presenter = new MainPresenter();
        presenter.setView(this);
        presenter.setViewModel(viewModel);
    }

    @Override
    protected void onViewReady(Bundle savedInstanceState) {
        MainHandler handler = new MainHandler();
        handler.setPresenter(presenter);
        binding.setHandler(handler);
    }

    public void actionButtonInput(int category, String type) {
        Intent intent = new Intent(this.getContext(), AddExpenseActivity.class);
        Bundle bundle =  new Bundle();
        bundle.putInt("cat", category);
        bundle.putString("type",type);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
