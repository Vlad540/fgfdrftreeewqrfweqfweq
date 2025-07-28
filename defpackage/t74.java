package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: t74  reason: default package */
public final class t74 implements k75 {
    public static final int[] w0 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final b2b x0 = new b2b(new i74(1));
    public static final b2b y0 = new b2b(new i74(2));
    public boolean X = true;
    public s1e Y = new smc(9);
    public int Z;
    public boolean a;
    public int b;
    public int c;
    public e8c o;

    public final synchronized e75[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056 A[Catch:{ all -> 0x0048 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.e75[] b(android.net.Uri r7, java.util.Map r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0048 }
            int[] r1 = w0     // Catch:{ all -> 0x0048 }
            r2 = 21
            r0.<init>(r2)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "Content-Type"
            java.lang.Object r8 = r8.get(r3)     // Catch:{ all -> 0x0048 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0048 }
            r3 = 0
            if (r8 == 0) goto L_0x0023
            boolean r4 = r8.isEmpty()     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x001c
            goto L_0x0023
        L_0x001c:
            java.lang.Object r8 = r8.get(r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0048 }
            goto L_0x0024
        L_0x0023:
            r8 = 0
        L_0x0024:
            int r8 = defpackage.n1g.x(r8)     // Catch:{ all -> 0x0048 }
            r4 = -1
            if (r8 == r4) goto L_0x002e
            r6.c(r0, r8)     // Catch:{ all -> 0x0048 }
        L_0x002e:
            int r7 = defpackage.n1g.y(r7)     // Catch:{ all -> 0x0048 }
            if (r7 == r4) goto L_0x0039
            if (r7 == r8) goto L_0x0039
            r6.c(r0, r7)     // Catch:{ all -> 0x0048 }
        L_0x0039:
            r4 = r3
        L_0x003a:
            if (r4 >= r2) goto L_0x004a
            r5 = r1[r4]     // Catch:{ all -> 0x0048 }
            if (r5 == r8) goto L_0x0045
            if (r5 == r7) goto L_0x0045
            r6.c(r0, r5)     // Catch:{ all -> 0x0048 }
        L_0x0045:
            int r4 = r4 + 1
            goto L_0x003a
        L_0x0048:
            r7 = move-exception
            goto L_0x0097
        L_0x004a:
            int r7 = r0.size()     // Catch:{ all -> 0x0048 }
            e75[] r7 = new defpackage.e75[r7]     // Catch:{ all -> 0x0048 }
        L_0x0050:
            int r8 = r0.size()     // Catch:{ all -> 0x0048 }
            if (r3 >= r8) goto L_0x0095
            java.lang.Object r8 = r0.get(r3)     // Catch:{ all -> 0x0048 }
            e75 r8 = (defpackage.e75) r8     // Catch:{ all -> 0x0048 }
            boolean r1 = r6.X     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0090
            e75 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.ny5     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            e75 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.q79     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            e75 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.mse     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            e75 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.xc0     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            e75 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.yw7     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            v1e r1 = new v1e     // Catch:{ all -> 0x0048 }
            s1e r2 = r6.Y     // Catch:{ all -> 0x0048 }
            r1.<init>(r8, r2)     // Catch:{ all -> 0x0048 }
            r8 = r1
        L_0x0090:
            r7[r3] = r8     // Catch:{ all -> 0x0048 }
            int r3 = r3 + 1
            goto L_0x0050
        L_0x0095:
            monitor-exit(r6)
            return r7
        L_0x0097:
            monitor-exit(r6)     // Catch:{ all -> 0x0048 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t74.b(android.net.Uri, java.util.Map):e75[]");
    }

    public final void c(ArrayList arrayList, int i) {
        int i2 = 2;
        int i3 = 0;
        switch (i) {
            case 0:
                arrayList.add(new s3());
                return;
            case 1:
                arrayList.add(new w3());
                return;
            case 2:
                arrayList.add(new fc(this.a ? 1 : 0));
                return;
            case 3:
                arrayList.add(new ad(this.a ? 1 : 0));
                return;
            case 4:
                e75 y = x0.y(0);
                if (y != null) {
                    arrayList.add(y);
                    return;
                } else {
                    arrayList.add(new pi5());
                    return;
                }
            case 5:
                arrayList.add(new uo5());
                return;
            case 6:
                s1e s1e = this.Y;
                int i4 = this.b;
                if (this.X) {
                    i2 = 0;
                }
                arrayList.add(new yw7(i4 | i2, s1e));
                return;
            case 7:
                arrayList.add(new m79(this.a ? 1 : 0));
                return;
            case 8:
                arrayList.add(new ny5(this.X ? 0 : 32, this.Y));
                s1e s1e2 = this.Y;
                int i5 = this.c;
                if (!this.X) {
                    i3 = 16;
                }
                arrayList.add(new q79(i5 | i3, s1e2));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new vib());
                return;
            case 11:
                if (this.o == null) {
                    po5 po5 = ws6.b;
                    this.o = e8c.X;
                }
                arrayList.add(new mse(1, this.X ^ true ? 1 : 0, this.Y, new cke(0), new cc4(this.o, 0, 1)));
                return;
            case 12:
                arrayList.add(new vef());
                return;
            case 14:
                arrayList.add(new l94(this.Z));
                return;
            case 15:
                e75 y2 = y0.y(new Object[0]);
                if (y2 != null) {
                    arrayList.add(y2);
                    return;
                }
                return;
            case 16:
                arrayList.add(new xc0(this.X ^ true ? 1 : 0, this.Y));
                return;
            case 17:
                arrayList.add(new ro0(1));
                return;
            case 18:
                arrayList.add(new ad0(2));
                return;
            case 19:
                arrayList.add(new ro0(0));
                return;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                int i6 = this.c;
                if ((i6 & 2) == 0 && (i6 & 4) == 0) {
                    arrayList.add(new ad0(1));
                    return;
                }
                return;
            case 21:
                arrayList.add(new ad0(0));
                return;
            default:
                return;
        }
    }

    public final void d(smc smc) {
        synchronized (this) {
            this.Y = smc;
        }
    }

    public final void k(boolean z) {
        synchronized (this) {
            this.X = z;
        }
    }
}
