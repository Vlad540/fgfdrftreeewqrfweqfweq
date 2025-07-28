package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/* renamed from: rcc  reason: default package */
public final class rcc {
    public float a;
    public final Serializable b;

    public rcc() {
        this.b = new Random(System.currentTimeMillis());
        this.a = 0.0f;
    }

    public long a(long j) {
        oyb.d(j >= 0);
        Map.Entry firstEntry = this.b.q(Long.valueOf(j), false).firstEntry();
        Long l = (Long) (firstEntry == null ? null : firstEntry.getKey());
        if (l != null) {
            return l.longValue();
        }
        return -9223372036854775807L;
    }

    public float b(long j) {
        oyb.d(j >= 0);
        Map.Entry lastEntry = this.b.n(Long.valueOf(j), true).lastEntry();
        return lastEntry != null ? ((Float) lastEntry.getValue()).floatValue() : this.a;
    }

    public rcc(a39 a39) {
        float f;
        kt6 kt6;
        int i = 0;
        while (true) {
            zkd[] zkdArr = a39.a;
            if (i >= zkdArr.length) {
                f = -3.4028235E38f;
                break;
            }
            zkd zkd = zkdArr[i];
            if (zkd instanceof zkd) {
                f = zkd.a;
                break;
            }
            i++;
        }
        float f2 = f == -3.4028235E38f ? 1.0f : f / 30.0f;
        this.a = f2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            ckd[] ckdArr = a39.a;
            if (i2 >= ckdArr.length) {
                break;
            }
            ckd ckd = ckdArr[i2];
            if (ckd instanceof ckd) {
                arrayList.addAll(ckd.a);
            }
            i2++;
        }
        e8c r = ws6.r(akd.o, arrayList);
        if (r.isEmpty()) {
            kt6 = kt6.o();
        } else {
            TreeMap treeMap = new TreeMap();
            for (int i3 = 0; i3 < r.size(); i3++) {
                akd akd = (akd) r.get(i3);
                treeMap.put(Long.valueOf(oze.S(akd.a)), Float.valueOf(f2 / ((float) akd.c)));
            }
            for (int i4 = 0; i4 < r.size(); i4++) {
                long j = ((akd) r.get(i4)).b;
                if (!treeMap.containsKey(Long.valueOf(oze.S(j)))) {
                    treeMap.put(Long.valueOf(oze.S(j)), Float.valueOf(f2));
                }
            }
            kt6 = kt6.k(treeMap);
        }
        this.b = kt6;
    }
}
