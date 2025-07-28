package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tm2  reason: default package */
public final class tm2 extends l5e implements i26 {
    public km4 X;
    public int Y;
    public final /* synthetic */ nn2 Z;
    public final /* synthetic */ CharSequence w0;
    public final /* synthetic */ Long x0;
    public final /* synthetic */ Long y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tm2(nn2 nn2, CharSequence charSequence, Long l, Long l2, Continuation continuation) {
        super(2, continuation);
        this.Z = nn2;
        this.w0 = charSequence;
        this.x0 = l;
        this.y0 = l2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tm2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tm2(this.Z, this.w0, this.x0, this.y0, continuation);
    }

    public final Object o(Object obj) {
        km4 km4;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            nn2 nn2 = this.Z;
            km4 = nn2.w0;
            this.X = km4;
            this.Y = 1;
            obj = nn2.y(this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            km4 = this.X;
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        km4 km42 = km4;
        long longValue = ((Number) obj).longValue();
        this.X = null;
        this.Y = 2;
        Object U = xs7.U(((pae) ((t97) km42.x0).getValue()).b(), new jm4(km42, longValue, this.w0, this.y0, this.x0, (Continuation) null), this);
        if (U != pu3) {
            U = jue;
        }
        return U == pu3 ? pu3 : jue;
    }
}
