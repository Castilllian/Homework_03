import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        ArrayList<String> listData = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ФИО, Возраст, Пол: ");

        while (true) {
            String str = in.nextLine();
            if (str.equals("Exit")) break;
            String[] tmp = str.split(",");
            String[] fio = tmp[0].split(" ");
            String itogStr = String.format("%s %s %s.%s.%s", tmp[1], fio[0], fio[1].toUpperCase().charAt(0), fio[2].toUpperCase().charAt(0), tmp[2]);
            listData.add(itogStr);
        }

        Collections.sort(listData, (s1, s2) -> Integer.compare(Integer.parseInt(s1.split(" ")[1]), Integer.parseInt(s2.split(" ")[1])));

        for (String data : listData) {
            System.out.println(data);
        }
    }
}