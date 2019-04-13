package Method;

public class MethodContinue {
    public static void main(String[] args) {
        StringBuffer searchstr = new StringBuffer("hello how are you. ");
        int length = searchstr.length();
        int cont = 0;
        for (int i = 0; i < length; i++) {
            if(searchstr.charAt(i)!='h')
                continue;
            cont++;
            searchstr.setCharAt(i,'h');
        }
        System.out.println("发现第"+cont+"个h字符");
        System.out.println(searchstr);
    }
}
