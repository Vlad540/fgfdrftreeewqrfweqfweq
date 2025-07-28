package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: km1  reason: default package */
public final class km1 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;

    public km1(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t973;
        this.b = t972;
        this.c = t97;
        this.d = t974;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.jm1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            jm1 r0 = (defpackage.jm1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            jm1 r0 = new jm1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.o
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.wx3.H(r7)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            defpackage.wx3.H(r7)
            t97 r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            ap3 r4 = (ap3) r4
            r0.Y = r3
            java.lang.Comparable r7 = r4.b(r5, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            tf3 r7 = (tf3) r7
            if (r7 == 0) goto L_0x004b
            boolean r3 = r7.w()
        L_0x004b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.km1.a(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(Set set, Continuation continuation) {
        boolean isEmpty = set.isEmpty();
        jue jue = jue.a;
        if (isEmpty) {
            return jue;
        }
        zb9 V = lp.V(set);
        int i = zp4.o;
        Object t = ((r59) this.d.getValue()).t(V, mt0.P(30, eq4.SECONDS), continuation);
        return t == pu3.a ? t : jue;
    }
}
