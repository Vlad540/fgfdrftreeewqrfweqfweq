package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* renamed from: yje  reason: default package */
public final class yje extends ScopeCoroutine implements Runnable {
    public final long a;

    public yje(long j, Continuation continuation) {
        super(continuation.getContext(), continuation);
        this.a = j;
    }

    public final String nameString$kotlinx_coroutines_core() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.nameString$kotlinx_coroutines_core());
        sb.append("(timeMillis=");
        return m4b.i(sb, this.a, ')');
    }

    public final void run() {
        ek8.z(getContext());
        cancelCoroutine(new TimeoutCancellationException("Timed out waiting for " + this.a + " ms", this));
    }
}
