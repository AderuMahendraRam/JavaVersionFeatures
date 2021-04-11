package org.amr.java16.sealedClasses;

/**
 * @author : AMRS
 * @CreateDate : 11-Apr-2021 (Sun) (5:37 PM)
 * @ProjectName : java16
 */
public sealed class Climber extends Plant permits Cucumber{
    public void sowClimber() {
        System.out.println("sowClimber ...");
    }
}
