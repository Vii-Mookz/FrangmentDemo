package com.example.vipavee.frangmentdemo;

import android.app.Fragment;
import android.content.Context;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentA extends Fragment {
    private static final String TAG = FragmentA.class.getSimpleName();
    private Button btnSend;
    private EditText etFirstNumber,etSecondNumber;

//    private  int firstNumber = 0, secondNumber = 0;
//    private MainActivity.Employee employee;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        etFirstNumber = (EditText) view.findViewById(R.id.etFirstNumber);
        etSecondNumber = (EditText) view.findViewById(R.id.etSecondNumber);

//
//        Bundle bundle = getArguments();
//        final int firstNum = bundle.getInt(Constants.FIRST_NUM, 0);
//        final int secondNum = bundle.getInt(Constants.SECOND_NUM, 0);


        btnSend = (Button) view.findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Codes..
//                addTwoNumbers(firstNumber, secondNumber);
                sendData();
            }
        });
        return view;
    }

    private void sendData() {

        int firstNum = Integer.valueOf(etFirstNumber.getText().toString());
        int secondNum = Integer.valueOf(etSecondNumber.getText().toString());

       MyListener myListener = (MyListener) getActivity();
        myListener.addTwoNumber(firstNum,secondNum);




    }
//
//    private void addTwoNumbers(int firstNum, int secondNum) {
//
//        int result = firstNum + secondNum;
//        txtResult.setText("Result: " + result);
//    }
//
//    public void setData(int firstNumber, int secondNumber) {
//        this.firstNumber = firstNumber;
//        this.secondNumber = secondNumber;
//
//    }

//    public void setEmployeeObj(MainActivity.Employee employee) {
//
//        this.employee = employee;// Use this obj
//
//    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        Log.i(TAG, "onAttach()");
//    }
//
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        Log.i(TAG, "onCreate()");
//    }

//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        Log.i(TAG, "onViewCreated()");
//    }


//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        Log.i(TAG, "onActivityCreated()");
//    }
//
//
//    @Override
//    public void onStart() {
//        super.onStart();
//        Log.i(TAG, "onStart()");
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        Log.i(TAG, "onResume()");
//    }

//    @Override
//    public void onPause() {
//        super.onPause();
//        Log.i(TAG, "onPause()");
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        Log.i(TAG, "onStop()");
//    }
//
//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        Log.i(TAG, "onDestroyView()");
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        Log.i(TAG, "onDestroy()");
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        Log.i(TAG, "onDetach()");
//    }


}
