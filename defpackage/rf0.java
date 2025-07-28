package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: rf0  reason: default package */
public abstract /* synthetic */ class rf0 {
    public static /* synthetic */ char a(int i) {
        if (i == 1) {
            return 'u';
        }
        if (i == 2) {
            return 'g';
        }
        throw null;
    }

    public static int b(float f, float f2, int i, int i2) {
        return a24.X(f * f2) + i + i2;
    }

    public static jc3 c(int i, int i2, Bundle bundle) {
        return a24.a(new hge(i), bundle, i2);
    }

    public static yn6 d(s59 s59, Context context) {
        return s59.n(context).g().getIcon();
    }

    public static Object e(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String f(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String g(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder i(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static void j(String str, l05 l05) {
        taf.o(l05, new a34(str));
    }

    public static void k(boolean z, vgc vgc, boolean z2, String str) {
        vgc.c(new bhd(z));
        vgc.a(new bhd(z2));
        vgc.d(str);
    }

    public static int l(float f, float f2, int i, int i2) {
        return i2 - (a24.X(f * f2) * i);
    }

    public static /* synthetic */ String m(int i) {
        if (i == 1) {
            return "USER";
        }
        if (i == 2) {
            return "GROUP";
        }
        throw null;
    }

    public static /* synthetic */ String n(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND";
    }

    public static /* synthetic */ String p(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "VIDEO" : "AUDIO" : "UNKNOWN";
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "UNKNOWN" : "BACK" : "FRONT";
    }

    public static /* synthetic */ String s(int i) {
        switch (i) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "INITIALIZED";
            case 3:
                return "GET_SURFACE";
            case 4:
                return "OPENING";
            case 5:
                return "OPENED";
            case 6:
                return "CLOSED";
            case 7:
                return "RELEASING";
            case 8:
                return "RELEASED";
            default:
                return "null";
        }
    }
}
