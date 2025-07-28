package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: f07  reason: default package */
public final class f07 extends hcc {
    public int b;
    public final /* synthetic */ i26 c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f07(i26 i26, Object obj, Continuation continuation) {
        super(continuation);
        this.c = i26;
        this.o = obj;
    }

    public final Object o(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.b = 1;
            wx3.H(obj);
            i26 i26 = this.c;
            ete.g(2, i26);
            return i26.invoke(this.o, this);
        } else if (i == 1) {
            this.b = 2;
            wx3.H(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
