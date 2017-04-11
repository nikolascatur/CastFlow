package phone.nikolas.com.castflow;

import android.app.Application;

import phone.nikolas.com.castflow.depen.component.AppComponent;
import phone.nikolas.com.castflow.depen.component.DaggerAppComponent;
import phone.nikolas.com.castflow.depen.module.AppModule;

/**
 * Created by Pleret on 4/10/2017.
 */

public class BaseApp extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        setAppComponent(DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build());
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public void setAppComponent(AppComponent appComponent) {
        this.appComponent = appComponent;
    }
}
