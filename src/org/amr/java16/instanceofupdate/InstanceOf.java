package org.amr.java16.instanceofupdate;

/**
 * @author : AMRS
 * @CreateDate : 11-Apr-2021 (Sun) (4:26 PM)
 * @ProjectName : java16
 */

public class InstanceOf implements InstanceOfFlow {

    public static void main(String[] args) {
        String sampleInput1 = "Mahendra";
        Integer sampleInput2 = 2342;
        InstanceOf instanceOf = new InstanceOf();


        boolean isMatched = instanceOf.checkInstanceInOldWay(sampleInput1);
        System.out.println(sampleInput1 + ", Is a String : " + isMatched);

        isMatched = instanceOf.checkInstanceInNewWay(sampleInput2);
        System.out.println(sampleInput2 + ", Is a String : " + isMatched);
    }

    @Override
    public boolean checkInstanceInOldWay(Object obj) {
        if (obj instanceof String) {
            String value = (String) obj;
            System.out.println("Value : " + value);
            return true;
        }
        return false;
    }

    @Override
    public boolean checkInstanceInNewWay(Object obj) {
        if (obj instanceof String value) {
            System.out.println("Value : " + value);
            return true;
        }
        return false;
    }


}