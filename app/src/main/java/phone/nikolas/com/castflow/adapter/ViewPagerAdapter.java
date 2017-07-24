package phone.nikolas.com.castflow.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pleret on 4/21/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        mFragmentList = new ArrayList<>();
    }

    public ViewPagerAdapter(FragmentManager fm, List<Fragment> m_fragment) {
        super(fm);
        this.mFragmentList = m_fragment;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }


}
