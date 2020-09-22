// Using break as a civilized form of goto.
class BreakLabel2 {
    public static void main(String[] args) {
        
        int[][] intArray = new int[][] { { 1, 2, 3, 4, 5 }, { 10, 20, 30, 40, 50 } };
        boolean blnFound = false;
        
        System.out.println("Searching 30 in two dimensional int array..");
        
    Outer: for (int intOuter = 0; intOuter < intArray.length; intOuter++) {
            for (int intInner = 0; intInner < intArray[intOuter].length; intInner++) {
            if (intArray[intOuter][intInner] == 30) {
                blnFound = true;
                break Outer;    //跳出标号所示的循环（即Outer的for循环结束）
            }
        }
    }
        
        if (blnFound == true)
            System.out.println("30 found in the array");
        else
            System.out.println("30 not found in the array");
    }
}
