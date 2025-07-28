package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: g07  reason: default package */
public final class g07 extends er3 {
    public final /* synthetic */ i26 X;
    public final /* synthetic */ Object Y;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g07(Continuation continuation, hu3 hu3, i26 i26, Object obj) {
        super(hu3, continuation);
        this.X = i26;
        this.Y = obj;
    }

    public final Object o(Object obj) {
        int i = this.o;
        if (i == 0) {
            this.o = 1;
            wx3.H(obj);
            i26 i26 = this.X;
            ete.g(2, i26);
            return i26.invoke(this.Y, this);
        } else if (i == 1) {
            this.o = 2;
            wx3.H(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
