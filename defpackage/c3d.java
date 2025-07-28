package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

/* renamed from: c3d  reason: default package */
public abstract /* synthetic */ class c3d {
    /* JADX WARNING: type inference failed for: r4v2, types: [android.view.ViewParent] */
    /* JADX WARNING: type inference failed for: r4v5, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            int r4 = hr1.t(r4)
            r0 = 0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r4 == 0) goto L_0x005a
            r3 = 1
            if (r4 == r3) goto L_0x0030
            if (r4 == r2) goto L_0x0021
            r6 = 3
            if (r4 == r6) goto L_0x0013
            goto L_0x0076
        L_0x0013:
            boolean r4 = android.util.Log.isLoggable(r1, r2)
            if (r4 == 0) goto L_0x001c
            r5.toString()
        L_0x001c:
            r4 = 4
            r5.setVisibility(r4)
            goto L_0x0076
        L_0x0021:
            boolean r4 = android.util.Log.isLoggable(r1, r2)
            if (r4 == 0) goto L_0x002a
            r5.toString()
        L_0x002a:
            r4 = 8
            r5.setVisibility(r4)
            goto L_0x0076
        L_0x0030:
            boolean r4 = android.util.Log.isLoggable(r1, r2)
            if (r4 == 0) goto L_0x0039
            r5.toString()
        L_0x0039:
            android.view.ViewParent r4 = r5.getParent()
            boolean r3 = r4 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0044
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x0044:
            if (r0 != 0) goto L_0x0055
            boolean r4 = android.util.Log.isLoggable(r1, r2)
            if (r4 == 0) goto L_0x0052
            r5.toString()
            r6.toString()
        L_0x0052:
            r6.addView(r5)
        L_0x0055:
            r4 = 0
            r5.setVisibility(r4)
            goto L_0x0076
        L_0x005a:
            android.view.ViewParent r4 = r5.getParent()
            boolean r6 = r4 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x0065
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x0065:
            if (r0 == 0) goto L_0x0076
            boolean r4 = android.util.Log.isLoggable(r1, r2)
            if (r4 == 0) goto L_0x0073
            r5.toString()
            r0.toString()
        L_0x0073:
            r0.removeView(r5)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c3d.a(int, android.view.View, android.view.ViewGroup):void");
    }

    public static /* synthetic */ int b(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 10;
        }
        if (i == 3) {
            return 20;
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "SYSTEM";
        }
        if (i == 3) {
            return "USER";
        }
        throw null;
    }

    public static int d(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int e(int i, int i2, mge mge) {
        return (mge.hashCode() + i) * i2;
    }

    public static int f(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static hc9 g(n7c n7c, Class cls, String str, String str2) {
        n7c.getClass();
        return new hc9(cls, str, str2);
    }

    public static i4e h(ArrayList arrayList, i4e i4e) {
        arrayList.add(i4e);
        return new i4e();
    }

    public static String i(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static StringBuilder j(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static EnumMap k(long j, EnumMap enumMap, yq4 yq4, Class cls) {
        enumMap.put(yq4, new ah4(j));
        return new EnumMap(cls);
    }

    public static void l(int i, j4e j4e, long j, i4e i4e) {
        i4e.a(new xa0(i, j4e, j));
    }

    public static void m(long j, EnumMap enumMap, yq4 yq4) {
        enumMap.put(yq4, new ah4(j));
    }

    public static /* synthetic */ void n(pg7 pg7) {
        throw new ClassCastException();
    }

    public static void o(String str, String str2) {
        ez3.j0(str + str2);
    }

    public static /* synthetic */ String p(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "NONE" : "MUTED" : "TALKING";
    }

    public static /* synthetic */ String q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "USER" : "SYSTEM" : "UNKNOWN";
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "SET_SHOWCASE" : "SET" : "POPULAR" : "FAVORITE" : "RECENT";
    }

    public static /* synthetic */ String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "LOTTIE" : "LIVE" : "STATIC" : "UNKNOWN";
    }

    public static /* synthetic */ String t(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "BOT_COMMAND_DESCRIPTION" : "BOT_COMMAND" : "BOT_TAG" : "CONTACT";
    }
}
