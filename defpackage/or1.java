package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: or1  reason: default package */
public final class or1 implements fu1 {
    public final String a;
    public final et1 b;
    public final lv1 c;
    public final Object d = new Object();
    public zq1 e;
    public nr1 f = null;
    public nr1 g = null;
    public final nr1 h;
    public ArrayList i = null;
    public final xe6 j;
    public final ex k;

    public or1(ku1 ku1, String str) {
        str.getClass();
        this.a = str;
        et1 a2 = ku1.a(str);
        this.b = a2;
        lv1 lv1 = new lv1(7, false);
        lv1.b = this;
        this.c = lv1;
        xe6 k2 = ct0.k(a2);
        this.j = k2;
        this.k = new ex(str, k2);
        this.h = new nr1(new t80(5, (u80) null));
    }

    public final Set a() {
        return ((dr4) mod.y(this.b).b).a();
    }

    public final int b() {
        return l(0);
    }

    public final boolean c() {
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String d() {
        return this.a;
    }

    public final yh7 e() {
        synchronized (this.d) {
            try {
                zq1 zq1 = this.e;
                if (zq1 == null) {
                    if (this.f == null) {
                        this.f = new nr1(0);
                    }
                    nr1 nr1 = this.f;
                    return nr1;
                }
                nr1 nr12 = this.f;
                if (nr12 != null) {
                    return nr12;
                }
                vb9 vb9 = zq1.j.b;
                return vb9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int g() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.LENS_FACING);
        e07.j("Unable to get the lens facing of the camera.", num != null);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(rf0.f(intValue, "The given lens facing integer: ", " can not be recognized."));
    }

    public final kje h() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? kje.a : kje.b;
    }

    public final String j() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.util.Size[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.util.Size[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List k(int r5) {
        /*
            r4 = this;
            et1 r4 = r4.b
            j8e r4 = r4.b()
            java.lang.Object r0 = r4.o
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r1 = r0.containsKey(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0034
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r0.get(r4)
            android.util.Size[] r4 = (android.util.Size[]) r4
            if (r4 != 0) goto L_0x0022
            goto L_0x005d
        L_0x0022:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r0.get(r4)
            android.util.Size[] r4 = (android.util.Size[]) r4
            java.lang.Object r4 = r4.clone()
            r2 = r4
            android.util.Size[] r2 = (android.util.Size[]) r2
            goto L_0x005d
        L_0x0034:
            java.lang.Object r1 = r4.a
            fzd r1 = (defpackage.fzd) r1
            java.lang.Object r1 = r1.b
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1
            android.util.Size[] r1 = r1.getHighResolutionOutputSizes(r5)
            if (r1 == 0) goto L_0x004d
            int r3 = r1.length
            if (r3 <= 0) goto L_0x004d
            java.lang.Object r4 = r4.b
            qe4 r4 = (defpackage.qe4) r4
            android.util.Size[] r1 = r4.p(r1, r5)
        L_0x004d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0.put(r4, r1)
            if (r1 == 0) goto L_0x005d
            java.lang.Object r4 = r1.clone()
            r2 = r4
            android.util.Size[] r2 = (android.util.Size[]) r2
        L_0x005d:
            if (r2 == 0) goto L_0x0064
            java.util.List r4 = java.util.Arrays.asList(r2)
            goto L_0x0068
        L_0x0064:
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0068:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.or1.k(int):java.util.List");
    }

    public final int l(int i2) {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        int intValue = num.intValue();
        int O = z3d.O(i2);
        boolean z = true;
        if (1 != g()) {
            z = false;
        }
        return z3d.x(O, intValue, z);
    }

    public final boolean m() {
        et1 et1 = this.b;
        Objects.requireNonNull(et1);
        return pa2.w(new rgc(23, et1));
    }

    public final void n(mh4 mh4, wq1 wq1) {
        synchronized (this.d) {
            try {
                zq1 zq1 = this.e;
                if (zq1 == null) {
                    if (this.i == null) {
                        this.i = new ArrayList();
                    }
                    this.i.add(new Pair(wq1, mh4));
                    return;
                }
                zq1.c.execute(new g5(zq1, mh4, wq1, 12));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final yx4 o() {
        return this.k;
    }

    public final xe6 p() {
        return this.j;
    }

    public final List q(int i2) {
        Size[] o = this.b.b().o(i2);
        return o != null ? Arrays.asList(o) : Collections.emptyList();
    }

    public final yh7 r() {
        synchronized (this.d) {
            try {
                zq1 zq1 = this.e;
                if (zq1 == null) {
                    if (this.g == null) {
                        uvf b2 = pd.b(this.b);
                        zvf zvf = new zvf(b2.b(), b2.c());
                        zvf.f(1.0f);
                        this.g = new nr1(r90.e(zvf));
                    }
                    nr1 nr1 = this.g;
                    return nr1;
                }
                nr1 nr12 = this.g;
                if (nr12 != null) {
                    return nr12;
                }
                vb9 vb9 = (vb9) zq1.i.X;
                return vb9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(ps1 ps1) {
        synchronized (this.d) {
            try {
                zq1 zq1 = this.e;
                if (zq1 == null) {
                    ArrayList arrayList = this.i;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((Pair) it.next()).first == ps1) {
                                it.remove();
                            }
                        }
                        return;
                    }
                    return;
                }
                zq1.c.execute(new c(zq1, 27, ps1));
            } finally {
            }
        }
    }

    public final void t(zq1 zq1) {
        synchronized (this.d) {
            try {
                this.e = zq1;
                nr1 nr1 = this.g;
                if (nr1 != null) {
                    nr1.m((vb9) zq1.i.X);
                }
                nr1 nr12 = this.f;
                if (nr12 != null) {
                    nr12.m(this.e.j.b);
                }
                ArrayList arrayList = this.i;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        zq1 zq12 = this.e;
                        zq12.getClass();
                        zq12.c.execute(new g5(zq12, (Executor) pair.second, (ps1) pair.first, 12));
                    }
                    this.i = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ((Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).getClass();
    }
}
