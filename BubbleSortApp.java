package SimpleSorting;

public class BubbleSortApp {
	public static void main(String[] args){
		int maxSize = 100;
		ArrayBub arr;
		arr = new ArrayBub(maxSize);
		
		arr.insert(77);
		arr.insert(78);
		arr.insert(79);
		arr.insert(71);
		arr.insert(72);
		arr.insert(73);
		arr.insert(74);
		arr.insert(75);
		arr.insert(76);
		arr.insert(70);
		
		arr.display();
		
		arr.bubbleSort();
		
		arr.display();
		
	}

}
