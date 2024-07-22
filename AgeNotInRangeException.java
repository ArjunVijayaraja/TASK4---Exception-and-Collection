package ExceptionAndCollection;

public class AgeNotInRangeException extends Exception{
    public AgeNotInRangeException(String expMessage){
        super(expMessage);
    }
}
