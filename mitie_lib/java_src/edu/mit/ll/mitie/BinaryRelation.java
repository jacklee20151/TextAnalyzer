/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.mit.ll.mitie;

public class BinaryRelation {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BinaryRelation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BinaryRelation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        globalJNI.delete_BinaryRelation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setItem(SWIGTYPE_p_mitie__binary_relation value) {
    globalJNI.BinaryRelation_item_set(swigCPtr, this, SWIGTYPE_p_mitie__binary_relation.getCPtr(value));
  }

  public SWIGTYPE_p_mitie__binary_relation getItem() {
    return new SWIGTYPE_p_mitie__binary_relation(globalJNI.BinaryRelation_item_get(swigCPtr, this), true);
  }

  public BinaryRelation() {
    this(globalJNI.new_BinaryRelation(), true);
  }

}
