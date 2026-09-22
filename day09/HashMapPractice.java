import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<String, String> engineer =
                new HashMap<>();

        engineer.put("name", "Tong");
        engineer.put("skill", "Java");
        engineer.put("level", "Junior");

        if (engineer.containsKey("skill")) {
            System.out.println("スキル情報があります。");
        }

        for (String key : engineer.keySet()) {
            System.out.println(
                    key + ": " + engineer.get(key)
            );
        }

        for (var entry : engineer.entrySet()) {
            System.out.println(
                    entry.getKey() + ": " + entry.getValue()
            );
        }

        System.out.println(engineer.get("name"));
        System.out.println(engineer.get("skill"));
    }
}