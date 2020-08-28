package com.sumant.photogram.Helper;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.sumant.photogram.Activities.AddActivity;
import com.sumant.photogram.Activities.HomeActivity;
import com.sumant.photogram.Activities.ProfileActivity;
import com.sumant.photogram.Activities.SearchActivity;
import com.sumant.photogram.Activities.ShareActivity;
import com.sumant.photogram.R;

public class BottomNavigationIconHelper {
    public static void setupBottomNavigation(BottomNavigationViewEx bottomNavigationViewEx){
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigationClick(final Context context, BottomNavigationViewEx viewEx){
        viewEx.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Home:
                        context.startActivity(new Intent(context, HomeActivity.class));
                        break;
                    case R.id.Search:
                        context.startActivity(new Intent(context, SearchActivity.class));
                        break;
                    case R.id.Add:
                        context.startActivity(new Intent(context, AddActivity.class));
                        break;
                    case R.id.Share:
                        context.startActivity(new Intent(context, ShareActivity.class));
                        break;
                    case R.id.Profile:
                        context.startActivity(new Intent(context, ProfileActivity.class));
                        break;
                }


                return false;
            }
        });
    }
}
