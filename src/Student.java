public class Student extends User {
    public Student(String name, String password)
    {
        setType();
        setName(name);
        setPassword(password);
    }
    public void setType() {
        this.type = USER_STUDENT;
    }

}
