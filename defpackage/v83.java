package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: v83  reason: default package */
public abstract class v83 extends zh0 {
    public final HashMap h = new HashMap();
    public Handler i;
    public cqe j;

    public final void e() {
        for (t83 t83 : this.h.values()) {
            t83.a.d(t83.b);
        }
    }

    public final void g() {
        for (t83 t83 : this.h.values()) {
            t83.a.f(t83.b);
        }
    }

    public void k() {
        for (t83 t83 : this.h.values()) {
            t83.a.k();
        }
    }

    public void q() {
        HashMap hashMap = this.h;
        for (t83 t83 : hashMap.values()) {
            t83.a.p(t83.b);
            zh0 zh0 = t83.a;
            stf stf = t83.c;
            zh0.s(stf);
            zh0.r(stf);
        }
        hashMap.clear();
    }

    public abstract se8 u(Object obj, se8 se8);

    public long v(long j2, Object obj) {
        return j2;
    }

    public int w(int i2, Object obj) {
        return i2;
    }

    public abstract void x(Object obj, zh0 zh0, vje vje);

    /* JADX WARNING: type inference failed for: r2v0, types: [stf, cf8, java.lang.Object, ho4] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, ze8] */
    /* JADX WARNING: type inference failed for: r3v3, types: [do4, java.lang.Object] */
    public final void y(Object obj, zh0 zh0) {
        HashMap hashMap = this.h;
        oyb.d(!hashMap.containsKey(obj));
        r83 r83 = new r83(this, obj);
        ? obj2 = new Object();
        obj2.o = this;
        obj2.b = b((se8) null);
        obj2.c = new fo4(this.d.c, 0, (se8) null);
        obj2.a = obj;
        hashMap.put(obj, new t83(zh0, r83, obj2));
        Handler handler = this.i;
        handler.getClass();
        zh0.getClass();
        jn jnVar = zh0.c;
        jnVar.getClass();
        ? obj3 = new Object();
        obj3.a = handler;
        obj3.b = obj2;
        ((CopyOnWriteArrayList) jnVar.o).add(obj3);
        Handler handler2 = this.i;
        handler2.getClass();
        fo4 fo4 = zh0.d;
        fo4.getClass();
        ? obj4 = new Object();
        obj4.a = handler2;
        obj4.b = obj2;
        fo4.c.add(obj4);
        cqe cqe = this.j;
        cza cza = this.g;
        oyb.l(cza);
        zh0.l(r83, cqe, cza);
        if (!(!this.b.isEmpty())) {
            zh0.d(r83);
        }
    }
}
