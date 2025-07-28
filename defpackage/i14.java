package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i14  reason: default package */
public final class i14 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ m14 Y;
    public int Z;
    public m14 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i14(m14 m14, Continuation continuation) {
        super(continuation);
        this.Y = m14;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return m14.a(this.Y, (d14) null, this);
    }
}
