package Homework2;

 class Quadratic {
    private int a, b, c;
    private String comment;
    
    public Quadratic( int newA, int newB, int newC )
    {
        setA( newA );
        setB( newB );
        setC( newC );
    }
    
    private int discriminant( )
    {
        return ( ( b * b ) - 4 * a * c );
    }
    
    @Override
    public boolean equals( Object o )
    {
         if( !( o instanceof Quadratic) )
            return false;
        else
        {
            Quadratic equation = (Quadratic) o;
            if( a == equation.a && b == equation.b && c == equation.c )
                return true;
            else 
                return false;
        }
    }
    
    public int getA( )
    {
        return a;
    }

    public int getB( )
    {
        return b;
    }
    
    public int getC( )
    {
        return c;
    }
    
    public String getComment( )
    {
        return comment;
    }
    
    public boolean hasDistinctRealRoots( )
    {
       return discriminant() > 0;
    }
    
    public boolean hasDoubleRealRoots( )
    {
        return discriminant() == 0;
    }
    
    public void setA( int newA )
    {
        a = newA;
    }
    
    public void setB( int newB )
    {
        b = newB;
    }
    
    public void setC( int newC )
    {
        c = newC;
    }
    
    public ComplexPair solveQuadratic()
    {
        double root1, root2; 
        if( hasDistinctRealRoots() == true)
            {
                /*
                    gets the two distinct real roots for the equation then creates
                    a Complex object for each root. Which is then used to create
                    a ComplexPair object that has both real roots for the return. 
                */
               if( a == 0 )
                    {
                        root1 = Math.negateExact( c ) / (double) b;             
                        Complex num1 = new Complex(root1, 0);
                        Complex num2 = num1; 
                                    
                        ComplexPair num3 = new ComplexPair(num1, num2);
                        return num3;
                    }
                 else if( b == 0)
                    {
                        if( a > 0 )
                            {
                                if(c > 0)
                                    {                                            
                                        root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        Complex num1 = new Complex(0, root1);
                                        Complex num2 = new Complex(0, root2);
                                            
                                        ComplexPair num3 = new ComplexPair(num1, num2);
                                        return num3; 
                                    }
                                
                                else
                                   {
                                        root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        Complex num1 = new Complex(0, root1);
                                        Complex num2 = new Complex(0, root2);
                                            
                                        ComplexPair num3 = new ComplexPair(num1, num2);
                                        return num3; 
                                   }
 
                            }
                        
                        else if( a < 0)
                            {
                                if(c > 0)
                                    {                                
                                        root1 = ( -b + Math.sqrt( discriminant() ) ) / (2 * a);
                                        root2 = ( -b - Math.sqrt( discriminant() ) ) / (2 * a); 
                                        Complex num1 = new Complex(root1, 0);
                                        Complex num2 = new Complex(root2, 0);
                                                    
                                        ComplexPair num3 = new ComplexPair(num1, num2);
                                        return num3; 
                                    }
                                
                                    else
                                        {
                                            root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                            root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                            Complex num1 = new Complex(0, root1);
                                            Complex num2 = new Complex(0, root2);
                                        
                                            ComplexPair num3 = new ComplexPair(num1, num2);
                                            return num3;            
                                        }
                                }
                    }
               
                root1 = ( (-b + Math.sqrt( discriminant() ) ) / (2 * a) );
                root2 = ( (-b - Math.sqrt( discriminant() ) ) / (2 * a) );
                
                Complex num1 = new Complex(root1, 0);        
                Complex num2 = new Complex(root2, 0); 
                ComplexPair num3 = new ComplexPair(num1, num2);
                return num3;
                
            }
            else if(hasDoubleRealRoots() == true)
                {
                    /*
                        Creates an object that holds the double root for the
                        equation. Since the discriminant equals zero the roots
                        are the same. A Complex object was created for each root.
                        Which was used to create a ComplexPair object to return. 
                    */
                   if( a == 0 )
                    {
                        root1 = Math.negateExact( c ) / (double) b; 
                                    
                        Complex num1 = new Complex(root1, 0);
                        Complex num2 = num1; 
                                    
                        ComplexPair num3 = new ComplexPair(num1, num2);
                        return num3;
                    }
                 else if( b == 0)
                    {
                        if( a > 0 )
                            {
                                if(c > 0)
                                    {                                            
                                        root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        Complex num1 = new Complex(0, root1);
                                        Complex num2 = new Complex(0, root2);
                                            
                                        ComplexPair num3 = new ComplexPair(num1, num2);
                                        return num3; 
                                    }
                                
                                else
                                   {
                                        root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                        Complex num1 = new Complex(0, root1);
                                        Complex num2 = new Complex(0, root2);
                                            
                                        ComplexPair num3 = new ComplexPair(num1, num2);
                                        return num3; 
                                   }
 
                            }
                        
                        else if( a < 0)
                            {
                                if(c > 0)
                                    {                                
                                        root1 = ( -b + Math.sqrt( discriminant() ) ) / (2 * a);
                                        root2 = ( -b - Math.sqrt( discriminant() ) ) / (2 * a); 
                                        Complex num1 = new Complex(root1, 0);
                                        Complex num2 = new Complex(root2, 0);
                                                    
                                        ComplexPair num3 = new ComplexPair(num1, num2);
                                        return num3; 
                                    }
                                
                                    else
                                        {
                                            root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                            root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                            Complex num1 = new Complex(0, root1);
                                            Complex num2 = new Complex(0, root2);
                                        
                                            ComplexPair num3 = new ComplexPair(num1, num2);
                                            return num3;            
                                        }
                                }
                    }
                    root1 = ( (-b + Math.sqrt( discriminant() ) ) / (2 * a) );
                    root2 = root1;
                
                    Complex num1 = new Complex(root1, 0);
                    Complex num2 = new Complex(root2, 0); 
                
                    ComplexPair num3 = new ComplexPair(num1, num2);
                    return num3; 
                }
                else if(discriminant() < 0) 
                    {   /*
                        This is for if the discriminant is a negative number or
                        complex. I used Math.abs to convert the discriminant to 
                        a positive number. So that the imaginary number is still
                        correct instead of giving NaN.
                    
                        Then I put each root into their own Complex object. With
                        those Complex objects I created a ComplexPair. 
                         */
                        if( a == 0 )
                            {
                                root1 = Math.negateExact( c ) / (double) b; 
                                    
                                Complex num1 = new Complex(root1, 0);
                                Complex num2 = new Complex(0, 0); 
                                    
                                ComplexPair num3 = new ComplexPair(num1, num2);
                                return num3;
                            }
                        else if( b == 0)
                            {
                                if( a > 0 )
                                    {
                                        if(c > 0)
                                            {                                            
                                                root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                                root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                                Complex num1 = new Complex(0, root1);
                                                Complex num2 = new Complex(0, root2);
                                            
                                                ComplexPair num3 = new ComplexPair(num1, num2);
                                                return num3; 
                                            }
                                
                                        else
                                            {
                                                root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                                root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                                Complex num1 = new Complex(0, root1);
                                                Complex num2 = new Complex(0, root2);
                                            
                                                ComplexPair num3 = new ComplexPair(num1, num2);
                                                return num3; 
                                            }
                                    }
                        
                                else if( a < 0)
                                    {
                                        if(c > 0)
                                            {                                
                                                root1 = ( -b + Math.sqrt( discriminant() ) ) / (2 * a);
                                                root2 = ( -b - Math.sqrt( discriminant() ) ) / (2 * a); 
                                                Complex num1 = new Complex(root1, 0);
                                                Complex num2 = new Complex(root2, 0);
                                                    
                                                ComplexPair num3 = new ComplexPair(num1, num2);
                                                return num3; 
                                            }
                                
                                        else
                                            {
                                                root1 = -b + Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                                root2 = -b - Math.sqrt( Math.abs( discriminant() ) ) / (2 * a);
                                                Complex num1 = new Complex(0, root1);
                                                Complex num2 = new Complex(0, root2);
                                        
                                                ComplexPair num3 = new ComplexPair(num1, num2);
                                                return num3;            
                                            }
                                    }
                            }
                        
                        root1 = ( (-b + Math.sqrt( Math.abs( discriminant() ) ) ) / (2 * a) );
                        root2 = ( (-b - Math.sqrt( Math.abs( discriminant() ) ) ) / (2 * a) );
                       
                        Complex num1 = new Complex(0, root1);
                        Complex num2 = new Complex(0, root2);
                       
                        ComplexPair num3 = new ComplexPair( num1, num2);
                        return num3; 
                    }
                        
        root1 = 0.0;
        root2 = root1;
        Complex num1 = new Complex(root1, root2);
        Complex num2 = num1;
        ComplexPair num3 = new ComplexPair(num1, num2);
        return num3; 
    } //end solveQuadratic 
    
    @Override
    public String toString( )
    {
        return "Equation: " + (a == 1 ? "x^2" : (a == -1 ? "-x^2" : (a == 0 ? "" : a + "x^2") ) ) + 
                (b == 1 ? "x" : (b == -1 ? "-x" : (b > 0 ? " + " + b + "x" : (b == 0 ? "" : b + "x") ) ) )
                + " " + (c > 0 ? "+ " + c : c); 
    }
    
    
}
