package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cn2  reason: default package */
public final class cn2 extends er3 {
    public int X;
    public rj5 Y;
    public final /* synthetic */ a40 Z;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cn2(a40 a40, Continuation continuation) {
        super(continuation);
        this.Z = a40;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Z.a((Object) null, this);
    }
}
