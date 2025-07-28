package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lt2  reason: default package */
public final class lt2 extends er3 {
    public int X;
    public final /* synthetic */ mt2 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lt2(mt2 mt2, Continuation continuation) {
        super(continuation);
        this.Y = mt2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
