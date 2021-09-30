import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private Grade grade;
    private Group group;
    private final String SECRET_NICK_NAME ="MySecretNickName";

    private enum Grade {
        A,
        B,
        C,
        D,
        E,
        F
    }
    public enum Group {
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5);

        private int value;

        private Group(int value){
            this.value = value;
        }
        private static Map map = new HashMap<>();

        static {
            for (Group group : Group.values()) {
                map.put(group.value, group);
            }
        }

        private static Group valueOf(int group) {
            return (Group) map.get(group);
        }

        private int getValue(){
            return this.value;
        }

    };

    public Student(String name, String grade, int group) {
        this.name = name;
        this.grade = Grade.valueOf(grade);
        this.group = Group.valueOf(group);
    }

    public String getName() {
        return name;
    }
    public String getGrade() {
        return grade.toString();
    }

    public int getGroup() {
        return group.getValue();
    }
    public void upGrade(){
        switch (this.grade){
            case B :
                this.grade = Grade.A;
                break;

            case C :
                this.grade = Grade.B;
                break;

            case D :
                this.grade = Grade.C;
                break;

            case E :
                this.grade = Grade.D;
                break;

            case F :
                this.grade = Grade.E;
                break;

            default:
                break;
        }
    }
    public void downGrade(){
        switch (this.grade){
            case A :
                this.grade = Grade.B;
                break;

            case B :
                this.grade = Grade.C;
                break;

            case C :
                this.grade = Grade.D;
                break;

            case D :
                this.grade = Grade.E;
                break;

            case E :
                this.grade = Grade.F;
                break;

            default:
                break;
        }
    }

    public static void main(String[] args){

        Student student  = new Student("Raja","B",1);
        System.out.println("STUDENT NAME: "+ student.getName());
        System.out.println("INITIAL GRADE: " + student.getGrade());
        System.out.println("GROUP: "+ student.getGroup());

        student.upGrade();
        System.out.println("UPGRADE: " + student.getGrade());

        student.downGrade();
        System.out.println("DOWNGRADE: " + student.getGrade());
    }

}

