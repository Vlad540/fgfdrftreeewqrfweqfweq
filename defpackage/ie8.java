package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: ie8  reason: default package */
public final class ie8 implements hc8 {
    public final hn6 a;

    public ie8(hn6 hn6) {
        this.a = hn6;
    }

    public final void b(int i) {
        this.a.b(i);
    }

    public final void d(int i, fza fza, eya eya, boolean z, boolean z2, int i2) {
        Bundle bundle;
        boolean z3 = false;
        oyb.k(i2 != 0);
        boolean z4 = z || !eya.a(17);
        if (z2 || !eya.a(30)) {
            z3 = true;
        }
        hn6 hn6 = this.a;
        if (i2 >= 2) {
            fza q = fza.q(eya, z, z2);
            if (hn6 instanceof z48) {
                bundle = new Bundle();
                bundle.putBinder(fza.l0, new eza(q));
            } else {
                bundle = q.t(i2);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean(dza.d, z4);
            bundle2.putBoolean(dza.e, z3);
            hn6.H(i, bundle, bundle2);
            return;
        }
        hn6.q0(i, fza.q(eya, z, true).t(i2), z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != ie8.class) {
            return false;
        }
        return oze.a(this.a.asBinder(), ((ie8) obj).a.asBinder());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
        if (r2 != 4) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(int r8, defpackage.gb7 r9) {
        /*
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = defpackage.gb7.g
            int r2 = r9.a
            r0.putInt(r1, r2)
            java.lang.String r1 = defpackage.gb7.h
            long r2 = r9.b
            r0.putLong(r1, r2)
            h78 r1 = r9.e
            if (r1 == 0) goto L_0x003d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = defpackage.h78.e
            android.os.Bundle r4 = r1.a
            r2.putBundle(r3, r4)
            java.lang.String r3 = defpackage.h78.f
            boolean r4 = r1.b
            r2.putBoolean(r3, r4)
            java.lang.String r3 = defpackage.h78.g
            boolean r4 = r1.c
            r2.putBoolean(r3, r4)
            java.lang.String r3 = defpackage.h78.h
            boolean r1 = r1.d
            r2.putBoolean(r3, r1)
            java.lang.String r1 = defpackage.gb7.i
            r0.putBundle(r1, r2)
        L_0x003d:
            f2d r1 = r9.f
            if (r1 == 0) goto L_0x004a
            android.os.Bundle r1 = r1.b()
            java.lang.String r2 = defpackage.gb7.l
            r0.putBundle(r2, r1)
        L_0x004a:
            java.lang.String r1 = defpackage.gb7.k
            int r2 = r9.d
            r0.putInt(r1, r2)
            java.lang.Object r9 = r9.c
            if (r9 != 0) goto L_0x0056
            goto L_0x0099
        L_0x0056:
            r1 = 1
            if (r2 == r1) goto L_0x009f
            java.lang.String r1 = defpackage.gb7.j
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L_0x0090
            r3 = 3
            if (r2 == r3) goto L_0x0066
            r9 = 4
            if (r2 == r9) goto L_0x009f
            goto L_0x0099
        L_0x0066:
            it0 r2 = new it0
            ws6 r9 = (defpackage.ws6) r9
            ts6 r3 = defpackage.ws6.i()
            r5 = r4
        L_0x006f:
            int r6 = r9.size()
            if (r5 >= r6) goto L_0x0085
            java.lang.Object r6 = r9.get(r5)
            l68 r6 = (defpackage.l68) r6
            android.os.Bundle r6 = r6.d(r4)
            r3.a(r6)
            int r5 = r5 + 1
            goto L_0x006f
        L_0x0085:
            e8c r9 = r3.j()
            r2.<init>(r9)
            r0.putBinder(r1, r2)
            goto L_0x0099
        L_0x0090:
            l68 r9 = (defpackage.l68) r9
            android.os.Bundle r9 = r9.d(r4)
            r0.putBundle(r1, r9)
        L_0x0099:
            hn6 r7 = r7.a
            r7.M(r8, r0)
            return
        L_0x009f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie8.f(int, gb7):void");
    }

    public final void h(int i, eya eya) {
        this.a.A(i, eya.f());
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a.asBinder()});
    }

    public final void i(int i, p2d p2d) {
        this.a.F0(i, p2d.b());
    }

    public final void j(int i, n2d n2d, boolean z, boolean z2, int i2) {
        this.a.D(i, n2d.a(z, z2).c(i2));
    }

    public final void onDisconnected() {
        this.a.c(0);
    }
}
