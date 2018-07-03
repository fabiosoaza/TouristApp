package com.example.ramonsl.touristapp2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.ramonsl.touristapp2.Fragments.HistoriFragment;
import com.example.ramonsl.touristapp2.Fragments.HoteisFragment;
import com.example.ramonsl.touristapp2.Fragments.PlacesFragment;
import com.example.ramonsl.touristapp2.Fragments.RestaurantesFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private FragmentManager fragmentManager;
    private Fragment fragment;
    BottomNavigationView bottomNavigationView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navHoteis:
                    mTextMessage.setText(R.string.title_hotel);
                    return true;
                case R.id.navLocais:
                    mTextMessage.setText(R.string.title_locais);
                    return true;
                case R.id.navHist:
                    mTextMessage.setText(R.string.title_history);
                    return true;

                case R.id.navRestaurantes:
                    mTextMessage.setText(R.string.title_restaurantes);
                    return true;
            }
            return false;
        }


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        bottomNavigationView = findViewById(R.id.navigation_botton);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        fragmentManager = getSupportFragmentManager();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.navHoteis:
                        fragment = new HoteisFragment();
                        break;
                    case R.id.navLocais:
                        fragment = new PlacesFragment();
                        break;
                    case R.id.navHist:
                        fragment = new HistoriFragment();
                        break;
                    case R.id.navRestaurantes:
                        fragment = new RestaurantesFragment();
                        break;
                    default:
                        fragment = new PlacesFragment();
                        break;
                }
                final FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.main_container, fragment).commit();
                return true;
            }
        });
    }

}
