public class Opdracht1 {

    public static void main(String[] args) {
        String equation = "4 + 3";
        int result = Calculation.calc(equation);
        System.out.println(equation + " = " + result);

        /**
        equation = "4 * 3 + 2";
        System.out.println(equation + " = " + result);
        result = Calculation.calc(equation);

        equation = "(3 + 4) * 3 ";
        result = Calculation.calc(equation);
        System.out.println(equation + " = " + result);

        equation = "(8 + 1) - 3 + (2 * 3)";
        result = Calculation.calc(equation);
        System.out.println(equation + " = " + result);

        equation = "(5 + 2) * (3 + 2)";
        result = Calculation.calc(equation);
        System.out.println(equation + " = " + result);

        equation = "((3 - 1) + 4) * 8";
        result = Calculation.calc(equation);
        System.out.println(equation + " = " + result);
        */
    }
}

  class Calculation {
      static int calc(String equation) {
       //0
         System.out.println("komt binnen:" + equation + " lengte string:" + equation.length());

        //1. splits getallen en operators/tekens (ontleden)
        String Array[] = equation.split(" ");
        //2. string naar getallen omzetten
          int n1 = Integer.parseInt(Array[0]);
          int n2 = Integer.parseInt(Array[2]);
          System.out.println(n1);
          System.out.println(Array[1]);
          System.out.println(n2);

        return 0;
      }
  }
