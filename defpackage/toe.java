package defpackage;

import java.util.Arrays;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: toe  reason: default package */
public final class toe implements lt0 {
    public static final kce X = new kce(16);
    public final int a;
    public final String b;
    public final vu5[] c;
    public int o;

    public toe(String str, vu5... vu5Arr) {
        int i = 1;
        swb.e(vu5Arr.length > 0);
        this.b = str;
        this.c = vu5Arr;
        this.a = vu5Arr.length;
        String str2 = vu5Arr[0].c;
        str2 = (str2 == null || str2.equals("und")) ? BuildConfig.FLAVOR : str2;
        int i2 = vu5Arr[0].X | 16384;
        while (i < vu5Arr.length) {
            String str3 = vu5Arr[i].c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? BuildConfig.FLAVOR : str3)) {
                b("languages", i, vu5Arr[0].c, vu5Arr[i].c);
                return;
            } else if (i2 != (vu5Arr[i].X | 16384)) {
                b("role flags", i, Integer.toBinaryString(vu5Arr[0].X), Integer.toBinaryString(vu5Arr[i].X));
                return;
            } else {
                i++;
            }
        }
    }

    public static void b(String str, int i, String str2, String str3) {
        StringBuilder sb = new StringBuilder(me4.e(me4.e(str.length() + 78, str2), str3));
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        oyb.b(BuildConfig.FLAVOR, new IllegalStateException(sb.toString()));
    }

    public final int a(vu5 vu5) {
        int i = 0;
        while (true) {
            vu5[] vu5Arr = this.c;
            if (i >= vu5Arr.length) {
                return -1;
            }
            if (vu5 == vu5Arr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || toe.class != obj.getClass()) {
            return false;
        }
        toe toe = (toe) obj;
        return this.a == toe.a && this.b.equals(toe.b) && Arrays.equals(this.c, toe.c);
    }

    public final int hashCode() {
        if (this.o == 0) {
            this.o = me4.d(527, 31, this.b) + Arrays.hashCode(this.c);
        }
        return this.o;
    }
}
