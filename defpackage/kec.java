package defpackage;

import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: kec  reason: default package */
public final class kec extends l5e implements i26 {
    public int X;
    public final /* synthetic */ nec Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kec(nec nec, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = nec;
        this.Z = j;
        this.w0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kec(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        nec nec = this.Y;
        if (i == 0) {
            wx3.H(obj);
            cw8 d = nec.d();
            this.X = 1;
            d.getClass();
            pec a = pec.a(2, "SELECT * FROM messages WHERE chat_id = ? AND server_id = ?");
            a.j(1, this.Z);
            a.j(2, this.w0);
            obj = r1g.g(d.a, new CancellationSignal(), new aw8(d, a, 2), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return (vo8) obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jp8 jp8 = (jp8) obj;
        if (jp8 == null) {
            return null;
        }
        this.X = 2;
        obj = nec.h(jp8, this);
        if (obj == pu3) {
            return pu3;
        }
        return (vo8) obj;
    }
}
