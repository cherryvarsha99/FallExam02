/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Sai Varsha Vellanki
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create object to corresponding classes and assign to PErson referecne  
        Person person = new Person("Varsha", "Horizons apt", "676789898",
                "varsha.vellanki@gmail.com");
        Person student = new Student("A", "Varsha", "Horizons apt", "676789898",
                "varsha.vellanki@gmail.com");
        Person employee = new Employee("MBS Building", 12000, "12/23/2015", "kumar", "NWMSU", "676789898",
                "kumar@gmail.com");
        Person faculty = new Faculty(8, 2, "MBS Building", 12000, "12/23/2015", "kumar", "NWMSU", "676789898",
                "kumar@gmail.com");
        Person staff = new Staff("proffessor", "MBS Building", 12000, "12/23/2015", "kumar", "NWMSU", "676789898",
                "denise@gmail.com");
        // printthe toString() of each class 
        System.out.println(person.toString() + "\n");
        System.out.println(student.toString() + "\n");
        System.out.println(employee.toString() + "\n");
        System.out.println(faculty.toString() + "\n");
        System.out.println(staff.toString() + "\n");
    }

}
