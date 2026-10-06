public class Student {
    private String firstName;
    private String lastName;
    private Address homeAddress;
    private Address schoolAddress;
    // Constructor khởi tạo sinh viên
    public Student(String firstName, String lastName, Address homeAddress, Address schoolAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
    }
        public String toString() {
        return "Ho ten: " + firstName + " " + lastName + "\n"
             + "Đia chi nha: " + homeAddress + "\n"
             + "Đia chi truong: " + schoolAddress;
    }
}
