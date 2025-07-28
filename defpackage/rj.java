package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: rj  reason: default package */
public final class rj {
    public static final /* synthetic */ k77[] k;
    public final String a = rj.class.getName();
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final ContextScope h;
    public final e3 i;
    public final boolean j;

    static {
        k77 hc9 = new hc9(rj.class, "invalidateCacheJob", "getInvalidateCacheJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        k = new k77[]{hc9};
    }

    public rj(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, rf4 rf4, pae pae) {
        this.b = t97;
        this.c = t972;
        this.d = t973;
        this.e = t974;
        this.f = t975;
        this.g = t976;
        this.h = n1g.a(((n3a) pae).a().plus(new qj(this)));
        this.i = hwf.t();
        this.j = rf4.b().compareTo(vf4.o) >= 0;
    }

    public final boolean a() {
        if (!((kp) ((ip) this.c.getValue())).g.getBoolean("app.media.animoji.enabled", this.j)) {
            return false;
        }
        vqc vqc = (vqc) ((xzc) this.b.getValue());
        vqc.getClass();
        return vqc.m(PmsKey.f17chatanimojienabled, false);
    }
}
