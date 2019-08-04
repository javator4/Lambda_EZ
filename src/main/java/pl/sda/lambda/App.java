package pl.sda.lambda;


import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        List<String> names = Arrays.asList("Kasia", "Ania", "Zosia","Bartek");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Collections.sort(names, (String s1, String s2)-> s1.compareTo(s2)); // funkcja przekazana w argumencie
        System.out.println(names);



        Collections.sort(SampleData.membersOfTheBeatles, new Comparator<Artist>() {
            @Override
            public int compare(Artist o1, Artist o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(SampleData.membersOfTheBeatles);

    }
}
