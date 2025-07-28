package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: g7b  reason: default package */
public final class g7b extends l5e implements i26 {
    public int X;
    public final /* synthetic */ q7b Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g7b(q7b q7b, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = q7b;
        this.Z = j;
        this.w0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new g7b(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        mge mge;
        pu3 pu3 = pu3.a;
        int i = this.X;
        boolean z = true;
        q7b q7b = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ((ia) q7b.A0.getValue()).a(this.w0, this.Z, q7b.c, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uae uae = (uae) obj;
        if (uae != null) {
            k77[] k77Arr = q7b.J0;
            q7b.getClass();
            String str = uae.o;
            if (str == null || str.length() == 0) {
                String str2 = uae.b;
                mge = (!iu7.F(str2) || !hhd.f(str2, "io.exception")) ? (!iu7.F(str2) || hhd.f(str2, "io.exception")) ? new hge(cic.E) : new hge(cic.H) : new hge(cic.F);
                z = false;
            } else {
                mge = new lge(str);
            }
            taf.o(q7b.F0, new u6b(mge, (Integer) null));
            if (z) {
                b7b b7b = b7b.SETUP_NEW_ADMIN;
                b7b b7b2 = q7b.o;
                l05 l05 = q7b.E0;
                if (b7b2 == b7b) {
                    s8b.c.getClass();
                    taf.o(l05, new a34(":profile/members?id=" + q7b.b + "&type=ADMIN"));
                } else {
                    taf.o(l05, v03.b);
                }
            }
        } else {
            k77[] k77Arr2 = q7b.J0;
            q7b.getClass();
            b7b b7b3 = b7b.SETUP_NEW_ADMIN;
            b7b b7b4 = q7b.o;
            l05 l052 = q7b.E0;
            if (b7b4 == b7b3) {
                if (q7b.X) {
                    taf.o(q7b.F0, new u6b(new hge(i8a.J0), Integer.valueOf(phc.A)));
                }
                s8b.c.getClass();
                taf.o(l052, new a34(":profile/members?id=" + q7b.b + "&type=ADMIN"));
            } else {
                taf.o(l052, v03.b);
            }
        }
        return jue.a;
    }
}
