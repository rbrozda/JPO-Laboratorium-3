import javax.swing.*;
import java.awt.*; 

public class SpringApplet extends JApplet{
	public void init( )
	{
		//Utworzenie dw�ch r�nych obiekt�w klasy Vector2D za pomoc� konstruktora z parametrami.
		Vector2D wektor1 = new Vector2D(9,5);
		Vector2D wektor2 = new Vector2D(7,8);
				
		//Obliczenie sumy i r�nicy stworzonych wektor�w 
		Vector2D suma = wektor1.sumaWektorow(wektor2.getX(),wektor2.getY()); 
		Vector2D roznica = wektor1.roznicaWektorow(wektor2.getX(), wektor2.getY());
				
		//Obliczenie wektor�w znormalizowanych dla stworzonych wektor�w
		Vector2D normalny1 = wektor1.wektorNormalny();
		Vector2D normalny2 = wektor2.wektorNormalny();
				
		//Obliczenie d�ugo�ci stworzonych wektor�w i zapisanie ich do nowych zmiennych.
		double dlugosc1 = wektor1.getDlugosc();
		double dlugosc2 = wektor2.getDlugosc();
				
		//Obliczenie wektora przemno�onego przez pewn� sta�� dla pierwszego stworzonego wektora
		Vector2D iloczyn1 = wektor1.iloczynWektora(5);
				
				
	
		//Wy�wietlenie na konsoli parametr�w stworzonych wektor�w oraz wszystkich wynik�w.
		System.out.println("Wsp�rz�dne stworzonych wektor�w to (" + 
		wektor1.getX() + ", " + wektor1.getY() + ") oraz (" + wektor2.getX() + ", " + wektor2.getY() + ").\n");
		
		System.out.println("Wsp�rz�dne wektora b�d�cego sum� dw�ch stworzonych wektor�w to (" + 
		suma.getX() + ", " + suma.getY() + ").\n");
		
		System.out.println("Wsp�rz�dne wektora b�d�cego r�nic� dw�ch stworzonych wektor�w to (" + 
		roznica.getX() + ", " + roznica.getY() + ").\n");
				
		System.out.println("Wsp�rz�dne wektora znormalizowanego dla pierwszego wektora to (" + 
		normalny1.getX() + ", " + normalny1.getY() + ").\n");
				
		System.out.println("Wsp�rz�dne wektora znormalizowanego dla drugiego wektora to (" + 
		normalny2.getX() + ", " + normalny2.getY() + ").\n");
				
		System.out.println("D�ugo�� pierwszego wektora wynosi " + dlugosc1 + ".\n");
		System.out.println("D�ugo�� drugiego wektora wynosi " + dlugosc2 + ".\n");
				
		System.out.println("Wsp�rz�dne pierwszego wektora przemno�onego przez sta�� " +
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
