package defpackage;

import android.view.View;
import java.util.concurrent.ExecutorService;

/* renamed from: fc1  reason: default package */
public final class fc1 extends jgd {
    public final u5g X;
    public final w4c Y;

    public fc1(u5g u5g, w4c w4c, ExecutorService executorService) {
        super(executorService);
        this.X = u5g;
        this.Y = w4c;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [dc1, b7c] */
    /* JADX WARNING: type inference failed for: r6v3, types: [ec1, b7c] */
    /* renamed from: H */
    public final void r(chd chd, int i) {
        boolean z = chd instanceof ec1;
        u5g u5g = this.X;
        if (z) {
            ? r6 = (ec1) chd;
            jx0 jx0 = (pg7) C(i);
            if (jx0 instanceof jx0) {
                n7d n7d = r6.a;
                n7d n7d2 = n7d;
                jx0 jx02 = jx0;
                boolean z2 = jx02.y0;
                n7d2.setDisableStartIconText(z2);
                r6.A(jx0);
                n7d2.setEnabled(z2);
                if (z2) {
                    a24.Z(n7d, 300, new cc1(u5g, jx0, 1));
                } else {
                    n7d.setOnClickListener((View.OnClickListener) null);
                }
                CharSequence charSequence = r6.J0.b;
                n7d2.setDescription(charSequence != null ? new lge(charSequence) : jx02.Y);
            }
        } else if (chd instanceof dc1) {
            ? r62 = (dc1) chd;
            jx0 jx03 = (pg7) C(i);
            if (jx03 instanceof jx0) {
                r62.A(jx03);
                n7d n7d3 = r62.a;
                boolean z3 = jx03.y0;
                n7d3.setEnabled(z3);
                if (z3) {
                    a24.Z(n7d3, 300, new cc1(u5g, jx03, 0));
                } else {
                    n7d3.setOnClickListener((View.OnClickListener) null);
                }
            }
        } else {
            chd.A((pg7) C(i));
        }
    }

    /* renamed from: I */
    public final void y(chd chd) {
        chd.D();
        ec1 ec1 = chd instanceof ec1 ? (ec1) chd : null;
        if (ec1 != null) {
            ec1.J0.a.remove(ec1);
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [b7c] */
    /* JADX WARNING: type inference failed for: r4v6, types: [b7c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.b7c t(android.view.ViewGroup r5, int r6) {
        /*
            r4 = this;
            int r0 = defpackage.o1a.k0
            r1 = 0
            if (r6 != r0) goto L_0x0019
            dc1 r4 = new dc1
            android.content.Context r5 = r5.getContext()
            n7d r6 = new n7d
            r6.<init>(r5, r1)
            r4.<init>(r6)
            j7d r5 = j7d.b
            r6.setThemeDepended(r5)
            goto L_0x0056
        L_0x0019:
            int r0 = defpackage.o1a.i0
            if (r6 != r0) goto L_0x002a
            ec1 r6 = new ec1
            android.content.Context r5 = r5.getContext()
            w4c r4 = r4.Y
            r6.<init>(r5, r4)
            r4 = r6
            goto L_0x0056
        L_0x002a:
            java.lang.Class<fc1> r4 = defpackage.fc1.class
            java.lang.String r4 = r4.getName()
            fn6 r0 = defpackage.udd.e
            if (r0 != 0) goto L_0x0035
            goto L_0x0046
        L_0x0035:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x0046
            tn7 r2 = tn7.Z
            java.lang.String r3 = "unknown item viewType: "
            java.lang.String r6 = wn6.h(r6, r3)
            r0.d(r2, r4, r6, r1)
        L_0x0046:
            android.view.View r4 = new android.view.View
            android.content.Context r5 = r5.getContext()
            r4.<init>(r5)
            rx0 r5 = new rx0
            r6 = 3
            r5.<init>(r4, r6)
            r4 = r5
        L_0x0056:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fc1.t(android.view.ViewGroup, int):b7c");
    }
}
