public class SetterAndGetter {
    public static void main(String[] args) {
        Car camaro = new Car();
        camaro.setSpeed(340);
        camaro.setName("Camaro ZL1 1LE");
        camaro.getInfo();
    }
}

class Car{
    private int speed;
    private String name;

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void getInfo(){
        System.out.println("Your car name is: "+name+" and maxspeed: "+speed);
    }

}
