package defpackage;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: qh7  reason: default package */
public final class qh7 {
    public final z7e a;
    public final h8e b;
    public final nh7 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public qh7(Looper looper, z7e z7e, nh7 nh7) {
        this(new CopyOnWriteArraySet(), looper, z7e, nh7, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (!this.h) {
                    this.d.add(new ph7(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque arrayDeque = this.f;
        if (!arrayDeque.isEmpty()) {
            h8e h8e = this.b;
            if (!h8e.a.hasMessages(1)) {
                h8e.getClass();
                f8e c2 = h8e.c();
                c2.a = h8e.a.obtainMessage(1);
                h8e.getClass();
                Message message = c2.a;
                message.getClass();
                h8e.a.sendMessageAtFrontOfQueue(message);
                c2.a();
            }
            ArrayDeque arrayDeque2 = this.e;
            boolean z = !arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (!z) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public final void c(int i2, lh7 lh7) {
        g();
        this.f.add(new wg1((Object) new CopyOnWriteArraySet(this.d), i2, (Object) lh7, 12));
    }

    public final void d() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ph7 ph7 = (ph7) it.next();
            nh7 nh7 = this.c;
            ph7.d = true;
            if (ph7.c) {
                ph7.c = false;
                nh7.d(ph7.a, ph7.b.e());
            }
        }
        this.d.clear();
    }

    public final void e(Object obj) {
        g();
        CopyOnWriteArraySet copyOnWriteArraySet = this.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ph7 ph7 = (ph7) it.next();
            if (ph7.a.equals(obj)) {
                ph7.d = true;
                if (ph7.c) {
                    ph7.c = false;
                    wi5 e2 = ph7.b.e();
                    this.c.d(ph7.a, e2);
                }
                copyOnWriteArraySet.remove(ph7);
            }
        }
    }

    public final void f(int i2, lh7 lh7) {
        c(i2, lh7);
        b();
    }

    public final void g() {
        if (this.i) {
            oyb.k(Thread.currentThread() == this.b.a.getLooper().getThread());
        }
    }

    public qh7(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, z7e z7e, nh7 nh7, boolean z) {
        this.a = z7e;
        this.d = copyOnWriteArraySet;
        this.c = nh7;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = z7e.a(looper, new fi4(2, this));
        this.i = z;
    }
}
