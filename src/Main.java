import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    //abc = 11*q + a^2 + b^2 + c^2 (a,b,c are digits)
    public static void main(String[] args){
        /*Before Java 8*/
        ArrayList<Integer> nonfunc = new ArrayList<>();
        for (int i = 100; i <= 310; i++) {
            int c = i%10;
            int b = (i/10)%10;
            int a = i/100;
            if (i%11 == a*a + b*b + c*c) {
                int q = (i - a*a - b*b - c*c)/11;
                System.out.println(i + " = " + q + "*11 +" + a + "^2 + " + b + "^2 + " + c + "^2");
                nonfunc.add(i);
            }
        }

        /*After Java 8*/
        ArrayList<Integer> func = new ArrayList<>();
        for (int i=100; i < 310; i++) {
            func.add(i);
        }
        List res = func.stream().filter((Integer i) -> {int c = i%10, b = (i/10)%10, a = i/100; return (i%11 == a*a + b*b + c*c);}).collect(Collectors.toList());
        System.out.println(res);
    }
}