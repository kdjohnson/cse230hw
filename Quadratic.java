package Quadratic;

 class Quadratic {
    private int a, b, c;
    private String comment;
    
    public Quadratic( int newA, int newB, int newC )
    {
        setA( newA );
        setB( newB );
        setC( newC );
    }
    
    /**
     * @return int - the discriminant based off of the 
     * values of variables a, b, and c.
    */
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
    
    /**
     * @return boolean - whether the equation has Distinct Real Roots or not based on whether the discriminant is > 0 
    */
    public boolean hasDistinctRealRoots( )
    {
       return discriminant( ) > 0;
    }
    
    /**
     * @return boolean - whether the equation has Double Real Roots or not based on whether the discriminant is equal to 0 
    */
    public boolean hasDoubleRealRoots( )
    {
        return discriminant( ) == 0;
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
                root1 = ( (-b + Math.sqrt( discriminant() ) ) / (2 * a) );
                root2 = ( (-b - Math.sqrt( discriminant() ) ) / (2 * a) );
                
                Complex num1 = new Complex(root1, 0);
                Complex num2 = new Complex(root2, 0);
                
                ComplexPair num3 = new ComplexPair(num1, num2);
                return num3;
                
            }
            else if( hasDoubleRealRoots() == true )
                {
                    /*
                        Creates an object that holds the double root for the
                        equation. Since the discriminant equals zero the roots
                        are the same. A Complex object was created for each root.
                        Which was used to create a ComplexPair object to return. 
                    */
                    
                    root1 = ( (-b + Math.sqrt( discriminant() ) ) / (2 * a) );
                    root2 = root1;
                
                    ComplexPair num4 = new ComplexPair(root1, 0);
                    //ComplexPair num5 = new Complex(root2, 0); 
                
                    ComplexPair num6 = new ComplexPair(num4, num5);
                    return num6; 
                }
                else
                {   /*
                        This is for if the discriminant is a negative number or
                        complex. I used Math.abs to convert the discriminant to 
                        a positive number. So that the imaginary number is still
                        correct instead of giving NaN.
                    
                        Then I put each root into their own Complex object. With
                        those Complex objects I created a ComplexPair. 
                    */
                       root1 = ( (-b + Math.sqrt( Math.abs( discriminant() ) ) ) / (2 * a) );
                       root2 = ( (-b + Math.sqrt( Math.abs( discriminant() ) ) ) / (2 * a) );
                       
                       Complex num7 = new Complex(0, root1);
                       Complex num8 = new Complex(0, root2);
                       
                       ComplexPair num9 = new ComplexPair( num7, num8);
                       return num9; 
                }
        
            
    }
    
    @Override
    public String toString( )
    {
        return "Number a is: " + getA( )
                + "Number b is: " + getB( )
                + "Number c is: " + getC( )
                + "The comment is: " + getComment( );
    }
    
    
}
