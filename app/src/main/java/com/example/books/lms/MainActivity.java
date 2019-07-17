package com.example.books.lms;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;

import com.example.books.lms.Model.CourseM;
import com.example.books.lms.Model.MyDb;
import com.example.books.lms.Model.User;
import com.example.books.lms.Utilities.ConstantsPref;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ExpandableListAdapter listAdapter;
    ExpandableListView explistview;
    List<headeritem> listdataheader;
    private String name = null;
    HashMap<List<headeritem>, List<imageitem>> listdatachild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        User user = ConstantsPref.getUser(this);


        started concatobj = new started();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fregment_continer, concatobj);
        fragmentTransaction.commit();

        final List<headeritem> listdataheader = new ArrayList<>();
        listdatachild = new HashMap<List<headeritem>, List<imageitem>>();

        listdataheader.add(new headeritem(getResources().getString(R.string.home), R.drawable.home_nav));
        listdataheader.add(new headeritem(getResources().getString(R.string.site_page), R.drawable.site_page_nav));
        listdataheader.add(new headeritem(getResources().getString(R.string.profile), R.drawable.profile_nav));
        listdataheader.add(new headeritem(getResources().getString(R.string.my_courses), R.drawable.courses_nav));


        List<imageitem> my_home = new ArrayList<>();
        my_home.add(new imageitem(getResources().getString(R.string.home), R.drawable.home3));

        List<imageitem> site_page = new ArrayList<>();
        site_page.add(new imageitem(getResources().getString(R.string.Calender), R.drawable.calender_nav));
        site_page.add(new imageitem(getResources().getString(R.string.site_news), R.drawable.site_news_page));
        site_page.add(new imageitem(getResources().getString(R.string.Academic_Bylaws_and_Academic_policies), R.drawable.policy_nav));

        List<imageitem> my_profile = new ArrayList<>();
        my_profile.add(new imageitem(getResources().getString(R.string.profile), R.drawable.profile_view));
        my_profile.add(new imageitem(getResources().getString(R.string.forum_post), R.drawable.forum_nav));
        my_profile.add(new imageitem(getResources().getString(R.string.message), R.drawable.message_nav));
        my_profile.add(new imageitem(getResources().getString(R.string.files), R.drawable.file_nav));


        List<CourseM> courseMS = MyDb.getInstance(this).getMyCourses(user.getId());

        List<imageitem> my_courses = new ArrayList<>();
        for (CourseM c: courseMS ) {
            my_courses.add(new imageitem(c.getCourseCode(), R.drawable.cours_one_nav));
        }

        my_courses.add(new imageitem(getResources().getString(R.string.e_office), R.drawable.hours_nav));
        my_courses.add(new imageitem(getResources().getString(R.string.all_courses), R.drawable.all_courses));

        listdatachild.put((List<headeritem>) listdataheader.get(0), my_home);
        listdatachild.put(listdataheader.get(1), site_page);
        listdatachild.put(listdataheader.get(2), my_profile);
        listdatachild.put(listdataheader.get(3), my_courses);
        explistview = (ExpandableListView) findViewById(R.id.explist);
        listAdapter = new ExpandableListAdapter(this, listdataheader, listdatachild);
        explistview.setAdapter(listAdapter);

        explistview.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                imageitem s = listdatachild.get(listdataheader.get(groupPosition)).get(childPosition);
                if (s.name.equals(getResources().getString(R.string.home))) {
                    Intent intent = new Intent(getApplicationContext(), my_home.class);
                    startActivity(intent);

                }
                else if (s.name.equals(getResources().getString(R.string.Academic_Bylaws_and_Academic_policies))) {
                    academic_policies acad_polic = new academic_policies();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fregment_continer,acad_polic);
                    fragmentTransaction.addToBackStack(null).commit();
                }
                else if (s.name.equals(getResources().getString(R.string.profile))) {
                    view_profile view_prof = new view_profile();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fregment_continer,view_prof);
                    fragmentTransaction.addToBackStack(null).commit();
                }
                else if (s.name.equals(getResources().getString(R.string.files))) {
                    my_privite_file my_priv_file = new my_privite_file();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fregment_continer,my_priv_file);
                    fragmentTransaction.addToBackStack(null).commit();
                }
                else if (s.name.equals(getResources().getString(R.string.e_office))) {
                    E_office_tours e_offic = new E_office_tours();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fregment_continer,e_offic);
                    fragmentTransaction.addToBackStack(null).commit();
                }
                else if (s.name.equals(getResources().getString(R.string.home))) {
                    Intent intent = new Intent(getApplicationContext(), my_home.class);
                    startActivity(intent);

                }
                else if (s.name.equals(getResources().getString(R.string.site_news))) {
                    FragUnivNews frag = new FragUnivNews();
                    Bundle bundle = new Bundle();
                    bundle.putString("name", "site");
                    frag.setArguments(bundle);
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fregment_continer, frag);
                    fragmentTransaction.addToBackStack(null).commit();

                }
                else if (s.name.equals(getResources().getString(R.string.forum_post))) {

                    fourm_post forum = new fourm_post();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fregment_continer,forum);
                    fragmentTransaction.addToBackStack(null).commit();
                }
                else if (s.name.equals(getResources().getString(R.string.Calender))) {
                    FragCalander frag = new FragCalander();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fregment_continer,frag);
                    fragmentTransaction.addToBackStack(null).commit();
                }
                else if (s.name.equals(getResources().getString(R.string.message))) {
                    startActivity(new Intent(MainActivity.this, MsgAct.class));
                }
                else if ( s.name.equals(getResources().getString(R.string.all_courses))) {
                }
                else
                    {
                    course_outline concatobj = new course_outline();
                        name = s.name;
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fregment_continer, concatobj);
                    fragmentTransaction.addToBackStack(null).commit();

                }

                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return false;
       /* if(groupPosition==0&&childPosition==0){

            Intent intent=new Intent(getApplicationContext(),my_home.class);
            startActivity(intent);
        }
        else  if (s.name.equals("Calender"))
        {

            course_outline concatobj=new course_outline();
            android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fregment_continer,concatobj);
            fragmentTransaction.addToBackStack(null).commit();
        }*/

            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(getApplicationContext(), administrating.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent intent = new Intent(getApplicationContext(), contact.class);
            startActivity(intent);

            //School_Fragment fragment=new School_Fragment();
            // android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            //fragmentTransaction.replace(R.id.fregment_continer,fragment);
            //fragmentTransaction.addToBackStack(null).commit();

            // Handle the camera action
            // concat1 concatobj=new concat1();
            //android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
            //fragmentTransaction.replace(R.id.fragment_continer,concatobj);
            //fragmentTransaction.addToBackStack(null).commit();
            // FragmentManager fm=getSupportFragmentManager();
            // fm.beginTransaction().replace(R.id.content_main,concatobj,concatobj.getTag()).commit();

        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(getApplicationContext(), assignment.class);
            startActivity(intent);
        } else if (id == R.id.nav_slideshow) {
            Intent intent = new Intent(getApplicationContext(), chang_pass.class);
            startActivity(intent);

        } else if (id == R.id.nav_manage) {


        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void click_test(View view) {
        Intent intent = new Intent(getApplicationContext(), assignment.class);
        startActivity(intent);
    }

    public void click_btn_cour_grades(View view) {
        Intent intent = new Intent(getApplicationContext(), course_grades.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void click_btn_attendance(View view) {
        Intent intent = new Intent(getApplicationContext(), attendance.class);
        intent.putExtra("name", name);
        startActivity(intent);

    }

    public void click_btn_assign(View view) {
        Intent intent = new Intent(getApplicationContext(), assignment.class);
        startActivity(intent);
    }

    public void click_btn_survery_answer(View view) {
    }

    public void click_btn_forum(View view) {
        Intent intent = new Intent(getApplicationContext(), CourseForum.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void click_btn_cour_content(View view) {
        Intent intent = new Intent(getApplicationContext(), CourseCalender.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void click_btn_mta_exame(View view) {
        Intent intent = new Intent(getApplicationContext(), ExamCov.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void click_btn_cour_calender(View view) {
        Intent intent = new Intent(getApplicationContext(), CourseCalender.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void click_btn_cour_announ(View view) {
        Intent intent = new Intent(getApplicationContext(), CourseAnnouncement.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void click_cour_coord(View view) {
        Intent intent = new Intent(getApplicationContext(), course_coordinator.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public void click_support(View view) {
        supporting_materail supp_matir = new supporting_materail();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fregment_continer, supp_matir);
        fragmentTransaction.addToBackStack(null).commit();
    }

    public void click_acad_Bylaws(View view) {
        Intent intent = new Intent(getApplicationContext(), academic_Bylows.class);
        startActivity(intent);

    }

    public void click_my_home(View view) {
        Intent intent = new Intent(getApplicationContext(), my_home.class);
        startActivity(intent);
    }

    public void click_ksa_news(View view) {
        FragUnivNews frag = new FragUnivNews();
        Bundle bundle = new Bundle();
        bundle.putString("name", "ksa");
        frag.setArguments(bundle);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fregment_continer, frag);
        fragmentTransaction.addToBackStack(null).commit();
    }

   /* public void fragment(View view) {
      concat1 concatobj=new concat1();
      android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
       fragmentTransaction.replace(R.id.fregment_continer,concatobj);
       fragmentTransaction.addToBackStack(null).commit();
        Intent intent=new Intent(getApplicationContext(),log_in.class);
        startActivity(intent);
    }
    */
}
