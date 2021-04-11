package org.amr.java16.sealedClasses;

import java.sql.SQLOutput;

/**
 * @author : AMRS
 * @CreateDate : 11-Apr-2021 (Sun) (5:36 PM)
 * @ProjectName : java16
 */
public non-sealed class Herb extends Plant implements Runnable{
    public void sellHerb() {
        try {
            System.out.println("Selling Herb...");
            Thread sellingThread = new Thread(new Herb());
            sellingThread.setName("Selling Thread");
            sellingThread.start();
            sellingThread.join();
            System.out.println("\nSold Herb...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        startProcess();
    }
}
