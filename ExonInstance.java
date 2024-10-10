public class ExonInstance {

    //Variables

    int age;
    String name;
    double weight;

    //Constructor

    public ExonInstance(int age,String name,double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
        public static void main(String [] args){
            //objets
              ExonInstance e1=new ExonInstance(1,"Reddy",67);
              ExonInstance e2=new ExonInstance(2,"Teja",56);
              ExonInstance e3=new ExonInstance(3,"Bavaji",75);
              System.out.println(e1.age+" "+e1.name+" "+e1.weight);
              System.out.println(e2.age+" "+e2.name+" "+e2.weight);
              System.out.println(e3.age+" "+e3.name+" "+e3.weight);




        }

    }

