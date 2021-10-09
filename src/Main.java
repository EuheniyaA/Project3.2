public class Main {
    public static void main (String[] args) {
        BmiService service= new BmiService();

        double bmi=service.calculate(62.50,1.71);

        System.out.println(bmi);
    }
}
