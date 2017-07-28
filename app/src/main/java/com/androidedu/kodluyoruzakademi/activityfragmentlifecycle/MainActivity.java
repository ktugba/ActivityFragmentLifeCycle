package com.androidedu.kodluyoruzakademi.activityfragmentlifecycle;

import android.app.Fragment;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String MAIN_TAG = "Mesaj";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(MAIN_TAG, "onCreate");

        FragmentManager fragmentManager = getSupportFragmentManager();    //fragment manager olusturuyoruz

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); //bir işlemi başlatmak için begin çağırılır

        android.support.v4.app.Fragment c_Fragment = new FragmentC(); // nesne oluşturup ad veriyoruz

        fragmentTransaction.add(R.id.activity_chooser_view_content, c_Fragment); //oluşturuldu artık  fragment

        fragmentTransaction.commit();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(MAIN_TAG, "onStart");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(MAIN_TAG, "onRestoreInstanceState");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(MAIN_TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(MAIN_TAG, "onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        setContentView(R.layout.activity_main);
        Log.e(MAIN_TAG, "onSaveInstanceState");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(MAIN_TAG, "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(MAIN_TAG, "onDestroy");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.e(MAIN_TAG, "onRestart");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(MAIN_TAG, "onAttachFragment");
    }
}
