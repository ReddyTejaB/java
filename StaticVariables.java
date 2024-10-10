public class Student {
    //variables

    int id;
    String name;
    static String collageName;



    //constrcter

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //methods
    public static void main(String[] args) {
        Student s1=new Student(1,"Ravi");
        Student s2=new Student(2,"Teja");
        Student s3=new Student(3,"Bavaji");
	
	Student.collageName="SVU";

        System.out.println(s1.id+" "+s1.name+" "+Student.collageName);
        System.out.println(s2.id+" "+s2.name+" "+Student.collageName);
        System.out.println(s3.id+" "+s3.name+" "+Student.collageName);
    }
}
