package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: sya  reason: default package */
public final class sya {
    public static final /* synthetic */ k77[] i;
    public final va9 a;
    public final v40 b;
    public final ContextScope c;
    public final e3 d = hwf.t();
    public final grd e = hrd.a((Object) null);
    public final t0c f;
    public final u5g g;
    public final AtomicReference h;

    static {
        k77 hc9 = new hc9(sya.class, "updatePlayerJob", "getUpdatePlayerJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        i = new k77[]{hc9};
    }

    public sya(pae pae, va9 va9, v40 v40) {
        this.a = va9;
        this.b = v40;
        this.c = n1g.a(((n3a) pae).a());
        this.f = ((nb9) va9).H;
        this.g = new u5g(22, this);
        this.h = new AtomicReference((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r1 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r15, long r17, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            r14 = this;
            r0 = r14
            v40 r0 = r0.b
            va9 r0 = r0.a
            nb9 r0 = (defpackage.nb9) r0
            ua9 r1 = r0.n()
            r2 = 0
            if (r1 == 0) goto L_0x0019
            java.util.Map r1 = r1.c
            if (r1 == 0) goto L_0x0019
            java.lang.String r3 = "MediaMetadata.Extra.MESSAGE_ID"
            java.lang.Object r1 = r1.get(r3)
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            boolean r3 = r1 instanceof java.lang.Long
            if (r3 == 0) goto L_0x0021
            java.lang.Long r1 = (java.lang.Long) r1
            goto L_0x0022
        L_0x0021:
            r1 = r2
        L_0x0022:
            if (r1 == 0) goto L_0x0029
            long r3 = r1.longValue()
            goto L_0x002b
        L_0x0029:
            r3 = 0
        L_0x002b:
            int r1 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x0037
            boolean r3 = r0.y
            if (r3 == 0) goto L_0x0037
            r0.t()
            goto L_0x006f
        L_0x0037:
            if (r1 != 0) goto L_0x0041
            boolean r3 = r0.x
            if (r3 == 0) goto L_0x0041
            r0.q()
            goto L_0x006f
        L_0x0041:
            if (r1 != 0) goto L_0x004b
            boolean r1 = r0.w
            if (r1 == 0) goto L_0x004b
            r0.r()
            goto L_0x006f
        L_0x004b:
            ra9 r1 = new ra9
            r5 = r1
            r6 = r15
            r8 = r17
            r10 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r5.<init>(r6, r8, r10, r11, r12, r13)
            pae r3 = r0.b
            n3a r3 = (n3a) r3
            ju3 r3 = r3.b()
            hb9 r4 = new hb9
            r4.<init>(r1, r0, r2)
            r1 = 2
            kotlinx.coroutines.internal.ContextScope r0 = r0.h
            xs7.E(r0, r3, r2, r4, r1)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sya.a(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void b() {
        qod E = xs7.E(this.c, (hu3) null, (ru3) null, new qya(this, (Continuation) null), 3);
        this.d.o1(this, i[0], E);
    }
}
