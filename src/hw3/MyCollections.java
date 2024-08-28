package hw3;


public class MyCollections {
    public static <T extends Comparable<? super T>> void sort(MyList<T> list){
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < list.getSize() - 1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0){
                    isSorted = false;
                    T temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
    }
}
