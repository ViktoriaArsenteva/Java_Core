package Sem4.src;

public class Program {
    
    public int ArrayAmount(String array [][], int weight, int height) throws MyArraySizeException{
        int sum = 0;
        if ((array.length != weight) || (array[0].length != height)){
            throw new MyArraySizeException("Incorrect array size");
        }
        else{
            for (int i = 0; i < weight; i++){
                for (int j = 0; j < height; j++){
                    sum += Integer.parseInt(array[i][j]);
                }
            }
        }
        return sum;
        
    }
}
