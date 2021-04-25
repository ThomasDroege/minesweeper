public class Field {

    private Cell[][] field;
    private int rowNumber;
    private int colNumber;
    private int minesNumber;

    public Field(int rowNumber, int colNumber, int minesNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.minesNumber = minesNumber;
        this.field = new Cell[rowNumber][colNumber];
    }


    void initField(){
        for (int row = 0; row < this.rowNumber; row++) {
            for (int col = 0; col < this.colNumber; col++) {
                this.field[row][col] = new Cell();
            }
        }
    }

    void showField(){
        for (int row = 0; row < this.rowNumber; row++) {
            for (int col = 0; col < this.colNumber; col++) {
                System.out.print(this.field[row][col].getMine() + " ");
            }
            System.out.println("");
        }
    }

}
