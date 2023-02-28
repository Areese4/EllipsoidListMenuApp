Project: Ellipsoid List App Menu

This project contains a main method file, and two other java class files each doing a separate thing. The first class file is titled “Ellipsoid”, this class is to define the label and the three variables of the ellipsoid. This class also puts getter and setter methods for those variables then does the math needed to get the Total Volume and Total Surface area of an ellipsoid shape. Then finally sets a toString method to print the information out to the user.

The next Java class file contains a public class for Ellipsoid List which first sets a private string for the name of the list (string), sets an ArrayList of ellipsoid objects to ellipsoid list as a new array list. Once the Ellipsoid List method has been created it sets the name of the list to name of the list input. Then again for the ArrayList of ellipsoid objects. Then going down the class file a few more methods are defined and those are getName, numberOfEllipsoids, totalVolume, totalSurfaceArea, averageVolume, averageSurfaceArea, readFile, addEllipsoid, findEllipsoid, deleteEllipsoid, editEllipsoid, another toString method, and a summaryInfo method.

• getName Method: returns the listName defined earlier in the class

• numberOfEllipsoids Method: checks the newly defined ArrayList if it is empty or not. If it is the
method returns the number 0, and if it isn’t it returns the size of that ArrayList

• totalVolume and totalSurfaceArea Method: runs through a loop of the ArrayList of ellipsoid
objects getting corresponding information from the ellipsoid class of each ellipsoid and adding
them all and then returning the totals

• averageVolume and averageSurfaceArea Method: runs through a loop of the ArrayList of
ellipsoid objects getting the volume and surface area from the ellipsoid class of each ellipsoid
and dividing the total by the ArrayList size then returning the average

• readFile Method: takes the name of a file from the keyboard and stores it. Then defines a new
ArrayList of ellipsoid objects. Then while the file has a next line after the first line it defines
those lines as the label, variables a, b, and c and then returns a new EllipsoidList Object

• Add, Find, Delete, and Edit Methods: all check the ArrayList of Ellipsoid objects to do those
things defined in the method name.

• summaryInfo Method: prints the totals and averages when called in the main function


The main function, is where all of the previous methods called to work. As soon as the main function is written it defines a string to equal a message if the EllipsoidList object doesn’t have a testName. After that it goes on to make a new ArrayList full of Ellipsoid Objects called newList, then makes a new EllipsoidList object, and finally a new Scanner object for user input. As the program starts it gives a list like the one provided below:
 
The machine then runs through a do-while loop until the user enters ‘Q’. While this runs each option will call its corresponding method defined in the EllipsoidList class file by which a ‘switch’ statement is used.

• R - Read File and Create Ellipsoid List: Asks the user for the name of the file they would like to input. Then the file values are stored in the EllipsoidList object. Machine’s output image below.

• P - Print Ellipsoid List: Will print all information for each individual ellipsoid in the ArrayList of ellipsoid objects. Machine’s output image below.
• S - Print Summary: This choice will give all the totals and average values of all Ellipsoids in the ArrayList of Ellipsoid objects. Machine’s output image below.

• A – Add Ellipsoid: Adds a new ellipsoid to the ArrayList of Ellipsoid Objects. Machine’s output image below.

• D – Delete Ellipsoid: Calls the findEllipsoid method to locate an ellipsoid in the ArrayList based on if the user’s info entered matches the label of an Ellipsoid in the ArrayList. If it does the Ellipsoid is removed from the ArrayList, if nothing is found it will print that. Machine’s output image below.

• F – Find Ellipsoid: Run through the ArrayList of Ellipsoids to see if the label entered by the user matches any of the labels in the ArrayList. If so, the machine prints the information of that specific Ellipsoid, and if not, the machine prints out that the Ellipsoid was not found. Machine’s output image below.

• E – Edit Ellipsoid: Calls the findEllipsoid method defined in the EllipsoidList class to make sure the ellipsoid in the ArrayList matches what the user is trying to edit. If it does match the user then can edit the values of that Ellipsoid, and if not, the machine will print that the Ellipsoid the user wanted to edit was not found. Machine’s output image below.

• Q – Quit: When the user enters the letter ‘Q’, the do-while loop breaks and the program ends.

• Default: Not listed but equally important to the ‘switch statement’. If the user enters a letter not given as an option this will print out saying the input was an invalid input and start the loop over again. Machine’s output image below.
