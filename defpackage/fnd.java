package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: fnd  reason: default package */
public final class fnd {
    public static final vq4 p = new vq4(1);
    public static final vq4 q = new vq4(2);
    public static final vq4 r = new vq4(3);
    public static final vq4 s = new vq4(4);
    public static final vq4 t = new vq4(5);
    public static final vq4 u = new vq4(6);
    public static final vq4 v = new vq4(7);
    public static final vq4 w = new vq4(0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final bm3 e;
    public boolean f;
    public final float g;
    public final float h;
    public long i;
    public final float j;
    public final ArrayList k;
    public final ArrayList l;
    public gnd m;
    public float n;
    public boolean o;

    public fnd(Object obj, bm3 bm3) {
        this(obj, bm3, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public static fg d() {
        ThreadLocal threadLocal = fg.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new fg(new otf(2)));
        }
        return (fg) threadLocal.get();
    }

    public final void a(float f2) {
        if (this.f) {
            this.n = f2;
            return;
        }
        if (this.m == null) {
            this.m = new gnd(f2);
        }
        this.m.i = (double) f2;
        g();
    }

    public final void b() {
        if (d().a()) {
            if (this.f) {
                c(true);
            }
            float f2 = this.n;
            if (f2 != Float.MAX_VALUE) {
                gnd gnd = this.m;
                if (gnd == null) {
                    this.m = new gnd(f2);
                } else {
                    gnd.i = (double) f2;
                }
                this.n = Float.MAX_VALUE;
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
    }

    public final void c(boolean z) {
        ArrayList arrayList;
        int i2 = 0;
        this.f = false;
        fg d2 = d();
        d2.a.remove(this);
        ArrayList arrayList2 = d2.b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, (Object) null);
            d2.f = true;
        }
        this.i = 0;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) != null) {
                ((kf) arrayList.get(i2)).a(this.b, z);
            }
            i2++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f2) {
        this.e.G(this.d, f2);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i2 >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            } else if (arrayList.get(i2) == null) {
                i2++;
            } else {
                ((yqe) arrayList.get(i2)).getClass();
                throw null;
            }
        }
    }

    public final void f() {
        if (this.m.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (!d().a()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        } else if (this.f) {
            this.o = true;
        }
    }

    public final void g() {
        gnd gnd = this.m;
        if (gnd != null) {
            double d2 = (double) ((float) gnd.i);
            if (d2 > ((double) this.g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (d2 >= ((double) this.h)) {
                double abs = Math.abs((double) (this.j * 0.75f));
                gnd.d = abs;
                gnd.e = abs * 62.5d;
                if (d().a()) {
                    boolean z = this.f;
                    if (!z && !z) {
                        this.f = true;
                        if (!this.c) {
                            this.b = this.e.o(this.d);
                        }
                        float f2 = this.b;
                        if (f2 > this.g || f2 < this.h) {
                            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                        }
                        fg d3 = d();
                        ArrayList arrayList = d3.b;
                        if (arrayList.size() == 0) {
                            otf otf = d3.e;
                            otf.getClass();
                            ((Choreographer) otf.a).postFrameCallback(new eg(0, d3.d));
                            if (Build.VERSION.SDK_INT >= 33) {
                                d3.g = ValueAnimator.getDurationScale();
                                if (d3.h == null) {
                                    d3.h = new afc(d3);
                                }
                                afc afc = d3.h;
                                if (((dg) afc.a) == null) {
                                    dg dgVar = new dg(afc);
                                    afc.a = dgVar;
                                    boolean unused = ValueAnimator.registerDurationScaleChangeListener(dgVar);
                                }
                            }
                        }
                        if (!arrayList.contains(this)) {
                            arrayList.add(this);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
            } else {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    public fnd(Object obj, bm3 bm3, float f2) {
        this(obj, bm3, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
        this.m = new gnd(f2);
    }

    public fnd(Object obj, bm3 bm3, int i2) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = bm3;
        if (bm3 == t || bm3 == u || bm3 == v) {
            this.j = 0.1f;
        } else if (bm3 == w) {
            this.j = 0.00390625f;
        } else if (bm3 == r || bm3 == s) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
    }
}
