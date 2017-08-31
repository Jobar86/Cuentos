package com.jbapps.cuentacuentos.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jbapps.cuentacuentos.interfaces.RequiredViewOperations;

/**
 * Created by MAV1GA on 31/08/2017.
 */

public class BaseActivity extends AppCompatActivity implements RequiredViewOperations {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    protected void init(){
        //Aquí inicializaremos la activity para ahorrar codigo

    }
}
