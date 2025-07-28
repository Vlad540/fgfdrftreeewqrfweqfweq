package defpackage;

import java.util.concurrent.Future;

/* renamed from: ov1  reason: default package */
public final class ov1 implements pv1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ov1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void b(Throwable th) {
        switch (this.a) {
            case 0:
                if (th != null) {
                    ((Future) this.b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((u16) this.b).invoke(th);
                return;
            default:
                ((aj4) this.b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) this.b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((u16) this.b).getClass().getSimpleName() + '@' + a24.F(this) + ']';
            default:
                return "DisposeOnCancel[" + ((aj4) this.b) + ']';
        }
    }
}
