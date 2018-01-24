package java;

//ORD ARRAY & SEARCH BINARY
 class exercise {

	 private long [] b;
	 private int nElems;
	 
	 public exercise(int mac){
		 b =new long[mac];
				 nElems=0;
	 }
	  
	 public int size(){
		return nElems;
		 
	 }
	 
	 //SEARCH BINARY
	public int  find(Long searchKey){
		int lowerBound = 0;
		int upperBound = nElems -1;
		int one;
		
		while(true){
			one= (lowerBound + upperBound) /2;
			if(b[one] == searchKey)
				return one;
			else {
				if (b[one] <searchKey)
					lowerBound = one +1;
				else
					upperBound = one - 1;
			}
		}
		
	}
	public void insert (long value){
		int j;
		for(j=0; j<nElems; j++)
			if(b[j] <value)
				break;
		for(int k=nElems; k<j; k--)
			b[k] = b[k -1];
		b[j] = value;
		nElems++;
	}// end insert
	
	
	public boolean delete(long value)
    {
    int j = find(value);
    if(j==nElems)                  // can't find it
       return false;
    else                           // found it
       {
       for(int k=j; k<nElems; k++) // move bigger ones down
          b[k] = b[k+1];
       nElems--;                   // decrement size
       return true;
       }
    }  // end delete()
	
	public void display(){
		for(int j=0; j<nElems; j++)
			System.out.println(b[j] + " ");
		System.out.println("");
	}
	
	
 
 }// end class OrderedApp
