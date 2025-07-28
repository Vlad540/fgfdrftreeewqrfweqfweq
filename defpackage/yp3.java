package defpackage;

import java.nio.ByteBuffer;

/* renamed from: yp3  reason: default package */
public interface yp3 {
    static long a(yp3 yp3) {
        byte[] bArr = (byte[]) ((y54) yp3).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1;
    }
}
