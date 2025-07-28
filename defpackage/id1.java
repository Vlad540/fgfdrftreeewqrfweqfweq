package defpackage;

import java.util.function.ToLongFunction;

/* renamed from: id1  reason: default package */
public final /* synthetic */ class id1 implements ToLongFunction {
    public final /* synthetic */ u16 a;

    public /* synthetic */ id1(hd1 hd1) {
        this.a = hd1;
    }

    public final long applyAsLong(Object obj) {
        return ((Number) this.a.invoke(obj)).longValue();
    }
}
