package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: ye6  reason: default package */
public final class ye6 implements Iterable, z67 {
    public final String[] a;

    public ye6(String[] strArr) {
        this.a = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.a;
        dz6 Q = gwf.Q(new dz6(strArr.length - 2, 0, -1), 2);
        int i = Q.a;
        int i2 = Q.b;
        int i3 = Q.c;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (!p0e.M(str, strArr[i], true)) {
                if (i != i2) {
                    i += i3;
                }
            }
            return strArr[i + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.a[i * 2];
    }

    public final xe6 c() {
        xe6 xe6 = new xe6(0);
        u23.M(xe6.a, this.a);
        return xe6;
    }

    public final String d(int i) {
        return this.a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ye6) {
            if (Arrays.equals(this.a, ((ye6) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final Iterator iterator() {
        int size = size();
        wia[] wiaArr = new wia[size];
        for (int i = 0; i < size; i++) {
            wiaArr[i] = new wia(b(i), d(i));
        }
        return new u1(2, wiaArr);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b = b(i);
            String d = d(i);
            sb.append(b);
            sb.append(": ");
            if (nze.p(b)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
