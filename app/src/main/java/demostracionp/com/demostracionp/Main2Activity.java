package demostracionp.com.demostracionp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TableLayout;

import demostracionp.com.demostracionp.adaptadores.ViewPagerAdapter;
import demostracionp.com.demostracionp.fragments.CallFragment;
import demostracionp.com.demostracionp.fragments.CorreoFragment;
import demostracionp.com.demostracionp.fragments.PerfilFragment;
import demostracionp.com.demostracionp.fragments.ServFragment;

public class Main2Activity extends AppCompatActivity {

    private TabLayout tabb1;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tabb1 = (TabLayout) findViewById(R.id.tab1id);
        viewPager = (ViewPager) findViewById(R.id.viewpaperid);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new CallFragment(),"");
        adapter.AddFragment(new CorreoFragment(),"");
        adapter.AddFragment(new ServFragment(),"");
        adapter.AddFragment(new PerfilFragment(),"");
        viewPager.setAdapter(adapter);
        tabb1.setupWithViewPager(viewPager);


        tabb1.getTabAt(0).setIcon(R.drawable.mascota);
        tabb1.getTabAt(1).setIcon(R.drawable.email);
        tabb1.getTabAt(2).setIcon(R.drawable.hacer);
        tabb1.getTabAt(3).setIcon(R.drawable.person);


    }

}

