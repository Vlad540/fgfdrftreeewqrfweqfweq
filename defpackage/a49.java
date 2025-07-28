package defpackage;

import android.webkit.MimeTypeMap;
import java.util.Map;

/* renamed from: a49  reason: default package */
public abstract class a49 {
    public static final MimeTypeMap a = MimeTypeMap.getSingleton();
    public static final Map b = at6.b("heif", "image/heif", "heic", "image/heic");

    static {
        at6.b("image/heif", "heif", "image/heic", "heic");
    }
}
