package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;

/* renamed from: th2  reason: default package */
public abstract /* synthetic */ class th2 {
    public static int a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 2332679:
                if (str.equals("LEFT")) {
                    c = 0;
                    break;
                }
                break;
            case 269808705:
                if (str.equals("REMOVING")) {
                    c = 1;
                    break;
                }
                break;
            case 1809818688:
                if (str.equals("REMOVED")) {
                    c = 2;
                    break;
                }
                break;
            case 1925346054:
                if (str.equals("ACTIVE")) {
                    c = 3;
                    break;
                }
                break;
            case 1990776172:
                if (str.equals("CLOSED")) {
                    c = 4;
                    break;
                }
                break;
            case 2130809258:
                if (str.equals("HIDDEN")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 5;
            case 5:
                return 6;
            default:
                throw new IllegalArgumentException(wn6.i("No such value ", str, " for ChatStatus"));
        }
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "add";
        }
        if (i == 2) {
            return "remove";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "DIALOG";
        }
        if (i == 3) {
            return "CHAT";
        }
        if (i == 4) {
            return "CHANNEL";
        }
        if (i == 5) {
            return "GROUP_CHAT";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "BLOCK";
        }
        if (i == 2) {
            return "UNBLOCK";
        }
        if (i == 3) {
            return "REMOVE";
        }
        if (i == 4) {
            return "ADD";
        }
        if (i == 5) {
            return "UPDATE";
        }
        throw null;
    }

    public static int e(int i, float f, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int f(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static String g(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.F());
        return sb.toString();
    }

    public static ArrayList h(int i, HashMap hashMap, ArrayList arrayList, int i2, String str) {
        hashMap.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    public static EnumMap i(float f, int i, EnumMap enumMap, yq4 yq4, nge nge) {
        enumMap.put(yq4, ah4.a(ah4.b(i, f)));
        return nge.e();
    }

    public static void j(float f, int i, EnumMap enumMap, yq4 yq4) {
        enumMap.put(yq4, ah4.a(ah4.b(i, f)));
    }

    public static void k(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void l(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void m(HashMap hashMap, String str, Integer num, int i, String str2) {
        hashMap.put(str, num);
        hashMap.put(str2, Integer.valueOf(i));
    }

    public static EnumMap n(float f, int i, EnumMap enumMap, yq4 yq4, nge nge) {
        enumMap.put(yq4, ah4.a(ah4.b(i, f)));
        return nge.f();
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String p(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "GROUP_CHAT" : "CHANNEL" : "CHAT" : "DIALOG" : "UNKNOWN";
    }
}
