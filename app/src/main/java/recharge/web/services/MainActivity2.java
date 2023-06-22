package recharge.web.services;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuItem;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import recharge.web.services.databinding.ActivityMain2Binding;
import recharge.web.services.fragments.FragmentRecharge;
import recharge.web.services.fragments.Fragment_Bill_Inquiry;
import recharge.web.services.fragments.HomeFragment;

public class MainActivity2 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMain2Binding binding;
    BottomNavigationView bottomNavigationView;
    FragmentContainerView fragmentContainerView;
    Fragment_Bill_Inquiry fragment_bill_inquiry;
    FragmentRecharge fragmentRecharge;
    HomeFragment homeFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fragment_bill_inquiry=new Fragment_Bill_Inquiry();
        fragmentRecharge=new FragmentRecharge();
        homeFragment=new HomeFragment();
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.containerView);
        fragmentContainerView=(FragmentContainerView)findViewById(R.id.frame1);
       bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               if (item.getItemId()==R.id.bill_menu){
                   loadFragment(fragment_bill_inquiry);
               }
               if (item.getItemId()==R.id.recharge_menu){
                   loadFragment(fragmentRecharge);
               }

               if (item.getItemId()==R.id.home_menu){
                   loadFragment(homeFragment);
               }
               return false;
           }
       } );







}
    public  void loadFragment(Fragment fragment){
        // fragment.setArguments(bundleGalleryFrag);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame1, fragment, "");
        fragmentTransaction.commit();

    }


}