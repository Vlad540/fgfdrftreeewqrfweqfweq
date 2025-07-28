package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: ob4  reason: default package */
public final class ob4 extends jpe {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final SparseArray M;
    public final SparseBooleanArray N;
    public boolean z;

    public ob4() {
        this.M = new SparseArray();
        this.N = new SparseBooleanArray();
        b();
    }

    public final jpe a(int i, int i2) {
        super.a(i, i2);
        return this;
    }

    public final void b() {
        this.z = true;
        this.A = false;
        this.B = true;
        this.C = false;
        this.D = true;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = 0;
        this.J = true;
        this.K = false;
        this.L = true;
    }

    public final jpe c(String[] strArr) {
        ts6 i = ws6.i();
        for (String str : strArr) {
            str.getClass();
            i.a(mze.E(str));
        }
        this.n = i.j();
        return this;
    }

    public final void d(Context context) {
        CaptioningManager captioningManager;
        int i = mze.a;
        if (i < 19) {
            return;
        }
        if ((i >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.t = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.s = ws6.n(i >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
    }

    public final void e(int i, voe voe, pb4 pb4) {
        SparseArray sparseArray = this.M;
        Map map = (Map) sparseArray.get(i);
        if (map == null) {
            map = new HashMap();
            sparseArray.put(i, map);
        }
        if (!map.containsKey(voe) || !mze.a(map.get(voe), pb4)) {
            map.put(voe, pb4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = (android.hardware.display.DisplayManager) r9.getSystemService("display");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.content.Context r9) {
        /*
            r8 = this;
            int r0 = defpackage.mze.a
            r1 = 0
            r2 = 17
            if (r0 < r2) goto L_0x0016
            java.lang.String r3 = "display"
            java.lang.Object r3 = r9.getSystemService(r3)
            android.hardware.display.DisplayManager r3 = (android.hardware.display.DisplayManager) r3
            if (r3 == 0) goto L_0x0016
            android.view.Display r3 = r3.getDisplay(r1)
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            if (r3 != 0) goto L_0x0028
            java.lang.String r3 = "window"
            java.lang.Object r3 = r9.getSystemService(r3)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            r3.getClass()
            android.view.Display r3 = r3.getDefaultDisplay()
        L_0x0028:
            int r4 = r3.getDisplayId()
            if (r4 != 0) goto L_0x00aa
            boolean r4 = defpackage.mze.C(r9)
            if (r4 == 0) goto L_0x00aa
            r4 = 28
            if (r0 >= r4) goto L_0x003f
            java.lang.String r4 = "sys.display-size"
            java.lang.String r4 = defpackage.mze.z(r4)
            goto L_0x0045
        L_0x003f:
            java.lang.String r4 = "vendor.display-size"
            java.lang.String r4 = defpackage.mze.z(r4)
        L_0x0045:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x0080
            java.lang.String r5 = r4.trim()     // Catch:{ NumberFormatException -> 0x0071 }
            java.lang.String r6 = "x"
            r7 = -1
            java.lang.String[] r5 = r5.split(r6, r7)     // Catch:{ NumberFormatException -> 0x0071 }
            int r6 = r5.length     // Catch:{ NumberFormatException -> 0x0071 }
            r7 = 2
            if (r6 != r7) goto L_0x0071
            r1 = r5[r1]     // Catch:{ NumberFormatException -> 0x0071 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0071 }
            r6 = 1
            r5 = r5[r6]     // Catch:{ NumberFormatException -> 0x0071 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0071 }
            if (r1 <= 0) goto L_0x0071
            if (r5 <= 0) goto L_0x0071
            android.graphics.Point r6 = new android.graphics.Point     // Catch:{ NumberFormatException -> 0x0071 }
            r6.<init>(r1, r5)     // Catch:{ NumberFormatException -> 0x0071 }
            goto L_0x00cd
        L_0x0071:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x0080
            java.lang.String r4 = "Invalid display size: "
            r4.concat(r1)
        L_0x0080:
            java.lang.String r1 = "Sony"
            java.lang.String r4 = defpackage.mze.c
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00aa
            java.lang.String r1 = defpackage.mze.d
            java.lang.String r4 = "BRAVIA"
            boolean r1 = r1.startsWith(r4)
            if (r1 == 0) goto L_0x00aa
            android.content.pm.PackageManager r9 = r9.getPackageManager()
            java.lang.String r1 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r9 = r9.hasSystemFeature(r1)
            if (r9 == 0) goto L_0x00aa
            android.graphics.Point r6 = new android.graphics.Point
            r9 = 3840(0xf00, float:5.381E-42)
            r0 = 2160(0x870, float:3.027E-42)
            r6.<init>(r9, r0)
            goto L_0x00cd
        L_0x00aa:
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>()
            r9 = 23
            if (r0 < r9) goto L_0x00c4
            android.view.Display$Mode r9 = r3.getMode()
            int r0 = r9.getPhysicalWidth()
            r6.x = r0
            int r9 = r9.getPhysicalHeight()
            r6.y = r9
            goto L_0x00cd
        L_0x00c4:
            if (r0 < r2) goto L_0x00ca
            r3.getRealSize(r6)
            goto L_0x00cd
        L_0x00ca:
            r3.getSize(r6)
        L_0x00cd:
            int r9 = r6.x
            int r0 = r6.y
            r8.a(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob4.f(android.content.Context):void");
    }

    public ob4(Context context) {
        d(context);
        f(context);
        this.M = new SparseArray();
        this.N = new SparseBooleanArray();
        b();
    }

    public ob4(mb4 mb4) {
        this.a = mb4.a;
        this.b = mb4.b;
        this.c = mb4.c;
        this.d = mb4.o;
        this.e = mb4.X;
        this.f = mb4.Y;
        this.g = mb4.Z;
        this.h = mb4.w0;
        this.i = mb4.x0;
        this.j = mb4.y0;
        this.k = mb4.z0;
        this.l = mb4.A0;
        this.m = mb4.B0;
        this.n = mb4.C0;
        this.o = mb4.D0;
        this.p = mb4.E0;
        this.q = mb4.F0;
        this.r = mb4.G0;
        this.s = mb4.H0;
        this.t = mb4.I0;
        this.u = mb4.J0;
        this.v = mb4.K0;
        this.w = mb4.L0;
        this.x = mb4.M0;
        this.y = mb4.N0;
        this.I = mb4.O0;
        this.z = mb4.P0;
        this.A = mb4.Q0;
        this.B = mb4.R0;
        this.C = mb4.S0;
        this.D = mb4.T0;
        this.E = mb4.U0;
        this.F = mb4.V0;
        this.G = mb4.W0;
        this.H = mb4.X0;
        this.J = mb4.Y0;
        this.K = mb4.Z0;
        this.L = mb4.a1;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = mb4.b1;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.M = sparseArray;
                this.N = mb4.c1.clone();
                return;
            }
        }
    }
}
