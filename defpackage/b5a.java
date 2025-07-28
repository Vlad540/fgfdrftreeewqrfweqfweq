package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: b5a  reason: default package */
public final class b5a extends er3 {
    public int X;
    public final /* synthetic */ ve7 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b5a(ve7 ve7, Continuation continuation) {
        super(continuation);
        this.Y = ve7;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
