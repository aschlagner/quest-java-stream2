import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Shield {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Phil Coulson");
        names.add("Melinda May");
        names.add("Daisy Johnson");
        names.add("Leopold Fitz");
        names.add("Jemma Simmons");

        // TODO 1 : map names to agents list
        // with "Function" (3.)
        // -> https://github.com/bastienwcs/quest-java-stream2-demo/blob/master/Step5.java
        //    "nur umgedreht..."
        List<Agent> agents1 = new ArrayList<>();
        agents1 = names.stream()
            .map(new Function<String, Agent>() {
                @Override
                public Agent apply(String agent) {
                    String[] firstLastName = agent.split(" ");
                    return new Agent(firstLastName[0], firstLastName[1]);
                }
            })
            .collect(Collectors.toList());

        showAgents(agents1);
        
        // TODO 2 : map names to agents list
        // with Lambda (4.)
        // -> https://mkyong.com/java8/java-8-streams-map-examples/
        //    3.3 List of objects -> List of other objects
        List<Agent> agents2 = new ArrayList<>();
        agents2 = names.stream()
            .map(agent -> {
                String[] firstLastName = agent.split(" ");
                return new Agent(firstLastName[0], firstLastName[1]);
            })
            .collect(Collectors.toList());

        showAgents(agents2);
    }

    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}