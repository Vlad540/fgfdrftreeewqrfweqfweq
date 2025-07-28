package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rg2  reason: default package */
public final class rg2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ah2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ String w0;
    public final /* synthetic */ long x0;
    public final /* synthetic */ long y0;
    public final /* synthetic */ boolean z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rg2(ah2 ah2, long j, String str, long j2, long j3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = ah2;
        this.Z = j;
        this.w0 = str;
        this.x0 = j2;
        this.y0 = j3;
        this.z0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rg2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rg2(this.Y, this.Z, this.w0, this.x0, this.y0, this.z0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (((okc) this.Y.G0.getValue()).a(this.Z, this.w0, this.x0, this.y0, this.z0, this) == pu3) {
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
