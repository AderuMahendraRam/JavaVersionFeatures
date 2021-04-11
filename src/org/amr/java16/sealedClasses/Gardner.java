package org.amr.java16.sealedClasses;

import java.io.IOException;
import java.util.stream.IntStream;

/**
 * @author : AMRS
 * @CreateDate : 11-Apr-2021 (Sun) (5:43 PM)
 * @ProjectName : java16
 */
public class Gardner {

    void process(Plant plant) {
        if (plant instanceof Cucumber cucumber) {
            cucumber.harvestCucumber();
        } else if (plant instanceof Climber climber) {
            climber.sowClimber();
        } else if (plant instanceof Herb herb) {
            herb.sellHerb();
        } else if (plant instanceof Shrub shrub) {
            shrub.pruneShrub();
        } else {
            System.out.println("Unreachable CODE. Unknown Plant type");
        }
    }

    public static void main(String[] args) {
        Gardner gardner = new Gardner();
        gardner.process(new Climber());
        gardner.process(new Shrub());
        gardner.process(new Cucumber());
        gardner.process(new Herb());


    }
}
