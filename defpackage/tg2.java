package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tg2  reason: default package */
public final class tg2 extends er3 {
    public int X;
    public final /* synthetic */ ug2 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tg2(ug2 ug2, Continuation continuation) {
        super(continuation);
        this.Y = ug2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
