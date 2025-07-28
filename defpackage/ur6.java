package defpackage;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ur6  reason: default package */
public final class ur6 {
    public static final HashSet s = new HashSet();
    public Uri a;
    public sr6 b;
    public int c;
    public hbc d;
    public rfc e;
    public gq6 f;
    public rr6 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public u3b k;
    public k1b l;
    public Boolean m;
    public tac n;
    public Boolean o;
    public vl4 p;
    public int q;
    public String r;

    public static ur6 b(tr6 tr6) {
        ur6 d2 = d(tr6.b);
        d2.f = tr6.h;
        tr6.getClass();
        d2.getClass();
        rr6 rr6 = tr6.a;
        d2.g = rr6;
        d2.i = tr6.f;
        d2.j = tr6.g;
        d2.b = tr6.l;
        d2.c = tr6.m;
        if (rr6 != rr6.c) {
            d2.r = null;
        }
        d2.l = tr6.q;
        d2.h = tr6.e;
        d2.k = tr6.k;
        d2.d = tr6.i;
        d2.n = tr6.r;
        d2.e = tr6.j;
        d2.m = tr6.p;
        d2.q = tr6.v;
        d2.r = tr6.u;
        d2.p = tr6.t;
        d2.o = tr6.s;
        return d2;
    }

    public static boolean c(Uri uri) {
        HashSet hashSet = s;
        if (!(hashSet == null || uri == null)) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(uri.getScheme())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ur6, java.lang.Object] */
    public static ur6 d(Uri uri) {
        ? obj = new Object();
        obj.a = null;
        obj.b = sr6.FULL_FETCH;
        obj.c = 0;
        obj.d = null;
        obj.e = null;
        obj.f = gq6.c;
        obj.g = rr6.b;
        obj.h = false;
        obj.i = false;
        obj.j = false;
        obj.k = u3b.c;
        obj.l = null;
        obj.m = null;
        obj.o = null;
        obj.p = null;
        obj.r = null;
        uri.getClass();
        obj.a = uri;
        return obj;
    }

    public final tr6 a() {
        Uri uri = this.a;
        if (uri != null) {
            if ("res".equals(fye.b(uri))) {
                if (!this.a.isAbsolute()) {
                    throw new ImageRequestBuilder$BuilderException("Resource URI path must be absolute.");
                } else if (!this.a.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new ImageRequestBuilder$BuilderException("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new ImageRequestBuilder$BuilderException("Resource URI must not be empty");
                }
            }
            if (!"asset".equals(fye.b(this.a)) || this.a.isAbsolute()) {
                return new tr6(this);
            }
            throw new ImageRequestBuilder$BuilderException("Asset URI path must be absolute.");
        }
        throw new ImageRequestBuilder$BuilderException("Source must be set!");
    }
}
