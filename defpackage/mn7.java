package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: mn7  reason: default package */
public final class mn7 {
    public final long a;
    public final byte[] b;
    public final int c;

    public mn7(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
        this.c = bArr.length + 30;
    }

    public final void a(OutputStream outputStream, int i) {
        outputStream.write(35);
        urd.a(outputStream, String.valueOf(i));
        outputStream.write(32);
        urd.a(outputStream, String.valueOf(this.a));
        urd.a(outputStream, " | ");
        outputStream.write(this.b);
        outputStream.write(10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mn7) {
            mn7 mn7 = (mn7) obj;
            return this.a == mn7.a && Arrays.equals(this.b, mn7.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) | Long.hashCode(this.a);
    }

    public final String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(byteArrayOutputStream, 0);
        return byteArrayOutputStream.toString();
    }
}
