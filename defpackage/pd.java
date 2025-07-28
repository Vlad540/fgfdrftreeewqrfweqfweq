package defpackage;

import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: pd  reason: default package */
public final class pd implements nn1, mh0 {
    public Object X;
    public Object Y;
    public boolean a;
    public Object b;
    public Object c;
    public Object o;

    public static uvf b(et1 et1) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) et1.a(d4.g());
            } catch (AssertionError unused) {
                range = null;
            }
            if (range != null) {
                return new ae(et1);
            }
        }
        return new b0d(et1);
    }

    public IOException a(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            g(iOException);
        }
        j06 j06 = (j06) this.o;
        if (z2) {
            if (iOException != null) {
                j06.getClass();
            } else {
                j06.getClass();
            }
        }
        if (z) {
            if (iOException != null) {
                j06.getClass();
            } else {
                j06.getClass();
            }
        }
        return ((y0c) this.c).i(this, z2, z, iOException);
    }

    public qe8 c(int i) {
        HashMap hashMap = (HashMap) this.o;
        qe8 qe8 = (qe8) hashMap.get(Integer.valueOf(i));
        if (qe8 != null) {
            return qe8;
        }
        qe8 qe82 = (qe8) d(i).get();
        qe82.d((s1e) this.Y);
        qe82.b(this.a);
        hashMap.put(Integer.valueOf(i), qe82);
        return qe82;
    }

    public p3e d(int i) {
        j94 j94;
        j94 j942;
        HashMap hashMap = (HashMap) this.c;
        p3e p3e = (p3e) hashMap.get(Integer.valueOf(i));
        if (p3e != null) {
            return p3e;
        }
        nz3 nz3 = (nz3) this.X;
        nz3.getClass();
        Class<qe8> cls = qe8.class;
        if (i != 0) {
            if (i == 1) {
                j94 = new j94(Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(cls), nz3, 1);
            } else if (i == 2) {
                j94 = new j94(HlsMediaSource.Factory.class.asSubclass(cls), nz3, 2);
            } else if (i == 3) {
                j942 = new k94(0, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(cls));
            } else if (i == 4) {
                j94 = new j94(this, nz3, 3);
            } else {
                throw new IllegalArgumentException(wn6.h(i, "Unrecognized contentType: "));
            }
            hashMap.put(Integer.valueOf(i), j94);
            return j94;
        }
        j942 = new j94(DashMediaSource.Factory.class.asSubclass(cls), nz3, 0);
        j94 = j942;
        hashMap.put(Integer.valueOf(i), j94);
        return j94;
    }

    public wbc e(boolean z) {
        try {
            wbc e = ((m15) this.Y).e(z);
            if (e != null) {
                e.m = this;
            }
            return e;
        } catch (IOException e2) {
            ((j06) this.o).getClass();
            g(e2);
            throw e2;
        }
    }

    public void f(sn1 sn1, yvf yvf) {
        r90 e;
        if (!this.a) {
            synchronized (((zvf) this.o)) {
                ((zvf) this.o).f(1.0f);
                e = r90.e((zvf) this.o);
            }
            h(e);
            sn1.d(new Exception("Camera is not active."));
            return;
        }
        ((uvf) this.Y).h(yvf.c(), sn1);
        ((zq1) this.b).A();
    }

    public void g(IOException iOException) {
        ((n15) this.X).b(iOException);
        c1c f = ((m15) this.Y).f();
        y0c y0c = (y0c) this.c;
        synchronized (f) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(f.f != null) || (iOException instanceof ConnectionShutdownException)) {
                        f.i = true;
                        if (f.l == 0) {
                            c1c.d(y0c.E0, f.q, iOException);
                            f.k++;
                        }
                    }
                } else if (((StreamResetException) iOException).a == 8) {
                    int i = f.m + 1;
                    f.m = i;
                    if (i > 1) {
                        f.i = true;
                        f.k++;
                    }
                } else if (((StreamResetException) iOException).a != 9 || !y0c.B0) {
                    f.i = true;
                    f.k++;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void h(r90 r90) {
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        vb9 vb9 = (vb9) this.X;
        if (myLooper == mainLooper) {
            vb9.k(r90);
        } else {
            vb9.i(r90);
        }
    }

    public void i(nd3 nd3) {
        dzf dzf = (dzf) ((qa6) this.Y).y0.get((zk) this.c);
        if (dzf != null) {
            dzf.n(nd3);
        }
    }

    public void j(y0c y0c, xbc xbc) {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            boolean z = !xbc.m();
            if (z) {
                int i = xbc.o;
                bd bdVar = (bd) ((rd) this.Y).c.a.getValue();
                if (!bdVar.a().c()) {
                    bdVar.g("HTTP_ERROR", String.valueOf(i));
                }
                if (i == 403 || i == 400) {
                    Pattern pattern = rd.d;
                    Locale locale = Locale.ENGLISH;
                    udd.s("rd", "Url expired try to get new one. Code = " + i, (Throwable) null);
                    ((qd) this.c).b.d();
                    rd.h((rd) this.Y, (qd) this.c, (File) this.o);
                    rd.g((rd) this.Y, (qd) this.c, ((File) this.o).getAbsolutePath());
                    ete.n(xbc);
                }
            }
            f1c f1c = xbc.Z;
            long n = f1c == null ? 0 : f1c.n();
            if (!z && f1c != null) {
                if (f1c.n() >= 0) {
                    Pattern pattern2 = rd.d;
                    udd.q("rd", "response content length: " + n);
                    long length = ((File) this.o).length();
                    long j = n + length;
                    InputStream m = f1c.m();
                    try {
                        fileOutputStream = new FileOutputStream((File) this.o, true);
                        try {
                            int i2 = zc3.$EnumSwitchMapping$0[((rd) this.Y).c.c().ordinal()];
                            byte[] bArr = new byte[((i2 == 1 || i2 == 2) ? 32768 : i2 != 3 ? 4096 : 16384)];
                            while (true) {
                                int read = m.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                                length += (long) read;
                                synchronized (((qd) this.c).a) {
                                    try {
                                        Iterator it = ((qd) this.c).a.iterator();
                                        while (it.hasNext()) {
                                            ((bm6) it.next()).k((((float) length) / ((float) j)) * 100.0f, j);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            fileOutputStream.flush();
                            rd rdVar = (rd) this.Y;
                            File e = rd.e(rdVar, (File) this.o, (File) this.X, this.a ? rd.f(rdVar, xbc) : null);
                            synchronized (((qd) this.c).a) {
                                try {
                                    Iterator it2 = ((qd) this.c).a.iterator();
                                    while (it2.hasNext()) {
                                        bm6 bm6 = (bm6) it2.next();
                                        Pattern pattern3 = rd.d;
                                        udd.q("rd", "File download completed");
                                        bm6.e(e);
                                    }
                                } catch (Throwable th2) {
                                    while (true) {
                                    }
                                    throw th2;
                                }
                            }
                            rd.g((rd) this.Y, (qd) this.c, ((File) this.o).getAbsolutePath());
                            ete.n(xbc);
                            ete.o(m);
                        } catch (Exception e2) {
                            e = e2;
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream2 = m;
                            th = th;
                            rd.g((rd) this.Y, (qd) this.c, ((File) this.o).getAbsolutePath());
                            ete.n(xbc);
                            ete.o(inputStream2);
                            ete.n(fileOutputStream);
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileOutputStream = null;
                        Exception exc = e;
                        inputStream = m;
                        e = exc;
                        try {
                            Pattern pattern4 = rd.d;
                            udd.s("rd", "exception while downloading file: " + e.getMessage(), (Throwable) null);
                            synchronized (((qd) this.c).a) {
                                try {
                                    Iterator it3 = ((qd) this.c).a.iterator();
                                    while (it3.hasNext()) {
                                        ((bm6) it3.next()).j();
                                    }
                                } catch (Throwable th4) {
                                    while (true) {
                                    }
                                    throw th4;
                                }
                            }
                            rd.g((rd) this.Y, (qd) this.c, ((File) this.o).getAbsolutePath());
                            ete.n(xbc);
                            ete.o(inputStream);
                            ete.n(fileOutputStream);
                            return;
                        } catch (Throwable th5) {
                            th = th5;
                            inputStream2 = inputStream;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        fileOutputStream = null;
                        inputStream2 = m;
                        th = th;
                        rd.g((rd) this.Y, (qd) this.c, ((File) this.o).getAbsolutePath());
                        ete.n(xbc);
                        ete.o(inputStream2);
                        ete.n(fileOutputStream);
                        throw th;
                    }
                    ete.n(fileOutputStream);
                    return;
                }
            }
            Pattern pattern5 = rd.d;
            Locale locale2 = Locale.ENGLISH;
            udd.s("rd", "responseFailed = " + z + " response.body().contentLength() = " + n + " tempOutputFile.length() " + ((File) this.o).length(), (Throwable) null);
            ((rd) this.Y).c.d("Exception in FileDownloader onResponse");
            if (rd.d((rd) this.Y, xbc, ((File) this.o).length())) {
                rd rdVar2 = (rd) this.Y;
                File e4 = rd.e(rdVar2, (File) this.o, (File) this.X, this.a ? rd.f(rdVar2, xbc) : null);
                synchronized (((qd) this.c).a) {
                    try {
                        Iterator it4 = ((qd) this.c).a.iterator();
                        while (it4.hasNext()) {
                            bm6 bm62 = (bm6) it4.next();
                            Pattern pattern6 = rd.d;
                            udd.q("rd", "File already fully downloaded");
                            bm62.e(e4);
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                rd.g((rd) this.Y, (qd) this.c, ((File) this.o).getAbsolutePath());
                ete.n(xbc);
            }
            udd.s("rd", "server response code = " + xbc.o + ", download failed", (Throwable) null);
            synchronized (((qd) this.c).a) {
                try {
                    Iterator it5 = ((qd) this.c).a.iterator();
                    while (it5.hasNext()) {
                        ((bm6) it5.next()).a();
                    }
                } catch (Throwable th8) {
                    while (true) {
                    }
                    throw th8;
                }
            }
            ((rd) this.Y).getClass();
            ((File) this.o).delete();
            rd.g((rd) this.Y, (qd) this.c, ((File) this.o).getAbsolutePath());
            ete.n(xbc);
        } catch (Exception e5) {
            e = e5;
            inputStream = null;
            fileOutputStream = null;
        } catch (Throwable th9) {
            th = th9;
            fileOutputStream = null;
            rd.g((rd) this.Y, (qd) this.c, ((File) this.o).getAbsolutePath());
            ete.n(xbc);
            ete.o(inputStream2);
            ete.n(fileOutputStream);
            throw th;
        }
    }

    public void r(y0c y0c, IOException iOException) {
        try {
            Pattern pattern = rd.d;
            udd.u("rd", iOException, "exception while download request: %s", new Object[]{(lac) this.b});
            bd bdVar = (bd) ((rd) this.Y).c.a.getValue();
            if (!bdVar.a().c()) {
                bdVar.g("HTTP_ERROR", iOException.getClass().getSimpleName());
            }
            synchronized (((qd) this.c).a) {
                try {
                    Iterator it = ((qd) this.c).a.iterator();
                    while (it.hasNext()) {
                        ((bm6) it.next()).j();
                    }
                } catch (Throwable th) {
                    while (true) {
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                Pattern pattern2 = rd.d;
                udd.s("rd", "onFailure: failed to process on failure", th2);
            } catch (Throwable th3) {
                rd.g((rd) this.Y, (qd) this.c, ((File) this.o).getAbsolutePath());
                throw th3;
            }
        }
        rd.g((rd) this.Y, (qd) this.c, ((File) this.o).getAbsolutePath());
    }

    public void w(nd3 nd3) {
        ((qa6) this.Y).B0.post(new q36(this, nd3, false, 27));
    }
}
