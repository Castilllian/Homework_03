import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(11));
        }
        System.out.println(list);
        //Среднее значение списка
        int sum = 0;
        for(int n: list){
            sum +=n;
        }
        int average = sum/ list.size();
        System.out.println("Среднее значение:" + average);
        // удаление четных чисел
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
            else {
                i++;
            }
        }
        System.out.println("Отсортированный список нечетных чисел: "+list);
        // Найти минимальное значение
        ArrayList<Integer> list1 = new ArrayList<>(list);
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println("Минимальное значение списка: "+list1.get(0));
        // Найти максимальное значение
        System.out.println("Максимальное значение списка: "+ list1.get(list1.size()-1));
        }}

