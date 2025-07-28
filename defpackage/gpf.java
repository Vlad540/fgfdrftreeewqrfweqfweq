package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: gpf  reason: default package */
public final class gpf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ ipf w0;
    public final /* synthetic */ List x0;
    public ahf y0;
    public int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gpf(int i, Object obj, Continuation continuation, ipf ipf, List list) {
        super(2, continuation);
        this.Y = i;
        this.Z = obj;
        this.w0 = ipf;
        this.x0 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gpf(this.Y, this.Z, continuation, this.w0, this.x0);
    }

    public final Object o(Object obj) {
        Object obj2;
        ahf ahf;
        int i;
        pu3 pu3 = pu3.a;
        int i2 = this.X;
        int i3 = 1;
        if (i2 == 0) {
            wx3.H(obj);
            ahf = (ahf) this.Z;
            long j = ahf.c;
            fj0 fj0 = fj0.a;
            this.y0 = ahf;
            int i4 = this.Y;
            this.z0 = i4;
            this.X = 1;
            obj2 = ((b96) this.w0.o.getValue()).a(j, fj0, this);
            if (obj2 == pu3) {
                return pu3;
            }
            i = i4;
        } else if (i2 == 1) {
            i = this.z0;
            ahf = this.y0;
            wx3.H(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        y86 y86 = (y86) obj2;
        o7d o7d = new o7d(ahf.c, 0, new lge(y86.a), (d7d) null, (mge) null, (Integer) null, w6d.a, (u6d) null, (mge) null, 0, new r6d(y86.c, y86.b), 952);
        List list = this.x0;
        if (list.size() == 1) {
            i3 = 4;
        } else if (i != 0) {
            i3 = i == p23.A(list) ? 3 : 2;
        }
        int i5 = i3;
        lkf.c.getClass();
        return new xof(o7d, new a34(":settings/webapp?bot_id=" + ahf.c), ahf.c, i5);
    }
}
