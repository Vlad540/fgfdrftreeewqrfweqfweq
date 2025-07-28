package defpackage;

import java.util.List;

/* renamed from: bp8  reason: default package */
public enum bp8 {
    UNKNOWN(0),
    SENDING(10),
    SENT(20),
    READ(30),
    ERROR(40);
    
    public static final s59 b = null;
    public static final List c = null;
    public final int a;

    /* JADX WARNING: type inference failed for: r0v2, types: [s59, java.lang.Object] */
    static {
        bp8[] bp8Arr;
        pz4 pz4 = new pz4(bp8Arr);
        b = new Object();
        c = o23.s0(pz4);
    }

    /* access modifiers changed from: public */
    bp8(int i) {
        this.a = i;
    }
}
