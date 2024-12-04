package module3.task5;

public class Student implements Cloneable{
    private String name;
    private String id;
    private Double gpa;

    public Student(){

    }

    public Student(String name, String id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    @Override
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if(!this.getClass().equals(other.getClass()) || other==null){
            return false;
        }
        if (this.id.equals( ((Student) other).id)){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format("Student{id = %s, name='%s', gpa=%d}", id, name,gpa);
    }

    @Override
    public int hashCode(){
        return 3*id.hashCode()+309;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student studentCopy = (Student) super.clone();
        return studentCopy;
    }
}
