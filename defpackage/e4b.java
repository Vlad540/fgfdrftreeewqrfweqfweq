package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: e4b  reason: default package */
public final class e4b {
    public static final e4b f = new e4b();
    public final Object a = new Object();
    public vn1 b;
    public final uwb c = new uwb(2);
    public hv1 d;
    public final HashMap e = new HashMap();

    public static final ht1 a(e4b e4b, wu1 wu1) {
        e4b.getClass();
        Iterator it = wu1.a.iterator();
        while (it.hasNext()) {
            zt1 zt1 = (zt1) it.next();
            o90 o90 = zt1.a;
            if (!hhd.f(o90, o90)) {
                synchronized (r55.a) {
                    gt1 gt1 = (gt1) r55.b.get(o90);
                }
            }
        }
        return it1.a;
    }

    public static final void b(e4b e4b, int i) {
        hv1 hv1 = e4b.d;
        if (hv1 != null) {
            zd2 zd2 = hv1.f;
            if (zd2 != null) {
                ope ope = (ope) zd2.c;
                if (i != ope.b) {
                    Iterator it = ((ArrayList) ope.o).iterator();
                    while (it.hasNext()) {
                        bv1 bv1 = (bv1) it.next();
                        int i2 = ope.b;
                        synchronized (bv1.b) {
                            boolean z = true;
                            bv1.c = i == 2 ? 2 : 1;
                            boolean z2 = i2 != 2 && i == 2;
                            if (i2 != 2 || i == 2) {
                                z = false;
                            }
                            if (z2 || z) {
                                bv1.b();
                            }
                        }
                    }
                }
                if (ope.b == 2 && i != 2) {
                    ((ArrayList) ope.Y).clear();
                }
                ope.b = i;
                return;
            }
            throw new IllegalStateException("CameraX not initialized yet.");
        }
    }

    public final qb7 c(nc7 nc7, wu1 wu1, jg8 jg8) {
        int i;
        Trace.beginSection(am7.C("CX:bindToLifecycle-UseCaseGroup"));
        try {
            hv1 hv1 = this.d;
            if (hv1 == null) {
                i = 0;
            } else {
                zd2 zd2 = hv1.f;
                if (zd2 != null) {
                    i = ((ope) zd2.c).b;
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (i != 2) {
                b(this, 1);
                mye[] myeArr = (mye[]) ((List) jg8.b).toArray(new mye[0]);
                return d(nc7, wu1, (ybf) jg8.c, (List) jg8.o, (mye[]) Arrays.copyOf(myeArr, myeArr.length));
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } finally {
            Trace.endSection();
        }
    }

    public final qb7 d(nc7 nc7, wu1 wu1, ybf ybf, List list, mye... myeArr) {
        qb7 qb7;
        Collection unmodifiableCollection;
        boolean contains;
        nc7 nc72 = nc7;
        wu1 wu12 = wu1;
        mye[] myeArr2 = myeArr;
        Trace.beginSection(am7.C("CX:bindToLifecycle-internal"));
        try {
            gt0.i();
            hu1 c2 = wu12.c(this.d.a.G());
            c2.o(true);
            fcc e2 = e(wu12);
            uwb uwb = this.c;
            w80 t = ev1.t(e2, (fcc) null);
            synchronized (uwb.b) {
                qb7 = (qb7) ((HashMap) uwb.c).get(new v90(nc72, t));
            }
            uwb uwb2 = this.c;
            synchronized (uwb2.b) {
                unmodifiableCollection = Collections.unmodifiableCollection(((HashMap) uwb2.c).values());
            }
            Iterator it = cs.X(myeArr).iterator();
            while (it.hasNext()) {
                mye mye = (mye) it.next();
                Iterator it2 = unmodifiableCollection.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        qb7 qb72 = (qb7) it2.next();
                        synchronized (qb72.a) {
                            contains = ((ArrayList) qb72.c.w()).contains(mye);
                        }
                        if (contains) {
                            if (!qb72.equals(qb7)) {
                                throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{mye}, 1)));
                            }
                        }
                    }
                }
                while (true) {
                }
            }
            if (qb7 == null) {
                uwb uwb3 = this.c;
                hv1 hv1 = this.d;
                zd2 zd2 = hv1.f;
                if (zd2 != null) {
                    ope ope = (ope) zd2.c;
                    mn mnVar = hv1.g;
                    if (mnVar != null) {
                        ls1 ls1 = hv1.h;
                        if (ls1 != null) {
                            qb7 = uwb3.j(nc72, new ev1(c2, (hu1) null, e2, (fcc) null, ope, mnVar, ls1));
                        } else {
                            throw new IllegalStateException("CameraX not initialized yet.");
                        }
                    } else {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            qb7 qb73 = qb7;
            if (myeArr2.length != 0) {
                uwb uwb4 = this.c;
                List B = p23.B(Arrays.copyOf(myeArr2, myeArr2.length));
                zd2 zd22 = this.d.f;
                if (zd22 != null) {
                    uwb4.h(qb73, ybf, list, B, (ope) zd22.c);
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            Trace.endSection();
            return qb73;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final fcc e(wu1 wu1) {
        Object obj;
        Trace.beginSection(am7.C("CX:getCameraInfo"));
        try {
            fu1 p = wu1.c(this.d.a.G()).p();
            ht1 a2 = a(this, wu1);
            w80 w80 = new w80(p.d(), a2.a);
            synchronized (this.a) {
                obj = this.e.get(w80);
                if (obj == null) {
                    obj = new fcc(p, a2);
                    this.e.put(w80, obj);
                }
            }
            fcc fcc = (fcc) obj;
            Trace.endSection();
            return fcc;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void f() {
        Trace.beginSection(am7.C("CX:unbindAll"));
        try {
            gt0.i();
            b(this, 0);
            this.c.r();
        } finally {
            Trace.endSection();
        }
    }
}
