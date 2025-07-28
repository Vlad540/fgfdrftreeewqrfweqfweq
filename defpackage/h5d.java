package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h5d  reason: default package */
public final class h5d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ i5d Y;
    public final /* synthetic */ n2f Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h5d(i5d i5d, n2f n2f, Continuation continuation) {
        super(2, continuation);
        this.Y = i5d;
        this.Z = n2f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h5d(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = i5d.E0;
            i5d i5d = this.Y;
            qpc r = i5d.r();
            r.getClass();
            r.l("app.media.video.compress", this.Z.name());
            this.X = 1;
            if (i5d.q(i5d, this) == pu3) {
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
