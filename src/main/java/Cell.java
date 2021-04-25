public class Cell {

    public Cell() {
        this.isMine = false;
        this.id = ++ cellsCreated;
    }

    private static int cellsCreated = 0;
    private Boolean isMine;
    private final int id;

    public Boolean getMine() {
        return isMine;
    }

    public void setMine(Boolean mine) {
        isMine = mine;
    }

    public int getId() {
        return id;
    }

}
