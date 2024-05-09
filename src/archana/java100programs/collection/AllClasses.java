package archana.java100programs.collection;

import java.util.*;

public class AllClasses {
    public void ArrayList(){
        ArrayList<String > list = new ArrayList<>();
        list.add("Archana");
        list.add("Shubham");
        list.add("Aditya");
        list.add("Sadanand");
        Iterator itr = list.listIterator();
        while (itr.hasNext()){
            System.out.println( itr.next());
        }
        System.out.println("_______________________");
    }
    public void LinkedList(){
      LinkedList<Integer> linkList = new LinkedList<>();
      linkList.add(20);
      linkList.add(30);
      linkList.add(40);
      linkList.add(50);
      linkList.add(60);
      Iterator itr = linkList.listIterator();
      while (itr.hasNext()){
          System.out.println(itr.next());
      }
        System.out.println("_______________________");
    }
    public void ArrayListUsingList(){
        List<String> list =new ArrayList<String>();
        list.add("Radha");
        list.add("Rahul");
        list.add("Rajesh");
        list.add("Rakul");
       Iterator itr = list.listIterator();
       while (itr.hasNext()){
           System.out.println(itr.next());
       }
        //By using ForLoop
        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("_______________________");
    }
    public void hashSet(){
        HashSet<Float> hashSet = new HashSet<>();
        hashSet.add(23.4f);
        hashSet.add(25.456f);
        hashSet.add(45.67f);
       Iterator itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("_______________________");
    }
    public void linkedHashSet(){
        LinkedList<String> lnklist = new LinkedList<>();
        lnklist.add("Ramesh");
        lnklist.add("Suresh");
        lnklist.add("Yadesh");
        for (String str :lnklist) {
            System.out.println(str);
        }
        System.out.println("_______________________");
    }
    public void priorityQueue(){
        PriorityQueue<String> prQueue = new PriorityQueue<>();
        prQueue.add("A");
        prQueue.add("B");
        prQueue.add("C");
        System.out.println(prQueue.element());//it return first element ie A
        System.out.println(prQueue.remove()); //remove first element ie  A
        System.out.println(prQueue.peek()); // Printing first element ie B
        System.out.println(prQueue.poll()); // Printing also B element
      /* Iterator itr = prQueue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/
        System.out.println("_______________________");
    }
    public void hashmap(){
        Map<Integer, String > hashMap =new HashMap<>();
        hashMap.put(1,"Archana");
        hashMap.put(2,"Radha");
        hashMap.put(3,"Tina");
        hashMap.put(4,"Ramya");
        System.out.println( hashMap.get(3));//Tina
        System.out.println(hashMap.entrySet());
       /* for (Map.Entry m : hashMap.entrySet()){
            System.out.println(m.getKey() +" ," +m.getValue());
        }*/
    }
    public static void main(String[] args) {
        AllClasses clss = new AllClasses();
       // clss.ArrayList();
       // clss.LinkedList();
       // clss.ArrayListUsingList();
       // clss.hashSet();
        // clss.linkedHashSet();
        //clss.priorityQueue();
        clss.hashmap();
    }
}
