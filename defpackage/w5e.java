package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: w5e  reason: default package */
public final class w5e extends l5e implements i26 {
    public tc9 X;
    public h6e Y;
    public fwe Z;
    public int w0;
    public /* synthetic */ Object x0;
    public final /* synthetic */ h6e y0;
    public final /* synthetic */ fwe z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w5e(h6e h6e, fwe fwe, Continuation continuation) {
        super(2, continuation);
        this.y0 = h6e;
        this.z0 = fwe;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((d5b) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        w5e w5e = new w5e(this.y0, this.z0, continuation);
        w5e.x0 = obj;
        return w5e;
    }

    /* JADX INFO: finally extract failed */
    public final Object o(Object obj) {
        d5b d5b;
        tc9 tc9;
        h6e h6e;
        fwe fwe;
        pu3 pu3 = pu3.a;
        int i = this.w0;
        if (i == 0) {
            wx3.H(obj);
            d5b = (d5b) this.x0;
            h6e h6e2 = this.y0;
            tc9 = h6e2.h;
            this.x0 = d5b;
            this.X = tc9;
            this.Y = h6e2;
            fwe = this.z0;
            this.Z = fwe;
            this.w0 = 1;
            if (tc9.d(this) == pu3) {
                return pu3;
            }
            h6e = h6e2;
        } else if (i == 1) {
            fwe = this.Z;
            h6e = this.Y;
            tc9 = this.X;
            d5b = (d5b) this.x0;
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            pj5 pj5 = (pj5) h6e.i.f(fwe);
            if (pj5 == null) {
                pj5 gl5 = new gl5(new bc(new bc(ez3.H(new djc(new t5e(h6e, fwe, (Continuation) null)), new u5e(h6e, (Continuation) null)), 18, new v5e(h6e, (Continuation) null, 0)), 17, new zl5(h6e, fwe, (Continuation) null, 9)), new ox2(h6e, fwe, (Continuation) null));
                h6e.i.k(fwe, gl5);
                pj5 = gl5;
            }
            tc9.e((Object) null);
            hr2 hr2 = new hr2(1, d5b);
            this.x0 = null;
            this.X = null;
            this.Y = null;
            this.Z = null;
            this.w0 = 2;
            if (pj5.c(hr2, this) == pu3) {
                return pu3;
            }
            return jue.a;
        } catch (Throwable th) {
            tc9.e((Object) null);
            throw th;
        }
    }
}
