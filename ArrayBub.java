package SimpleSorting;

public class ArrayBub {
	
	private long[] a;
	private int nElems;

	public ArrayBub(int max) {
		// TODO Auto-generated constructor stub
		a = new long[max];
		nElems = 0;
	}
	
	public void insert(long value){
		a[nElems] = value;
		nElems++;
	}
	
	public void display(){
		for(int j=0; j<nElems; j++)
			System.out.println(a[j] + "");
			System.out.println("");
	}
	
	//bubbleSort algorithm
	/**
	 * what this does is out=the last element, if out if greater than decrement.
	 * in=0, if in is less than out increment.
	 * if a[in] is greater than a[in+1], then swap in and in+1.
	 */
	public void bubbleSort(){
		int out, in;
		
		for(out=nElems-1; out>1; out--)
			for(in=0; in<out; in++)
				if(a[in] > a[in+1])
					swap(in, in+1);
	}

	//swap algorithm
	/**
	 * 
	 * @param one
	 * @param two
	 */
	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	

} 
