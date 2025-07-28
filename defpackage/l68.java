package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: l68  reason: default package */
public final class l68 {
    public static final l68 g;
    public static final String h = Integer.toString(0, 36);
    public static final String i = Integer.toString(1, 36);
    public static final String j = Integer.toString(2, 36);
    public static final String k = Integer.toString(3, 36);
    public static final String l = Integer.toString(4, 36);
    public static final String m = Integer.toString(5, 36);
    public final String a;
    public final a68 b;
    public final z58 c;
    public final z78 d;
    public final v58 e;
    public final d68 f;

    static {
        r58 r58 = new r58();
        q44 q44 = new q44();
        Collections.emptyList();
        e8c e8c = e8c.X;
        x58 x58 = new x58();
        d68 d68 = d68.d;
        oyb.k(((Uri) q44.e) == null || ((UUID) q44.d) != null);
        g = new l68(BuildConfig.FLAVOR, r58.c(), (a68) null, x58.a(), z78.J, d68);
    }

    public l68(String str, v58 v58, a68 a68, z58 z58, z78 z78, d68 d68) {
        this.a = str;
        this.b = a68;
        this.c = z58;
        this.d = z78;
        this.e = v58;
        this.f = d68;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: t58} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: v58} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: t58} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: v58} */
    /* JADX WARNING: type inference failed for: r3v2, types: [it4, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.l68 b(android.os.Bundle r27) {
        /*
            r0 = r27
            r1 = 0
            java.lang.String r2 = h
            java.lang.String r3 = ""
            java.lang.String r5 = r0.getString(r2, r3)
            r5.getClass()
            java.lang.String r2 = i
            android.os.Bundle r2 = r0.getBundle(r2)
            if (r2 != 0) goto L_0x001a
            z58 r2 = defpackage.z58.f
        L_0x0018:
            r8 = r2
            goto L_0x001f
        L_0x001a:
            z58 r2 = defpackage.z58.b(r2)
            goto L_0x0018
        L_0x001f:
            java.lang.String r2 = j
            android.os.Bundle r2 = r0.getBundle(r2)
            if (r2 != 0) goto L_0x002b
            z78 r2 = defpackage.z78.J
        L_0x0029:
            r9 = r2
            goto L_0x0030
        L_0x002b:
            z78 r2 = defpackage.z78.b(r2)
            goto L_0x0029
        L_0x0030:
            java.lang.String r2 = k
            android.os.Bundle r2 = r0.getBundle(r2)
            if (r2 != 0) goto L_0x003c
            v58 r2 = defpackage.v58.p
        L_0x003a:
            r6 = r2
            goto L_0x009f
        L_0x003c:
            r58 r3 = new r58
            r3.<init>()
            t58 r4 = defpackage.t58.h
            long r6 = r4.a
            java.lang.String r10 = defpackage.t58.i
            long r6 = r2.getLong(r10, r6)
            r3.e(r6)
            java.lang.String r6 = defpackage.t58.j
            long r10 = r4.c
            long r6 = r2.getLong(r6, r10)
            long r6 = defpackage.oze.S(r6)
            r3.d(r6)
            java.lang.String r6 = defpackage.t58.k
            boolean r7 = r4.e
            boolean r6 = r2.getBoolean(r6, r7)
            r3.c = r6
            java.lang.String r6 = defpackage.t58.l
            boolean r7 = r4.f
            boolean r6 = r2.getBoolean(r6, r7)
            r3.d = r6
            java.lang.String r6 = defpackage.t58.m
            boolean r7 = r4.g
            boolean r6 = r2.getBoolean(r6, r7)
            r3.e = r6
            java.lang.String r6 = defpackage.t58.n
            long r10 = r4.b
            long r6 = r2.getLong(r6, r10)
            int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x008a
            r3.f(r6)
        L_0x008a:
            java.lang.String r6 = defpackage.t58.o
            long r10 = r4.d
            long r6 = r2.getLong(r6, r10)
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0099
            r3.d(r6)
        L_0x0099:
            v58 r2 = new v58
            r2.<init>(r3)
            goto L_0x003a
        L_0x009f:
            java.lang.String r2 = l
            android.os.Bundle r2 = r0.getBundle(r2)
            if (r2 != 0) goto L_0x00ab
            d68 r2 = defpackage.d68.d
        L_0x00a9:
            r10 = r2
            goto L_0x00d0
        L_0x00ab:
            it4 r3 = new it4
            r3.<init>()
            java.lang.String r4 = defpackage.d68.e
            android.os.Parcelable r4 = r2.getParcelable(r4)
            android.net.Uri r4 = (android.net.Uri) r4
            r3.a = r4
            java.lang.String r4 = defpackage.d68.f
            java.lang.String r4 = r2.getString(r4)
            r3.b = r4
            java.lang.String r4 = defpackage.d68.g
            android.os.Bundle r2 = r2.getBundle(r4)
            r3.c = r2
            d68 r2 = new d68
            r2.<init>(r3)
            goto L_0x00a9
        L_0x00d0:
            java.lang.String r2 = m
            android.os.Bundle r0 = r0.getBundle(r2)
            if (r0 != 0) goto L_0x00db
            r7 = 0
            goto L_0x0241
        L_0x00db:
            java.lang.String r3 = defpackage.a68.l
            android.os.Bundle r3 = r0.getBundle(r3)
            if (r3 != 0) goto L_0x00e7
            r19 = 0
            goto L_0x018e
        L_0x00e7:
            java.lang.String r4 = defpackage.w58.i
            java.lang.String r4 = r3.getString(r4)
            r4.getClass()
            java.util.UUID r4 = java.util.UUID.fromString(r4)
            java.lang.String r7 = defpackage.w58.j
            android.os.Parcelable r7 = r3.getParcelable(r7)
            android.net.Uri r7 = (android.net.Uri) r7
            android.os.Bundle r11 = android.os.Bundle.EMPTY
            java.lang.String r12 = defpackage.w58.k
            android.os.Bundle r12 = r3.getBundle(r12)
            if (r12 == 0) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r12 = r11
        L_0x0108:
            if (r12 != r11) goto L_0x010d
            j8c r11 = defpackage.j8c.w0
            goto L_0x0137
        L_0x010d:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            if (r12 != r11) goto L_0x0115
            goto L_0x0133
        L_0x0115:
            java.util.Set r11 = r12.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x011d:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x0133
            java.lang.Object r14 = r11.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r15 = r12.getString(r14)
            if (r15 == 0) goto L_0x011d
            r13.put(r14, r15)
            goto L_0x011d
        L_0x0133:
            zs6 r11 = defpackage.zs6.b(r13)
        L_0x0137:
            java.lang.String r12 = defpackage.w58.l
            boolean r12 = r3.getBoolean(r12, r1)
            java.lang.String r13 = defpackage.w58.m
            boolean r13 = r3.getBoolean(r13, r1)
            java.lang.String r14 = defpackage.w58.n
            boolean r14 = r3.getBoolean(r14, r1)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.lang.String r2 = defpackage.w58.o
            java.util.ArrayList r2 = r3.getIntegerArrayList(r2)
            if (r2 == 0) goto L_0x0157
            r15 = r2
        L_0x0157:
            ws6 r2 = defpackage.ws6.j(r15)
            java.lang.String r15 = defpackage.w58.p
            byte[] r3 = r3.getByteArray(r15)
            q44 r15 = new q44
            r15.<init>()
            r15.d = r4
            r15.e = r7
            zs6 r4 = defpackage.zs6.b(r11)
            r15.f = r4
            r15.a = r12
            r15.c = r14
            r15.b = r13
            ws6 r2 = defpackage.ws6.j(r2)
            r15.g = r2
            if (r3 == 0) goto L_0x0184
            int r2 = r3.length
            byte[] r2 = java.util.Arrays.copyOf(r3, r2)
            goto L_0x0185
        L_0x0184:
            r2 = 0
        L_0x0185:
            r15.h = r2
            w58 r2 = new w58
            r2.<init>(r15)
            r19 = r2
        L_0x018e:
            java.lang.String r2 = defpackage.a68.m
            android.os.Bundle r2 = r0.getBundle(r2)
            if (r2 != 0) goto L_0x0199
            r20 = 0
            goto L_0x01b4
        L_0x0199:
            java.lang.String r3 = defpackage.p58.b
            android.os.Parcelable r2 = r2.getParcelable(r3)
            android.net.Uri r2 = (android.net.Uri) r2
            r2.getClass()
            gvf r3 = new gvf
            r4 = 19
            r3.<init>((int) r4, (boolean) r1)
            r3.b = r2
            p58 r2 = new p58
            r2.<init>(r3)
            r20 = r2
        L_0x01b4:
            java.lang.String r2 = defpackage.a68.n
            java.util.ArrayList r2 = r0.getParcelableArrayList(r2)
            if (r2 != 0) goto L_0x01c3
            po5 r1 = defpackage.ws6.b
            e8c r1 = defpackage.e8c.X
        L_0x01c0:
            r21 = r1
            goto L_0x01f9
        L_0x01c3:
            ts6 r3 = defpackage.ws6.i()
            r4 = r1
        L_0x01c8:
            int r7 = r2.size()
            if (r4 >= r7) goto L_0x01f4
            java.lang.Object r7 = r2.get(r4)
            android.os.Bundle r7 = (android.os.Bundle) r7
            r7.getClass()
            izd r11 = new izd
            java.lang.String r12 = defpackage.izd.o
            int r12 = r7.getInt(r12, r1)
            java.lang.String r13 = defpackage.izd.X
            int r13 = r7.getInt(r13, r1)
            java.lang.String r14 = defpackage.izd.Y
            int r7 = r7.getInt(r14, r1)
            r11.<init>(r12, r13, r7)
            r3.a(r11)
            int r4 = r4 + 1
            goto L_0x01c8
        L_0x01f4:
            e8c r1 = r3.j()
            goto L_0x01c0
        L_0x01f9:
            java.lang.String r1 = defpackage.a68.p
            java.util.ArrayList r1 = r0.getParcelableArrayList(r1)
            if (r1 != 0) goto L_0x0208
            po5 r1 = defpackage.ws6.b
            e8c r1 = defpackage.e8c.X
        L_0x0205:
            r23 = r1
            goto L_0x0213
        L_0x0208:
            x48 r2 = new x48
            r3 = 6
            r2.<init>(r3)
            e8c r1 = defpackage.gt0.v(r2, r1)
            goto L_0x0205
        L_0x0213:
            java.lang.String r1 = defpackage.a68.q
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r25 = r0.getLong(r1, r2)
            a68 r1 = new a68
            java.lang.String r2 = defpackage.a68.j
            android.os.Parcelable r2 = r0.getParcelable(r2)
            r17 = r2
            android.net.Uri r17 = (android.net.Uri) r17
            r17.getClass()
            java.lang.String r2 = defpackage.a68.k
            java.lang.String r18 = r0.getString(r2)
            java.lang.String r2 = defpackage.a68.o
            java.lang.String r22 = r0.getString(r2)
            r24 = 0
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r7 = r1
        L_0x0241:
            l68 r0 = new l68
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l68.b(android.os.Bundle):l68");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: t58} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: v58} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.l68 c(android.net.Uri r21) {
        /*
            r58 r0 = new r58
            r0.<init>()
            q44 r1 = new q44
            r1.<init>()
            java.util.List r7 = java.util.Collections.emptyList()
            e8c r9 = defpackage.e8c.X
            x58 r13 = new x58
            r13.<init>()
            d68 r20 = defpackage.d68.d
            java.lang.Object r2 = r1.e
            android.net.Uri r2 = (android.net.Uri) r2
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r1.d
            java.util.UUID r2 = (java.util.UUID) r2
            if (r2 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r2 = 0
            goto L_0x0027
        L_0x0026:
            r2 = 1
        L_0x0027:
            defpackage.oyb.k(r2)
            r2 = 0
            if (r21 == 0) goto L_0x004d
            a68 r14 = new a68
            java.lang.Object r3 = r1.d
            java.util.UUID r3 = (java.util.UUID) r3
            if (r3 == 0) goto L_0x003a
            w58 r2 = new w58
            r2.<init>(r1)
        L_0x003a:
            r5 = r2
            r10 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 0
            r6 = 0
            r8 = 0
            r2 = r14
            r3 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r17 = r14
            goto L_0x004f
        L_0x004d:
            r17 = r2
        L_0x004f:
            l68 r1 = new l68
            v58 r2 = new v58
            r2.<init>(r0)
            z58 r0 = new z58
            r0.<init>(r13)
            z78 r19 = defpackage.z78.J
            java.lang.String r15 = ""
            r14 = r1
            r16 = r2
            r18 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l68.c(android.net.Uri):l68");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [q58, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [q44, java.lang.Object] */
    public final q58 a() {
        q44 q44;
        ? obj = new Object();
        obj.d = new r58();
        obj.e = new q44();
        obj.f = Collections.emptyList();
        obj.h = e8c.X;
        obj.m = new x58();
        obj.n = d68.d;
        obj.k = -9223372036854775807L;
        obj.d = this.e.a();
        obj.a = this.a;
        obj.l = this.d;
        obj.m = this.c.a();
        obj.n = this.f;
        a68 a68 = this.b;
        if (a68 != null) {
            obj.g = a68.f;
            obj.c = a68.b;
            obj.b = a68.a;
            obj.f = a68.e;
            obj.h = a68.g;
            obj.j = a68.h;
            w58 w58 = a68.c;
            if (w58 != null) {
                ? obj2 = new Object();
                obj2.d = w58.a;
                obj2.e = w58.b;
                obj2.f = w58.c;
                obj2.a = w58.d;
                obj2.b = w58.e;
                obj2.c = w58.f;
                obj2.g = w58.g;
                obj2.h = w58.h;
                q44 = obj2;
            } else {
                q44 = new q44();
            }
            obj.e = q44;
            obj.i = a68.d;
            obj.k = a68.i;
        }
        return obj;
    }

    public final Bundle d(boolean z) {
        a68 a68;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals(BuildConfig.FLAVOR)) {
            bundle.putString(h, str);
        }
        z58 z58 = z58.f;
        z58 z582 = this.c;
        if (!z582.equals(z58)) {
            bundle.putBundle(i, z582.c());
        }
        z78 z78 = z78.J;
        z78 z782 = this.d;
        if (!z782.equals(z78)) {
            bundle.putBundle(j, z782.c());
        }
        t58 t58 = t58.h;
        v58 v58 = this.e;
        if (!v58.equals(t58)) {
            Bundle bundle2 = new Bundle();
            long j2 = t58.a;
            long j3 = v58.a;
            if (j3 != j2) {
                bundle2.putLong(t58.i, j3);
            }
            long j4 = t58.c;
            long j5 = v58.c;
            if (j5 != j4) {
                bundle2.putLong(t58.j, j5);
            }
            long j6 = t58.b;
            long j7 = v58.b;
            if (j7 != j6) {
                bundle2.putLong(t58.n, j7);
            }
            long j8 = t58.d;
            long j9 = v58.d;
            if (j9 != j8) {
                bundle2.putLong(t58.o, j9);
            }
            boolean z2 = t58.e;
            boolean z3 = v58.e;
            if (z3 != z2) {
                bundle2.putBoolean(t58.k, z3);
            }
            boolean z4 = t58.f;
            boolean z5 = v58.f;
            if (z5 != z4) {
                bundle2.putBoolean(t58.l, z5);
            }
            boolean z6 = t58.g;
            boolean z7 = v58.g;
            if (z7 != z6) {
                bundle2.putBoolean(t58.m, z7);
            }
            bundle.putBundle(k, bundle2);
        }
        d68 d68 = d68.d;
        d68 d682 = this.f;
        if (!d682.equals(d68)) {
            Bundle bundle3 = new Bundle();
            Uri uri = d682.a;
            if (uri != null) {
                bundle3.putParcelable(d68.e, uri);
            }
            String str2 = d682.b;
            if (str2 != null) {
                bundle3.putString(d68.f, str2);
            }
            Bundle bundle4 = d682.c;
            if (bundle4 != null) {
                bundle3.putBundle(d68.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (a68 = this.b) != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(a68.j, a68.a);
            String str3 = a68.b;
            if (str3 != null) {
                bundle5.putString(a68.k, str3);
            }
            w58 w58 = a68.c;
            if (w58 != null) {
                Bundle bundle6 = new Bundle();
                bundle6.putString(w58.i, w58.a.toString());
                Uri uri2 = w58.b;
                if (uri2 != null) {
                    bundle6.putParcelable(w58.j, uri2);
                }
                zs6 zs6 = w58.c;
                if (!zs6.isEmpty()) {
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : zs6.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(w58.k, bundle7);
                }
                boolean z8 = w58.d;
                if (z8) {
                    bundle6.putBoolean(w58.l, z8);
                }
                boolean z9 = w58.e;
                if (z9) {
                    bundle6.putBoolean(w58.m, z9);
                }
                boolean z10 = w58.f;
                if (z10) {
                    bundle6.putBoolean(w58.n, z10);
                }
                ws6 ws6 = w58.g;
                if (!ws6.isEmpty()) {
                    bundle6.putIntegerArrayList(w58.o, new ArrayList(ws6));
                }
                byte[] bArr = w58.h;
                if (bArr != null) {
                    bundle6.putByteArray(w58.p, bArr);
                }
                bundle5.putBundle(a68.l, bundle6);
            }
            p58 p58 = a68.d;
            if (p58 != null) {
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(p58.b, p58.a);
                bundle5.putBundle(a68.m, bundle8);
            }
            List list = a68.e;
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(a68.n, gt0.M(list, new x48(4)));
            }
            String str4 = a68.f;
            if (str4 != null) {
                bundle5.putString(a68.o, str4);
            }
            ws6 ws62 = a68.g;
            if (!ws62.isEmpty()) {
                bundle5.putParcelableArrayList(a68.p, gt0.M(ws62, new x48(5)));
            }
            long j10 = a68.i;
            if (j10 != -9223372036854775807L) {
                bundle5.putLong(a68.q, j10);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l68)) {
            return false;
        }
        l68 l68 = (l68) obj;
        return oze.a(this.a, l68.a) && this.e.equals(l68.e) && oze.a(this.b, l68.b) && oze.a(this.c, l68.c) && oze.a(this.d, l68.d) && oze.a(this.f, l68.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a68 a68 = this.b;
        int hashCode2 = a68 != null ? a68.hashCode() : 0;
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.e.hashCode();
        return this.f.hashCode() + ((this.d.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31);
    }
}
