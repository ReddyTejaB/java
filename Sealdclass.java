package Java18;

public abstract sealed class Sealdclass permits Car,Bike {  //Step 1 in sealed class
    abstract int add(int a, int b);
}
