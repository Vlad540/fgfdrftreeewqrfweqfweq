package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: uee  reason: default package */
public final class uee {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicReferenceFieldUpdater f;
    private volatile /* synthetic */ Object _value$volatile;
    public final String a = "Dispatchers.Main";
    private volatile /* synthetic */ Object exceptionWhenReading$volatile;
    private volatile /* synthetic */ Object reader$volatile;
    private volatile /* synthetic */ int readers$volatile;
    private volatile /* synthetic */ Object writer$volatile;

    static {
        Class<uee> cls = uee.class;
        Class<Object> cls2 = Object.class;
        b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "reader$volatile");
        c = AtomicIntegerFieldUpdater.newUpdater(cls, "readers$volatile");
        d = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "writer$volatile");
        e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "exceptionWhenReading$volatile");
        f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_value$volatile");
    }

    public uee(zr7 zr7) {
        this._value$volatile = zr7;
    }

    public final Object a() {
        b.set(this, new Throwable("reader location"));
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        atomicIntegerFieldUpdater.incrementAndGet(this);
        Throwable th = (Throwable) d.get(this);
        if (th != null) {
            e.set(this, new IllegalStateException(wn6.l(new StringBuilder(), this.a, " is used concurrently with setting it"), th));
        }
        Object obj = f.get(this);
        atomicIntegerFieldUpdater.decrementAndGet(this);
        return obj;
    }
}
