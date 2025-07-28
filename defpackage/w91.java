package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: w91  reason: default package */
public final class w91 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ga1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w91(ga1 ga1, Continuation continuation) {
        super(2, continuation);
        this.Y = ga1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w91) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new w91(this.Y, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        y91 y91;
        mc0 mc0;
        fna fna;
        boolean b;
        hy7 hy7;
        hy7 hy72;
        pu3 pu3 = pu3.a;
        int i = this.X;
        ga1 ga1 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            d4b d4b = ga1.c;
            this.X = 1;
            obj = ((ap3) ((t97) d4b.c).getValue()).d(this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tf3 tf3 = (tf3) obj;
        grd grd = ga1.A0;
        do {
            value = grd.getValue();
            y91 = (y91) value;
            ub0 ub0 = new ub0(tf3.m(), ((Number) ga1.z0.getValue()).longValue());
            ga1.c.getClass();
            mc0 = new mc0(ub0, tf3.p(fj0.c));
            fna = ga1.X;
            b = fna.a().b(qna.l);
            hy7 = hy7.a;
            hy72 = hy7.X;
        } while (!grd.b(value, y91.a(y91, mc0, !fna.a().b(qna.h) ? hy72 : hy7, !b ? hy72 : hy7, false, (mge) null, (ArrayList) null, (mge) null, 120)));
        return jue.a;
    }
}
