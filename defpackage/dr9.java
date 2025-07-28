package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.util.SparseLongArray;
import java.io.File;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.http.entity.ContentLengthStrategy;
import org.webrtc.MediaStreamTrack;

/* renamed from: dr9  reason: default package */
public final class dr9 implements j26, gw3, g28, h75, x89, dja, n8c {
    public static final dr9 X = new dr9(5);
    public static dr9 Y;
    public static dr9 Z;
    public static final dr9 b = new dr9(1);
    public static final dr9 c = new dr9(2);
    public static final dr9 o = new dr9(4);
    public static final /* synthetic */ dr9 w0 = new dr9(19);
    public final /* synthetic */ int a;

    public /* synthetic */ dr9(int i) {
        this.a = i;
    }

    public static final void a(File... fileArr) {
        for (File file : fileArr) {
            if (file.exists()) {
                try {
                    h2g.h(file);
                } catch (IOException unused) {
                    file.toString();
                }
            }
        }
    }

    public static final lr c(File... fileArr) {
        lr lrVar = new lr();
        int i = 0;
        for (File file : fileArr) {
            boolean exists = file.exists();
            lg7 lg7 = hw4.a;
            if (exists) {
                try {
                    ByteBuffer wrap = ByteBuffer.wrap(ng5.K(file));
                    lg7 c2 = hwf.c();
                    while (wrap.hasRemaining()) {
                        try {
                            if (wrap.hasArray()) {
                                long j = wrap.getLong();
                                int i2 = wrap.getInt();
                                if (wrap.remaining() >= i2) {
                                    int position = wrap.position() + wrap.arrayOffset();
                                    mn7 mn7 = new mn7(j, cs.T(position, wrap.array(), position + i2));
                                    wrap.position(wrap.position() + i2);
                                    c2.add(mn7);
                                } else {
                                    throw new BufferUnderflowException();
                                }
                            } else {
                                throw new IllegalArgumentException("Only buffers with backing array supported".toString());
                            }
                        } catch (BufferUnderflowException unused) {
                        }
                    }
                    if (c2.getSize() > 1) {
                        t23.J(c2, new gu6(4));
                    }
                    lg7 = hwf.a(c2);
                } catch (Exception unused2) {
                    file.toString();
                }
            }
            if (!lg7.isEmpty()) {
                if (!lrVar.isEmpty()) {
                    if (!lrVar.isEmpty()) {
                        if (((mn7) lrVar.b[lrVar.h(p23.A(lrVar) + lrVar.a)]).a >= ((mn7) o23.V(lg7)).a) {
                            int i3 = lrVar.c;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    break;
                                } else if (((mn7) lrVar.get(i4)).a > ((mn7) o23.e0(lg7)).a) {
                                    lrVar.addAll(i4, lg7);
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    } else {
                        throw new NoSuchElementException("ArrayDeque is empty.");
                    }
                }
                lrVar.addAll(lg7);
            }
        }
        Iterator it = lrVar.iterator();
        while (it.hasNext()) {
            i += ((mn7) it.next()).c;
        }
        while (i > 65536) {
            i -= ((mn7) lrVar.j()).c;
        }
        return lrVar;
    }

    public static final String e(og0 og0) {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        int i = og0.b;
        if (i >= 0) {
            int[] iArr2 = new int[Math.max(i, 8)];
            int i2 = 0;
            while (og0.b != 0) {
                int u = og0.u();
                int length = iArr2.length;
                if (i2 < length) {
                    iArr = iArr2;
                } else {
                    iArr = new int[(length * 2)];
                    System.arraycopy(iArr2, 0, iArr, 0, length);
                    iArr2 = iArr;
                }
                iArr2[i2] = u;
                i2++;
                iArr2 = iArr;
            }
            while (i2 != 0) {
                if (i2 != 0) {
                    i2--;
                    int i3 = iArr2[i2];
                    String str = "";
                    switch (i3) {
                        case 0:
                        case 2:
                            break;
                        case 1:
                            str = "=";
                            break;
                        case 3:
                        case 5:
                            str = "{";
                            break;
                        case 4:
                            str = "{:";
                            break;
                        case 6:
                        case 7:
                            str = "[";
                            break;
                        default:
                            throw new IllegalArgumentException(wn6.h(i3, str));
                    }
                    sb.append(str);
                    og0.w(i3);
                } else {
                    throw new NoSuchElementException();
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException(wn6.h(i, "Illegal Capacity: "));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [xfd, java.lang.Object] */
    public static yfd h(cc9 cc9) {
        ? obj = new Object();
        obj.a = cc9.f;
        obj.c = cc9.b;
        obj.d = cc9.c;
        obj.b = cc9.e;
        obj.e = cc9.g;
        obj.f = cc9.d;
        return new yfd(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        urd.l(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String j(java.lang.Throwable r4) {
        /*
            java.lang.String r0 = "\n"
            if (r4 != 0) goto L_0x0007
            java.lang.String r4 = ""
            return r4
        L_0x0007:
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x003b }
            r1.<init>()     // Catch:{ all -> 0x003b }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x003b }
            r2.<init>(r1)     // Catch:{ all -> 0x003b }
            r4.printStackTrace(r2)     // Catch:{ all -> 0x0034 }
            r2.flush()     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0034 }
            java.lang.CharSequence r1 = h0e.B0(r1)     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0034 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r3.<init>(r0)     // Catch:{ all -> 0x0034 }
            r3.append(r1)     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0034 }
            r1 = 0
            urd.l(r2, r1)     // Catch:{ all -> 0x003b }
            goto L_0x0049
        L_0x0034:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r1 = move-exception
            urd.l(r2, r0)     // Catch:{ all -> 0x003b }
            throw r1     // Catch:{ all -> 0x003b }
        L_0x003b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\ncould not get stacktrace from error: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr9.j(java.lang.Throwable):java.lang.String");
    }

    public ape B(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public void K(utc utc) {
        throw new UnsupportedOperationException();
    }

    public void accept(Object obj, Object obj2) {
        ib5 ib5;
        vde vde = (vde) obj2;
        v2g v2g = (v2g) obj;
        i97 i97 = new i97(Long.MAX_VALUE, 0, false, (a3g) null);
        ib5[] h = v2g.h();
        ib5 ib52 = null;
        if (h != null) {
            int i = 0;
            while (true) {
                if (i >= h.length) {
                    ib5 = null;
                    break;
                }
                ib5 = h[i];
                if ("location_updates_with_callback".equals(ib5.a)) {
                    break;
                }
                i++;
            }
            if (ib5 != null && ib5.b() >= 1) {
                g6g o2 = v2g.o();
                d3g d3g = new d3g(4, (IBinder) null, new r2g(1, vde), (PendingIntent) null, (String) null);
                Parcel G0 = o2.G0();
                t1g.b(G0, i97);
                t1g.b(G0, d3g);
                o2.H0(G0, 90);
                return;
            }
        }
        ib5[] h2 = v2g.h();
        if (h2 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= h2.length) {
                    break;
                }
                ib5 ib53 = h2[i2];
                if ("get_last_location_with_request".equals(ib53.a)) {
                    ib52 = ib53;
                    break;
                }
                i2++;
            }
            if (ib52 != null && ib52.b() >= 1) {
                g6g o3 = v2g.o();
                r2g r2g = new r2g(1, vde);
                Parcel G02 = o3.G0();
                t1g.b(G02, i97);
                G02.writeStrongBinder(r2g);
                o3.H0(G02, 82);
                return;
            }
        }
        g6g o4 = v2g.o();
        Parcel G03 = o4.G0();
        Parcel obtain = Parcel.obtain();
        try {
            o4.d.transact(7, G03, obtain, 0);
            obtain.readException();
            G03.recycle();
            obtain.recycle();
            vde.b((Location) t1g.a(obtain, Location.CREATOR));
        } catch (RuntimeException e) {
            obtain.recycle();
            throw e;
        } catch (Throwable th) {
            G03.recycle();
            throw th;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                qmc qmc = (qmc) obj;
                return (qmc) ((nbe) ((mbe) y93.g.getValue())).c.getValue();
            default:
                return ms9.j((List) obj);
        }
    }

    public Object b() {
        throw new RuntimeException("No update");
    }

    public boolean d() {
        return false;
    }

    public Object f(ws8 ws8) {
        return Long.valueOf(jjd.J(ws8, 0));
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [kk9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [nu7, java.lang.Object] */
    public i28 g(e28 e28) {
        String str;
        if (mze.a < 31) {
            return new Object().g(e28);
        }
        int g = b49.g(e28.c.A0);
        switch (g) {
            case ContentLengthStrategy.CHUNKED /*-2*/:
                str = "none";
                break;
            case -1:
                str = "unknown";
                break;
            case 0:
                str = "default";
                break;
            case 1:
                str = MediaStreamTrack.AUDIO_TRACK_KIND;
                break;
            case 2:
                str = MediaStreamTrack.VIDEO_TRACK_KIND;
                break;
            case 3:
                str = "text";
                break;
            case 4:
                str = "image";
                break;
            case 5:
                str = "metadata";
                break;
            case 6:
                str = "camera motion";
                break;
            default:
                if (g < 10000) {
                    str = "?";
                    break;
                } else {
                    StringBuilder sb = new StringBuilder(20);
                    sb.append("custom (");
                    sb.append(g);
                    sb.append(")");
                    str = sb.toString();
                    break;
                }
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Creating an asynchronous MediaCodec adapter for track type ".concat(valueOf);
        }
        cx cxVar = new cx(g, 0);
        cx cxVar2 = new cx(g, 2);
        ? obj = new Object();
        obj.a = cxVar;
        obj.b = cxVar2;
        return obj.g(e28);
    }

    public Object i() {
        return null;
    }

    public void w() {
        throw new UnsupportedOperationException();
    }

    public dr9() {
        this.a = 15;
        new SparseLongArray();
    }
}
