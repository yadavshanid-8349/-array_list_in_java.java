import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class array_list_in_java {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(25);
        arr.add(80);
        arr.add(90);
        arr.add(64);
        System.out.println(arr.get(2));
        arr.set(3,84);
        System.out.println(arr.get(3));
        System.out.println(arr);
        int n=arr.size();
        for (int i = 0; i <n ; i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        arr.add(1,100);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
