// HW 7/6 Start Designing Animal class
// Species, Population
// Use good class design (getters/setters)

// Also be able to create Animal objects

public class Student {
    // Attributes (variables)
    // What properties do objects of this class have --> What properties does any particular Student have

    private String name;
    private int id;
    private String favoriteClass;

    // Constructors
    public Student(){ // default constructor
        name = "Gary";
        id = 0;
        favoriteClass = "none";
    }

    public Student(String name, int id, String favoriteClass){
        this.name = name;
        setID(id);
        setFavoriteClass(favoriteClass);
    }

    // public vs private vs protected --> Accessibility keywords
    // generally, we want to avoid public when possible
    // private means only the class can access the variable/function

    // GPA -> grade point average = gradePoints / gradingScale  4.0
    private double gradePoints; // public doesn't make sense here since we wouldn't ask for a Student's gradePoints

    public double calculateGPA(){ // public is good here since we want others to be able to access the Student's GPA
        return gradePoints / 4.0;
    }

    // public means anyone can access the field and so ANYONE or ANYTHING can change the values as well
    // We can avoid public keyword for variables by using Getters and Setters

    // Getters and Setters are PUBLIC FUNCTIONS that change/retrieve the value of private variables

    // Setters return void because you're just changing the value of the variable
    // Setters have at least one parameter
    public void setName(String newName){ // Setter for name variable
        name = newName;
    }
    public void setID(int id){ // Function with variable parameter "id"; We also have an object (us) that also has a variable "id"
        this.id = id; // this refers to the object
    }
    public void setFavoriteClass(String favClass){
        this.favoriteClass = favClass; // "this" keyword can still be used to specify the object's variable
    }

    // Getters --> returns the value stored in a private variable
    // Getters don't have parameters
    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
    public String getFavoriteClass(){
        return favoriteClass;
    }

}

class Classroom{
    Student[] students;
    Student bestStudent;

    public double getAverageGPA(){
        // for every student, get the GPA and add it to the total
        // return totalGPAs / numOfStudents
        return 0.0;
    }

    public void studentNameChange(){
        bestStudent.setName("Harold");
    }

    public void printStudents(){
        // Get each student
        Student s = new Student("Abby", 14569, "History");

        System.out.println(s.getName());
    }
}
