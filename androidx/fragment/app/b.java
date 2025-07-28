package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

public abstract class b extends e83 implements c8 {
    public final x3a I0 = new x3a(13, (Object) new hx5(this));
    public final pc7 J0 = new pc7(this);
    public boolean K0;
    public boolean L0;
    public boolean M0 = true;

    public b() {
        ((mm) this.o.o).f("android:support:lifecycle", new w73(1, this));
        w(new gx5(this, 0));
        this.z0.add(new gx5(this, 1));
        z(new x73(this, 1));
    }

    public static boolean T(c cVar) {
        boolean z = false;
        for (a aVar : cVar.c.f()) {
            if (aVar != null) {
                hx5 hx5 = aVar.K0;
                if ((hx5 == null ? null : hx5.E0) != null) {
                    z |= T(aVar.d0());
                }
                fy5 fy5 = aVar.i1;
                ob7 ob7 = ob7.o;
                ob7 ob72 = ob7.c;
                if (fy5 != null) {
                    fy5.b();
                    if (fy5.X.d.a(ob7)) {
                        pc7 pc7 = aVar.i1.X;
                        pc7.c("setCurrentState");
                        pc7.e(ob72);
                        z = true;
                    }
                }
                if (aVar.h1.d.a(ob7)) {
                    pc7 pc72 = aVar.h1;
                    pc72.c("setCurrentState");
                    pc72.e(ob72);
                    z = true;
                }
            }
        }
        return z;
    }

    public final vx5 P() {
        return ((hx5) this.I0.b).D0;
    }

    public void U() {
        this.J0.d(nb7.ON_RESUME);
        vx5 vx5 = ((hx5) this.I0.b).D0;
        vx5.H = false;
        vx5.I = false;
        vx5.O.g = false;
        vx5.u(7);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r2.equals("--contentcapture") == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r2.equals("--list-dumpables") == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r2.equals("--dump-dumpable") == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (android.os.Build.VERSION.SDK_INT < 31) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r2.equals("--autofill") == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
        /*
            r4 = this;
            super.dump(r5, r6, r7, r8)
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x0052
            int r2 = r8.length
            if (r2 != 0) goto L_0x000b
            goto L_0x0052
        L_0x000b:
            r2 = r8[r1]
            int r3 = r2.hashCode()
            switch(r3) {
                case -645125871: goto L_0x0042;
                case 100470631: goto L_0x0032;
                case 472614934: goto L_0x0029;
                case 1159329357: goto L_0x0020;
                case 1455016274: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0052
        L_0x0015:
            java.lang.String r3 = "--autofill"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001e
            goto L_0x0052
        L_0x001e:
            r1 = r0
            goto L_0x0052
        L_0x0020:
            java.lang.String r3 = "--contentcapture"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001e
            goto L_0x0052
        L_0x0029:
            java.lang.String r3 = "--list-dumpables"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x003b
            goto L_0x0052
        L_0x0032:
            java.lang.String r3 = "--dump-dumpable"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x003b
            goto L_0x0052
        L_0x003b:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L_0x0052
            goto L_0x001e
        L_0x0042:
            java.lang.String r3 = "--translation"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004b
            goto L_0x0052
        L_0x004b:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L_0x0052
            goto L_0x001e
        L_0x0052:
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x0056
            return
        L_0x0056:
            r7.print(r5)
            java.lang.String r0 = "Local FragmentActivity "
            r7.print(r0)
            int r0 = java.lang.System.identityHashCode(r4)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " State:"
            r7.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.print(r0)
            java.lang.String r1 = "mCreated="
            r7.print(r1)
            boolean r1 = r4.K0
            r7.print(r1)
            java.lang.String r1 = " mResumed="
            r7.print(r1)
            boolean r1 = r4.L0
            r7.print(r1)
            java.lang.String r1 = " mStopped="
            r7.print(r1)
            boolean r1 = r4.M0
            r7.print(r1)
            android.app.Application r1 = r4.getApplication()
            if (r1 == 0) goto L_0x00b2
            androidx.loader.app.b r1 = new androidx.loader.app.b
            bbf r2 = r4.v()
            r1.<init>(r4, r2)
            r1.a(r0, r7)
        L_0x00b2:
            x3a r4 = r4.I0
            java.lang.Object r4 = r4.b
            hx5 r4 = (defpackage.hx5) r4
            vx5 r4 = r4.D0
            r4.w(r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.I0.C();
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.J0.d(nb7.ON_CREATE);
        vx5 vx5 = ((hx5) this.I0.b).D0;
        vx5.H = false;
        vx5.I = false;
        vx5.O.g = false;
        vx5.u(1);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((hx5) this.I0.b).D0.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        ((hx5) this.I0.b).D0.l();
        this.J0.d(nb7.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((hx5) this.I0.b).D0.j();
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.L0 = false;
        ((hx5) this.I0.b).D0.u(5);
        this.J0.d(nb7.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        U();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.I0.C();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        x3a x3a = this.I0;
        x3a.C();
        super.onResume();
        this.L0 = true;
        ((hx5) x3a.b).D0.A(true);
    }

    public void onStart() {
        x3a x3a = this.I0;
        x3a.C();
        super.onStart();
        this.M0 = false;
        boolean z = this.K0;
        hx5 hx5 = (hx5) x3a.b;
        if (!z) {
            this.K0 = true;
            vx5 vx5 = hx5.D0;
            vx5.H = false;
            vx5.I = false;
            vx5.O.g = false;
            vx5.u(4);
        }
        hx5.D0.A(true);
        this.J0.d(nb7.ON_START);
        vx5 vx52 = hx5.D0;
        vx52.H = false;
        vx52.I = false;
        vx52.O.g = false;
        vx52.u(5);
    }

    public final void onStateNotSaved() {
        this.I0.C();
    }

    public void onStop() {
        super.onStop();
        this.M0 = true;
        do {
        } while (T(P()));
        vx5 vx5 = ((hx5) this.I0.b).D0;
        vx5.I = true;
        vx5.O.g = true;
        vx5.u(4);
        this.J0.d(nb7.ON_STOP);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((hx5) this.I0.b).D0.f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
