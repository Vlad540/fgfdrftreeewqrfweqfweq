package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kq1  reason: default package */
public final class kq1 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mq1 Y;
    public int Z;
    public mq1 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kq1(mq1 mq1, Continuation continuation) {
        super(continuation);
        this.Y = mq1;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(this);
    }
}
