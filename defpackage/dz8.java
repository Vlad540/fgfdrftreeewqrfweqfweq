package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: dz8  reason: default package */
public final class dz8 extends l5e implements i26 {
    public final /* synthetic */ zz8 X;
    public final /* synthetic */ List Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dz8(zz8 zz8, List list, Continuation continuation) {
        super(2, continuation);
        this.X = zz8;
        this.Y = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dz8(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        Long l;
        wx3.H(obj);
        zz8 zz8 = this.X;
        i22 i22 = (i22) zz8.r1.a.getValue();
        jue jue = jue.a;
        if (!(i22 == null || (l = (Long) o23.X(this.Y)) == null)) {
            long longValue = l.longValue();
            if (i22.X != null) {
                zz8 zz82 = zz8;
                taf.n(zz8, zz8.Y.b(), (ru3) null, new xz8(zz82, i22.a, longValue, i22.b.a, (Continuation) null), 2);
            }
        }
        return jue;
    }
}
