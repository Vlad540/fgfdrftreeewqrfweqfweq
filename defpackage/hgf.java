package defpackage;

import android.security.keystore.UserNotAuthenticatedException;
import kotlin.coroutines.Continuation;

/* renamed from: hgf  reason: default package */
public final class hgf extends l5e implements i26 {
    public String X;
    public int Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ zgf w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hgf(zgf zgf, Continuation continuation, boolean z) {
        super(2, continuation);
        this.Z = z;
        this.w0 = zgf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hgf(this.w0, continuation, this.Z);
    }

    public final Object o(Object obj) {
        String g;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            if (!this.Z) {
                ju3 b = this.w0.e().b();
                ggf ggf = new ggf(this.w0, (Continuation) null);
                this.Y = 1;
                obj = xs7.U(b, ggf, this);
                if (obj == pu3) {
                    return pu3;
                }
            } else {
                e57 e57 = this.w0.l;
                dm0 dm0 = e57 instanceof dm0 ? (dm0) e57 : null;
                String str = dm0 != null ? dm0.d : null;
                this.w0.getClass();
                g = zgf.g(str);
                stf i2 = this.w0.f.i((String) null);
                zgf zgf = this.w0;
                hcd hcd = zgf.j;
                yff yff = new yff(i2, (String) zgf.e.getValue(), g);
                this.X = g;
                this.Y = 2;
                return hcd.a(yff, this) == pu3 ? pu3 : jue;
            }
        } else if (i != 1) {
            if (i == 2) {
                g = this.X;
                try {
                    wx3.H(obj);
                } catch (UserNotAuthenticatedException e) {
                    udd.S(this.w0.g, "Can't webapp access request to biometry, try request biometry without crypto", e);
                    zgf zgf2 = this.w0;
                    hcd hcd2 = zgf2.j;
                    yff yff2 = new yff((stf) null, (String) zgf2.e.getValue(), g);
                    this.X = null;
                    this.Y = 3;
                    if (hcd2.a(yff2, this) == pu3) {
                        return pu3;
                    }
                }
            } else if (i == 3) {
                wx3.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            wx3.H(obj);
        }
        ahf ahf = (ahf) obj;
        e57 e572 = this.w0.l;
        dm0 dm02 = e572 instanceof dm0 ? (dm0) e572 : null;
        if (dm02 != null) {
            boolean f = this.w0.f();
            String str2 = ahf.d;
            dm02.a(new jm0(f, true, false, !(str2 == null || str2.length() == 0)));
        } else {
            e57 e573 = this.w0.l;
            if (e573 != null) {
                e573.b(new s0());
            }
        }
        this.w0.l = null;
        return jue;
    }
}
