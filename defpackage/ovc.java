package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ovc  reason: default package */
public final class ovc extends er3 {
    public int X;
    public final /* synthetic */ h42 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ovc(h42 h42, Continuation continuation) {
        super(continuation);
        this.Y = h42;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
