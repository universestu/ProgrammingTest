public class User implements IUser {
    private String name ="Admin";
    private String password = "admin";
    public int type;

    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public String setName(String name) throws RuntimeException
    {if(name.length() == 0)
       throw new RuntimeException("Name is null,Please check your name again");
    else{
        this.name = name;
        return name;}
    }

    @Override
    public String setPassword(String password) throws RuntimeException{

    if(password.length() == 0){
        throw new RuntimeException("password is null,Please check your password again");}
    if(password.length() < 4) {
            throw new RuntimeException("password is more 4 character,Please add more character again");
        }
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
