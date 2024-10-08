public class Instance {
    //variables

    int age;
    double weight;
    
    //constrcter

    public Instance(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }
    //methods

    public static void main(String[] args) {
        Instance i1 = new Instance (23,76.0);
        Instance i2 = new Instance (24,67.5);
        System.out.println(i1.age+" "+i1.weight);
        System.out.println(i2.age+" "+i2.weight);
    }
}
