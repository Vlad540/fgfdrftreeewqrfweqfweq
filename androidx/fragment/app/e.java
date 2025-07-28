package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.strictmode.Violation;
import androidx.loader.app.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

public final class e {
    public final mn a;
    public final f b;
    public final a c;
    public boolean d = false;
    public int e = -1;

    public e(mn mnVar, f fVar, a aVar) {
        this.a = mnVar;
        this.b = fVar;
        this.c = aVar;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        Bundle bundle = aVar.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        aVar.L0.S();
        aVar.a = 3;
        aVar.W0 = false;
        aVar.s0(bundle2);
        if (aVar.W0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                aVar.toString();
            }
            if (aVar.Y0 != null) {
                Bundle bundle3 = aVar.b;
                Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                SparseArray sparseArray = aVar.c;
                if (sparseArray != null) {
                    aVar.Y0.restoreHierarchyState(sparseArray);
                    aVar.c = null;
                }
                aVar.W0 = false;
                aVar.Q0(bundle4);
                if (!aVar.W0) {
                    throw new AndroidRuntimeException(me4.h("Fragment ", aVar, " did not call through to super.onViewStateRestored()"));
                } else if (aVar.Y0 != null) {
                    aVar.i1.a(nb7.ON_CREATE);
                }
            }
            aVar.b = null;
            vx5 vx5 = aVar.L0;
            vx5.H = false;
            vx5.I = false;
            vx5.O.g = false;
            vx5.u(4);
            this.a.w(aVar, false);
            return;
        }
        throw new AndroidRuntimeException(me4.h("Fragment ", aVar, " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        a aVar;
        View view;
        View view2;
        int i = -1;
        a aVar2 = this.c;
        View view3 = aVar2.X0;
        while (true) {
            aVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(sqb.fragment_container_view_tag);
            a aVar3 = tag instanceof a ? (a) tag : null;
            if (aVar3 != null) {
                aVar = aVar3;
                break;
            } else {
                ViewParent parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        a aVar4 = aVar2.M0;
        if (aVar != null && !aVar.equals(aVar4)) {
            int i2 = aVar2.O0;
            by5 by5 = cy5.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(aVar2);
            sb.append(" within the view of parent fragment ");
            sb.append(aVar);
            sb.append(" via container with ID ");
            cy5.b(new Violation(aVar2, wn6.j(sb, i2, " without using parent's childFragmentManager")));
            cy5.a(aVar2).getClass();
        }
        f fVar = this.b;
        fVar.getClass();
        ViewGroup viewGroup = aVar2.X0;
        if (viewGroup != null) {
            ArrayList arrayList = fVar.a;
            int indexOf = arrayList.indexOf(aVar2);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        a aVar5 = (a) arrayList.get(indexOf);
                        if (aVar5.X0 == viewGroup && (view = aVar5.Y0) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    a aVar6 = (a) arrayList.get(i3);
                    if (aVar6.X0 == viewGroup && (view2 = aVar6.Y0) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        aVar2.X0.addView(aVar2.Y0, i);
    }

    public final void c() {
        e eVar;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        a aVar2 = aVar.w0;
        f fVar = this.b;
        if (aVar2 != null) {
            eVar = (e) fVar.b.get(aVar2.Y);
            if (eVar != null) {
                aVar.x0 = aVar.w0.Y;
                aVar.w0 = null;
            } else {
                throw new IllegalStateException("Fragment " + aVar + " declared target fragment " + aVar.w0 + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = aVar.x0;
            if (str != null) {
                eVar = (e) fVar.b.get(str);
                if (eVar == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(aVar);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(wn6.l(sb, aVar.x0, " that does not belong to this FragmentManager!"));
                }
            } else {
                eVar = null;
            }
        }
        if (eVar != null) {
            eVar.k();
        }
        c cVar = aVar.J0;
        aVar.K0 = cVar.w;
        aVar.M0 = cVar.y;
        mn mnVar = this.a;
        mnVar.C(aVar, false);
        ArrayList arrayList = aVar.m1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar3 = ((cx5) it.next()).a;
            aVar3.l1.s();
            gp0.h(aVar3);
            Bundle bundle = aVar3.b;
            aVar3.l1.t(bundle != null ? bundle.getBundle("registryState") : null);
        }
        arrayList.clear();
        aVar.L0.b(aVar.K0, aVar.Z(), aVar);
        aVar.a = 0;
        aVar.W0 = false;
        aVar.v0(aVar.K0.B0);
        if (aVar.W0) {
            Iterator it2 = aVar.J0.p.iterator();
            while (it2.hasNext()) {
                ((xx5) it2.next()).a(aVar);
            }
            vx5 vx5 = aVar.L0;
            vx5.H = false;
            vx5.I = false;
            vx5.O.g = false;
            vx5.u(0);
            mnVar.x(aVar, false);
            return;
        }
        throw new AndroidRuntimeException(me4.h("Fragment ", aVar, " did not call through to super.onAttach()"));
    }

    public final int d() {
        xa4 xa4;
        a aVar = this.c;
        if (aVar.J0 == null) {
            return aVar.a;
        }
        int i = this.e;
        int ordinal = aVar.g1.ordinal();
        int i2 = 0;
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (aVar.D0) {
            if (aVar.E0) {
                i = Math.max(this.e, 2);
                View view = aVar.Y0;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, aVar.a) : Math.min(i, 1);
            }
        }
        if (aVar.F0 && aVar.X0 == null) {
            i = Math.min(i, 4);
        }
        if (!aVar.A0) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = aVar.X0;
        if (viewGroup != null) {
            aVar.g0().K();
            Object tag = viewGroup.getTag(sqb.special_effects_controller_view_tag);
            if (tag instanceof xa4) {
                xa4 = (xa4) tag;
            } else {
                xa4 = new xa4(viewGroup);
                viewGroup.setTag(sqb.special_effects_controller_view_tag, xa4);
            }
            xa4.getClass();
            jmd f = xa4.f(aVar);
            int i3 = f != null ? f.b : 0;
            jmd g = xa4.g(aVar);
            if (g != null) {
                i2 = g.b;
            }
            int i4 = i3 == 0 ? -1 : kmd.$EnumSwitchMapping$0[hr1.t(i3)];
            if (!(i4 == -1 || i4 == 1)) {
                i2 = i3;
            }
        }
        if (i2 == 2) {
            i = Math.min(i, 6);
        } else if (i2 == 3) {
            i = Math.max(i, 3);
        } else if (aVar.B0) {
            i = aVar.r0() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (aVar.Z0 && aVar.a < 5) {
            i = Math.min(i, 4);
        }
        if (aVar.C0) {
            i = Math.max(i, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
        }
        return i;
    }

    public final void e() {
        Bundle bundle;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        Bundle bundle2 = aVar.b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (!aVar.e1) {
            mn mnVar = this.a;
            mnVar.D(aVar, false);
            aVar.L0.S();
            aVar.a = 1;
            aVar.W0 = false;
            aVar.h1.a(new d6c(4, aVar));
            aVar.w0(bundle3);
            aVar.e1 = true;
            if (aVar.W0) {
                aVar.h1.d(nb7.ON_CREATE);
                mnVar.y(aVar, false);
                return;
            }
            throw new AndroidRuntimeException(me4.h("Fragment ", aVar, " did not call through to super.onCreate()"));
        }
        aVar.a = 1;
        Bundle bundle4 = aVar.b;
        if (bundle4 != null && (bundle = bundle4.getBundle("childFragmentManager")) != null) {
            aVar.L0.Z(bundle);
            vx5 vx5 = aVar.L0;
            vx5.H = false;
            vx5.I = false;
            vx5.O.g = false;
            vx5.u(1);
        }
    }

    public final void f() {
        String str;
        a aVar = this.c;
        if (!aVar.D0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            Bundle bundle = aVar.b;
            Bundle bundle2 = null;
            Bundle bundle3 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater D0 = aVar.D0(bundle3);
            aVar.d1 = D0;
            ViewGroup viewGroup = aVar.X0;
            if (viewGroup == null) {
                int i = aVar.O0;
                if (i == 0) {
                    viewGroup = null;
                } else if (i != -1) {
                    viewGroup = (ViewGroup) aVar.J0.x.O(i);
                    if (viewGroup == null) {
                        if (!aVar.G0 && !aVar.F0) {
                            try {
                                str = aVar.h0().getResourceName(aVar.O0);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(aVar.O0) + " (" + str + ") for fragment " + aVar);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        by5 by5 = cy5.a;
                        cy5.b(new Violation(aVar, "Attempting to add fragment " + aVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        cy5.a(aVar).getClass();
                    }
                } else {
                    throw new IllegalArgumentException(me4.h("Cannot create fragment ", aVar, " for a container view with no id"));
                }
            }
            aVar.X0 = viewGroup;
            aVar.R0(D0, viewGroup, bundle3);
            if (aVar.Y0 != null) {
                if (Log.isLoggable("FragmentManager", 3)) {
                    Objects.toString(aVar);
                }
                aVar.Y0.setSaveFromParentEnabled(false);
                aVar.Y0.setTag(sqb.fragment_container_view_tag, aVar);
                if (viewGroup != null) {
                    b();
                }
                if (aVar.Q0) {
                    aVar.Y0.setVisibility(8);
                }
                if (aVar.Y0.isAttachedToWindow()) {
                    View view = aVar.Y0;
                    WeakHashMap weakHashMap = eaf.a;
                    r9f.c(view);
                } else {
                    View view2 = aVar.Y0;
                    view2.addOnAttachStateChangeListener(new ef(view2, 1));
                }
                Bundle bundle4 = aVar.b;
                if (bundle4 != null) {
                    bundle2 = bundle4.getBundle("savedInstanceState");
                }
                aVar.P0(aVar.Y0, bundle2);
                aVar.L0.u(2);
                this.a.I(aVar, aVar.Y0, false);
                int visibility = aVar.Y0.getVisibility();
                aVar.b0().j = aVar.Y0.getAlpha();
                if (aVar.X0 != null && visibility == 0) {
                    View findFocus = aVar.Y0.findFocus();
                    if (findFocus != null) {
                        aVar.b0().k = findFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            findFocus.toString();
                            Objects.toString(aVar);
                        }
                    }
                    aVar.Y0.setAlpha(0.0f);
                }
            }
            aVar.a = 2;
        }
    }

    public final void g() {
        a b2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        boolean z = true;
        boolean z2 = aVar.B0 && !aVar.r0();
        f fVar = this.b;
        if (z2) {
            fVar.i(aVar.Y, (Bundle) null);
        }
        if (!z2) {
            FragmentManagerViewModel fragmentManagerViewModel = fVar.d;
            if (!((fragmentManagerViewModel.b.containsKey(aVar.Y) && fragmentManagerViewModel.e) ? fragmentManagerViewModel.f : true)) {
                String str = aVar.x0;
                if (!(str == null || (b2 = fVar.b(str)) == null || !b2.S0)) {
                    aVar.w0 = b2;
                }
                aVar.a = 0;
                return;
            }
        }
        hx5 hx5 = aVar.K0;
        if (hx5 instanceof cbf) {
            z = fVar.d.f;
        } else {
            Context context = hx5.B0;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z2 || z) {
            FragmentManagerViewModel fragmentManagerViewModel2 = fVar.d;
            fragmentManagerViewModel2.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            fragmentManagerViewModel2.f(aVar.Y, false);
        }
        aVar.L0.l();
        aVar.h1.d(nb7.ON_DESTROY);
        aVar.a = 0;
        aVar.W0 = false;
        aVar.e1 = false;
        aVar.z0();
        if (aVar.W0) {
            this.a.z(aVar, false);
            Iterator it = fVar.d().iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar != null) {
                    String str2 = aVar.Y;
                    a aVar2 = eVar.c;
                    if (str2.equals(aVar2.x0)) {
                        aVar2.w0 = aVar;
                        aVar2.x0 = null;
                    }
                }
            }
            String str3 = aVar.x0;
            if (str3 != null) {
                aVar.w0 = fVar.b(str3);
            }
            fVar.h(this);
            return;
        }
        throw new AndroidRuntimeException(me4.h("Fragment ", aVar, " did not call through to super.onDestroy()"));
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        ViewGroup viewGroup = aVar.X0;
        if (!(viewGroup == null || (view = aVar.Y0) == null)) {
            viewGroup.removeView(view);
        }
        aVar.L0.u(1);
        if (aVar.Y0 != null) {
            fy5 fy5 = aVar.i1;
            fy5.b();
            if (fy5.X.d.a(ob7.c)) {
                aVar.i1.a(nb7.ON_DESTROY);
            }
        }
        aVar.a = 1;
        aVar.W0 = false;
        aVar.A0();
        if (aVar.W0) {
            new b(aVar, aVar.v()).c();
            aVar.H0 = false;
            this.a.J(aVar, false);
            aVar.X0 = null;
            aVar.Y0 = null;
            aVar.i1 = null;
            aVar.j1.k((Object) null);
            aVar.E0 = false;
            return;
        }
        throw new AndroidRuntimeException(me4.h("Fragment ", aVar, " did not call through to super.onDestroyView()"));
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [vx5, androidx.fragment.app.c] */
    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        aVar.a = -1;
        aVar.W0 = false;
        aVar.C0();
        aVar.d1 = null;
        if (aVar.W0) {
            vx5 vx5 = aVar.L0;
            if (!vx5.J) {
                vx5.l();
                aVar.L0 = new c();
            }
            this.a.A(aVar, false);
            aVar.a = -1;
            aVar.K0 = null;
            aVar.M0 = null;
            aVar.J0 = null;
            if (!aVar.B0 || aVar.r0()) {
                FragmentManagerViewModel fragmentManagerViewModel = this.b.d;
                boolean z = true;
                if (fragmentManagerViewModel.b.containsKey(aVar.Y) && fragmentManagerViewModel.e) {
                    z = fragmentManagerViewModel.f;
                }
                if (!z) {
                    return;
                }
            }
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            aVar.o0();
            return;
        }
        throw new AndroidRuntimeException(me4.h("Fragment ", aVar, " did not call through to super.onDetach()"));
    }

    public final void j() {
        a aVar = this.c;
        if (aVar.D0 && aVar.E0 && !aVar.H0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            Bundle bundle = aVar.b;
            Bundle bundle2 = null;
            Bundle bundle3 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater D0 = aVar.D0(bundle3);
            aVar.d1 = D0;
            aVar.R0(D0, (ViewGroup) null, bundle3);
            View view = aVar.Y0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                aVar.Y0.setTag(sqb.fragment_container_view_tag, aVar);
                if (aVar.Q0) {
                    aVar.Y0.setVisibility(8);
                }
                Bundle bundle4 = aVar.b;
                if (bundle4 != null) {
                    bundle2 = bundle4.getBundle("savedInstanceState");
                }
                aVar.P0(aVar.Y0, bundle2);
                aVar.L0.u(2);
                this.a.I(aVar, aVar.Y0, false);
                aVar.a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        xa4 xa4;
        ViewGroup viewGroup2;
        xa4 xa42;
        ViewGroup viewGroup3;
        xa4 xa43;
        f fVar = this.b;
        boolean z = this.d;
        a aVar = this.c;
        if (!z) {
            try {
                this.d = true;
                boolean z2 = false;
                while (true) {
                    int d2 = d();
                    int i = aVar.a;
                    int i2 = 3;
                    if (d2 != i) {
                        if (d2 <= i) {
                            switch (i - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    aVar.a = 1;
                                    break;
                                case 2:
                                    aVar.E0 = false;
                                    aVar.a = 2;
                                    break;
                                case 3:
                                    if (Log.isLoggable("FragmentManager", 3)) {
                                        Objects.toString(aVar);
                                    }
                                    if (aVar.Y0 != null && aVar.c == null) {
                                        p();
                                    }
                                    if (!(aVar.Y0 == null || (viewGroup2 = aVar.X0) == null)) {
                                        aVar.g0().K();
                                        Object tag = viewGroup2.getTag(sqb.special_effects_controller_view_tag);
                                        if (tag instanceof xa4) {
                                            xa42 = (xa4) tag;
                                        } else {
                                            xa42 = new xa4(viewGroup2);
                                            viewGroup2.setTag(sqb.special_effects_controller_view_tag, xa42);
                                        }
                                        if (Log.isLoggable("FragmentManager", 2)) {
                                            xa42.getClass();
                                            Objects.toString(aVar);
                                        }
                                        xa42.d(1, 3, this);
                                    }
                                    aVar.a = 3;
                                    break;
                                case 4:
                                    r();
                                    break;
                                case 5:
                                    aVar.a = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(aVar.Y0 == null || (viewGroup3 = aVar.X0) == null)) {
                                        aVar.g0().K();
                                        Object tag2 = viewGroup3.getTag(sqb.special_effects_controller_view_tag);
                                        if (tag2 instanceof xa4) {
                                            xa43 = (xa4) tag2;
                                        } else {
                                            xa43 = new xa4(viewGroup3);
                                            viewGroup3.setTag(sqb.special_effects_controller_view_tag, xa43);
                                        }
                                        int visibility = aVar.Y0.getVisibility();
                                        if (visibility == 0) {
                                            i2 = 2;
                                        } else if (visibility == 4) {
                                            i2 = 4;
                                        } else if (visibility != 8) {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                        if (Log.isLoggable("FragmentManager", 2)) {
                                            xa43.getClass();
                                            Objects.toString(aVar);
                                        }
                                        xa43.d(i2, 2, this);
                                    }
                                    aVar.a = 4;
                                    break;
                                case 5:
                                    q();
                                    break;
                                case 6:
                                    aVar.a = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                        z2 = true;
                    } else {
                        if (!z2 && i == -1 && aVar.B0 && !aVar.r0()) {
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(aVar);
                            }
                            FragmentManagerViewModel fragmentManagerViewModel = fVar.d;
                            fragmentManagerViewModel.getClass();
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(aVar);
                            }
                            fragmentManagerViewModel.f(aVar.Y, true);
                            fVar.h(this);
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(aVar);
                            }
                            aVar.o0();
                        }
                        if (aVar.c1) {
                            if (!(aVar.Y0 == null || (viewGroup = aVar.X0) == null)) {
                                aVar.g0().K();
                                Object tag3 = viewGroup.getTag(sqb.special_effects_controller_view_tag);
                                if (tag3 instanceof xa4) {
                                    xa4 = (xa4) tag3;
                                } else {
                                    xa4 = new xa4(viewGroup);
                                    viewGroup.setTag(sqb.special_effects_controller_view_tag, xa4);
                                }
                                if (aVar.Q0) {
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        xa4.getClass();
                                        Objects.toString(aVar);
                                    }
                                    xa4.d(3, 1, this);
                                } else {
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        xa4.getClass();
                                        Objects.toString(aVar);
                                    }
                                    xa4.d(2, 1, this);
                                }
                            }
                            c cVar = aVar.J0;
                            if (cVar != null && aVar.A0 && c.M(aVar)) {
                                cVar.G = true;
                            }
                            aVar.c1 = false;
                            aVar.E0(aVar.Q0);
                            aVar.L0.o();
                        }
                        this.d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        aVar.L0.u(5);
        if (aVar.Y0 != null) {
            aVar.i1.a(nb7.ON_PAUSE);
        }
        aVar.h1.d(nb7.ON_PAUSE);
        aVar.a = 6;
        aVar.W0 = false;
        aVar.I0();
        if (aVar.W0) {
            this.a.B(aVar, false);
            return;
        }
        throw new AndroidRuntimeException(me4.h("Fragment ", aVar, " did not call through to super.onPause()"));
    }

    public final void m(ClassLoader classLoader) {
        a aVar = this.c;
        Bundle bundle = aVar.b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (aVar.b.getBundle("savedInstanceState") == null) {
                aVar.b.putBundle("savedInstanceState", new Bundle());
            }
            try {
                aVar.c = aVar.b.getSparseParcelableArray("viewState");
                aVar.o = aVar.b.getBundle("viewRegistryState");
                zx5 zx5 = (zx5) aVar.b.getParcelable("state");
                if (zx5 != null) {
                    aVar.x0 = zx5.B0;
                    aVar.y0 = zx5.C0;
                    Boolean bool = aVar.X;
                    if (bool != null) {
                        aVar.a1 = bool.booleanValue();
                        aVar.X = null;
                    } else {
                        aVar.a1 = zx5.D0;
                    }
                }
                if (!aVar.a1) {
                    aVar.Z0 = true;
                }
            } catch (BadParcelableException e2) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + aVar, e2);
            }
        }
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        ex5 ex5 = aVar.b1;
        View view = ex5 == null ? null : ex5.k;
        if (view != null) {
            if (view != aVar.Y0) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        break;
                    } else if (parent == aVar.Y0) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
                Objects.toString(aVar);
                Objects.toString(aVar.Y0.findFocus());
            }
        }
        aVar.b0().k = null;
        aVar.L0.S();
        aVar.L0.A(true);
        aVar.a = 7;
        aVar.W0 = false;
        aVar.L0();
        if (aVar.W0) {
            pc7 pc7 = aVar.h1;
            nb7 nb7 = nb7.ON_RESUME;
            pc7.d(nb7);
            if (aVar.Y0 != null) {
                aVar.i1.a(nb7);
            }
            vx5 vx5 = aVar.L0;
            vx5.H = false;
            vx5.I = false;
            vx5.O.g = false;
            vx5.u(7);
            this.a.E(aVar, false);
            this.b.i(aVar.Y, (Bundle) null);
            aVar.b = null;
            aVar.c = null;
            aVar.o = null;
            return;
        }
        throw new AndroidRuntimeException(me4.h("Fragment ", aVar, " did not call through to super.onResume()"));
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        a aVar = this.c;
        if (aVar.a == -1 && (bundle = aVar.b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new zx5(aVar));
        if (aVar.a > -1) {
            Bundle bundle3 = new Bundle();
            aVar.M0(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.F(aVar, bundle3, false);
            Bundle bundle4 = new Bundle();
            aVar.l1.u(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle a0 = aVar.L0.a0();
            if (!a0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", a0);
            }
            if (aVar.Y0 != null) {
                p();
            }
            SparseArray sparseArray = aVar.c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = aVar.o;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = aVar.Z;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        a aVar = this.c;
        if (aVar.Y0 != null) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(aVar);
                Objects.toString(aVar.Y0);
            }
            SparseArray sparseArray = new SparseArray();
            aVar.Y0.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                aVar.c = sparseArray;
            }
            Bundle bundle = new Bundle();
            aVar.i1.Y.u(bundle);
            if (!bundle.isEmpty()) {
                aVar.o = bundle;
            }
        }
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        aVar.L0.S();
        aVar.L0.A(true);
        aVar.a = 5;
        aVar.W0 = false;
        aVar.N0();
        if (aVar.W0) {
            pc7 pc7 = aVar.h1;
            nb7 nb7 = nb7.ON_START;
            pc7.d(nb7);
            if (aVar.Y0 != null) {
                aVar.i1.a(nb7);
            }
            vx5 vx5 = aVar.L0;
            vx5.H = false;
            vx5.I = false;
            vx5.O.g = false;
            vx5.u(5);
            this.a.G(aVar, false);
            return;
        }
        throw new AndroidRuntimeException(me4.h("Fragment ", aVar, " did not call through to super.onStart()"));
    }

    public final void r() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        vx5 vx5 = aVar.L0;
        vx5.I = true;
        vx5.O.g = true;
        vx5.u(4);
        if (aVar.Y0 != null) {
            aVar.i1.a(nb7.ON_STOP);
        }
        aVar.h1.d(nb7.ON_STOP);
        aVar.a = 4;
        aVar.W0 = false;
        aVar.O0();
        if (aVar.W0) {
            this.a.H(aVar, false);
            return;
        }
        throw new AndroidRuntimeException(me4.h("Fragment ", aVar, " did not call through to super.onStop()"));
    }

    public e(mn mnVar, f fVar, ClassLoader classLoader, nx5 nx5, Bundle bundle) {
        this.a = mnVar;
        this.b = fVar;
        zx5 zx5 = (zx5) bundle.getParcelable("state");
        a a2 = nx5.a(zx5.a);
        a2.Y = zx5.b;
        a2.D0 = zx5.c;
        a2.F0 = zx5.o;
        a2.G0 = true;
        a2.N0 = zx5.X;
        a2.O0 = zx5.Y;
        a2.P0 = zx5.Z;
        a2.S0 = zx5.w0;
        a2.B0 = zx5.x0;
        a2.R0 = zx5.y0;
        a2.Q0 = zx5.z0;
        a2.g1 = ob7.values()[zx5.A0];
        a2.x0 = zx5.B0;
        a2.y0 = zx5.C0;
        a2.a1 = zx5.D0;
        this.c = a2;
        a2.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a2.Y0(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(a2);
        }
    }

    public e(mn mnVar, f fVar, a aVar, Bundle bundle) {
        this.a = mnVar;
        this.b = fVar;
        this.c = aVar;
        aVar.c = null;
        aVar.o = null;
        aVar.I0 = 0;
        aVar.E0 = false;
        aVar.A0 = false;
        a aVar2 = aVar.w0;
        aVar.x0 = aVar2 != null ? aVar2.Y : null;
        aVar.w0 = null;
        aVar.b = bundle;
        aVar.Z = bundle.getBundle("arguments");
    }
}
