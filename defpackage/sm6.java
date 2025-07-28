package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: sm6  reason: default package */
public final class sm6 {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final List g;
    public final String h;
    public final String i;

    public sm6(String str, String str2, String str3, String str4, int i2, ArrayList arrayList, String str5, String str6) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = arrayList;
        this.h = str5;
        this.i = str6;
        this.a = hhd.f(str, "https");
    }

    public final String a() {
        if (this.d.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        String str = this.i;
        int Z = h0e.Z(str, ':', this.b.length() + 3, false, 4) + 1;
        int Z2 = h0e.Z(str, '@', 0, false, 6);
        if (str != null) {
            return str.substring(Z, Z2);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String b() {
        String str = this.i;
        int Z = h0e.Z(str, '/', this.b.length() + 3, false, 4);
        return str.substring(Z, nze.f(str, Z, str.length(), "?#"));
    }

    public final ArrayList c() {
        String str = this.i;
        int Z = h0e.Z(str, '/', this.b.length() + 3, false, 4);
        int f2 = nze.f(str, Z, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (Z < f2) {
            int i2 = Z + 1;
            int e2 = nze.e('/', i2, f2, str);
            arrayList.add(str.substring(i2, e2));
            Z = e2;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int Z = h0e.Z(str, '?', 0, false, 6) + 1;
        return str.substring(Z, nze.e('#', Z, str.length(), str));
    }

    public final String e() {
        if (this.c.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.b.length() + 3;
        String str = this.i;
        int f2 = nze.f(str, length, str.length(), ":@");
        if (str != null) {
            return str.substring(length, f2);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sm6) && hhd.f(((sm6) obj).i, this.i);
    }

    public final u93 f() {
        u93 u93 = new u93();
        String str = this.b;
        u93.e = str;
        u93.f = e();
        u93.g = a();
        u93.h = this.e;
        int i2 = smc.i(str);
        int i3 = this.f;
        if (i3 == i2) {
            i3 = -1;
        }
        u93.b = i3;
        ArrayList arrayList = u93.c;
        arrayList.clear();
        arrayList.addAll(c());
        String d2 = d();
        String str2 = null;
        u93.d = d2 != null ? smc.n(smc.a(d2, 0, 0, " \"'<>#", true, false, true, false, 211)) : null;
        if (this.h != null) {
            String str3 = this.i;
            int Z = h0e.Z(str3, '#', 0, false, 6) + 1;
            if (str3 != null) {
                str2 = str3.substring(Z);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        u93.i = str2;
        return u93;
    }

    public final String g() {
        u93 u93;
        try {
            u93 = new u93();
            u93.j(this, "/...");
        } catch (IllegalArgumentException unused) {
            u93 = null;
        }
        u93.getClass();
        u93.f = smc.a(BuildConfig.FLAVOR, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        u93.g = smc.a(BuildConfig.FLAVOR, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return u93.b().i;
    }

    public final URI h() {
        u93 f2 = f();
        String str = (String) f2.h;
        String str2 = null;
        f2.h = str != null ? Pattern.compile("[\"<>^`{|}]").matcher(str).replaceAll(BuildConfig.FLAVOR) : null;
        ArrayList arrayList = f2.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, smc.a((String) arrayList.get(i2), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = f2.d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str3 = (String) arrayList2.get(i3);
                arrayList2.set(i3, str3 != null ? smc.a(str3, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str4 = (String) f2.i;
        if (str4 != null) {
            str2 = smc.a(str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        f2.i = str2;
        String u93 = f2.toString();
        try {
            return new URI(u93);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(u93).replaceAll(BuildConfig.FLAVOR));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }
}
