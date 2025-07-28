package defpackage;

import android.media.MediaCodec;
import android.os.Trace;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import com.google.firebase.components.ComponentRegistrar;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: lk9  reason: default package */
public final class lk9 implements ll8, j26, i13, cy, h28, dld {
    public static final lk9 X = new Object();
    public static final lk9 Y = new Object();
    public static final lk9 Z = new Object();
    public static lk9 a;
    public static final /* synthetic */ lk9 b = new Object();
    public static final hd1 c = new hd1(23);
    public static final lk9 o = new Object();

    public static final String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        byte b2;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int i4 = -1;
        byte[] bArr5 = PublicSuffixDatabase.e;
        int length = bArr3.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > i4 && bArr3[i6] != ((byte) 10)) {
                i6 += i4;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr3[i2] == ((byte) 10)) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    b2 = 46;
                    z = false;
                } else {
                    byte b3 = bArr4[i10][i11];
                    byte[] bArr6 = nze.a;
                    byte b4 = b3 & 255;
                    z = z2;
                    b2 = b4;
                }
                byte b5 = bArr3[i7 + i12];
                byte[] bArr7 = nze.a;
                i3 = b2 - (b5 & 255);
                if (i3 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    } else if (bArr4[i10].length != i11) {
                        z2 = z;
                    } else if (i10 == bArr4.length - 1) {
                        break;
                    } else {
                        i10++;
                        z2 = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr4[i10].length - i11;
                    int length3 = bArr4.length;
                    for (int i14 = i10 + 1; i14 < length3; i14++) {
                        length2 += bArr4[i14].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr3, i7, i9, StandardCharsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
                i4 = -1;
            }
            length = i6;
            i4 = -1;
        }
        return null;
    }

    public static MediaCodec e(f28 f28) {
        f28.a.getClass();
        String str = f28.a.a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }

    public static sz0 f(nv4 nv4, wi7 wi7) {
        int i;
        IOException iOException = wi7.a;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException) || ((i = ((HttpDataSource$InvalidResponseCodeException) iOException).c) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            return null;
        }
        if (nv4.a(1)) {
            return new sz0(1, 2, 300000);
        }
        if (nv4.a(2)) {
            return new sz0(2, 2, 60000);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, lk9] */
    public static synchronized lk9 g() {
        lk9 lk9;
        synchronized (lk9.class) {
            try {
                if (a == null) {
                    a = new Object();
                }
                lk9 = a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return lk9;
    }

    public static long j(wi7 wi7) {
        Throwable th = wi7.a;
        if (!(th instanceof ParserException) && !(th instanceof FileNotFoundException) && !(th instanceof HttpDataSource$CleartextNotPermittedException) && !(th instanceof Loader$UnexpectedLoaderException)) {
            int i = DataSourceException.b;
            while (th != null) {
                if (!(th instanceof DataSourceException) || ((DataSourceException) th).a != 2008) {
                    th = th.getCause();
                }
            }
            return (long) Math.min((wi7.b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public Object apply(Object obj) {
        f3f a2;
        hm4 hm4 = (hm4) obj;
        zl4 zl4 = hm4.a;
        yl4 yl4 = new yl4(zl4.a, zl4.b);
        l10 l10 = hm4.e;
        if (l10 == null) {
            a2 = null;
        } else {
            l10 l102 = new l10(1);
            l102.a = l10.a;
            l102.c = l10.c;
            l102.b = l10.b;
            l102.d = l10.d;
            a2 = l102.a();
        }
        f3f f3f = a2;
        return new fm4(yl4, hm4.b, hm4.c, hm4.d, f3f);
    }

    public j28 b(f28 f28) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = e(f28);
            Trace.beginSection("configureCodec");
            mediaCodec.configure(f28.b, f28.d, f28.e, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new jj7(mediaCodec);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    public /* bridge */ Object c(occ occ) {
        return null;
    }

    public void d(String str, Throwable th) {
    }

    public int h(int i) {
        return i == 7 ? 6 : 3;
    }

    public gjd i(e8c e8c) {
        return (gjd) e8c.get(0);
    }

    public List k(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (t73 t73 : componentRegistrar.getComponents()) {
            String str = t73.a;
            if (str != null) {
                j9 j9Var = new j9(str, 19, t73);
                t73 = new t73(str, t73.b, t73.c, t73.d, t73.e, j9Var, t73.g);
            }
            arrayList.add(t73);
        }
        return arrayList;
    }

    public lbe q(ws8 ws8) {
        int i;
        String str;
        if (!ws8.m()) {
            return null;
        }
        try {
            i = jjd.K(ws8);
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                i = 0;
            } else if (t != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        Long l = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th2) {
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = uzc.a.iterator();
                while (it2.hasNext()) {
                    ((ny9) it2.next()).getClass();
                    ny9.a(th2);
                }
                int t2 = hr1.t(m4b.a);
                if (t2 == 0) {
                    str = null;
                } else if (t2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (str.equals("timestamp")) {
                    long j = 0;
                    try {
                        j = jjd.J(ws8, 0);
                    } catch (Throwable th3) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = uzc.a.iterator();
                        while (it3.hasNext()) {
                            ((ny9) it3.next()).getClass();
                            ny9.a(th3);
                        }
                        int t3 = hr1.t(m4b.a);
                        if (t3 != 0) {
                            if (t3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                    }
                    l = Long.valueOf(j);
                } else {
                    try {
                        ws8.z();
                    } catch (Throwable th4) {
                        udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = uzc.a.iterator();
                        while (it4.hasNext()) {
                            ((ny9) it4.next()).getClass();
                            ny9.a(th4);
                        }
                        int t4 = hr1.t(m4b.a);
                        if (t4 != 0) {
                            if (t4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new d9c(l);
    }
}
