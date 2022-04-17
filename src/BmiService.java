public class BmiService {
    public int calculate(int weight, int height) {
        int imt1 = height * height;
        int imt2 = weight / imt1;
        if (imt2 < 18) {
            System.out.println("Выраженный дефицит массы тела");
        }
        if (imt2 <= 25) {
            System.out.println("Норма");
        }
        if (imt2 > 25) {
            System.out.println("Избыточная масса тела");
        }
        return imt2;
    }
}