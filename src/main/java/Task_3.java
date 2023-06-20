// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся
// имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.HashMap;

public class Task_3 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        ArrayList<String> values1 = new ArrayList<>();
        String key1 = "Danny";
        values1.add("89114445566");
        values1.add("89217778899");
        values1.add("89991112233");
        hashMap.put(key1, values1);
        String key2 = "Kelly";
        ArrayList<String> values2 = new ArrayList<>();
        values2.add("89998516644");
        values2.add("89219998877");
        hashMap.put(key2, values2);
        if (values1.size()>values2.size()){
            System.out.println(hashMap.get("Danny"));
        }
        else{
            System.out.println(hashMap.get("Kelly"));
        }
        }
    }

