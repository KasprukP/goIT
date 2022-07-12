package udemyLessons.HomeworkLesson17;

public class Test2 {
    public static boolean ravenstvo (StringBuilder sb1, StringBuilder sb2){
        boolean result = true;
        if (sb1.length()== sb2.length()){
            for (int i=0;i< sb2.length();i++){
                if (sb1.charAt(i)!=sb2.charAt(i)){
                    result= false;
                    break;
                }
            }
        }else {
            result=false;
        }
        return result;

    }
}
class LessonRavenstvo{
    public static void main(String[] args) {


    StringBuilder sb3 = new StringBuilder("Hello");
    StringBuilder sb4 = new StringBuilder("Hello");
    StringBuilder sb5 = new StringBuilder("hello");
    boolean a= Test2.ravenstvo (sb3,sb4);
        System.out.println(a);

}
}