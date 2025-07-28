package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a7  reason: default package */
public final class a7 extends AtomicReference implements xi4 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7(int i, Object obj) {
        super(obj);
        this.a = i;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    ((j6) obj).run();
                    return;
                } catch (Throwable th) {
                    throw i15.f(th);
                }
            default:
                ((Runnable) obj).run();
                return;
        }
    }

    public final void f() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            a(andSet);
        }
    }

    public final boolean h() {
        return get() == null;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "ActionDisposable(disposed=" + h() + ", " + get() + ")";
            default:
                return "RunnableDisposable(disposed=" + h() + ", " + get() + ")";
        }
    }
}
