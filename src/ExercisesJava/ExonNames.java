package ExercisesJava;

public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        String lowerCaseName = name.toLowerCase();
        return lowerCaseName.contains("a") || lowerCaseName.contains("o");
    }

    public String getNameCode(String name) {
        String code = name.charAt(0) + String.valueOf(name.charAt(name.length() - 1));
        return code.toUpperCase();
    }

    public boolean isMoneyName(String name) {
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);

        boolean firstLetterOk = firstLetter >= '0' && firstLetter <= '9';
        boolean lastLetterOk = lastLetter >= '0' && lastLetter <= '9';

        return firstLetterOk && lastLetterOk;
    }

    public boolean isInvisibleName(String name) {
        return name.trim().isEmpty();
    }

    public String makeNamePositive(String name) {
        return name
                .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a","5");

    }

    public String makeNameClean(String name) {
        String a="CLEAN";
        String b = "CLEAN";
return a+name.trim()+b;
    }
    public String makeHalfOfName(String name){

        return name.substring(1,name.length()/2);
    }

    public String encode(String name){
        return "NOTFORYOU"+
                name
                .replace("e", "1")
                .replace("u", "2")
                .replace("i", "3")
                .replace("o", "4")
                .replace("a","5") +"YESNOTFORYOU" ;

    }
    public String decode(String name){
        String nameDecode = name.replace("YESNOTFORYOU","");
        String nameDecode1 = nameDecode.replace("NOTFORYOU","");
        return nameDecode1
                .replace("1", "e")
                .replace("2", "u")
                .replace("3", "i")
                .replace("4", "o")
                .replace("5","a");
    }




    //Test output
    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        //Should be "exor BIGO"
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);

        //Should be true
        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);

        //Should be BA
        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);

        //Should be true
        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);

        //Should be true
        boolean isInvisible = names.isInvisibleName(" ");
        System.out.println("names.isInvisibleName(\" \") = " + isInvisible);

        //Should be YesMont
        String positive = names.makeNamePositive("NoMont");
        System.out.println("names.makeNamePositive(\"NoMont\") = " + positive);

        //Should be CLEANdirtyCLEAN
        String cleanName = names.makeNameClean(" dirty ");
        System.out.println("names.makeNameClean(\" dirty \") = " + cleanName);
    }
}