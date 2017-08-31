package com.jbapps.cuentacuentos.presenter;

/**
 * Created by MAV1GA on 31/08/2017.
 */

public class CuentosPresenter {

    private static CuentosPresenter instance;
    //Hacemos la clase un singleton por seguridad
    private CuentosPresenter(){}

    public synchronized static CuentosPresenter getInstance(){
        if (instance == null)
            instance = new CuentosPresenter();
        return instance;

    }

}
