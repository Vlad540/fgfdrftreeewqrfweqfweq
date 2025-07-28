package defpackage;

import java.util.Collections;

/* renamed from: xm8  reason: default package */
public class xm8 implements rg6 {
    public static final /* synthetic */ int x0 = 0;
    public final o1b X;
    public final ir8 Y;
    public final os8 Z;
    public final vo8 a;
    public final tf3 b;
    public final sq8 c;
    public final xm8 o;
    public final ho2 w0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public xm8(vo8 vo8, tf3 tf3, sq8 sq8, xm8 xm8, o1b o1b, ir8 ir8, os8 os8, ho2 ho2) {
        this(vo8, tf3, sq8, xm8, o1b, ir8, os8, ho2, 0);
        Collections.emptySet();
    }

    public final xm8 a() {
        sq8 sq8 = this.c;
        if (sq8 == null || sq8.a != 2) {
            return null;
        }
        return sq8.c;
    }

    public final CharSequence b(i22 i22) {
        o1b o1b = this.X;
        o1b.f = i22;
        w6a w6a = o1b.a;
        o1b.i(i22, w6a.f(), w6a.e());
        o1b.g(i22);
        return o1b.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r1 != ((defpackage.j2b) ((defpackage.g2b) r0.a.get())).a.s()) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String c(defpackage.i22 r6) {
        /*
            r5 = this;
            os8 r0 = r5.Z
            r0.getClass()
            boolean r1 = r6.G()
            vo8 r2 = r5.a
            if (r1 == 0) goto L_0x0013
            int r1 = r2.Z0
            r3 = 4
            if (r1 != r3) goto L_0x0013
            goto L_0x003a
        L_0x0013:
            boolean r1 = r6.N()
            if (r1 == 0) goto L_0x003f
            long r1 = r2.Y
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x003a
            k77[] r3 = defpackage.os8.b
            r4 = 0
            r3 = r3[r4]
            nj4 r0 = r0.a
            java.lang.Object r0 = r0.get()
            g2b r0 = (defpackage.g2b) r0
            j2b r0 = (defpackage.j2b) r0
            i03 r0 = r0.a
            long r3 = r0.s()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x003f
        L_0x003a:
            java.lang.String r5 = r6.p()
            goto L_0x0047
        L_0x003f:
            tf3 r5 = r5.b
            java.lang.String r5 = r5.d()
            if (r5 == 0) goto L_0x0048
        L_0x0047:
            return r5
        L_0x0048:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Required value was null."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm8.c(i22):java.lang.String");
    }

    public final boolean d() {
        return !this.b.Y;
    }

    public final long getId() {
        return this.a.b;
    }

    public final long k() {
        vo8 vo8 = this.a;
        nd4 nd4 = vo8.X0;
        return nd4 != null ? nd4.a : vo8.o;
    }

    public final String toString() {
        return "Message{data=" + this.a + '}';
    }

    public xm8(vo8 vo8, tf3 tf3, sq8 sq8, xm8 xm8, o1b o1b, ir8 ir8, os8 os8, ho2 ho2, int i) {
        this.a = vo8;
        this.b = tf3;
        this.c = sq8;
        this.o = xm8;
        this.X = o1b;
        this.Y = ir8;
        this.Z = os8;
        this.w0 = ho2;
    }
}
