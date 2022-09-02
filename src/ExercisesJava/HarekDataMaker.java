package ExercisesJava;

import java.util.Arrays;

public class HarekDataMaker {
    public  String aggregateSingle(String name, String age, String planet){
        return "name - "+name+","+" age - "+age+","+" planet - "+planet;
    }
    public String[] aggregateAll(String[] names, int[] ages, String[] planets){
String[] n = new String[2];
n[0]= aggregateSingle(names[0], String.valueOf(ages[0]),planets[0] );
n[1]= aggregateSingle(names[1], String.valueOf(ages[1]),planets[1] );
n[2]= aggregateSingle(names[2], String.valueOf(ages[2]),planets[2] );
        return n;
        };


    }


