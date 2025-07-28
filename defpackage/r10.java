package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.util.Base64;
import android.util.LruCache;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: r10  reason: default package */
public final class r10 implements wz {
    public final Context a;
    public final b00 b;
    public final zpc c;
    public final HashMap d = new HashMap();
    public final Map e = Collections.synchronizedMap(new q16(200, 0));
    public final LruCache f = new LruCache(200);
    public final HashSet g = new HashSet();
    public final n83 h = new Object();

    /* JADX WARNING: type inference failed for: r1v6, types: [n83, java.lang.Object] */
    public r10(Context context, b00 b00, zpc zpc) {
        this.a = context;
        this.b = b00;
        this.c = zpc;
    }

    public final Uri a(o10 o10) {
        a10 a10;
        b00 b00 = this.b;
        b00.getClass();
        Uri uri = (Uri) b00.d.get(o10.q);
        if (uri != null) {
            return uri;
        }
        boolean i = o10.i();
        v00 v00 = o10.j;
        if (i || ete.L(o10)) {
            return at7.x((ete.L(o10) ? v00.d.d : o10.d).d);
        } else if (o10.f() || ete.J(o10)) {
            return at7.x((ete.J(o10) ? v00.d.b : o10.b).a());
        } else if (!o10.g() || (a10 = o10.g.f) == null) {
            return uri;
        } else {
            return at7.x(a10 != null ? a10.a() : null);
        }
    }

    public final BitmapDrawable b(o10 o10, boolean z) {
        o10 o102;
        q10 q10 = new q10(o10.q, z);
        Map map = this.e;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) map.get(q10);
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        v00 v00 = o10.j;
        if (!(v00 == null || (o102 = v00.d) == null)) {
            o10 = o102;
        }
        byte[] A = ete.A(o10);
        if (A == null || A.length == 0) {
            return null;
        }
        if (z) {
            try {
                this.c.getClass();
            } catch (Exception e2) {
                udd.s("r10", "AttachmentsPreviewCache:", e2);
            }
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(A, 0, A.length);
        if (decodeByteArray == null) {
            return null;
        }
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(this.a.getResources(), decodeByteArray);
        map.put(q10, bitmapDrawable2);
        return bitmapDrawable2;
    }

    public final Uri c(o10 o10, boolean z) {
        o10 o102;
        q10 q10 = new q10(o10.q, z);
        LruCache lruCache = this.f;
        Uri uri = (Uri) lruCache.get(q10);
        if (uri != null) {
            return uri;
        }
        v00 v00 = o10.j;
        if (!(v00 == null || (o102 = v00.d) == null)) {
            o10 = o102;
        }
        byte[] A = ete.A(o10);
        if (A == null || A.length == 0) {
            return null;
        }
        if (z) {
            try {
                this.c.getClass();
            } catch (Exception e2) {
                udd.s("r10", "AttachmentsPreviewCache:", e2);
            }
        }
        String encodeToString = Base64.encodeToString(A, 2);
        Uri parse = Uri.parse("data:image/png;base64," + encodeToString);
        lruCache.put(q10, parse);
        return parse;
    }
}
