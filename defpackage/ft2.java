package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ft2  reason: default package */
public final class ft2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fu2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ft2(fu2 fu2, Continuation continuation) {
        super(2, continuation);
        this.Y = fu2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ft2) n((ne7) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ft2 ft2 = new ft2(this.Y, continuation);
        ft2.X = obj;
        return ft2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        yd7 yd7 = (ne7) this.X;
        String name = this.Y.getClass().getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, name, "get result for link " + yd7, (Throwable) null);
        }
        if (yd7 instanceof yd7) {
            taf.o(this.Y.Q0, new sg9(new k34(yd7.a)));
        } else if (yd7 instanceof be7) {
            taf.o(this.Y.Q0, new sg9(((be7) yd7).a));
        } else if (yd7 instanceof fe7) {
            taf.o(this.Y.Q0, zu2.c.a2(((fe7) yd7).a));
        } else if (yd7 instanceof wd7) {
            l05 l05 = this.Y.Q0;
            zu2 zu2 = zu2.c;
            wd7 wd7 = (wd7) yd7;
            long j = wd7.a;
            String str = wd7.o;
            String str2 = wd7.b;
            boolean z = wd7.c;
            zu2.getClass();
            String str3 = ":join?id=" + j + "&link=" + str + "&channel=" + z;
            if (str2 != null) {
                str3 = str3 + "&title=" + str2;
            }
            rf0.j(str3, l05);
        } else if (!(yd7 instanceof ge7)) {
            if (yd7 instanceof he7) {
                taf.o(this.Y.Q0, zu2.c.a2(((he7) yd7).a));
            } else if (yd7 instanceof je7) {
                fu2 fu2 = this.Y;
                fu2.o.j(((je7) yd7).a, true, false, false, new x2((Object) fu2, 24, (Object) yd7));
            } else if (hhd.f(yd7, zd7.a)) {
                taf.o(this.Y.R0, new med(new hge(cic.w2)));
            } else if (yd7 instanceof ke7) {
                l05 l052 = this.Y.Q0;
                zu2 zu22 = zu2.c;
                long j2 = ((ke7) yd7).a;
                zu22.getClass();
                rf0.j(":stickers/set?set_id=" + j2, l052);
            }
        }
        return jue.a;
    }
}
