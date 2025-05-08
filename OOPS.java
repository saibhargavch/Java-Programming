class student{
	int vtuno; String name; String dept;
	String fathername; String mothername; long contactnumber; float x=0;

	float marks[]=new float[15];

	float findpercentage(int nSubject){
		for (int i=0;i<nSubject;i++)
				x=x+marks[i];
			return x/nSubject;
	}
	void printDetails(){
		System.out.println(vtuno);
		System.out.println(name);
		System.out.println(dept);
		System.out.println(fathername);
		System.out.println(mothername);
		System.out.println(contactnumber);
	}

	student(int vtuno,String name,String dept,long contactnumber,String fname,String mname)
	{
		this.vtuno=vtuno;
		this.name=name;
		this.dept=dept;
		this.contactnumber=contactnumber;
		this.fathername=fname;
		this.mothername=mname;
	}
	public static void main (String arg[]){
		student s1=new student(22497,"sai","CSE",8121145834L,"Krishna","Aruna");
		s1.marks=new float[]{44,55,66,77,88,99,45,12,63,52};
		float ans1=s1.findpercentage(10);
		System.out.println(ans1);
		student s2=new student(21759,"ameer","CSE",6281294994L,"Ikbal","Fathima");
		s2.marks=new float[]{45,98,65,45,78,12,32,65,98,55};
		float ans2=s2.findpercentage(10);
		System.out.println(ans2);
		
	}
}