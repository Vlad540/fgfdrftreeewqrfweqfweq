package defpackage;

import android.net.Uri;

/* renamed from: ew  reason: default package */
public final class ew implements p0c, t55 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public volatile Object o;

    public /* synthetic */ ew(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public Object T0(Object obj, k77 k77) {
        switch (this.a) {
            case 0:
                Object obj2 = this.o;
                if (obj2 != null) {
                    return obj2;
                }
                Object value = ((t97) this.b).getValue();
                this.o = value;
                return value;
            default:
                Object obj3 = this.o;
                if (obj3 != null) {
                    return obj3;
                }
                Object value2 = ((t97) this.b).getValue();
                this.o = value2;
                return value2;
        }
    }

    public void e() {
        ((nl) this.b).setSessionInfo((ml) null);
        ppc ppc = ppc.c;
        ((jj7) this.c).getClass();
        g(ppc.b("CGPGAGLGDIHBABABA"));
    }

    public ppc f() {
        String str;
        ppc ppc = (ppc) this.o;
        if (ppc == null) {
            ml sessionInfo = ((nl) this.b).getSessionInfo();
            ppc ppc2 = ppc.c;
            ((jj7) this.c).getClass();
            ppc b2 = ppc2.b("CGPGAGLGDIHBABABA");
            String str2 = null;
            if ((sessionInfo != null ? sessionInfo.c : null) != null) {
                b2 = b2.d(Uri.parse(sessionInfo.c));
            }
            if (sessionInfo != null) {
                str2 = sessionInfo.a;
            }
            ppc = (str2 == null || (str = sessionInfo.b) == null) ? b2 : b2.c(sessionInfo.a, str);
        }
        this.o = ppc;
        return ppc;
    }

    public void g(ppc ppc) {
        this.o = ppc;
        Uri a2 = ppc.a();
        wk wkVar = ppc.a;
        ((nl) this.b).setSessionInfo(new ml(wkVar.d, wkVar.e, a2 != null ? a2.toString() : null));
    }

    public void o1(Object obj, k77 k77, Object obj2) {
        switch (this.a) {
            case 0:
                Object obj3 = this.o;
                this.o = obj2;
                og6 og6 = (og6) obj3;
                ((fw) this.c).k.c((og6) obj2);
                return;
            default:
                Object obj4 = this.o;
                this.o = obj2;
                og6 og62 = (og6) obj2;
                og6 og63 = (og6) obj4;
                ((jh6) this.c).c.getClass();
                return;
        }
    }

    public ew() {
        this.a = 1;
        this.b = new ydc(5);
    }

    public ew(eje eje) {
        this.a = 3;
        this.b = eje;
        this.o = new zz5(0, 0);
    }
}
