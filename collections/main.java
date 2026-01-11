package main.java;
import java.util.*;

public class Collections{

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Prarthana");
        list.add("Dhanya");
        list.add("Chintu");
        list.add("Prarthana");
       
        HashSet<String> set= new HashSet<>();
        set.addAll(list);

        System.out.println("Total no. of names in the list:"+list.size());
        System.out.println("Total no. of names in the set:"+set.size());
        String searchName = "Dhanya";

        if(set.contains(searchName)) {
            System.out.println(searchName+ " is in the set");
        } else {
            System.out.println(searchName+" is not in the set");
        }
    }
}
