function int matrixMult(int a[][], int b[][]) {
    int aRows = a.length();
    int aCols = a[0].length();
    int bRows = b.length();
    int bCols = b[0].length();

    int matrix[aRows][bCols];

    for (int r = 0; r < aRows; r = r + 1) {
        for (int c = 0; c < bCols; c = c + 1) {
            matrix[r][c] = 0;
            for (int i = 0; i < aCols; i = i + 1) {
                matrix[r][c] = matrix[r][c] + (a[r][i] * b[i][c]);
            };
        };
    };
    return matrix;
};

function null printMatrix(int m[][]) {
    for (int r = 0; r < m.length(); r = r + 1) {
        string output = " ";

        for (int j = 0; j < m[r].length(); j = j + 1) {
            output = output + m[r][j] + " ";
        };
        print output;
    };
};

int row1;
int row2;
int col1;
int col2;

print "Enter number of rows";
read row1;
print "Enter number of columns";
read col1;

int matrix1[row1][col1];

for (int i = 0; i < row1; i = i + 1){
    for (int j = 0; j < col1; j = j + 1){
        print "Enter a value for the cell " + i + "x" + j;
        read matrix1[i][j];
    };
};

print "Enter number of rows";
read row2;
print "Enter number of columns";
read col2;

int matrix2[row2][col2];

for (int i = 0; i < row2; i = i + 1){
    for (int j = 0; j < col2; j = j + 1){
        print "Enter a value for the cell " + i + "x" + j;
        read matrix2[i][j];
    };
};

int matrix3[row1][col2];

print "The first matrix is:";
printMatrix(matrix1);

print "The second matrix is:";
printMatrix(matrix2);

print "The two matrices multiplied together are:";

matrix3 = matrixMult(matrix1, matrix2);
printMatrix(matrix3);

