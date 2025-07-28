package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: cz8  reason: default package */
public final class cz8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;
    public final /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cz8(zz8 zz8, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
        this.Z = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cz8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Long l;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        zz8 zz8 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            i22 i22 = (i22) zz8.r1.a.getValue();
            if (!(i22 == null || (l = (Long) o23.X(this.Z)) == null)) {
                long longValue = l.longValue();
                long j = i22.b.a;
                this.X = 1;
                if (((pj2) zz8.S0.getValue()).a(i22.a, j, longValue, false, this) == pu3) {
                    return pu3;
                }
            }
            return jue;
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        taf.o(zz8.y1, qr8.a);
        return jue;
    }
}
