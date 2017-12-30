import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersList {

    List<Integer> numbers = new ArrayList<>();

    private int liczba;

    Scanner scanner = new Scanner(System.in);

    private int scanNumber (){
        System.out.println("Podaj liczbę :");
        int x = scanner.nextInt();
        scanner.nextLine();
        return x;
    }

    private boolean checkIfPositive(){
        liczba = scanNumber();
        return liczba > 0;
    }

    public void addToTheList(){
        while (checkIfPositive()){
            numbers.add(liczba);
        }
        System.out.println("Liczba nie może być ujemna !");
    }

    public void printListBackwards(){
        for (int q = numbers.size()-1 ; q >= 0; q--) {
            System.out.print(numbers.get(q) + " ");
        }
        System.out.println("");
    }

    public void printSum(){
        int sum = 0;
        for (int q = 0; q <= numbers.size()-1 ; q++) {
            sum += numbers.get(q);
            System.out.print(numbers.get(q));
            if (q <= numbers.size()){
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum);
    }

    public void showMinMax(){
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i<numbers.size(); i++){
            if(numbers.get(i)>max){
                max = numbers.get(i);
            }
            if (numbers.get(i)<min){
                min = numbers.get(i);
            }
        }
        System.out.println("Największa wartośc to : " + max);
        System.out.println("Najmniejsza wartośc to : " + min);
    }

}
