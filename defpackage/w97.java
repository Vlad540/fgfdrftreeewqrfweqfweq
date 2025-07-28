package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* renamed from: w97  reason: default package */
public final class w97 extends zc4 {
    public final Continuation a;

    public w97(hu3 hu3, i26 i26) {
        super(hu3, true, false);
        this.a = urd.p(i26, this, this);
    }

    public final void onStart() {
        try {
            DispatchedContinuationKt.resumeCancellableWith$default(urd.y(this.a), jue.a, (u16) null, 2, (Object) null);
        } catch (Throwable th) {
            resumeWith(new kcc(th));
            throw th;
        }
    }
}
