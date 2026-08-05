public class lesson {
    public static void main(String[] args) {
      
        int x = 9;
        double a = 3.5;
        int y = 20;
        int z = 25;
        int random = (int)(Math.random() * 100);

        //Math.max
        System.out.println(Math.max(x, Math.max(y, z)));
        //Math.min
        System.out.println(Math.min(x, Math.min(y, z)));
        //Math.sqrt
        System.out.println(Math.sqrt(z));
        //Math.abs
        System.out.println(Math.abs(z));
        //Math.pow
        System.out.println(Math.pow(x, 2));
        //Math.round
        System.out.println(Math.round(a));
        //Math.ceil
        System.out.println(Math.ceil(a));
        //Math.floor
        System.out.println(Math.floor(a));
        //Math.random
        System.out.println(Math.random());
    } 

}

    //public class boolean {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSuspended = true;
        System.out.println("is it raining?" + isRaining);     // Outputs false
        System.out.println("is it suspended?" + isSuspended);   // Outputs true
    }

]


