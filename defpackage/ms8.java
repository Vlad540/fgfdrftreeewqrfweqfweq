package defpackage;

import java.util.HashMap;

/* renamed from: ms8  reason: default package */
public enum ms8 {
    ;
    
    public static final HashMap a = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [ms8, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r1v1, types: [ms8, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r3v1, types: [ms8, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r4v2, types: [ms8, java.lang.Enum] */
    static {
        int i;
        HashMap hashMap = new HashMap(4);
        for (ms8 ms8 : values()) {
            hashMap.put(ms8.name(), ms8);
        }
        a = hashMap;
    }
}
