package ua.edu.sumdu.j2se.gorenkoPavel.collections_intro;

import java.util.*;

class Utils {

    public static void addElementsToList(List list, UserData[] arrayData, int count) {
        for (int i = 0; i < count; i++) {
            list.add(arrayData[i]);
        }
    }

    public static void removeElementsFromList(List list, int count) {
        for (int i = count; i > 0; i--) {
            list.remove(i - 1);
        }
    }

    public static void getElementsFromList(List list, int count) {
        for (int i = 0; i < count; i++) {
            list.get(i);
        }
    }

    public static void addElementsToSet(Set set, UserData[] arrayData, int count) {
        for (int i = 0; i < count; i++) {
            set.add(arrayData[i]);
        }
    }

    public static void removeElementsFromSet(Set set, int count) {
        for (int i = count; i > 0; i--) {
            set.remove(i - 1);
        }
    }

    public static void removeElementsFromTreeSet(Set set, UserData[] arrayData, int count) {
        for (int i = count; i > 0; i--) {
            set.remove(arrayData[i-1]);
        }
    }

    public static void getElementsFromSet(Set set) {
        Iterator<UserData> it = set.iterator();
        while(it.hasNext()){
            it.next();
        }
    }

    public static void addElementsToMap(Map map, UserData[] arrayData, int count) {
        for (int i = 0; i < count; i++) {
            map.put(new Date(), arrayData[i]);
        }
    }

    public static void addElementsToTreeMap(TreeMap map, UserData[] arrayData, int count) {
        for (int i = 0; i < count; i++) {
            map.put(i, arrayData[i]);
        }
    }

    public static void getElementsFromMap(Map map, int count){
        for (int i = 0; i < count; i++) {
            map.get(i);
        }
    }

    public static void removeElementsFromMap(Map map, int count){
        for (int i = 0; i < count; i++) {
            map.remove(i);
        }
    }


    public static void printLine() {
        System.out.println("---------------------------------------------");
    }

    public static void printHeader() {
        System.out.println("                 add       del       get");
    }

}