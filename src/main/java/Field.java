import java.util.ArrayList;
import java.util.Random;

public class Field {

    private Cell[][] field;
    private int numbersOfRows;
    private int numbersOfCols;
    private int numbersOfMines;

    public ArrayList<Integer> randNumbersList;
    private Random rand;
    private int randNumber;

    public Field(int numbersOfRows, int numbersOfCols, int numbersOfMines){
        this.numbersOfRows = numbersOfRows;
        this.numbersOfCols = numbersOfCols;
        this.numbersOfMines = numbersOfMines;
        this.field = new Cell[numbersOfRows][numbersOfCols];
    }

    void initField(){
        randNumbersList = new ArrayList<>();
        rand = new Random();
        int counter = 0;
        while(counter < numbersOfMines ){
            randNumber = rand.nextInt(numbersOfCols * numbersOfRows - 1);
            if(!randNumbersList.contains(randNumber)){
                randNumbersList.add(randNumber);
                counter ++;
            }
        }

        for (int row = 0; row < this.numbersOfRows; row++) {
            for (int col = 0; col < this.numbersOfCols; col++) {
                this.field[row][col] = new Cell();
                if(randNumbersList.contains(this.field[row][col].getId())){
                    this.field[row][col].setMine(true);
                }
            }
        }
    }

    void showField(){
        for (int row = 0; row < this.numbersOfRows; row++) {
            for (int col = 0; col < this.numbersOfCols; col++) {
                System.out.print(this.field[row][col].showCell() + " ");
            }
            System.out.println("");
        }
    }

}
