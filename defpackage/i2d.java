package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: i2d  reason: default package */
public final class i2d extends ol implements qce {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2d(long j, int i) {
        super(j);
        this.o = i;
    }

    private final void u(uae uae) {
    }

    public final void c(lbe lbe) {
        switch (this.o) {
            case 0:
                k2d k2d = (k2d) lbe;
                ((j2b) r()).b.k("app-update-type", Long.valueOf((long) k2d.X));
                pl plVar = null;
                if (k2d.X == 1) {
                    pl plVar2 = this.c;
                    if (plVar2 == null) {
                        plVar2 = null;
                    }
                    h0a h0a = (h0a) plVar2.i.getValue();
                    h0a.d.getClass();
                    ((i03) h0a.b).l("version.force.update.received", "25.7.2");
                    pl plVar3 = this.c;
                    if (plVar3 != null) {
                        plVar = plVar3;
                    }
                    ((h0a) plVar.i.getValue()).b();
                    return;
                }
                if (k2d.c != null) {
                    yzc yzc = ((j2b) r()).b;
                    String str = k2d.c;
                    yzc.getClass();
                    String c = ete.c(str);
                    PmsKey pmsKey = PmsKey.proxy;
                    String c2 = ete.c(yzc.v(pmsKey, (String) null));
                    if (!hhd.f(c, c2)) {
                        yzc.l(pmsKey.name(), c);
                        bs bsVar = yzc.h;
                        bsVar.getClass();
                        ur urVar = new ur(bsVar);
                        while (urVar.hasNext()) {
                            ((wzc) urVar.next()).a(c2, c);
                        }
                    }
                }
                if (k2d.o != null) {
                    ((j2b) r()).a.l("app.location.country.code", k2d.o);
                }
                yzc yzc2 = ((j2b) r()).b;
                List emptyList = k2d.Y == null ? Collections.emptyList() : new ArrayList(k2d.Y);
                yzc2.getClass();
                PmsKey pmsKey2 = PmsKey.f93proxydomains;
                List g = yzc2.g(pmsKey2.name(), hw4.a);
                if (!hhd.f(g, emptyList)) {
                    te5 edit = yzc2.g.edit();
                    f3.h(edit, pmsKey2.name(), emptyList);
                    edit.apply();
                    bs bsVar2 = yzc2.h;
                    bsVar2.getClass();
                    ur urVar2 = new ur(bsVar2);
                    while (urVar2.hasNext()) {
                        ((wzc) urVar2.next()).b(g, emptyList);
                    }
                }
                l().c(new wt(this.a, 11));
                String f = k().f();
                if (f != null && f.length() != 0 && !k().e()) {
                    pl plVar4 = this.c;
                    if (plVar4 != null) {
                        plVar = plVar4;
                    }
                    ((bp7) plVar.j.getValue()).r();
                    return;
                }
                return;
            default:
                l().c(new t3d(this.a, ((s3d) lbe).c));
                return;
        }
    }

    public final void d(uae uae) {
        switch (this.o) {
            case 0:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                l2d l2d = (l2d) plVar.h.getValue();
                l2d.getClass();
                String str = l2d.f;
                udd.q(str, "onSessionInitFail, error = " + uae);
                if ("session.state".equals(uae.b)) {
                    String str2 = uae.c;
                    udd.q(str, "session state error: " + str2 + " do nothing");
                    return;
                } else if (!(uae instanceof lae)) {
                    if ("proto.state".equals(uae.b)) {
                        k77 k77 = l2d.e[0];
                        ((g15) l2d.a.get()).c(new TamErrorException(uae), true);
                    }
                    k77 k772 = l2d.e[3];
                    ((dce) l2d.d.get()).i();
                    return;
                } else {
                    k77[] k77Arr = l2d.e;
                    k77 k773 = k77Arr[1];
                    if (((h3d) ((f3d) l2d.b.get())).h == 2) {
                        k77 k774 = k77Arr[2];
                        gy9 gy9 = (gy9) ((pk) l2d.c.get());
                        gy9.v(gy9, new i2d(((j2b) gy9.z()).a.n(), 0));
                        return;
                    }
                    return;
                }
            default:
                return;
        }
    }

    public final ibe i() {
        switch (this.o) {
            case 0:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                uye h = ((rf4) plVar.b.getValue()).h();
                pl plVar2 = this.c;
                if (plVar2 == null) {
                    plVar2 = null;
                }
                String a = ((rf4) plVar2.b.getValue()).a();
                long D = ((j2b) r()).a.D();
                pl plVar3 = this.c;
                if (plVar3 == null) {
                    plVar3 = null;
                }
                String str = (String) ((tf4) ((rf4) plVar3.b.getValue())).l.get();
                ibe ibe = new ibe((dfa) null);
                HashMap hashMap = new HashMap();
                hashMap.put("deviceType", h.a);
                hashMap.put("pushDeviceType", m4b.c(h.j));
                hashMap.put("appVersion", h.b);
                hashMap.put("buildNumber", Integer.valueOf(h.c));
                String str2 = h.d;
                if (!(str2 == null || str2.length() == 0)) {
                    hashMap.put("appKey", str2);
                }
                hashMap.put("osVersion", h.e);
                hashMap.put("locale", h.f);
                hashMap.put("deviceLocale", h.g);
                hashMap.put("deviceName", h.h);
                hashMap.put("screen", h.i);
                hashMap.put("timezone", h.k.getID());
                ibe.p("userAgent", hashMap);
                ibe.s("deviceId", a);
                ibe.n(D, "clientSessionId");
                if (r1g.q(str)) {
                    ibe.s("mt_instanceid", str);
                }
                return ibe;
            default:
                return new bm9((dfa) null, 9);
        }
    }
}
