package math;

import com.sun.org.apache.xpath.internal.SourceTree;

public class MakePyramid {

    //   Implement a large Pyramid of stars in the screen with java.
    //
    //                    *
    //                   * *
    //                  * * *
    //                 * * * *
    //                * * * * *
    //               * * * * * *

    //Start Here

    public static void main(String[] args) {

        int Y = 6;
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < Y - i; j++) {
                System.out.print(" ");
            }
            for (int R = 0; R <= i; R++) {
                System.out.print("* ");
            }
                System.out.println();
        }
    }
}









