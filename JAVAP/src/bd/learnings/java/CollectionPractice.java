package bd.learnings.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionPractice {
    public static void main() {
        List<Integer> myList = new ArrayList<>();
        for (int i=0; i< 15; i++)
        {
            myList.add(2*i);
        }
        Iterator itr = myList.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}