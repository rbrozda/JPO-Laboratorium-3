import javax.swing.*;
import java.awt.*; 

public class SpringApplet extends JApplet{
	public void init( )
	{
		//Utworzenie dwóch ró¿nych obiektów klasy Vector2D za pomoc¹ konstruktora z parametrami.
		Vector2D wektor1 = new Vector2D(9,5);
		Vector2D wektor2 = new Vector2D(7,8);
				
		//Obliczenie sumy i ró¿nicy stworzonych wektorów 
		Vector2D suma = wektor1.sumaWektorow(wektor2.getX(),wektor2.getY()); 
		Vector2D roznica = wektor1.roznicaWektorow(wektor2.getX(), wektor2.getY());
				
		//Obliczenie wektorów znormalizowanych dla stworzonych wektorów
		Vector2D normalny1 = wektor1.wektorNormalny();
		Vector2D normalny2 = wektor2.wektorNormalny();
				
		//Obliczenie d³ugoœci stworzonych wektorów i zapisanie ich do nowych zmiennych.
		double dlugosc1 = wektor1.getDlugosc();
		double dlugosc2 = wektor2.getDlugosc();
				
		//Obliczenie wektora przemno¿onego przez pewn¹ sta³¹ dla pierwszego stworzonego wektora
		Vector2D iloczyn1 = wektor1.iloczynWektora(5);
				
				
	
		//Wyœwietlenie na konsoli parametrów stworzonych wektorów oraz wszystkich wyników.
		System.out.println("Wspó³rzêdne stworzonych wektorów to (" + 
		wektor1.getX() + ", " + wektor1.getY() + ") oraz (" + wektor2.getX() + ", " + wektor2.getY() + ").\n");
		
		System.out.println("Wspó³rzêdne wektora bêd¹cego sum¹ dwóch stworzonych wektorów to (" + 
		suma.getX() + ", " + suma.getY() + ").\n");
		
		System.out.println("Wspó³rzêdne wektora bêd¹cego ró¿nic¹ dwóch stworzonych wektorów to (" + 
		roznica.getX() + ", " + roznica.getY() + ").\n");
				
		System.out.println("Wspó³rzêdne wektora znormalizowanego dla pierwszego wektora to (" + 
		normalny1.getX() + ", " + normalny1.getY() + ").\n");
				
		System.out.println("Wspó³rzêdne wektora znormalizowanego dla drugiego wektora to (" + 
		normalny2.getX() + ", " + normalny2.getY() + ").\n");
				
		System.out.println("D³ugoœæ pierwszego wektora wynosi " + dlugosc1 + ".\n");
		System.out.println("D³ugoœæ drugiego wektora wynosi " + dlugosc2 + ".\n");
				
		System.out.println("Wspó³rzêdne pierwszego wektora przemno¿onego przez sta³¹ " +
		"to (" + iloczyn1.getX() + ", " + iloczyn1.getY() + ").\n");		
	}
	
	public void start( )
	{
	}

	public void paint(Graphics g)
	{
		g.fillOval(5, 7, 20, 80);
	}

	public void stop( )
	{
	}

	public void destroy( )
	{
	} 
}
