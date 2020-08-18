package studentsdatabase;

public class students {

	String name;
	 int id;
	 int tamil;
	 int english;
	 int maths;
	 int science;
	 int social;
	  public students(int id,String name,int tamil,int english,int maths,int science,int social){
		  this.id=id;
		  this.name = name;
		  
		  this.tamil = tamil;
		  this.english = english;
		  this.maths = maths;
		  this.science = science;
		  this.social = social;
	  }
	  public students() {
		// TODO Auto-generated constructor stub
	}
	public int getid(){
		  return id;
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
}
