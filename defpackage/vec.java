package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: vec  reason: default package */
public final class vec extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zec Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vec(zec zec, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = zec;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vec(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            dsd a = this.Y.a();
            this.X = 1;
            a.getClass();
            pec a2 = pec.a(1, "SELECT * FROM events WHERE id = ?");
            a2.j(1, this.Z);
            obj = r1g.g(a.a, new CancellationSignal(), new csd(a, a2, 1), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rqd rqd = (rqd) obj;
        if (rqd == null) {
            return null;
        }
        long j = rqd.a;
        return new on7(rqd.b, j, rqd.c, rqd.d);
    }
}
