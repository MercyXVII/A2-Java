public class Opdracht1 {

    public static void main (String[] args) {
        opdracht1();
    }

    public static void opdracht1() {
        //define variables
        int n1 = 0;
        int n2 = 1;
        int n3, i;
        int count = 10;
        System.out.print(n1 + " " + n2);

        //calculation
        for(i = 2; i < count; ++i)
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}