import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    public static void main(String[] args){

        Field field = new Field(9, 9, 10);
        field.initField();
        field.showField();
        System.out.print(field.randNumbersList);



    }
}
