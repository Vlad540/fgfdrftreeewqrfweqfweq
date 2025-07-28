package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import kotlin.coroutines.Continuation;

/* renamed from: az5  reason: default package */
public final class az5 implements xy5 {
    public uy5 a = uy5.d;
    public final String b = az5.class.getName();
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final r7e f;
    public final int g;
    public final int h;
    public final int[] i;
    public ok7 j;
    public r8c k;

    public az5(t97 t97, t97 t972, t97 t973) {
        this.c = t972;
        this.d = t973;
        this.e = t97;
        this.f = new r7e(new gz3(15, this));
        this.g = a24.X(((float) 120) * dh4.c().getDisplayMetrics().density);
        this.h = a24.X(((float) 146) * dh4.c().getDisplayMetrics().density);
        this.i = new int[2];
    }

    public final uy5 c() {
        return this.a;
    }

    public final boolean d() {
        v2f v2f = this.a.a;
        if (v2f == null) {
            udd.s(this.b, "You should call init before prepare!", (Throwable) null);
            return false;
        }
        Uri l = v2f.l();
        int i2 = oze.a;
        String scheme = l.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            ok7 ok7 = this.j;
            if (ok7 == null || !ok7.d()) {
                return false;
            }
        } else {
            r8c r8c = this.k;
            if (r8c == null || !r8c.d()) {
                return false;
            }
        }
        return true;
    }

    public final Object e(long j2, Continuation continuation) {
        v2f v2f = this.a.a;
        if (v2f == null) {
            udd.s(this.b, "You should call setVideoContent before extractFrame!", (Throwable) null);
            return null;
        }
        Uri l = v2f.l();
        int i2 = oze.a;
        String scheme = l.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            ok7 ok7 = this.j;
            if (ok7 != null) {
                return ok7.e(j2, continuation);
            }
        } else {
            r8c r8c = this.k;
            if (r8c != null) {
                return r8c.e(j2, continuation);
            }
        }
        return null;
    }

    public final void f(uy5 uy5) {
        v2f v2f;
        if (!uy5.equals(this.a) && (v2f = uy5.a) != null) {
            if (uy5.b == 0 || uy5.c == 0) {
                int width = v2f.getWidth();
                int height = v2f.getHeight();
                int[] iArr = this.i;
                int i2 = this.g;
                if (width <= 0 || height <= 0) {
                    iArr[0] = i2;
                    iArr[1] = i2;
                } else if (width < height) {
                    oyb.B(i2, i2, width, height, iArr);
                } else {
                    int i3 = this.h;
                    oyb.B(i3, i3, width, height, iArr);
                }
                this.a = new uy5(v2f, iArr[0], iArr[1]);
            } else {
                this.a = uy5;
            }
            Uri l = v2f.l();
            int i4 = oze.a;
            String scheme = l.getScheme();
            if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                if (this.j == null) {
                    this.j = new ok7((pae) this.d.getValue(), (sma) this.c.getValue());
                }
                ok7 ok7 = this.j;
                if (ok7 != null) {
                    ok7.a = this.a;
                    return;
                }
                return;
            }
            if (this.k == null) {
                this.k = new r8c((fr6) this.f.getValue());
            }
            r8c r8c = this.k;
            if (r8c != null) {
                r8c.c = this.a;
            }
        }
    }

    public final void prepare() {
        v2f v2f = this.a.a;
        String str = this.b;
        if (v2f == null) {
            udd.s(str, "You should call init before prepare!", (Throwable) null);
        } else if (!d()) {
            udd.T(str, "Can't extract video frame", new Object[0]);
        } else {
            Uri l = v2f.l();
            int i2 = oze.a;
            String scheme = l.getScheme();
            if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                ok7 ok7 = this.j;
                if (ok7 != null) {
                    ok7.prepare();
                    return;
                }
                return;
            }
            r8c r8c = this.k;
            if (r8c != null) {
                r8c.prepare();
            }
        }
    }
}
