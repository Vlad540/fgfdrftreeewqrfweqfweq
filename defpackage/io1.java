package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: io1  reason: default package */
public final class io1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ po1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public io1(po1 po1, Continuation continuation) {
        super(2, continuation);
        this.Y = po1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((io1) n((le1) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        io1 io1 = new io1(this.Y, continuation);
        io1.X = obj;
        return io1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        le1 le1 = (le1) this.X;
        po1 po1 = this.Y;
        if (po1.c().h) {
            po1.h(le1, true);
        } else {
            po1.i(po1.d().a.getId());
        }
        return jue.a;
    }
}
