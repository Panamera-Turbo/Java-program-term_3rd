/**
 * @Project: selflearn-2
 * @Package: PACKAGE_NAME
 * @Author: Chen Qizhi
 * @Date: 2020/12/25  周五
 * @Time: 9:35
 **/

public class main {
    public static void main(String[] args) {
        System.out.println("Hello ,world");
        Matrix scoreMatrix = new Matrix();
        scoreMatrix.buildMatrix();
        scoreMatrix.inputScore();
        System.out.println("平均成绩为：" + scoreMatrix.getTotalAverage());
    }
}
