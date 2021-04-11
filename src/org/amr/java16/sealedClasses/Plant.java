package org.amr.java16.sealedClasses;

import java.io.IOException;
import java.util.Date;
import java.util.stream.IntStream;

/**
 * @author : AMRS
 * @CreateDate : 11-Apr-2021 (Sun) (5:35 PM)
 * @ProjectName : java16
 */
public sealed class Plant permits Climber, Herb, Shrub {
    /*public void startProcess(){
        Long startTime = new Date().getTime();
        StringBuilder anim;
        for (int processpercentage = 0; processpercentage <= 10; processpercentage++) {
            try {
                anim = new StringBuilder("[");
                for(int count=0;count<10;count++){
                    if(processpercentage>count){
                        anim.append("=");
                    }else{
                        anim.append(" ");
                    }
                }
                anim.append("]");
                String data = "\r" +anim+ " " + processpercentage*10+"%";
                System.out.write(data.getBytes());
                //Thread.sleep(500);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nTotal Time : "+(new Date().getTime()-startTime));
    }*/
    public void startProcess() {
        Long startTime = new Date().getTime();
        StringBuilder anim = new StringBuilder();
        anim.append("[");
        IntStream.range(0, 10).forEach(val -> anim.append(" "));
        anim.append("]");
        for (int processpercentage = 1; processpercentage <= 10; processpercentage++) {
            try {
                anim.deleteCharAt(anim.length() - 1);
                anim.replace(processpercentage, processpercentage + 1, "=");
                anim.append("]");
                String data = "\r" + anim + " " + processpercentage * 10 + "%";
                System.out.write(data.getBytes());
                Thread.sleep(500);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nTotal Time : " + (new Date().getTime() - startTime));
    }
}
