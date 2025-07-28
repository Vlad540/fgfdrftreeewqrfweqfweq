package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: pp6  reason: default package */
public final class pp6 extends qw5 {
    public final Object X;
    public final /* synthetic */ int o = 1;

    public pp6(lr6 lr6) {
        super(lr6);
        this.X = new AtomicBoolean(false);
    }

    public void close() {
        switch (this.o) {
            case 1:
                if (!((AtomicBoolean) this.X).getAndSet(true)) {
                    super.close();
                    return;
                }
                return;
            default:
                super.close();
                return;
        }
    }

    public pp6(lr6 lr6, qp6 qp6) {
        super(lr6);
        this.X = new WeakReference(qp6);
        a(new op6(0, this));
    }
}
