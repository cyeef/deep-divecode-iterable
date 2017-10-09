/**
 * 
 */
package edu.cnm.deepdive.implementations;

import java.math.BigInteger;
import java.util.Iterator;

/**
 * @author cyeef
 *
 */
public class Fibonacci implements Iterable<BigInteger> {
  // field and constructors and unlimited constructors
  // -1 means no upper limit
  private static final int DEFAULT_UPPER = -1;
  private final int upper; 
  // constructors
  // 
  public Fibonacci () {
    this(DEFAULT_UPPER);
    
  }
  public Fibonacci(int upper) {
    this.upper = upper;
  }
  // generate an iterator class, class within this class and annomoys class

  @Override
  public Iterator<BigInteger> iterator() {
    // TODO Auto-generated method stub
    //return new FibIterator();
    //Anonymous class implementing the Iterator<BigInteger> interface.
    return new Iterator<BigInteger>() {
      
      private BigInteger previous = BigInteger.valueOf(-1);
      private BigInteger current = BigInteger.ONE;
      private int index = 0;
      public boolean hasNext() {
        // TODO Auto-generated method stub
        // short circuit boolean evaluates the operation before the || 
        return upper < 0 || index < upper;
      }

      @Override
      public BigInteger next() {
        // TODO Auto-generated method stub
        // immutable creates a new value
        BigInteger next = previous.add(current);
        previous = current;
        current = next;
        index++;
        return current;
      }
      
    
  };
//  // inner class that can access the non static fields within the nested class
// // private class FibIterator implements Iterator<BigInteger> {
//    
//   // private BigInteger previous = BigInteger.valueOf(-1);
//    //private BigInteger current = BigInteger.ONE;
//    // private int index = 0;
//    
//    
//
//    @Override
//    public boolean hasNext() {
//      // TODO Auto-generated method stub
//      // short circuit boolean evaluates the operation before the || 
//      return upper < 0 || index < upper;
//    }

//    @Override
////    public BigInteger next() {
//      // TODO Auto-generated method stub
//      // immutable creates a new value
//      BigInteger next = previous.add(current);
//      previous = current;
//      current = next;
//      index++;
//      return current;
//    }
//    
//  }
  }
}
