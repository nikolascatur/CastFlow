package phone.nikolas.com.castflow.activity.login;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Pleret on 4/24/2017.
 */

public class LoginViewModel extends BaseObservable {
    private String username;
    private String password;

    @Bindable
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
