package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: fsf  reason: default package */
public abstract class fsf extends lsf {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public qy6[] d;
    public qy6 e = null;
    public nsf f;
    public qy6 g;

    public fsf(nsf nsf, WindowInsets windowInsets) {
        super(nsf);
        this.c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private qy6 r(int i2, boolean z) {
        qy6 qy6 = qy6.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                qy6 = qy6.a(qy6, s(i3, z));
            }
        }
        return qy6;
    }

    private qy6 t() {
        nsf nsf = this.f;
        return nsf != null ? nsf.a.h() : qy6.e;
    }

    private qy6 u(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!h) {
                w();
            }
            Method method = i;
            if (!(method == null || j == null || k == null)) {
                try {
                    Object invoke = method.invoke(view, (Object[]) null);
                    if (invoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) k.get(l.get(invoke));
                    if (rect != null) {
                        return qy6.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e2) {
                    e2.getMessage();
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void w() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", (Class[]) null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            e2.getMessage();
        }
        h = true;
    }

    public void d(View view) {
        qy6 u = u(view);
        if (u == null) {
            u = qy6.e;
        }
        x(u);
    }

    public qy6 f(int i2) {
        return r(i2, false);
    }

    public final qy6 j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = qy6.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    public boolean n() {
        return this.c.isRound();
    }

    @SuppressLint({"WrongConstant"})
    public boolean o(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !v(i3)) {
                return false;
            }
        }
        return true;
    }

    public void p(qy6[] qy6Arr) {
        this.d = qy6Arr;
    }

    public void q(nsf nsf) {
        this.f = nsf;
    }

    public qy6 s(int i2, boolean z) {
        int i3;
        if (i2 == 1) {
            return z ? qy6.b(0, Math.max(t().b, j().b), 0, 0) : qy6.b(0, j().b, 0, 0);
        }
        qy6 qy6 = null;
        if (i2 != 2) {
            qy6 qy62 = qy6.e;
            if (i2 == 8) {
                qy6[] qy6Arr = this.d;
                if (qy6Arr != null) {
                    qy6 = qy6Arr[3];
                }
                if (qy6 != null) {
                    return qy6;
                }
                qy6 j2 = j();
                qy6 t = t();
                int i4 = j2.d;
                if (i4 > t.d) {
                    return qy6.b(0, 0, 0, i4);
                }
                qy6 qy63 = this.g;
                return (qy63 == null || qy63.equals(qy62) || (i3 = this.g.d) <= t.d) ? qy62 : qy6.b(0, 0, 0, i3);
            } else if (i2 == 16) {
                return i();
            } else {
                if (i2 == 32) {
                    return g();
                }
                if (i2 == 64) {
                    return k();
                }
                if (i2 != 128) {
                    return qy62;
                }
                nsf nsf = this.f;
                ri4 e2 = nsf != null ? nsf.a.e() : e();
                if (e2 == null) {
                    return qy62;
                }
                DisplayCutout displayCutout = e2.a;
                return qy6.b(qi4.d(displayCutout), qi4.f(displayCutout), qi4.e(displayCutout), qi4.c(displayCutout));
            }
        } else if (z) {
            qy6 t2 = t();
            qy6 h2 = h();
            return qy6.b(Math.max(t2.a, h2.a), 0, Math.max(t2.c, h2.c), Math.max(t2.d, h2.d));
        } else {
            qy6 j3 = j();
            nsf nsf2 = this.f;
            if (nsf2 != null) {
                qy6 = nsf2.a.h();
            }
            int i5 = j3.d;
            if (qy6 != null) {
                i5 = Math.min(i5, qy6.d);
            }
            return qy6.b(j3.a, 0, j3.c, i5);
        }
    }

    public boolean v(int i2) {
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 4) {
                return false;
            }
            if (!(i2 == 8 || i2 == 128)) {
                return true;
            }
        }
        return !s(i2, false).equals(qy6.e);
    }

    public void x(qy6 qy6) {
        this.g = qy6;
    }
}
