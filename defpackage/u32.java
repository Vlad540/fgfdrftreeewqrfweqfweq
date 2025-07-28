package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u32  reason: default package */
public final class u32 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ o42 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u32(o42 o42, Continuation continuation) {
        super(2, continuation);
        this.Y = o42;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((sz1) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        u32 u32 = new u32(this.Y, continuation);
        u32.X = obj;
        return u32;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        sz1 sz1 = (sz1) this.X;
        o42 o42 = this.Y;
        sz1 sz12 = (sz1) o42.i.getValue();
        if ((sz12 != null ? sz12.b : null) == rz1.c) {
            o42.i.setValue(sz1);
        }
        k77[] k77Arr = o42.x;
        o42.d(o42.s());
        return jue.a;
    }
}
