package defpackage;

import android.net.Uri;

/* renamed from: sl  reason: default package */
public abstract class sl {
    public static final Uri a = Uri.parse("https://api.ok.ru");

    public static final Uri a(String str) {
        return Uri.parse("ok://api/api/".concat(str.replace('.', '/')));
    }

    public static final String b(Uri uri) {
        String uri2 = uri.toString();
        if (p0e.Q(uri2, "ok://api/api/", false)) {
            return uri2.substring(13).replace('/', '.');
        }
        throw new IllegalArgumentException("Unknown uri " + uri);
    }
}
