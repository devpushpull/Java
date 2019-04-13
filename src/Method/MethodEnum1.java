package Method;

enum Car{
    lamborghini,tata,audi,fiat,honda
}

public class MethodEnum1 {
    public static void main(String[] args) {
        Car c;
        c = Car.tata;
        switch (c){
            case lamborghini:
                System.out.println("你选择了lamborghini！");
                break;
            case tata:
                System.out.println("你选择了tata！");
                break;
            case audi:
                System.out.println("你选择了audi！");
                break;
            case fiat:
                System.out.println("你选择了fiat！");
            case honda:
                System.out.println("你选择了honda！");
                break;
            default:
                System.out.println("我不知道你选择的是什么车型。");
                break;
        }
    }
}
