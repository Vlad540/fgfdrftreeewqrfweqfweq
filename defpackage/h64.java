package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: h64  reason: default package */
public final class h64 implements qz3 {
    public xs X;
    public rp3 Y;
    public qz3 Z;
    public final Context a;
    public final ArrayList b;
    public final qz3 c;
    public md5 o;
    public wte w0;
    public lz3 x0;
    public iyb y0;
    public qz3 z0;

    public h64(Context context) {
        this(context, new l84((String) null, 8000, 8000, false, new otf(19)));
    }

    public static void c(qz3 qz3, cqe cqe) {
        if (qz3 != null) {
            qz3.H(cqe);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [qz3, fh0, md5] */
    /* JADX WARNING: type inference failed for: r0v18, types: [lz3, qz3, fh0] */
    public final long G(yz3 yz3) {
        oyb.k(this.z0 == null);
        String scheme = yz3.a.getScheme();
        int i = oze.a;
        Uri uri = yz3.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.o == null) {
                    ? fh0 = new fh0(false);
                    this.o = fh0;
                    b(fh0);
                }
                this.z0 = this.o;
            } else {
                if (this.X == null) {
                    xs xsVar = new xs(context);
                    this.X = xsVar;
                    b(xsVar);
                }
                this.z0 = this.X;
            }
        } else if ("asset".equals(scheme)) {
            if (this.X == null) {
                xs xsVar2 = new xs(context);
                this.X = xsVar2;
                b(xsVar2);
            }
            this.z0 = this.X;
        } else if ("content".equals(scheme)) {
            if (this.Y == null) {
                rp3 rp3 = new rp3(context);
                this.Y = rp3;
                b(rp3);
            }
            this.z0 = this.Y;
        } else {
            boolean equals = "rtmp".equals(scheme);
            qz3 qz3 = this.c;
            if (equals) {
                if (this.Z == null) {
                    try {
                        qz3 qz32 = (qz3) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor((Class[]) null).newInstance((Object[]) null);
                        this.Z = qz32;
                        b(qz32);
                    } catch (ClassNotFoundException unused) {
                        ez3.j0("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.Z == null) {
                        this.Z = qz3;
                    }
                }
                this.z0 = this.Z;
            } else if ("udp".equals(scheme)) {
                if (this.w0 == null) {
                    wte wte = new wte();
                    this.w0 = wte;
                    b(wte);
                }
                this.z0 = this.w0;
            } else if ("data".equals(scheme)) {
                if (this.x0 == null) {
                    ? fh02 = new fh0(false);
                    this.x0 = fh02;
                    b(fh02);
                }
                this.z0 = this.x0;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.y0 == null) {
                    iyb iyb = new iyb(context);
                    this.y0 = iyb;
                    b(iyb);
                }
                this.z0 = this.y0;
            } else {
                this.z0 = qz3;
            }
        }
        return this.z0.G(yz3);
    }

    public final void H(cqe cqe) {
        cqe.getClass();
        this.c.H(cqe);
        this.b.add(cqe);
        c(this.o, cqe);
        c(this.X, cqe);
        c(this.Y, cqe);
        c(this.Z, cqe);
        c(this.w0, cqe);
        c(this.x0, cqe);
        c(this.y0, cqe);
    }

    public final Map a() {
        qz3 qz3 = this.z0;
        return qz3 == null ? Collections.emptyMap() : qz3.a();
    }

    public final void b(qz3 qz3) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                qz3.H((cqe) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final void close() {
        qz3 qz3 = this.z0;
        if (qz3 != null) {
            try {
                qz3.close();
            } finally {
                this.z0 = null;
            }
        }
    }

    public final Uri getUri() {
        qz3 qz3 = this.z0;
        if (qz3 == null) {
            return null;
        }
        return qz3.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        qz3 qz3 = this.z0;
        qz3.getClass();
        return qz3.read(bArr, i, i2);
    }

    public h64(Context context, qz3 qz3) {
        this.a = context.getApplicationContext();
        qz3.getClass();
        this.c = qz3;
        this.b = new ArrayList();
    }
}
