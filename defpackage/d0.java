package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ThreadContextKt;

/* renamed from: d0  reason: default package */
public abstract class d0 extends i47 implements Continuation, ou3 {
    private final hu3 context;

    public d0(hu3 hu3, boolean z, boolean z2) {
        super(z2);
        if (z) {
            initParentJob((g37) hu3.get(xhd.c));
        }
        this.context = hu3.plus(this);
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    public String cancellationExceptionMessage() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public final hu3 getContext() {
        return this.context;
    }

    public hu3 getCoroutineContext() {
        return this.context;
    }

    public final void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) {
        gwf.x(this.context, th);
    }

    public boolean isActive() {
        return super.isActive();
    }

    public String nameString$kotlinx_coroutines_core() {
        return super.nameString$kotlinx_coroutines_core();
    }

    public void onCancelled(Throwable th, boolean z) {
    }

    public void onCompleted(Object obj) {
    }

    public final void onCompletionInternal(Object obj) {
        if (obj instanceof r73) {
            r73 r73 = (r73) obj;
            onCancelled(r73.a, r73.b.get(r73) != 0);
            return;
        }
        onCompleted(obj);
    }

    public final void resumeWith(Object obj) {
        Object makeCompletingOnce$kotlinx_coroutines_core = makeCompletingOnce$kotlinx_coroutines_core(ct0.L(obj, (u16) null));
        if (makeCompletingOnce$kotlinx_coroutines_core != j47.b) {
            afterResume(makeCompletingOnce$kotlinx_coroutines_core);
        }
    }

    public final <R> void start(ru3 ru3, R r, i26 i26) {
        hu3 context2;
        Object updateThreadContext;
        Object obj;
        int ordinal = ru3.ordinal();
        if (ordinal == 0) {
            vx3.K(i26, r, this);
        } else if (ordinal == 1) {
        } else {
            if (ordinal == 2) {
                urd.y(urd.p(i26, r, this)).resumeWith(jue.a);
            } else if (ordinal == 3) {
                try {
                    context2 = getContext();
                    updateThreadContext = ThreadContextKt.updateThreadContext(context2, (Object) null);
                    a06.C(this);
                    if (!(i26 instanceof bh0)) {
                        obj = urd.T(i26, r, this);
                    } else {
                        ete.g(2, i26);
                        obj = i26.invoke(r, this);
                    }
                    ThreadContextKt.restoreThreadContext(context2, updateThreadContext);
                    if (obj != pu3.a) {
                        resumeWith(obj);
                    }
                } catch (Throwable th) {
                    resumeWith(new kcc(th));
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
