package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* renamed from: o71  reason: default package */
public final class o71 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ p71 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o71(p71 p71, Continuation continuation) {
        super(2, continuation);
        this.Y = p71;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o71) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new o71(this.Y, continuation);
    }

    public final Object o(Object obj) {
        grd grd;
        Object value;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            p71 p71 = this.Y;
            b65 b65 = ((ep1) p71.X).k().j;
            if ((b65 instanceof v55) || (b65 instanceof u55) || (b65 instanceof w55)) {
                do {
                    grd = p71.x0;
                    value = grd.getValue();
                    n71 n71 = (n71) value;
                } while (!grd.b(value, new m71(false)));
                return jue.a;
            }
            grd grd2 = ((x11) p71.o).k;
            bw bwVar = new bw(3, p71);
            this.X = 1;
            grd2.c(bwVar, this);
            return pu3;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            wx3.H(obj);
            throw new KotlinNothingValueException();
        }
    }
}
