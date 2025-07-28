package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: sd6  reason: default package */
public final class sd6 extends zr7 implements hd4 {
    public final Handler a;
    public final String b;
    public final boolean c;
    public final sd6 o;

    public sd6(Handler handler, String str, boolean z) {
        sd6 sd6;
        this.a = handler;
        this.b = str;
        this.c = z;
        if (z) {
            sd6 = this;
        } else {
            sd6 = new sd6(handler, str, true);
        }
        this.o = sd6;
    }

    public final void d(hu3 hu3, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        g37 g37 = (g37) hu3.get(xhd.c);
        if (g37 != null) {
            g37.cancel(cancellationException);
        }
        oi4.c.dispatch(hu3, runnable);
    }

    public final Object delay(long j, Continuation continuation) {
        return iu7.q(this, j, continuation);
    }

    public final void dispatch(hu3 hu3, Runnable runnable) {
        if (!this.a.post(runnable)) {
            d(hu3, runnable);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sd6) {
            sd6 sd6 = (sd6) obj;
            return sd6.a == this.a && sd6.c == this.c;
        }
    }

    public final zr7 getImmediate() {
        return this.o;
    }

    public final int hashCode() {
        return (this.c ? 1231 : 1237) ^ System.identityHashCode(this.a);
    }

    public final aj4 invokeOnTimeout(long j, Runnable runnable, hu3 hu3) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.a.postDelayed(runnable, j)) {
            return new rd6(this, runnable);
        }
        d(hu3, runnable);
        return zk9.a;
    }

    public final boolean isDispatchNeeded(hu3 hu3) {
        return !this.c || !hhd.f(Looper.myLooper(), this.a.getLooper());
    }

    public final void scheduleResumeAfterDelay(long j, yv1 yv1) {
        q36 q36 = new q36((Object) yv1, 6, (Object) this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.a.postDelayed(q36, j)) {
            yv1.d(new ka(this, 16, q36));
        } else {
            d(yv1.getContext(), q36);
        }
    }

    public final String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        String str = this.b;
        if (str == null) {
            str = this.a.toString();
        }
        return this.c ? hr1.g(str, ".immediate") : str;
    }

    public sd6(Handler handler) {
        this(handler, (String) null, false);
    }
}
