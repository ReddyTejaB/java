package Java18;

public class ExOnString {
    public static void main(String[] args) {

        String s="Hello";

        //1. n sLENGTH & CHARACTER
        //String Output
        System.out.println(s);

        //String Length
        System.out.println(s.length());

        //String charAt
        System.out.println(s.charAt(2));


        //2.CASE CONVERSION
        //String Uppercase
        System.out.println(s.toUpperCase());

        //String Lowercase
        System.out.println(s.toLowerCase());


        //3.COMPARISON METHODS
        //String equalsCase
        System.out.println("hello".equals("Hello"));

        //String equalsIgnoreCase
        System.out.println("hello".equalsIgnoreCase("Hello"));

        //String compareTo case
        System.out.println("25".compareTo("20"));


        //4.SEARCHING & CHECKING
        //String Contains
        System.out.println("Java Programming".contains("J"));

        //String startsWith
        System.out.println("Hello".startsWith("H"));

        //String endsWith
        System.out.println("Hello".endsWith("lo"));

        //String indexOf
        System.out.println("Hello".indexOf("l"));

        //String lastIndexOf
        System.out.println("Hello".lastIndexOf("l"));

        //String isEmpty
        System.out.println("".isEmpty());


        //5.SUBSTRING EXTRACTION
        //String substring
        System.out.println("Hello".substring(2));
        System.out.println("Hello".substring(1,4));


        //6.STRING MODIFICATION
        //String Replace
        System.out.println("Reddy".replace('a','o'));

        //String replaceAll
        System.out.println("Java 123".replaceAll("\\d","*"));

        //String trim
        System.out.println("     Hello     ".trim());


        //7.STRING SPLITTING & JOINING
        //String split
        String[] words="Java,Python,C++".split(",");
        System.out.println(words[1]);

        //String join
        System.out.println(String.join("->","Java","Python","C++"));


        //8.CONVERTING DATA TYPES
        //String valueOf
        int num=123;
        String n=String.valueOf(num);
        System.out.println(n);

    }
}