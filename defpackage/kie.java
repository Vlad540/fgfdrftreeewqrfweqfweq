package defpackage;

import android.os.Bundle;
import java.lang.Thread;
import java.util.EnumMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: kie  reason: default package */
public final class kie implements pf4 {
    public final long a = System.nanoTime();
    public final long b = System.nanoTime();
    public final long c = System.nanoTime();
    public final long d = System.nanoTime();
    public final EnumMap e = new EnumMap(Thread.State.class);
    public final ContextScope f;
    public i47 g;
    public final iie h;

    public kie(t97 t97) {
        this.f = n1g.a(((pae) t97.getValue()).a());
        jue jue = jue.a;
        a73 a73 = new a73((g37) null);
        a73.makeCompleting$kotlinx_coroutines_core(jue);
        this.g = a73;
        this.h = new iie(this);
    }

    public final zqd c() {
        return this.h;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [i26, l5e] */
    public final void d(z14 z14) {
        long j = z14.a;
        if (j == this.a && !this.g.isActive()) {
            this.g = xs7.E(this.f, (hu3) null, (ru3) null, new l5e(2, (Continuation) null), 3);
        } else if (j == this.d) {
            hf4.c.P1().b(":settings/dev/threadsviewer", (Bundle) null);
        }
    }
}
