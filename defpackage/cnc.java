package defpackage;

import java.util.Objects;

/* renamed from: cnc  reason: default package */
public abstract class cnc {
    public static final oid a;
    public static final r93 b;
    public static final g27 c;
    public static final xpe d = xpe.c;

    static {
        try {
            oid oid = bnc.a;
            Objects.requireNonNull(oid, "Scheduler Supplier result can't be null");
            a = oid;
            try {
                r93 r93 = ymc.a;
                Objects.requireNonNull(r93, "Scheduler Supplier result can't be null");
                b = r93;
                try {
                    g27 g27 = zmc.a;
                    Objects.requireNonNull(g27, "Scheduler Supplier result can't be null");
                    c = g27;
                    try {
                        Objects.requireNonNull(anc.a, "Scheduler Supplier result can't be null");
                    } catch (Throwable th) {
                        throw i15.f(th);
                    }
                } finally {
                    RuntimeException f = i15.f(th);
                }
            } finally {
                RuntimeException f2 = i15.f(th);
            }
        } finally {
            RuntimeException f3 = i15.f(th);
        }
    }

    public static qmc a() {
        r93 r93 = b;
        j26 j26 = xs7.B;
        if (j26 == null) {
            return r93;
        }
        try {
            return (qmc) j26.apply(r93);
        } catch (Throwable th) {
            throw i15.f(th);
        }
    }

    public static qmc b() {
        g27 g27 = c;
        j26 j26 = xs7.D;
        if (j26 == null) {
            return g27;
        }
        try {
            return (qmc) j26.apply(g27);
        } catch (Throwable th) {
            throw i15.f(th);
        }
    }
}
