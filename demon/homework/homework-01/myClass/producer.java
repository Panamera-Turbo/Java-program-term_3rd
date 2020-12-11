package myClass;
import myClass.*;

public abstract class producer {
    // public void build(){};
    int kind = 0;
    // void in(String name){}  //入队,表示放进仓库
}

class flatProducer extends producer{
    store store_a = new store();

    // @Override
    void build(int num, double len, double wid)
    {//生产矩形
        rectangle rec_a = new rectangle(num, len, wid);

        if((store_a.usedS() + num * rec_a.area) > store_a.left_S )
        {
            System.out.println("ERROR");
            return;
        }

        store_a.flat_num++;

        store_a.left_S -= num * rec_a.area;
        while(num > 0){
            num--;
            store_a.flat.add(rec_a);
            
        }
    }

    void build(int num, double r)
    {//生产圆
        circle cir_a = new circle(num, r);

        if((store_a.usedS() + num * cir_a.area) > store_a.left_S )
        {
            System.out.println("ERROR");
            return;
        }

        store_a.flat_num++;

        store_a.left_S -= num * cir_a.area;
        while(num > 0){
            num--;
            store_a.flat.add(cir_a);
        }
    }

    void build(int num, double a, double b, double c)
    {//生产三角形
        triangle tri_a = new triangle(num, a, b, c);

        if((store_a.usedS() + num * tri_a.area) > store_a.left_S )
        {
            System.out.println("ERROR");
            return;
        }

        store_a.flat_num++;

        store_a.left_S -= num * tri_a.area;
        while(num > 0){
            num--;
            store_a.flat.add(tri_a);
        }
    }

    void build()
    {
        
    }

    void build()
    {

    }

    void build()
    {

    }

}