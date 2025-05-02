public class Car extends Object{
    private int id;
    private String modelName;

    public Car() {
    }

    public Car(int id, String modelName) {
        this.id = id;
        this.modelName = modelName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public Car cloneCar(){
        Car c=new Car(this.id,this.modelName);
        return c;
    }
}
