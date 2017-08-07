package phone.nikolas.com.castflow.activity.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import phone.nikolas.com.castflow.R;
import phone.nikolas.com.castflow.activity.login.LoginActivity;
import phone.nikolas.com.castflow.activity.main.MainMenuActivity;

/**
 * Created by Pleret on 4/20/2017.
 */

public class SplashActivity extends AppCompatActivity {

    final static int DURATION_SPLASH = 3000;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainMenuActivity.class);
                startActivity(intent);
                finish();
            }
        },DURATION_SPLASH);

    }
}
