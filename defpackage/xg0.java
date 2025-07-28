package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import org.apache.http.HttpStatus;

/* renamed from: xg0  reason: default package */
public abstract class xg0 {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public xg0(pae pae) {
        this.b = n1g.a(((n3a) pae).a());
    }

    public final void a(dq2 dq2) {
        xs7.E(this.b, (hu3) null, (ru3) null, new wg0(this, dq2, (Continuation) null), 3);
    }

    public final ck5 b() {
        hcd hcd = this.a;
        int i = zp4.o;
        return vx3.h(hcd, mt0.P(HttpStatus.SC_MULTIPLE_CHOICES, eq4.c), new vg0(0));
    }
}
