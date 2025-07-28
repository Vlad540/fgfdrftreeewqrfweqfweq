package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qm6  reason: default package */
public final class qm6 extends AtomicReference implements xi4, fm6 {
    public final String X;
    public final omc Y;
    public final bw9 Z;
    public final t97 a;
    public final int b;
    public final String c;
    public final String o;
    public final AtomicBoolean w0 = new AtomicBoolean();
    public long x0;

    public qm6(bw9 bw9, t97 t97, int i, String str, String str2, String str3, omc omc) {
        this.a = t97;
        this.b = i;
        this.c = str;
        this.o = str2;
        this.X = str3;
        this.Y = omc;
        this.Z = bw9;
    }

    public final void a(boolean z) {
        if (this.w0.compareAndSet(false, true)) {
            omc omc = this.Y;
            if (!omc.h()) {
                omc.f();
            }
            if (z) {
                udd.q("rm6", "cancelUpload");
                dg5 dg5 = (dg5) get();
                if (dg5 != null) {
                    synchronized (dg5) {
                        try {
                            if (!dg5.b) {
                                if (dg5.a != null && !dg5.a.B0) {
                                    dg5.a.d();
                                }
                                dg5.b = true;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b(String str, am6 am6) {
        if (!this.w0.get()) {
            this.Y.b(new px4(this, str, am6, 7));
        }
    }

    public final void f() {
        a(true);
    }

    public final boolean h() {
        return this.w0.get();
    }
}
