package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gjb  reason: default package */
public final class gjb extends l5e implements i26 {
    public int X;
    public final /* synthetic */ hjb Y;
    public final /* synthetic */ cb5 Z;
    public final /* synthetic */ oa5 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gjb(hjb hjb, cb5 cb5, oa5 oa5, Continuation continuation) {
        super(2, continuation);
        this.Y = hjb;
        this.Z = cb5;
        this.w0 = oa5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gjb(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        fn6 fn6;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            xp9 xp9 = (xp9) this.Y.w0.getValue();
            cb5 cb5 = this.Z;
            this.X = 1;
            xp9.getClass();
            if (r1g.h(xp9.a, new uh(xp9, 15, cb5), this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            m14 m14 = (m14) this.Y.o.getValue();
            cb5 cb52 = this.Z;
            boolean z = !((rf4) this.Y.b.getValue()).d();
            m14.getClass();
            String str = m14.k;
            fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, str, "notifyServerChatIdsDebounced", (Throwable) null);
            }
            m14.c(new l14(m14, cb52, z, (Continuation) null));
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hjb hjb = this.Y;
        cb5 cb53 = this.Z;
        oa5 oa5 = this.w0;
        this.X = 2;
        if (hjb.b(hjb, cb53, oa5, this) == pu3) {
            return pu3;
        }
        m14 m142 = (m14) this.Y.o.getValue();
        cb5 cb522 = this.Z;
        boolean z2 = !((rf4) this.Y.b.getValue()).d();
        m142.getClass();
        String str2 = m14.k;
        fn6 = udd.e;
        fn6.d(tn7.X, str2, "notifyServerChatIdsDebounced", (Throwable) null);
        m142.c(new l14(m142, cb522, z2, (Continuation) null));
        return jue.a;
    }
}
