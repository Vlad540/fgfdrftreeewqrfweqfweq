package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: wk  reason: default package */
public final class wk {
    public static final wk f = new wk((String) null, (String) null, (String) null);
    public final String a;
    public final String b = null;
    public final String c = null;
    public final String d;
    public final String e;

    public wk(String str, String str2, String str3) {
        this.a = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof wk) {
                wk wkVar = (wk) obj;
                if (!hhd.f(this.e, wkVar.e) || !hhd.f(this.d, wkVar.d) || !hhd.f(this.c, wkVar.c) || !hhd.f(this.b, wkVar.b) || !hhd.f(this.a, wkVar.a)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiConfig{appKey='");
        sb.append(this.a);
        sb.append("', userId='");
        sb.append(this.b);
        sb.append("', token='");
        sb.append(this.c);
        sb.append("', sessionKey='");
        sb.append(this.d);
        sb.append("', sessionSecret='");
        Locale locale = Locale.US;
        String str = this.e;
        sb.append(String.format(locale, "0x%08x", Arrays.copyOf(new Object[]{Integer.valueOf(str != null ? str.hashCode() : 0)}, 1)));
        sb.append("'}");
        return sb.toString();
    }
}
