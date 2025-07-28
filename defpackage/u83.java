package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: u83  reason: default package */
public abstract class u83 extends yh0 {
    public final HashMap h = new HashMap();
    public Handler i;
    public bqe j;

    public final void c() {
        for (s83 s83 : this.h.values()) {
            s83.a.b(s83.b);
        }
    }

    public final void e() {
        for (s83 s83 : this.h.values()) {
            s83.a.d(s83.b);
        }
    }

    public void g() {
        for (s83 s83 : this.h.values()) {
            s83.a.g();
        }
    }

    public void m() {
        HashMap hashMap = this.h;
        for (s83 s83 : hashMap.values()) {
            s83.a.l(s83.b);
            yh0 yh0 = s83.a;
            j8e j8e = s83.c;
            yh0.o(j8e);
            yh0.n(j8e);
        }
        hashMap.clear();
    }

    public re8 p(Object obj, re8 re8) {
        return re8;
    }

    public abstract void q(Integer num, yh0 yh0, uje uje);

    /* JADX WARNING: type inference failed for: r2v0, types: [bf8, j8e, java.lang.Object, go4] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, ye8] */
    /* JADX WARNING: type inference failed for: r3v6, types: [co4, java.lang.Object] */
    public final void r(Integer num, yh0 yh0) {
        HashMap hashMap = this.h;
        swb.e(!hashMap.containsKey(num));
        q83 q83 = new q83(this, num);
        ? obj = new Object();
        obj.o = this;
        obj.b = new af8((CopyOnWriteArrayList) this.c.d, 0, (re8) null, 0);
        obj.c = new eo4(this.d.c, 0, (re8) null);
        obj.a = num;
        hashMap.put(num, new s83(yh0, q83, obj));
        Handler handler = this.i;
        handler.getClass();
        yh0.getClass();
        af8 af8 = yh0.c;
        af8.getClass();
        ? obj2 = new Object();
        obj2.a = handler;
        obj2.b = obj;
        ((CopyOnWriteArrayList) af8.d).add(obj2);
        Handler handler2 = this.i;
        handler2.getClass();
        eo4 eo4 = yh0.d;
        eo4.getClass();
        ? obj3 = new Object();
        obj3.a = handler2;
        obj3.b = obj;
        eo4.c.add(obj3);
        bqe bqe = this.j;
        bza bza = this.g;
        swb.i(bza);
        yh0.h(q83, bqe, bza);
        if (!(!this.b.isEmpty())) {
            yh0.b(q83);
        }
    }
}
