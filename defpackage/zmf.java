package defpackage;

import android.security.keystore.UserNotAuthenticatedException;
import kotlin.coroutines.Continuation;

/* renamed from: zmf  reason: default package */
public final class zmf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ anf Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zmf(boolean z, anf anf, Continuation continuation) {
        super(2, continuation);
        this.Y = z;
        this.Z = anf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zmf(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            if (this.Y) {
                String str = ((wmf) this.Z.x0.getValue()).a;
                try {
                    taf.o(this.Z.z0, new umf(str, this.Z.o.i((String) null)));
                } catch (UserNotAuthenticatedException unused) {
                    udd.U(this.Z.X, "Can't prepare crypto object because need auth by biometry");
                    taf.o(this.Z.z0, new umf(str, (stf) null));
                }
                return jue;
            }
            anf anf = this.Z;
            long j = anf.b;
            long j2 = anf.c;
            this.X = 1;
            obj = ((xff) this.Z.Y.getValue()).a(j, j2, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            anf anf2 = this.Z;
            k77[] k77Arr = anf.D0;
            anf2.q();
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ahf ahf = (ahf) obj;
        ahf a = ahf != null ? ahf.a(ahf, false, false, 7) : null;
        if (a == null) {
            anf anf3 = this.Z;
            String str2 = anf3.X;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.w0, str2, us8.i(anf3.c, "Can't update webApp state in db with unchecked state, botId = "), (Throwable) null);
            }
            return jue;
        }
        xff xff = (xff) this.Z.Y.getValue();
        this.X = 2;
        xff.getClass();
        if (r1g.h(xff.a, new wff(xff, a, 1), this) == pu3) {
            return pu3;
        }
        anf anf22 = this.Z;
        k77[] k77Arr2 = anf.D0;
        anf22.q();
        return jue;
    }
}
