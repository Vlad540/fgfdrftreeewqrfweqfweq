package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: hr1  reason: default package */
public abstract /* synthetic */ class hr1 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

    public static /* synthetic */ Integer a(int i) {
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(i - 1);
    }

    public static /* synthetic */ int b(int i, int i2) {
        if (i != 0 && i2 != 0) {
            return i - i2;
        }
        throw null;
    }

    public static /* synthetic */ boolean c(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "STICKER";
            case 3:
                return "STICKER_SET";
            case 4:
                return "FAVORITE_STICKER";
            case 5:
                return "FAVORITE_STICKER_SET";
            case 6:
                return "RECENT";
            case 7:
                return "BACKGROUND";
            case 8:
                return "ANIMOJI";
            case 9:
                return "ANIMOJI_SET";
            case 10:
                return "REACTION";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "PRESET_AVATAR";
        }
        if (i == 2) {
            return "USER_AVATAR";
        }
        throw null;
    }

    public static String f(String str, c34 c34) {
        return (str + c34).toString();
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static String h(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String i(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static String j(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder k(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder l(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap n(Class cls, mx mxVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, mxVar);
        return hashMap;
    }

    public static List o(long j) {
        return Collections.singletonList(new Long(j));
    }

    public static Map p(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void q(float f, float f2, hw9 hw9) {
        hw9.e(a24.X(f * f2));
    }

    public static /* synthetic */ void r(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void s(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static /* synthetic */ int t(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String u(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "STICKER";
            case 3:
                return "STICKER_SET";
            case 4:
                return "FAVORITE_STICKER";
            case 5:
                return "FAVORITE_STICKER_SET";
            case 6:
                return "RECENT";
            case 7:
                return "BACKGROUND";
            case 8:
                return "ANIMOJI";
            case 9:
                return "ANIMOJI_SET";
            case 10:
                return "REACTION";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String v(int i) {
        return i != 1 ? i != 2 ? "null" : "MediaGallery" : "Camera";
    }

    public static /* synthetic */ int[] w(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }
}
