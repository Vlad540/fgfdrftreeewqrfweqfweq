package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: on3  reason: default package */
public final class on3 extends ol implements qce, tna {
    public final int X;
    public final String Y;
    public final String Z;
    public final long o;
    public final String w0;
    public final String x0;

    public on3(int i, long j, long j2, String str, String str2, String str3, String str4) {
        super(j);
        this.o = j2;
        this.X = i;
        this.Y = str;
        this.Z = str2;
        this.w0 = str3;
        this.x0 = str4;
    }

    public final void c(lbe lbe) {
        pn3 pn3 = (pn3) lbe;
        if (pn3.c != null) {
            n().u(Collections.singletonList(pn3.c));
            ((gy9) j()).u(Collections.singletonList(Long.valueOf(pn3.c.a)));
        }
        t52 m = m();
        long j = this.o;
        i22 E = m.E(j);
        if (E != null) {
            int t = hr1.t(this.X);
            long j2 = E.a;
            if (t != 0) {
                o62 o62 = E.b;
                if (t == 1) {
                    m().j(j, m62.a);
                    ((gy9) j()).j(o62.a);
                    l().c(new mw2(Collections.singletonList(Long.valueOf(j2)), true, false, (md4) null, (a4b) null, 124));
                } else if (t == 2 || t == 3 || t == 4) {
                    ((gy9) j()).j(o62.a);
                    l().c(new mw2(Collections.singletonList(Long.valueOf(j2)), true, false, (md4) null, (a4b) null, 124));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                m().j(j, m62.o);
                l().c(new mw2(Collections.singletonList(Long.valueOf(j2)), true, false, (md4) null, (a4b) null, 124));
            }
        }
    }

    public final void d(uae uae) {
        String str = uae.b;
        boolean F = iu7.F(str);
        long j = this.a;
        if (!F) {
            int t = hr1.t(this.X);
            long j2 = this.o;
            if (t == 0) {
                di3 n = n();
                n.getClass();
                udd.q("ContactController", "undo block, id = " + j2);
                n.c(j2, new zx1(16, (Object) null));
                ((nae) n.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                n.g.c(new lp3(j2));
            } else if (t == 1) {
                di3 n2 = n();
                n2.getClass();
                udd.q("ContactController", "undo unblock, id = " + j2);
                n2.c(j2, new zx1(16, li3.a));
                ((nae) n2.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                n2.g.c(new lp3(j2));
            } else if (t == 2) {
                di3 n3 = n();
                n3.getClass();
                udd.q("ContactController", "undo remove, id = " + j2);
                n3.c(j2, new j9(mi3.a, 20, (Object) null));
                n3.r(j2, false);
                ((nae) n3.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                n3.g.c(new lp3(j2));
            } else if (t == 3) {
                di3 n4 = n();
                n4.getClass();
                udd.q("ContactController", "undo add, id = " + j2);
                n4.c(j2, new j9(mi3.b, 20, (Object) null));
                ((nae) n4.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                n4.g.c(new lp3(j2));
            } else if (t == 4) {
                di3 n5 = n();
                n5.getClass();
                Long valueOf = Long.valueOf(j2);
                String str2 = this.Y;
                String str3 = this.Z;
                udd.p("ContactController", "undo rename, id = %d => %s %s", new Object[]{valueOf, str2, str3});
                n5.c(j2, new ai3(str2, str3, 0));
                lp3 lp3 = new lp3(j2);
                tt0 tt0 = n5.g;
                tt0.c(lp3);
                ((nae) n5.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                tt0.c(new lp3(j2));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if ("not.found".equals(str)) {
                n().o(j2);
            }
            t().d(j);
        }
        l().c(new jh0(j, uae));
    }

    public final int e() {
        return 1;
    }

    public final void f() {
    }

    public final byte[] g() {
        Tasks.ContactUpdate contactUpdate = new Tasks.ContactUpdate();
        contactUpdate.requestId = this.a;
        contactUpdate.contactId = this.o;
        String str = this.Y;
        if (str != null) {
            contactUpdate.oldName = str;
        }
        String str2 = this.Z;
        if (str2 != null) {
            contactUpdate.oldLastName = str2;
        }
        String str3 = this.w0;
        if (str3 != null) {
            contactUpdate.newName = str3;
        }
        String str4 = this.x0;
        if (str4 != null) {
            contactUpdate.lastName = str4;
        }
        contactUpdate.action = th2.d(this.X);
        return gr8.toByteArray(contactUpdate);
    }

    public final long getId() {
        return this.a;
    }

    public final una getType() {
        return una.TYPE_CONTACT_UPDATE;
    }

    public final int h() {
        return 1000000;
    }

    public final ibe i() {
        pn2 pn2 = new pn2((dfa) null, 10);
        pn2.n(this.o, "contactId");
        int i = this.X;
        if (i != 0) {
            pn2.s("action", th2.d(i));
        }
        String str = this.w0;
        if (!r1g.p(str)) {
            pn2.s("firstName", str);
        }
        String str2 = this.x0;
        if (r1g.q(str2)) {
            pn2.s("lastName", str2);
        }
        return pn2;
    }
}
