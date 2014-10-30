/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generales;

import forms.frmConfiguracion;

/**
 *
 * @author joshua.d.juanchini
 */
public class Singleton {

    //Formularios

    private JfrPrincipal framePrincipal = null;
    private frmConfiguracion frameConfiguracion = null;

    //Parámetros generales
    //<editor-fold defaultstate="collapsed" desc="Singleton Things">
    private Singleton() {

    }

    public static Singleton getInstance() {
        return singletonHolder.INSTANCE;
    }

    private static class singletonHolder {

        private static final Singleton INSTANCE = new Singleton();
    }

//</editor-fold>
    public void showPrincipal() {
        framePrincipal = new JfrPrincipal();
        framePrincipal.run();
    }

    public void changeLookAndFeel(String lf) {
        framePrincipal.lookandfeel(lf);
    }

    public void frConfiguracion() {
        if (frameConfiguracion == null) {
            frameConfiguracion = new frmConfiguracion();
            framePrincipal.jDesktopPane1.add(frameConfiguracion);
        }
        if(frameConfiguracion.estado){
            frameConfiguracion.hide();
            frameConfiguracion.estado=false;
        } else{
            frameConfiguracion.show();
            frameConfiguracion.estado=true;
        }
    }
}
