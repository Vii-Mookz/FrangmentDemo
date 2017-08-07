package com.example.vipavee.frangmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private FragmentManager manager;
    private int firstNum, secondNum;
//    private TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();


        AddfragmentA();
        AddfragmentB();

    }

    private void AddfragmentA() {
        FragmentA fragmentA = new FragmentA();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.containerFragmentA, fragmentA, "fragA");
        transaction.commit();


    }

    private void AddfragmentB() {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.containerFragmentB, fragmentB, "fragB");
        transaction.commit();
    }

    @Override
    public void addTwoNumber(int num1, int num2) {
        this.firstNum = num1;
        this.secondNum = num2;

        Toast.makeText(this, "NUMBER Recieve in Activity: " + num1 + "," + num2, Toast.LENGTH_SHORT).show();

    }

    public void sendDataToFragmentB(View view) {

        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("fragB");
        fragmentB.addTwoNumbersInFragmentB(firstNum, secondNum);

    }



//    public void addFragmentA(View view) {
//
//        FragmentA fragmentA = new FragmentA();
//        FragmentManager manager = getFragmentManager();
//
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.add(R.id.container, fragmentA, "fragA");
//        transaction.commit();
//    }
//
//    public void removeFragmentA(View view) {
//
//        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
//        FragmentTransaction transaction = manager.beginTransaction();
//        if (fragmentA != null) {
//            transaction.remove(fragmentA);
//            transaction.commit();
//        } else {
//            Toast.makeText(this, "Fragment A not Found", Toast.LENGTH_SHORT).show();
//        }
//
//
//    }
//
//    public void addFragmentB(View view) {
//        FragmentB fragmentB = new FragmentB();
//        FragmentManager manager = getFragmentManager();
//
//        FragmentTransaction transaction = manager.beginTransaction();
//
//        transaction.add(R.id.container, fragmentB, "fragB");
//        transaction.commit();
//
//
//    }
//
//    public void removeFragmentB(View view) {
//
//        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("fragB");
//        FragmentTransaction transaction = manager.beginTransaction();
//        if (fragmentB != null) {
//            transaction.remove(fragmentB);
//            transaction.commit();
//        } else {
//
//            Toast.makeText(this, "Fragment B not Found", Toast.LENGTH_SHORT).show();
//        }
//
//    }
//
//    public void replaceByFragmentA(View view) {
//        FragmentA fragmentA = new FragmentA();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.replace(R.id.container, fragmentA, "fragA");
//        transaction.commit();
//    }
//
//    public void replaceByFragmentB(View view) {
//        FragmentB fragmentB = new FragmentB();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.replace(R.id.container, fragmentB, "fragB");
//        transaction.commit();
//
//    }
//
//
//    public void attachFragmentA(View view) {
//
//        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
//        FragmentTransaction transaction = manager.beginTransaction();
//
//        if (fragmentA != null) {
//            transaction.attach(fragmentA);
//            transaction.commit();
//        } else {
//            Toast.makeText(this, "Fragment A not Found", Toast.LENGTH_SHORT).show();
//        }
//
//    }
//
//    public void detachFragmentA(View view) {
//
//        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
//        FragmentTransaction transaction = manager.beginTransaction();
//
//        if (fragmentA != null) {
//            transaction.detach(fragmentA);
//            transaction.commit();
//        } else {
//            Toast.makeText(this, "Fragment A not Found", Toast.LENGTH_SHORT).show();
//        }
//
//    }
//
//    public void attachFragmentB(View view) {
//        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("fragB");
//        FragmentTransaction transaction = manager.beginTransaction();
//
//        if (fragmentB != null) {
//            transaction.attach(fragmentB);
//            transaction.commit();
//        } else {
//            Toast.makeText(this, "Fragment B not Found", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    public void detachFragmentB(View view) {
//
//        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("fragB");
//        FragmentTransaction transaction = manager.beginTransaction();
//
//        if (fragmentB != null) {
//            transaction.detach(fragmentB);
//            transaction.commit();
//        } else {
//            Toast.makeText(this, "Fragment B not Found", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    public void showFragmentA(View view) {
//        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
//        FragmentTransaction transaction = manager.beginTransaction();
//
//        if (fragmentA != null) {
//            transaction.show(fragmentA);
//            transaction.commit();
//        } else {
//            Toast.makeText(this, "Fragment A not Found", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    public void hideFragmentA(View view) {
//        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
//        FragmentTransaction transaction = manager.beginTransaction();
//
//        if (fragmentA != null) {
//            transaction.hide(fragmentA);
//            transaction.commit();
//
//        } else {
//            Toast.makeText(this, "Fragment A not Found", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    public void showFragmentB(View view) {
//        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("fragB");
//        FragmentTransaction transaction = manager.beginTransaction();
//        if (fragmentB != null) {
//            transaction.show(fragmentB);
//            transaction.commit();
//        } else {
//            Toast.makeText(this, "Fragment B not Found", Toast.LENGTH_SHORT).show();
//        }
//
//    }
//
//    public void hideFragmentB(View view) {
//        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("fragB");
//        FragmentTransaction transaction = manager.beginTransaction();
//        if (fragmentB != null) {
//            transaction.hide(fragmentB);
//            transaction.commit();
//        } else {
//            Toast.makeText(this, "Fragment B not Found", Toast.LENGTH_SHORT).show();
//        }
//    }
}
