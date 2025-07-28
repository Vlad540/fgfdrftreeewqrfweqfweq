package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n9d  reason: default package */
public final class n9d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ t9d Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n9d(t9d t9d, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = t9d;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new n9d(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [eze, java.lang.Object] */
    public final Object o(Object obj) {
        Object obj2 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            k77[] k77Arr = t9d.Q0;
            t9d t9d = this.Y;
            boolean z = ((kp) t9d.s()).g.getBoolean("app.privacy.online.show", true);
            boolean z2 = this.Z;
            if (z == z2) {
                return jue;
            }
            ((kp) t9d.s()).i("app.privacy.online.show", z2);
            pk r = t9d.r();
            ? obj3 = new Object();
            obj3.h = Boolean.valueOf(!z2);
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
