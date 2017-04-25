package phone.nikolas.com.castflow.activity.main;

import android.databinding.BindingAdapter;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

/**
 * Created by Pleret on 4/11/2017.
 */

public class MainMenuHandler {
    private MainMenuPresenter presenter;

    public MainMenuPresenter getPresenter() {
        return presenter;
    }

    public void setPresenter(MainMenuPresenter presenter) {
        this.presenter = presenter;
    }

//    @BindingAdapter({"bind:handler"})
//    public static  void bindViewPagerAdapter(final ViewPager view,final MainMenuActivity activity){
//
//    }
//    @BindingAdapter({"bind:pager"})
//    public static void bindViewPagerTabs(final TabLayout tab,final ViewPager view){
//        tab.setupWithViewPager(view,true);
//    }

}
