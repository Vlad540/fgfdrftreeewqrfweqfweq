package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: q9d  reason: default package */
public final class q9d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ t9d Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q9d(t9d t9d, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = t9d;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new q9d(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [eze, java.lang.Object] */
    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = t9d.Q0;
            t9d t9d = this.Y;
            int d = sxe.d(((kp) t9d.s()).g.getString("app.privacy.chats.invite", "ALL"));
            int i2 = this.Z;
            if (d == i2) {
                return jue;
            }
            ((kp) t9d.s()).l("app.privacy.chats.invite", sxe.k(i2));
            pk r = t9d.r();
            ? obj3 = new Object();
            obj3.o = i2;
            r.a(new gze(obj3));
            this.X = 1;
            if (t9d.q(t9d, this) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
