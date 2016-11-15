public class Teacher extends User {
    public Teacher(String name, String password)
    {
        setType();
        setName(name);
        setPassword(password);
    }
    public void setType() {
        this.type = USER_TEACHER;
    }
}
