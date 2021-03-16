package tugas;
class person {
    String name;
    int age;
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class ManagingPeople {
    public static void main(String[] args) {
        person p1 = new person("Nila", 18);
        person p2 = new person("Amalia", 18);
        
         if(p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } 
         else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
    }
}
