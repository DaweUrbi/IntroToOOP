package assignments.contactList;

public class Contact {

    private String name;
    private String number;
    private String company;
    private String workNumber;
    private String city;

    public Contact(String name, String number, String company, String workNumber, String city) {
        this.name = name;
        this.number = number;
        this.company = company;
        this.workNumber = workNumber;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getCompany() {
        return company;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        String style;
        style = " <" + name + "> (Mobile: " + number;
        style = company.equals("")? style:style + ", Company: " + company;
        style = workNumber.equals("")? style:style + ", Work number: " + workNumber;
        style = city.equals("")? style:style + ", City: " + city;
        style = style + ")";
        return style;
    }
}
