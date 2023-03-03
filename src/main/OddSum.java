import java.util.ArrayList;

public class OddSum {

    public static void main(String[] args) {
        run(args, false);
    }

    public static int run(String[] args, boolean test) {

        ArrayList<Integer> listInt = new ArrayList<>();
        // Integer one = 1;        
        // Integer two = 2;
        // Integer five = 5;
        // listInt.add(one);        
        // listInt.add(two);        
        // listInt.add(five);        
        int res;
        if (!test) {
            System.out.println("Passe la");
            System.out.println("Elements' list :");
            for (String v : args)
                System.out.print(" " + v);
            System.out.println();
        }
        for (int i = 0; i < args.length; i++) {
            try {
                listInt.add(Integer.parseInt(args[i]));                
            } catch (NumberFormatException e) {
                System.err.println(e);
            }
        }

        res = sum(listInt);
        if (test) {
            return res;
        }

        System.out.println("Sum of odd elements : " + res);
        System.out.println("END!");

        return 0;
    }

    public static int sum(ArrayList<Integer> listInt) {

        int result = 0;
        for (int value : listInt) {
            if (value % 2 != 0) {
                result += value;
            }
        }
        return result;
    }
}
