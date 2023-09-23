import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Random;



public class phoneBook {
    public static void main(String[] args) {
        
        HashMap<String, ArrayList<String>> val = new HashMap<>();
        // Заполняем справочник рандомными номерами
        for (int i = 0; i < 10; i++) {
            String item = String.valueOf(names.values()[new Random().nextInt(names.values().length)]);
            String number = String.valueOf(new Random().nextInt(100000,1000000));
            ArrayList<String> phone = new ArrayList<>();
            if(val.containsKey(item)) {
                val.get(item).add(number);
            } else {
                phone.add(number);
                val.put(item, phone);
            }
        }
 
        ArrayList<Map.Entry<String, ArrayList<String>>> sorted = new ArrayList<>(val.entrySet());
        sorted.sort((e1, e2) -> e2.getValue().size() - e1.getValue().size());

        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry <String, ArrayList<String>> person : sorted) {
                result.add(person.getKey() + ": " + person.getValue());
        }
        System.out.println(result);            

    }
}
