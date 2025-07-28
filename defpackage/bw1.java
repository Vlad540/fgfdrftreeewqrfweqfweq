package defpackage;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bw1  reason: default package */
public final class bw1 extends AtomicReference implements xi4, g73 {
    public final /* synthetic */ int a;

    public /* synthetic */ bw1(int i) {
        this.a = i;
    }

    public void b() {
        lazySet(bj4.a);
    }

    public void d(xi4 xi4) {
        bj4.e(this, xi4);
    }

    public final void f() {
        lic lic;
        switch (this.a) {
            case 0:
                if (get() != null && (lic = (lic) getAndSet((Object) null)) != null) {
                    try {
                        lic.a.cancel((CancellationException) null);
                        return;
                    } catch (Throwable th) {
                        ek8.a0(th);
                        xs7.F(th);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                bj4.a(this);
                return;
            default:
                bj4.a(this);
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return get() == null;
            case 1:
                return get() == bj4.a;
            default:
                return bj4.b((xi4) get());
        }
    }

    public void onError(Throwable th) {
        lazySet(bj4.a);
        xs7.F(new OnErrorNotImplementedException(th));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bw1(Object obj) {
        super(obj);
        this.a = 0;
    }

    public bw1(bw1 bw1) {
        this.a = 2;
        lazySet(bw1);
    }
}
