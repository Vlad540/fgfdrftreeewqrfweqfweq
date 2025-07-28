package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nz2  reason: default package */
public final class nz2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ oz2 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nz2(oz2 oz2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = oz2;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nz2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nz2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            String str = (String) this.Y.a;
            long j = this.Z;
            fn6 fn6 = udd.e;
            j4a j4a = null;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, str, us8.i(j, "start clear draft for chatId:"), (Throwable) null);
            }
            i22 i22 = (i22) ((bv2) ((t97) this.Y.c).getValue()).m(this.Z).a.getValue();
            if (i22 == null) {
                udd.p((String) this.Y.a, "can't clear draft because chat is null", new Object[0]);
                return jue;
            }
            j4a j4a2 = i22.b.f0;
            if (j4a2 instanceof j4a) {
                j4a = j4a2;
            }
            if (j4a == null) {
                udd.p((String) this.Y.a, "Draft empty in chat don't need clear", new Object[0]);
                return jue;
            }
            udd.p((String) this.Y.a, "Clear local draft", new Object[0]);
            oz2 oz2 = this.Y;
            this.X = 1;
            oz2.getClass();
            udd.p((String) oz2.a, us8.i(i22.a, "dropAllDrafts "), new Object[0]);
            o62 o62 = i22.b;
            if (o62.f0 != null) {
                Long l = j4a.e;
                long longValue = l != null ? l.longValue() : o62.g0;
                if (!((xzc) ((t97) oz2.f).getValue()).s()) {
                    longValue = 0;
                }
                ((bv2) ((t97) oz2.c).getValue()).l().k(i22.a, longValue, (j4a) null);
            }
            Object f = oz2.f(i22.a, j4a, this);
            if (f != pu3) {
                f = jue;
            }
            if (f == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
