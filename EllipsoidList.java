package ellipsoidlistmenuapp;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.*;


public class EllipsoidList {
    //Field
    private String listName;
    ArrayList<Ellipsoid> ellipsoidList = new ArrayList<>();

    //Constructor
    public EllipsoidList(String listNameIn, ArrayList<Ellipsoid> ellipsoidListIn) {
        listName = listNameIn;
        ellipsoidList = ellipsoidListIn;
        
    }
    //Methods
    public String getName() {
        return listName;
    }
    
    public int numberofEllipsoids() {
        if (ellipsoidList.isEmpty()) {
            return 0;
        }
            return ellipsoidList.size();
    }
    
    public double totalVolume() {
        double totalV = 0;
        for (int index = 0; index < ellipsoidList.size(); index++) {
            Ellipsoid ellipsoid = ellipsoidList.get(index);
            totalV += ellipsoid.volume();
        }
        return totalV;
    }
    
    public double totalSurfaceArea() {
        double totalSA = 0;
        for(int index = 0; index < ellipsoidList.size(); index++) {
            Ellipsoid ellipsoid = ellipsoidList.get(index);
            totalSA += ellipsoid.surfaceArea();
        }
        return totalSA;
    }
    
    public double averageVolume() {
        double average = 0;
        int index = 0;
        
        while (index < ellipsoidList.size()) {
            average += ellipsoidList.get(index).volume();
            index++;
        }
        
        if (index == 0) {
            average = 0;
        } else {
            average = average / index;
        }
        return average;
    }
    
    public double averageSurfaceArea() {
        double average = 0;
        int index = 0;
        
        while (index < ellipsoidList.size()) {
            average += ellipsoidList.get(index).surfaceArea();
            index++;
        }
        
        if (index == 0) {
            average = 0;
        } else {
            average = average / index;
        }
        return average;
    }

    public EllipsoidList readFile(String fileName) throws FileNotFoundException {
        Scanner file = new Scanner(new File(fileName));
        String testName = file.nextLine().trim();
        ArrayList <Ellipsoid> newList = new ArrayList();
        
            while(file.hasNext()) {
                String label = file.nextLine().trim();
                double a = Double.parseDouble(file.nextLine());
                double b = Double.parseDouble(file.nextLine());
                double c = Double.parseDouble(file.nextLine());
                Ellipsoid ellipsoid = new Ellipsoid(label, a, b, c);
                newList.add(ellipsoid);
        }
            return new EllipsoidList(testName, newList);
    }
    
    public void addEllipsoid(String label, double a, double b, double c) {
        Ellipsoid addingEllipsoid = new Ellipsoid(label, a, b, c);
        ellipsoidList.add(addingEllipsoid);
        
    }
   
    
    public Ellipsoid findEllipsoid(String label) {
        for (Ellipsoid ellipsoid : ellipsoidList) {
            if (ellipsoid.getLabel().equalsIgnoreCase(label)) {
                return ellipsoid;
            }
        }
        return null;
    }
   
    
    public void deleteEllipsoid(String label) {
        Ellipsoid ellipsoidDeleting = findEllipsoid(label);
        if (ellipsoidDeleting != null) {
            ellipsoidList.remove(ellipsoidDeleting);
            System.out.println("\t\"" + label + "\"" + " deleted\n");
        } else {
            System.out.println("\t\"" + label + "\"" + " not found\n");
        }
    }
    
 
    public Ellipsoid editEllipsoid(String label, double a, double b, double c) {
        Ellipsoid ellipsoid = findEllipsoid(label);
        
            if (ellipsoid != null) {
            ellipsoid.setA(a);
            ellipsoid.setB(b);
            ellipsoid.setC(c);
            return ellipsoid;
        }
        return null;
    }
  
    
    public String toString() {
        String output = getName() + "\n";
        int index = 0;
        
        while (index < ellipsoidList.size()) {
            output += "\n" + ellipsoidList.get(index) + "\n";
            index++;
        }
        return output;
    }
    
    public String summaryInfo() {
        DecimalFormat df = new DecimalFormat("#,##0.###");
        String result = "";
        result += "\n----- Summary for Ellipsoid Test List -----\n";
        result += "Number of Ellipsoid Objects: " + ellipsoidList.size() + "\n";
        result += "Total Volume: " + df.format(totalVolume()) + " cubic units\n";
        result += "Total Surface Area: " + df.format(totalSurfaceArea()) + " cubic units\n";
        result += "Average Volume: " + df.format(averageVolume()) + " cubic units\n";
        result += "Average Surface Area: " + df.format(averageSurfaceArea()) + " cubic units\n";
        return result;
    }
}