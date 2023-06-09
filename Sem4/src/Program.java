package Sem4.src;

public class Program {
    
    public int ArrayAmount(String array [][], int weight, int height){
        int sum = 0;
        try {
            for (int i = 0; i < weight; i++){
                for (int j = 0; j < height; j++){
                    sum += Integer.parseInt(array[i][j]);
                }
            }
            return sum;
        } catch (NumberFormatException e) {
            System.out.println("Убедитесь, что массив состоит только из целых чисел");
            sum = 0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Убедитесь, что масив имеет верную размерность" + "(" + weight + " * " + height + ")");
            sum = 0;
        }
        return sum;
    }
}
