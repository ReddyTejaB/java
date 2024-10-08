public class Instance {
    //variables

    String name;
    int age;
    double weight;
    //constrcter

    public Instance(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    //methods

    public static void main(String[] args) {
        Instance i1 = new Instance ("Jack",23,76.0);
        Instance i2 = new Instance ("Spark",24,67.5);
        System.out.println(i1.name+" "+i1.age+" "+i1.weight);
        System.out.println(i2.name+" "+i2.age+" "+i2.weight);
    }
}
