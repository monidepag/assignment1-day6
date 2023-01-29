import java.util.ArrayList;
import java.util.Iterator;

class Generics <T> {
    ArrayList<T> arr = new ArrayList<T>();

    Generics(ArrayList<T> arr)
    {
        this.arr = arr;
    }

    void display()
    {
        Iterator<T> itr = arr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next() + " ");
        }
        System.out.println();
    }
    
}

public class GenericsAssignment {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        ArrayList<Float> arr2 = new ArrayList<Float>();
        arr2.add(1.0f);
        arr2.add(2.0f);
        arr2.add(3.0f);

        ArrayList<String> arr3 = new ArrayList<String>();
        arr3.add("ABC");
        arr3.add("DEF");
        arr3.add("GHI");

        ArrayList<Double> arr4 = new ArrayList<Double>();
        arr4.add(1.0);
        arr4.add(2.0);
        arr4.add(3.0);

        Generics<Integer> g1 = new Generics<Integer>(arr1);
        Generics<Float> g2 = new Generics<Float>(arr2);
        Generics<String> g3 = new Generics<String>(arr3);
        Generics<Double> g4 = new Generics<Double>(arr4);

        System.out.println("Integer : ");
        g1.display();
        System.out.println("Float : ");
        g2.display();
        System.out.println("String : ");
        g3.display();
        System.out.println("Double : ");
        g4.display();
    }
}
