package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: sk9  reason: default package */
public final class sk9 extends e0 implements g37 {
    public static final sk9 a = new e0(xhd.c);

    public final vw2 attachChild(yw2 yw2) {
        return zk9.a;
    }

    public final void cancel(CancellationException cancellationException) {
    }

    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    public final dyc getChildren() {
        return pw4.a;
    }

    public final aj4 invokeOnCompletion(u16 u16) {
        return zk9.a;
    }

    public final boolean isActive() {
        return true;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isCompleted() {
        return false;
    }

    public final Object join(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    public final aj4 invokeOnCompletion(boolean z, boolean z2, u16 u16) {
        return zk9.a;
    }
}
