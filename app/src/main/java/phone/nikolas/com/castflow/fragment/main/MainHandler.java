package phone.nikolas.com.castflow.fragment.main;

/**
 * Created by Pleret on 4/12/2017.
 */

public class MainHandler {
    private MainPresenter presenter;

    public void clickButtonInput(int category,String type){
        presenter.submitButtonInput(category,type);
    }

    public MainPresenter getPresenter() {
        return presenter;
    }

    public void setPresenter(MainPresenter presenter) {
        this.presenter = presenter;
    }
}
