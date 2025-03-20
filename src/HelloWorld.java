public class HelloWorld {

    public int adder(int x, int y){
        return x+y;
    }

    public void printer (String willPrint){
        System.out.println(willPrint);
    }

    public static void main(String[] args) {
        HelloWorld obj = new HelloWorld();
        obj.printer("Hello World");
        System.out.println(obj.adder(2,3));
        //System.out.println("Hello World");
    }

}
