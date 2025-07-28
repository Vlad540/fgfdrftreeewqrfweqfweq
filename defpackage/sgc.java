package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: sgc  reason: default package */
public abstract class sgc {
    public final ie0 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public int e;
    public boolean f;
    public boolean g = false;
    public boolean h = false;
    public ViewGroup i;

    public sgc() {
        ie0 ie0 = new ie0();
        this.a = ie0;
        ie0.b = new rgc(0, this);
    }

    public static void b(sgc sgc, ArrayList arrayList) {
        sgc.getClass();
        ie0 ie0 = sgc.a;
        ArrayList arrayList2 = new ArrayList(ie0.a.size());
        Iterator c2 = ie0.c();
        while (c2.hasNext()) {
            arrayList2.add(((vgc) c2.next()).a);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            rr3 rr3 = (rr3) it.next();
            if (rr3.getView() != null) {
                arrayList.add(rr3.getView());
            }
            for (sgc b2 : rr3.getChildRouters()) {
                b(b2, arrayList);
            }
        }
    }

    public static ArrayList l(Iterator it, boolean z) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        while (it.hasNext()) {
            vgc vgc = (vgc) it.next();
            if (z2) {
                arrayList.add(vgc);
            }
            z2 = vgc.b() != null && !vgc.b().d();
            if (z && !z2) {
                break;
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public final void A() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i2 < arrayList.size()) {
                wr3.c((tr3) arrayList.get(i2));
                i2++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean B(rr3 rr3) {
        ct0.i();
        ie0 ie0 = this.a;
        vgc a2 = ie0.a();
        ArrayDeque arrayDeque = ie0.a;
        if (a2 == null || a2.a != rr3) {
            Iterator it = ie0.iterator();
            vgc vgc = null;
            wr3 b2 = a2 != null ? a2.b() : null;
            boolean z = b2 != null && !b2.d();
            vgc vgc2 = null;
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    break;
                }
                vgc vgc3 = (vgc) u1Var.next();
                rr3 rr32 = vgc3.a;
                if (rr32 == rr3) {
                    X(vgc3);
                    arrayDeque.remove(vgc3);
                    vgc2 = vgc3;
                } else if (vgc2 != null) {
                    if (z && !rr32.isAttached()) {
                        vgc = vgc3;
                    }
                }
            }
            if (vgc2 != null) {
                y(vgc, vgc2, false);
            }
        } else {
            X(ie0.b());
            y(ie0.a(), a2, false);
        }
        return this.e == 3 ? a2 != null : !arrayDeque.isEmpty();
    }

    public final boolean C() {
        ct0.i();
        vgc a2 = this.a.a();
        if (a2 != null) {
            return B(a2.a);
        }
        throw new IllegalStateException("Trying to pop the current controller when there are none on the backstack.");
    }

    public final void D(String str) {
        vgc vgc;
        ct0.i();
        ct0.i();
        Iterator it = this.a.iterator();
        do {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                vgc = (vgc) u1Var.next();
            } else {
                return;
            }
        } while (!str.equals(vgc.b));
        E(vgc);
    }

    public final void E(vgc vgc) {
        ie0 ie0 = this.a;
        if (ie0.a.size() > 0) {
            vgc a2 = ie0.a();
            ArrayList arrayList = new ArrayList();
            Iterator c2 = ie0.c();
            while (c2.hasNext()) {
                vgc vgc2 = (vgc) c2.next();
                arrayList.add(vgc2);
                if (vgc2 == vgc) {
                    break;
                }
            }
            wr3 overriddenPopHandler = a2.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = a2.d;
            }
            P(arrayList, overriddenPopHandler);
        }
    }

    public final void F() {
        this.c.clear();
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                vgc vgc = (vgc) u1Var.next();
                String instanceId = vgc.a.getInstanceId();
                HashMap hashMap = wr3.c;
                boolean j = swb.j(instanceId);
                rr3 rr3 = vgc.a;
                if (j) {
                    rr3.setNeedsAttach(true);
                }
                rr3.prepareForHostDetach();
            } else {
                return;
            }
        }
    }

    public final void G(vgc vgc) {
        ct0.i();
        vgc a2 = this.a.a();
        H(vgc);
        y(vgc, a2, true);
    }

    public void H(vgc vgc) {
        ie0 ie0 = this.a;
        ArrayDeque arrayDeque = ie0.a;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (hhd.f(((vgc) it.next()).a, vgc.a)) {
                    throw new IllegalStateException("Trying to push a controller that already exists on the backstack.");
                }
            }
        }
        ie0.a.push(vgc);
        rgc rgc = ie0.b;
        if (rgc != null) {
            rgc.d();
        }
    }

    public final void I() {
        ct0.i();
        ie0 ie0 = this.a;
        ArrayList arrayList = new ArrayList(ie0.a.size());
        Iterator c2 = ie0.c();
        while (c2.hasNext()) {
            arrayList.add((vgc) c2.next());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vgc vgc = (vgc) it.next();
            if (vgc.a.getNeedsAttach()) {
                z(vgc, (vgc) null, true, new bhd(false));
            } else {
                S(vgc.a);
            }
        }
    }

    public abstract void J(int i2, String str);

    public final void K(vr3 vr3) {
        this.b.remove(vr3);
    }

    public final void L(vgc vgc) {
        ct0.i();
        ie0 ie0 = this.a;
        vgc a2 = ie0.a();
        if (!ie0.a.isEmpty()) {
            X(ie0.b());
        }
        wr3 b2 = vgc.b();
        if (a2 != null) {
            boolean z = false;
            boolean z2 = a2.b() == null || a2.b().d();
            if (b2 == null || b2.d()) {
                z = true;
            }
            if (!z2 && z) {
                Iterator it = l(ie0.iterator(), true).iterator();
                while (it.hasNext()) {
                    z((vgc) null, (vgc) it.next(), true, b2);
                }
            }
        }
        H(vgc);
        if (b2 != null) {
            b2.a = true;
        }
        vgc.c(b2);
        y(vgc, a2, true);
    }

    public abstract void M(String str, String[] strArr, int i2);

    public void N(Bundle bundle) {
        this.e = hr1.w(3)[bundle.getInt("Router.popRootControllerMode")];
        this.f = bundle.getBoolean("Router.onBackPressedDispatcherEnabled");
        ie0 ie0 = this.a;
        ie0.getClass();
        ArrayList parcelableArrayList = ((Bundle) bundle.getParcelable("Router.backstack")).getParcelableArrayList("Backstack.entries");
        if (parcelableArrayList != null) {
            Collections.reverse(parcelableArrayList);
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                Bundle bundle2 = (Bundle) it.next();
                ArrayDeque arrayDeque = ie0.a;
                rr3 newInstance = rr3.newInstance(bundle2.getBundle("RouterTransaction.controller.bundle"));
                HashMap hashMap = wr3.c;
                wr3 s = swb.s(bundle2.getBundle("RouterTransaction.pushControllerChangeHandler"));
                wr3 s2 = swb.s(bundle2.getBundle("RouterTransaction.popControllerChangeHandler"));
                arrayDeque.push(new vgc(newInstance, bundle2.getString("RouterTransaction.tag"), s, s2, bundle2.getBoolean("RouterTransaction.attachedToRouter"), bundle2.getInt("RouterTransaction.transactionIndex")));
            }
        }
        rgc rgc = ie0.b;
        if (rgc != null) {
            rgc.d();
        }
        Iterator c2 = ie0.c();
        while (c2.hasNext()) {
            S(((vgc) c2.next()).a);
        }
    }

    public void O(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        ie0 ie0 = this.a;
        ie0.getClass();
        ArrayDeque arrayDeque = ie0.a;
        ArrayList arrayList = new ArrayList(arrayDeque.size());
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            vgc vgc = (vgc) it.next();
            vgc.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle("RouterTransaction.controller.bundle", vgc.a.saveInstanceState());
            wr3 wr3 = vgc.c;
            if (wr3 != null) {
                bundle3.putBundle("RouterTransaction.pushControllerChangeHandler", wr3.j());
            }
            wr3 wr32 = vgc.d;
            if (wr32 != null) {
                bundle3.putBundle("RouterTransaction.popControllerChangeHandler", wr32.j());
            }
            bundle3.putString("RouterTransaction.tag", vgc.b);
            bundle3.putInt("RouterTransaction.transactionIndex", vgc.f);
            bundle3.putBoolean("RouterTransaction.attachedToRouter", vgc.e);
            arrayList.add(bundle3);
        }
        bundle2.putParcelableArrayList("Backstack.entries", arrayList);
        bundle.putInt("Router.popRootControllerMode", hr1.t(this.e));
        bundle.putBoolean("Router.onBackPressedDispatcherEnabled", this.f);
        bundle.putParcelable("Router.backstack", bundle2);
    }

    public void P(List list, wr3 wr3) {
        boolean z;
        ct0.i();
        ArrayList e2 = e();
        ie0 ie0 = this.a;
        ArrayList l = l(ie0.iterator(), false);
        ArrayList arrayList = new ArrayList();
        Iterator it = l(ie0.iterator(), false).iterator();
        while (it.hasNext()) {
            vgc vgc = (vgc) it.next();
            if (vgc.a.getView() != null) {
                arrayList.add(vgc.a.getView());
            }
        }
        for (sgc sgc : j()) {
            if (sgc.i == this.i) {
                b(sgc, arrayList);
            }
        }
        for (int childCount = this.i.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.i.getChildAt(childCount);
            if (!arrayList.contains(childAt)) {
                this.i.removeView(childAt);
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            vgc vgc2 = (vgc) it2.next();
            ii5 k = k();
            if (vgc2.f == -1) {
                int i2 = k.b + 1;
                k.b = i2;
                vgc2.f = i2;
            }
            arrayList2.add(Integer.valueOf(vgc2.f));
        }
        Collections.sort(arrayList2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((vgc) list.get(i3)).f = ((Integer) arrayList2.get(i3)).intValue();
        }
        int i4 = 0;
        while (i4 < list.size()) {
            rr3 rr3 = ((vgc) list.get(i4)).a;
            i4++;
            int i5 = i4;
            while (true) {
                if (i5 < list.size()) {
                    if (((vgc) list.get(i5)).a != rr3) {
                        i5++;
                    } else {
                        throw new IllegalStateException("Trying to push the same controller to the backstack more than once.");
                    }
                }
            }
        }
        ArrayDeque arrayDeque = ie0.a;
        arrayDeque.clear();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayDeque.push((vgc) it3.next());
        }
        rgc rgc = ie0.b;
        if (rgc != null) {
            rgc.d();
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = e2.iterator();
        while (it4.hasNext()) {
            vgc vgc3 = (vgc) it4.next();
            Iterator it5 = list.iterator();
            while (true) {
                if (it5.hasNext()) {
                    if (vgc3.a == ((vgc) it5.next()).a) {
                        break;
                    }
                } else {
                    vgc3.a.isBeingDestroyed = true;
                    arrayList3.add(vgc3);
                    break;
                }
            }
        }
        Iterator c2 = ie0.c();
        while (c2.hasNext()) {
            vgc vgc4 = (vgc) c2.next();
            vgc4.e = true;
            S(vgc4.a);
        }
        if (list.size() > 0) {
            ArrayList arrayList4 = new ArrayList(list);
            Collections.reverse(arrayList4);
            ArrayList l2 = l(arrayList4.iterator(), false);
            boolean z2 = l2.size() <= 0 || !e2.contains(l2.get(0));
            if (l2.size() == l.size()) {
                int i6 = 0;
                while (true) {
                    if (i6 >= l.size()) {
                        z = true;
                        break;
                    } else if (((vgc) l.get(i6)).a != ((vgc) l2.get(i6)).a) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            z = false;
            if (!z) {
                vgc vgc5 = l.size() > 0 ? (vgc) l.get(0) : null;
                vgc vgc6 = (vgc) l2.get(0);
                if (vgc5 == null || vgc5.a != vgc6.a) {
                    if (vgc5 != null) {
                        String instanceId = vgc5.a.getInstanceId();
                        HashMap hashMap = wr3.c;
                        swb.j(instanceId);
                    }
                    z(vgc6, vgc5, z2, wr3);
                }
                for (int size = l.size() - 1; size > 0; size--) {
                    vgc vgc7 = (vgc) l.get(size);
                    if (!l2.contains(vgc7)) {
                        wr3 b2 = wr3 != null ? wr3.b() : new bhd();
                        b2.a = true;
                        swb.j(vgc7.a.getInstanceId());
                        if (vgc7.a.view != null) {
                            z((vgc) null, vgc7, z2, b2);
                        }
                    }
                }
                for (int i7 = 1; i7 < l2.size(); i7++) {
                    vgc vgc8 = (vgc) l2.get(i7);
                    if (!l.contains(vgc8)) {
                        z(vgc8, (vgc) l2.get(i7 - 1), true, vgc8.b());
                    }
                }
            }
        } else {
            for (int size2 = l.size() - 1; size2 >= 0; size2--) {
                vgc vgc9 = (vgc) l.get(size2);
                wr3 b3 = wr3 != null ? wr3.b() : new bhd();
                String instanceId2 = vgc9.a.getInstanceId();
                HashMap hashMap2 = wr3.c;
                swb.j(instanceId2);
                z((vgc) null, vgc9, false, b3);
            }
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            vgc vgc10 = (vgc) it6.next();
            Iterator it7 = this.c.iterator();
            boolean z3 = false;
            while (it7.hasNext()) {
                if (((tr3) it7.next()).b == vgc10.a) {
                    z3 = true;
                }
            }
            if (!z3) {
                vgc10.a.destroy();
            }
        }
    }

    public final void Q(boolean z) {
        this.a.getSize();
        this.f = z;
    }

    public final void R(vgc vgc) {
        ct0.i();
        P(Collections.singletonList(vgc), vgc.b());
    }

    public void S(rr3 rr3) {
        rr3.setRouter(this);
        rr3.onContextAvailable();
    }

    public abstract void T(Intent intent);

    public abstract void U(String str, Intent intent, int i2);

    public abstract void V(String str, Intent intent, int i2, Bundle bundle);

    public abstract void W(String str, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle);

    public final void X(vgc vgc) {
        if (!vgc.a.isDestroyed()) {
            ArrayList arrayList = this.d;
            rr3 rr3 = vgc.a;
            arrayList.add(rr3);
            rr3.addLifecycleListener(new o63(4, this));
        }
    }

    public abstract void Y(String str);

    public final void a(vr3 vr3) {
        ArrayList arrayList = this.b;
        if (!arrayList.contains(vr3)) {
            arrayList.add(vr3);
        }
    }

    public void c(boolean z) {
        this.e = 3;
        ie0 ie0 = this.a;
        ie0.getClass();
        ArrayList arrayList = new ArrayList();
        while (!ie0.a.isEmpty()) {
            arrayList.add(ie0.b());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            X((vgc) it.next());
        }
        vgc vgc = null;
        if (z && arrayList.size() > 0) {
            vgc vgc2 = (vgc) arrayList.get(0);
            vgc2.a.addLifecycleListener(new vha((as3) this, arrayList));
            wr3 overriddenPopHandler = vgc2.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = vgc2.d;
            }
            z((vgc) null, vgc2, false, overriddenPopHandler);
            vgc = vgc2;
        }
        if (arrayList.size() > 0) {
            ik9 ik9 = new ik9();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                vgc vgc3 = (vgc) it2.next();
                if (vgc3 != vgc) {
                    rr3 rr3 = vgc3.a;
                    xr3 xr3 = xr3.POP_EXIT;
                    rr3.changeStarted(ik9, xr3);
                    vgc3.a.changeEnded(ik9, xr3);
                }
            }
        }
    }

    public abstract Activity d();

    public final ArrayList e() {
        ie0 ie0 = this.a;
        ArrayList arrayList = new ArrayList(ie0.a.size());
        Iterator c2 = ie0.c();
        while (c2.hasNext()) {
            arrayList.add((vgc) c2.next());
        }
        return arrayList;
    }

    public final rr3 f(String str) {
        rr3 findController;
        Iterator it = this.a.iterator();
        do {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return null;
            }
            findController = ((vgc) u1Var.next()).a.findController(str);
        } while (findController == null);
        return findController;
    }

    public final rr3 g(String str) {
        vgc vgc;
        Iterator it = this.a.iterator();
        do {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return null;
            }
            vgc = (vgc) u1Var.next();
        } while (!str.equals(vgc.b));
        return vgc.a;
    }

    public final ex9 h() {
        Activity d2 = d();
        if (d2 instanceof e83) {
            return ((e83) d2).E();
        }
        return null;
    }

    public abstract sgc i();

    public abstract List j();

    public abstract ii5 k();

    public final boolean m() {
        ie0 ie0 = this.a;
        if (ie0.a.isEmpty()) {
            return false;
        }
        if (ie0.a().a.handleBack()) {
            return true;
        }
        return (ie0.a.size() > 1 || this.e != 1) && C();
    }

    public final boolean n() {
        return this.a.getSize() > 0;
    }

    public abstract void o();

    public void p(Activity activity, boolean z) {
        this.g = false;
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
        }
        this.b.clear();
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                break;
            }
            vgc vgc = (vgc) u1Var.next();
            vgc.a.activityDestroyed(activity);
            for (sgc p : vgc.a.getChildRouters()) {
                p.p(activity, z);
            }
        }
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            rr3 rr3 = (rr3) arrayList.get(size);
            rr3.activityDestroyed(activity);
            for (sgc p2 : rr3.getChildRouters()) {
                p2.p(activity, z);
            }
        }
        this.i = null;
    }

    public final void q(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                vgc vgc = (vgc) u1Var.next();
                vgc.a.activityPaused(activity);
                for (sgc q : vgc.a.getChildRouters()) {
                    q.q(activity);
                }
            } else {
                return;
            }
        }
    }

    public final void r(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                vgc vgc = (vgc) u1Var.next();
                vgc.a.activityResumed(activity);
                for (sgc r : vgc.a.getChildRouters()) {
                    r.r(activity);
                }
            } else {
                return;
            }
        }
    }

    public final void s(Activity activity) {
        this.h = false;
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                vgc vgc = (vgc) u1Var.next();
                vgc.a.activityStarted(activity);
                for (sgc s : vgc.a.getChildRouters()) {
                    s.s(activity);
                }
            } else {
                return;
            }
        }
    }

    public final void t(Activity activity) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                vgc vgc = (vgc) u1Var.next();
                vgc.a.activityStopped(activity);
                for (sgc t : vgc.a.getChildRouters()) {
                    t.t(activity);
                }
            } else {
                this.h = true;
                return;
            }
        }
    }

    public void u() {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                ((vgc) u1Var.next()).a.onContextAvailable();
            } else {
                return;
            }
        }
    }

    public final void v(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                vgc vgc = (vgc) u1Var.next();
                vgc.a.createOptionsMenu(menu, menuInflater);
                for (sgc v : vgc.a.getChildRouters()) {
                    v.v(menu, menuInflater);
                }
            } else {
                return;
            }
        }
    }

    public final boolean w(MenuItem menuItem) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return false;
            }
            vgc vgc = (vgc) u1Var.next();
            if (vgc.a.optionsItemSelected(menuItem)) {
                return true;
            }
            Iterator<sgc> it2 = vgc.a.getChildRouters().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().w(menuItem)) {
                        return true;
                    }
                }
            }
        }
    }

    public final void x(Menu menu) {
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (u1Var.hasNext()) {
                vgc vgc = (vgc) u1Var.next();
                vgc.a.prepareOptionsMenu(menu);
                for (sgc x : vgc.a.getChildRouters()) {
                    x.x(menu);
                }
            } else {
                return;
            }
        }
    }

    public void y(vgc vgc, vgc vgc2, boolean z) {
        wr3 wr3;
        if (z && vgc != null) {
            vgc.e = true;
        }
        if (z) {
            wr3 = vgc.b();
        } else if (vgc2 != null) {
            wr3 = vgc2.a.getOverriddenPopHandler();
            if (wr3 == null) {
                wr3 = vgc2.d;
            }
        } else {
            wr3 = null;
        }
        z(vgc, vgc2, z, wr3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r0.isAttached() == false) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(defpackage.vgc r12, defpackage.vgc r13, boolean r14, defpackage.wr3 r15) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L_0x0006
            rr3 r1 = r12.a
            goto L_0x0007
        L_0x0006:
            r1 = r0
        L_0x0007:
            if (r13 == 0) goto L_0x000b
            rr3 r0 = r13.a
        L_0x000b:
            r13 = 1
            r9 = 0
            if (r12 == 0) goto L_0x0023
            ii5 r2 = r11.k()
            int r3 = r12.f
            r4 = -1
            if (r3 != r4) goto L_0x001f
            int r3 = r2.b
            int r3 = r3 + r13
            r2.b = r3
            r12.f = r3
        L_0x001f:
            r11.S(r1)
            goto L_0x0044
        L_0x0023:
            ie0 r12 = r11.a
            java.util.ArrayDeque r12 = r12.a
            int r12 = r12.size()
            if (r12 != 0) goto L_0x0039
            int r12 = r11.e
            r2 = 2
            if (r12 != r2) goto L_0x0039
            ik9 r15 = new ik9
            r15.<init>()
        L_0x0037:
            r12 = r13
            goto L_0x0045
        L_0x0039:
            if (r14 != 0) goto L_0x0044
            if (r0 == 0) goto L_0x0044
            boolean r12 = r0.isAttached()
            if (r12 != 0) goto L_0x0044
            goto L_0x0037
        L_0x0044:
            r12 = r9
        L_0x0045:
            if (r14 == 0) goto L_0x0071
            if (r1 == 0) goto L_0x0071
            boolean r2 = r1.isDestroyed()
            if (r2 != 0) goto L_0x0050
            goto L_0x0071
        L_0x0050:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Trying to push a controller that has already been destroyed. ("
            r12.<init>(r13)
            java.lang.Class r13 = r1.getClass()
            java.lang.String r13 = r13.getSimpleName()
            r12.append(r13)
            java.lang.String r13 = ")"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0071:
            tr3 r10 = new tr3
            android.view.ViewGroup r6 = r11.i
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList r2 = r11.b
            r8.<init>(r2)
            r2 = r10
            r3 = r1
            r4 = r0
            r5 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.ArrayList r14 = r11.c
            int r2 = r14.size()
            if (r2 <= 0) goto L_0x0095
            if (r1 == 0) goto L_0x0091
            r1.setNeedsAttach(r13)
        L_0x0091:
            r14.add(r10)
            goto L_0x00bc
        L_0x0095:
            if (r0 == 0) goto L_0x00b9
            if (r15 == 0) goto L_0x009f
            boolean r15 = r15.d()
            if (r15 == 0) goto L_0x00b9
        L_0x009f:
            boolean r15 = r11.g
            if (r15 != 0) goto L_0x00b9
            if (r1 == 0) goto L_0x00a8
            r1.setNeedsAttach(r13)
        L_0x00a8:
            r14.add(r10)
            android.view.ViewGroup r14 = r11.i
            if (r14 == 0) goto L_0x00bc
            pzb r15 = new pzb
            r1 = 5
            r15.<init>(r1, r11)
            r14.post(r15)
            goto L_0x00bc
        L_0x00b9:
            defpackage.wr3.c(r10)
        L_0x00bc:
            if (r12 == 0) goto L_0x00d1
            if (r0 == 0) goto L_0x00d1
            android.view.View r11 = r0.getView()
            if (r11 == 0) goto L_0x00ce
            android.view.View r11 = r0.getView()
            r0.detach(r11, r13, r9)
            goto L_0x00d1
        L_0x00ce:
            r0.destroy()
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sgc.z(vgc, vgc, boolean, wr3):void");
    }
}
