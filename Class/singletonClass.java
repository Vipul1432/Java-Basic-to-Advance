
public class singletonClass {
    private String objectState;
    private static singletonClass instance = null;

    private singletonClass() throws Exception {
        this.objectState = "Vipul";
    }

    public static singletonClass getInstance() {
        if (instance == null) {
            try {
                instance = new singletonClass();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    public String getObjectState() {
        return objectState;
    }

    public void setObjectState(String objectState) {
        this.objectState = objectState;
    }

    public static void main(String[] args) {
        singletonClass obj = singletonClass.getInstance();
        System.out.println(obj.getObjectState());
        obj.setObjectState("Vipul Kumar");
        System.out.println(obj.getObjectState());
    }
}