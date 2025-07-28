package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: dk7  reason: default package */
public final class dk7 implements iq6 {
    public final Context a;
    public final zr7 b;

    public dk7(Context context, zr7 zr7) {
        this.a = context;
        this.b = zr7;
    }

    public final b13 a(ax4 ax4, int i, tjb tjb, gq6 gq6) {
        Context context = this.a;
        try {
            String str = ax4.z0;
            if (str != null) {
                mhe b2 = gq3.b(context, Integer.parseInt(Uri.parse(str).getPathSegments().get(0)));
                mhe mhe = b2 instanceof mhe ? b2 : null;
                s59 s59 = km4.y0;
                if (mhe != null) {
                    mhe.onThemeChanged(s59.n(context).g());
                }
                if (b2 != null) {
                    return new r54(b2, (t0c) s59.n(context).x0, this.b);
                }
                return null;
            }
            throw new IllegalStateException("No source in encoded image".toString());
        } catch (Throwable th) {
            m75.c("DrawableImageDecoder", "Cannot decode drawable", th);
            return null;
        }
    }
}
