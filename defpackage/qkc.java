package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: qkc  reason: default package */
public final class qkc implements zqd {
    public final /* synthetic */ zqd a;

    public qkc(bv2 bv2) {
        kv2 kv2 = ((aw2) bv2).b;
        this.a = (zqd) ((ConcurrentHashMap) kv2.Z).computeIfAbsent(0L, new di(4, new l(27, kv2)));
    }

    public final Object c(rj5 rj5, Continuation continuation) {
        return this.a.c(rj5, continuation);
    }

    public final Object getValue() {
        return (i22) this.a.getValue();
    }
}
