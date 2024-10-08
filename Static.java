public class Static {
    //variables

    int id;
    String name;


    //constucter

    public Static(int id,String name) {
        this.id = id;
        this.name = name;
    }

    //methods
    public static void main(String[] args) {
        Static s1=new Static(1,"Ravi");
        Static s2=new Static(2,"Raki");
        System.out.println(s1.id+" "+s1.name+" "+"SVU");
        System.out.println(s2.id+" "+s2.name+" "+"SVU");
    }
}
