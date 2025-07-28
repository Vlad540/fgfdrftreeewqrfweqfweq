package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ckf  reason: default package */
public final class ckf {
    public final t97 a;
    public final hcd b = icd.b(0, 0, 0, 7);
    public final ContextScope c;

    public ckf(t97 t97, t97 t972) {
        this.a = t97;
        this.c = n1g.a(((pae) t972.getValue()).a());
        ((tt0) t97.getValue()).d(this);
    }

    public final void a(akf akf) {
        xs7.E(this.c, (hu3) null, (ru3) null, new bkf(this, akf, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(sd5 sd5) {
        throw null;
    }

    @a1e
    public final void onEvent(jh0 jh0) {
        a(new zjf(jh0.a));
    }

    @a1e
    public final void onEvent(qd5 qd5) {
        a(new zjf(qd5.b));
    }

    @a1e
    public final void onEvent(od5 od5) {
        a(new xjf(od5.b));
    }

    @a1e
    public final void onEvent(rd5 rd5) {
        a(new yjf(rd5.a));
    }
}
