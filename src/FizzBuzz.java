
public class FizzBuzz {
	public void fizzBuzzRunner(){
		for(int i = 1; i <= 100; i++){
			if(fizz(i) && buzz(i)){
				System.out.println("FizzBuzz");
			}
			else if(fizz(i)){
				System.out.println("Fizz");
			}
			else if(buzz(i)){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
		}
	}
	public boolean fizz(int num){
		String numStr = ""+num;
		return (num%3==0) || (numStr.contains("3"));
	}
	public boolean buzz(int num){
		String numStr = ""+num;
		return (num%5==0) || (numStr.contains("5"));
	}
	
	public static void main(String[] args){
		FizzBuzz fizzbuzz = new FizzBuzz();
		fizzbuzz.fizzBuzzRunner();
	}
}
