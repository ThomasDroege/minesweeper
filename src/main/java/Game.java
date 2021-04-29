import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.print("How many mines do you want to have on the field?");
        int numbersOfMines = sc.nextInt();

        Field field = new Field(9, 9, numbersOfMines);
        field.initField();
        field.showField();
        System.out.print(field.randNumbersList);




    }
}
