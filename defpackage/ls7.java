package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: ls7  reason: default package */
public final class ls7 extends taf {
    public static final m0a A0 = new m0a(vtb.oneme_main_settings_title, new j0a(new ks7(1), new xz6(11)), k6a.j, ":settings", k6a.i);
    public static final m0a x0 = new m0a(l6a.a, new k0a(j6a.c), k6a.g, ":contact-list", k6a.f);
    public static final m0a y0 = new m0a(vtb.oneme_main_calls_title, new k0a(j6a.a), k6a.c, ":call-list", k6a.b);
    public static final m0a z0 = new m0a(vtb.oneme_main_chats_title, new j0a(new ks7(0), new xz6(10)), k6a.e, ":chat-list", k6a.d);
    public final grd X;
    public final t0c Y;
    public final hy5 Z = new hy5(14, this);
    public final ip b;
    public final List c;
    public m0a o;
    public final pj5 w0;

    public ls7(kp kpVar, qp0 qp0, String str) {
        Object obj;
        this.b = kpVar;
        m0a m0a = x0;
        m0a m0a2 = y0;
        m0a m0a3 = z0;
        List B = p23.B(new m0a[]{m0a, m0a2, m0a3, A0});
        this.c = B;
        this.o = m0a3;
        grd a = hrd.a(Boolean.valueOf(kpVar.c("app.messages.calls.menu.item", true)));
        this.X = a;
        this.Y = new t0c(a);
        this.w0 = qp0.c;
        Iterator it = B.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (hhd.f(((m0a) obj).d, str)) {
                break;
            }
        }
        m0a m0a4 = (m0a) obj;
        this.o = m0a4 != null ? m0a4 : m0a3;
        ip ipVar = this.b;
        hy5 hy5 = this.Z;
        kp kpVar2 = (kp) ipVar;
        kpVar2.getClass();
        jp jpVar = new jp(kpVar2, hy5);
        kpVar2.l.put(hy5, jpVar);
        kpVar2.g.registerOnSharedPreferenceChangeListener(jpVar);
    }

    public final void p() {
        kp kpVar = (kp) this.b;
        x97 x97 = kpVar.g;
        WeakHashMap weakHashMap = kpVar.l;
        hy5 hy5 = this.Z;
        x97.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) weakHashMap.get(hy5));
        weakHashMap.remove(hy5);
    }
}
