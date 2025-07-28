package defpackage;

import java.util.Arrays;

/* renamed from: tie  reason: default package */
public final class tie extends zxb {
    public final boolean b;
    public final boolean c;

    public tie() {
        this.b = false;
        this.c = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (defpackage.tie) r4;
        r0 = r4.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.tie
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            tie r4 = (defpackage.tie) r4
            boolean r0 = r4.c
            boolean r2 = r3.c
            if (r2 != r0) goto L_0x0015
            boolean r3 = r3.b
            boolean r4 = r4.b
            if (r3 != r4) goto L_0x0015
            r1 = 1
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tie.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public tie(boolean z) {
        this.b = true;
        this.c = z;
    }
}
