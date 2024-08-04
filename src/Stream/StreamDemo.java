package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class StreamDemo {

    static List<Movies> movies = new ArrayList<>();


    static int [] number = {1,2,3,4,5};

    public static void show(){
        Collections.addAll(movies, new Movies("Humter", 25),new Movies("Old man", 10),new Movies("Sheperd", 35));

        //Imperative programmming
        int count = 0;
        for(var movie: movies){
            if (movie.getLikes() > 10){
                count++;
            }

        }
        System.out.println(count);
        // declarative programming

        var count1 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();
        System.out.println(count1);
        // converting array to stream
        Arrays.stream(number)
              .forEach(n -> System.out.println(n));
        // create stream using Stream object
        Stream.of(1,2,3,4,5).forEach(n -> System.out.println(n));
        // Generate random number from stream
        var nums = Stream.generate(() -> Math.random());
        nums
                .limit(3)
                .forEach(n -> System.out.println(n));

        //get a string from a list





    }
}
