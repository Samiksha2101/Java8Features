package org.example.stream;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Employee>list = new ArrayList<>(Arrays.asList(
                new Employee(1000, "Samiksha"),
                new Employee(2000, "Saurabh"),
                new Employee(3000, "Shivam"),
                new Employee(4000, "Shivendra"),
                new Employee(5000, "Shiva")
        ));
        List<Employee> list1 = list.stream().sorted((o1,o2)->o2.getSalary()-o1.getSalary()).limit(3).collect(Collectors.toList());
        System.out.println("after stream: "+list1);
        for(int i=0;i<list.size();i++){ //using index based loop hence no concurrent modification exception
            System.out.println("i = "+i);
            if(i==2)list.add(new Employee(6000,"hi"));
        }
        System.out.println("list after adding new employee "+list);
        for(Employee e:list){
            System.out.println("employee is "+e);
//            if(e.getSalary()==2000)list.remove(e); //concurrent modification exception
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1, 1000);
        map.put(2, 2000);
        map.put(3, 3000);
        map.put(4, 4000);
        map.put(5, 5000);

        Iterator<Map.Entry<Integer,Integer>>it= map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Integer> entry= it.next();
            System.out.println("key is "+entry.getKey()+" and value is "+entry.getValue());
            if(entry.getKey()==3){
//                map.put(6,6000);
//                map.remove(5);
                it.remove();
            }
            System.out.println("key is "+entry.getKey()+" and value is "+entry.getValue());

        }
        System.out.println("map after removing 3rd element "+map);

        List<String> list2 = new CopyOnWriteArrayList<>(Arrays.asList("Samiksha", "Saurabh", "Shivam", "Shivendra", "Shiva"));
        Iterator<String> it1 = list2.iterator();
        while(it1.hasNext()){
            String s = it1.next();
            System.out.println("string is "+s);
            if(s.equals("Saurabh")){
                System.out.println("about to call remove");
//                it1.remove();//will give UnSupportedOperationException Because the iterator works on a snapshot
                list2.remove(s);
            }
        }
        System.out.println("list after adding new employee "+list2);
    }
}
