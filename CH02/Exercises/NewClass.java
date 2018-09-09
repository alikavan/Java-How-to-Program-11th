public class NewClass {
    public static void main(String[] args){

        double total = 0.0f;

        for(String arg : args)
            total += Double.parseDouble(arg);

        System.out.println("Total: " + total);
    }
}
