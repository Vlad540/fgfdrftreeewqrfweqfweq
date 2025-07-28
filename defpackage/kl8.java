package defpackage;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream$InvalidStreamException;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: kl8  reason: default package */
public final class kl8 extends OutputStream {
    public final il8 a;
    public t54 b;
    public int c;

    public kl8(il8 il8, int i) {
        if (i > 0) {
            this.a = il8;
            this.c = 0;
            this.b = e13.p0(il8.get(i), il8, e13.Y);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void close() {
        e13.S(this.b);
        this.b = null;
        this.c = -1;
        m();
    }

    public final void m() {
        try {
            super.close();
        } catch (IOException e) {
            bm3.z(e);
            throw null;
        }
    }

    public final jl8 n() {
        if (e13.n0(this.b)) {
            t54 t54 = this.b;
            if (t54 != null) {
                return new jl8(this.c, t54);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
    }

    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder i3 = rf0.i("length=", bArr.length, "; regionStart=", i, "; regionLength=");
            i3.append(i2);
            throw new ArrayIndexOutOfBoundsException(i3.toString());
        } else if (e13.n0(this.b)) {
            int i4 = this.c + i2;
            if (e13.n0(this.b)) {
                t54 t54 = this.b;
                if (t54 != null) {
                    if (i4 > ((hl8) t54.e0()).getSize()) {
                        il8 il8 = this.a;
                        hl8 hl8 = (hl8) il8.get(i4);
                        t54 t542 = this.b;
                        if (t542 != null) {
                            ((hl8) t542.e0()).n(hl8, this.c);
                            this.b.close();
                            this.b = e13.p0(hl8, il8, e13.Y);
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    }
                    t54 t543 = this.b;
                    if (t543 != null) {
                        ((hl8) t543.e0()).U(this.c, i, i2, bArr);
                        this.c += i2;
                        return;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        } else {
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        }
    }

    public kl8(il8 il8) {
        this(il8, il8.z0[0]);
    }
}
