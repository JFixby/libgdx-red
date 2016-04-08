/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTransformUtil extends BulletBase {
	private long swigCPtr;
	
	protected btTransformUtil(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTransformUtil, normally you should not need this constructor it's intended for low-level usage. */ 
	public btTransformUtil(long cPtr, boolean cMemoryOwn) {
		this("btTransformUtil", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btTransformUtil obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				LinearMathJNI.delete_btTransformUtil(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public static void integrateTransform(Matrix4 curTrans, Vector3 linvel, Vector3 angvel, float timeStep, Matrix4 predictedTransform) {
    LinearMathJNI.btTransformUtil_integrateTransform(curTrans, linvel, angvel, timeStep, predictedTransform);
  }

  public static void calculateVelocityQuaternion(Vector3 pos0, Vector3 pos1, Quaternion orn0, Quaternion orn1, float timeStep, Vector3 linVel, Vector3 angVel) {
    LinearMathJNI.btTransformUtil_calculateVelocityQuaternion(pos0, pos1, orn0, orn1, timeStep, linVel, angVel);
  }

  public static void calculateDiffAxisAngleQuaternion(Quaternion orn0, Quaternion orn1a, Vector3 axis, SWIGTYPE_p_float angle) {
    LinearMathJNI.btTransformUtil_calculateDiffAxisAngleQuaternion(orn0, orn1a, axis, SWIGTYPE_p_float.getCPtr(angle));
  }

  public static void calculateVelocity(Matrix4 transform0, Matrix4 transform1, float timeStep, Vector3 linVel, Vector3 angVel) {
    LinearMathJNI.btTransformUtil_calculateVelocity(transform0, transform1, timeStep, linVel, angVel);
  }

  public static void calculateDiffAxisAngle(Matrix4 transform0, Matrix4 transform1, Vector3 axis, SWIGTYPE_p_float angle) {
    LinearMathJNI.btTransformUtil_calculateDiffAxisAngle(transform0, transform1, axis, SWIGTYPE_p_float.getCPtr(angle));
  }

  public btTransformUtil() {
    this(LinearMathJNI.new_btTransformUtil(), true);
  }

}
