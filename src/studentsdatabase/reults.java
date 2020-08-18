package studentsdatabase;

public class reults {

	
	public reults(int total2, int avg2, boolean studentresult2,int id, String name, int tamil2, int english2, int maths2, int science2, int social2) {
		// TODO Auto-generated constructor stub
	  this.total = total2;
	  this.avg =avg2;
	  this.studentresult = studentresult2;
	  this.id = id;
	  this.name = name;
	  this.tamil= tamil2;
	  this.english = english2;
	  this.maths = maths2;
	  this.science = science2;
	  this.social= social2;
	}
int total;
  int avg;
  boolean studentresult;
  String name;
  int id;
  int tamil;
  int english;
  int maths;
  int science;
  int social;
  public int gettotal(){
	  return total;
  }
  
  public int getavg(){
	  return avg;
  }
  
  public boolean getresult(){
	  return studentresult;
  }
  public String getname(){
	  return name;
  }
  public int gettamil(){
	  return tamil;
  }
  public int getenglish(){
	  return english;
  }
  public int getmaths(){
	  return maths;
  }
  public int getscience(){
	  return science;
  }
  public int getsocial(){
	  return social;
  }
  public int getid(){
	  return id;
  }
}
