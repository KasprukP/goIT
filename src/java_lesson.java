public class java_lesson {
    public static void main(String[] args) {
        System.out.println("Hello ");

        int vocationDays = 12;
        System.out.println(vocationDays);
        int x =12;
        int a = 4;

        double y = Math.pow (x,a);
        System.out.println(y);

        double z = Math.sqrt(4);
        System.out.println("Квадрат "+ z );

        String greeting = "hello";
        String s = greeting.substring(0,4);
        System.out.println(s);

        String expeletive = "Expeletive";
        String PG13 = "Deleted";
        String message = expeletive + PG13;
        System.out.println(message);

        String all= String.join("/","S","M","l","XL");
        System.out.println(all);


        greeting = greeting.substring(0,3) + "p!";
        System.out.println(greeting);
    }
}
