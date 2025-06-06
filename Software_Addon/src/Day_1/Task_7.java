package Day_1;

public class Task_7 {
	public static int sod(int num){
		if(num==0) {
			return 0;
		}
		return num+sod(num-1);
	}
	public static void main(String[] args) {
		System.out.println(sod(10));

	}

}
