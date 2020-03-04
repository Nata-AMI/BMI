public class Main {
    public static void main(String[] args) {
        ImtService service = new ImtService ();
        long weight = 75;
        long height = 164;
        long bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
