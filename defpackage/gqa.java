package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: gqa  reason: default package */
public final class gqa implements mua {
    public static final /* synthetic */ k77[] l;
    public final long a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final hcd g;
    public final s0c h;
    public final AtomicLong i = new AtomicLong();
    public final e3 j = hwf.t();
    public ou3 k;

    static {
        k77 hc9 = new hc9(gqa.class, "addSubscribersJob", "getAddSubscribersJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        l = new k77[]{hc9};
    }

    public gqa(long j2, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975) {
        this.a = j2;
        this.b = t97;
        this.c = t972;
        this.d = t973;
        this.e = t974;
        this.f = t975;
        hcd b2 = icd.b(0, Integer.MAX_VALUE, 0, 5);
        this.g = b2;
        this.h = new s0c(b2);
    }

    public final void a() {
        this.k = null;
    }

    public final void b(zta zta) {
    }

    public final void c(ou3 ou3) {
        this.k = ou3;
        ez3.N(new ck5(new s0c(((mqa) this.e.getValue()).a), new eqa(this, (Continuation) null), 5), ou3);
    }

    public final void e(long j2) {
    }
}
