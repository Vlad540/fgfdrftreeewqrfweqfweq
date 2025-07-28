package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.GestureDetector;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: vj4  reason: default package */
public class vj4 implements ine {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public vj4(Context context, nva nva, q6e q6e, ygd ygd) {
        this.a = 0;
        this.c = nva;
        this.d = q6e;
        this.e = ygd;
        jn jnVar = new jn(context);
        this.f = jnVar;
        jn jnVar2 = new jn(context);
        this.g = jnVar2;
        this.h = new GestureDetector(context, new tz(7, this));
        this.i = new gz3(3, this);
        this.j = new Rect();
        this.b = a24.X(((float) 92) * dh4.c().getDisplayMetrics().density);
        this.k = ez3.O(3, new tj4(this, context, 0));
        this.l = ez3.O(3, new tj4(this, context, 1));
        jnVar2.c = new e3(this);
        jnVar.c = new x3a(11, (Object) this);
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r6v4, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(defpackage.vj4 r17, boolean r18, int r19) {
        /*
            r0 = r17
            r1 = 3
            java.lang.Object r2 = r0.i
            gz3 r2 = (gz3) r2
            tg0 r3 = new tg0
            r3.<init>(r1, r2)
            java.lang.Object r4 = r0.c
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r4.removeCallbacks(r3)
            android.content.Context r3 = r4.getContext()
            int r5 = defpackage.b2a.c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r19)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = r3.getString(r5, r6)
            r5 = 0
            r6 = 0
            if (r18 == 0) goto L_0x0061
            android.view.ViewGroup r7 = r17.k()
            java.lang.Object r8 = r0.m
            android.animation.Animator r8 = (android.animation.Animator) r8
            android.animation.Animator r7 = c(r7, r8)
            r0.m = r7
            android.view.ViewGroup r7 = r17.k()
            ek8.e(r7, r4)
            android.view.ViewGroup r7 = r17.k()
            android.view.View r6 = r7.getChildAt(r6)
            boolean r7 = r6 instanceof android.widget.TextView
            if (r7 == 0) goto L_0x004d
            r5 = r6
            android.widget.TextView r5 = (android.widget.TextView) r5
        L_0x004d:
            if (r5 == 0) goto L_0x0052
            r5.setText(r3)
        L_0x0052:
            android.view.ViewGroup r3 = r17.k()
            java.lang.Object r5 = r0.m
            android.animation.Animator r5 = (android.animation.Animator) r5
            android.animation.Animator r3 = b(r3, r5)
            r0.m = r3
            goto L_0x0098
        L_0x0061:
            android.view.ViewGroup r7 = r17.m()
            java.lang.Object r8 = r0.n
            android.animation.Animator r8 = (android.animation.Animator) r8
            android.animation.Animator r7 = c(r7, r8)
            r0.n = r7
            android.view.ViewGroup r7 = r17.m()
            ek8.e(r7, r4)
            android.view.ViewGroup r7 = r17.m()
            android.view.View r6 = r7.getChildAt(r6)
            boolean r7 = r6 instanceof android.widget.TextView
            if (r7 == 0) goto L_0x0085
            r5 = r6
            android.widget.TextView r5 = (android.widget.TextView) r5
        L_0x0085:
            if (r5 == 0) goto L_0x008a
            r5.setText(r3)
        L_0x008a:
            android.view.ViewGroup r3 = r17.m()
            java.lang.Object r5 = r0.n
            android.animation.Animator r5 = (android.animation.Animator) r5
            android.animation.Animator r3 = b(r3, r5)
            r0.n = r3
        L_0x0098:
            java.lang.Object r3 = r0.d
            s16 r3 = (defpackage.s16) r3
            java.lang.Object r3 = r3.invoke()
            k7f r3 = (k7f) r3
            if (r3 != 0) goto L_0x00b1
            java.lang.Class<vj4> r0 = defpackage.vj4.class
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Media viewer. Can't seek by double tap because player is null"
            defpackage.udd.p(r0, r1, new java.lang.Object[0])
            goto L_0x012b
        L_0x00b1:
            long r5 = r3.F0()
            r7 = 10000(0x2710, float:1.4013E-41)
            long r7 = (long) r7
            if (r18 == 0) goto L_0x00bc
            long r5 = r5 + r7
            goto L_0x00bd
        L_0x00bc:
            long r5 = r5 - r7
        L_0x00bd:
            long r7 = r3.G0()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c9
            r17.d()
            r5 = r7
        L_0x00c9:
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x00d3
            r17.d()
            r5 = r7
        L_0x00d3:
            n45 r9 = r3.o
            int r10 = r9.getPlaybackState()
            if (r10 != r1) goto L_0x00e2
            boolean r1 = r9.u()
            if (r1 != 0) goto L_0x00e2
            goto L_0x00e9
        L_0x00e2:
            int r1 = r9.getPlaybackState()
            r9 = 1
            if (r1 != r9) goto L_0x011d
        L_0x00e9:
            java.lang.Object r0 = r0.e
            ygd r0 = (defpackage.ygd) r0
            r0.getClass()
            k77[] r1 = one.me.chatmedia.viewer.video.VideoViewerWidget.y0
            java.lang.Object r0 = r0.a
            one.me.chatmedia.viewer.video.VideoViewerWidget r0 = (one.me.chatmedia.viewer.video.VideoViewerWidget) r0
            i9f r0 = r0.n0()
            if (r0 == 0) goto L_0x011d
            one.me.chatmedia.viewer.ChatMediaViewerScreen r0 = (one.me.chatmedia.viewer.ChatMediaViewerScreen) r0
            cw6 r10 = r0.y0()
            k7f r1 = r0.z0()
            v2f r9 = r1.Z
            if (r9 == 0) goto L_0x0110
            n45 r1 = r1.o
            long r7 = r1.e0()
        L_0x0110:
            r13 = r7
            k7f r0 = r0.z0()
            long r15 = r0.G0()
            r11 = r5
            r10.c(r11, r13, r15)
        L_0x011d:
            r3.I0(r5)
            tg0 r0 = new tg0
            r1 = 4
            r0.<init>(r1, r2)
            r1 = 600(0x258, double:2.964E-321)
            r4.postDelayed(r0, r1)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj4.a(vj4, boolean, int):void");
    }

    public static Animator b(ViewGroup viewGroup, Animator animator) {
        if (viewGroup.getVisibility() == 0 && animator != null && animator.isRunning()) {
            return animator;
        }
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, View.ALPHA, new float[]{viewGroup.getAlpha(), 1.0f});
        ofFloat.setDuration(200);
        ofFloat.addListener(new uj4(viewGroup, 0));
        ofFloat.start();
        return ofFloat;
    }

    public static Animator c(ViewGroup viewGroup, Animator animator) {
        if (viewGroup.getVisibility() != 0) {
            return animator;
        }
        if (animator != null && animator.isRunning()) {
            return animator;
        }
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, View.ALPHA, new float[]{viewGroup.getAlpha(), 0.0f});
        ofFloat.setDuration(200);
        ofFloat.addListener(new uj4(viewGroup, 1));
        ofFloat.start();
        return ofFloat;
    }

    public void d() {
        if (k().getVisibility() == 0) {
            this.m = c(k(), (Animator) this.m);
        }
        if (m().getVisibility() == 0) {
            this.n = c(m(), (Animator) this.n);
        }
        ((jn) this.f).b = 0;
        ((jn) this.g).b = 0;
    }

    public void e() {
        int t = hr1.t(this.b);
        if (t == 0 || t == 1) {
            u();
        } else if (t == 2 || t == 3) {
            this.b = 3;
        } else if (t != 4) {
            throw new IllegalStateException("State " + sxe.u(this.b) + " is not handled");
        }
    }

    public FrameLayout f(Context context, boolean z) {
        FrameLayout frameLayout = new FrameLayout(context);
        int i2 = z ? 8388629 : 8388627;
        int i3 = this.b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3, i2);
        if (z) {
            layoutParams.rightMargin = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
        } else {
            layoutParams.leftMargin = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
        }
        frameLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        nge.d(nte.D, textView);
        textView.setTextColor(-855638017);
        Drawable b2 = gq3.b(textView.getContext(), z ? z1a.a : z1a.b);
        js.D(b2, -855638017);
        ArrayList arrayList = tge.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, b2, (Drawable) null, (Drawable) null);
        frameLayout.addView(textView);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setTint(-1728053248);
        frameLayout.setBackground(shapeDrawable);
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    public void g(zq4 zq4, nxc nxc) {
        nxc nxc2 = nxc;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int i2 = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize((EGLDisplay) this.f, iArr, 0, iArr, 1)) {
                if (nxc2 != null) {
                    String str = iArr[0] + "." + iArr[1];
                    if (str != null) {
                        nxc2.b = str;
                    } else {
                        throw new NullPointerException("Null eglVersion");
                    }
                }
                int i3 = zq4.a() ? 10 : 8;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig((EGLDisplay) this.f, new int[]{12324, i3, 12323, i3, 12322, i3, 12321, zq4.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, zq4.a() ? 64 : 4, 12610, zq4.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (zq4.a()) {
                        i2 = 3;
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, i2, 12344}, 0);
                    w36.a("eglCreateContext");
                    this.i = eGLConfig;
                    this.g = eglCreateContext;
                    EGL14.eglQueryContext((EGLDisplay) this.f, eglCreateContext, 12440, new int[1], 0);
                    return;
                }
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            this.f = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        throw new IllegalStateException("Unable to get EGL14 display");
    }

    public da0 h(Surface surface) {
        try {
            EGLConfig eGLConfig = (EGLConfig) this.i;
            Objects.requireNonNull(eGLConfig);
            EGLSurface h2 = w36.h((EGLDisplay) this.f, eGLConfig, surface, (int[]) this.h);
            EGLDisplay eGLDisplay = (EGLDisplay) this.f;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay, h2, 12375, iArr, 0);
            int i2 = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay, h2, 12374, iArr2, 0);
            Size size = new Size(i2, iArr2[0]);
            return new da0(h2, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e2) {
            e2.getMessage();
            return null;
        }
    }

    public void i() {
        EGLConfig eGLConfig = (EGLConfig) this.i;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = w36.a;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface((EGLDisplay) this.f, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        w36.a("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            this.j = eglCreatePbufferSurface;
            return;
        }
        throw new IllegalStateException("surface was null");
    }

    public yia j(zq4 zq4) {
        w36.d((AtomicBoolean) this.c, false);
        try {
            g(zq4, (nxc) null);
            i();
            o((EGLSurface) this.j);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString((EGLDisplay) this.f, 12373);
            if (glGetString == null) {
                glGetString = BuildConfig.FLAVOR;
            }
            if (eglQueryString == null) {
                eglQueryString = BuildConfig.FLAVOR;
            }
            return new yia(glGetString, eglQueryString);
        } catch (IllegalStateException e2) {
            e2.getMessage();
            return new yia(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        } finally {
            r();
        }
    }

    public ViewGroup k() {
        return (ViewGroup) ((t97) this.k).getValue();
    }

    public da0 l(Surface surface) {
        HashMap hashMap = (HashMap) this.d;
        e07.p("The surface is not registered.", hashMap.containsKey(surface));
        da0 da0 = (da0) hashMap.get(surface);
        Objects.requireNonNull(da0);
        return da0;
    }

    public ViewGroup m() {
        return (ViewGroup) ((t97) this.l).getValue();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [nxc, java.lang.Object] */
    public m90 n(zq4 zq4, Map map) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        w36.d(atomicBoolean, false);
        ? obj = new Object();
        obj.a = "0.0";
        obj.b = "0.0";
        String str = BuildConfig.FLAVOR;
        obj.c = str;
        obj.o = str;
        try {
            if (zq4.a()) {
                yia j2 = j(zq4);
                String str2 = (String) j2.a;
                str2.getClass();
                String str3 = (String) j2.b;
                str3.getClass();
                if (!str2.contains("GL_EXT_YUV_target")) {
                    zq4 = zq4.d;
                }
                int[] iArr = w36.a;
                if (zq4.a == 3 && str3.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                    iArr = w36.b;
                }
                this.h = iArr;
                obj.c = str2;
                obj.o = str3;
            }
            g(zq4, obj);
            i();
            o((EGLSurface) this.j);
            String i2 = w36.i();
            if (i2 != null) {
                obj.a = i2;
                this.l = w36.f(zq4, map);
                int g2 = w36.g();
                this.b = g2;
                v(g2);
                this.e = Thread.currentThread();
                atomicBoolean.set(true);
                if (((String) obj.a) == null) {
                    str = " glVersion";
                }
                if (((String) obj.b) == null) {
                    str = str.concat(" eglVersion");
                }
                if (((String) obj.c) == null) {
                    str = hr1.g(str, " glExtensions");
                }
                if (((String) obj.o) == null) {
                    str = hr1.g(str, " eglExtensions");
                }
                if (str.isEmpty()) {
                    return new m90((String) obj.a, (String) obj.b, (String) obj.c, (String) obj.o);
                }
                throw new IllegalStateException("Missing required properties:".concat(str));
            }
            throw new NullPointerException("Null glVersion");
        } catch (IllegalArgumentException | IllegalStateException e2) {
            r();
            throw e2;
        }
    }

    public void o(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f).getClass();
        ((EGLContext) this.g).getClass();
        if (!EGL14.eglMakeCurrent((EGLDisplay) this.f, eGLSurface, eGLSurface, (EGLContext) this.g)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void p(Surface surface) {
        w36.d((AtomicBoolean) this.c, true);
        w36.c((Thread) this.e);
        HashMap hashMap = (HashMap) this.d;
        if (!hashMap.containsKey(surface)) {
            hashMap.put(surface, w36.j);
        }
    }

    public void q() {
        if (((AtomicBoolean) this.c).getAndSet(false)) {
            w36.c((Thread) this.e);
            r();
        }
    }

    public void r() {
        for (u36 u36 : ((Map) this.l).values()) {
            GLES20.glDeleteProgram(u36.a);
        }
        this.l = Collections.emptyMap();
        this.m = null;
        if (!Objects.equals((EGLDisplay) this.f, EGL14.EGL_NO_DISPLAY)) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent((EGLDisplay) this.f, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap hashMap = (HashMap) this.d;
            for (da0 da0 : hashMap.values()) {
                if (!Objects.equals(da0.a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f, da0.a)) {
                    try {
                        w36.a("eglDestroySurface");
                    } catch (IllegalStateException e2) {
                        e2.toString();
                    }
                }
            }
            hashMap.clear();
            if (!Objects.equals((EGLSurface) this.j, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f, (EGLSurface) this.j);
                this.j = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.g, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f, (EGLContext) this.g);
                this.g = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f);
            this.f = EGL14.EGL_NO_DISPLAY;
        }
        this.i = null;
        this.b = -1;
        this.n = t36.a;
        this.k = null;
        this.e = null;
    }

    public void s(Surface surface, boolean z) {
        if (((Surface) this.k) == surface) {
            this.k = null;
            o((EGLSurface) this.j);
        }
        HashMap hashMap = (HashMap) this.d;
        da0 da0 = z ? (da0) hashMap.remove(surface) : (da0) hashMap.put(surface, w36.j);
        if (da0 != null && da0 != w36.j) {
            try {
                EGL14.eglDestroySurface((EGLDisplay) this.f, da0.a);
            } catch (RuntimeException e2) {
                e2.getMessage();
            }
        }
    }

    public void t(long j2, float[] fArr, Surface surface) {
        w36.d((AtomicBoolean) this.c, true);
        w36.c((Thread) this.e);
        da0 l2 = l(surface);
        if (l2 == w36.j) {
            l2 = h(surface);
            if (l2 != null) {
                ((HashMap) this.d).put(surface, l2);
            } else {
                return;
            }
        }
        Surface surface2 = (Surface) this.k;
        EGLSurface eGLSurface = l2.a;
        if (surface != surface2) {
            o(eGLSurface);
            this.k = surface;
            int i2 = l2.b;
            int i3 = l2.c;
            GLES20.glViewport(0, 0, i2, i3);
            GLES20.glScissor(0, 0, i2, i3);
        }
        u36 u36 = (u36) this.m;
        u36.getClass();
        if (u36 instanceof v36) {
            GLES20.glUniformMatrix4fv(((v36) u36).f, 1, false, fArr, 0);
            w36.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        w36.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, j2);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            Integer.toHexString(EGL14.eglGetError());
            s(surface, false);
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString((y4e) this.h, "SURFACE_REQUEST_NOT_CONFIGURED");
            default:
                return super.toString();
        }
    }

    public void u() {
        int t = hr1.t(this.b);
        if (t == 0) {
            this.b = 5;
        } else if (t == 1 || t == 2 || t == 3) {
            this.b = 5;
            ((sn1) this.n).b((xx4) this.f);
            this.h = null;
            xx4 xx4 = (xx4) this.f;
            if (xx4 != null) {
                Objects.toString(xx4);
                xx4 xx42 = (xx4) this.f;
                xx42.getClass();
                xx42.h.execute(new lx4(xx42, 4));
                ((xx4) this.f).i.c(new pfe(9, this), (Executor) this.d);
                this.f = null;
                return;
            }
            ((sn1) this.l).b((Object) null);
        } else if (t != 4) {
            throw new IllegalStateException("State " + sxe.u(this.b) + " is not handled");
        }
    }

    public void v(int i2) {
        u36 u36 = (u36) ((Map) this.l).get((t36) this.n);
        if (u36 != null) {
            if (((u36) this.m) != u36) {
                this.m = u36;
                u36.b();
                Objects.toString((t36) this.n);
                Objects.toString((u36) this.m);
            }
            GLES20.glActiveTexture(33984);
            w36.b("glActiveTexture");
            GLES20.glBindTexture(36197, i2);
            w36.b("glBindTexture");
            return;
        }
        throw new IllegalStateException("Unable to configure program for input format: " + ((t36) this.n));
    }

    public vj4() {
        this.a = 1;
        this.c = new AtomicBoolean(false);
        this.d = new HashMap();
        this.f = EGL14.EGL_NO_DISPLAY;
        this.g = EGL14.EGL_NO_CONTEXT;
        this.h = w36.a;
        this.j = EGL14.EGL_NO_SURFACE;
        this.l = Collections.emptyMap();
        this.m = null;
        this.n = t36.a;
        this.b = -1;
    }

    public vj4(hs1 hs1, ryc ryc, Executor executor) {
        this.a = 2;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.b = 1;
        this.k = new as6(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.l = null;
        this.m = new as6(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.n = null;
        this.c = executor;
        this.d = ryc;
        this.e = hs1;
    }
}
