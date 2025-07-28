package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ekc  reason: default package */
public final class ekc extends er3 {
    public final /* synthetic */ ikc X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ekc(ikc ikc, Continuation continuation) {
        super(continuation);
        this.X = ikc;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.b((String) null, false, this);
    }
}
