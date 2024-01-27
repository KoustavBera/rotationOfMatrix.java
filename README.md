# rotationOfMatrix.java
rotation of matrix by 90 deg
# Rotation of Matrix in Java

This program takes a matrix as input and rotates it by a given angle. The rotation can be either clockwise or anti-clockwise. The program uses the following steps to perform the rotation:

- Create a new matrix with dimensions (2N-1)x (2N-1), where N is the size of the input matrix. This new matrix will store the rotated matrix.
- Iterate through each element of the input matrix and place it in the correct position in the rotated matrix according to the rotation formula.
- Trim the extra rows and columns from the rotated matrix to get the final output.

## How to run the program

To run the program, you need to have Java installed on your system. You can compile the program using the command:

`javac RotateMatrix.java`

Then, you can run the program using the command:

`java RotateMatrix`

The program will prompt you to enter the number of rows and columns of the matrix, the angle of rotation (in degrees), and the direction of rotation (clockwise or anti-clockwise). After that, it will display the original matrix and the rotated matrix.

## Example output

Here is an example output of the program:

Enter total rows and columns: 3 3 Enter matrix: 1 2 3 4 5 6 7 8 9 Enter angle of rotation (in degrees): 45 Enter direction of rotation (clockwise or anti-clockwise): clockwise The Original Matrix is: 1 2 3 4 5 6 7 8 9 The Rotated Matrix is: 5 4 1 6 9 2 7 8 3


