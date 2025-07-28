package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: as3  reason: default package */
public final class as3 extends sgc {
    public rr3 j;
    public int k;
    public String l;
    public boolean m;
    public boolean n;

    public as3() {
        this.e = 2;
    }

    public final void H(vgc vgc) {
        if (this.m) {
            vgc.a.setDetachFrozen(true);
        }
        super.H(vgc);
    }

    public final void J(int i, String str) {
        rr3 rr3 = this.j;
        if (rr3 != null && rr3.getRouter() != null) {
            this.j.getRouter().J(i, str);
        }
    }

    public final void M(String str, String[] strArr, int i) {
        rr3 rr3 = this.j;
        if (rr3 != null && rr3.getRouter() != null) {
            this.j.getRouter().M(str, strArr, i);
        }
    }

    public final void N(Bundle bundle) {
        super.N(bundle);
        this.k = bundle.getInt("ControllerHostedRouter.hostId");
        this.n = bundle.getBoolean("ControllerHostedRouter.boundToContainer");
        this.l = bundle.getString("ControllerHostedRouter.tag");
    }

    public final void O(Bundle bundle) {
        super.O(bundle);
        bundle.putInt("ControllerHostedRouter.hostId", this.k);
        bundle.putBoolean("ControllerHostedRouter.boundToContainer", this.n);
        bundle.putString("ControllerHostedRouter.tag", this.l);
    }

    public final void P(List list, wr3 wr3) {
        if (this.m) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((vgc) it.next()).a.setDetachFrozen(true);
            }
        }
        super.P(list, wr3);
    }

    public final void S(rr3 rr3) {
        rr3.setParentController(this.j);
        rr3.setRouter(this);
        rr3.onContextAvailable();
    }

    public final void T(Intent intent) {
        rr3 rr3 = this.j;
        if (rr3 != null && rr3.getRouter() != null) {
            this.j.getRouter().T(intent);
        }
    }

    public final void U(String str, Intent intent, int i) {
        rr3 rr3 = this.j;
        if (rr3 != null && rr3.getRouter() != null) {
            this.j.getRouter().U(str, intent, i);
        }
    }

    public final void V(String str, Intent intent, int i, Bundle bundle) {
        rr3 rr3 = this.j;
        if (rr3 != null && rr3.getRouter() != null) {
            this.j.getRouter().V(str, intent, i, bundle);
        }
    }

    public final void W(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        rr3 rr3 = this.j;
        if (rr3 != null && rr3.getRouter() != null) {
            this.j.getRouter().W(str, intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public final void Y(String str) {
        rr3 rr3 = this.j;
        if (rr3 != null && rr3.getRouter() != null) {
            this.j.getRouter().Y(str);
        }
    }

    public final void Z() {
        ViewGroup viewGroup = this.i;
        if (viewGroup != null && (viewGroup instanceof vr3)) {
            K((vr3) viewGroup);
        }
        Iterator it = new ArrayList(this.d).iterator();
        while (it.hasNext()) {
            rr3 rr3 = (rr3) it.next();
            if (rr3.getView() != null) {
                rr3.detach(rr3.getView(), true, false);
            }
        }
        Iterator it2 = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it2;
            if (!u1Var.hasNext()) {
                break;
            }
            vgc vgc = (vgc) u1Var.next();
            if (vgc.a.getView() != null) {
                rr3 rr32 = vgc.a;
                rr32.detach(rr32.getView(), true, false);
            }
        }
        this.g = false;
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
        }
        this.i = null;
    }

    public final void a0(boolean z) {
        this.m = z;
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                ((vgc) u1Var.next()).a.setDetachFrozen(z);
            } else {
                return;
            }
        }
    }

    public final void b0(rr3 rr3, ViewGroup viewGroup) {
        if (this.j != rr3 || this.i != viewGroup) {
            Z();
            if (viewGroup instanceof vr3) {
                a((vr3) viewGroup);
            }
            this.j = rr3;
            this.i = viewGroup;
            Q(rr3.onBackPressedDispatcherEnabled);
            Iterator it = this.a.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (u1Var.hasNext()) {
                    ((vgc) u1Var.next()).a.setParentController(rr3);
                } else {
                    this.i.post(new vp6(24, this));
                    return;
                }
            }
        }
    }

    public final void c(boolean z) {
        a0(false);
        super.c(z);
    }

    public final Activity d() {
        rr3 rr3 = this.j;
        if (rr3 != null) {
            return rr3.getActivity();
        }
        return null;
    }

    public final sgc i() {
        rr3 rr3 = this.j;
        return (rr3 == null || rr3.getRouter() == null) ? this : this.j.getRouter().i();
    }

    public final List j() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.j.getChildRouters());
        arrayList.addAll(this.j.getRouter().j());
        return arrayList;
    }

    public final ii5 k() {
        if (i() != this) {
            return i().k();
        }
        rr3 rr3 = this.j;
        throw new IllegalStateException("Unable to retrieve TransactionIndexer from ".concat(rr3 != null ? String.format(Locale.ENGLISH, "%s (attached? %b, destroyed? %b, parent: %s)", new Object[]{rr3.getClass().getSimpleName(), Boolean.valueOf(this.j.isAttached()), Boolean.valueOf(this.j.isBeingDestroyed), this.j.getParentController()}) : "null host controller"));
    }

    public final void o() {
        rr3 rr3 = this.j;
        if (rr3 != null && rr3.getRouter() != null) {
            this.j.getRouter().o();
        }
    }

    public final void p(Activity activity, boolean z) {
        super.p(activity, z);
        Z();
    }

    public final void y(vgc vgc, vgc vgc2, boolean z) {
        super.y(vgc, vgc2, z);
        if (vgc != null && !this.j.isAttached()) {
            if (vgc.b() == null || vgc.b().d()) {
                Iterator it = this.a.iterator();
                while (true) {
                    u1 u1Var = (u1) it;
                    if (u1Var.hasNext()) {
                        ((vgc) u1Var.next()).a.setNeedsAttach(false);
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
