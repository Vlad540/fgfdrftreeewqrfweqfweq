package defpackage;

import android.os.SharedMemory;
import android.system.ErrnoException;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: is  reason: default package */
public final class is implements hl8, Closeable {
    public SharedMemory a;
    public ByteBuffer b;
    public final long c;

    public is(int i) {
        ez3.j(Boolean.valueOf(i > 0));
        try {
            SharedMemory create = SharedMemory.create("AshmemMemoryChunk", i);
            this.a = create;
            this.b = create.mapReadWrite();
            this.c = (long) System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    public final synchronized int S(int i, int i2, int i3, byte[] bArr) {
        int b2;
        bArr.getClass();
        this.b.getClass();
        b2 = udd.b(i, i3, getSize());
        udd.j(i, bArr.length, i2, b2, getSize());
        this.b.position(i);
        this.b.get(bArr, i2, b2);
        return b2;
    }

    public final synchronized int U(int i, int i2, int i3, byte[] bArr) {
        int b2;
        bArr.getClass();
        this.b.getClass();
        b2 = udd.b(i, i3, getSize());
        udd.j(i, bArr.length, i2, b2, getSize());
        this.b.position(i);
        this.b.put(bArr, i2, b2);
        return b2;
    }

    public final void a(hl8 hl8, int i) {
        if (hl8 instanceof is) {
            ez3.o(!isClosed());
            is isVar = (is) hl8;
            ez3.o(!isVar.isClosed());
            this.b.getClass();
            isVar.b.getClass();
            udd.j(0, isVar.getSize(), 0, i, getSize());
            this.b.position(0);
            isVar.b.position(0);
            byte[] bArr = new byte[i];
            this.b.get(bArr, 0, i);
            isVar.b.put(bArr, 0, i);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public final synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.b = null;
                this.a = null;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final long e0() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    public final int getSize() {
        this.a.getClass();
        return this.a.getSize();
    }

    public final synchronized boolean isClosed() {
        return this.b == null || this.a == null;
    }

    public final long m() {
        return this.c;
    }

    public final void n(hl8 hl8, int i) {
        hl8.getClass();
        long m = hl8.m();
        long j = this.c;
        if (m == j) {
            Long.toHexString(j);
            Long.toHexString(hl8.m());
            ez3.j(Boolean.FALSE);
        }
        if (hl8.m() < this.c) {
            synchronized (hl8) {
                synchronized (this) {
                    a(hl8, i);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (hl8) {
                a(hl8, i);
            }
        }
    }

    public final synchronized byte o(int i) {
        boolean z = false;
        ez3.o(!isClosed());
        ez3.j(Boolean.valueOf(i >= 0));
        if (i < getSize()) {
            z = true;
        }
        ez3.j(Boolean.valueOf(z));
        this.b.getClass();
        return this.b.get(i);
    }

    public final ByteBuffer r() {
        return this.b;
    }
}
