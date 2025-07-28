package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: yh0  reason: default package */
public abstract class yh0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final af8 c = new af8();
    public final eo4 d = new eo4();
    public Looper e;
    public uje f;
    public bza g;

    public abstract r88 a(re8 re8, l34 l34, long j);

    public final void b(te8 te8) {
        HashSet hashSet = this.b;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(te8);
        if (z && hashSet.isEmpty()) {
            c();
        }
    }

    public void c() {
    }

    public final void d(te8 te8) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(te8);
        if (isEmpty) {
            e();
        }
    }

    public void e() {
    }

    public abstract j68 f();

    public abstract void g();

    public final void h(te8 te8, bqe bqe, bza bza) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        swb.e(looper == null || looper == myLooper);
        this.g = bza;
        uje uje = this.f;
        this.a.add(te8);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(te8);
            i(bqe);
        } else if (uje != null) {
            d(te8);
            te8.a(this, uje);
        }
    }

    public abstract void i(bqe bqe);

    public final void j(uje uje) {
        this.f = uje;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((te8) it.next()).a(this, uje);
        }
    }

    public abstract void k(r88 r88);

    public final void l(te8 te8) {
        ArrayList arrayList = this.a;
        arrayList.remove(te8);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            m();
            return;
        }
        b(te8);
    }

    public abstract void m();

    public final void n(go4 go4) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            co4 co4 = (co4) it.next();
            if (co4.b == go4) {
                copyOnWriteArrayList.remove(co4);
            }
        }
    }

    public final void o(bf8 bf8) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ye8 ye8 = (ye8) it.next();
            if (ye8.b == bf8) {
                copyOnWriteArrayList.remove(ye8);
            }
        }
    }
}
