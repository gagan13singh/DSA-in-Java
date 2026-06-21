package oops;

public class ObjectEx {
    int num;

    public ObjectEx(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override
    protected java.lang.Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
    public static void main(String[] args) {
        ObjectEx obj= new ObjectEx(10);
        ObjectEx obj2= new ObjectEx(10);
        System.out.println(obj.equals(obj2));
        System.out.println(obj.hashCode());

        System.out.println(obj2 instanceof Object);

        System.out.println(obj.getClass());
    }

}

