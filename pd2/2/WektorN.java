
package zadanie2;

/**
 *
 * @author damian
 */
import java.lang.Math;

public class WektorN {
    private int n = 3;
    private String nazwa = "w";
    private double x[];
    
    public WektorN()
    {
        x = new double[n];
    }
    
    public WektorN(double t[])
    {
        n = t.length;
        x = new double[n];
        x = t.clone();
    }
    
    public void pokaz()
    {
        System.out.printf("\n%s [", this.nazwa);
        for(int i = 0; i < x.length; i++)
        {
            System.out.print(x[i]);
            if(i < x.length - 1) System.out.print(", ");
        }
        System.out.print("]\n");
    }
    
    public double oblicz_dlugosc_wektora()
    {
        double suma = 0;
        for(int i = 0; i < x.length; i++)
        {
            suma += Math.pow(x[i], 2);
        }
        return Math.sqrt(suma);
    }
 
    public WektorN dodaj_wektory(WektorN a)
    {
        WektorN s = new WektorN(this.x);

        for(int i = 0; i < x.length; i++)
        {
            s.x[i] = this.x[i] + a.x[i];
            System.out.print("t ");
        }
        return s;
    }
    
    public WektorN odejmij_wektory(WektorN a)
    {
        WektorN s = new WektorN(this.x);

        for(int i = 0; i < x.length; i++)
        {
            s.x[i] = this.x[i] - a.x[i];
        }
        return s;
    }
    
    public double iloczyn_skalarny_wektorow(WektorN a)
    {
        double s = 0;
        for(int i = 0; i < x.length; i++)
        {
            s += this.x[i] * a.x[i];
        }
        return s;
    }
}
