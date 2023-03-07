public class cloneMethod implements Cloneable {
    // creates and returns a copy of this object
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    String name = "Vipul";

    public static void main(String[] args) {
        cloneMethod obj1 = new cloneMethod(); // creating object of class
        try {
            cloneMethod obj2 = (cloneMethod) obj1.clone();
            // System.out.println(obj1.name);
            System.out.println(obj2.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
