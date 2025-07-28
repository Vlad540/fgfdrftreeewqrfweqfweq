package defpackage;

import android.view.MotionEvent;

/* renamed from: ut8  reason: default package */
public final class ut8 {
    public final z2c a;
    public final MotionEvent b;

    public ut8(z2c z2c, MotionEvent motionEvent) {
        this.a = z2c;
        this.b = motionEvent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ut8) r5;
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
            boolean r1 = r5 instanceof defpackage.ut8
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ut8 r5 = (defpackage.ut8) r5
            z2c r1 = r5.a
            z2c r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            android.view.MotionEvent r4 = r4.b
            android.view.MotionEvent r5 = r5.b
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RecordControlMotionEvent(type=" + this.a + ", motionEvent=" + this.b + ")";
    }
}
