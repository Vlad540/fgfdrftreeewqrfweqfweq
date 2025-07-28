package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: g64  reason: default package */
public final class g64 implements oz3 {
    public ws X;
    public qp3 Y;
    public oz3 Z;
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final oz3 c;
    public ld5 o;
    public vte w0;
    public kz3 x0;
    public hyb y0;
    public oz3 z0;

    public g64(Context context, oz3 oz3) {
        this.a = context.getApplicationContext();
        oz3.getClass();
        this.c = oz3;
    }

    public static void c(oz3 oz3, bqe bqe) {
        if (oz3 != null) {
            oz3.O(bqe);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [oz3, eh0, ld5] */
    /* JADX WARNING: type inference failed for: r0v18, types: [kz3, oz3, eh0] */
    public final long N(xz3 xz3) {
        swb.h(this.z0 == null);
        String scheme = xz3.a.getScheme();
        int i = mze.a;
        Uri uri = xz3.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.o == null) {
                    ? eh0 = new eh0(false);
                    this.o = eh0;
                    b(eh0);
                }
                this.z0 = this.o;
            } else {
                if (this.X == null) {
                    ws wsVar = new ws(context);
                    this.X = wsVar;
                    b(wsVar);
                }
                this.z0 = this.X;
            }
        } else if ("asset".equals(scheme)) {
            if (this.X == null) {
                ws wsVar2 = new ws(context);
                this.X = wsVar2;
                b(wsVar2);
            }
            this.z0 = this.X;
        } else if ("content".equals(scheme)) {
            if (this.Y == null) {
                qp3 qp3 = new qp3(context);
                this.Y = qp3;
                b(qp3);
            }
            this.z0 = this.Y;
        } else {
            boolean equals = "rtmp".equals(scheme);
            oz3 oz3 = this.c;
            if (equals) {
                if (this.Z == null) {
                    try {
                        oz3 oz32 = (oz3) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor((Class[]) null).newInstance((Object[]) null);
                        this.Z = oz32;
                        b(oz32);
                    } catch (ClassNotFoundException unused) {
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.Z == null) {
                        this.Z = oz3;
                    }
                }
                this.z0 = this.Z;
            } else if ("udp".equals(scheme)) {
                if (this.w0 == null) {
                    vte vte = new vte();
                    this.w0 = vte;
                    b(vte);
                }
                this.z0 = this.w0;
            } else if ("data".equals(scheme)) {
                if (this.x0 == null) {
                    ? eh02 = new eh0(false);
                    this.x0 = eh02;
                    b(eh02);
                }
                this.z0 = this.x0;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.y0 == null) {
                    hyb hyb = new hyb(context);
                    this.y0 = hyb;
                    b(hyb);
                }
                this.z0 = this.y0;
            } else {
                this.z0 = oz3;
            }
        }
        return this.z0.N(xz3);
    }

    public final void O(bqe bqe) {
        bqe.getClass();
        this.c.O(bqe);
        this.b.add(bqe);
        c(this.o, bqe);
        c(this.X, bqe);
        c(this.Y, bqe);
        c(this.Z, bqe);
        c(this.w0, bqe);
        c(this.x0, bqe);
        c(this.y0, bqe);
    }

    public final Map a() {
        oz3 oz3 = this.z0;
        return oz3 == null ? Collections.emptyMap() : oz3.a();
    }

    public final void b(oz3 oz3) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                oz3.O((bqe) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final void close() {
        oz3 oz3 = this.z0;
        if (oz3 != null) {
            try {
                oz3.close();
            } finally {
                this.z0 = null;
            }
        }
    }

    public final Uri getUri() {
        oz3 oz3 = this.z0;
        if (oz3 == null) {
            return null;
        }
        return oz3.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        oz3 oz3 = this.z0;
        oz3.getClass();
        return oz3.read(bArr, i, i2);
    }
}
