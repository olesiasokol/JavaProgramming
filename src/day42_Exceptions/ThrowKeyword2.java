package day42_Exceptions;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {
    public static void main(String[] args) {
        throw new NoSuchElementException("There is no such element as break");
        //throw new InterruptedException();//checked exceptions
        //System.out.println("Hello");
       // throw new Rectangle(5,2);
    }
}
