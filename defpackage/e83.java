package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e83  reason: default package */
public abstract class e83 extends Activity implements cbf, le6, zkc, fx9, m8, ix9, wx9, nx9, ox9, rl8, nc7, p77 {
    public static final /* synthetic */ int H0 = 0;
    public final CopyOnWriteArrayList A0;
    public final CopyOnWriteArrayList B0;
    public final CopyOnWriteArrayList C0;
    public boolean D0;
    public boolean E0;
    public final r7e F0;
    public final r7e G0;
    public bbf X;
    public final b83 Y;
    public final r7e Z;
    public final pc7 a = new pc7(this);
    public final fq3 b = new fq3(0);
    public final jg8 c;
    public final ud o;
    public final c83 w0;
    public final CopyOnWriteArrayList x0;
    public final CopyOnWriteArrayList y0;
    public final CopyOnWriteArrayList z0;

    public e83() {
        b bVar = (b) this;
        this.c = new jg8(new u73(bVar, 0));
        ud udVar = new ud((zkc) this);
        this.o = udVar;
        this.Y = new b83(bVar);
        this.Z = new r7e(new d83(bVar, 2));
        new AtomicInteger();
        this.w0 = new c83(bVar);
        this.x0 = new CopyOnWriteArrayList();
        this.y0 = new CopyOnWriteArrayList();
        this.z0 = new CopyOnWriteArrayList();
        this.A0 = new CopyOnWriteArrayList();
        this.B0 = new CopyOnWriteArrayList();
        this.C0 = new CopyOnWriteArrayList();
        pc7 pc7 = this.a;
        if (pc7 != null) {
            pc7.a(new v73(0, bVar));
            this.a.a(new v73(1, bVar));
            this.a.a(new d6c(1, bVar));
            udVar.s();
            gp0.h(this);
            ((mm) udVar.o).f("android:support:activity-result", new w73(0, bVar));
            z(new x73(bVar, 0));
            this.F0 = new r7e(new d83(bVar, 0));
            this.G0 = new r7e(new d83(bVar, 3));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
    }

    public final void A(lx5 lx5) {
        this.A0.add(lx5);
    }

    public final void B(lx5 lx5) {
        this.B0.add(lx5);
    }

    public final void C(lx5 lx5) {
        this.y0.add(lx5);
    }

    public final ex9 E() {
        return (ex9) this.G0.getValue();
    }

    public final void F() {
        xie.G(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(frb.view_tree_view_model_store_owner, this);
        ete.X(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(hrb.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(hrb.report_drawn, this);
    }

    public final void G(Bundle bundle) {
        super.onCreate(bundle);
        int i = aac.a;
        pa2.t(this);
    }

    public Object H() {
        return null;
    }

    public final void I(Bundle bundle) {
        ob7 ob7 = ob7.c;
        pc7 pc7 = this.a;
        pc7.c("setCurrentState");
        pc7.e(ob7);
        super.onSaveInstanceState(bundle);
    }

    public final void J(mx5 mx5) {
        jg8 jg8 = this.c;
        ((CopyOnWriteArrayList) jg8.b).remove(mx5);
        hr1.r(((HashMap) jg8.o).remove(mx5));
        ((Runnable) jg8.c).run();
    }

    public final void K(lx5 lx5) {
        this.x0.remove(lx5);
    }

    public final void L(lx5 lx5) {
        this.A0.remove(lx5);
    }

    public final void M(lx5 lx5) {
        this.B0.remove(lx5);
    }

    public final void O(lx5 lx5) {
        this.y0.remove(lx5);
    }

    public final pc7 R() {
        return this.a;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        F();
        this.Y.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        WeakHashMap weakHashMap = eaf.a;
        return l(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        WeakHashMap weakHashMap = eaf.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean l(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final zaf n() {
        return (zaf) this.F0.getValue();
    }

    public final pb9 o() {
        pb9 pb9 = new pb9(0);
        if (getApplication() != null) {
            pb9.a(yaf.d, getApplication());
        }
        pb9.a(gp0.h, this);
        pb9.a(gp0.i, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            pb9.a(gp0.j, extras);
        }
        return pb9;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.w0.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        E().d();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.x0.iterator();
        while (it.hasNext()) {
            ((rf3) it.next()).accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.o.t(bundle);
        fq3 fq3 = this.b;
        fq3.b = this;
        Iterator it = ((CopyOnWriteArraySet) fq3.a).iterator();
        while (it.hasNext()) {
            ((jx9) it.next()).a();
        }
        G(bundle);
        int i = aac.a;
        pa2.t(this);
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((mx5) it.next()).a.k(menu, menuInflater);
        }
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        boolean z = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (true) {
            if (it.hasNext()) {
                if (((mx5) it.next()).a.p(menuItem)) {
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    public final void onMultiWindowModeChanged(boolean z) {
        if (!this.D0) {
            Iterator it = this.A0.iterator();
            while (it.hasNext()) {
                ((rf3) it.next()).accept(new ea9(z));
            }
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.z0.iterator();
        while (it.hasNext()) {
            ((rf3) it.next()).accept(intent);
        }
    }

    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((mx5) it.next()).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    public final void onPictureInPictureModeChanged(boolean z) {
        if (!this.E0) {
            Iterator it = this.B0.iterator();
            while (it.hasNext()) {
                ((rf3) it.next()).accept(new pua(z));
            }
        }
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((mx5) it.next()).a.t(menu);
        }
        return true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.w0.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, a83] */
    public final Object onRetainNonConfigurationInstance() {
        a83 a83;
        Object H = H();
        bbf bbf = this.X;
        if (bbf == null && (a83 = (a83) getLastNonConfigurationInstance()) != null) {
            bbf = a83.b;
        }
        if (bbf == null && H == null) {
            return null;
        }
        ? obj = new Object();
        obj.a = H;
        obj.b = bbf;
        return obj;
    }

    public void onSaveInstanceState(Bundle bundle) {
        pc7 pc7 = this.a;
        if (pc7 instanceof pc7) {
            ob7 ob7 = ob7.c;
            pc7.c("setCurrentState");
            pc7.e(ob7);
        }
        I(bundle);
        this.o.u(bundle);
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            ((rf3) it.next()).accept(Integer.valueOf(i));
        }
    }

    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.C0.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void reportFullyDrawn() {
        try {
            if (kne.a()) {
                Trace.beginSection(am7.C("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            r16 r16 = (r16) this.Z.getValue();
            synchronized (r16.b) {
                r16.c = true;
                Iterator it = r16.d.iterator();
                while (it.hasNext()) {
                    ((s16) it.next()).invoke();
                }
                r16.d.clear();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void s(mx5 mx5) {
        jg8 jg8 = this.c;
        ((CopyOnWriteArrayList) jg8.b).add(mx5);
        ((Runnable) jg8.c).run();
    }

    public void setContentView(int i) {
        F();
        this.Y.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    public final bbf v() {
        if (getApplication() != null) {
            if (this.X == null) {
                a83 a83 = (a83) getLastNonConfigurationInstance();
                if (a83 != null) {
                    this.X = a83.b;
                }
                if (this.X == null) {
                    this.X = new bbf();
                }
            }
            return this.X;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
    }

    public final void w(rf3 rf3) {
        this.x0.add(rf3);
    }

    public final mm y() {
        return (mm) this.o.o;
    }

    public final void z(jx9 jx9) {
        fq3 fq3 = this.b;
        if (((Context) fq3.b) != null) {
            jx9.a();
        }
        ((CopyOnWriteArraySet) fq3.a).add(jx9);
    }

    /* JADX INFO: finally extract failed */
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.D0 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.D0 = false;
            Iterator it = this.A0.iterator();
            while (it.hasNext()) {
                ((rf3) it.next()).accept(new ea9(z));
            }
        } catch (Throwable th) {
            this.D0 = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.E0 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.E0 = false;
            Iterator it = this.B0.iterator();
            while (it.hasNext()) {
                ((rf3) it.next()).accept(new pua(z));
            }
        } catch (Throwable th) {
            this.E0 = false;
            throw th;
        }
    }

    public void setContentView(View view) {
        F();
        this.Y.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        F();
        this.Y.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
