package defpackage;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: qb  reason: default package */
public final class qb {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final ContextScope f;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final grd h;
    public final grd i;
    public final t0c j;
    public final hcd k;
    public final s0c l;

    public qb(pae pae, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t975;
        this.f = n1g.a(((n3a) pae).b());
        hw4 hw4 = hw4.a;
        this.h = hrd.a(hw4);
        grd a2 = hrd.a(hw4);
        this.i = a2;
        this.j = new t0c(a2);
        hcd b2 = icd.b(0, 0, 0, 7);
        this.k = b2;
        this.l = new s0c(b2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.qb r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.ob
            if (r0 == 0) goto L_0x0016
            r0 = r6
            ob r0 = (defpackage.ob) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x001b
        L_0x0016:
            ob r0 = new ob
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.X
            qb r1 = r0.o
            wx3.H(r6)
            goto L_0x006c
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            qb r5 = r0.o
            wx3.H(r6)
            goto L_0x0057
        L_0x003f:
            wx3.H(r6)
            t97 r6 = r5.a
            java.lang.Object r6 = r6.getValue()
            ap3 r6 = (defpackage.ap3) r6
            r0.o = r5
            r0.w0 = r4
            di3 r6 = r6.a
            java.util.List r6 = r6.k()
            if (r6 != r1) goto L_0x0057
            goto L_0x008f
        L_0x0057:
            r2 = r6
            java.util.List r2 = (java.util.List) r2
            grd r4 = r5.h
            r0.o = r5
            r0.X = r6
            r0.w0 = r3
            r4.setValue(r2)
            jue r2 = jue.a
            if (r2 != r1) goto L_0x006a
            goto L_0x008f
        L_0x006a:
            r1 = r5
            r5 = r6
        L_0x006c:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            es r6 = new es
            r2 = 2
            r6.<init>(r2, r5)
            o8 r5 = new o8
            r2 = 7
            r5.<init>(r2)
            sg5 r5 = myc.M(r6, r5)
            hu3 r6 = r0.b
            kotlinx.coroutines.internal.ContextScope r0 = n1g.a(r6)
            nb r2 = new nb
            r3 = 0
            r2.<init>(r0, r6, r1, r3)
            vqe r1 = new vqe
            r1.<init>(r5, r2)
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.a(qb, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final fa b(tf3 tf3) {
        String uri;
        Uri parse;
        String q = tf3.q(((lqc) ((f03) this.c.getValue())).p(), fj0.c);
        mge hge = tf3.t() ? new hge(cic.p) : new lge(((q2b) this.d.getValue()).b(tf3));
        long n = tf3.n();
        String d2 = tf3.d();
        if (d2 != null) {
            if (q == null || (parse = Uri.parse(q)) == null || (uri = parse.toString()) == null) {
                uri = Uri.EMPTY.toString();
            }
            return new fa(n, d2, hge, uri, tf3.m(), tf3.u());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
