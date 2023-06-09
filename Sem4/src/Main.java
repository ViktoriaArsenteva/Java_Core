package Sem4.src;

public class Main {
    final static int arrayWeight = 4;
    final static int arrayHeight = 4;
    public static void main(String[] args) {
        String[][] a = {{"9","6","7","8"},{"5","u","7","8"},{"5","8","0","8"},{"5","8","0","8"},{"5","8","0","8"}};
        Program program = new Program();
        try {
            int sum = program.ArrayAmount(a, arrayWeight, arrayHeight);
            System.out.println(sum);
        } catch (MyArraySizeException e) {
            System.err.println(e.getMessage());
        }catch (NumberFormatException ex){
            System.err.println(ex.getMessage());
        }
    }
}
