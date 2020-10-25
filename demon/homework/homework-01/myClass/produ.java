package myClass;

public class produ extends producer{
    int num;
    double area;
    void define(int x, double y){
        this.num = x;
        this.area = y;
    }

    public void build(int t){
        if(t < 0){
            System.out.println("WRONG!");
            return;
        }

        store.left_S -= t * this.area;

        if(store.left_S < 0){
            System.out.println("no enough space!");
            store.left_S += t * this.area;
            return;
        }
        
        while(--t >= 0){
            store.flat.push(this.getClass().toString());
            store.flat_num++;
        }
    }
}