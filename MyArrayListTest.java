public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<Integer>();
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 6);
        myList.add(3, 7);
        myList.add(4, 10);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("element: " + i+": " + myList.get(i));
        }
        myList.remove(2);
        System.out.println("before delete: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("element: " + i+": " + myList.get(i));
        }
        System.out.println(" check element in list");
        System.out.println(myList.contains(2));
        System.out.println("index element: "+myList.indexOf(7));
        myList.clear();
    }
}
