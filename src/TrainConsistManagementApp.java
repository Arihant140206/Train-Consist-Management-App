import java.util.LinkedHashSet;
import java.util.Set;

public class train_consist_management_app {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        trainFormation.add("Sleeper");

        System.out.println("\nFinal Train Formation (No duplicates, Order preserved):");
        System.out.println(trainFormation);

    }
}