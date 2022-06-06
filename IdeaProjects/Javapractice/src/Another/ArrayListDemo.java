package Another;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

            ArrayList list= new ArrayList();
            list.add("Welcome");
            list.add(10);
            list.add(10.5);
            list.add(true);
            list.add('A');

            System.out.println(list.size());
            System.out.println(list);
            list.add(1,"Selenium");
            System.out.println(list.get(3));
            System.out.println(list);
            list.remove(2);
            System.out.println(list);
            for (Object i:list)
            {
                System.out.println(i);
            }


        }

    }


