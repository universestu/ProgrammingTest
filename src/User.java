public class User implements IUser {
    private String name;
    private String password;
    public int type;

    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public String setName(String name)
    {if(name.length() != 0)
        return null;
    else{
        this.name = name;
        return name;}
    }

    @Override
    public String setPassword(String password) {

    if(password.length() != 0)
        return null;
     else
    {this.password = password;
        return password;}
    }

    @Override
    public boolean isPasswordCorrect(String password) {
        if(this.password == password)
            return true;
        else
            return false;
    }

    @Override
    public int getType() {
        return this.type;
    }
}
