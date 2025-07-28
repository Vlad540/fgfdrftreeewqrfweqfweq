package defpackage;

import java.util.ArrayList;

/* renamed from: k6c  reason: default package */
public abstract class k6c {
    public za6 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(b7c b7c) {
        int i = b7c.y0;
        if (!b7c.n() && (i & 4) == 0) {
            b7c.g();
        }
    }

    public abstract boolean a(b7c b7c, b7c b7c2, ms msVar, ms msVar2);

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.b7c r9) {
        /*
            r8 = this;
            za6 r8 = r8.a
            if (r8 == 0) goto L_0x00a4
            r0 = 1
            r9.v(r0)
            b7c r1 = r9.w0
            r2 = 0
            if (r1 == 0) goto L_0x0013
            b7c r1 = r9.x0
            if (r1 != 0) goto L_0x0013
            r9.w0 = r2
        L_0x0013:
            r9.x0 = r2
            int r1 = r9.y0
            r1 = r1 & 16
            if (r1 == 0) goto L_0x001d
            goto L_0x00a4
        L_0x001d:
            java.lang.Object r8 = r8.a
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r8.C0()
            ope r1 = r8.x0
            java.lang.Object r2 = r1.X
            xw2 r2 = (defpackage.xw2) r2
            java.lang.Object r3 = r1.o
            u41 r3 = (defpackage.u41) r3
            int r4 = r1.b
            r5 = 0
            android.view.View r6 = r9.a
            if (r4 != r0) goto L_0x0045
            java.lang.Object r0 = r1.c
            android.view.View r0 = (android.view.View) r0
            if (r0 != r6) goto L_0x003d
        L_0x003b:
            r0 = r5
            goto L_0x006e
        L_0x003d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r8.<init>(r9)
            throw r8
        L_0x0045:
            r7 = 2
            if (r4 == r7) goto L_0x009c
            r1.b = r7     // Catch:{ all -> 0x0059 }
            androidx.recyclerview.widget.RecyclerView r4 = r3.a     // Catch:{ all -> 0x0059 }
            int r4 = r4.indexOfChild(r6)     // Catch:{ all -> 0x0059 }
            r7 = -1
            if (r4 != r7) goto L_0x005b
            r1.X(r6)     // Catch:{ all -> 0x0059 }
        L_0x0056:
            r1.b = r5
            goto L_0x006e
        L_0x0059:
            r8 = move-exception
            goto L_0x0099
        L_0x005b:
            boolean r7 = r2.S(r4)     // Catch:{ all -> 0x0059 }
            if (r7 == 0) goto L_0x006b
            r2.Z(r4)     // Catch:{ all -> 0x0059 }
            r1.X(r6)     // Catch:{ all -> 0x0059 }
            r3.a(r4)     // Catch:{ all -> 0x0059 }
            goto L_0x0056
        L_0x006b:
            r1.b = r5
            goto L_0x003b
        L_0x006e:
            if (r0 == 0) goto L_0x0088
            b7c r1 = androidx.recyclerview.widget.RecyclerView.U(r6)
            t6c r2 = r8.c
            r2.k(r1)
            t6c r2 = r8.c
            r2.h(r1)
            boolean r1 = androidx.recyclerview.widget.RecyclerView.Q1
            if (r1 == 0) goto L_0x0088
            java.util.Objects.toString(r6)
            r8.toString()
        L_0x0088:
            r1 = r0 ^ 1
            r8.D0(r1)
            if (r0 != 0) goto L_0x00a4
            boolean r9 = r9.r()
            if (r9 == 0) goto L_0x00a4
            r8.removeDetachedView(r6, r5)
            goto L_0x00a4
        L_0x0099:
            r1.b = r5
            throw r8
        L_0x009c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r8.<init>(r9)
            throw r8
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k6c.c(b7c):void");
    }

    public abstract void d(b7c b7c);

    public abstract void e();

    public abstract boolean f();
}
