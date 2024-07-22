package ExceptionAndCollection;

public class Voter {
    int voterId;
    String name;
    int age;

    //Creating a parametrized constructor with voterId, name and age as parameters
    public Voter(int voterId, String name,int age) throws Exception {
        //checking if the age is below 18, if it is below 18 ->
        // if the age id below 18,it will throw an "Invalid Age for Voter" exception while creating an object for the voter class
        if( age< 18){
            throw new Exception("invalid age For voter");
        }
        else {
            //if the age is above 18 , these global variables will get initialised.
            this.voterId = voterId;
            this.name = name;
            this.age = age;
        }

    }

    public static void main(String[] args) {

        //the age is below 18, so it will throw an exception so it is been handled using a try catch block
        try {
            Voter v1 = new Voter(01,"Arjun",17);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Voter v1 = new Voter(01,"Arjun",20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
