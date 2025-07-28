package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dy6  reason: default package */
public final class dy6 extends l5e implements i26 {
    public String X;
    public int Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ String w0;
    public final /* synthetic */ ly6 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dy6(String str, String str2, ly6 ly6, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.w0 = str2;
        this.x0 = ly6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dy6(this.Z, this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        String str;
        boolean z;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        jue jue = jue.a;
        ly6 ly6 = this.x0;
        if (i == 0) {
            wx3.H(obj);
            String str2 = this.Z + " " + this.w0;
            if ("".equals(((v3a) ly6.A0.getValue()).a)) {
                z = true;
            } else {
                t97 t97 = ly6.X;
                z = ((loa) t97.getValue()).m(((loa) t97.getValue()).t((String) null, str2));
            }
            if (!z) {
                hcd hcd = ly6.Z;
                qo7 qo7 = new qo7(new hge(utb.oneme_login_input_is_not_valid_phone_error), (Throwable) null);
                this.Y = 1;
                if (hcd.a(qo7, this) == pu3) {
                    return pu3;
                }
            } else {
                String b = ly6.E0.b("", str2);
                this.X = str2;
                this.Y = 2;
                Object a = ((h70) ly6.c.getValue()).a(b, 1, this);
                if (a == pu3) {
                    return pu3;
                }
                String str3 = str2;
                obj = a;
                str = str3;
                g70 g70 = (g70) obj;
                taf.o(ly6.Y, new tx6(g70.c, str, g70.o));
                return jue;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            str = this.X;
            wx3.H(obj);
            g70 g702 = (g70) obj;
            taf.o(ly6.Y, new tx6(g702.c, str, g702.o));
            return jue;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
