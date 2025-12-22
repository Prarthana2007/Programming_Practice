import java.util.*;

class processString {
    public static void main(String[] args) {

        String m = "Arun=75;Ajith=78;Raj=81";

        String[] data = m.split(";");

        String[] names = new String[data.length];
        int[] marks = new int[data.length];

        int total = 0;

        for (int i = 0; i < data.length; i++) {
            String[] s = data[i].split("=");
            names[i] = s[0];
            marks[i] = Integer.parseInt(s[1]);
            total += marks[i];
        }

        System.out.println("Students: " + Arrays.toString(names));

        Arrays.sort(marks);

        int avg = total / marks.length;

        System.out.println("Marks in ascending: " + Arrays.toString(marks));
        System.out.println("Average mark: " + avg);
    }
}
