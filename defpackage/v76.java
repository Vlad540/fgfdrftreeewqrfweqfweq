package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: v76  reason: default package */
public final class v76 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ w76 Y;
    public int Z;
    public w76 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v76(w76 w76, Continuation continuation) {
        super(continuation);
        this.Y = w76;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(this);
    }
}
