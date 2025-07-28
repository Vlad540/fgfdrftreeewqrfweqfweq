package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: gt3  reason: default package */
public final class gt3 {
    public final t97 a;
    public final t97 b;
    public final t97 c;

    public gt3(t97 t97, t97 t972, t97 t973) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [l7c, java.lang.Object] */
    public final ms9 a(ys8 ys8) {
        ov9 ov9;
        ArrayList arrayList;
        udd.p("gt3", "convertVideo: messageUpload = %s", new Object[]{ys8});
        int i = ys8.d;
        if (i != 2 && i != 9) {
            return ms9.m(ys8);
        }
        ? obj = new Object();
        obj.a = ys8;
        if (ys8.e == null) {
            xs8 a2 = ys8.a();
            l10 l10 = new l10(1);
            qjb qjb = ((qpc) ((ip) this.a.getValue())).p().a;
            String str = ((ys8) obj.a).b;
            xh0 xh0 = (xh0) ((u98) this.c.getValue());
            xh0.getClass();
            Object obj2 = null;
            try {
                arrayList = ete.y(Uri.parse(str), xh0.a, xh0);
            } catch (Throwable th) {
                udd.s("xh0", "getAvailableQualitiesForVideo: failed", th);
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (it.hasNext()) {
                        qjb qjb2 = ((rjb) obj2).a;
                        do {
                            Object next = it.next();
                            qjb qjb3 = ((rjb) next).a;
                            if (qjb2.compareTo(qjb3) > 0) {
                                obj2 = next;
                                qjb2 = qjb3;
                            }
                        } while (it.hasNext());
                    }
                }
                rjb rjb = (rjb) obj2;
                if (rjb != null) {
                    qjb qjb4 = rjb.a;
                    if (qjb4.compareTo(qjb) >= 0) {
                        qjb = qjb4;
                    }
                }
            }
            l10.a = qjb;
            a2.e = new f3f(l10);
            obj.a = new ys8(a2);
        }
        Object obj3 = obj.a;
        f3f f3f = ((ys8) obj3).e;
        if (f3f == null) {
            return ms9.m(obj3);
        }
        l10 l102 = new l10(1);
        l102.a = f3f.a;
        l102.b = f3f.b;
        l102.c = f3f.c;
        l102.d = f3f.d;
        f3f f3f2 = new f3f(l102);
        f2b f2b = new f2b(13);
        f2b.b = ((ys8) obj.a).b;
        f2b.c = f3f2;
        a3f a3f = new a3f(f2b);
        j3f j3f = (j3f) this.b.getValue();
        synchronized (j3f) {
            udd.p("j3f", "convertVideo: %s", new Object[]{a3f});
            ov9 = (ms9) j3f.i.get(a3f);
            if (ov9 == null) {
                nx7 nx7 = new nx7(new jx7(j3f.b.a(), 2, new g3f(a3f, 1)), new are(23), 1);
                are are = new are(21);
                gf6 gf6 = z3d.j;
                z26 z26 = z3d.i;
                f36 jx7 = new jx7(new xx7(new zx7(nx7, are, gf6, z26), new ox7(new rz3(j3f, 9, a3f))), 1, new i3f(j3f, 0));
                ts9 ts9 = new ts9(new ts9(new kt9(jx7 instanceof f36 ? jx7.c() : new n73(1, jx7), gf6, new joc(j3f, 22, a3f), z26), gf6, new ace(j3f, 6, a3f), 2), new i3f(j3f, 1), z26, 2);
                fja.D(1, "bufferSize");
                gf6 gf62 = new gf6(14);
                AtomicReference atomicReference = new AtomicReference();
                ov9 = new uu9(new dv9(new av9(atomicReference, gf62), ts9, atomicReference, gf62)).r(j3f.f);
                j3f.i.put(a3f, ov9);
            }
        }
        return new au9(new kt9(ov9, g02.c, z3d.j, z3d.i), new mb1(7, obj), 3);
    }
}
