import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManager {

    // Reuse Bogie class from UC7
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("=================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 30));

        // FILTER using Stream (capacity > 60)
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered result
        System.out.println("Bogies with capacity > 60:\n");

        for (Bogie b : filtered) {
            System.out.println(b.name + " - " + b.capacity);
        }

        System.out.println("\nUC8 operations completed successfully...");
    }
}