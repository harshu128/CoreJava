package day9.mcq;

public class Example17 {
public static void main(String[] args) {
	System.out.println(goFigure(60));
}
	
	public static int goFigure(int x)
	 {
	      if (x < 100)
	           x = goFigure(x + 10);
	      return (x - 1);
	 }
}
