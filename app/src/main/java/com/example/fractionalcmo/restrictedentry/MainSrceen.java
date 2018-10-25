package com.example.fractionalcmo.restrictedentry;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;


public class MainSrceen extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

   Toolbar toolbar;

    private DrawerLayout mdrawerLayout;
    private ActionBarDrawerToggle toggle;

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainsrceen);

        /*
        * This code is for ToolBar
        * */
        toolbar =  findViewById(R.id.toolbar);
        /*toolbar.setTitle("Toolbar");*/
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("RestrictedEntry");


        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new MyID(),"My ID");
        viewPagerAdapter.addFragment(new Newpasses(),"New Pass");
        viewPagerAdapter.addFragment(new PassLists(),"Pass List");
        viewPagerAdapter.addFragment(new Notification(),"Pass Type");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


        /*
         * This code is for NavigationBar and for performing toggle actions
         *
         * */
        mdrawerLayout = (DrawerLayout) findViewById(R.id.mdrawer);
        toggle = new ActionBarDrawerToggle(this,mdrawerLayout,R.string.open,R.string.close);
        mdrawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView)findViewById(R.id.navi);
        navigationView.setNavigationItemSelectedListener(MainSrceen.this);

        /* toolbar.setSubtitle("Sub");*/
 /*       toolbar.setLogo(R.drawable.list);*/
        /*toolbar.setNavigationIcon(R.drawable.navigation);*/




    }

    /*
    * This method is for Inflate the menu items
    * */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar,menu);
        return true;
    }

    /*
     * This method is for OptionsItemSelected for both toolabr and navigation bar
     * */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String msg = "";
        switch (item.getItemId()){
            case R.id.menu_home:
                msg="home";
                Toast.makeText(this,"This is Home",Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_setting:
                msg="setting";
                Toast.makeText(this,"This is Setting",Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_search:
                msg="search";
                Toast.makeText(this,"This is Search",Toast.LENGTH_SHORT).show();
                break;
        }


        if(toggle.onOptionsItemSelected(item)){
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

   /*
   * This method is for selecting the items from the Navigation bar
    * */

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id==R.id.home){
            Toast.makeText(this,"This is Home",Toast.LENGTH_SHORT).show();
        }

        if(id==R.id.sitting){
            Toast.makeText(this,"This is Setting",Toast.LENGTH_SHORT).show();
        }

        if(id==R.id.dashbroad){
            Toast.makeText(this,"This is Camera",Toast.LENGTH_SHORT).show();
        }

        if(id==R.id.sign){
            Toast.makeText(this,"This is Galary",Toast.LENGTH_SHORT).show();
        }

        mdrawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }

}

  /*  private ViewPager viewPager;
    private TabsPagerAdapter mAdapter;
    private ActionBar actionBar;
    // Tab titles
    private String[] tabs = { "Top Rated", "Games", "Movies" };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainsrceen);


        // Initilization
        viewPager = (ViewPager) findViewById(R.id.viewpager);
       // actionBar = getActionBar();
        mAdapter = new TabsPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(mAdapter);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Adding Tabs
        for (String tab_name : tabs) {
            actionBar.addTab(actionBar.newTab().setText(tab_name)
                    .setTabListener(this));
        }
    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}


*//*

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new My_Id();
            case 1:
                // Games fragment activity
                return new NewPass();
            case 2:
                // Movies fragment activity
                return new PassList();

            case 3:
                // Movies fragment activity
                return new Notifications();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }

}
*//*






 *//*   private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainsrceen);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);

        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    private void setupViewPager(ViewPager viewPager) {

       ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new My_Id(), "ONE");
        adapter.addFragment(new NewPass(), "TWO");
        adapter.addFragment(new PassList(), "THREE");
        adapter.addFragment(new Notifications(), "FOUR");
        
        viewPager.setAdapter(adapter);
        TextView tabtv = findViewById(R.id.tab);
       



    }

 *//**//*   @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }*//**//*

    class ViewPagerAdapter extends FragmentPagerAdapter{
        private final List<Fragment> fragmentsList = new ArrayList<>();
        private  final List<String> fragmentsTitleList= new ArrayList<>();

        public  ViewPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }
            @Override
            public Fragment getItem(int position){
               // return fragmentsList.get(position);

                switch (position) {
                    case 0:
                        // Top Rated fragment activity
                        return new My_Id();
                    case 1:
                        // Games fragment activity
                        return new NewPass();
                    case 2:
                        // Movies fragment activity
                        return new PassList();

                    case 3:
                        // Movies fragment activity
                        return new Notifications();

                }

                return null;

            }

        @Override
        public int getCount(){
            return fragmentsList.size();

        }

       
        public void addFragment(Fragment fragment, String title){
            fragmentsList.add(fragment);
            fragmentsTitleList.add(title);

        }
        @Override
        public CharSequence getPageTitle(int position){
            return fragmentsTitleList.get(position);

        }

    }
}*//*
*/