package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l65  reason: default package */
public final class l65 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ m65 Z;
    public final /* synthetic */ String w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l65(m65 m65, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = m65;
        this.w0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l65) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l65 l65 = new l65(this.Z, this.w0, continuation);
        l65.Y = obj;
        return l65;
    }

    public final Object o(Object obj) {
        Throwable th;
        ou3 ou3;
        pu3 pu3 = pu3.a;
        int i = this.X;
        m65 m65 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.Y;
            try {
                bc W = ez3.W(new djc(new j65(m65, this.w0, (Continuation) null)), 5, new k65(ou32, (Continuation) null));
                this.Y = ou32;
                this.X = 1;
                Object D = ez3.D(W, this);
                if (D == pu3) {
                    return pu3;
                }
                ou3 ou33 = ou32;
                obj = D;
                ou3 = ou33;
            } catch (Throwable th2) {
                ou3 ou34 = ou32;
                th = th2;
                ou3 = ou34;
                String name = ou3.getClass().getName();
                udd.s(name, "ExternalCallback request failed due to " + th + ".", th);
                taf.o(m65.o, new i65(new hge(cic.D)));
                return jue.a;
            }
        } else if (i == 1) {
            ou3 = (ou3) this.Y;
            try {
                wx3.H(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d65 d65 = (d65) obj;
        Long l = d65.c;
        if (l != null) {
            l05 l05 = m65.o;
            sr7 sr7 = sr7.c;
            long longValue = l.longValue();
            bff bff = bff.o;
            String str = d65.o;
            sr7.getClass();
            taf.o(l05, sr7.c2(longValue, bff, str));
        } else {
            taf.o(m65.o, h65.b);
        }
        return jue.a;
    }
}
