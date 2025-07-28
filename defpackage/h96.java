package defpackage;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* renamed from: h96  reason: default package */
public interface h96 {
    EGLContext j(EGLDisplay eGLDisplay, int i, int[] iArr);

    EGLSurface l(EGLDisplay eGLDisplay, Object obj, int i, boolean z);

    p96 o(int i, int i2, int i3);

    EGLSurface p(EGLContext eGLContext, EGLDisplay eGLDisplay);

    void v(EGLDisplay eGLDisplay);
}
