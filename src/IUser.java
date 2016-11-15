public interface IUser {
    public static final int USER_STUDENT = 1;
    public static final int USER_TEACHER = 2;
    public String getName();
    public String setName(String name) throws Exception;
    public String setPassword(String password);
    public boolean isPasswordCorrect(String password);
    public int getType();
}
