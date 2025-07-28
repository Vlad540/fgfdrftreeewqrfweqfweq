package defpackage;

import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: g46  reason: default package */
public final class g46 extends h46 {
    public static final g46 f = new h46();
    public static final Uri g = MediaStore.Video.Media.getContentUri("external");
    public static final String h = "_id";
    public static final String i = "bucket_id";
    public static final String j = "bucket_display_name";
    public static final String k = "_data";
    public static final String l = "date_modified";
    public static final String m = "mime_type";
    public static final String n = "duration";
    public static final String o = "video/mp4";

    public final String a() {
        return j;
    }

    public final String b() {
        return i;
    }

    public final String c() {
        return k;
    }

    public final String d() {
        return l;
    }

    public final String e() {
        return n;
    }

    public final String f() {
        return h;
    }

    public final String g() {
        return m;
    }

    public final Uri i() {
        return g;
    }

    public final String j() {
        return o;
    }
}
