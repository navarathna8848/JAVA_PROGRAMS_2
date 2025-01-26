class Student_ {
    private String name;
    private int roll_no;
    private int age;
    private long ph_no;

    public long getPhNo() {
        return ph_no;
    }

    public void setPhNo(long ph_no) {
        int digit = 0;
        long temp = ph_no;
        while (temp != 0) {
            temp = temp / 10;
            digit++;
        }

        if (digit == 10) {
            this.ph_no = ph_no;
            System.out.println("The phone number is valid");
        } else {
            System.out.println("The phone number is not valid");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equalsIgnoreCase("naviya") || name.equalsIgnoreCase("navarathna")) {
            System.out.println("Valid name");
            this.name = name;
        } else {
            System.out.println("Not a valid name");
        }
    }

    public int getRollNo() {
        return roll_no;
    }

    public void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
            System.out.println("Valid age");
        }
    }

    public void displayDetails() {
        System.out.println("The name is: " + name);
        System.out.println("The phone number is: " + ph_no);
        System.out.println("The roll number is: " + roll_no);
        System.out.println("The age is: " + age);
    }
}
