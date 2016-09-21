package com.simple.viewpagertransforms;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.simple.transformslibrary.FlipHorizontalTransformer;
import com.simple.transformslibrary.TransformUtil;

public class FragmentTransActivity extends AppCompatActivity {

    private int[] colors = {Color.parseColor("#00BFFF"), Color.parseColor("#FF1493")
            , Color.parseColor("#8B0000"), Color.parseColor("#008B8B")
            , Color.parseColor("#8B008B")};

    public static final String TRANS_POSITION = "TRANSPOSITION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_trans);
//
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new fragmentAdapter(getSupportFragmentManager()));
        TransformUtil.reverse(viewPager, new FlipHorizontalTransformer());
    }

    public class MyFragment extends Fragment {

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container
                , @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.item_pager, container,false);
            TextView textView = (TextView) rootView.findViewById(R.id.pager_tv);
            int position = getArguments().getInt(TRANS_POSITION);
            textView.setText(String.valueOf(position));
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(FragmentTransActivity.this, ((TextView) v).getText()
                            , Toast.LENGTH_SHORT)
                            .show();
                }
            });
            rootView.setBackgroundColor(colors[position - 1]);
            return rootView;
        }
    }


    class fragmentAdapter extends FragmentStatePagerAdapter {

        public fragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            final MyFragment fragment = new MyFragment();

            final Bundle bundle = new Bundle();
            bundle.putInt(TRANS_POSITION, position + 1);

            fragment.setArguments(bundle);
            return fragment;
        }

        @Override
        public int getCount() {
            return colors.length;
        }
    }
}
