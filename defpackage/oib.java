package defpackage;

import java.util.List;

/* renamed from: oib  reason: default package */
public final class oib implements wzc {
    public final t97 a;
    public final t97 b;

    public oib(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    public final void a(String str, String str2) {
        udd.q("oib", "onProxyEnableChange: oldValue=" + str + ", newValue=" + str2);
        ((yae) this.a.getValue()).f(str2);
        if (str2 != null && str2.length() != 0) {
            ((pv3) this.b.getValue()).b("proxy", str2);
        }
    }

    public final void b(List list, List list2) {
        udd.q("oib", "onProxyDomainsChanged: oldValue=" + list + ", newValue=" + list2);
        yae yae = (yae) this.a.getValue();
        synchronized (yae) {
            yae.g = list2;
        }
        if (!list2.isEmpty()) {
            ((pv3) this.b.getValue()).b("proxyDomains", o23.c0(list2, (String) null, (String) null, (String) null, (u16) null, 63));
        }
    }
}
