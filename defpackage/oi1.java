package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: oi1  reason: default package */
public final class oi1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ aj1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oi1(aj1 aj1, Continuation continuation) {
        super(2, continuation);
        this.Y = aj1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((oi1) n((kb) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        oi1 oi1 = new oi1(this.Y, continuation);
        oi1.X = obj;
        return oi1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        kb kbVar = (kb) this.X;
        boolean z = kbVar instanceof ab;
        aj1 aj1 = this.Y;
        if (z) {
            taf.o(aj1.Q0, wh1.b);
        } else if (kbVar instanceof ya) {
            taf.o(aj1.Q0, wh1.c);
        } else if (kbVar instanceof eb) {
            taf.o(aj1.Q0, wh1.d);
        } else if (kbVar instanceof xa) {
            taf.o(aj1.Q0, wh1.e);
        } else if (kbVar instanceof ua) {
            taf.o(aj1.Q0, wh1.f);
        } else if (kbVar instanceof ta) {
            taf.o(aj1.Q0, wh1.g);
        } else if (kbVar instanceof bb) {
            taf.o(aj1.Q0, wh1.h);
        } else if (kbVar instanceof za) {
            taf.o(aj1.Q0, wh1.i);
        } else if (kbVar instanceof fb) {
            taf.o(aj1.Q0, wh1.j);
        } else if (kbVar instanceof gb) {
            taf.o(aj1.Q0, wh1.k);
        } else if (kbVar instanceof jb) {
            taf.o(aj1.Q0, wh1.l);
        } else if (kbVar instanceof cb) {
            taf.o(aj1.Q0, wh1.m);
        } else if (kbVar instanceof hb) {
            taf.o(aj1.Q0, wh1.n);
        } else if (kbVar instanceof va) {
            taf.o(aj1.Q0, wh1.o);
        } else if (kbVar instanceof wa) {
            taf.o(aj1.Q0, wh1.z);
        } else if (kbVar instanceof ib) {
            taf.o(aj1.Q0, ((ib) kbVar).a ? wh1.A : wh1.B);
        }
        return jue.a;
    }
}
