package ellipsoidlistmenuapp;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class EllipsoidListMenuApp {

    public static void main(String[] args) throws FileNotFoundException {
        String noList = "*** no list name assigned ***";
        ArrayList<Ellipsoid> newList = new ArrayList<>();
        EllipsoidList newEllipList = new EllipsoidList(noList, newList);
        Scanner userInput = new Scanner(System.in);
      
        System.out.println("Ellipsoid List System Menu");
        System.out.println("R - Read File and Create Ellipsoid List");
        System.out.println("P - Print Ellipsoid List");
        System.out.println("S - Print Summary");
        System.out.println("A - Add Ellipsoid");
        System.out.println("D - Delete Ellipsoid");
        System.out.println("F - Find Ellipsoid");
        System.out.println("E - Edit Ellipsoid");
        System.out.println("Q - Quit");
        char choice = 'Q';
        
        do {
            
            System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
            choice = userInput.nextLine().toUpperCase().charAt(0);
            
            switch (choice) {
                case 'R':
                    // Read File and Create Ellipsoid List
                    System.out.print("\tFile Name: ");
                    String fileName = userInput.nextLine();
                    System.out.println("\tFile read in and Ellipsoid List Created\n");
                    newEllipList = newEllipList.readFile(fileName);
                    
                break;
                
                case 'P':
                    // Print EllipsoidList
                    System.out.println(newEllipList.toString());
                    
                break;

                case 'S':
                    //Print Summary
                    System.out.println(newEllipList.summaryInfo());
                    
                break;

                case 'A':
                    // Add Ellipsoid
                    System.out.print("\tLabel: ");
                    String addLabel = userInput.nextLine().trim();
                    
                    System.out.print("\ta: ");
                    double addA = userInput.nextDouble();
                    userInput.nextLine(); 
                    
                    System.out.print("\tb: ");
                    double addB = userInput.nextDouble();
                    userInput.nextLine(); 
                    
                    System.out.print("\tc: ");
                    double addC = userInput.nextDouble();
                    userInput.nextLine(); 
                    
                    newEllipList.addEllipsoid(addLabel, addA, addB, addC);
                    System.out.println("\t*** Ellipsoid added ***\n");
                    
                break;

                case 'D':
                    //Delete Ellipsoid
                    System.out.print("\tlabel: ");
                    String dLabel = userInput.nextLine().trim();
                    newEllipList.deleteEllipsoid(dLabel);
                    
                break;

                case 'F':
                    //Find Ellipsoid
                    System.out.print("\tLabel: ");
                    String fLabel = userInput.nextLine().trim();
                    Ellipsoid Find = newEllipList.findEllipsoid(fLabel);
                    
                    if (Find != null && !fLabel.isEmpty()) {
                        System.out.println(Find.toString() + "\n");
                    } else {
                        System.out.println("\t\"" + fLabel + "\"" + " not found\n");
                        
                    }
                    
                break;

                case 'E':
                    //Edit Ellipsoid
                    System.out.print("\tLabel: ");
                    String eLabel = userInput.nextLine().trim();
                    Ellipsoid ellipToEdit = newEllipList.findEllipsoid(eLabel);
                    
                    if (ellipToEdit != null && !eLabel.isEmpty()) {
                        System.out.print("\ta: ");
                        double editA = userInput.nextDouble();
                        userInput.nextLine(); 
                       
                        System.out.print("\tb: ");
                        double editB = userInput.nextDouble();
                        userInput.nextLine(); 
                   
                        System.out.print("\tc: ");
                        double editC = userInput.nextDouble();
                        userInput.nextLine(); 
  
                        newEllipList.editEllipsoid(eLabel, editA, editB, editC);
                        System.out.println("\t\"" + eLabel + "\"" + " successfully edited\n");
                    } else {
                        System.out.println("\t\"" + eLabel + "\"" + " not found\n");
                    }
                    
                break;
                
                case 'Q':
                    //Quit program
                    System.out.print("\n");
                    
                break;

                default:
                    System.out.println("\t*** invalid code ***\n");
                    
            }
        } while (choice != 'Q');
    }
}
