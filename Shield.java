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
        // -> https://github.com/bastienwcs/quest-java-stream2-demo/blob/master/Step5.java
        //    "nur umgedreht..."
        List<Agent> agents = new ArrayList<>();

        agents = names.stream()
            .map(new Function<String, Agent>() {
                @Override
                public Agent apply(String agent) {
                    String[] firstLastName = agent.split(" ");
                    return new Agent(firstLastName[0], firstLastName[1]);
                }
            })
            .collect(Collectors.toList());
        
        showAgents(agents);
    }

    // don't touch anything here !
    private static void showAgents(List<Agent> agents) {
        System.out.println("\nAgents:");
        for (Agent agent : agents) {
            System.out.println(agent.getLastName() + " " + agent.getFirstName());
        }
    }
}