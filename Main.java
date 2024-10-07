public class Main {
    String name;
    int age;
    double weight;

    public Main (String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
        public static void main(String[]args){
            Main s1 = new Main("Reddy",21,5.6);
            Main s2 = new Main("Teja",24,5.5);
            System.out.println(s1.name+" "+s1.age+" "+s1.weight);
            System.out.println(s2.name+" "+s2.age+" "+s2.weight);
            
    }
}
