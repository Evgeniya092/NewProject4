public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;
        double height = 1.87;
        int index = service.calculate(height,weight);
        System.out.println(index);

        }
    }