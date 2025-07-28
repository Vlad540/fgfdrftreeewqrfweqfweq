package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jsa  reason: default package */
public final class jsa extends er3 {
    public int X;
    public final /* synthetic */ t02 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jsa(t02 t02, Continuation continuation) {
        super(continuation);
        this.Y = t02;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
