package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: vx8  reason: default package */
public final class vx8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zz8 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vx8(zz8 zz8, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((tt3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vx8 vx8 = new vx8(this.Y, this.Z, continuation);
        vx8.X = obj;
        return vx8;
    }

    public final Object o(Object obj) {
        ked ked;
        wx3.H(obj);
        tt3 tt3 = (tt3) this.X;
        if (tt3 instanceof st3) {
            ked = new ked(((st3) tt3).a, 0, (hge) null, 6);
        } else if (tt3 instanceof rt3) {
            ked = new ked(((rt3) tt3).a, 0, (hge) null, 6);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        zz8 zz8 = this.Y;
        taf.o(zz8.y1, ked);
        zz8.D1.remove(new Long(this.Z));
        return jue.a;
    }
}
