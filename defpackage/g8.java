package defpackage;

import android.content.Intent;

/* renamed from: g8  reason: default package */
public final class g8 {
    public final int a;
    public final int b;
    public final Intent c;

    public g8(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.g8) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.g8
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            g8 r5 = (defpackage.g8) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            android.content.Intent r4 = r4.c
            android.content.Intent r5 = r5.c
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d = c3d.d(this.b, Integer.hashCode(this.a) * 31, 31);
        Intent intent = this.c;
        return d + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "ActivityResult(requestCode=" + this.a + ", resultCode=" + this.b + ", data=" + this.c + ")";
    }
}
