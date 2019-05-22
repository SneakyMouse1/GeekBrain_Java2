package lesson1;

public enum Mounth {
    January("Январь", 1),
    February("Февраль", 2);

    private String title;
    private int i;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    Mounth(String title, int i) {
        this.title = title;
        this.i = i;
    }
}
