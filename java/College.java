import java.util.Date;

public class College {
    private String name;
    private String website;
    private String mobile;
    private String founder;
    private Integer numberOfDept;
    private String location;
    private Date startingDate;

    // Default constructor
    public College() {
    }

    // Parameterized constructor
    public College(String name, String website, String mobile, String founder,
                   Integer numberOfDept, String location, Date startingDate) {
        this.name = name;
        this.website = website;
        this.mobile = mobile;
        this.founder = founder;
        this.numberOfDept = numberOfDept;
        this.location = location;
        this.startingDate = startingDate;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public Integer getNumberOfDept() {
        return numberOfDept;
    }

    public void setNumberOfDept(Integer numberOfDept) {
        this.numberOfDept = numberOfDept;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Website: " + website + "\n" +
                "Mobile: " + mobile + "\n" +
                "Founder: " + founder + "\n" +
                "Number of Dept: " + numberOfDept + "\n" +
                "Location: " + location + "\n" +
                "Starting Date: " + startingDate;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        College college = (College) obj;

        if (!name.equalsIgnoreCase(college.name)) return false;
        return startingDate.equals(college.startingDate);
    }

    public static void main(String[] args) {
        // Sample Input
        College college1 = new College("IIT Madras", "www.iitm.ac.in", "7845612390",
                "iit", 16, "Madras", new Date(59, 11, 15));
        College college2 = new College("iit Madras", "www.iitm.ac.in", "7845612390",
                "iit", 16, "Madras", new Date(59, 11, 15));

        // Display details of College 1 and College 2
        System.out.println("College 1:");
        System.out.println(college1);
        System.out.println();
        System.out.println("College 2:");
        System.out.println(college2);
        System.out.println();

        // Check if colleges are same or different
        if (college1.equals(college2)) {
            System.out.println("College 1 is same as College 2");
        } else {
            System.out.println("College 1 is different from College 2");
        }
    }
}
