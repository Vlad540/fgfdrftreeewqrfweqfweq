package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ig5  reason: default package */
public final class ig5 extends er3 {
    public final /* synthetic */ kg5 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ig5(kg5 kg5, Continuation continuation) {
        super(continuation);
        this.X = kg5;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(this);
    }
}
