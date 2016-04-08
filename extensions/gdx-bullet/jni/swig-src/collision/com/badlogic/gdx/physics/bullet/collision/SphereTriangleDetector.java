/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class SphereTriangleDetector extends btDiscreteCollisionDetectorInterface {
	private long swigCPtr;
	
	protected SphereTriangleDetector(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.SphereTriangleDetector_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new SphereTriangleDetector, normally you should not need this constructor it's intended for low-level usage. */
	public SphereTriangleDetector(long cPtr, boolean cMemoryOwn) {
		this("SphereTriangleDetector", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.SphereTriangleDetector_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(SphereTriangleDetector obj) {
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
				CollisionJNI.delete_SphereTriangleDetector(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void getClosestPoints(btDiscreteCollisionDetectorInterface.ClosestPointInput input, btDiscreteCollisionDetectorInterface.Result output, btIDebugDraw debugDraw, boolean swapResults) {
    CollisionJNI.SphereTriangleDetector_getClosestPoints__SWIG_0(swigCPtr, this, btDiscreteCollisionDetectorInterface.ClosestPointInput.getCPtr(input), input, btDiscreteCollisionDetectorInterface.Result.getCPtr(output), output, btIDebugDraw.getCPtr(debugDraw), debugDraw, swapResults);
  }

  public void getClosestPoints(btDiscreteCollisionDetectorInterface.ClosestPointInput input, btDiscreteCollisionDetectorInterface.Result output, btIDebugDraw debugDraw) {
    CollisionJNI.SphereTriangleDetector_getClosestPoints__SWIG_1(swigCPtr, this, btDiscreteCollisionDetectorInterface.ClosestPointInput.getCPtr(input), input, btDiscreteCollisionDetectorInterface.Result.getCPtr(output), output, btIDebugDraw.getCPtr(debugDraw), debugDraw);
  }

  public SphereTriangleDetector(btSphereShape sphere, btTriangleShape triangle, float contactBreakingThreshold) {
    this(CollisionJNI.new_SphereTriangleDetector(btSphereShape.getCPtr(sphere), sphere, btTriangleShape.getCPtr(triangle), triangle, contactBreakingThreshold), true);
  }

  public boolean collide(Vector3 sphereCenter, Vector3 point, Vector3 resultNormal, SWIGTYPE_p_float depth, SWIGTYPE_p_float timeOfImpact, float contactBreakingThreshold) {
    return CollisionJNI.SphereTriangleDetector_collide(swigCPtr, this, sphereCenter, point, resultNormal, SWIGTYPE_p_float.getCPtr(depth), SWIGTYPE_p_float.getCPtr(timeOfImpact), contactBreakingThreshold);
  }

}
