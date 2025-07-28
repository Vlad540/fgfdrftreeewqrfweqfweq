package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qd1  reason: default package */
public final class qd1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ td1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qd1(td1 td1, Continuation continuation) {
        super(2, continuation);
        this.Y = td1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((qd1) n((kb) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qd1 qd1 = new qd1(this.Y, continuation);
        qd1.X = obj;
        return qd1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        kb kbVar = (kb) this.X;
        boolean z = kbVar instanceof fb;
        td1 td1 = this.Y;
        if (z) {
            taf.o(td1.G0, wh1.j);
        } else if (kbVar instanceof gb) {
            taf.o(td1.G0, wh1.k);
        } else if (kbVar instanceof jb) {
            taf.o(td1.G0, wh1.l);
        } else if (kbVar instanceof cb) {
            taf.o(td1.G0, wh1.m);
        } else if (kbVar instanceof hb) {
            taf.o(td1.G0, wh1.n);
        }
        return jue.a;
    }
}
