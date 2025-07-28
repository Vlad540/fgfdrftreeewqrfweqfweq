package defpackage;

import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: k25  reason: default package */
public final class k25 implements Enumeration {
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ k25(int i) {
        this.a = i;
    }

    public final boolean hasMoreElements() {
        switch (this.a) {
            case 0:
                int i = this.b;
                z25[] z25Arr = n25.c;
                return i < 4;
            default:
                int i2 = this.b;
                z25[] z25Arr2 = n25.c;
                return i2 < 4;
        }
    }

    public final Object nextElement() {
        switch (this.a) {
            case 0:
                HashMap hashMap = new HashMap();
                for (z25 z25 : n25.d[this.b]) {
                    hashMap.put(z25.b, z25);
                }
                this.b++;
                return hashMap;
            default:
                this.b++;
                return new HashMap();
        }
    }
}
