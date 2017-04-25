package phone.nikolas.com.castflow.depen.component;

import javax.inject.Singleton;

import dagger.Component;
import phone.nikolas.com.castflow.activity.forgotpassword.ForgotPasswordActivity;
import phone.nikolas.com.castflow.activity.login.LoginActivity;
import phone.nikolas.com.castflow.activity.main.MainMenuActivity;
import phone.nikolas.com.castflow.activity.signup.SignupActivity;
import phone.nikolas.com.castflow.depen.module.AppModule;

/**
 * Created by Pleret on 4/11/2017.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainMenuActivity mainMenuActivity);
    void inject(ForgotPasswordActivity forgotPasswordActivity);
    void inject(LoginActivity loginActivity);
    void inject(SignupActivity signupActivity);
}
