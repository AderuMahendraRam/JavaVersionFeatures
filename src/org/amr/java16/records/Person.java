package org.amr.java16.records;

public record Person(String name,Integer age,char gender) {

    //Handling custom validation
    public Person {
        if(age<15){
           throw new IllegalArgumentException("Age less then expected");
        }
        if(name!=null && name.isEmpty()){
            throw new IllegalArgumentException("Name is empty");
        }
    }

    //Handling different constructor
    public Person(Integer age) {
        this("ram", age, 'F');
    }

    //Modifying data before sending back

    String getUpperCaseName() {
            return name().toUpperCase();
    }
}
