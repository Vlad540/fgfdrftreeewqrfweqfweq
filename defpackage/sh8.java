package defpackage;

import java.util.Locale;
import java.util.Map;

/* renamed from: sh8  reason: default package */
public abstract class sh8 {
    public static final Map a = ju7.T(new wia("mkv", "video/x-matroska"), new wia("glb", "model/gltf-binary"));

    public static final String a(String str) {
        int e0 = h0e.e0(str, '.', 0, 6);
        String substring = (e0 < 0 || e0 == str.length() + -1) ? null : str.substring(e0 + 1);
        if (substring == null) {
            return null;
        }
        String lowerCase = substring.toLowerCase(Locale.US);
        String str2 = (String) a49.b.get(lowerCase);
        if (str2 == null) {
            str2 = a49.a.getMimeTypeFromExtension(lowerCase);
        }
        return str2 == null ? (String) a.get(lowerCase) : str2;
    }
}
