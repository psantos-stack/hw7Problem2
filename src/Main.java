import org.junit.Test;
import static org.junit.Assert.*;
public class Main {

    public static void main(String[] args) {
        // left empty
        MaxHeap a = new MaxHeap(28);
        Integer[] data = new Integer[28];
        for(int i = 0; i < 28; i++){
            data[i] = i;
            //a.add((int)(200*Math.random()));
        }
        //System.out.println(a.toString());
        a.MaxHeapN(data);
        //a.MaxHeapLogN(data);
        System.out.println(a.toString());
        //a.pop();
        //System.out.println(a.toString());
    }
    @Test
    public void add(){
        MaxHeap a = new MaxHeap(3);
        for(int i = 0; i < 3; i++){
            a.add(i);
        }
        Integer[] expected = {2, 0, 1};
        for(int i = 0; i < 3; i++){
            assertEquals(a.data[i], expected[i]);
        }
    }
    @Test
    public void pop(){
        MaxHeap a = new MaxHeap(3);
        for(int i = 0; i < 3; i++){
            a.add(i);
        }
        assertEquals(2, a.pop().intValue());
        Integer[] expected = {1, 0};
        for(int i = 0; i < 2; i++){
            assertEquals(a.data[i], expected[i]);
        }
    }
}
