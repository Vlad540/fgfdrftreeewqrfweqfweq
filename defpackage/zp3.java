package defpackage;

import java.nio.ByteBuffer;

/* renamed from: zp3  reason: default package */
public interface zp3 {
    static long a(zp3 zp3) {
        byte[] bArr = (byte[]) ((z54) zp3).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1;
    }
}
