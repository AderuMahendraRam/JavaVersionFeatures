package org.amr.java16.records;

import java.util.Random;
import java.util.logging.Logger;
import java.util.stream.LongStream;

public class PersonMain {
    static Logger logger = Logger.getLogger(PersonMain.class.getName());

    //Local records
    record Order(Long orderId,String orderName){}


    public static void main(String[] args) {
        Person person = new Person("Mahendra",25,'M');
        logger.info(person.toString());

        Person person1 = new Person(25);
        logger.info("\n-----------------====================---------------\n");
        logger.info(person1.toString());
        logger.info("person gender : "+person1.gender());
        logger.info("\n-----------------====================---------------\n");
        Order order = new Order(getSomeRandomNumber(),person.name());
        logger.info(order.toString());


    }

    public static Long getSomeRandomNumber(){
        Random random = new Random();
         return random.nextLong();
    }
}
