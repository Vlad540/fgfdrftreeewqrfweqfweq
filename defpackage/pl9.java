package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: pl9  reason: default package */
public final class pl9 {
    public final g2b a;
    public final tt0 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;

    public pl9(g2b g2b, tt0 tt0, t97 t97, t97 t972, t97 t973) {
        this.a = g2b;
        this.b = tt0;
        this.c = t97;
        this.d = t972;
        this.e = t973;
    }

    public final void a(ra3 ra3, zb9 zb9) {
        udd.q("NotifConfigLogic", "onChatsAndFolders: step 1: chats");
        Map map = ra3.c;
        bs bsVar = new bs(0);
        if (map != null) {
            bs bsVar2 = new bs(0);
            for (Map.Entry entry : map.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                tn2 tn2 = (tn2) entry.getValue();
                i22 y = ((t52) this.c.getValue()).y(longValue);
                if (y == null) {
                    t52 t52 = (t52) this.c.getValue();
                    t52.getClass();
                    y52 y52 = new y52();
                    y52.b = n62.b;
                    y52.a = longValue;
                    y52.l = longValue;
                    y52.c = m62.o;
                    y52.r0 = 2;
                    long d2 = ((hz3) ((a04) t52.l.get())).b.d(new o62(y52));
                    t52.U(d2, t52.X(d2));
                    y = t52.h0(d2, false);
                }
                long j = y.a;
                bsVar.add(Long.valueOf(longValue));
                if (!zb9.d(j)) {
                    t52 t522 = (t52) this.c.getValue();
                    t522.getClass();
                    udd.p("t52", "changeChatConfiguration, chatId = %d, chatSettings = %s", new Object[]{Long.valueOf(j), tn2});
                    t522.h(j, false, new zx1(7, tn2));
                    bsVar2.add(Long.valueOf(j));
                }
            }
            if (!bsVar2.isEmpty()) {
                this.b.c(new mw2(bsVar2, true, false, (md4) null, (a4b) null, 124));
            }
        }
        udd.q("NotifConfigLogic", "onChatsAndFolders: step 2: folders");
        u72 u72 = ra3.e;
        if (u72 != null) {
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                fn6.d(tn7, "NotifConfigLogic", "onChatsAndFolders: step 2: folders not null " + ((v72) this.d.getValue()), (Throwable) null);
            }
            ((b92) ((v72) this.d.getValue())).f(u72.b, u72.a);
        }
        if (!bsVar.isEmpty()) {
            b92 b92 = (b92) ((v72) this.d.getValue());
            qod qod = b92.L0;
            if (qod != null) {
                qod.cancel((CancellationException) null);
            }
            b92.L0 = xs7.E(b92.Z, b92.Y, (ru3) null, new x82(b92, (Continuation) null), 2);
        }
        udd.q("NotifConfigLogic", "onChatsAndFolders: post config event");
        this.b.c(new wt(2));
    }

    public final void b(ra3 ra3, boolean z) {
        udd.q("NotifConfigLogic", "onConfiguration = " + ra3);
        udd.q("NotifConfigLogic", "onConfiguration: step 1: hash");
        String str = ra3.a;
        g2b g2b = this.a;
        if (str != null) {
            ((j2b) g2b).b.l("hash", str);
        }
        udd.q("NotifConfigLogic", "onConfiguration: step 2: serverSettings");
        tt0 tt0 = this.b;
        zzc zzc = ra3.b;
        if (zzc != null) {
            yzc yzc = ((j2b) g2b).b;
            iw4 iw4 = zzc.b;
            if (iw4 == null) {
                iw4 = iw4.a;
            }
            yzc.getClass();
            String c2 = ete.c(yzc.v(PmsKey.proxy, (String) null));
            PmsKey pmsKey = PmsKey.f93proxydomains;
            hw4 hw4 = hw4.a;
            List g = yzc.g(pmsKey.name(), hw4);
            te5 edit = yzc.g.edit();
            for (Map.Entry entry : iw4.entrySet()) {
                f3.h(edit, (String) entry.getKey(), entry.getValue());
            }
            edit.apply();
            bs bsVar = yzc.h;
            if (c2 != null) {
                String c3 = ete.c(yzc.v(PmsKey.proxy, (String) null));
                if (!c2.equals(c3)) {
                    bsVar.getClass();
                    ur urVar = new ur(bsVar);
                    while (urVar.hasNext()) {
                        ((wzc) urVar.next()).a(c2, c3);
                    }
                }
            }
            if (iw4.containsKey("debug-mode")) {
                try {
                    ((jk0) yzc.i.getValue()).c(Integer.valueOf(((Number) iw4.get("debug-mode")).intValue()));
                } catch (Throwable th) {
                    udd.S(yzc.e, "could not parse debug mode", th);
                }
            }
            List g2 = yzc.g(PmsKey.f93proxydomains.name(), hw4);
            if (!hhd.f(g, g2)) {
                bsVar.getClass();
                ur urVar2 = new ur(bsVar);
                while (urVar2.hasNext()) {
                    ((wzc) urVar2.next()).b(g, g2);
                }
            }
            Iterator it = yzc.m.iterator();
            while (it.hasNext()) {
                ((vzc) it.next()).a();
            }
            if (iw4.containsKey("react-errors")) {
                yzc.j.b();
            }
            tt0.c(new kh0());
        }
        udd.q("NotifConfigLogic", "onConfiguration: step 3: user settings");
        gze gze = ra3.d;
        if (gze != null) {
            j2b j2b = (j2b) g2b;
            j2b.c.w(gze);
            if (hhd.f(gze.u, Boolean.FALSE)) {
                i03 i03 = j2b.a;
                i03.l("app.pin_" + i03.s(), (String) null);
            }
            oa3 oa3 = (oa3) this.e.getValue();
            oa3.getClass();
            xs7.E(oa3.b, (hu3) null, (ru3) null, new na3(oa3, (Continuation) null), 3);
        }
        if (!z) {
            udd.q("NotifConfigLogic", "onConfiguration: step 5: chats settings");
            a(ra3, tq7.a);
            return;
        }
        udd.q("NotifConfigLogic", "onConfiguration: post config event");
        tt0.c(new wt(2));
    }
}
