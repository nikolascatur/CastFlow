package phone.nikolas.com.castflow.fragment.main;

import phone.nikolas.com.castflow.base.BasePresenter;

/**
 * Created by Pleret on 4/12/2017.
 */

public class MainPresenter extends BasePresenter<MainView,MainViewModel> {
    private MainPresenter presenter;

    public MainPresenter getPresenter() {
        return presenter;
    }

    public void setPresenter(MainPresenter presenter) {
        this.presenter = presenter;
    }

    public void submitButtonInput(int category,String type){
        view.actionButtonInput(category,type);
    }
}
