package defpackage;

import android.opengl.GLES30;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: fc4  reason: default package */
public final /* synthetic */ class fc4 implements i4f {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fc4(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                jc4 jc4 = (jc4) this.c;
                long j = this.b;
                synchronized (jc4) {
                    while (jc4.i.f() < jc4.i.b && jc4.j.f() <= j) {
                        try {
                            bq0 bq0 = jc4.i;
                            ArrayDeque arrayDeque = (ArrayDeque) bq0.e;
                            oyb.k(!arrayDeque.isEmpty());
                            ((ArrayDeque) bq0.d).add((p96) arrayDeque.remove());
                            jc4.j.h();
                            GLES30.glDeleteSync(jc4.k.h());
                            gt0.g();
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                    jc4.b();
                }
                return;
            case 1:
                rc4 rc4 = (rc4) this.c;
                tg5 tg5 = rc4.i;
                if (tg5.p == null) {
                    oyb.k(!tg5.r);
                    ConcurrentLinkedQueue concurrentLinkedQueue = tg5.l;
                    Pair pair = (Pair) concurrentLinkedQueue.remove();
                    long longValue = ((Long) pair.second).longValue();
                    tg5.k(rc4.b, (p96) pair.first, longValue, this.b);
                    if (concurrentLinkedQueue.isEmpty() && tg5.x) {
                        nc4 nc4 = tg5.A;
                        nc4.getClass();
                        nc4.a();
                        tg5.x = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                tg5 tg52 = (tg5) this.c;
                oyb.k(tg52.p != null);
                while (true) {
                    bq0 bq02 = tg52.m;
                    if (bq02.f() < bq02.b) {
                        xx xxVar = tg52.n;
                        if (xxVar.f() <= this.b) {
                            ArrayDeque arrayDeque2 = (ArrayDeque) bq02.e;
                            oyb.k(!arrayDeque2.isEmpty());
                            ((ArrayDeque) bq02.d).add((p96) arrayDeque2.remove());
                            xxVar.h();
                            GLES30.glDeleteSync(tg52.o.h());
                            gt0.g();
                            tg52.y.i();
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
        }
    }
}
