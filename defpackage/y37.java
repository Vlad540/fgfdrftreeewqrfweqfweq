package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: y37  reason: default package */
public final class y37 extends er3 {
    public Iterator X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ s30 Z;
    public ConcurrentHashMap o;
    public int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y37(s30 s30, Continuation continuation) {
        super(continuation);
        this.Z = s30;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.Z.h(this);
    }
}
