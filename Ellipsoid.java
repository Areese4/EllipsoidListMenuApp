package ellipsoidlistmenuapp;
import java.text.DecimalFormat;

public class Ellipsoid {
    // Fields
    
    private String label = " ";
    private double axesA = 0;
    private double axesB = 0;
    private double axesC = 0;
    
    // Constructor
    public Ellipsoid(String labelIn, double axesAIn, double axesBIn, 
            double axesCIn ) {
        
        label = labelIn;
        axesA = axesAIn;
        axesB = axesBIn;
        axesC = axesCIn;
        
    }
    
    public boolean setLabel(String labelIn) {
        if (labelIn != null) {
            label = labelIn;
            label = label.trim();
            return true;
        }
        return false;
    }
    
    public String getLabel() {
        return label;
    }
    
    public boolean setA(double axesAIn) {
        if (axesAIn > 0) {
            axesA = axesAIn;
            return true;
        }
        return false;
    }
    
    public double getA() {
        return axesA;
    }
    
    public boolean setB(double axesBIn) {
        if (axesBIn > 0) {
            axesB = axesBIn;
            return true;
        }
        return false;
    }
    
    public double getB() {
        return axesB;
    }
    
    public boolean setC(double axesCIn) {
        if (axesCIn > 0) {
            axesC = axesCIn;
            return true;
        }
        return false;
    }
    
    public double getC() {
        return axesC;
    }
    
    public double volume() {
        return ((4 * Math.PI * axesA * axesB * axesC)) / (3);
    }
    
    public double surfaceArea() {
        return (4 * Math.PI) * (Math.pow((((Math.pow((axesA * axesB), 1.6)) 
                + (Math.pow((axesA * axesC), 1.6)) + (Math.pow((axesB * axesC),
                        1.6))) / 3), 1 / 1.6));
    }
  
    public String toString() {
        
        DecimalFormat df = new DecimalFormat("#,##0.0###");
        
        String output = "Ellipsoid " + "\"" + label + "\"" + " with axes a = " 
                + axesA + ", b = " + axesB + ", c = " + axesC + " units has"
                + ": \n";
        output += "\tvolume = " + df.format(volume()) + " cube units\n";
        output += "\tsurface area = " + df.format(surfaceArea()) 
                + " square units";
        return output;
    }

}