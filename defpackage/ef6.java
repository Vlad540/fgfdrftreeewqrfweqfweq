package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ef6  reason: default package */
public final class ef6 implements pf4 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final ContextScope e;
    public qod f;
    public final t0c g;

    public ef6(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t97;
        this.b = t973;
        this.c = t972;
        this.d = t974;
        long nanoTime = System.nanoTime();
        this.e = n1g.a(((pae) t973.getValue()).a());
        this.g = new t0c(hrd.a(Collections.singletonList(new z14(nanoTime, new hge(mtb.oneme_settings_dump_heap), phc.c, (mge) null, (n06) null, 24))));
    }

    public final zqd c() {
        return this.g;
    }

    public final void d(z14 z14) {
        qod qod = this.f;
        if (qod == null || !qod.isActive()) {
            this.f = xs7.E(this.e, ((pae) this.b.getValue()).b(), (ru3) null, new df6(this, (Continuation) null), 2);
            return;
        }
        hba hba = (hba) this.d.getValue();
        hba.i("Дамп памяти уже происходит, нужно немного подождать");
        hba.j();
    }
}
