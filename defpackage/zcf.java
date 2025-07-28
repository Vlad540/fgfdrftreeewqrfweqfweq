package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* renamed from: zcf  reason: default package */
public final class zcf implements lye {
    public final kbc A0;
    public final sye X;
    public final hu1 Y;
    public final hu1 Z;
    public final Set a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap o = new HashMap();
    public final sw1 w0 = new sw1(2, this);
    public final HashSet x0;
    public final HashMap y0;
    public final kbc z0;

    public zcf(hu1 hu1, hu1 hu12, HashSet hashSet, sye sye, sic sic) {
        this.Y = hu1;
        this.Z = hu12;
        this.X = sye;
        this.a = hashSet;
        HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            mye mye = (mye) it.next();
            hashMap.put(mye, mye.o(hu1.p(), (pye) null, mye.f(true, sye)));
        }
        this.y0 = hashMap;
        HashSet hashSet2 = new HashSet(hashMap.values());
        this.x0 = hashSet2;
        this.z0 = new kbc(hu1, hashSet2);
        if (this.Z != null) {
            this.A0 = new kbc(this.Z, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            mye mye2 = (mye) it2.next();
            this.o.put(mye2, Boolean.FALSE);
            this.c.put(mye2, new ycf(hu1, this, sic));
        }
    }

    public static void r(o4e o4e, xc4 xc4, c2d c2d) {
        o4e.e();
        try {
            gt0.i();
            o4e.b();
            n4e n4e = o4e.l;
            Objects.requireNonNull(n4e);
            n4e.f(xc4, new l4e(n4e, 0));
        } catch (DeferrableSurface$SurfaceClosedException unused) {
            a2d a2d = c2d.f;
            if (a2d != null) {
                a2d.a(c2d);
            }
        }
    }

    public static xc4 s(mye mye) {
        List b2 = mye instanceof bq6 ? mye.n.b() : Collections.unmodifiableList(mye.n.g.a);
        e07.p((String) null, b2.size() <= 1);
        if (b2.size() == 1) {
            return (xc4) b2.get(0);
        }
        return null;
    }

    public final void c(mye mye) {
        xc4 s;
        gt0.i();
        o4e o4e = (o4e) this.b.get(mye);
        Objects.requireNonNull(o4e);
        if (t(mye) && (s = s(mye)) != null) {
            r(o4e, s, mye.n);
        }
    }

    public final void e(mye mye) {
        gt0.i();
        if (!t(mye)) {
            this.o.put(mye, Boolean.TRUE);
            xc4 s = s(mye);
            if (s != null) {
                o4e o4e = (o4e) this.b.get(mye);
                Objects.requireNonNull(o4e);
                r(o4e, s, mye.n);
            }
        }
    }

    public final void i(mye mye) {
        gt0.i();
        if (t(mye)) {
            o4e o4e = (o4e) this.b.get(mye);
            Objects.requireNonNull(o4e);
            xc4 s = s(mye);
            if (s != null) {
                r(o4e, s, mye.n);
                return;
            }
            gt0.i();
            o4e.b();
            o4e.l.a();
        }
    }

    public final void m(mye mye) {
        gt0.i();
        if (t(mye)) {
            this.o.put(mye, Boolean.FALSE);
            o4e o4e = (o4e) this.b.get(mye);
            Objects.requireNonNull(o4e);
            gt0.i();
            o4e.b();
            o4e.l.a();
        }
    }

    public final ba0 q(mye mye, kbc kbc, hu1 hu1, o4e o4e, int i, boolean z) {
        boolean z2;
        Size size;
        mye mye2 = mye;
        kbc kbc2 = kbc;
        o4e o4e2 = o4e;
        int l = hu1.p().l(i);
        Matrix matrix = o4e2.b;
        RectF rectF = hqe.a;
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = (f2 * f4) + (f * f3);
        double sqrt = Math.sqrt((double) ((f2 * f2) + (f * f))) * Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
        boolean z3 = ((float) Math.toDegrees(Math.atan2(((double) ((f * f4) - (f2 * f3))) / sqrt, ((double) f5) / sqrt))) > 0.0f;
        pye pye = (pye) this.y0.get(mye2);
        Objects.requireNonNull(pye);
        float[] fArr2 = new float[9];
        o4e2.b.getValues(fArr2);
        int i2 = hqe.i((int) Math.round(Math.atan2((double) fArr2[3], (double) fArr2[0]) * 57.29577951308232d));
        kbc.getClass();
        boolean c2 = hqe.c(i2);
        Rect rect = o4e2.d;
        if (c2) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            size = hqe.e(rect);
            Iterator it = kbc2.b(pye).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Size e = hqe.e(kbc.a((Size) it.next(), size));
                if (!kbc.c(e, size)) {
                    size = e;
                    break;
                }
            }
        } else {
            Size e2 = hqe.e(rect);
            List b2 = kbc2.b(pye);
            Iterator it2 = b2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = b2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = e2;
                            break;
                        }
                        Size size2 = (Size) it3.next();
                        if (!kbc.c(size2, e2)) {
                            size = size2;
                            break;
                        }
                    }
                } else {
                    Size size3 = (Size) it2.next();
                    Rational rational = os.a;
                    Size size4 = hjd.c;
                    if (!os.a(e2, rational, size4)) {
                        rational = os.c;
                        if (!os.a(e2, rational, size4)) {
                            rational = kbc.g(e2);
                        }
                    }
                    if (!kbc2.d(rational, size3) && !kbc.c(size3, e2)) {
                        size = size3;
                        break;
                    }
                }
            }
            rect = kbc.a(e2, size);
        }
        Pair pair = new Pair(rect, size);
        Rect rect2 = (Rect) pair.first;
        Size size5 = (Size) pair.second;
        if (z2) {
            Size size6 = new Size(size5.getHeight(), size5.getWidth());
            rect2 = new Rect(rect2.top, rect2.left, rect2.bottom, rect2.right);
            size5 = size6;
        }
        Pair pair2 = new Pair(rect2, size5);
        Rect rect3 = (Rect) pair2.first;
        Size size7 = (Size) pair2.second;
        int l2 = this.Y.p().l(((br6) mye2.f).B(0));
        ycf ycf = (ycf) this.c.get(mye2);
        Objects.requireNonNull(ycf);
        ycf.c.c = l2;
        int i3 = hqe.i((o4e2.i + l2) - l);
        return new ba0(UUID.randomUUID(), mye2 instanceof b3b ? 1 : mye2 instanceof bq6 ? 4 : 2, mye2 instanceof bq6 ? 256 : 34, rect3, hqe.g(size7, i3), i3, mye2.n(hu1) ^ z3, false);
    }

    public final boolean t(mye mye) {
        Boolean bool = (Boolean) this.o.get(mye);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void u(HashMap hashMap) {
        HashMap hashMap2 = this.b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        for (Map.Entry entry : hashMap2.entrySet()) {
            mye mye = (mye) entry.getKey();
            o4e o4e = (o4e) entry.getValue();
            mye.C(o4e.d);
            mye.A(o4e.b);
            mye.g = mye.y(o4e.g, (va0) null);
            mye.r();
        }
    }
}
