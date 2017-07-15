package phone.nikolas.com.castflow.activity.login;

import phone.nikolas.com.castflow.base.BasePresenter;

/**
 * Created by Pleret on 4/25/2017.
 */

public class LoginPresenter extends BasePresenter<LoginActivity,LoginViewModel> {

    public boolean checkPassword(){

        return true;

    }

    public void enterApplication(){
        view.loginAction();
    }
}
