package Inheritence;

public class CollegePassOutPerson extends SchoolPassOutPerson {
	String collegeCertificateNO;
	
	CollegePassOutPerson(int id,String name,String schoolCertificateNo,String collegeCertificateNo)
	{
		super(id,name,schoolCertificateNo);
		this.collegeCertificateNO=collegeCertificateNo;
		
	}
}
