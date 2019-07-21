import java.util.function.Function;

public class ShippingFn {

    public static void main(String[] args){
      Function<Integer, Integer> f = a -> a + 1;
      var r = f.apply(100);
      System.out.println(r);
    }
}

