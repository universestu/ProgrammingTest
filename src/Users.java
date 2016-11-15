import java.util.ArrayList;

public class Users {
    // User repository
    private ArrayList<IUser> userList = new ArrayList<IUser>();

    // Create new user with type, name and password
    // user created with this method should be automatically added to userList;
    public IUser create(int type, String name, String password) throws RuntimeException {

        //check
        for(int i=0;i<userList.size();i++){
            if(userList.get(i).getName()== name) {
                throw new RuntimeException("this name was used");
            }
        }
        if(type == 1){
            Student student = new Student();
            student.setName(name);
            student.setPassword(password);
            student.setType();
            userList.add(student);
        }else{
            Teacher teacher = new Teacher();
            teacher.setName(name);
            teacher.setPassword(password);
            teacher.setType();
            userList.add(teacher);
        }
        return userList.get(0);   //return first index of ArrayList ? = 0 ??
    }

    // Add new user to repository
    public void add(IUser user) throws RuntimeException {
        if(!this.exists(user)) {
              throw new RuntimeException("This user was used");
        }
        if(user.getType()== 0){                     //No Type
            throw new RuntimeException("invalid type");
        }
        if(user.getName() == null) {         //check password ??
            throw new RuntimeException("This User is invalid");
        }
        userList.add(user); //only add a user ?
    }

    // Delete user from repository
    // Throw  RuntimeException if the user is not in the list
    public void remove(IUser user) throws RuntimeException {
        if(!this.exists(user)){                       //user is not in the list
            throw new RuntimeException("user is not in the list");
        }
        userList.remove(user);
    }

    // Return true if the user is in the list
    public boolean exists(IUser user) {
        return userList.contains(user);
    }

    // Return number of user in the list
    public int count() {
        return userList.size();
    }

    // Return number of user in the list, according to type
    public int countByType(int type) {
        int count=0;
        for(int i=0;i<this.count();i++){
            if(userList.get(i).getType()==type){
                count++;
            }
        }
        return count;
    }
}
