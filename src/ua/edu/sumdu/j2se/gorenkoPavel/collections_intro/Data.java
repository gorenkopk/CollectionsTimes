package ua.edu.sumdu.j2se.gorenkoPavel.collections_intro;

import java.util.ArrayList;

class Data {

    public UserData[] arrayData;
    public ArrayList<CollectionsResult> results = new ArrayList<CollectionsResult>();

    public void generateObjects(int count) {
        arrayData = null;
        arrayData = new UserData[count];

        for (int i = 0; i < count; i++) {
            arrayData[i] = new UserData(i, "data" + i);
        }
        System.out.println("Process of generating objects has been finished.");
    }
    
    public void printTable() {
        Utils.printLine();
        Utils.printHeader();
        Utils.printLine();
        for (int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i));
            Utils.printLine();
        }
    }
}