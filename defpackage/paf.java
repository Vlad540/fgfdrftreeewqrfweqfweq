package defpackage;

import android.util.Log;
import android.view.View;

/* renamed from: paf  reason: default package */
public abstract class paf {
    public static final oaf a = new Object();
    public static final boolean b = Log.isLoggable("shared.ViewLifecycle", 3);

    /* JADX WARNING: type inference failed for: r0v9, types: [nc7, java.lang.Object, android.view.View$OnAttachStateChangeListener, kc7] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r1.a(ob7.c) == true) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final nc7 a(android.view.View r4) {
        /*
            x51 r0 = x51.E0
            if (r4 != 0) goto L_0x0007
            pw4 r0 = pw4.a
            goto L_0x0014
        L_0x0007:
            ij4 r1 = new ij4
            ke r2 = new ke
            r3 = 6
            r2.<init>(r3, r4)
            r3 = 1
            r1.<init>(r2, r3, r0)
            r0 = r1
        L_0x0014:
            x51 r1 = x51.F0
            sg5 r0 = myc.Q(r0, r1)
            java.lang.Object r0 = myc.O(r0)
            nc7 r0 = (nc7) r0
            if (r0 != 0) goto L_0x0066
            int r0 = defpackage.erb.view_custom_attach_lifecycle_owner
            java.lang.Object r0 = r4.getTag(r0)
            boolean r1 = r0 instanceof defpackage.kc7
            if (r1 == 0) goto L_0x002f
            kc7 r0 = (defpackage.kc7) r0
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0044
            pc7 r1 = r0.a
            if (r1 == 0) goto L_0x0044
            ob7 r1 = r1.d
            if (r1 == 0) goto L_0x0044
            ob7 r2 = ob7.c
            boolean r1 = r1.a(r2)
            r2 = 1
            if (r1 != r2) goto L_0x0044
            goto L_0x0066
        L_0x0044:
            kc7 r0 = new kc7
            r0.<init>()
            pc7 r1 = new pc7
            r1.<init>(r0)
            r0.a = r1
            nb7 r2 = nb7.ON_CREATE
            r1.d(r2)
            r4.addOnAttachStateChangeListener(r0)
            boolean r1 = r4.isAttachedToWindow()
            if (r1 == 0) goto L_0x0061
            r0.onViewAttachedToWindow(r4)
        L_0x0061:
            int r1 = defpackage.erb.view_custom_attach_lifecycle_owner
            r4.setTag(r1, r0)
        L_0x0066:
            boolean r4 = b
            if (r4 == 0) goto L_0x007a
            pc7 r4 = r0.R()
            oaf r1 = a
            r4.f(r1)
            pc7 r4 = r0.R()
            r4.a(r1)
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.paf.a(android.view.View):nc7");
    }

    public static final ac7 b(View view) {
        return xs7.A(a(view));
    }
}
