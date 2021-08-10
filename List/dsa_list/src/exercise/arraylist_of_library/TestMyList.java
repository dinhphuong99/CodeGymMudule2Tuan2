package exercise.arraylist_of_library;

import exercise.arraylist_of_library.MyList;

public class TestMyList{
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyList<Integer> listInteger = new MyList<Integer>(0);
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.set(0,7);
        listInteger.add(3,9);
        //listInteger.remove(1);
        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
        System.out.println("element 0: "+listInteger.get(0));

        System.out.println(listInteger.contains(7));
        System.out.println(listInteger.indexOf(15));

        listInteger.remove(1);
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println(listInteger.get(i));
        }

        System.out.println("Clone");
        MyList listInteger1 = listInteger.clone();
        for (int i = 0; i < listInteger1.size(); i++) {
            System.out.println(listInteger1.get(i));
        }

    }
}
