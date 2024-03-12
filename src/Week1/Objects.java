package Week1;

public class Objects {
    static class Dog{
        String breed;
        int age;
        String color;

        public void setBreed(String breed){
            this.breed = breed;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setColor(String color){
            this.color = color;
        }

        public void printDetail(){
            System.out.println("Dog Detail: ");
            System.out.println(this.breed);
            System.out.println(this.age);
            System.out.println(this.color);
        }

    }
    public static void main(String[] args) {
        Dog object = new Dog();

        object.setBreed("Husky");
        object.setAge(10);
        object.setColor("Black");

        object.printDetail();
    }
}
