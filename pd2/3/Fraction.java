
package zadanie3;

/**
 *
 * @author damian
 */
public class Fraction 
{
    private int numerator = 0;    
    private int denumerator = 0;
    
    Fraction()
    {
        SetValue(1, 1);
    }
    
    Fraction(Integer n, Integer d)
    {
       SetValue(n, d);
    }

    private void SetValue(Integer n, Integer d)
    {
        this.numerator = n;
        if(d == 0) this.denumerator = 1;
        else this.denumerator = d;
    }
    
    public void Show()
    {
        System.out.print(this.numerator + "/" + this.denumerator + "\n");
    }
    
    public Fraction Add(Fraction x)
    {
        Fraction o = new Fraction(this.numerator, this.denumerator);        
        Fraction t = new Fraction(x.numerator, x.denumerator);
        commonDe(o, t);

        o.numerator += t.numerator;
        return o;
    }
    
    public Fraction Subtract(Fraction x)
    {
        Fraction o = new Fraction(this.numerator, this.denumerator);        
        Fraction t = new Fraction(x.numerator, x.denumerator);
        commonDe(o, t);

        o.numerator -= t.numerator;
        return o;
    }
    
    public Fraction Multiply(Fraction x)
    {
        Fraction o = new Fraction(this.numerator, this.denumerator);        
        Fraction t = new Fraction(x.numerator, x.denumerator);
        
        o.numerator *= t.numerator;
        o.denumerator *= t.denumerator;
        return o;   
    }
    
    public Fraction Divide(Fraction x)
    {
        Fraction o = new Fraction(this.numerator, this.denumerator);        
        Fraction t = new Fraction(x.numerator, x.denumerator);
        
        o.numerator *= t.denumerator;
        o.denumerator *= t.numerator;
        return o;   
    }
    
    public Fraction getGreater(Fraction f, Fraction s)
    { 
        double first = (double)f.numerator / (double)f.denumerator;        
        double second = (double)s.numerator / (double)s.denumerator;

        if(first > second) return f;
        else return s;
    }
    
     public Fraction getSmaller(Fraction f, Fraction s)
    { 
        double first = (double)f.numerator / (double)f.denumerator;        
        double second = (double)s.numerator / (double)s.denumerator;

        if(first > second) return s;
        else return f;
    }
    
    public void Short()
    {
        int t = NWD(this.numerator, this.denumerator);
        this.numerator /= t;
        this.denumerator /= t;
    }
    
    private int NWD(int a, int b)
    {
        while (a != b)
        {
            if (a > b) a -= b;
            else b -= a;
        }   
        return a;
    }
    
    private void commonDe(Fraction o, Fraction t)
    {
        Fraction tmp = new Fraction(t.numerator, t.denumerator);   
        if(o.denumerator != t.denumerator)
        {
            t.numerator *= o.denumerator;
            t.denumerator *= o.denumerator;
            
            o.denumerator *= tmp.denumerator;
            o.numerator *= tmp.denumerator;
        }
    }
}
