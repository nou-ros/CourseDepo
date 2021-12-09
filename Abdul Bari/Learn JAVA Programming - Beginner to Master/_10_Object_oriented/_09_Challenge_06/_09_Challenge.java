import java.lang.*;

class Subject{
	private String subId;
	private String name;
	private int maxMarks;
	private int marksObtain;
	
	public Subject(String subId, String name, int maxMarks, int marksObtain)
	{
		this.subId=subId;
		this.name=name;
		this.maxMarks=maxMarks; // maximum marks that can be obtain
		this.marksObtain=marksObtain; //mark obtained
	}
	public String getsubId(){ return subId; }
	public String getName(){ return name; }
	public int getmaxMarks(){ return maxMarks; }
	public int getmarksObtain(){ return marksObtain; }

	public void setmaxMarks(int mm)
	{
		maxMarks=mm;
	}
	
	public void setmarksObtain(int m)
	{
		marksObtain=m;
	}
	boolean isQualified()
	{
		return marksObtain>=maxMarks/10*4;
	}
	public String toString()
	{
		return "\nSubject ID: "+subId+"\nName: "+name+"\nMarks Obtained: "+marksObtain;
	}
	
}

public class _09_Challenge{
	public static void main(String [] args)
	{
		//Array of object
		Subject s[] = new Subject[3];
		s[0]=new Subject("s101","DS",100,70);
		s[1]=new Subject("s102","Algorithm",100,39);
		s[2]=new Subject("s103","OS",100,85);
		
		for(Subject x:s)
			System.out.println(x);

	}
}