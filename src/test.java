import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(124);
        list.add(32);
        list.add(50);
        Collections.sort(list);
        System.out.println(list);
    }
}
