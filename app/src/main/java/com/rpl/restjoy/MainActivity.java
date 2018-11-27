package com.rpl.restjoy;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.rpl.restjoy.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.linContainer)
    LinearLayout linContainer;
    @BindView(R.id.srlRestaurantList)
    SwipeRefreshLayout mSwipeRefreshLayout;

    List<Restaurant> restaurantList = new ArrayList<Restaurant>();
    int limit = 10;
    //EndlessRecyclerOnScrollListener mEndlessScrollListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
