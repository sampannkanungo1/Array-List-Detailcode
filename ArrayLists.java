package arraylist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		//add element .add(num)
		list.add(0);
		list.add(1);
		list.add(2);
		System.out.println("This list is here ----> "+list);
		
		//get element  #create an another class = .get(index);		
		int element = list.get(2);
		System.out.println("The number present in index number 2 is "+element);
		
		//get element in  between : .add(index,element);
		list.add(1,5);
		System.out.println("The updated array is "+list);
		
		//set element / replace element : .set(index,element);
		list.set(0,3);
		System.out.println("the updated list after set/replace "+list);
		
		//delete element #remove(index)
		list.remove(2);
		System.out.println("The updated list after removal "+list);
		
		//size #DECLARE CLASS = LIST.SIZE()
		int size=list.size();
		System.out.println("The size is "+size);
		
		//loops
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		
	//Sorting  #import a class 1st || Collection.sort(class);
		Collections.sort(list);
		System.out.println(list);
	}
}


