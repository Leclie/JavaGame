package hw3;

import java.util.ArrayList;

public class MyArrayListDemo {
    public static void main(String[] args) {
        testAdd();
        testAddWithCapacity();
        testsWithWords();
    }

    private static void testsWithWords() {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("z");
        arrayList1.add("x");
        arrayList1.add("c");
        MyArrayList<String> myList3 = new MyArrayList<>(arrayList1);
        System.out.println(myList3);
        System.out.println(myList3.getSize());

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("q");
        arrayList2.add("w");
        arrayList2.add("e");
        arrayList2.add("f");
        myList3.addAll(arrayList2);
        System.out.println(myList3);
        System.out.println(myList3.getSize());

        System.out.println(myList3.get(2));

        myList3.remove(2);
        System.out.println(myList3);
        System.out.println(myList3.getSize());

        String str = "q";
        myList3.remove(str);
        System.out.println(myList3);
        System.out.println(myList3.getSize());

        MyCollections.sort(myList3);
        System.out.println(myList3);
    }

    private static void testAddWithCapacity() {
        MyArrayList<String> myList2 = new MyArrayList<>(3);
        myList2.add("a");
        myList2.add("b");
        myList2.add("c");
        myList2.add("d");
        System.out.println(myList2);
        System.out.println(myList2.getSize());
    }

    private static void testAdd() {
        MyArrayList<Integer> myList1 = new MyArrayList<>();
        myList1.add(2);
        myList1.add(1);
        myList1.add(3);
        System.out.println(myList1);
        System.out.println(myList1.getSize());
    }
}
