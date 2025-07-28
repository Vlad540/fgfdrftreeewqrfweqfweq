package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;

/* renamed from: ub3  reason: default package */
public final class ub3 extends l5e implements i26 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l5e l5e = new l5e(2, continuation);
        l5e.X = obj;
        return l5e;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        jue jue = (jue) this.X;
        c9d.c.P1().b(":settings/privacy", (Bundle) null);
        return jue.a;
    }
}
