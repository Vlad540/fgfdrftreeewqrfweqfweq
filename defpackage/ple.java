package defpackage;

import android.os.Parcel;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ple  reason: default package */
public final class ple implements nl8, n8c {
    public final Object a;

    public /* synthetic */ ple(Object obj) {
        this.a = obj;
    }

    public void a(String str) {
        eef eef = ((def) this.a).b;
        eef.getClass();
        eef.q.n("handleWebSocketClosed, reason=" + str);
        eef.d();
    }

    public void accept(Object obj, Object obj2) {
        vde vde = (vde) obj2;
        v2g v2g = (v2g) obj;
        pm7 pm7 = (pm7) this.a;
        a24.h("locationSettingsRequest can't be null", pm7 != null);
        g6g g6g = (g6g) v2g.o();
        r2g r2g = new r2g(0, vde);
        Parcel G0 = g6g.G0();
        t1g.b(G0, pm7);
        G0.writeStrongBinder(r2g);
        G0.writeString((String) null);
        g6g.H0(G0, 63);
    }

    public void b() {
        eef eef = ((def) this.a).b;
        eef.q.n("handleWebSocketOpen");
        eef.n.onConnected();
        lv1 lv1 = eef.m;
        if (lv1 != null) {
            synchronized (((mfd) lv1.b).f) {
                try {
                    mfd mfd = (mfd) lv1.b;
                    if (mfd.q) {
                        mfd.t = mfd.s;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean d(pl8 pl8, MenuItem menuItem) {
        nl8 nl8 = ((Toolbar) this.a).g1;
        return nl8 != null && nl8.d(pl8, menuItem);
    }

    public void r(pl8 pl8) {
        Toolbar toolbar = (Toolbar) this.a;
        i7 i7Var = toolbar.a.w0;
        if (i7Var == null || !i7Var.j()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.Y0.b).iterator();
            while (it.hasNext()) {
                ((mx5) it.next()).a.t(pl8);
            }
        }
        nl8 nl8 = toolbar.g1;
        if (nl8 != null) {
            nl8.r(pl8);
        }
    }
}
