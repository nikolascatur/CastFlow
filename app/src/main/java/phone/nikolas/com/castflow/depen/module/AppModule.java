package phone.nikolas.com.castflow.depen.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Pleret on 4/11/2017.
 */
@Module
public class AppModule {
    Context context;

    public AppModule(Context context){
        this.context = context;
    }

    @Provides
    @Singleton
    @SuppressWarnings("unused")
    public Context providesContext(){
        return context;
    }

}
