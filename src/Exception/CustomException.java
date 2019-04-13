//自定义异常
package Exception;

class WrongInputException extends Exception{
    WrongInputException(String s){
        super(s);
    }
}
class Input{
    void method() throws WrongInputException{
        throw new WrongInputException("Wrong input");

    }
}

public class CustomException {
    public static void main(String[] args){
        try{
            new Input().method();
        }catch(WrongInputException e){
            System.out.println(e.getMessage());
        }
    }
}
