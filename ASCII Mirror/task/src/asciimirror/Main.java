package asciimirror;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String cow = """
                            ^__^
                    _______/(oo)
                /\\/(       /(__)
                   | w----||   \s
                   ||     ||   \s""";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the file path:");
        String input = scanner.nextLine();
        File file = new File(input);
        ArrayList<String> animal = new ArrayList<>();
        int lengthOfString = 0;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            while((input = bufferedReader.readLine()) != null){
                animal.add(input);
                if(lengthOfString < input.length()){
                    lengthOfString = input.length();
                }

            }

            for(int i = 0; i < animal.size();i++){

                for(int j = animal.get(i).length() ; j < lengthOfString;j++){
                    String str = animal.get(i) + " ";
                    animal.set(i, str);
                }
            }

            for (String str : animal) {
                System.out.println(str + " | " + reverseString(str));
            }


        } catch (IOException e){
            System.out.println("File not found!");
        }


    }

    public static String reverseString(String str){

        String reverse = new StringBuilder(str).reverse().toString();

        reverse = reverse.replace('/', '*');
        reverse = reverse.replace('\\', '/');
        reverse = reverse.replace('*', '\\');

        reverse = reverse.replace('(', '*');
        reverse = reverse.replace(')', '(');
        reverse = reverse.replace('*', ')');

        reverse = reverse.replace('[', '*');
        reverse = reverse.replace(']', '[');
        reverse = reverse.replace('*', ']');

        reverse = reverse.replace('<', '*');
        reverse = reverse.replace('>', '<');
        reverse = reverse.replace('*', '>');

        return reverse;

    }
}