package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: wn6  reason: default package */
public abstract /* synthetic */ class wn6 {
    public static final boolean a(int i, int i2) {
        return (b(i) & i2) != 0;
    }

    public static final int b(int i) {
        return 1 << hr1.t(i);
    }

    public static /* synthetic */ long c(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ int d(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 10;
        }
        throw null;
    }

    public static khb e(n7c n7c, Class cls, String str, String str2, int i) {
        n7c.getClass();
        return new khb(cls, str, str2, i);
    }

    public static khb f(Class cls, String str, String str2, int i, n7c n7c) {
        khb khb = new khb(cls, str, str2, i);
        n7c.getClass();
        return khb;
    }

    public static Bundle g(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i);
        return bundle;
    }

    public static String h(int i, String str) {
        return str + i;
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String k(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static void m(int i, yr yrVar, String str, int i2, String str2) {
        yrVar.put(str, Integer.valueOf(i));
        yrVar.put(str2, Integer.valueOf(i2));
    }

    public static /* synthetic */ void n(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void o(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ String p(int i) {
        if (i == 1) {
            return "GOOD";
        }
        if (i == 2) {
            return "BAD_LEVEL_1";
        }
        if (i == 3) {
            return "BAD_LEVEL_2";
        }
        throw null;
    }

    public static /* synthetic */ String q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "FORWARD" : "REPLY" : "UNKNOWN";
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "PRIORITY_HIGH_ACCURACY" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_NO_POWER";
    }

    public static /* synthetic */ String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "BAD_LEVEL_2" : "BAD_LEVEL_1" : "GOOD";
    }
}
