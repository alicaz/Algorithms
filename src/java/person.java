package java;

 class person {

	 private String lastname;
	 private String firstname;
	 private int age;
	 
	 public person(String last, String first, int a){
		 lastname= last;
		 firstname = first;
		 age= a; 
	 }
	 
	 public void displayPerson(){
		 System.out.println("Last name:" + lastname);
		 System.out.println("Fist name:" + firstname);
		 System.out.println("Age:" + age);
	 }
	 
	 public String getLast(){
		return lastname;
		 
	 } 
}//End person class

 class ClassDataArray{
	 private person[] a;
	 private int nElems;
	 
	 public ClassDataArray(int max){  //constructor
		 a = new person[max];
		 nElems = 0;
	 }
	 
	 public person find(String searchName){
		 int j;
		 for(j=0; j<nElems; j++)
			 if(a[j].getLast().equals(searchName))
				 break;
		 if(j== nElems)
		return null;
		 else
			 return a[j];
	 }// find ()
	 
	 //put person into an array
	 public void insert(String last, String first, int age){
		 a[nElems] = new person(last, first, age);
		 nElems++;
	 }
	 
	 public boolean delete(String searchName){
		 int j;
		 for(j=0; j<nElems; j++)
		 if(a[j].getLast().equals(searchName))
			 break;
		 if(j==nElems)
		return false;
		 else{
			 for(int k=j; k<nElems; k++)
				 a[k] = a[k+1];
			 nElems--;
			 return true;
		 }
		
	 }//End delete()
	 
	 public void displayA(){
		 for(int j=0; j<nElems; j++)
			 a[j].displayPerson();
	 }
 }//end class ClassDataArray