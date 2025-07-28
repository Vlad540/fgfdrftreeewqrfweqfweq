package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sk3  reason: default package */
public final class sk3 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wk3 Y;
    public int Z;
    public wk3 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sk3(wk3 wk3, Continuation continuation) {
        super(continuation);
        this.Y = wk3;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return wk3.c(this.Y, this);
    }
}
