package ExceptionAndCollection;

import java.util.Stack;

public class Q5_CollectionTask {
    //Creating a Stack globally to populate the values
    Stack<Integer> stack = new Stack<Integer>();

    public static void main(String[] args) {
        //Creating the object for the class
        Q5_CollectionTask stk = new Q5_CollectionTask();

        //adding elements to the Stack
        stk.addNumberToStack(5);
        stk.addNumberToStack(51);
        stk.addNumberToStack(15);
        stk.addNumberToStack(10);
        System.out.println(stk.stack);
        //Removing or poping the element from the stack (THe last element will be removed from the stack.
       int n=  stk.removeElementFromStack();
        System.out.println("THe removed element from the stack is : "+n);
        System.out.println(stk.stack);

        //Checking is the stack empty of not
        System.out.println("Is the Stack empty : "+stk.checkIsStackNull());
    }

    //Function to add element to the stack
    public void addNumberToStack(int i){
        stack.push(i);

    }

    //Function to remove or pop the last element from the stack
    public int removeElementFromStack(){
       return stack.pop();
    }

    //Function to check is the stack empty or nor
    public boolean checkIsStackNull(){
        return stack.isEmpty();
    }
}