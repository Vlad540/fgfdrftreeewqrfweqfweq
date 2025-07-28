package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: uoe  reason: default package */
public final class uoe {
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public final int a;
    public final String b;
    public final int c;
    public final xu5[] d;
    public int e;

    static {
        int i = oze.a;
    }

    public uoe(String str, xu5... xu5Arr) {
        int i = 1;
        oyb.d(xu5Arr.length > 0);
        this.b = str;
        this.d = xu5Arr;
        this.a = xu5Arr.length;
        int g2 = c49.g(xu5Arr[0].n);
        this.c = g2 == -1 ? c49.g(xu5Arr[0].m) : g2;
        String str2 = xu5Arr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? BuildConfig.FLAVOR : str2;
        int i2 = xu5Arr[0].f | 16384;
        while (i < xu5Arr.length) {
            String str3 = xu5Arr[i].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? BuildConfig.FLAVOR : str3)) {
                e("languages", i, xu5Arr[0].d, xu5Arr[i].d);
                return;
            } else if (i2 != (xu5Arr[i].f | 16384)) {
                e("role flags", i, Integer.toBinaryString(xu5Arr[0].f), Integer.toBinaryString(xu5Arr[i].f));
                return;
            } else {
                i++;
            }
        }
    }

    public static uoe b(Bundle bundle) {
        e8c e8c;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f);
        if (parcelableArrayList == null) {
            po5 po5 = ws6.b;
            e8c = e8c.X;
        } else {
            e8c = gt0.v(new kce(17), parcelableArrayList);
        }
        return new uoe(bundle.getString(g, BuildConfig.FLAVOR), (xu5[]) e8c.toArray(new xu5[0]));
    }

    public static void e(String str, int i, String str2, String str3) {
        StringBuilder j = c3d.j("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        j.append(str3);
        j.append("' (track ");
        j.append(i);
        j.append(")");
        ez3.B(BuildConfig.FLAVOR, new IllegalStateException(j.toString()));
    }

    public final uoe a(String str) {
        return new uoe(str, this.d);
    }

    public final xu5 c() {
        return this.d[0];
    }

    public final int d(xu5 xu5) {
        int i = 0;
        while (true) {
            xu5[] xu5Arr = this.d;
            if (i >= xu5Arr.length) {
                return -1;
            }
            if (xu5 == xu5Arr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uoe.class != obj.getClass()) {
            return false;
        }
        uoe uoe = (uoe) obj;
        return this.b.equals(uoe.b) && Arrays.equals(this.d, uoe.d);
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        xu5[] xu5Arr = this.d;
        ArrayList arrayList = new ArrayList(xu5Arr.length);
        for (xu5 d2 : xu5Arr) {
            arrayList.add(d2.d(true));
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + me4.d(527, 31, this.b);
        }
        return this.e;
    }
}
