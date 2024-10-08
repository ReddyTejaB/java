public class Student {
    //variables

    int id;
    String name;
    String collageName;



    //constrcter

    public Student(int id, String name, String collageName) {
        this.id = id;
        this.name = name;
        this.collageName = collageName;
    }

    //methods
    public static void main(String[] args) {
        Student s1=new Student(1,"Ravi","SVU");
        Student s2=new Student(2,"Teja","SVU");
        Student s3=new Student(3,"Bavaji","SVU");
        System.out.println(s1.id+" "+s1.name+" "+s1.collageName);
        System.out.println(s2.id+" "+s2.name+" "+s2.collageName);
        System.out.println(s3.id+" "+s3.name+" "+s3.collageName);
    }
}
