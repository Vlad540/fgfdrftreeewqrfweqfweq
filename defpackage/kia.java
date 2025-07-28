package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: kia  reason: default package */
public final class kia {
    public static final byte[] h = new byte[0];
    public final byte a;
    public final byte b;
    public final short c;
    public final short d;
    public final byte e;
    public final byte[] f;
    public final int g;

    public kia(byte b2, short s, short s2, byte[] bArr, int i) {
        this.a = 10;
        this.b = b2;
        this.c = s;
        this.d = s2;
        this.e = 0;
        this.f = bArr;
        this.g = i;
    }

    public static kia a(ibe ibe, byte b2, short s) {
        byte[] bArr;
        int size = ((HashMap) ibe.b).size();
        HashMap hashMap = (HashMap) ibe.b;
        if (size > 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                jjd.O(hashMap, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            bArr = h;
        }
        byte[] bArr2 = bArr;
        return new kia(b2, s, ibe.N(), bArr2, hashMap.size() > 0 ? bArr2.length : 0);
    }

    public final byte[] b(short s) {
        int i = this.g;
        ByteBuffer allocate = ByteBuffer.allocate(i + 10);
        allocate.put(this.a);
        allocate.put(this.b);
        allocate.putShort(s);
        allocate.putShort(this.d);
        allocate.putInt(i);
        if (i > 0) {
            allocate.put(this.f);
        }
        return allocate.array();
    }

    public final byte[] c(short s) {
        int i = this.g;
        if (i < 32) {
            return b(s);
        }
        int maxCompressedLength = x87.N().fastCompressor().maxCompressedLength(i);
        byte[] bArr = new byte[maxCompressedLength];
        int compress = x87.N().fastCompressor().compress(this.f, 0, this.g, bArr, 0, maxCompressedLength);
        ByteBuffer allocate = ByteBuffer.allocate(compress + 10);
        allocate.put(this.a);
        allocate.put(this.b);
        allocate.putShort(s);
        allocate.putShort(this.d);
        allocate.putInt((((i / compress) + 1) << 24) | compress);
        if (compress > 0) {
            allocate.put(bArr, 0, compress);
        }
        return allocate.array();
    }

    public final String toString() {
        String b2 = dfa.b(this.d);
        StringBuilder sb = new StringBuilder("Packet{ver=");
        sb.append(this.a);
        sb.append(", cmd=");
        sb.append(this.b);
        sb.append(", seq=");
        sb.append(this.c);
        sb.append(", opcode=");
        sb.append(b2);
        sb.append(", cof=");
        sb.append(this.e);
        sb.append(", payloadLength=");
        return wn6.j(sb, this.g, "}");
    }

    public kia(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (wrap.remaining() >= 10) {
            int position = wrap.position();
            byte b2 = wrap.get();
            this.a = b2;
            if (b2 < 5 || 10 < b2) {
                wrap.position(position);
                int min = Math.min(10, wrap.remaining());
                byte[] bArr2 = new byte[min];
                if (min > 0) {
                    wrap.get(bArr2);
                }
                throw new IOException();
            }
            this.b = wrap.get();
            this.c = wrap.getShort();
            this.d = wrap.getShort();
            int i = wrap.getInt();
            this.e = (byte) (i >> 24);
            int i2 = i & 16777215;
            this.g = i2;
            if (i2 > 0) {
                this.f = new byte[i2];
            } else {
                this.f = h;
            }
        } else {
            int remaining = wrap.remaining();
            byte[] bArr3 = new byte[remaining];
            if (remaining > 0) {
                wrap.get(bArr3);
            }
            throw new IOException();
        }
    }
}
