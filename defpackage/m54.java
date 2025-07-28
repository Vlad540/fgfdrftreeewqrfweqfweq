package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: m54  reason: default package */
public class m54 implements o20, i83, dfe, c4e, z18, x89, c6c {
    public static final m54 X = new Object();
    public static final m54 Y = new Object();
    public static m54 a;
    public static final m54 b = new Object();
    public static final m54 c = new Object();
    public static final m54 o = new Object();

    public static ArrayList g(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(j((le1) entry.getKey(), (vl1) entry.getValue()));
        }
        return arrayList;
    }

    public static aze j(le1 le1, vl1 vl1) {
        lge lge = new lge(vl1.getName());
        ub0 ub0 = new ub0(vl1.getName(), le1.a);
        String q = vl1.q();
        if (q == null) {
            q = BuildConfig.FLAVOR;
        }
        return new aze(lge, ub0, q, le1);
    }

    public static byte[] k(long j, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uw3 uw3 = (uw3) it.next();
            Bundle b2 = uw3.b();
            Bitmap bitmap = uw3.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                oyb.k(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                b2.putByteArray(uw3.w, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(b2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static jt4 n(int i) {
        Object obj;
        pz4 pz4 = jt4.x0;
        pz4.getClass();
        u1 u1Var = new u1(0, pz4);
        while (true) {
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((jt4) obj).a == i) {
                break;
            }
        }
        jt4 jt4 = (jt4) obj;
        return jt4 == null ? jt4.CLASSIC : jt4;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, m54] */
    public static synchronized m54 p() {
        m54 m54;
        synchronized (m54.class) {
            try {
                if (a == null) {
                    a = new Object();
                }
                m54 = a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return m54;
    }

    public static int q(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public static lee s(int i) {
        Object obj;
        lee.b.getClass();
        Iterator it = lee.Z.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((lee) obj).a == i) {
                break;
            }
        }
        lee lee = (lee) obj;
        if (lee != null) {
            return lee;
        }
        throw new IllegalArgumentException(rf0.f(i, "No such value ", " for TaskStatus"));
    }

    public static una t(int i) {
        Object obj;
        una.b.getClass();
        Iterator it = una.i1.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((una) obj).a == i) {
                break;
            }
        }
        una una = (una) obj;
        if (una != null) {
            return una;
        }
        throw new IllegalArgumentException(rf0.f(i, "No such value ", " for PersistableTaskType"));
    }

    public long a() {
        throw new NoSuchElementException();
    }

    public long b() {
        throw new NoSuchElementException();
    }

    public d4e c(lga lga) {
        return new wz5((Context) lga.c, (String) lga.o, (ope) lga.X, lga.a, lga.b);
    }

    public int d(int i, CharSequence charSequence) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            char c2 = 2;
            if (i2 >= i) {
                return z ? 1 : 2;
            }
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            efe efe = gfe.a;
            if (directionality == 0) {
                c2 = 1;
            } else if (directionality == 1 || directionality == 2) {
                c2 = 0;
            }
            if (c2 == 0) {
                return 0;
            }
            if (c2 == 1) {
                z = true;
            }
            i2++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: ws1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: ws1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v35, resolved type: ws1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: ws1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(java.lang.Object r10) {
        /*
            r9 = this;
            ja0 r10 = (defpackage.ja0) r10
            lr6 r1 = r10.b
            s4b r9 = r10.a
            int r10 = r1.k0()
            boolean r10 = defpackage.am7.u(r10)
            r0 = 0
            if (r10 == 0) goto L_0x004f
            rt0 r10 = defpackage.i25.b     // Catch:{ IOException -> 0x0046 }
            mv4[] r10 = r1.v()     // Catch:{ IOException -> 0x0046 }
            r10 = r10[r0]     // Catch:{ IOException -> 0x0046 }
            java.nio.ByteBuffer r10 = r10.E()     // Catch:{ IOException -> 0x0046 }
            r10.rewind()     // Catch:{ IOException -> 0x0046 }
            int r2 = r10.capacity()     // Catch:{ IOException -> 0x0046 }
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x0046 }
            r10.get(r2)     // Catch:{ IOException -> 0x0046 }
            java.io.ByteArrayInputStream r10 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0046 }
            r10.<init>(r2)     // Catch:{ IOException -> 0x0046 }
            i25 r2 = new i25     // Catch:{ IOException -> 0x0046 }
            v25 r3 = new v25     // Catch:{ IOException -> 0x0046 }
            r3.<init>((java.io.InputStream) r10)     // Catch:{ IOException -> 0x0046 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0046 }
            mv4[] r10 = r1.v()     // Catch:{ IOException -> 0x0046 }
            r10 = r10[r0]     // Catch:{ IOException -> 0x0046 }
            java.nio.ByteBuffer r10 = r10.E()     // Catch:{ IOException -> 0x0046 }
            r10.rewind()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0051
        L_0x0046:
            r9 = move-exception
            androidx.camera.core.ImageCaptureException r10 = new androidx.camera.core.ImageCaptureException
            java.lang.String r0 = "Failed to extract EXIF data."
            r10.<init>(r0, r9)
            throw r10
        L_0x004f:
            r10 = 0
            r2 = r10
        L_0x0051:
            xe6 r10 = defpackage.wf4.a
            java.lang.Class<androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk> r3 = androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.class
            zkb r10 = r10.j(r3)
            androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk r10 = (androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk) r10
            if (r10 == 0) goto L_0x0061
            z80 r10 = defpackage.pw1.i
            goto L_0x0109
        L_0x0061:
            int r10 = r1.k0()
            boolean r10 = defpackage.am7.u(r10)
            if (r10 == 0) goto L_0x0109
            java.lang.String r10 = "JPEG image must have exif."
            defpackage.e07.o(r2, r10)
            android.util.Size r10 = new android.util.Size
            int r3 = r1.getWidth()
            int r4 = r1.getHeight()
            r10.<init>(r3, r4)
            int r3 = r9.c
            int r4 = r2.a()
            int r3 = r3 - r4
            int r4 = defpackage.hqe.i(r3)
            boolean r4 = defpackage.hqe.c(r4)
            if (r4 == 0) goto L_0x009c
            android.util.Size r4 = new android.util.Size
            int r5 = r10.getHeight()
            int r6 = r10.getWidth()
            r4.<init>(r5, r6)
            goto L_0x009d
        L_0x009c:
            r4 = r10
        L_0x009d:
            android.graphics.RectF r5 = new android.graphics.RectF
            int r6 = r10.getWidth()
            float r6 = (float) r6
            int r10 = r10.getHeight()
            float r10 = (float) r10
            r7 = 0
            r5.<init>(r7, r7, r6, r10)
            android.graphics.RectF r10 = new android.graphics.RectF
            int r6 = r4.getWidth()
            float r6 = (float) r6
            int r8 = r4.getHeight()
            float r8 = (float) r8
            r10.<init>(r7, r7, r6, r8)
            android.graphics.Matrix r10 = defpackage.hqe.a(r5, r10, r3, r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            android.graphics.Rect r3 = r9.b
            r0.<init>(r3)
            r10.mapRect(r0)
            r0.sort()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r0.round(r5)
            int r6 = r2.a()
            android.graphics.Matrix r7 = new android.graphics.Matrix
            android.graphics.Matrix r9 = r9.e
            r7.<init>(r9)
            r7.postConcat(r10)
            pq6 r9 = r1.getImageInfo()
            boolean r9 = r9 instanceof defpackage.xs1
            if (r9 == 0) goto L_0x00f5
            pq6 r9 = r1.getImageInfo()
            xs1 r9 = (defpackage.xs1) r9
            ws1 r9 = r9.a
        L_0x00f3:
            r8 = r9
            goto L_0x00fb
        L_0x00f5:
            cqc r9 = new cqc
            r9.<init>()
            goto L_0x00f3
        L_0x00fb:
            r1.k0()
            ea0 r9 = new ea0
            int r3 = r1.k0()
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x014d
        L_0x0109:
            android.graphics.Rect r5 = r9.b
            pq6 r10 = r1.getImageInfo()
            boolean r10 = r10 instanceof defpackage.xs1
            if (r10 == 0) goto L_0x011d
            pq6 r10 = r1.getImageInfo()
            xs1 r10 = (defpackage.xs1) r10
            ws1 r10 = r10.a
        L_0x011b:
            r8 = r10
            goto L_0x0123
        L_0x011d:
            cqc r10 = new cqc
            r10.<init>()
            goto L_0x011b
        L_0x0123:
            int r6 = r9.c
            android.graphics.Matrix r7 = r9.e
            android.util.Size r4 = new android.util.Size
            int r9 = r1.getWidth()
            int r10 = r1.getHeight()
            r4.<init>(r9, r10)
            int r9 = r1.k0()
            boolean r9 = defpackage.am7.u(r9)
            if (r9 == 0) goto L_0x0143
            java.lang.String r9 = "JPEG image must have Exif."
            defpackage.e07.o(r2, r9)
        L_0x0143:
            ea0 r9 = new ea0
            int r3 = r1.k0()
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x014d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m54.e(java.lang.Object):java.lang.Object");
    }

    public Object f(ws8 ws8) {
        long j = 0;
        try {
            j = jjd.J(ws8, 0);
        } catch (Throwable th) {
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th);
            }
            int t = hr1.t(m4b.a);
            if (t != 0) {
                if (t != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
        }
        return Long.valueOf(j);
    }

    public Object h(uwb uwb) {
        return kjd.r((Executor) uwb.f(new pjb(ld0.class, Executor.class)));
    }

    public boolean i(UnsatisfiedLinkError unsatisfiedLinkError, ild[] ildArr) {
        hld hld;
        String message;
        if (!(unsatisfiedLinkError instanceof hld) || (unsatisfiedLinkError instanceof gld) || (message = hld.getMessage()) == null || (!message.contains("/app/") && !message.contains("/mnt/"))) {
            return false;
        }
        Objects.toString(unsatisfiedLinkError);
        String str = (hld = (hld) unsatisfiedLinkError).a;
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (je0 je0 : ildArr) {
            if (je0 instanceof je0) {
                je0 je02 = je0;
                try {
                    je02.getClass();
                    je02.d(2);
                } catch (Exception unused) {
                    je02.getClass();
                    return false;
                }
            }
        }
        return true;
    }

    public zm0 l(tr6 tr6, Object obj) {
        zm0 zm0 = new zm0(m(tr6.b).toString(), tr6.i, tr6.j, tr6.h, (ov0) null, (String) null);
        zm0.g = obj;
        return zm0;
    }

    public Uri m(Uri uri) {
        return uri;
    }

    public boolean next() {
        return false;
    }

    public ngd o(Uri uri) {
        return new ngd(m(uri).toString());
    }

    public zm0 r(tr6 tr6, Object obj) {
        String str;
        ov0 ov0;
        k1b k1b = tr6.q;
        if (k1b != null) {
            ov0 b2 = k1b.b();
            str = k1b.getClass().getName();
            ov0 = b2;
        } else {
            ov0 = null;
            str = null;
        }
        zm0 zm0 = new zm0(m(tr6.b).toString(), tr6.i, tr6.j, tr6.h, ov0, str);
        zm0.g = obj;
        return zm0;
    }
}
