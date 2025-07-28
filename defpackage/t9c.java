package defpackage;

import java.io.Serializable;

/* renamed from: t9c  reason: default package */
public final class t9c implements Serializable {
    public final xga X;
    public final int a;
    public final int b;
    public final String c;
    public final fpa o;

    public t9c(int i, int i2, String str, fpa fpa, xga xga) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.o = fpa;
        this.X = xga;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.t9c) r5;
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
            boolean r1 = r5 instanceof defpackage.t9c
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            t9c r5 = (defpackage.t9c) r5
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
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            fpa r1 = r4.o
            fpa r3 = r5.o
            boolean r1 = hhd.f(r1, r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            xga r4 = r4.X
            xga r5 = r5.X
            boolean r4 = hhd.f(r4, r5)
            if (r4 != 0) goto L_0x003b
            return r2
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d = me4.d(us8.h(this.b, hr1.t(this.a) * 31, 31), 31, this.c);
        int i = 0;
        fpa fpa = this.o;
        int hashCode = (d + (fpa == null ? 0 : fpa.hashCode())) * 31;
        xga xga = this.X;
        if (xga != null) {
            i = xga.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyButton(type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNKNOWN" : "LOCATION" : "CONTACT" : "IMAGE" : "MESSAGE");
        sb.append(", intent=");
        int i2 = this.b;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "UNKNOWN" : "NEGATIVE" : "POSITIVE" : "DEFAULT");
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.o);
        sb.append(", outgoingMessage=");
        sb.append(this.X);
        sb.append(")");
        return sb.toString();
    }
}
