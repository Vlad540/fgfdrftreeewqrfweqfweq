package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: ct4  reason: default package */
public final class ct4 implements at4 {
    public boolean X = true;
    public long Y = 0;
    public InputStream a;
    public final ZipEntry b;
    public final ZipFile c;
    public final long o;

    public ct4(ZipFile zipFile, ZipEntry zipEntry) {
        this.c = zipFile;
        this.b = zipEntry;
        this.o = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.a = inputStream;
        if (inputStream == null) {
            throw new IOException(zipEntry.getName() + "'s InputStream is null");
        }
    }

    public final int b(long j, ByteBuffer byteBuffer) {
        if (this.a != null) {
            int remaining = byteBuffer.remaining();
            long j2 = this.o;
            long j3 = j2 - j;
            if (j3 <= 0) {
                return -1;
            }
            int i = (int) j3;
            if (remaining > i) {
                remaining = i;
            }
            InputStream inputStream = this.a;
            ZipEntry zipEntry = this.b;
            if (inputStream != null) {
                long j4 = this.Y;
                if (j != j4) {
                    if (j > j2) {
                        j = j2;
                    }
                    if (j >= j4) {
                        inputStream.skip(j - j4);
                    } else {
                        inputStream.close();
                        InputStream inputStream2 = this.c.getInputStream(zipEntry);
                        this.a = inputStream2;
                        if (inputStream2 != null) {
                            inputStream2.skip(j);
                        } else {
                            throw new IOException(zipEntry.getName() + "'s InputStream is null");
                        }
                    }
                    this.Y = j;
                }
                if (byteBuffer.hasArray()) {
                    this.a.read(byteBuffer.array(), 0, remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                } else {
                    byte[] bArr = new byte[remaining];
                    this.a.read(bArr, 0, remaining);
                    byteBuffer.put(bArr, 0, remaining);
                }
                this.Y += (long) remaining;
                return remaining;
            }
            throw new IOException(zipEntry.getName() + "'s InputStream is null");
        }
        throw new IOException("InputStream is null");
    }

    public final void close() {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            inputStream.close();
            this.X = false;
        }
    }

    public final boolean isOpen() {
        return this.X;
    }

    public final int read(ByteBuffer byteBuffer) {
        return b(this.Y, byteBuffer);
    }

    public final int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
