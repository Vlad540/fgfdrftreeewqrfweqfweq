package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sce  reason: default package */
public final class sce {
    public final qbe a;

    public sce(qbe qbe) {
        this.a = qbe;
    }

    public static long a(qbe qbe, rce rce) {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "sce", "execute " + rce, (Throwable) null);
        }
        if (rce.b) {
            ol olVar = rce.a;
            long j = rce.d;
            int i = rce.e;
            ybe ybe = (ybe) qbe;
            ybe.getClass();
            if (olVar instanceof tna) {
                ((x4a) ybe.y0.getValue()).b().execute(new sbe(ybe, olVar, j, i));
                return olVar.a;
            }
            throw new IllegalArgumentException("task must be instance of PersistableTask");
        }
        ol olVar2 = rce.a;
        return ((ybe) qbe).b(olVar2, (qce) olVar2, rce.c);
    }

    public static long b(sce sce, ol olVar) {
        sce.getClass();
        return a(sce.a, new rce(olVar, false, false, 0, 0));
    }

    public static /* synthetic */ long d(sce sce, ol olVar, boolean z, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return sce.c(olVar, z, 0, i);
    }

    public final long c(ol olVar, boolean z, long j, int i) {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            StringBuilder sb = new StringBuilder("executeAndSave ");
            ol olVar2 = olVar;
            sb.append(olVar);
            sb.append(", ");
            boolean z2 = z;
            sb.append(z);
            sb.append(", ");
            sb.append(j);
            sb.append(", ");
            sb.append(i);
            fn6.d(tn7, "sce", sb.toString(), (Throwable) null);
        } else {
            ol olVar3 = olVar;
            boolean z3 = z;
            long j2 = j;
            int i2 = i;
        }
        rce rce = new rce(olVar, true, z, j, i);
        fn6 fn62 = udd.e;
        if (fn62 != null && fn62.c()) {
            tn7 tn72 = tn7.X;
            fn62.d(tn72, "sce", "tamService != null, execute task " + rce + " ", (Throwable) null);
        }
        return a(this.a, rce);
    }

    public final Object e(ibe ibe, Continuation continuation) {
        zv1 zv1 = new zv1(1, urd.y(continuation));
        zv1.n();
        wbe wbe = new wbe(1, zv1);
        ybe ybe = (ybe) this.a;
        t97 t97 = ybe.B0;
        ((dce) t97.getValue()).f(false);
        vbe vbe = new vbe(wbe);
        dce dce = (dce) t97.getValue();
        long d = ybe.d(ibe);
        u1d u1d = (u1d) dce.Z.get();
        if (u1d != null && !dce.e(ibe, vbe)) {
            u1d.g(ibe, false, d, vbe);
        }
        return zv1.m();
    }
}
