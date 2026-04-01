/* This is a stub for the House class */

import java.util.ArrayList;
/**
 * The House class for tracking residents, checking dining room availability and managing move in and move out 
 * A House extends Building and implements HouseRequirements.
 */
public class House extends Building implements HouseRequirements{

  private ArrayList<Student> residents;
  private boolean hasDiningRoom;

  /**
   * Constructs a new House object with the given name, address, number of floors and whether it has a dining room.
   * 
   * @param name the name of the house
   * @param address the street address of the house
   * @param nFloors the number of floors in the house
   * @param hasDiningRoom whether the house has a dining room
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {

    super(name, address, nFloors);
    this.residents = new ArrayList<Student>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Returns whether the house has a dining room.
   *
   * @return true if the house has a dining room, false otherwise
  */

  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  /**
   * Returns the number of residents currently living in the house.
   *
   * @return the number of residents
  */

  public int nResidents(){
    return this.residents.size();
  }

  /**
    * Moves a student into the house, if they are not already a resident.
    *
    * @param s the Student to move in
  */

  public void moveIn(Student s){
    if(!this.residents.contains(s)){
      this.residents.add(s);
    }

  }

  /**
   * Moves a student out of the house, if they are currently a resident.
   *
   * @param s the Student to move out
   * @return the Student who moved out, or null if they were not a resident
  */
  public Student moveOut(Student s){

    if (this.residents.contains(s)){
      this.residents.remove(s);
      return s;
        } 
        return null;   

    }

  /**
   * Checks whether a given student is currently a resident of the house.
   *
   * @param s the Student to check
   * @return true if the student is a resident, false otherwise
  */   

  public boolean isResident(Student s){

    return this.residents.contains(s);
    
  }
  /**
   * A simple test method for the House class.
   * Demonstrates moving students in and out of the house.
  */
    
  public static void main(String[] args) {
    House h = new House("Cutter House", "10 Prospect St", 5);
    Student s1 = new Student ("Elyse", "1234", 2027);
    Student s2 = new Student ("Hia", "4321", 2027);

    h.moveIn(s1);
    h.moveIn(s2);
    System.out.println("Residents: "+h.nResidents());
    h.moveOut(s1);
    System.out.println("Residents: "+h.nResidents());

  }

}