package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: kj  reason: default package */
public final class kj {
    public final bd4 a;
    public final h2d b;
    public volatile Integer c;
    public volatile az3 d;
    public volatile cz3 e;
    public final jj f = new jj(this);
    public volatile lt4 g;
    public volatile long h;

    public kj(bd4 bd4, h2d h2d, Integer num) {
        this.a = bd4;
        this.b = h2d;
        this.c = num;
        Integer num2 = this.c;
        this.g = (num2 != null && num2.intValue() == 1) ? null : new lt4(this);
        bd4.getClass();
    }

    public final void a(int i, ez3 ez3) {
        String str;
        cz3 cz3;
        Boolean bool = null;
        boolean z = true;
        ij ijVar = (i != 1 || !(ez3 instanceof zh)) ? new ij(i, (int) (SystemClock.elapsedRealtime() - this.h), ez3) : null;
        if (!(ijVar == null || (cz3 = this.e) == null)) {
            AtomicInteger atomicInteger = cz3.X;
            int i2 = atomicInteger.get();
            int i3 = cz3.b;
            h2d h2d = cz3.a;
            if (i2 > i3) {
                ((AtomicInteger) h2d.c).incrementAndGet();
                z = false;
            } else {
                cz3.o.add(ijVar);
                ((AtomicInteger) h2d.o).incrementAndGet();
                atomicInteger.incrementAndGet();
                ReentrantLock reentrantLock = cz3.w0;
                reentrantLock.lock();
                try {
                    cz3.x0.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
            bool = Boolean.valueOf(z);
        }
        if (!hhd.f(bool, Boolean.TRUE)) {
            if (!(ez3 instanceof yh)) {
                if (ez3 instanceof zh) {
                    iu7.f(16);
                    String l = Long.toString(((long) ((zh) ez3).f) & 4294967295L, 16);
                    int i4 = 6;
                    if (l.length() > 6) {
                        i4 = 8;
                    }
                    str = rf0.h("bgColor: 0x", h0e.h0(l, i4, '0'));
                } else if (ez3 instanceof ai) {
                    str = "EOS";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                ((xwb) this.a.b).log("AniSend", "package was not sent: " + str);
                return;
            }
            ((yh) ez3).getClass();
            throw null;
        }
    }

    public final void b() {
        az3 az3 = this.d;
        if (az3 != null) {
            jj jjVar = this.f;
            if (jjVar != null) {
                az3.c.remove(jjVar);
            } else {
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        this.d = null;
        cz3 cz3 = this.e;
        if (cz3 != null) {
            if (!cz3.z0) {
                cz3.z0 = true;
                cz3.interrupt();
            }
            ReentrantLock reentrantLock = cz3.y0;
            reentrantLock.lock();
            try {
                cz3.c = null;
            } finally {
                reentrantLock.unlock();
            }
        }
        this.e = null;
    }

    public final void c(int i) {
        lt4 lt4 = this.g;
        Integer num = this.c;
        if (lt4 != null) {
            lt4.b = Integer.valueOf(i);
            lt4.a();
        } else if (num != null) {
            int intValue = num.intValue();
            if (intValue == 2) {
                a(intValue, new zh(i));
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
            xwb xwb = (xwb) this.a.b;
            String message = illegalStateException.getMessage();
            if (message == null) {
                message = "animoji error";
            }
            xwb.reportException("AniSend", message, illegalStateException);
            lt4 lt42 = new lt4(this);
            lt42.b = Integer.valueOf(i);
            lt42.a();
            this.g = lt42;
        }
    }

    public final void d(az3 az3) {
        b();
        this.d = az3;
        jj jjVar = this.f;
        if (jjVar != null) {
            az3.c.add(jjVar);
            this.h = SystemClock.elapsedRealtime();
            h2d h2d = this.b;
            ((AtomicInteger) h2d.a).set(0);
            ((AtomicInteger) h2d.b).set(0);
            ((AtomicInteger) h2d.c).set(0);
            ((AtomicInteger) h2d.o).set(0);
            this.e = new cz3(az3, this.b);
            cz3 cz3 = this.e;
            if (cz3 != null) {
                cz3.start();
            }
            lt4 lt4 = this.g;
            if (lt4 != null) {
                lt4.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Illegal 'listener' value: null");
    }
}
