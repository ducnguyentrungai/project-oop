package data;

public abstract class Pet {
    protected String id;
    protected String name;
    protected int yob;
    protected double weigth;

    public Pet(String id, String name, int yob, double weigth) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.weigth = weigth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
    
    public abstract double run();
    public abstract void showProile();
  
}
