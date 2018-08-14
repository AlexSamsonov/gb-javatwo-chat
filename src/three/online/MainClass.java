package three.online;

import java.util.*;

public class MainClass {
    Integer in = 10;
    Float fl = 10f;
    Double db = 10.0;
    Short sh = 10;
    Long lo = 10L;
    Byte by = 10;
    Boolean bo = true;
    Character ch = 10;

    private static final Box b1 = new Box(1, 1);
    private static final Box b2 = new Box(2, 2);
    private static final Box b3 = new Box(3, 3);
    private static final Box b4 = new Box(1, 1);

    public static void main(String[] args) {
        //objExample();
        //arrayListExample();
        //arrayListWorks();
        //setExamples();
        //treeSetExample();

//        HashMap<String, Integer> map = new HashMap<>();
//        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        System.out.println(map);

        map.put("January", 10);
        System.out.println(map);
        System.out.println(map.get("March"));
        System.out.println(map.containsKey("April"));
        System.out.println(map.containsValue(10));

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    private static void treeSetExample() {
        TreeSet<Box> set = new TreeSet<>();
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
//        System.out.println(set);
        for (Box s : set) {
            System.out.print(s + " ");
        }
    }

    private static void setExamples() {
        //HashSet<String> set = new HashSet<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("January");
        set.add("February");
        set.add("March");
        set.add("April");
        set.add("May");
        System.out.println(set.contains("March"));

        System.out.println(set);
    }

    private static void arrayListWorks() {
        //        LinkedList<Box> list = new LinkedList<>();
        ArrayList<Box> list = new ArrayList<>();
        Box b1 = new Box(1, 1);
        Box b4 = new Box(1, 1);
        list.add(b1);
        list.add(new Box(2, 2));
        list.add(new Box(3, 3));
        System.out.println(list);

        System.out.println(list.get(1));

        System.out.println(list.contains(b4));
        System.out.println(Integer.toHexString(b1.hashCode()));
        System.out.println(Integer.toHexString(b4.hashCode()));
    }

    private static void arrayListExample() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Java");
        list.add("World");

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for (String aList : list) {
            System.out.print(aList + " ");
        }
        System.out.println();

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.print(s + " ");
        }
        System.out.println();

        while (list.size() > 0)
            System.out.println(list.remove(list.size() - 1));
    }

    private static void objExample() {
        int a = 10;
        Integer a1 = 10;

        a1++;

        System.out.println(a1);
    }
}
