package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: gn  reason: default package */
public final class gn {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static gn c;
    public mbc a;

    public static synchronized gn a() {
        gn gnVar;
        synchronized (gn.class) {
            try {
                if (c == null) {
                    d();
                }
                gnVar = c;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return gnVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter g;
        synchronized (gn.class) {
            g = mbc.g(i, mode);
        }
        return g;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [gn, java.lang.Object] */
    public static synchronized void d() {
        synchronized (gn.class) {
            if (c == null) {
                ? obj = new Object();
                c = obj;
                obj.a = mbc.c();
                mbc mbc = c.a;
                s30 s30 = new s30();
                synchronized (mbc) {
                    mbc.e = s30;
                }
            }
        }
    }

    public static void e(Drawable drawable, od3 od3, int[] iArr) {
        PorterDuff.Mode mode = mbc.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = od3.c;
            if (z || od3.b) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? (ColorStateList) od3.d : null;
                PorterDuff.Mode mode2 = od3.b ? (PorterDuff.Mode) od3.e : mbc.f;
                if (!(colorStateList == null || mode2 == null)) {
                    porterDuffColorFilter = mbc.g(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
                return;
            }
            drawable.clearColorFilter();
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.f(context, i);
    }
}
