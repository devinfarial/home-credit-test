import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Input characters. To end press Enter");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<Character> inputArray = new ArrayList<>();

        for (char c : input.toCharArray()) {
            inputArray.add(c);
        }

        System.out.println("Unsorted Array: " + inputArray);
            for(int i=0; i<inputArray.size()-1;i++){
                char temp;
                if (Character.isAlphabetic(inputArray.get(i))){
                    if (Character.isAlphabetic(inputArray.get(i+1))){
                        if (inputArray.get(i) > inputArray.get(i+1)){
                            temp = inputArray.get(i);
                            inputArray.set(i, inputArray.get(i+1));
                            inputArray.set(i+1, temp);
                            i=-1;
                        }
                    }
                } else{
                    if (Character.isAlphabetic(inputArray.get(i+1))){
                        temp = inputArray.get(i);
                        inputArray.set(i, inputArray.get(i+1));
                        inputArray.set(i+1, temp);
                        i=-1;
                    } else {
                        if (inputArray.get(i) > inputArray.get(i+1)){
                            temp = inputArray.get(i);
                            inputArray.set(i, inputArray.get(i+1));
                            inputArray.set(i+1, temp);
                            i=-1;
                        }
                    }
                }
            }


        System.out.println("Sorted Array: " + inputArray);
        System.out.println("\nIf you wish to restart the program, press Y. If not, press any key.");
        if (scanner.nextLine().toLowerCase().equalsIgnoreCase("y")){
            main(null);
        }

    }


}
