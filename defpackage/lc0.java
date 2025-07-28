package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.LruCache;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: lc0  reason: default package */
public final class lc0 {
    public static final int j;
    public static final jc0 k = new LruCache(20);
    public final w6a a;
    public final t52 b;
    public final pc0 c;
    public final tf3 d;
    public final String e;
    public final CharSequence f;
    public final Long g;
    public final int h;
    public final boolean i;

    /* JADX WARNING: type inference failed for: r0v0, types: [jc0, android.util.LruCache] */
    static {
        int dimension = (int) Resources.getSystem().getDimension(17104901);
        if (dimension == 0) {
            dimension = Math.round(((float) 64) * Resources.getSystem().getDisplayMetrics().density);
        }
        j = dimension;
    }

    public lc0(w6a w6a, t52 t52, pc0 pc0, CharSequence charSequence) {
        this.h = -1;
        this.a = w6a;
        this.c = pc0;
        this.f = charSequence;
        this.g = null;
        this.i = false;
        this.b = t52;
    }

    public static Bitmap a(Context context, w6a w6a, t52 t52, pc0 pc0, tf3 tf3, String str, String str2, qmc qmc) {
        int i2 = j;
        lc0 lc0 = str != null ? new lc0(w6a, t52, pc0, str) : tf3 != null ? new lc0(w6a, t52, pc0, tf3) : new lc0(w6a, t52, pc0, (CharSequence) null);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (lc0.b(str2) == null) {
            Drawable c2 = lc0.c(context);
            c2.setBounds(0, 0, i2, i2);
            c2.draw(canvas);
        } else {
            ov9 r = new n73(2, new ic0(lc0, str2, i2, context)).r(qmc);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Objects.requireNonNull(timeUnit, "unit is null");
            iu7.a0(new xv9(r, 1000, timeUnit, qmc), new hc0(i2, 0, canvas), new ic0((Object) canvas, (Object) lc0, (Object) context, i2), z3d.i);
        }
        return createBitmap;
    }

    public final Uri b(String str) {
        String str2 = this.e;
        if (str2 != null) {
            return at7.x(str2);
        }
        fj0 fj0 = fj0.c;
        tf3 tf3 = this.d;
        if (tf3 != null) {
            return at7.x(tf3.q(str, fj0));
        }
        return null;
    }

    public final Drawable c(Context context) {
        int i2;
        tf3 tf3 = this.d;
        Bitmap bitmap = tf3 != null ? (Bitmap) k.get(Long.valueOf(tf3.n() ^ this.b.J())) : null;
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                return new BitmapDrawable(context.getResources(), bitmap.copy(bitmap.getConfig(), false));
            } catch (Throwable th) {
                udd.S("lc0", "couldnt use cached bitmap", th);
            }
        }
        if (this.e != null && (i2 = this.h) != -1) {
            return gq3.b(context, i2);
        }
        boolean z = this.i;
        w6a w6a = this.a;
        pc0 pc0 = this.c;
        if (tf3 != null) {
            return new qc0(pc0, tf3, z);
        }
        CharSequence charSequence = this.f;
        if (r1g.p(charSequence)) {
            return gq3.b(context, 0);
        }
        Long l = this.g;
        if (l == null || l.longValue() == 0) {
            return new qc0(pc0, w6a, charSequence);
        }
        return new qc0(this.c, this.a, this.f, l.longValue(), this.i);
    }

    public lc0(w6a w6a, t52 t52, pc0 pc0, tf3 tf3) {
        this.g = null;
        this.h = -1;
        this.a = w6a;
        this.c = pc0;
        this.d = tf3;
        this.b = t52;
    }

    public lc0(w6a w6a, t52 t52, pc0 pc0, String str) {
        this.g = null;
        this.a = w6a;
        this.c = pc0;
        this.e = str;
        this.h = 0;
        this.b = t52;
    }
}
