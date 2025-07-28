package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobCancellationException;

/* renamed from: a5b  reason: default package */
public final class a5b extends d0 implements d5b, i02 {
    public final i02 a;

    public a5b(hu3 hu3, us0 us0) {
        super(hu3, true, true);
        this.a = us0;
    }

    public final vvc b() {
        return this.a.b();
    }

    public final void cancel(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(cancellationExceptionMessage(), (Throwable) null, this);
            }
            cancelInternal(cancellationException);
        }
    }

    public final void cancelInternal(Throwable th) {
        CancellationException cancellationException$default = i47.toCancellationException$default(this, th, (String) null, 1, (Object) null);
        this.a.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    public final Object f() {
        return this.a.f();
    }

    public final Object h(Continuation continuation) {
        return this.a.h(continuation);
    }

    public final boolean i(Throwable th) {
        return this.a.i(th);
    }

    public final os0 iterator() {
        return this.a.iterator();
    }

    public final void k(ty0 ty0) {
        this.a.k(ty0);
    }

    public final Object n(Object obj) {
        return this.a.n(obj);
    }

    public final Object o(Object obj, Continuation continuation) {
        return this.a.o(obj, continuation);
    }

    public final void onCancelled(Throwable th, boolean z) {
        if (!this.a.i(th) && !z) {
            gwf.x(getContext(), th);
        }
    }

    public final void onCompleted(Object obj) {
        jue jue = (jue) obj;
        this.a.i((Throwable) null);
    }

    public final boolean p() {
        return this.a.p();
    }

    public final /* synthetic */ void cancel() {
        cancelInternal(new JobCancellationException(cancellationExceptionMessage(), (Throwable) null, this));
    }

    public final /* synthetic */ boolean cancel(Throwable th) {
        cancelInternal(new JobCancellationException(cancellationExceptionMessage(), (Throwable) null, this));
        return true;
    }
}
