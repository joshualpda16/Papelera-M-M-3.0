/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generales;

/**
 *
 * @author joshua.d.juanchini
 */
public class Singleton {
    
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        return singletonHolder.INSTANCE;
    }
    
    private static class singletonHolder {

        private static final Singleton INSTANCE = new Singleton();
    }
}
