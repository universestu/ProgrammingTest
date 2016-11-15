public class User implements IUser {
    private String name;
    private String password;
    protected int type = 0;

    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public String setName(String name) throws RuntimeException {
        String regex = "^[A-Za-z][A-Za-z0-9]{7,}$";
        if (!name.matches(regex)) {
            throw new RuntimeException("Name is incorrect,Please check your name again");
        } else {
            this.name = name;
            return name;
        }
    }

    @Override
    public String setPassword(String password) throws RuntimeException {

        if (!isPasswordCorrect(password)) {

            throw new RuntimeException("password is incorrect,Please check your password again");
        } else {
            this.password = password;
            return password;
        }
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]{12,})$";
        if (password.matches(regex))
            return true;
        else
            return false;
    }

    @Override
    public int getType() {
        return this.type;
    }
}
