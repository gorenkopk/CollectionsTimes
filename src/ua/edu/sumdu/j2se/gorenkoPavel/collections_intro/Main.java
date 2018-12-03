package ua.edu.sumdu.j2se.gorenkoPavel.collections_intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        /* Reading from console number of elements */
        System.out.println("Please, type number of elements to generate:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int count = Integer.parseInt(s);

        /* Variables for Time */
        long t1;
        long t2;
        int res;

        /* Generating objects according to count */
        Data data = new Data();
        data.generateObjects(count);

        /* ArrayList test methods */
        CollectionsResult result0 = new CollectionsResult();
        result0.setName("ArrayList");
        List<UserData> arrayList = new ArrayList<UserData>();

        t1 = System.currentTimeMillis();
        Utils.addElementsToList(arrayList, data.arrayData, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result0.setAdd(res);

        t1 = System.currentTimeMillis();
        Utils.getElementsFromList(arrayList, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result0.setGetElement(res);

        t1 = System.currentTimeMillis();
        Utils.removeElementsFromList(arrayList, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result0.setRemove(res);

        data.results.add(result0);

        /* LinkedList test methods */
        CollectionsResult result1 = new CollectionsResult();
        result1.setName("LinkedList");
        List<UserData> linkedList = new LinkedList<UserData>();

        t1 = System.currentTimeMillis();
        Utils.addElementsToList(linkedList, data.arrayData, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result1.setAdd(res);

        t1 = System.currentTimeMillis();
        Utils.getElementsFromList(linkedList, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result1.setGetElement(res);

        t1 = System.currentTimeMillis();
        Utils.removeElementsFromList(linkedList, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result1.setRemove(res);

        data.results.add(result1);

        /* HashSet test methods */
        CollectionsResult result2 = new CollectionsResult();
        result2.setName("HashSet");
        Set<UserData> hashSet = new HashSet<UserData>();

        t1 = System.currentTimeMillis();
        Utils.addElementsToSet(hashSet, data.arrayData, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result2.setAdd(res);

        t1 = System.currentTimeMillis();
        Utils.getElementsFromSet(hashSet);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result2.setGetElement(res);

        t1 = System.currentTimeMillis();
        Utils.removeElementsFromSet(hashSet, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result2.setRemove(res);

        data.results.add(result2);

        /* TreeSet test methods */
        CollectionsResult result3 = new CollectionsResult();
        result3.setName("TreeSet");
        Set<UserData> treeSet = new TreeSet<UserData>();

        t1 = System.currentTimeMillis();
        Utils.addElementsToSet(treeSet, data.arrayData, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result3.setAdd(res);

        t1 = System.currentTimeMillis();
        Utils.getElementsFromSet(treeSet);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result3.setGetElement(res);

        t1 = System.currentTimeMillis();
        Utils.removeElementsFromTreeSet(treeSet, data.arrayData, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result3.setRemove(res);

        data.results.add(result3);

        /* HashMap test methods */
        CollectionsResult result4 = new CollectionsResult();
        result4.setName("HashMap");
        Map<Date, UserData> hashMap = new HashMap<Date, UserData>();

        t1 = System.currentTimeMillis();
        Utils.addElementsToMap(hashMap, data.arrayData, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result4.setAdd(res);

        t1 = System.currentTimeMillis();
        Utils.getElementsFromMap(hashMap, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result4.setGetElement(res);

        t1 = System.currentTimeMillis();
        Utils.removeElementsFromMap(hashMap, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result4.setRemove(res);

        data.results.add(result4);

        /* TreeMap test methods */
        CollectionsResult result5 = new CollectionsResult();
        result5.setName("TreeMap");
        TreeMap<Integer, UserData> treeMap = new TreeMap<Integer, UserData>();

        t1 = System.currentTimeMillis();
        Utils.addElementsToTreeMap(treeMap, data.arrayData, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result5.setAdd(res);

        t1 = System.currentTimeMillis();
        Utils.getElementsFromMap(treeMap, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result5.setGetElement(res);

        t1 = System.currentTimeMillis();
        Utils.removeElementsFromMap(treeMap, count);
        t2 = System.currentTimeMillis();
        res = ((int)  (t2 - t1));
        result5.setRemove(res);

        data.results.add(result5);

        /* Print */
        data.printTable();

        
    }
}
