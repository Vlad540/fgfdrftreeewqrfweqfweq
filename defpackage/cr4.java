package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: cr4  reason: default package */
public abstract class cr4 {
    public static final HashMap a;
    public static final HashMap b;
    public static final HashMap c;
    public static final HashMap d;
    public static final HashMap e;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        HashMap hashMap3 = new HashMap();
        c = hashMap3;
        HashMap hashMap4 = new HashMap();
        d = hashMap4;
        HashMap hashMap5 = new HashMap();
        e = hashMap5;
        hashMap.put(8, new HashSet(Collections.singletonList(8)));
        hashMap.put(10, new HashSet(Collections.singletonList(10)));
        hashMap.put(0, new HashSet(Arrays.asList(new Integer[]{8, 10})));
        hashMap2.put(0, new HashSet(Arrays.asList(new Integer[]{0, 1, 2, 3, 4})));
        hashMap2.put(1, new HashSet(Collections.singletonList(0)));
        hashMap2.put(2, new HashSet(Arrays.asList(new Integer[]{1, 2, 3, 4})));
        hashMap2.put(3, new HashSet(Collections.singletonList(1)));
        hashMap2.put(4, new HashSet(Collections.singletonList(2)));
        hashMap2.put(5, new HashSet(Collections.singletonList(3)));
        hashMap2.put(6, new HashSet(Collections.singletonList(4)));
        hashMap3.put(8, 8);
        hashMap3.put(10, 10);
        hashMap4.put(0, 1);
        hashMap4.put(1, 3);
        hashMap4.put(2, 4);
        hashMap4.put(3, 5);
        hashMap4.put(4, 6);
        HashMap hashMap6 = new HashMap();
        zq4 zq4 = zq4.d;
        hashMap6.put(zq4, 1);
        zq4 zq42 = zq4.e;
        hashMap6.put(zq42, 2);
        zq4 zq43 = zq4.f;
        hashMap6.put(zq43, 4096);
        zq4 zq44 = zq4.g;
        hashMap6.put(zq44, 8192);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(zq4, 1);
        hashMap7.put(zq42, 2);
        hashMap7.put(zq43, 4096);
        hashMap7.put(zq44, 8192);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(zq4, 1);
        hashMap8.put(zq42, 4);
        hashMap8.put(zq43, 4096);
        hashMap8.put(zq44, 16384);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(zq4.h, 256);
        hashMap9.put(zq4.i, 512);
        hashMap5.put("video/hevc", hashMap6);
        hashMap5.put("video/av01", hashMap7);
        hashMap5.put("video/x-vnd.on2.vp9", hashMap8);
        hashMap5.put("video/dolby-vision", hashMap9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r4 = (java.util.Set) b.get(java.lang.Integer.valueOf(r4.a));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.g90 r3, defpackage.zq4 r4) {
        /*
            int r0 = r3.h
            java.util.HashMap r1 = a
            int r2 = r4.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L_0x003a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x003a
            java.util.HashMap r0 = b
            int r4 = r4.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L_0x003a
            int r3 = r3.j
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr4.a(g90, zq4):boolean");
    }
}
