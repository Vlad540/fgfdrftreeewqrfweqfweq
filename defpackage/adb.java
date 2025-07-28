package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: adb  reason: default package */
public final class adb extends l5e implements i26 {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ jdb Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adb(long j, jdb jdb, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = jdb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new adb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            if (this.Y == ((long) f8a.p0)) {
                hba hba = (hba) this.Z.Y.getValue();
                hba.h(new hge(i8a.G1));
                hba.j();
            }
            this.X = 1;
            if (ek8.q(250, this) == pu3) {
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
