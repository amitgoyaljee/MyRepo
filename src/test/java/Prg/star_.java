package Prg;

import org.testng.annotations.Test;

public class star_ {
    @Test
    public void rightStar() {
        int row = 6, i, j;
        for (i = 0; i < row; i++) {
            //or
           // for (j = 0 ; j <= i; j++) {
                for (j = i ; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * * *
    @Test
    public void leftStar() {
        int row = 5, i, j;
        for (i = 0; i <= row; i++) {
            for (j = 2 * (row - i); j >= 0; j--) {  //// no need 2* if->System.out.print("* ");without space-> System.out.print("*");
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//*
//         * *
//       * * *
//     * * * *
//   * * * * *
// * * * * * *


    @Test
    public void leftStarwitoutSpace() {
        int row = 5, i, j;
        for (i = 0; i <= row; i++) {
//            for (j = (row - i); j >= 0; j--) {  //// no need 2* if->System.out.print("* ");without space-> System.out.print("*");
//                System.out.print(" ");
//            }
            for (j = 0;j <= (row - i); j++) {  //// no need 2* if->System.out.print("* ");without space-> System.out.print("*");
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
