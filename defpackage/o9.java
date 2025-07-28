package defpackage;

/* renamed from: o9  reason: default package */
public final class o9 implements mua {
    public static final /* synthetic */ k77[] i;
    public final long a;
    public final t97 b;
    public final t97 c;
    public ou3 d;
    public final hcd e;
    public final s0c f;
    public final e3 g = hwf.t();
    public final boolean h;

    static {
        k77 hc9 = new hc9(o9.class, "processActionJob", "getProcessActionJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        i = new k77[]{hc9};
    }

    public o9(long j, t97 t97, t97 t972) {
        this.a = j;
        this.b = t97;
        this.c = t972;
        boolean z = false;
        hcd b2 = icd.b(0, Integer.MAX_VALUE, 0, 5);
        this.e = b2;
        this.f = new s0c(b2);
        i22 i22 = (i22) ((aw2) ((bv2) t97.getValue())).m(j).a.getValue();
        if (i22 != null && i22.G()) {
            z = true;
        }
        this.h = z;
    }

    public final void a() {
        this.d = null;
    }

    public final void b(zta zta) {
    }

    public final void c(ou3 ou3) {
        this.d = ou3;
    }

    public final void e(long j) {
    }
}
