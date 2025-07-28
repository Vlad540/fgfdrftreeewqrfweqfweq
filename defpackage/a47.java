package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a47  reason: default package */
public final class a47 extends zv1 {
    public final i47 Y;

    public a47(i47 i47, Continuation continuation) {
        super(1, continuation);
        this.Y = i47;
    }

    public final Throwable k(i47 i47) {
        Throwable c;
        Object state$kotlinx_coroutines_core = this.Y.getState$kotlinx_coroutines_core();
        return (!(state$kotlinx_coroutines_core instanceof c47) || (c = ((c47) state$kotlinx_coroutines_core).c()) == null) ? state$kotlinx_coroutines_core instanceof r73 ? ((r73) state$kotlinx_coroutines_core).a : i47.getCancellationException() : c;
    }

    public final String t() {
        return "AwaitContinuation";
    }
}
