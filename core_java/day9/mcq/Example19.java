package day9.mcq;
// Output
public class Example19 {
public static void main(String[] args) {
	int sum = -10, p = 1;

    for (int count = 1; count <= 50; count++)

    {

         sum += p;

         p /= 2;

    }

    System.out.println(sum);
}
}
