package defpackage;

import android.app.Application;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: qf0  reason: default package */
public final class qf0 {
    public final Application a;
    public final hcd b = icd.b(0, 0, 0, 7);
    public final ContextScope c;
    public final pna d;
    public final pna e;
    public final hf0 f;

    public qf0(Application application, tt0 tt0, pae pae) {
        this.a = application;
        this.c = n1g.a(((n3a) pae).c().getImmediate());
        this.d = new pna(qna.f);
        this.e = new pna(qna.k);
        this.f = new hf0(0, this);
        tt0.d(this);
    }

    @a1e
    public final void onEvent(to7 to7) {
        xs7.E(this.c, (hu3) null, (ru3) null, new if0(this, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(epa epa) {
        xs7.E(this.c, (hu3) null, (ru3) null, new jf0(this, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(lp3 lp3) {
        xs7.E(this.c, (hu3) null, (ru3) null, new kf0(this, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(fve fve) {
        xs7.E(this.c, (hu3) null, (ru3) null, new lf0(this, (Continuation) null), 3);
    }
}
