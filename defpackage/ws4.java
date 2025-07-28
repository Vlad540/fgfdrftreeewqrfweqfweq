package defpackage;

import android.os.SystemClock;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: ws4  reason: default package */
public final class ws4 implements nm6, i39 {
    public static final long[] X = new long[0];
    public long a;
    public final Object b;
    public final Object c;
    public final Object o;

    public ws4(kg5 kg5) {
        this.o = kg5;
        this.b = new ft4(0.3d, 0.0d, 6);
        this.c = new p7(1, false);
    }

    public void a(long j) {
        if (this.a != j) {
            this.a = j;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            kg5 kg5 = (kg5) this.o;
            kg5.a = elapsedRealtime;
            ((ft4) this.b).a(((p7) this.c).c(j, kg5.a));
        }
    }

    public void b(p39 p39, int i) {
        boolean z = true;
        if (i < 1 || i > 7) {
            z = false;
        }
        e07.j("Invalid metering mode " + i, z);
        if ((i & 1) != 0) {
            ((ArrayList) this.b).add(p39);
        }
        if ((i & 2) != 0) {
            ((ArrayList) this.c).add(p39);
        }
    }

    public void c(int i) {
        if (((InputStream) this.o).read((byte[]) this.b, 0, i) == i) {
            this.a += (long) i;
            return;
        }
        throw new IOException("read failed");
    }

    public long g() {
        return this.a;
    }

    public long getContentLength() {
        return this.a;
    }

    public String getContentType() {
        return (String) this.o;
    }

    public int k() {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        byteBuffer.position(0);
        c(4);
        return byteBuffer.getInt();
    }

    public void m(int i) {
        while (i > 0) {
            int skip = (int) ((InputStream) this.o).skip((long) i);
            if (skip >= 1) {
                i -= skip;
                this.a += (long) skip;
            } else {
                throw new IOException("Skip didn't move at least 1 byte forward");
            }
        }
    }

    public int readUnsignedShort() {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        byteBuffer.position(0);
        c(2);
        return byteBuffer.getShort() & 65535;
    }

    public long s() {
        ByteBuffer byteBuffer = (ByteBuffer) this.c;
        byteBuffer.position(0);
        c(4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public void writeTo(OutputStream outputStream) {
        Iterator it = ((List) this.c).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = (String) this.b;
            if (hasNext) {
                mm6 mm6 = (mm6) it.next();
                outputStream.write(km6.b);
                km6.c(outputStream, str);
                byte[] bArr = km6.a;
                outputStream.write(bArr);
                km6.c(outputStream, mm6.b);
                outputStream.write(bArr);
                mm6.a.writeTo(outputStream);
                outputStream.write(bArr);
            } else {
                byte[] bArr2 = km6.b;
                outputStream.write(bArr2);
                km6.c(outputStream, str);
                outputStream.write(bArr2);
                return;
            }
        }
    }

    public ws4(syc syc, zv zvVar) {
        this.b = syc;
        this.c = zvVar;
        int f = syc.f();
        long j = 0;
        if (f <= 64) {
            this.a = f != 64 ? -1 << f : j;
            this.o = X;
            return;
        }
        this.a = 0;
        int i = (f - 1) >>> 6;
        long[] jArr = new long[i];
        if ((f & 63) != 0) {
            jArr[i - 1] = -1 << f;
        }
        this.o = jArr;
    }

    public ws4(String str, List list) {
        long j;
        this.b = str;
        this.c = list;
        this.o = "multipart/form-data; boundary=".concat(str);
        long j2 = -1;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((mm6) it.next()).a.getContentLength() < 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        long length = ((long) km6.b.length) + ((long) km6.b((String) this.b)) + ((long) km6.a.length);
        for (mm6 mm6 : (List) this.c) {
            long length2 = length + ((long) km6.b.length) + ((long) km6.b((String) this.b));
            byte[] bArr = km6.a;
            long length3 = length2 + ((long) bArr.length);
            nm6 nm6 = mm6.a;
            if (nm6.getContentLength() < 0) {
                j = -1;
            } else {
                j = nm6.getContentLength() + ((long) (km6.b(mm6.b) + bArr.length)) + ((long) bArr.length);
            }
            length = length3 + j;
        }
        j2 = length;
        this.a = j2;
    }

    public ws4(ws4 ws4) {
        this.b = Collections.unmodifiableList((ArrayList) ws4.b);
        this.c = Collections.unmodifiableList((ArrayList) ws4.c);
        this.o = Collections.unmodifiableList((ArrayList) ws4.o);
        this.a = ws4.a;
    }

    public ws4(p39 p39) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.o = new ArrayList();
        this.a = 5000;
        b(p39, 1);
    }

    public ws4(FileInputStream fileInputStream) {
        this.a = 0;
        this.o = fileInputStream;
        byte[] bArr = new byte[4];
        this.b = bArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.c = wrap;
        wrap.order(ByteOrder.BIG_ENDIAN);
    }
}
