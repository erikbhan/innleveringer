public class Property {
    /**
     * A class that represents a property. It is immutable because there is no requirement for it to change in the task.
     */
    private final int municipalityNumber;
    private final String municipalityName;
    private final int propertyNumber; // Property number, not lot number, to keep consistency.
    private final int sectionNumber;
    private final String nameOfProperty;
    private final double area;
    private final String nameOfOwner;

    public Property(int municipalityNumber, String municipalityName, int propertyNumber, int sectionNumber, String nameOfProperty, double area, String nameOfOwner) {
        this.municipalityNumber = municipalityNumber;
        this.municipalityName = municipalityName;
        this.propertyNumber = propertyNumber;
        this.sectionNumber = sectionNumber;
        this.nameOfProperty = nameOfProperty;
        this.area = area;
        this.nameOfOwner = nameOfOwner;
    }

    //Getters for all object variables, setters for none
    public int getMunicipalityNumber() {
        return municipalityNumber;
    }

    public String getMunicipalityName() {
        return municipalityName;
    }

    public int getPropertyNumber() {
        return propertyNumber;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public String getNameOfProperty() {
        return nameOfProperty;
    }

    public double getArea() {
        return area;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    // Custom getID method that returns a properly formatted ID of the property
    public String getID() {
        return municipalityNumber + "-" + propertyNumber + "/" + sectionNumber;
    }

    // TODO: Gjøre toString() til getID()?
    // toString that returns all current values
    @Override
    public String toString() {
        return "Property{" +
                "municipalityNumber=" + municipalityNumber +
                ", municipalityName='" + municipalityName + '\'' +
                ", propertyNumber=" + propertyNumber +
                ", sectionNumber=" + sectionNumber +
                ", nameOfProperty='" + nameOfProperty + '\'' +
                ", area=" + area +
                ", nameOfOwner='" + nameOfOwner + '\'' +
                '}';
    }
}
