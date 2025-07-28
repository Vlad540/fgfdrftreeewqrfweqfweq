package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vg1  reason: default package */
public final class vg1 extends er3 {
    public int X;
    public final /* synthetic */ tv Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vg1(tv tvVar, Continuation continuation) {
        super(continuation);
        this.Y = tvVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
