public class ExonIf {
    public static void main(String[] args) {

        int tel = 100;
        int hin = 60;
        int eng = 95;
        int mat = 85;
        int sci = 95;
        int soc = 100;

        Double percentage =  (double)(tel + hin + eng + mat + sci + soc) * (100) / 600;
        System.out.println(percentage);

       if (percentage > 90) {
            System.out.println("This percentage is Distinction "+percentage);
        } else if (percentage > 80 && percentage < 90) {
            System.out.println("This percentage is First "+percentage);
        } else if (percentage > 70 && percentage < 80) {
            System.out.println("This percentage is Second "+percentage);
        } else if (percentage > 60 && percentage < 70) {
            System.out.println("This percentage is Third "+percentage);
        }else if (percentage > 50 && percentage < 60) {
            System.out.println("This percentage is Fourth "+percentage);
        }else if (percentage > 40 && percentage < 50) {
            System.out.println("This percentage is Fifth "+percentage);
        }else{
           System.out.println("Fail");
       }
    }
}