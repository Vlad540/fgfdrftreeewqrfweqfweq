package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: my8  reason: default package */
public final class my8 extends l5e implements i26 {
    public ipc X;
    public i22 Y;
    public int Z;
    public final /* synthetic */ zz8 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public my8(zz8 zz8, Continuation continuation) {
        super(2, continuation);
        this.w0 = zz8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new my8(this.w0, continuation);
    }

    public final Object o(Object obj) {
        ipc ipc;
        i22 i22;
        i22 i222;
        jue jue = pu3.a;
        int i = this.Z;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            ipc = ((jpc) this.w0.v1.getValue()).d;
            if (ipc == null || (i222 = (i22) this.w0.r1.a.getValue()) == null) {
                return jue2;
            }
            grd grd = this.w0.v1;
            grd.m((Object) null, jpc.a((jpc) grd.getValue(), 0, false, false, (ipc) null, 7));
            long j = this.w0.b.a;
            this.X = ipc;
            this.Y = i222;
            this.Z = 1;
            t52 l = ((aw2) ((bv2) ((bs8) this.w0.V0.getValue()).b.getValue())).l();
            l.getClass();
            l.h(j, true, new z42(j, 0));
            l.m.c(new v92(j, 0L));
            if (jue2 == jue) {
                return jue;
            }
            i22 = i222;
        } else if (i == 1) {
            i22 = this.Y;
            ipc = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        nu7 nu7 = this.w0.z0;
        long j2 = ipc.a;
        String str = (String) nu7.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, us8.i(j2, "Marking as read reaction for message="), (Throwable) null);
        }
        ((m0c) ((t97) nu7.b).getValue()).d(i22.b.a, i22.m(), j2, false, false, false, true);
        return jue2;
    }
}
