package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: vk9  reason: default package */
public final class vk9 extends xk9 {
    public static final /* synthetic */ k77[] i;
    public final zb9 e = new zb9((Object) null);
    public final ReentrantLock f = new ReentrantLock();
    public final e3 g = hwf.t();
    public long h;

    static {
        k77 hc9 = new hc9(vk9.class, "job", "getJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        i = new k77[]{hc9};
    }

    public vk9(ou3 ou3, t97 t97) {
        super(ou3, t97);
        int i2 = zp4.o;
        this.h = 0;
        a();
        this.c = xs7.E(ou3, (hu3) null, (ru3) null, new uk9(this, (Continuation) null), 3);
    }

    public final void d() {
        zb9 zb9 = this.e;
        if (e()) {
            ReentrantLock reentrantLock = this.f;
            reentrantLock.lock();
            try {
                int i2 = zb9.d;
                yzc yzc = ((j2b) ((g2b) this.b.getValue())).b;
                yzc.getClass();
                if (i2 >= ((int) yzc.o(PmsKey.f89noncontactmaxchunksize, (long) 10))) {
                    int i3 = zp4.o;
                    long Q = mt0.Q(System.nanoTime(), eq4.b);
                    if (zp4.c(zp4.g(Q, this.h), b()) <= 0) {
                        reentrantLock.unlock();
                        return;
                    }
                    this.h = Q;
                    zb9 h2 = lp.h(zb9);
                    zb9.c();
                    this.g.o1(this, i[0], xs7.E(this.a, (hu3) null, ru3.b, new tk9(this, h2, (Continuation) null), 1));
                    reentrantLock.unlock();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean e() {
        if (zp4.c(b(), 0) > 0) {
            yzc yzc = ((j2b) ((g2b) this.b.getValue())).b;
            yzc.getClass();
            if (((int) yzc.o(PmsKey.f89noncontactmaxchunksize, (long) 10)) > 0) {
                return true;
            }
        }
        return false;
    }
}
