package org.amr.java16.sealedClasses;

/**
 * @author : AMRS
 * @CreateDate : 11-Apr-2021 (Sun) (5:37 PM)
 * @ProjectName : java16
 */
public final class Cucumber extends Climber implements Runnable {
    public void harvestCucumber() {
        try {
            System.out.println("harvest Started ... !");
            Thread harvestingThread = new Thread(new Cucumber());
            harvestingThread.setName("harvestingThread");
            harvestingThread.start();
            harvestingThread.join();
            System.out.println("\nharvest Completed ... !");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
       startProcess();
    }
}
