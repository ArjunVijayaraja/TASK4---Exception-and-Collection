package ExceptionAndCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q4_HashMap {
    Map<String,Integer> studentHashMap = new HashMap<String,Integer>();
    public static void main(String[] args) {
        //Adding the student and their mark to the hashMap Object
        Q4_HashMap q4 = new Q4_HashMap();
        q4.addStudent("Arjun",88);
        q4.addStudent("Vicky",90);
        q4.addStudent("Sri",91);
        //Removing the Student entry from the hashmap object
        q4.removeStudent("Arjun");

        //Displaying all the wntries from the hashmap object
        q4.displayEntries();


    }

    //Method to add an entry to the map Object
    public void addStudent(String studName, int grade){
        studentHashMap.put(studName,grade);
    }

    //Method to remove a student from the Map Object
    public void removeStudent(String studName){
        studentHashMap.remove(studName);
    }

    //Method to display all the student available in the Map Object
    public void displayEntries(){
        for(Map.Entry<String,Integer> i : studentHashMap.entrySet()){
            System.out.println(i);
        }
    }


}
