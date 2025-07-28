package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: o58  reason: default package */
public final class o58 {
    public final Context a;
    public final String b;

    public o58(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context.getApplicationContext();
                this.b = "ActivityThemer";
                return;
            default:
                this.a = context.getApplicationContext();
                this.b = o58.class.getName();
                return;
        }
    }

    public m58 a(Uri uri) {
        e75 e75;
        boolean z;
        l58 l58 = new l58(this.a, uri);
        t74 t74 = new t74();
        synchronized (t74) {
            t74.b = 1;
        }
        synchronized (t74) {
            t74.c = 6;
        }
        Uri uri2 = l58.a.getUri();
        if (uri2 != null) {
            e75[] b2 = t74.b(uri2, iw4.a);
            if (b2.length == 1) {
                return new m58(b2[0], l58);
            }
            int length = b2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    e75 = null;
                    break;
                }
                e75 = b2[i];
                try {
                    r74 r74 = l58.b;
                    if (r74 != null) {
                        z = e75.n(r74);
                        r74 r742 = l58.b;
                        if (r742 != null) {
                            r742.Y = 0;
                        }
                        if (z) {
                            break;
                        }
                        i++;
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } catch (Throwable unused) {
                    r74 r743 = l58.b;
                    if (r743 != null) {
                        r743.Y = 0;
                    }
                    z = false;
                }
            }
            for (e75 e752 : b2) {
                if (!hhd.f(e752, e75)) {
                    e752.release();
                }
            }
            if (e75 != null) {
                return new m58(e75, l58);
            }
            l58.close();
            return null;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
