//  Вам нужно написать класс имитирующий работу hashset и хранящий int

import java.util.*;

public class Task_4 {

    public static void main(String[] args) {
        MySet myobj = new MySet();
        System.out.println(myobj.add(1));
        System.out.println(myobj.add(2));
        System.out.println(myobj.add(1));
        Iterator<Integer> iterator= myobj.iterator();
        while(iterator.hasNext()){
            int i = iterator.next();
            System.out.println(i);
        }
    }

}

class MySet {
    //private List <Integer> mylist = new ArrayList<>();
    private HashMap<Integer, Object> myDB = new HashMap<>();
    private static final Object MYOBJ = new Object();

    //метод, который добавляет в mylist новый элемент:
    public boolean add(int elem){
//        if (!mylist.contains(elem)){
//            mylist.add(elem);
//            return true;
//        }

        return myDB.put(elem, "qwerty")==null;
    }
    //метод, который удаляет элемент:
    public boolean del(int elem){
        return myDB.remove(elem) == MYOBJ;
    }
    // метод проверки наличия элементов в списке
    public boolean isEmpty(){
        return myDB.isEmpty();
    }
    public boolean contains(int element){
        return myDB.containsKey(element);
    }
    // метод возврата значения по индексу
    public int getValue(int id){
        Object[] a = myDB.keySet().toArray();
        return (int) a[id];
    }
    public Iterator<Integer> iterator(){
        return myDB.keySet().iterator();
    }
}
