package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m63  reason: default package */
public final class m63 extends er3 {
    public int X;
    public final /* synthetic */ a40 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m63(a40 a40, Continuation continuation) {
        super(continuation);
        this.Y = a40;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
