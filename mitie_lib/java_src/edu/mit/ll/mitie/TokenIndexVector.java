/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.mit.ll.mitie;

public class TokenIndexVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TokenIndexVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TokenIndexVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        globalJNI.delete_TokenIndexVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TokenIndexVector() {
    this(globalJNI.new_TokenIndexVector__SWIG_0(), true);
  }

  public TokenIndexVector(long n) {
    this(globalJNI.new_TokenIndexVector__SWIG_1(n), true);
  }

  public long size() {
    return globalJNI.TokenIndexVector_size(swigCPtr, this);
  }

  public long capacity() {
    return globalJNI.TokenIndexVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    globalJNI.TokenIndexVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return globalJNI.TokenIndexVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    globalJNI.TokenIndexVector_clear(swigCPtr, this);
  }

  public void add(TokenIndexPair x) {
    globalJNI.TokenIndexVector_add(swigCPtr, this, TokenIndexPair.getCPtr(x), x);
  }

  public TokenIndexPair get(int i) {
    return new TokenIndexPair(globalJNI.TokenIndexVector_get(swigCPtr, this, i), false);
  }

  public void set(int i, TokenIndexPair val) {
    globalJNI.TokenIndexVector_set(swigCPtr, this, i, TokenIndexPair.getCPtr(val), val);
  }

}
