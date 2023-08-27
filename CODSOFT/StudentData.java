import java.lang.*;
import java.util.Scanner;
class Student{
private String first_name,last_name;
private int s1,s2,s3,s4,roll_num;
int total_marks=0;
float avg_per;
//private float avg_per;

Student()
{
	first_name=" ";
	last_name=" ";
	roll_num=0;
	s1=0;
	s2=0;
	s3=0;
	s4=0;
}
//getter 

public String getfirstname()
{
	return first_name;
}
public String getlastname()
{
	return last_name;
}
public int gets1()
{
	return s1;
}
public int gets2()
{
	return s2;
}
public int gets3()
{
	return s3;
}
public int gets4()
{
	return s4;
}
public int getrollnum()
{
	return roll_num;
}

//setter

public void setfirstname(String fname)
{
	first_name=fname;
}
public void setlastname(String lname)
{
	last_name=lname;
}
public void sets1(int s1marks)
{
	s1=s1marks;
}
public void sets2(int s2marks)
{
	s2=s2marks;
}

public void sets3(int s3marks)
{
	s3=s3marks;
}
public void sets4(int s4marks)
{
	s4=s4marks;
}
public void setrollnum(int rollnum)
{
	roll_num=rollnum;
}

public int total_marks()
{
	total_marks=s1+s2+s3+s4;
	return total_marks;
}
public float avg_per()
{
	avg_per=(float)(total_marks/4);
	return avg_per;
}
public void grade()
{
	if(avg_per>50)
	{
		if(avg_per>60)
		{
			if(avg_per>70)
			{
				if(avg_per>85.00)
				{
						System.out.println("GRADE : A+");
				}
				else{
						System.out.println("GRADE :A");
				}
			}
			else{
				System.out.println("GRADE :B");
			}
		}
		else{
			System.out.println("GRADE :C");
		}
	}
	else{
		System.out.println("GRADE :D");
	}
}
}
public class StudentData {
    public static void main(String[] args) {
       
		Scanner sc=new Scanner(System.in);
		Student stud1=new Student();
		System.out.println();
		System.out.println("################################## STUDENT GRADE CALCULATOR #################################");
		System.out.println();
		System.out.println("____________________INPUT________________________");
		System.out.println();
		System.out.print("enter first name of student = ");
		String tname=sc.next();
		System.out.print("enter last name of student = ");
		String tlname=sc.next();
		
		System.out.println("enter Roll number = ");
		int trollnum=sc.nextInt();
		System.out.println("__________________ENTER MARKS OF SUBJECT OUT OF 100 ___________________");
		System.out.println();
		System.out.print("data structure = ");
		int ts1=sc.nextInt();
		System.out.print("computer network = ");
		int ts2=sc.nextInt();
		System.out.print("computer algorithm = ");
		int ts3=sc.nextInt();
		System.out.print("java programming = ");
		int ts4=sc.nextInt();
		stud1.setfirstname(tname);
		stud1.setlastname(tlname);
		stud1.setrollnum(trollnum);
		stud1.sets1(ts1);
		stud1.sets2(ts2);
		stud1.sets3(ts3);
		stud1.sets4(ts4);
	System.out.println("**********************************************************************************************");
	System.out.println("_______________________________________RESULT____________________________________");
	
	System.out.println("NAME OF STUDENT  : "+stud1.getfirstname()+" "+stud1.getlastname());
	System.out.println("ROLL NUMBER      : "+stud1.getrollnum());
	
	System.out.println("SUBJECT"+"                "+"MARKS");
	System.out.println("data structure    "+"     "+" "+stud1.gets1());
	System.out.println("computer network  "+"     "+" "+stud1.gets2());
	System.out.println("computer algorithm"+"     "+" "+stud1.gets3());
	System.out.println("java programming  "+"     "+" "+stud1.gets4());
	System.out.println("_____________________________________________________________________________________");
	System.out.println("TOTAl MARKS       "+"     "+" "+stud1.total_marks());
	System.out.println("______________________________________________________________________________________");
	System.out.println("PERCENTAGE : "+stud1.avg_per()+" "+"%");
	stud1.grade();
    System.out.println("***********************************************************************************************");
	}
    
}
