package defpackage;

import java.util.UUID;

/* renamed from: jz5  reason: default package */
public final class jz5 implements mw3 {
    public static final boolean c;
    public final UUID a;
    public final byte[] b;

    static {
        boolean z;
        if ("Amazon".equals(oze.c)) {
            String str = oze.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                c = z;
            }
        }
        z = false;
        c = z;
    }

    public jz5(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }
}
