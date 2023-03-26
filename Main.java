import java.util.ArrayList;
import java.util.Comparator;
class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers=new ArrayList<Integer>();

		numbers.add(6);
		numbers.add(2);
		numbers.add(1);
		numbers.add(3);
		
		//Using Index method to get the index of the current value of the number variable and updating the element with the multiplied value.
		System.out.println("before"+ numbers.toString());

		numbers.forEach(number-> {
			numbers.set(numbers.indexOf(number),number *2);
		});
		System.out.println("after"+numbers.toString());
  }
}