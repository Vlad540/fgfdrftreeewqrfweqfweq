package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zy0  reason: default package */
public final class zy0 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bz0 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zy0(bz0 bz0, Continuation continuation) {
        super(2, continuation);
        this.Y = bz0;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((zy0) n((kb) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zy0 zy0 = new zy0(this.Y, continuation);
        zy0.X = obj;
        return zy0;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        kb kbVar = (kb) this.X;
        bz0 bz0 = this.Y;
        bz0.getClass();
        uh1 uh1 = null;
        if (kbVar instanceof ya) {
            ya yaVar = (ya) kbVar;
            if (!yaVar.a) {
                uh1 = wh1.w;
            } else if (!yaVar.b) {
                uh1 = wh1.v;
            }
        } else if (kbVar instanceof ab) {
            ab abVar = (ab) kbVar;
            if (!abVar.a) {
                uh1 = wh1.u;
            } else if (!abVar.b) {
                uh1 = wh1.t;
            }
        } else if (kbVar instanceof eb) {
            eb ebVar = (eb) kbVar;
            if (!ebVar.a) {
                uh1 = wh1.s;
            } else if (!ebVar.b) {
                uh1 = wh1.r;
            }
        } else if (kbVar instanceof db) {
            db dbVar = (db) kbVar;
            dbVar.getClass();
            if (!dbVar.a) {
                uh1 = wh1.x;
            }
        } else if (kbVar instanceof ib) {
            ib ibVar = (ib) kbVar;
            ibVar.getClass();
            uh1 = ibVar.a ? wh1.A : wh1.B;
        }
        if (uh1 != null) {
            taf.o(bz0.x0, uh1);
        }
        return jue.a;
    }
}
