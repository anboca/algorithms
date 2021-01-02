package dp;

import java.math.BigInteger;
import java.util.HashMap;

public class Fibonacci {

    /*
     * Created by: Andrés Botía Carreño
     * Year: 2021
     * Licence: GNU V3
     * Description: Merge Sort Algorithm
     * Complexity: //TODO: calculate complexity
     * */

    public static HashMap<BigInteger,BigInteger> map;

    public static void main(String[] args){
        System.out.println("Fib(5): "+fibonacci(BigInteger.valueOf(5)));
        System.out.println("Fib(50): "+fibonacci(BigInteger.valueOf(50)));
        System.out.println("Fib(100): "+fibonacci(BigInteger.valueOf(100)));
        System.out.println("Fib(300): "+fibonacci(BigInteger.valueOf(300)));
    }

    public static BigInteger fibonacci(BigInteger n){
        if (map ==null)
            map = new HashMap<>();
        if (n.equals(BigInteger.valueOf(0)))
            return BigInteger.ZERO;
        if (n.equals(BigInteger.valueOf(1)))
            return BigInteger.ONE;
        if (map.containsKey(n))
            return map.get(n);
        BigInteger result;
        if (n.testBit(0)){
            BigInteger half = n.shiftRight(1);
            BigInteger halfPlusOne = half.add(BigInteger.ONE);
            result = fibonacci(half).pow(2).add(fibonacci(halfPlusOne).pow(2));
        }else{
            BigInteger half = n.shiftRight(1);
            BigInteger halfMinusOne = half.subtract(BigInteger.ONE);
            result = fibonacci(half).multiply(fibonacci(half).add(fibonacci(halfMinusOne)).add(fibonacci(halfMinusOne)));
        }
        map.put(n,result);
        return result;
    }

}
