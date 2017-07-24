package phone.nikolas.com.castflow.fragment.report;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import phone.nikolas.com.castflow.R;
import phone.nikolas.com.castflow.base.BaseFragment;
import phone.nikolas.com.castflow.databinding.FragmentReportBinding;

/**
 * Created by Pleret on 7/15/2017.
 */

public class ReportFragment extends BaseFragment<FragmentReportBinding, ReportViewModel, ReportPresenter> implements ReportView {

    @Override
    protected View initBinding(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_report,container,false);

        return binding.getRoot();
    }

    @Override
    protected void initViewModel() {
        viewModel = new ReportViewModel();
        binding.setViewModel(viewModel);
    }

    @Override
    protected void initPresenter() {
        presenter = new ReportPresenter();
        presenter.setView(this);
        presenter.setViewModel(viewModel);
    }

    @Override
    protected void onViewReady(Bundle savedInstanceState) {

    }
}
