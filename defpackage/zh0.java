package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: zh0  reason: default package */
public abstract class zh0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final jn c = new jn(new CopyOnWriteArrayList(), 0, (se8) null);
    public final fo4 d = new fo4(new CopyOnWriteArrayList(), 0, (se8) null);
    public Looper e;
    public vje f;
    public cza g;

    public boolean a(l68 l68) {
        return false;
    }

    public final jn b(se8 se8) {
        return new jn((CopyOnWriteArrayList) this.c.o, 0, se8);
    }

    public abstract s88 c(se8 se8, l34 l34, long j);

    public final void d(ue8 ue8) {
        HashSet hashSet = this.b;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(ue8);
        if (z && hashSet.isEmpty()) {
            e();
        }
    }

    public void e() {
    }

    public final void f(ue8 ue8) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(ue8);
        if (isEmpty) {
            g();
        }
    }

    public void g() {
    }

    public vje h() {
        return null;
    }

    public abstract l68 i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(ue8 ue8, cqe cqe, cza cza) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        oyb.d(looper == null || looper == myLooper);
        this.g = cza;
        vje vje = this.f;
        this.a.add(ue8);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(ue8);
            m(cqe);
        } else if (vje != null) {
            f(ue8);
            ue8.a(this, vje);
        }
    }

    public abstract void m(cqe cqe);

    public final void n(vje vje) {
        this.f = vje;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ue8) it.next()).a(this, vje);
        }
    }

    public abstract void o(s88 s88);

    public final void p(ue8 ue8) {
        ArrayList arrayList = this.a;
        arrayList.remove(ue8);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            q();
            return;
        }
        d(ue8);
    }

    public abstract void q();

    public final void r(ho4 ho4) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            do4 do4 = (do4) it.next();
            if (do4.b == ho4) {
                copyOnWriteArrayList.remove(do4);
            }
        }
    }

    public final void s(cf8 cf8) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.o;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ze8 ze8 = (ze8) it.next();
            if (ze8.b == cf8) {
                copyOnWriteArrayList.remove(ze8);
            }
        }
    }

    public void t(l68 l68) {
    }
}
