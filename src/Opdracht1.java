import java.util.ArrayList;

public class Opdracht1 {

    public static void main(String[] args) {

        String equation = "4 + 3";
        int result = Calculation.calc(equation);
        System.out.println(equation + " = " + result);


        /** equation = "4 * 3 + 2";
        System.out.println(equation + " = " + result);
        result = Calculation.calc(equation);

        equation = "(3 + 4) * 3 ";
        result = Calculation.calc(equation);
        System.out.println(equation + " = " + result);

        equation = "(8 + 1) + (2 * 3)";
        result = Calculation.calc(equation);
        System.out.println(equation + " = " + result);

        equation = "(5 + 2) * (3 + 2)";
        result = Calculation.calc(equation);
        System.out.println(equation + " = " + result);

        equation = "(3 - 1) + 4 * 8";
        result = Calculation.calc(equation);
        System.out.println(equation + " = " + result); */

    }
}

  class Calculation {
       static int calc(String equation) {
          System.out.println("komt binnen:" + equation + " lengte string:" + equation.length());

          //1. splits getallen en operators/tekens (ontleden).
          //2. string naar getallen omzetten.

          char[] array = equation.toCharArray();
          int[] arraycalc;
          arraycalc = new int[array.length];
          int operator_count = 0;
            ArrayList<Character> operators = new ArrayList<>();



          //3. generaliseer omdat we niet weten wat we op welke positie  in equation aantreffen.
          //4. getallen oplsaan voor later gebruik

          for (int i = 0; i < array.length; i++) {

              if (Character.isDigit(equation.charAt(i))) {
                  int n = Integer.parseInt(String.valueOf(equation.charAt(i)));
                  arraycalc[0] = n;
                  System.out.println(n + " is a digit");
                  //System.out.println(arraycalc[0]);

           //getallen mee geven aan de cases in de juiste volgorde.
              } else if(equation.charAt(i) == '+' || equation.charAt(i) == '-' || equation.charAt(i) == '*'){
                    operator_count++;
                    operators.add(equation.charAt(i));
                    char op = equation.charAt(i);

                    operators(op);
              } else if(equation.charAt(i) == '(') {
            //pak de getallen er na tot dat je ) vindt.
              }
          }
           int num1 = arraycalc[0];
           int num2 = 0;
           int j = 0;
          return num1;
      }
        static int operators(char op) {
          switch(op) {
              case '+':
                  System.out.println("is a +");
                    /**num1 = num1 + num2;*/
                  break;
              case '-':
                  System.out.println("is a -");
                    /**num1 = num1 - num2; */
                  break;
              case '*':
                  System.out.println("is a *");
                   /**num1 = num1 * num2; */
                  break;
              default:
          } return 0;
      }
  }
