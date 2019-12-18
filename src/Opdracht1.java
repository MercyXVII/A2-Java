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

        equation = "(8 + 1) / 3 + (2 * 3)";
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
         //String Array[] = equation.split(" ");
        //2. string naar getallen omzetten
          //int n1 = Integer.parseInt(Array[0]);
          //werkt niet: int n3 = Integer.parseInt(Array[1]);
          //int n2 = Integer.parseInt(Array[2]);


          char[] array = equation.toCharArray();

          //generaliseer omdat we niet weten wat we op welke positie  in equation aantreffen

         for(int i=0; i<array.length; i++){
             if (Character.isDigit(equation.charAt(i))) {
                 System.out.println(equation.charAt(i) + " is a digit");
             } else {
                 switch(equation.charAt(i)) {
                     case '+':
                         System.out.println("is a +");
                         break;
                     case '-':
                         System.out.println("is a -");
                         break;
                     case '*':
                         System.out.println("is a *");
                         break;
                     case '/':
                         System.out.println("is a /");
                         break;
                     default:
                 }
             }
         }
          return 0;
      }
  }
