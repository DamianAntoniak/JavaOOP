package zadanie3;

/**
 *
 * @author damian
 */
public class Zadanie3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Fraction p = new Fraction(2, 3);        
        Fraction d = new Fraction(3, 4);        
        Fraction t = new Fraction(5, 6);
        
        Fraction wynik1 = new Fraction();
        Fraction wynik2 = new Fraction();
        Fraction wynik3 = new Fraction();
        
        System.out.print("Ułamki:\n");
        p.Show();
        d.Show();
        t.Show();
        
        System.out.print("Działanie: ");
        System.out.print("[(2/3 + 3/4) : 5/6] = ");
        wynik1 = p.Add(d).Divide(t);
        wynik1.Show();
        
        System.out.print("Po skroceniu = ");
        wynik1.Short();
        wynik1.Show();
        
        System.out.print("Działanie: ");
        System.out.print("(2/3 * 3/4 + 5/6) = ");
        wynik2 = p.Multiply(d).Add(t);
        wynik2.Show();
        
        System.out.print("Po skroceniu = ");
        wynik2.Short();
        wynik2.Show();
        
        System.out.print("Największy ułamek: ");
        wynik3 = wynik3.getGreater(wynik3.getGreater(p, d), t);
        wynik3.Show();
        
        System.out.print("Najmniejszy ułamek: ");
        wynik3 = wynik3.getSmaller(wynik3.getSmaller(p, d), t);
        wynik3.Show();
           
    }
    
}
