package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: c42  reason: default package */
public final class c42 extends er3 {
    public int X;
    public final /* synthetic */ d42 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c42(d42 d42, Continuation continuation) {
        super(continuation);
        this.Y = d42;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
