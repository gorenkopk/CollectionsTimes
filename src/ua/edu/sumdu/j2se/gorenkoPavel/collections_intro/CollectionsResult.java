package ua.edu.sumdu.j2se.gorenkoPavel.collections_intro;

public class CollectionsResult {
    private String name;
    private int add;
    private int remove;
    private int getElement;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }

    public int getRemove() {
        return remove;
    }

    public void setRemove(int remove) {
        this.remove = remove;
    }

    public int getGetElement() {
        return getElement;
    }

    public void setGetElement(int getElement) {
        this.getElement = getElement;
    }

    public String toString() {
        String line = getName();
        for (int i = (getName().length()); i < 10; i++) {
            line = line + " ";
        }

        String nums = Integer.toString(getAdd());
        for (int i = (nums.length()); i < 10; i++) {
            line = line + " ";
        }
        line = line + nums;

        nums = Integer.toString(getRemove());
        for (int i = (nums.length()); i < 10; i++) {
            line = line + " ";
        }
        line = line + nums;

        nums = Integer.toString(getGetElement());
        for (int i = (nums.length()); i < 10; i++) {
            line = line + " ";
        }
        line = line + nums;

        return line;
    }
}
