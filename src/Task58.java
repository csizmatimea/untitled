import java.util.*;

public class Task58 {

    public static void main(String[] args) {
        List<String> restaurantList = Arrays.asList("Salt", "Platán", "42", "Essencia", "Babel", "Borkonyha", "Costes", "42", "Borkonyha", "Rumour", "Platán", "Babel", "Stand", "Rumour", "Salt", "Platán", "42", "Rumour", "Rumour", "Borkonyha", "Rumour", "Borkonyha", "Babel", "Essencia", "Salt", "Platán", "Borkonyha", "42", "Babel", "Essencia", "42", "Stand", "Salt", "Costes", "42", "42", "Costes", "Stand", "Borkonyha", "Stand", "Costes", "Babel", "Essencia", "Stand", "Salt", "Platán", "Costes", "Salt", "Platán", "Salt", "Platán", "Essencia", "Rumour", "Salt", "Platán", "Rumour", "Stand", "Salt", "Essencia", "Babel", "Babel", "Essencia", "Rumour", "Essencia", "Salt", "Platán", "Borkonyha", "Stand", "Essencia", "Rumour", "Borkonyha", "Costes", "Babel", "Costes", "Salt", "Platán", "Essencia", "Stand", "Costes", "Borkonyha", "Essencia", "42", "Essencia", "42", "Stand", "Rumour", "Salt", "Platán", "Rumour", "Borkonyha", "Stand", "Babel", "Rumour", "Stand", "Salt", "Essencia", "Costes", "Costes", "42", "42", "Salt", "Platán", "Essencia", "Babel", "Costes", "Rumour", "Costes", "Stand", "Rumour", "Essencia", "Borkonyha", "Salt", "Platán", "Rumour", "Borkonyha", "42", "Babel", "Stand", "42", "Costes", "42", "Salt", "42", "Salt", "Essencia", "Borkonyha", "Essencia", "Borkonyha", "Rumour"
        );
        HashMap<String, Integer> restaurantMap = new HashMap<>();
        Map.Entry<String,Integer> maxvolue = null;

        for (String restaurantTitle : restaurantList) {
            if (restaurantMap.containsKey(restaurantTitle)) {
                int originalCount = restaurantMap.get(restaurantTitle);
                restaurantMap.put(restaurantTitle, originalCount + 1);
            } else {
                restaurantMap.put(restaurantTitle, 1);
            }

            if (restaurantMap.containsKey("Essencia"))
                restaurantMap.remove(restaurantTitle);

            int newStandVote= restaurantMap.get("Stand") +11;
            restaurantMap.put("Stand", newStandVote);

        }


        for (Map.Entry mapElement : restaurantMap.entrySet()) {
            System.out.println(mapElement.getKey() + " - " + mapElement.getValue() + " szavazat");

        }
        System.out.println("Maximum price is: "+maxvolue.getValue());

        System.out.println("Number of different restaurants: " + restaurantMap.size());
        System.out.println("Total number of vote : " + restaurantList.size());


    }
}