package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.util.regex.Pattern;

/* renamed from: f1c  reason: default package */
public final class f1c implements Closeable {
    public final /* synthetic */ int a = 0;
    public final at0 b;
    public final long c;
    public final Object o;

    public f1c(wr0 wr0, lg8 lg8, long j) {
        this.b = wr0;
        this.o = lg8;
        this.c = j;
    }

    public final at0 S() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r2 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        defpackage.urd.l(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r4 >= r6) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String U() {
        /*
            r9 = this;
            at0 r0 = r9.S()
            lg8 r9 = r9.o()     // Catch:{ all -> 0x0054 }
            r1 = 0
            if (r9 == 0) goto L_0x0046
            java.nio.charset.Charset r2 = defpackage.e22.a     // Catch:{ all -> 0x0054 }
            java.lang.String[] r9 = r9.c     // Catch:{ all -> 0x0054 }
            fz6 r3 = new fz6     // Catch:{ all -> 0x0054 }
            int r4 = r9.length     // Catch:{ all -> 0x0054 }
            r5 = 1
            int r4 = r4 - r5
            r6 = 0
            r3.<init>(r6, r4, r5)     // Catch:{ all -> 0x0054 }
            r4 = 2
            dz6 r3 = defpackage.gwf.Q(r3, r4)     // Catch:{ all -> 0x0054 }
            int r4 = r3.a     // Catch:{ all -> 0x0054 }
            int r6 = r3.b     // Catch:{ all -> 0x0054 }
            int r3 = r3.c     // Catch:{ all -> 0x0054 }
            if (r3 < 0) goto L_0x0028
            if (r4 > r6) goto L_0x003c
            goto L_0x002a
        L_0x0028:
            if (r4 < r6) goto L_0x003c
        L_0x002a:
            r7 = r9[r4]     // Catch:{ all -> 0x0054 }
            java.lang.String r8 = "charset"
            boolean r7 = defpackage.p0e.M(r7, r8, r5)     // Catch:{ all -> 0x0054 }
            if (r7 == 0) goto L_0x0038
            int r4 = r4 + r5
            r9 = r9[r4]     // Catch:{ all -> 0x0054 }
            goto L_0x003d
        L_0x0038:
            if (r4 == r6) goto L_0x003c
            int r4 = r4 + r3
            goto L_0x002a
        L_0x003c:
            r9 = r1
        L_0x003d:
            if (r9 == 0) goto L_0x0043
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r9)     // Catch:{ IllegalArgumentException -> 0x0043 }
        L_0x0043:
            if (r2 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            java.nio.charset.Charset r2 = defpackage.e22.a     // Catch:{ all -> 0x0054 }
        L_0x0048:
            java.nio.charset.Charset r9 = defpackage.nze.r(r0, r2)     // Catch:{ all -> 0x0054 }
            java.lang.String r9 = r0.O(r9)     // Catch:{ all -> 0x0054 }
            defpackage.urd.l(r0, r1)
            return r9
        L_0x0054:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r1 = move-exception
            defpackage.urd.l(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1c.U():java.lang.String");
    }

    public final void close() {
        nze.c(S());
    }

    public final InputStream m() {
        return S().l0();
    }

    public final long n() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public final lg8 o() {
        Object obj = this.o;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = lg8.d;
                try {
                    return oyb.A(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                return (lg8) obj;
        }
    }

    public f1c(String str, long j, v0c v0c) {
        this.o = str;
        this.c = j;
        this.b = v0c;
    }
}
