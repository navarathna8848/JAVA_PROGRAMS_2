class StudentMain
{

	public static void main(String[] args) 
	{
		Student.collegeName="madras medical college";

		Student s1=new Student();

		s1.name="Navarathna";	
		s1.rollNo=159;
		s1.phoneNo=7604990041l;
		s1.gender='f';

		Student s2=new Student();

		s2.name="Naviya";
		s2.rollNo=100;
		s2.phoneNo=8870922892l;
		s2.gender='f';

		s1.DisplayDetails();
		s2.DisplayDetails();

	}
}