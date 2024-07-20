package Task_5_1_11;

public class GeNer {
    public static void main(String[]args){
        Box<Integer>box=new Box<Integer>(23);
    }
    static class Box<T>{
        private T object;
        Box(T object){
            this.object=object;
        }

    }
}
