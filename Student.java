package ExceptionAndCollection;

import java.nio.channels.ScatteringByteChannel;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class Student {
    int rollNo;
    String studName;
    int age;
    String course;

    //this is a parameterized constructor, it initialises the Global vaariables like rollNo, studName and course
    public Student(int rollNo, String studName,int age, String course) throws AgeNotInRangeException, NameNotValidException {
       //I have created an Character Array -> it contains all the possible set of spl.characters and Symbols;
        char[] charArray = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+',
                '{', '}', '[', ']', '|', '\\', ':', ';', '"', '\'', '<', '>', ',', '.',
                '?', '/', '~', '`'};

        //Checking the age of the student if it is in the range of 15 to 21 else it will throw AgeNotInRangeException
                if(age>=15 && age<=21){
                    //iterating  each character from the StudentName against the ArrayList to check the presence of SplCharacters;
                    //If a spl.Character is found NameNotValid exception will be thrown.
                        for(int i = 0; i<studName.length();i++){
                            Character nameChar = studName.charAt(i);
                            for(int j = 0;j<charArray.length;j++){
                                if(nameChar.equals(charArray[j])){
                                   throw new NameNotValidException("NameNotValidException");
                                }
                            }
                        }
                    //Only if the above two conditions get cleared or satisfied all the global variables will be initialized and the Object will be initialised

                    this.age = age;
                    this.rollNo = rollNo;
                    this.studName = studName;
                    this.course = course;
                }
                else{
                    throw new AgeNotInRangeException("AgeNotInRange");
                }





    }

    public static void main(String[] args)  {

        //Object with Invalid age
        try {
            Student s1 = new Student(001, "ar@@jun", 10, "dasdaf");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        //Object with Invalid name
        try {
            Student s2 = new Student(002, "Vic@@ky", 21, "PG");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Object with Valid name and age
        try {
            Student s2 = new Student(002, "Raja", 20, "PG");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
