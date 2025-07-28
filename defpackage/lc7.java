package defpackage;

import java.util.ArrayList;

/* renamed from: lc7  reason: default package */
public final class lc7 implements dc7 {
    public final /* synthetic */ fm a;
    public final /* synthetic */ mc7 b;
    public final /* synthetic */ pc7 c;

    public lc7(fm fmVar, mc7 mc7, pc7 pc7) {
        this.a = fmVar;
        this.b = mc7;
        this.c = pc7;
    }

    public final void m(nc7 nc7, nb7 nb7) {
        mc7 mc7;
        if (nb7.a().compareTo(ob7.a) <= 0) {
            udd.H("LifecycleOnOffsetChangedListener", "handle ON_DESTROY state", (Throwable) null);
            ArrayList arrayList = this.a.z0;
            if (!(arrayList == null || (mc7 = this.b) == null)) {
                arrayList.remove(mc7);
            }
            this.c.f(this);
        }
    }
}
