import java.util.ArrayList;

public class PropertyRegister {
    /**
     * A class that represents the property register. It utilizes an arraylist of the Property class.
     * I have chosen to use an arraylist because of the easy way to add and remove items, compared to an array.
     */
    public final ArrayList<Property> properties = new ArrayList<>();

    public PropertyRegister() {
    }

    /**
     * A method that searches through the arraylist of properties and returns the first property it finds where all
     * parameters are equal to the given arguments. All parameters must be found. Returns null if no property is found.
     *
     * @param municipalityNumber the given municipality number to search for.
     * @param propertyNumber     the given property number to search for.
     * @param sectionNumber      the given section number to search for.
     * @return the property with exact matching values, null if none is found.
     */
    public Property findProperty(int municipalityNumber, int propertyNumber, int sectionNumber) {
        for (Property property : this.properties) {
            if (property.getMunicipalityNumber() == municipalityNumber &&
                    property.getPropertyNumber() == propertyNumber &&
                    property.getSectionNumber() == sectionNumber) {
                return property;
            }
        }
        return null;
    }

    /**
     * Generates and adds a new property with the given values to the arraylist.
     *
     * @param municipalityNumber the number of the municipality in which the property lies.
     * @param municipalityName   name of the municipality in which the property lies.
     * @param propertyNumber     property number of the property to add. Must be an integer larger than 0.
     * @param sectionNumber      section number of the property to add. Must be an integer larger than 0.
     * @param nameOfProperty     name of the property to add, can be an empty string.
     * @param area               area of the property to add. Must be a double larger than 0.
     * @param nameOfOwner        name of the owner of the property.
     * @return true if successfully added, false if there was an error.
     */
    public boolean addProperty(int municipalityNumber, String municipalityName, int propertyNumber, int sectionNumber, String nameOfProperty, double area, String nameOfOwner) {
        // Validating the numbers in separate if/else if statements, so it'll be easy to add more.
        if (municipalityNumber < 101 || municipalityNumber > 5054) {
            return false;
        } else if (propertyNumber < 0 || sectionNumber < 0 || area < 0) {
            return false;
        } else if (nameOfProperty.equals("")) {
            nameOfProperty = "\t\t";
        } else if (nameOfOwner.equals("")) {
            System.out.print("Error: Could not add property to register. Owner's name can not be an empty string.");
            return false;
        }

        // If all values are correct, add the property to the register and return true
        this.properties.add(new Property(municipalityNumber, municipalityName, propertyNumber, sectionNumber, nameOfProperty, area, nameOfOwner));
        return true;
    }

    /**
     * Searches through the register and removes the property with matching parameters, if found.
     *
     * @param municipalityNumber municipality number to search for.
     * @param propertyNumber     property number to search for.
     * @param sectionNumber      section number to search for.
     * @return true if successfully removed, false if not found.
     */
    public boolean removeProperty(int municipalityNumber, int propertyNumber, int sectionNumber) {
        Property propertyToRemove = this.findProperty(municipalityNumber, propertyNumber, sectionNumber);

        if (propertyToRemove == null) {
            return false;
        }
        this.properties.remove(propertyToRemove);
        return true;
    }

    /**
     * Method to calculate average area. Loops through register, sums up the areas and divides total area by number of properties.
     *
     * @return the average area of all properties in the register as a boolean.
     */
    public double getAverageArea() {
        double sum = 0;
        for (Property property : this.properties) {
            sum += property.getArea();
        }
        return sum / this.properties.size();
    }

    /**
     * A search method that finds all properties in the register with property number matching the given argument.
     *
     * @param propertyNumber property number to search for.
     * @return an arraylist of the properties with correct property number. Returns null if there is none.
     */
    public ArrayList<Property> getPropertiesWithPropertyNumber(int propertyNumber) {
        ArrayList<Property> propertiesWithPropertyNumber = new ArrayList<>();
        for (Property property : this.properties) {
            if (property.getPropertyNumber() == propertyNumber) {
                propertiesWithPropertyNumber.add(property);
            }
        }
        if (propertiesWithPropertyNumber.isEmpty()) {
            return null;
        }
        return propertiesWithPropertyNumber;
    }

    /**
     * Simple method to get amount of properties in the register.
     *
     * @return the amount of properties in the register as an integer.
     */
    public int getAmountOfProperties() {
        return this.properties.size();
    }

    /**
     * Returns a string with all the IDs of the properties in the register.
     * @return a string with all the IDs of the properties in the register.
     */
    public String printIDs() {
        String returnString = "";
        for (Property property: this.properties) {
            returnString += "\n" + property.getID();
        }
        return returnString;
    }

    @Override
    public String toString() {
        return "PropertyRegister{" +
                "properties=" + properties +
                '}';
    }
}
