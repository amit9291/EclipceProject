package javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapDemo {

	public static void main(String[] args) {
		
    HashMap<Integer, String>hm = new HashMap<Integer,String>();  // Declaration
hm.put(101," Amit");
hm.put(102, " Jiaan");
hm.put(103, " Dhara");
hm.put(104, " Divaba");
System.out.println(hm);
hm.remove(101);  //remove
System.out.println(hm);
for(Map.Entry m:hm.entrySet())
{
	System.out.println(m.getKey()+" ="+m.getValue());
}

	}

}
