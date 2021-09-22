public class Student {
    private String name;
    private char grade;
    private int group;
    private final String SECRET_NICK_NAME ="MySecretNickName";

    public Student(String name, char grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String getName() {
        return name;
    }
    public char getGrade() {
        return grade;
    }

    public int getGroup() {
        return group;
    }
    public void upgrade(char grade){
        this.grade = grade;
    }
    public void downgrade(char grade){
        this.grade = grade;
    }

}
