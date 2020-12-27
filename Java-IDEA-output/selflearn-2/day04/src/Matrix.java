import java.util.Scanner;

/**
 * @Project: selflearn-2
 * @Package: PACKAGE_NAME
 * @Author: Chen Qizhi
 * @Date: 2020/12/25  周五
 * @Time: 9:14
 **/

public class Matrix {
    private double[][] matrix;
    private int row, col;
    private static int num = 0;
    private double total = 0d;
    private static int classOrder = 1;

    private void check(double score) throws myException {
        if(!(score >= 0d && score <= 100d))
            throw new myException("wrong input");
    }
    void buildMatrix(){
        System.out.print("输入班级数目");
        Scanner scanner = new Scanner(System.in);
        this.row = scanner.nextInt();
        System.out.print("输入人数最多班级的人数");
        this.col = scanner.nextInt();
        this.matrix = new double[this.row][this.col];
        setMatrixZero();
    }

    private void setMatrixZero(){
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                this.matrix[i][j] = 0d;
            }
        }
    }

    private void inputClassScore(){
        Scanner scanner = new Scanner(System.in);
        double detail;
        System.out.println("输入第"+classOrder+"个班级的成绩,输入#表示当前班级输入结束");
        for (int j = 0; j < this.col; j++) {
            if("#".equals(scanner.next())) break;
            detail = scanner.nextDouble();
            try {
                check(detail);
            }catch (myException me){
                me.getMessage();
            }
            this.matrix[classOrder-1][j] = detail;
            num++;
            this.total += this.matrix[classOrder-1][j];
        }
    }

    void inputScore(){
        System.out.print("输入成绩");
//        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.row; i++) {
            inputClassScore();
            classOrder++;
        }
    }

    double getMatrixElement(int r, int c){
        return this.matrix[r][c];
    }

    double getTotalAverage(){
        return this.total / num;
    }

    double getClassAverage(int i){
        i--;
        double thisClassScore = 0;
        int j;
        for (j = 0; j < this.col; j++) {
            thisClassScore += this.matrix[i][j];
        }
        return thisClassScore/ (j+1);
    }
}
