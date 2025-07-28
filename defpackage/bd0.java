package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: bd0  reason: default package */
public final class bd0 extends t37 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(bd0.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final yv1 b;
    public aj4 c;
    public final /* synthetic */ dd0 o;

    public bd0(dd0 dd0, zv1 zv1) {
        this.o = dd0;
        this.b = zv1;
    }

    public final boolean c() {
        return false;
    }

    public final void d(Throwable th) {
        yv1 yv1 = this.b;
        if (th != null) {
            Symbol j = yv1.j(th);
            if (j != null) {
                yv1.q(j);
                cd0 cd0 = (cd0) X.get(this);
                if (cd0 != null) {
                    cd0.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = dd0.b;
        dd0 dd0 = this.o;
        if (atomicIntegerFieldUpdater.decrementAndGet(dd0) == 0) {
            yc4[] yc4Arr = dd0.a;
            ArrayList arrayList = new ArrayList(yc4Arr.length);
            for (yc4 m : yc4Arr) {
                arrayList.add(m.m());
            }
            yv1.resumeWith(arrayList);
        }
    }
}
