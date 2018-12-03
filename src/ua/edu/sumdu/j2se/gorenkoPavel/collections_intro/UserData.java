package ua.edu.sumdu.j2se.gorenkoPavel.collections_intro;

class UserData implements Comparable<UserData> {

    private int index;
    private String title;

    UserData (int index, String title) {
        this.index = index;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getIndex() {
        return index;
    }

    public String toString() {
        return String.format("[Index: %d, Title: %s]", getIndex(), getTitle());
    }
    
    public int compareTo(UserData s) {
        return title.compareTo(s.getTitle());
    }
}
