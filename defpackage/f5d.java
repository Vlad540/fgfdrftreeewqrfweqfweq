package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: f5d  reason: default package */
public final class f5d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ i5d Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f5d(i5d i5d, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = i5d;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new f5d(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = i5d.E0;
            i5d i5d = this.Y;
            i5d.r().i("app.media.load.roaming", this.Z);
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
