package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: oe3  reason: default package */
public abstract class oe3 {
    public final cf3 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public Object d;
    public ydc e;

    public oe3(cf3 cf3) {
        this.a = cf3;
    }

    public abstract boolean a(ztf ztf);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        this.b.clear();
        this.c.clear();
        ArrayList arrayList = this.b;
        for (Object next : iterable) {
            if (a((ztf) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = this.b;
        ArrayList arrayList3 = this.c;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ztf) it.next()).a);
        }
        if (this.b.isEmpty()) {
            this.a.n(this);
        } else {
            cf3 cf3 = this.a;
            synchronized (cf3.c) {
                try {
                    if (((LinkedHashSet) cf3.X).add(this)) {
                        if (((LinkedHashSet) cf3.X).size() == 1) {
                            cf3.o = cf3.i();
                            a24 B = a24.B();
                            String str = df3.a;
                            B.t(str, cf3.getClass().getSimpleName() + ": initial state = " + cf3.o);
                            cf3.r();
                        }
                        Object obj = cf3.o;
                        this.d = obj;
                        d(this.e, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.e, this.d);
    }

    public final void d(ydc ydc, Object obj) {
        if (!this.b.isEmpty() && ydc != null) {
            if (obj == null || b(obj)) {
                ArrayList arrayList = this.b;
                synchronized (ydc.o) {
                    usf usf = (usf) ydc.b;
                    if (usf != null) {
                        usf.a(arrayList);
                    }
                }
                return;
            }
            ArrayList arrayList2 = this.b;
            synchronized (ydc.o) {
                try {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (ydc.q(((ztf) next).a)) {
                            arrayList3.add(next);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        a24 B = a24.B();
                        String str = vsf.a;
                        B.t(str, "Constraints met for " + ((ztf) it2.next()));
                    }
                    usf usf2 = (usf) ydc.b;
                    if (usf2 != null) {
                        usf2.f(arrayList3);
                    }
                } finally {
                }
            }
        }
    }
}
