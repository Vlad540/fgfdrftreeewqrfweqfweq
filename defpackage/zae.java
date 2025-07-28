package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.protocol.HTTP;

/* renamed from: zae  reason: default package */
public final class zae implements ul6 {
    public static final AtomicReference B0 = new AtomicReference();
    public long A0;
    public xz3 X;
    public xbc Y;
    public lac Z;
    public final String a;
    public final HashMap b;
    public final ex0 c;
    public final bqe o;
    public boolean w0;
    public long x0;
    public long y0;
    public long z0;

    public zae(ex0 ex0, String str, bqe bqe) {
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            this.o = bqe;
            this.b = new HashMap();
            this.c = ex0;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final long N(xz3 xz3) {
        sm6 sm6;
        xz3 xz32 = xz3;
        this.X = xz32;
        long j = 0;
        this.A0 = 0;
        this.z0 = 0;
        long j2 = xz32.f;
        long j3 = xz32.g;
        boolean z = (xz32.i & 1) != 0;
        String uri = xz32.a.toString();
        try {
            u93 u93 = new u93();
            u93.j((sm6) null, uri);
            sm6 = u93.b();
        } catch (IllegalArgumentException unused) {
            sm6 = null;
        }
        s86 s86 = new s86();
        s86.a = sm6;
        s86.p(UUID.randomUUID().toString());
        synchronized (this.b) {
            try {
                for (Map.Entry entry : this.b.entrySet()) {
                    s86.g((String) entry.getKey(), (String) entry.getValue());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        long j4 = -1;
        if (!(j2 == 0 && j3 == -1)) {
            long max = Math.max(0, j2);
            long j5 = j3 != -1 ? (j3 + max) - 1 : max;
            if (max < j5) {
                StringBuilder k = hr1.k(max, "bytes=", "-");
                k.append(j5);
                ((xe6) s86.c).f("Range", k.toString());
            }
        }
        ((xe6) s86.c).f(HTTP.USER_AGENT, this.a);
        if (!z) {
            ((xe6) s86.c).f("Accept-Encoding", HTTP.IDENTITY_CODING);
        }
        lac j6 = s86.j();
        this.Z = j6;
        try {
            xbc f = this.c.b(j6).f();
            this.Y = f;
            int i = f.o;
            if (f.m()) {
                String str = this.Y.Z.o().a;
                if (!str.isEmpty()) {
                    if (i == 200) {
                        long j7 = xz32.f;
                        if (j7 != 0) {
                            j = j7;
                        }
                    }
                    this.x0 = j;
                    if ((xz32.i & 1) == 0) {
                        long n = this.Y.Z.n();
                        long j8 = xz32.g;
                        if (j8 != -1) {
                            j4 = j8;
                        } else if (n != -1) {
                            j4 = n - this.x0;
                        }
                        this.y0 = j4;
                    } else {
                        this.y0 = xz32.g;
                    }
                    this.w0 = true;
                    f54 f54 = this.o;
                    if (f54 != null) {
                        f54.g(xz32, true);
                    }
                    return this.y0;
                }
                nze.c(this.Y.Z);
                this.Y = null;
                throw new HttpDataSource.InvalidContentTypeException(str, xz32);
            }
            ye6 ye6 = this.Z.d;
            ye6.getClass();
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            int size = ye6.size();
            int i2 = 0;
            while (i2 < size) {
                String b2 = ye6.b(i2);
                Locale locale = Locale.US;
                if (b2 != null) {
                    String lowerCase = b2.toLowerCase(locale);
                    List list = (List) treeMap.get(lowerCase);
                    if (list == null) {
                        list = new ArrayList(2);
                        treeMap.put(lowerCase, list);
                    }
                    list.add(ye6.d(i2));
                    i2++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
            nze.c(this.Y.Z);
            this.Y = null;
            int i3 = mze.a;
            throw new HttpDataSource.InvalidResponseCodeException(i, (String) null, (DataSourceException) null, treeMap, xz3);
        } catch (IOException e) {
            throw new HttpDataSource.HttpDataSourceException("Unable to connect to " + xz32.a.toString(), e, xz32, 2000);
        }
    }

    public final void O(bqe bqe) {
    }

    public final Map a() {
        return Collections.emptyMap();
    }

    public final int b(int i, byte[] bArr, int i2) {
        long j = this.y0;
        if (j != -1) {
            i2 = (int) Math.min((long) i2, j - this.A0);
        }
        if (i2 == 0) {
            return -1;
        }
        int read = this.Y.Z.m().read(bArr, i, i2);
        if (read == -1) {
            long j2 = this.y0;
            if (j2 == -1 || j2 == this.A0) {
                return -1;
            }
            throw new EOFException();
        }
        this.A0 += (long) read;
        f54 f54 = this.o;
        if (f54 != null) {
            f54.e(this.X, true, read);
        }
        return read;
    }

    public final void c() {
        if (this.z0 != this.x0) {
            AtomicReference atomicReference = B0;
            byte[] bArr = (byte[]) atomicReference.getAndSet((Object) null);
            if (bArr == null) {
                bArr = new byte[4096];
            }
            while (true) {
                long j = this.z0;
                long j2 = this.x0;
                if (j != j2) {
                    int read = this.Y.Z.m().read(bArr, 0, (int) Math.min(j2 - j, (long) bArr.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.z0 += (long) read;
                        f54 f54 = this.o;
                        if (f54 != null) {
                            f54.e(this.X, true, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    atomicReference.set(bArr);
                    return;
                }
            }
        }
    }

    public final void close() {
        if (this.w0) {
            this.w0 = false;
            f54 f54 = this.o;
            if (f54 != null) {
                f54.f(this.X, true);
            }
            nze.c(this.Y.Z);
            this.Y = null;
        }
    }

    public final Uri getUri() {
        lac lac = this.Z;
        if (lac == null) {
            return null;
        }
        return Uri.parse(lac.b.i);
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            c();
            return b(i, bArr, i2);
        } catch (IOException e) {
            throw HttpDataSource.HttpDataSourceException.b(e, this.X, 2);
        }
    }
}
