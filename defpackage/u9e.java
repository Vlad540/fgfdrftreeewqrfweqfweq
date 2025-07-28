package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: u9e  reason: default package */
public final class u9e {
    public final Context a;
    public final Object b;
    public volatile int c;
    public List d;
    public final ArrayList e;

    public u9e(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.a = applicationContext;
            this.b = new Object();
            this.c = 1;
            this.e = new ArrayList();
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:48|49) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:22|23|24|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:38|39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r2.toString();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0071 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x009d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00b4 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0071=Splitter:B:24:0x0071, B:40:0x009d=Splitter:B:40:0x009d, B:46:0x00af=Splitter:B:46:0x00af} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r8) {
        /*
            r7 = this;
            int r0 = r7.c
            int r0 = hr1.b(r0, r8)
            if (r0 < 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.Object r0 = r7.b
            monitor-enter(r0)
            int r1 = r7.c     // Catch:{ all -> 0x0078 }
            int r2 = hr1.b(r1, r8)     // Catch:{ all -> 0x0078 }
            if (r2 < 0) goto L_0x0016
            monitor-exit(r0)
            return
        L_0x0016:
            android.content.Context r2 = r7.a     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = xs7.B()     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = r2.getPackageName()     // Catch:{ all -> 0x0078 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0078 }
            if (r4 == 0) goto L_0x0029
            java.lang.String r3 = "tracer"
            goto L_0x0043
        L_0x0029:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            java.lang.String r5 = "tracer-"
            r4.<init>(r5)     // Catch:{ all -> 0x0078 }
            r5 = 45
            r6 = 58
            java.lang.String r3 = r3.replace(r6, r5)     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = android.net.Uri.encode(r3)     // Catch:{ all -> 0x0078 }
            r4.append(r3)     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0078 }
        L_0x0043:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0078 }
            java.io.File r2 = r2.getCacheDir()     // Catch:{ all -> 0x0078 }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x0078 }
            java.lang.String r2 = "tags"
            java.io.File r2 = ng5.N(r4, r2)     // Catch:{ all -> 0x0078 }
            int r1 = hr1.t(r1)     // Catch:{ all -> 0x0078 }
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x008a
            if (r1 != r4) goto L_0x0082
            int[] r1 = defpackage.t9e.$EnumSwitchMapping$0     // Catch:{ all -> 0x0078 }
            int r8 = hr1.t(r8)     // Catch:{ all -> 0x0078 }
            r8 = r1[r8]     // Catch:{ all -> 0x0078 }
            if (r8 != r3) goto L_0x007a
            boolean r8 = r2.exists()     // Catch:{ all -> 0x0078 }
            if (r8 != 0) goto L_0x006d
            goto L_0x0074
        L_0x006d:
            h2g.h(r2)     // Catch:{ IOException -> 0x0071 }
            goto L_0x0074
        L_0x0071:
            r2.toString()     // Catch:{ all -> 0x0078 }
        L_0x0074:
            r8 = 0
            r7.d = r8     // Catch:{ all -> 0x0078 }
            goto L_0x00bb
        L_0x0078:
            r7 = move-exception
            goto L_0x00bd
        L_0x007a:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x0078 }
            java.lang.String r8 = "Unreachable code"
            r7.<init>(r8)     // Catch:{ all -> 0x0078 }
            throw r7     // Catch:{ all -> 0x0078 }
        L_0x0082:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x0078 }
            java.lang.String r8 = "Unreachable code"
            r7.<init>(r8)     // Catch:{ all -> 0x0078 }
            throw r7     // Catch:{ all -> 0x0078 }
        L_0x008a:
            int r8 = hr1.t(r8)     // Catch:{ all -> 0x0078 }
            if (r8 == r4) goto L_0x00a9
            if (r8 != r3) goto L_0x00a1
            boolean r7 = r2.exists()     // Catch:{ all -> 0x0078 }
            if (r7 != 0) goto L_0x0099
            goto L_0x00bb
        L_0x0099:
            h2g.h(r2)     // Catch:{ IOException -> 0x009d }
            goto L_0x00bb
        L_0x009d:
            r2.toString()     // Catch:{ all -> 0x0078 }
            goto L_0x00bb
        L_0x00a1:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x0078 }
            java.lang.String r8 = "Unreachable code"
            r7.<init>(r8)     // Catch:{ all -> 0x0078 }
            throw r7     // Catch:{ all -> 0x0078 }
        L_0x00a9:
            boolean r8 = r2.exists()     // Catch:{ all -> 0x0078 }
            if (r8 == 0) goto L_0x00b7
            java.util.ArrayList r8 = ng5.L(r2)     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00b9
        L_0x00b4:
            r2.toString()     // Catch:{ all -> 0x0078 }
        L_0x00b7:
            hw4 r8 = hw4.a     // Catch:{ all -> 0x0078 }
        L_0x00b9:
            r7.d = r8     // Catch:{ all -> 0x0078 }
        L_0x00bb:
            monitor-exit(r0)
            return
        L_0x00bd:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9e.a(int):void");
    }
}
