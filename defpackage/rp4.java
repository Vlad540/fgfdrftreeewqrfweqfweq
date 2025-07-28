package defpackage;

import java.util.HashMap;

/* renamed from: rp4  reason: default package */
public final class rp4 extends HashMap {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractMap, rp4, java.util.HashMap] */
    public static rp4 a(ws8 ws8) {
        int K = jjd.K(ws8);
        ? hashMap = new HashMap();
        for (int i = 0; i < K; i++) {
            hashMap.put(Long.valueOf(ws8.w0()), Long.valueOf(ws8.w0()));
        }
        return hashMap;
    }
}
