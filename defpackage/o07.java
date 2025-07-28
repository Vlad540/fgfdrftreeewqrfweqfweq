package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: o07  reason: default package */
public final class o07 {
    public final n07 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public o07(n07 n07, int[] iArr, String[] strArr) {
        this.a = n07;
        this.b = iArr;
        this.c = strArr;
        this.d = (strArr.length == 0) ^ true ? Collections.singleton(strArr[0]) : qw4.a;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final void a(Set set) {
        int[] iArr = this.b;
        int length = iArr.length;
        Set set2 = qw4.a;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                u3d u3d = new u3d();
                int length2 = iArr.length;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        u3d.add(this.c[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                set2 = z3d.h(u3d);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                set2 = this.d;
            }
        }
        if (!set2.isEmpty()) {
            this.a.a(set2);
        }
    }
}
