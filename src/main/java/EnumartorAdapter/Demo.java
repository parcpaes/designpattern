package EnumartorAdapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(nums.iterator());
        while(iteratorEnumeration.hasMoreElements()){
            System.out.println(iteratorEnumeration.nextElement());
        }
    }
}