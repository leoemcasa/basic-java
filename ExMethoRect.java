public class ExMethoRect {
    
    
    static int area( int length, int width ) {
        // Finsh writing the method code here
        return length * width;
    }
    
    static int area( int length ) {
        // Finsh writing the method code here
        return length * 10;
    }
    
    static int perimeter( int length, int width ) {
        // Finsh writing the method code here
        return 2 * (length + width);
    }
    
    static int perimeter( int length ) {
        // Finsh writing the method code here
        return 2 * (length + 10);
    }
    
    
    public static void main(String[] args) {
        
        // Do not change the code in the main method
        
        System.out.println("Area with length 20 and width 10:" );
        System.out.println( area(20, 10) );
    
        System.out.println( "Area with length 20:" );
        System.out.println( area(20) );
    
        System.out.println( "Perimeter with length 20 and width 10:" );
        System.out.println( perimeter(20, 10) );
    
        System.out.println( "Perimeter with length 20:" );
        System.out.println( perimeter(20) );
    
    }

}
