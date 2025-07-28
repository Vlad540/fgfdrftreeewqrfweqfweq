package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: pf8  reason: default package */
public final class pf8 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public boolean g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public Object l;
    public Object m;

    public pf8(xwb xwb, d4b d4b, xw0 xw0, xw0 xw02, ow0 ow0, fje fje) {
        this.a = 3;
        this.h = xwb;
        this.b = d4b;
        this.c = xw0;
        this.e = xw02;
        this.i = ow0;
        this.j = fje;
        this.k = new Handler(Looper.getMainLooper());
        this.f = new LinkedHashSet();
        this.d = new HashMap();
        this.m = new xqd(this);
    }

    public uje a(int i2, List list, xed xed) {
        if (!list.isEmpty()) {
            this.l = xed;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                mf8 mf8 = (mf8) list.get(i3 - i2);
                ArrayList arrayList = (ArrayList) this.b;
                if (i3 > 0) {
                    mf8 mf82 = (mf8) arrayList.get(i3 - 1);
                    mf8.d = mf82.a.o.b.p() + mf82.d;
                    mf8.e = false;
                    mf8.c.clear();
                } else {
                    mf8.d = 0;
                    mf8.e = false;
                    mf8.c.clear();
                }
                int p = mf8.a.o.b.p();
                for (int i4 = i3; i4 < arrayList.size(); i4++) {
                    ((mf8) arrayList.get(i4)).d += p;
                }
                arrayList.add(i3, mf8);
                ((HashMap) this.d).put(mf8.b, mf8);
                if (this.g) {
                    k(mf8);
                    if (((IdentityHashMap) this.c).isEmpty()) {
                        ((HashSet) this.f).add(mf8);
                    } else {
                        kf8 kf8 = (kf8) ((HashMap) this.e).get(mf8);
                        if (kf8 != null) {
                            kf8.a.b(kf8.b);
                        }
                    }
                }
            }
        }
        return e();
    }

    public vje b(int i2, List list, yed yed) {
        if (!list.isEmpty()) {
            this.l = yed;
            for (int i3 = i2; i3 < list.size() + i2; i3++) {
                nf8 nf8 = (nf8) list.get(i3 - i2);
                ArrayList arrayList = (ArrayList) this.b;
                if (i3 > 0) {
                    nf8 nf82 = (nf8) arrayList.get(i3 - 1);
                    nf8.d = nf82.a.o.e.p() + nf82.d;
                    nf8.e = false;
                    nf8.c.clear();
                } else {
                    nf8.d = 0;
                    nf8.e = false;
                    nf8.c.clear();
                }
                int p = nf8.a.o.e.p();
                for (int i4 = i3; i4 < arrayList.size(); i4++) {
                    ((nf8) arrayList.get(i4)).d += p;
                }
                arrayList.add(i3, nf8);
                ((HashMap) this.d).put(nf8.b, nf8);
                if (this.g) {
                    l(nf8);
                    if (((IdentityHashMap) this.c).isEmpty()) {
                        ((HashSet) this.f).add(nf8);
                    } else {
                        lf8 lf8 = (lf8) ((HashMap) this.e).get(nf8);
                        if (lf8 != null) {
                            lf8.a.d(lf8.b);
                        }
                    }
                }
            }
        }
        return f();
    }

    public void c(xrd xrd, long j2, TimeUnit timeUnit) {
        ((HashMap) this.d).put(xrd, new uwf(j2, timeUnit));
    }

    public void d(ead ead, float f2, RectF rectF, lv1 lv1, Path path) {
        int i2;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        nad[] nadArr;
        Path path2;
        Path path3;
        pf8 pf8 = this;
        ead ead2 = ead;
        float f3 = f2;
        RectF rectF2 = rectF;
        lv1 lv12 = lv1;
        Path path4 = path;
        path.rewind();
        Path path5 = (Path) pf8.e;
        path5.rewind();
        Path path6 = (Path) pf8.i;
        path6.rewind();
        path6.addRect(rectF2, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            i2 = 4;
            matrixArr = (Matrix[]) pf8.c;
            fArr = (float[]) pf8.k;
            matrixArr2 = (Matrix[]) pf8.b;
            nadArr = (nad[]) pf8.h;
            if (i3 >= 4) {
                break;
            }
            du3 du3 = i3 != 1 ? i3 != 2 ? i3 != 3 ? ead2.f : ead2.e : ead2.h : ead2.g;
            udd udd = i3 != 1 ? i3 != 2 ? i3 != 3 ? ead2.b : ead2.a : ead2.d : ead2.c;
            nad nad = nadArr[i3];
            udd.getClass();
            udd.y(nad, f3, du3.a(rectF2));
            int i4 = i3 + 1;
            float f4 = (float) ((i4 % 4) * 90);
            matrixArr2[i3].reset();
            PointF pointF = (PointF) pf8.d;
            int i5 = i4;
            if (i3 == 1) {
                path3 = path5;
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i3 == 2) {
                path3 = path5;
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i3 != 3) {
                path3 = path5;
                pointF.set(rectF2.right, rectF2.top);
            } else {
                path3 = path5;
                pointF.set(rectF2.left, rectF2.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f4);
            nad nad2 = nadArr[i3];
            fArr[0] = nad2.c;
            fArr[1] = nad2.d;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f4);
            i3 = i5;
            path5 = path3;
        }
        Path path7 = path5;
        int i6 = 0;
        while (i6 < i2) {
            nad nad3 = nadArr[i6];
            fArr[0] = nad3.a;
            fArr[1] = nad3.b;
            matrixArr2[i6].mapPoints(fArr);
            if (i6 == 0) {
                path4.moveTo(fArr[0], fArr[1]);
            } else {
                path4.lineTo(fArr[0], fArr[1]);
            }
            nadArr[i6].b(matrixArr2[i6], path4);
            if (lv12 != null) {
                nad nad4 = nadArr[i6];
                Matrix matrix = matrixArr2[i6];
                lw7 lw7 = (lw7) lv12.b;
                BitSet bitSet = lw7.o;
                nad4.getClass();
                bitSet.set(i6, false);
                nad4.a(nad4.f);
                lw7.b[i6] = new gad(new ArrayList(nad4.h), new Matrix(matrix));
            }
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            nad nad5 = nadArr[i6];
            fArr[0] = nad5.c;
            fArr[1] = nad5.d;
            matrixArr2[i6].mapPoints(fArr);
            nad nad6 = nadArr[i8];
            float f5 = nad6.a;
            float[] fArr2 = (float[]) pf8.f;
            fArr2[0] = f5;
            fArr2[1] = nad6.b;
            matrixArr2[i8].mapPoints(fArr2);
            int i9 = i7;
            float max = Math.max(((float) Math.hypot((double) (fArr[0] - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
            nad nad7 = nadArr[i6];
            fArr[0] = nad7.c;
            fArr[1] = nad7.d;
            matrixArr2[i6].mapPoints(fArr);
            float abs = (i6 == 1 || i6 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            nad nad8 = (nad) pf8.j;
            nad8.d(0.0f, 0.0f, 270.0f, 0.0f);
            qr4 qr4 = i6 != 1 ? i6 != 2 ? i6 != 3 ? ead2.j : ead2.i : ead2.l : ead2.k;
            qr4.q(max, abs, f3, nad8);
            Path path8 = (Path) pf8.l;
            path8.reset();
            nad8.b(matrixArr[i6], path8);
            if (!pf8.g || (!qr4.o() && !pf8.j(path8, i6) && !pf8.j(path8, i8))) {
                path2 = path7;
                nad8.b(matrixArr[i6], path4);
            } else {
                path8.op(path8, path6, Path.Op.DIFFERENCE);
                fArr[0] = nad8.a;
                fArr[1] = nad8.b;
                matrixArr[i6].mapPoints(fArr);
                path2 = path7;
                path2.moveTo(fArr[0], fArr[1]);
                nad8.b(matrixArr[i6], path2);
            }
            lv1 lv13 = lv1;
            if (lv13 != null) {
                Matrix matrix2 = matrixArr[i6];
                lw7 lw72 = (lw7) lv13.b;
                lw72.o.set(i6 + 4, false);
                nad8.a(nad8.f);
                lw72.c[i6] = new gad(new ArrayList(nad8.h), new Matrix(matrix2));
            }
            pf8 = this;
            ead2 = ead;
            lv12 = lv13;
            path7 = path2;
            i6 = i9;
            i2 = 4;
            RectF rectF3 = rectF;
        }
        Path path9 = path7;
        path.close();
        path9.close();
        if (!path9.isEmpty()) {
            path4.op(path9, Path.Op.UNION);
        }
    }

    public uje e() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return uje.a;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            mf8 mf8 = (mf8) arrayList.get(i3);
            mf8.d = i2;
            i2 += mf8.a.o.b.p();
        }
        return new tza(arrayList, (xed) this.l);
    }

    public vje f() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return vje.a;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            nf8 nf8 = (nf8) arrayList.get(i3);
            nf8.d = i2;
            i2 += nf8.a.o.e.p();
        }
        return new uza(arrayList, (yed) this.l);
    }

    public void g() {
        switch (this.a) {
            case 0:
                Iterator it = ((HashSet) this.f).iterator();
                while (it.hasNext()) {
                    mf8 mf8 = (mf8) it.next();
                    if (mf8.c.isEmpty()) {
                        kf8 kf8 = (kf8) ((HashMap) this.e).get(mf8);
                        if (kf8 != null) {
                            kf8.a.b(kf8.b);
                        }
                        it.remove();
                    }
                }
                return;
            default:
                Iterator it2 = ((HashSet) this.f).iterator();
                while (it2.hasNext()) {
                    nf8 nf8 = (nf8) it2.next();
                    if (nf8.c.isEmpty()) {
                        lf8 lf8 = (lf8) ((HashMap) this.e).get(nf8);
                        if (lf8 != null) {
                            lf8.a.d(lf8.b);
                        }
                        it2.remove();
                    }
                }
                return;
        }
    }

    public void h(mf8 mf8) {
        if (mf8.e && mf8.c.isEmpty()) {
            kf8 kf8 = (kf8) ((HashMap) this.e).remove(mf8);
            kf8.getClass();
            yh0 yh0 = kf8.a;
            yh0.l(kf8.b);
            nxc nxc = kf8.c;
            yh0.o(nxc);
            yh0.n(nxc);
            ((HashSet) this.f).remove(mf8);
        }
    }

    public void i(nf8 nf8) {
        if (nf8.e && nf8.c.isEmpty()) {
            lf8 lf8 = (lf8) ((HashMap) this.e).remove(nf8);
            lf8.getClass();
            zh0 zh0 = lf8.a;
            zh0.p(lf8.b);
            otf otf = lf8.c;
            zh0.s(otf);
            zh0.r(otf);
            ((HashSet) this.f).remove(nf8);
        }
    }

    public boolean j(Path path, int i2) {
        Path path2 = (Path) this.m;
        path2.reset();
        ((nad[]) this.h)[i2].b(((Matrix[]) this.b)[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [bf8, nxc, java.lang.Object, go4] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, ye8] */
    /* JADX WARNING: type inference failed for: r4v2, types: [co4, java.lang.Object] */
    public void k(mf8 mf8) {
        lv7 lv7 = mf8.a;
        ff8 ff8 = new ff8(this);
        ? obj = new Object();
        obj.o = this;
        obj.b = (af8) this.j;
        obj.c = (eo4) this.k;
        obj.a = mf8;
        ((HashMap) this.e).put(mf8, new kf8(lv7, ff8, obj));
        int i2 = mze.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, (Handler.Callback) null);
        lv7.getClass();
        af8 af8 = lv7.c;
        af8.getClass();
        ? obj2 = new Object();
        obj2.a = handler;
        obj2.b = obj;
        ((CopyOnWriteArrayList) af8.d).add(obj2);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, (Handler.Callback) null);
        eo4 eo4 = lv7.d;
        eo4.getClass();
        ? obj3 = new Object();
        obj3.a = handler2;
        obj3.b = obj;
        eo4.c.add(obj3);
        lv7.h(ff8, (bqe) this.m, (bza) this.h);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, ze8] */
    /* JADX WARNING: type inference failed for: r4v2, types: [do4, java.lang.Object] */
    public void l(nf8 nf8) {
        mv7 mv7 = nf8.a;
        gf8 gf8 = new gf8(this);
        otf otf = new otf(this, nf8, false);
        ((HashMap) this.e).put(nf8, new lf8(mv7, gf8, otf));
        Handler p = oze.p((fi4) null);
        mv7.getClass();
        jn jnVar = mv7.c;
        jnVar.getClass();
        ? obj = new Object();
        obj.a = p;
        obj.b = otf;
        ((CopyOnWriteArrayList) jnVar.o).add(obj);
        Handler p2 = oze.p((fi4) null);
        fo4 fo4 = mv7.d;
        fo4.getClass();
        ? obj2 = new Object();
        obj2.a = p2;
        obj2.b = otf;
        fo4.c.add(obj2);
        mv7.l(gf8, (cqe) this.m, (cza) this.h);
    }

    public void m(rxf rxf) {
        Handler handler = (Handler) this.k;
        if (!hhd.f(handler.getLooper().getThread(), Thread.currentThread())) {
            handler.post(new uqd(this, rxf, 0));
        } else if (!this.g) {
            ((LinkedHashSet) this.f).add(rxf);
        }
    }

    public void n(r88 r88) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.c;
        mf8 mf8 = (mf8) identityHashMap.remove(r88);
        mf8.getClass();
        mf8.a.k(r88);
        mf8.c.remove(((fv7) r88).a);
        if (!identityHashMap.isEmpty()) {
            g();
        }
        h(mf8);
    }

    public void o(s88 s88) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.c;
        nf8 nf8 = (nf8) identityHashMap.remove(s88);
        nf8.getClass();
        nf8.a.o(s88);
        nf8.c.remove(((gv7) s88).a);
        if (!identityHashMap.isEmpty()) {
            g();
        }
        i(nf8);
    }

    public void p(int i2, int i3) {
        switch (this.a) {
            case 0:
                for (int i4 = i3 - 1; i4 >= i2; i4--) {
                    ArrayList arrayList = (ArrayList) this.b;
                    mf8 mf8 = (mf8) arrayList.remove(i4);
                    ((HashMap) this.d).remove(mf8.b);
                    int i5 = -mf8.a.o.b.p();
                    for (int i6 = i4; i6 < arrayList.size(); i6++) {
                        ((mf8) arrayList.get(i6)).d += i5;
                    }
                    mf8.e = true;
                    if (this.g) {
                        h(mf8);
                    }
                }
                return;
            default:
                for (int i7 = i3 - 1; i7 >= i2; i7--) {
                    ArrayList arrayList2 = (ArrayList) this.b;
                    nf8 nf8 = (nf8) arrayList2.remove(i7);
                    ((HashMap) this.d).remove(nf8.b);
                    int i8 = -nf8.a.o.e.p();
                    for (int i9 = i7; i9 < arrayList2.size(); i9++) {
                        ((nf8) arrayList2.get(i9)).d += i8;
                    }
                    nf8.e = true;
                    if (this.g) {
                        i(nf8);
                    }
                }
                return;
        }
    }

    public pf8() {
        this.a = 2;
        this.h = new nad[4];
        this.b = new Matrix[4];
        this.c = new Matrix[4];
        this.d = new PointF();
        this.e = new Path();
        this.i = new Path();
        this.j = new nad();
        this.k = new float[2];
        this.f = new float[2];
        this.l = new Path();
        this.m = new Path();
        this.g = true;
        for (int i2 = 0; i2 < 4; i2++) {
            ((nad[]) this.h)[i2] = new nad();
            ((Matrix[]) this.b)[i2] = new Matrix();
            ((Matrix[]) this.c)[i2] = new Matrix();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, ye8] */
    /* JADX WARNING: type inference failed for: r1v2, types: [co4, java.lang.Object] */
    public pf8(y45 y45, f44 f44, Handler handler, bza bza) {
        this.a = 0;
        this.h = bza;
        this.i = y45;
        this.l = new xed();
        this.c = new IdentityHashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        af8 af8 = new af8();
        this.j = af8;
        eo4 eo4 = new eo4();
        this.k = eo4;
        this.e = new HashMap();
        this.f = new HashSet();
        f44.getClass();
        ? obj = new Object();
        obj.a = handler;
        obj.b = f44;
        ((CopyOnWriteArrayList) af8.d).add(obj);
        ? obj2 = new Object();
        obj2.a = handler;
        obj2.b = f44;
        eo4.c.add(obj2);
    }

    public pf8(of8 of8, g44 g44, h8e h8e, cza cza) {
        this.a = 1;
        this.h = cza;
        this.i = of8;
        this.l = new yed();
        this.c = new IdentityHashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        this.j = g44;
        this.k = h8e;
        this.e = new HashMap();
        this.f = new HashSet();
    }
}
