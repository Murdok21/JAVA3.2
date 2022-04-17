public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
         int result = service.calculate(80*10000, 182);
        System.out.println( "ИМТ = "+ result);

      //  int weight = 80 * 10000;
     //   int height = 182;
       // int imt1 = height * height;
      //  int imt2 = weight / imt1;
      //  System.out.println("ИМТ = " + imt2);
      //  if (imt2 < 18) {
         //   System.out.println("Выраженный дефицит массы тела");
       // }
      //  if (imt2 <= 25) {
       //     System.out.println("Норма");
      //  }
       // if (imt2 > 25) {
       //     System.out.println("Избыточная масса тела");
        }
    }

