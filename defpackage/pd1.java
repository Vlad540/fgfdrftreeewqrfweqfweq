package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: pd1  reason: default package */
public final class pd1 extends l5e implements i26 {
    public final /* synthetic */ td1 X;
    public final /* synthetic */ t97 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pd1(td1 td1, t97 t97, Continuation continuation) {
        super(2, continuation);
        this.X = td1;
        this.Y = t97;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((pd1) n((ea) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pd1(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        be1 be1;
        lg7 r;
        po1 po1;
        List list;
        wx3.H(obj);
        td1 td1 = this.X;
        grd grd = td1.B0;
        do {
            value = grd.getValue();
            be1 = (be1) value;
            r = td1.r();
            po1 = td1.X;
            if (po1.d().a.m()) {
                ea eaVar = (ea) ((py0) ((vx0) td1.w0.getValue())).F0.getValue();
                boolean z = eaVar.b;
                lg7 c = hwf.c();
                if (z) {
                    c.add(new c1a(o1a.b, Integer.valueOf(r1a.a), (Integer) null, Integer.valueOf(n1a.e), (Integer) null, 52));
                }
                if (eaVar.c) {
                    c.add(new c1a(o1a.d, Integer.valueOf(r1a.c), (Integer) null, Integer.valueOf(n1a.h), (Integer) null, 52));
                }
                c.add(new c1a(o1a.c, Integer.valueOf(r1a.b), (Integer) null, Integer.valueOf(n1a.K), (Integer) null, 52));
                list = hwf.a(c);
            } else {
                list = hw4.a;
            }
        } while (!grd.b(value, be1.a(be1, (List) null, r, list, true, (CharSequence) null, ((jb5) this.Y.getValue()).p() ? po1.d().a.m() : false, 17)));
        return jue.a;
    }
}
