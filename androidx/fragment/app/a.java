package androidx.fragment.app;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.Violation;
import androidx.loader.app.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a implements ComponentCallbacks, View.OnCreateContextMenuListener, nc7, cbf, le6, zkc {
    public static final Object o1 = new Object();
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public c J0;
    public hx5 K0;
    public vx5 L0 = new c();
    public a M0;
    public int N0;
    public int O0;
    public String P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0 = true;
    public boolean W0;
    public Boolean X;
    public ViewGroup X0;
    public String Y = UUID.randomUUID().toString();
    public View Y0;
    public Bundle Z;
    public boolean Z0;
    public int a = -1;
    public boolean a1 = true;
    public Bundle b;
    public ex5 b1;
    public SparseArray c;
    public boolean c1;
    public LayoutInflater d1;
    public boolean e1;
    public String f1;
    public ob7 g1;
    public pc7 h1;
    public fy5 i1;
    public final vb9 j1;
    public alc k1;
    public ud l1;
    public final ArrayList m1;
    public final cx5 n1;
    public Bundle o;
    public a w0;
    public String x0 = null;
    public int y0;
    public Boolean z0 = null;

    /* JADX WARNING: type inference failed for: r0v4, types: [vx5, androidx.fragment.app.c] */
    /* JADX WARNING: type inference failed for: r0v8, types: [yh7, vb9] */
    public a() {
        new re(24, this);
        this.g1 = ob7.X;
        this.j1 = new yh7();
        new AtomicInteger();
        this.m1 = new ArrayList();
        this.n1 = new cx5(this);
        n0();
    }

    public void A0() {
        this.W0 = true;
    }

    public void C0() {
        this.W0 = true;
    }

    public LayoutInflater D0(Bundle bundle) {
        hx5 hx5 = this.K0;
        if (hx5 != null) {
            b bVar = hx5.E0;
            LayoutInflater cloneInContext = bVar.getLayoutInflater().cloneInContext(bVar);
            cloneInContext.setFactory2(this.L0.f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void E0(boolean z) {
    }

    public void F0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.W0 = true;
    }

    public final void G0(AttributeSet attributeSet, Bundle bundle) {
        this.W0 = true;
        hx5 hx5 = this.K0;
        Activity activity = hx5 == null ? null : hx5.A0;
        if (activity != null) {
            this.W0 = false;
            F0(activity, attributeSet, bundle);
        }
    }

    public boolean H0(MenuItem menuItem) {
        return false;
    }

    public void I0() {
        this.W0 = true;
    }

    public void J0(Menu menu) {
    }

    public void K0(int i, String[] strArr, int[] iArr) {
    }

    public void L0() {
        this.W0 = true;
    }

    public void M0(Bundle bundle) {
    }

    public void N0() {
        this.W0 = true;
    }

    public void O0() {
        this.W0 = true;
    }

    public void P0(View view, Bundle bundle) {
    }

    public void Q0(Bundle bundle) {
        this.W0 = true;
    }

    public final pc7 R() {
        return this.h1;
    }

    public void R0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.L0.S();
        this.H0 = true;
        this.i1 = new fy5(this, v(), new oc4(23, this));
        View y02 = y0(layoutInflater, viewGroup, bundle);
        this.Y0 = y02;
        if (y02 != null) {
            this.i1.b();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(this.Y0);
                toString();
            }
            xie.G(this.Y0, this.i1);
            this.Y0.setTag(frb.view_tree_view_model_store_owner, this.i1);
            ete.X(this.Y0, this.i1);
            this.j1.k(this.i1);
        } else if (this.i1.X == null) {
            this.i1 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final LayoutInflater S0() {
        LayoutInflater D02 = D0((Bundle) null);
        this.d1 = D02;
        return D02;
    }

    public final b T0() {
        b c0 = c0();
        if (c0 != null) {
            return c0;
        }
        throw new IllegalStateException(me4.h("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle U0() {
        Bundle bundle = this.Z;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(me4.h("Fragment ", this, " does not have any arguments."));
    }

    public final Context V0() {
        Context e0 = e0();
        if (e0 != null) {
            return e0;
        }
        throw new IllegalStateException(me4.h("Fragment ", this, " not attached to a context."));
    }

    public final View W0() {
        View l0 = l0();
        if (l0 != null) {
            return l0;
        }
        throw new IllegalStateException(me4.h("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void X0(int i, int i2, int i3, int i4) {
        if (this.b1 != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            b0().b = i;
            b0().c = i2;
            b0().d = i3;
            b0().e = i4;
        }
    }

    public void Y0(Bundle bundle) {
        c cVar = this.J0;
        if (cVar != null) {
            if (cVar == null ? false : cVar.Q()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.Z = bundle;
    }

    public ek8 Z() {
        return new dx5(this);
    }

    public final void Z0(boolean z) {
        if (!this.U0) {
            this.U0 = true;
            if (p0() && !q0()) {
                this.K0.E0.invalidateOptionsMenu();
            }
        }
    }

    public void a0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.N0));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.O0));
        printWriter.print(" mTag=");
        printWriter.println(this.P0);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.Y);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.I0);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.A0);
        printWriter.print(" mRemoving=");
        printWriter.print(this.B0);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.D0);
        printWriter.print(" mInLayout=");
        printWriter.println(this.E0);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.Q0);
        printWriter.print(" mDetached=");
        printWriter.print(this.R0);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.V0);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.U0);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.S0);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.a1);
        if (this.J0 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.J0);
        }
        if (this.K0 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.K0);
        }
        if (this.M0 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.M0);
        }
        if (this.Z != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.Z);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.o);
        }
        int i = 0;
        a j0 = j0(false);
        if (j0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(j0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.y0);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        ex5 ex5 = this.b1;
        printWriter.println(ex5 == null ? false : ex5.a);
        ex5 ex52 = this.b1;
        if ((ex52 == null ? 0 : ex52.b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            ex5 ex53 = this.b1;
            printWriter.println(ex53 == null ? 0 : ex53.b);
        }
        ex5 ex54 = this.b1;
        if ((ex54 == null ? 0 : ex54.c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            ex5 ex55 = this.b1;
            printWriter.println(ex55 == null ? 0 : ex55.c);
        }
        ex5 ex56 = this.b1;
        if ((ex56 == null ? 0 : ex56.d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            ex5 ex57 = this.b1;
            printWriter.println(ex57 == null ? 0 : ex57.d);
        }
        ex5 ex58 = this.b1;
        if ((ex58 == null ? 0 : ex58.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            ex5 ex59 = this.b1;
            if (ex59 != null) {
                i = ex59.e;
            }
            printWriter.println(i);
        }
        if (this.X0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.X0);
        }
        if (this.Y0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.Y0);
        }
        if (e0() != null) {
            new b(this, v()).a(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.L0 + ":");
        this.L0.w(hr1.g(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final void a1(boolean z) {
        if (this.V0 != z) {
            this.V0 = z;
            if (this.U0 && p0() && !q0()) {
                this.K0.E0.invalidateOptionsMenu();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ex5, java.lang.Object] */
    public final ex5 b0() {
        if (this.b1 == null) {
            ? obj = new Object();
            Object obj2 = o1;
            obj.g = obj2;
            obj.h = obj2;
            obj.i = obj2;
            obj.j = 1.0f;
            obj.k = null;
            this.b1 = obj;
        }
        return this.b1;
    }

    public final void b1() {
        by5 by5 = cy5.a;
        cy5.b(new Violation(this, "Attempting to set retain instance for fragment " + this));
        cy5.a(this).getClass();
        this.S0 = true;
        c cVar = this.J0;
        if (cVar != null) {
            cVar.O.e(this);
        } else {
            this.T0 = true;
        }
    }

    public final b c0() {
        hx5 hx5 = this.K0;
        if (hx5 == null) {
            return null;
        }
        return (b) hx5.A0;
    }

    public final void c1(int i, a aVar) {
        if (aVar != null) {
            by5 by5 = cy5.a;
            cy5.b(new Violation(this, "Attempting to set target fragment " + aVar + " with request code " + i + " for fragment " + this));
            cy5.a(this).getClass();
        }
        c cVar = this.J0;
        c cVar2 = aVar != null ? aVar.J0 : null;
        if (cVar == null || cVar2 == null || cVar == cVar2) {
            a aVar2 = aVar;
            while (aVar2 != null) {
                if (!super.equals(this)) {
                    aVar2 = aVar2.j0(false);
                } else {
                    throw new IllegalArgumentException("Setting " + aVar + " as the target of " + this + " would create a target cycle");
                }
            }
            if (aVar == null) {
                this.x0 = null;
                this.w0 = null;
            } else if (this.J0 == null || aVar.J0 == null) {
                this.x0 = null;
                this.w0 = aVar;
            } else {
                this.x0 = aVar.Y;
                this.w0 = null;
            }
            this.y0 = i;
            return;
        }
        throw new IllegalArgumentException(me4.h("Fragment ", aVar, " must share the same FragmentManager to be set as a target fragment"));
    }

    public final c d0() {
        if (this.K0 != null) {
            return this.L0;
        }
        throw new IllegalStateException(me4.h("Fragment ", this, " has not been attached yet."));
    }

    public void d1(boolean z) {
        by5 by5 = cy5.a;
        cy5.b(new Violation(this, "Attempting to set user visible hint to " + z + " for fragment " + this));
        cy5.a(this).getClass();
        boolean z2 = false;
        if (!this.a1 && z && this.a < 5 && this.J0 != null && p0() && this.e1) {
            c cVar = this.J0;
            e g = cVar.g(this);
            a aVar = g.c;
            if (aVar.Z0) {
                if (cVar.b) {
                    cVar.K = true;
                } else {
                    aVar.Z0 = false;
                    g.k();
                }
            }
        }
        this.a1 = z;
        if (this.a < 5 && !z) {
            z2 = true;
        }
        this.Z0 = z2;
        if (this.b != null) {
            this.X = Boolean.valueOf(z);
        }
    }

    public final Context e0() {
        hx5 hx5 = this.K0;
        if (hx5 == null) {
            return null;
        }
        return hx5.B0;
    }

    public final void e1(Intent intent, int i, Bundle bundle) {
        if (this.K0 != null) {
            c g0 = g0();
            if (g0.C != null) {
                g0.F.addLast(new qx5(this.Y, i));
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                g0.C.y(intent);
                return;
            }
            hx5 hx5 = g0.w;
            if (i == -1) {
                hx5.B0.startActivity(intent, bundle);
            } else {
                hx5.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host".toString());
            }
        } else {
            throw new IllegalStateException(me4.h("Fragment ", this, " not attached to Activity"));
        }
    }

    public final int f0() {
        ob7 ob7 = this.g1;
        return (ob7 == ob7.b || this.M0 == null) ? ob7.ordinal() : Math.min(ob7.ordinal(), this.M0.f0());
    }

    public final c g0() {
        c cVar = this.J0;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(me4.h("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources h0() {
        return V0().getResources();
    }

    public final String i0(int i) {
        return h0().getString(i);
    }

    public final a j0(boolean z) {
        String str;
        if (z) {
            by5 by5 = cy5.a;
            cy5.b(new Violation(this, "Attempting to get target fragment from fragment " + this));
            cy5.a(this).getClass();
        }
        a aVar = this.w0;
        if (aVar != null) {
            return aVar;
        }
        c cVar = this.J0;
        if (cVar == null || (str = this.x0) == null) {
            return null;
        }
        return cVar.c.b(str);
    }

    public final int k0() {
        by5 by5 = cy5.a;
        cy5.b(new Violation(this, "Attempting to get target request code from fragment " + this));
        cy5.a(this).getClass();
        return this.y0;
    }

    public View l0() {
        return this.Y0;
    }

    public final nc7 m0() {
        fy5 fy5 = this.i1;
        if (fy5 != null) {
            return fy5;
        }
        throw new IllegalStateException(me4.h("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final zaf n() {
        Application application;
        if (this.J0 != null) {
            if (this.k1 == null) {
                Context applicationContext = V0().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && Log.isLoggable("FragmentManager", 3)) {
                    Objects.toString(V0().getApplicationContext());
                }
                this.k1 = new alc(application, this, this.Z);
            }
            return this.k1;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final void n0() {
        this.h1 = new pc7(this);
        this.l1 = new ud((zkc) this);
        Bundle bundle = null;
        this.k1 = null;
        ArrayList arrayList = this.m1;
        cx5 cx5 = this.n1;
        if (arrayList.contains(cx5)) {
            return;
        }
        if (this.a >= 0) {
            a aVar = cx5.a;
            aVar.l1.s();
            gp0.h(aVar);
            Bundle bundle2 = aVar.b;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("registryState");
            }
            aVar.l1.t(bundle);
            return;
        }
        arrayList.add(cx5);
    }

    public final pb9 o() {
        Application application;
        Context applicationContext = V0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(V0().getApplicationContext());
        }
        pb9 pb9 = new pb9(0);
        if (application != null) {
            pb9.a(yaf.d, application);
        }
        pb9.a(gp0.h, this);
        pb9.a(gp0.i, this);
        Bundle bundle = this.Z;
        if (bundle != null) {
            pb9.a(gp0.j, bundle);
        }
        return pb9;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [vx5, androidx.fragment.app.c] */
    public final void o0() {
        n0();
        this.f1 = this.Y;
        this.Y = UUID.randomUUID().toString();
        this.A0 = false;
        this.B0 = false;
        this.D0 = false;
        this.E0 = false;
        this.G0 = false;
        this.I0 = 0;
        this.J0 = null;
        this.L0 = new c();
        this.K0 = null;
        this.N0 = 0;
        this.O0 = 0;
        this.P0 = null;
        this.Q0 = false;
        this.R0 = false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.W0 = true;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        T0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.W0 = true;
    }

    public final boolean p0() {
        return this.K0 != null && this.A0;
    }

    public final boolean q0() {
        if (!this.Q0) {
            c cVar = this.J0;
            if (cVar == null) {
                return false;
            }
            a aVar = this.M0;
            cVar.getClass();
            return aVar == null ? false : aVar.q0();
        }
    }

    public final boolean r0() {
        return this.I0 > 0;
    }

    public final void requestPermissions(String[] strArr, int i) {
        if (this.K0 != null) {
            c g0 = g0();
            if (g0.E != null) {
                g0.F.addLast(new qx5(this.Y, i));
                g0.E.y(strArr);
                return;
            }
            g0.w.getClass();
            return;
        }
        throw new IllegalStateException(me4.h("Fragment ", this, " not attached to Activity"));
    }

    public void s0(Bundle bundle) {
        this.W0 = true;
    }

    public final void startActivity(Intent intent) {
        hx5 hx5 = this.K0;
        if (hx5 != null) {
            hx5.B0.startActivity(intent, (Bundle) null);
            return;
        }
        throw new IllegalStateException(me4.h("Fragment ", this, " not attached to Activity"));
    }

    public void t0(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.Y);
        if (this.N0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.N0));
        }
        if (this.P0 != null) {
            sb.append(" tag=");
            sb.append(this.P0);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u0(Activity activity) {
        this.W0 = true;
    }

    public final bbf v() {
        if (this.J0 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (f0() != 1) {
            HashMap hashMap = this.J0.O.d;
            bbf bbf = (bbf) hashMap.get(this.Y);
            if (bbf != null) {
                return bbf;
            }
            bbf bbf2 = new bbf();
            hashMap.put(this.Y, bbf2);
            return bbf2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public void v0(Context context) {
        this.W0 = true;
        hx5 hx5 = this.K0;
        Activity activity = hx5 == null ? null : hx5.A0;
        if (activity != null) {
            this.W0 = false;
            u0(activity);
        }
    }

    public void w0(Bundle bundle) {
        Bundle bundle2;
        this.W0 = true;
        Bundle bundle3 = this.b;
        if (!(bundle3 == null || (bundle2 = bundle3.getBundle("childFragmentManager")) == null)) {
            this.L0.Z(bundle2);
            vx5 vx5 = this.L0;
            vx5.H = false;
            vx5.I = false;
            vx5.O.g = false;
            vx5.u(1);
        }
        vx5 vx52 = this.L0;
        if (vx52.v < 1) {
            vx52.H = false;
            vx52.I = false;
            vx52.O.g = false;
            vx52.u(1);
        }
    }

    public void x0(Menu menu, MenuInflater menuInflater) {
    }

    public final mm y() {
        return (mm) this.l1.o;
    }

    public View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void z0() {
        this.W0 = true;
    }
}
