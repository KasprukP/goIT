package ExercisesJava;

public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        return name.toLowerCase().contains("a") && name.toLowerCase().contains("o");
    }

    public String getNameCode(String name) {

        return name.substring(0, 1).concat(name.substring(name.length() - 1)).substring(0, name.length() > 1 ? 2 : 1).toUpperCase();

    }

    public boolean isInvisibleName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            return name.isEmpty();
        } else if (name.length() != 0) {
            return true;
        }
        return name.isEmpty();

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
        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"a\") = " + nameCode);
    }
}