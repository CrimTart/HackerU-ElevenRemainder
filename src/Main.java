public class Main {
    //abc = 11*q + a^2 + b^2 + c^2 (a,b,c are digits)
    public static void main(String[] args){
        for (int i = 100; i < 310; i++) {
            int c = i%10;
            int b = (i/10)%10;
            int a = i/100;
            if (i%11 == a*a + b*b + c*c) {
                int q = (i - a*a - b*b - c*c)/11;
                System.out.println(i + " = " + q + "*11 +" + a + "^2 + " + b + "^2 + " + c + "^2");
            }
        }
    }
}
