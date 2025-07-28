package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: fq6  reason: default package */
public final class fq6 {
    public final j2b a;
    public final t97 b;
    public final t97 c;
    public final t97 d;

    public fq6(j2b j2b, t97 t97, t97 t972, t97 t973) {
        this.a = j2b;
        this.b = t97;
        this.c = t972;
        this.d = t973;
    }

    public static String a(Uri uri) {
        if (!uri.isHierarchical()) {
            return uri.toString();
        }
        String queryParameter = uri.getQueryParameter("bid");
        String queryParameter2 = uri.getQueryParameter("t");
        return (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) ? uri.toString() : me4.j("ok-image-cache:bid=", queryParameter, "&t=", queryParameter2);
    }
}
