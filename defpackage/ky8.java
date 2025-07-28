package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ky8  reason: default package */
public final class ky8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ String w0;
    public final /* synthetic */ eu0 x0;
    public final /* synthetic */ yt0 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ky8(zz8 zz8, Long l, String str, eu0 eu0, yt0 yt0, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
        this.Z = l;
        this.w0 = str;
        this.x0 = eu0;
        this.y0 = yt0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ky8(this.Y, this.Z, this.w0, this.x0, this.y0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            nxc nxc = this.Y.C0;
            long longValue = this.Z.longValue();
            this.X = 1;
            if (nxc.I(longValue, this.w0, this.x0, this.y0, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
