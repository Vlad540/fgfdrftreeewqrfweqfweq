package defpackage;

import java.util.Set;

/* renamed from: uyd  reason: default package */
public final class uyd implements Runnable {
    public static final String o = a24.e0("StopWorkRunnable");
    public final itf a;
    public final nqd b;
    public final boolean c;

    public uyd(itf itf, nqd nqd, boolean z) {
        this.a = itf;
        this.b = nqd;
        this.c = z;
    }

    public final void run() {
        boolean z;
        nuf nuf;
        if (this.c) {
            t4b t4b = this.a.f;
            nqd nqd = this.b;
            t4b.getClass();
            String str = nqd.a.a;
            synchronized (t4b.A0) {
                try {
                    a24.B().t(t4b.B0, "Processor stopping foreground work " + str);
                    nuf = (nuf) t4b.Y.remove(str);
                    if (nuf != null) {
                        t4b.w0.remove(str);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            z = t4b.c(str, nuf);
        } else {
            t4b t4b2 = this.a.f;
            nqd nqd2 = this.b;
            t4b2.getClass();
            String str2 = nqd2.a.a;
            synchronized (t4b2.A0) {
                try {
                    nuf nuf2 = (nuf) t4b2.Z.remove(str2);
                    if (nuf2 == null) {
                        a24.B().t(t4b.B0, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) t4b2.w0.get(str2);
                        if (set != null) {
                            if (set.contains(nqd2)) {
                                a24.B().t(t4b.B0, "Processor stopping background work " + str2);
                                t4b2.w0.remove(str2);
                                z = t4b.c(str2, nuf2);
                            }
                        }
                    }
                    z = false;
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
        }
        a24.B().t(o, "StopWorkRunnable for " + this.b.a.a + "; Processor.stopWork = " + z);
    }
}
