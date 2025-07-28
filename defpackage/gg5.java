package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;

/* renamed from: gg5  reason: default package */
public final class gg5 implements gm6 {
    public static final lg8 d;
    public static final lg8 e;
    public static final Pattern f = Pattern.compile("^([0-9]+)-([0-9]+)/([0-9]+)");
    public final t97 a;
    public final r7e b;
    public final zpe c;

    static {
        lg8 lg8;
        Pattern pattern = lg8.d;
        lg8 lg82 = null;
        try {
            lg8 = oyb.A("application/x-binary; charset=x-user-defined");
        } catch (IllegalArgumentException unused) {
            lg8 = null;
        }
        d = lg8;
        try {
            lg82 = oyb.A("application/octet-stream");
        } catch (IllegalArgumentException unused2) {
        }
        e = lg82;
        try {
            oyb.A("multipart/form-data");
        } catch (IllegalArgumentException unused3) {
        }
    }

    public gg5(t97 t97, zpe zpe) {
        this.a = t97;
        this.c = zpe;
        this.b = new r7e(new xq(14, t97));
    }

    public static void a(gg5 gg5, m2d m2d, boolean z, String str) {
        m2d.d = z;
        m2d.e = str;
        zpe zpe = gg5.c;
        m2d.g = zpe.b();
        zpe.a(m2d.a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long c(xbc r4) {
        /*
            r0 = 0
            java.lang.String r1 = "X-Reason"
            ye6 r2 = r4.Y     // Catch:{ Exception -> 0x000c }
            java.lang.String r1 = r2.a(r1)     // Catch:{ Exception -> 0x000c }
            if (r1 == 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            int r4 = r4.o
            am6 r4 = defpackage.pa2.o(r4, r1)
            am6 r1 = defpackage.pa2.b
            boolean r1 = r1.equals(r4)
            java.lang.String r2 = "gg5"
            if (r1 != 0) goto L_0x005b
            am6 r1 = defpackage.pa2.c
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0026
            goto L_0x005b
        L_0x0026:
            am6 r1 = defpackage.pa2.g
            boolean r1 = r1.equals(r4)
            r3 = 1
            if (r1 != 0) goto L_0x004b
            am6 r1 = defpackage.pa2.e
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0038
            goto L_0x004b
        L_0x0038:
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r3 = "getErrorUploadPositionFromResponse"
            udd.R(r2, r0, r3, r1)
            eg5 r0 = new eg5
            r0.<init>(r4)
            throw r0
        L_0x004b:
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r1 = "getErrorUploadPositionFromResponse forbidden or bad request"
            udd.R(r2, r0, r1, r4)
            r0 = -1
            return r0
        L_0x005b:
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            java.lang.String r1 = "getErrorUploadPositionFromResponse not loaded yet, starting upload from 0"
            udd.R(r2, r0, r1, r4)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg5.c(xbc):long");
    }

    public static long e(xbc xbc) {
        ye6 ye6 = xbc.Y;
        String a2 = ye6.a("X-Last-Known-Byte");
        String str = null;
        if (a2 == null) {
            a2 = null;
        }
        if (a2 == null) {
            return 0;
        }
        String a3 = ye6.a("X-Last-Known-Byte");
        if (a3 != null) {
            str = a3;
        }
        try {
            return Long.parseLong(str) + 1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static void f(qm6 qm6) {
        if (!qm6.w0.get()) {
            qm6.Y.b(new oc4(28, qm6));
        }
    }

    public final lac b(File file, String str, sm6 sm6, lg8 lg8, long j, m2d m2d, qm6 qm6, int i) {
        s86 s86 = new s86();
        s86.a = sm6;
        s86.p(UUID.randomUUID().toString());
        int i2 = zc3.$EnumSwitchMapping$0[this.c.c().ordinal()];
        fg5 fg5 = new fg5(file, lg8, j, m2d, qm6, (i2 == 1 || i2 == 2) ? 32768 : i2 != 3 ? 4096 : 16384);
        if (i == 5) {
            String name = TextUtils.isEmpty(str) ? file.getName() : Uri.encode(str);
            String uuid = UUID.randomUUID().toString();
            uu0 uu0 = new uu0(uuid.getBytes(e22.a));
            uu0.b = uuid;
            lg8 lg82 = ka9.j;
            ArrayList arrayList = new ArrayList();
            lg8 lg83 = ka9.j;
            if (hhd.f(lg83.b, "multipart")) {
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                bm3.b(sb, "file");
                if (name != null) {
                    sb.append("; filename=");
                    bm3.b(sb, name);
                }
                String sb2 = sb.toString();
                ArrayList arrayList2 = new ArrayList(20);
                z3d.j("Content-Disposition");
                arrayList2.add("Content-Disposition");
                arrayList2.add(h0e.B0(sb2).toString());
                Object[] array = arrayList2.toArray(new String[0]);
                if (array != null) {
                    ye6 ye6 = new ye6((String[]) array);
                    if (ye6.a(HTTP.CONTENT_TYPE) != null) {
                        throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                    } else if (ye6.a(HTTP.CONTENT_LEN) == null) {
                        arrayList.add(new ja9(ye6, fg5));
                        if (!arrayList.isEmpty()) {
                            ka9 ka9 = new ka9(uu0, lg83, nze.w(arrayList));
                            Locale locale = Locale.ENGLISH;
                            String h = rf0.h("attachment; filename=", name);
                            ((xe6) s86.c).f("Content-type", lg83.a);
                            ((xe6) s86.c).f("Content-Disposition", h);
                            s86.m(HttpPost.METHOD_NAME, ka9);
                            return s86.j();
                        }
                        throw new IllegalStateException("Multipart body must have at least one part.".toString());
                    } else {
                        throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new IllegalArgumentException(("multipart != " + lg83).toString());
            }
        } else {
            String num = TextUtils.isEmpty(str) ? Integer.toString(file.getName().hashCode()) : Uri.encode(str);
            Locale locale2 = Locale.ENGLISH;
            long length = file.length();
            StringBuilder k = hr1.k(j, "bytes ", "-/");
            k.append(length);
            String sb3 = k.toString();
            String h2 = rf0.h("attachment; filename=", num);
            ((xe6) s86.c).f("Content-Range", sb3);
            ((xe6) s86.c).f("Content-Disposition", h2);
            s86.m(HttpPost.METHOD_NAME, fg5);
            return s86.j();
        }
    }

    public final long d(sm6 sm6) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList(20);
        String uuid = UUID.randomUUID().toString();
        Class<Object> cls = Object.class;
        if (uuid == null) {
            linkedHashMap.remove(cls);
        } else {
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put(cls, cls.cast(uuid));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            ye6 ye6 = new ye6((String[]) array);
            byte[] bArr = nze.a;
            xbc f2 = ((qw9) this.a.getValue()).b(new lac(sm6, HttpGet.METHOD_NAME, ye6, (d8) null, linkedHashMap.isEmpty() ? iw4.a : Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap)))).f();
            f1c f1c = f2.Z;
            try {
                if (!f2.m() || f1c == null) {
                    long c2 = c(f2);
                    if (f1c != null) {
                        f1c.close();
                    }
                    return c2;
                }
                String U = f1c.U();
                udd.q("gg5", "getUploadPosition body result: ".concat(U));
                Matcher matcher = f.matcher(U);
                if (matcher.find()) {
                    long parseLong = Long.parseLong(matcher.group(2));
                    udd.q("gg5", "getUploadPosition result: ".concat(U));
                    f1c.close();
                    return parseLong;
                }
                udd.s("gg5", "getUploadPosition unexpected response from server, range not found: ".concat(U), (Throwable) null);
                this.c.d("unexpected range header: ".concat(U));
                f1c.close();
                return -1;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw th;
    }

    public final long g(sm6 sm6) {
        s86 s86 = new s86();
        s86.a = sm6;
        s86.p(UUID.randomUUID().toString());
        s86.m(HttpPost.METHOD_NAME, new cg5(0));
        xbc f2 = ((qw9) this.a.getValue()).b(s86.j()).f();
        f1c f1c = f2.Z;
        try {
            if (f2.m()) {
                return e(f2);
            }
            long c2 = c(f2);
            if (f1c != null) {
                f1c.close();
            }
            return c2;
        } finally {
            if (f1c != null) {
                f1c.close();
            }
        }
    }
}
