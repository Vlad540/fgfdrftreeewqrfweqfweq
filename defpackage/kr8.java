package defpackage;

import java.nio.charset.CodingErrorAction;

/* renamed from: kr8  reason: default package */
public final class kr8 implements Cloneable {
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public boolean b;
    public CodingErrorAction c;
    public CodingErrorAction o;

    /* JADX WARNING: type inference failed for: r0v0, types: [kr8, java.lang.Object] */
    public final Object clone() {
        ? obj = new Object();
        obj.a = true;
        obj.b = true;
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        obj.c = codingErrorAction;
        obj.o = codingErrorAction;
        obj.X = Integer.MAX_VALUE;
        obj.Y = 8192;
        obj.Z = 8192;
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.o = this.o;
        obj.X = this.X;
        obj.Y = this.Y;
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (defpackage.kr8) r4;
        r0 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.kr8
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            kr8 r4 = (defpackage.kr8) r4
            boolean r0 = r4.a
            boolean r2 = r3.a
            if (r2 != r0) goto L_0x0033
            boolean r0 = r3.b
            boolean r2 = r4.b
            if (r0 != r2) goto L_0x0033
            java.nio.charset.CodingErrorAction r0 = r3.c
            java.nio.charset.CodingErrorAction r2 = r4.c
            if (r0 != r2) goto L_0x0033
            java.nio.charset.CodingErrorAction r0 = r3.o
            java.nio.charset.CodingErrorAction r2 = r4.o
            if (r0 != r2) goto L_0x0033
            int r0 = r3.X
            int r2 = r4.X
            if (r0 != r2) goto L_0x0033
            int r0 = r3.Z
            int r2 = r4.Z
            if (r0 != r2) goto L_0x0033
            int r3 = r3.Y
            int r4 = r4.Y
            if (r3 != r4) goto L_0x0033
            r1 = 1
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (((this.a ? 1 : 0) * true) + (this.b ? 1 : 0)) * 31;
        int i2 = 0;
        CodingErrorAction codingErrorAction = this.c;
        int hashCode = (i + (codingErrorAction != null ? codingErrorAction.hashCode() : 0)) * 31;
        CodingErrorAction codingErrorAction2 = this.o;
        if (codingErrorAction2 != null) {
            i2 = codingErrorAction2.hashCode();
        }
        return ((((((hashCode + i2) * 31) + this.X) * 31) + this.Y) * 31) + this.Z;
    }
}
