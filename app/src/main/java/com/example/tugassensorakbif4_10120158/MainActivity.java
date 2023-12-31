package com.example.tugassensorakbif4_10120158;
//Nama    : Nerisa Sampa Guita
//NIM     : 10120158
//Kelas   : IF-4
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    private BottomNavigationView bottomNavigationView;
    private ProfileFragment profileFragment = new ProfileFragment();
    private InfoFragment infoFragment = new InfoFragment();
    private MyLocationFragment myLocationFragment = new MyLocationFragment();
    private NearbyFragment nearbyFragment = new NearbyFragment();
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomView);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.profile);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, profileFragment).commit();
                return true;
            case R.id.nearby:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, nearbyFragment).commit();
                return true;
            case R.id.my_location:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, myLocationFragment).commit();
                return true;
            case R.id.info:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, infoFragment).commit();
                return true;

        }
        return false;
    }
}
