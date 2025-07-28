package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: wza  reason: default package */
public class wza implements syc, gw0 {
    public final String a;
    public final t66 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final t97 i;
    public final t97 j;
    public final t97 k;

    public wza(String str, t66 t66, int i2) {
        this.a = str;
        this.b = t66;
        this.c = i2;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = iw4.a;
        this.i = ez3.O(2, new vza(this, 0));
        this.j = ez3.O(2, new vza(this, 1));
        this.k = ez3.O(2, new vza(this, 2));
    }

    public final String a() {
        return this.a;
    }

    public final Set b() {
        return this.h.keySet();
    }

    public final boolean c() {
        return false;
    }

    public final int d(String str) {
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public d8 e() {
        return t0e.f;
    }

    public boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof wza) {
            syc syc = (syc) obj;
            if (hhd.f(this.a, syc.a()) && Arrays.equals((syc[]) this.j.getValue(), (syc[]) ((wza) obj).j.getValue()) && (i2 = this.c) == syc.f()) {
                int i3 = 0;
                while (i3 < i2) {
                    if (hhd.f(i(i3).a(), syc.i(i3).a()) && hhd.f(i(i3).e(), syc.i(i3).e())) {
                        i3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.c;
    }

    public final String g(int i2) {
        return this.e[i2];
    }

    public final List getAnnotations() {
        return hw4.a;
    }

    public final List h(int i2) {
        List list = this.f[i2];
        return list == null ? hw4.a : list;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    public syc i(int i2) {
        return ((l77[]) this.i.getValue())[i2].d();
    }

    public boolean isInline() {
        return false;
    }

    public final boolean j(int i2) {
        return this.g[i2];
    }

    public final void k(String str, boolean z) {
        int i2 = this.d + 1;
        this.d = i2;
        String[] strArr = this.e;
        strArr[i2] = str;
        this.g[i2] = z;
        this.f[i2] = null;
        if (i2 == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                hashMap.put(strArr[i3], Integer.valueOf(i3));
            }
            this.h = hashMap;
        }
    }

    public String toString() {
        return o23.c0(gwf.S(0, this.c), ", ", me4.l(new StringBuilder(), this.a, '('), ")", new e98(21, this), 24);
    }
}
