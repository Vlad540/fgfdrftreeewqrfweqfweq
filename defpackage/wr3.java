package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.List;

/* renamed from: wr3  reason: default package */
public abstract class wr3 {
    public static final HashMap c = new HashMap();
    public boolean a;
    public boolean b;

    public wr3() {
        try {
            getClass().getConstructor((Class[]) null);
        } catch (Throwable unused) {
            throw new RuntimeException(getClass() + " does not have a default constructor.");
        }
    }

    public static final void c(tr3 tr3) {
        View view;
        ViewGroup viewGroup = tr3.d;
        if (viewGroup != null) {
            wr3 wr3 = tr3.e;
            if (wr3 == null) {
                wr3 = new bhd(true);
            } else if (wr3.b && !wr3.e()) {
                wr3 = wr3.b();
            }
            wr3 wr32 = wr3;
            wr32.b = true;
            HashMap hashMap = c;
            rr3 rr3 = tr3.a;
            rr3 rr32 = tr3.b;
            boolean z = tr3.c;
            if (rr32 != null) {
                if (z) {
                    swb.j(rr32.getInstanceId());
                } else {
                    sr3 sr3 = (sr3) hashMap.get(rr32.getInstanceId());
                    if (sr3 != null) {
                        boolean z2 = sr3.b;
                        wr3 wr33 = sr3.a;
                        if (z2) {
                            wr33.f(wr32, rr3);
                        } else {
                            wr33.a();
                        }
                        sr3 sr32 = (sr3) hashMap.remove(rr32.getInstanceId());
                    }
                }
            }
            if (rr3 != null) {
                hashMap.put(rr3.getInstanceId(), new sr3(wr32, z));
            }
            List<vr3> list = tr3.f;
            for (vr3 a2 : list) {
                a2.a(rr3, rr32, z);
            }
            xr3 xr3 = z ? xr3.PUSH_ENTER : xr3.POP_ENTER;
            xr3 xr32 = z ? xr3.PUSH_EXIT : xr3.POP_EXIT;
            View view2 = null;
            if (rr3 != null) {
                View inflate = rr3.inflate(viewGroup);
                rr3.changeStarted(wr32, xr3);
                view = inflate;
            } else {
                view = null;
            }
            if (rr32 != null) {
                view2 = rr32.getView();
                rr32.changeStarted(wr32, xr32);
            }
            wr32.g(viewGroup, view2, view, z, new ur3(rr32, wr32, xr32, rr3, list, view2, xr3, z, viewGroup));
        }
    }

    public void a() {
    }

    public wr3 b() {
        return swb.s(j());
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return false;
    }

    public void f(wr3 wr3, rr3 rr3) {
    }

    public abstract void g(ViewGroup viewGroup, View view, View view2, boolean z, ur3 ur3);

    public void h(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public final Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putString("ControllerChangeHandler.className", getClass().getName());
        Bundle bundle2 = new Bundle();
        i(bundle2);
        bundle.putBundle("ControllerChangeHandler.savedState", bundle2);
        return bundle;
    }
}
