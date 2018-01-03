package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Paint;

import java.util.ArrayList;
import java.util.Arrays;

public class Controller {
  boolean newTurn=true;
  int[][] intArray=new int[][]{{0,0,0},{0,0,0},{0,0,0}};


    @FXML
    Button i1;
    @FXML
    Button i2;
    @FXML
    Button i3;
    @FXML Button j1,j2,j3;
    @FXML Button k1,k2,k3;





    @FXML protected void setI1() {swapTurn(i1,0,0); }
    @FXML protected void setI2() { swapTurn(i2,0,1); }
    @FXML protected void setI3() { swapTurn(i3,0,2);}


    @FXML protected void setJ1(){swapTurn(j1,1,0);}
    @FXML protected void setJ2(){swapTurn(j2,1,1);}
    @FXML protected void setJ3(){swapTurn(j3,1,2);}


    @FXML protected void setK1(){swapTurn(k1,2,0);}
    @FXML protected void setK2(){swapTurn(k2,2,1);}
    @FXML protected void setK3(){swapTurn(k3,2,2);}



 void swapTurn(Button button,int x,int y)
    {
        Boolean Turn = newTurn;

        if (Turn)
        {
            button.setText("X");
            button.setTextFill(Paint.valueOf("red"));
           newTurn=false;
           intArray[x][y]=1;
        /**  for (int[] arr:intArray)
              System.out.println(Arrays.toString(arr));*/


        }
        else
        {
            button.setText("O");
            button.setTextFill(Paint.valueOf("green"));
          newTurn =true;
            intArray[x][y]=2;
           /** for (int[] arr:intArray)
                System.out.println(Arrays.toString(arr));*/

        }
        check();
    }
    void check() //TODO shrink this method.
    {
        //Check for horizontal match X

        if ((intArray[0][0] & intArray[0][1]) == 1)
            if ((intArray[0][1] & intArray[0][2]) == 1)
                System.out.println("X Win");
        if ((intArray[1][0] & intArray[1][1]) == 1)
            if ((intArray[1][1] & intArray[1][2]) == 1)
                System.out.println("X Win");
        if ((intArray[2][0] & intArray[2][1]) ==1 )
            if ((intArray[2][1] & intArray[2][2]) == 1)
                System.out.println("X Win");

        //Check for horizontal match O
        if ((intArray[0][0] & intArray[0][1]) == 2)
            if ((intArray[0][1] & intArray[0][2]) == 2)
                System.out.println("Y Win");
        if ((intArray[1][0] & intArray[1][1]) == 2)
            if ((intArray[1][1] & intArray[1][2]) == 2)
                System.out.println("Y Win");
        if ((intArray[2][0] & intArray[2][1]) ==2)
            if ((intArray[2][1] & intArray[2][2]) == 2)
                System.out.println("Y Win");

        //Check for Vertical match X

        if ((intArray[0][0] & intArray[1][0]) == 1)
            if ((intArray[1][0] & intArray[2][0]) == 1)
                System.out.println("X Win");
        if ((intArray[0][1] & intArray[1][1]) == 1)
            if ((intArray[1][1] & intArray[2][1]) == 1)
                System.out.println("X Win");
        if ((intArray[0][2] & intArray[1][2]) == 1)
            if ((intArray[1][2] & intArray[2][2]) == 1)
                System.out.println("X Win");
//Check for Vertical match O
        if ((intArray[0][0] & intArray[1][0]) == 2)
            if ((intArray[1][0] & intArray[2][0]) == 2)
                System.out.println("Y Win");
        if ((intArray[0][1] & intArray[1][1]) == 2)
            if ((intArray[1][1] & intArray[2][1]) == 2)
                System.out.println("Y Win");
        if ((intArray[0][2] & intArray[1][2]) == 2)
            if ((intArray[1][2] & intArray[2][2]) == 2)
                System.out.println("Y Win");


        //Check for Diagonal match X
        if ((intArray[0][0] & intArray[1][1]) == 1)
            if ((intArray[1][1] & intArray[2][2]) == 1)
                System.out.println("X Win");
        if ((intArray[0][2] & intArray[1][1]) == 1)
            if ((intArray[1][1] & intArray[2][0]) == 1)
                System.out.println("X Win");

        //Check for Diagonal match O
        if ((intArray[0][0] & intArray[1][1]) == 2)
            if ((intArray[1][1] & intArray[2][2]) == 2)
                System.out.println("O Win");
        if ((intArray[0][2] & intArray[1][1]) == 2)
            if ((intArray[1][1] & intArray[2][0]) == 2)
                System.out.println("O Win");



    }




}






