package defpackage;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: u93  reason: default package */
public final class u93 {
    public final /* synthetic */ int a;
    public int b;
    public final ArrayList c;
    public ArrayList d;
    public Object e;
    public Object f;
    public Serializable g;
    public Object h;
    public Object i;

    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, le4] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.Object, k2e] */
    public u93(t93 t93, s93 s93) {
        this.a = 0;
        this.c = new ArrayList();
        this.g = new IdentityHashMap();
        this.d = new ArrayList();
        this.h = new Object();
        this.e = t93;
        if (s93.a) {
            og0 og0 = new og0(0, 21);
            og0.c = new SparseArray();
            og0.b = 0;
            this.f = og0;
        } else {
            ? obj = new Object();
            obj.a = new SparseArray();
            this.f = obj;
        }
        int i2 = s93.b;
        this.b = i2;
        if (i2 == 1) {
            this.i = new mv4(23);
        } else if (i2 == 2) {
            ? obj2 = new Object();
            obj2.a = 0;
            this.i = obj2;
        } else if (i2 == 3) {
            this.i = new ea6(28);
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    public boolean a(int i2, f6c f6c) {
        ArrayList arrayList = this.d;
        if (i2 < 0 || i2 > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + i2);
        }
        if (this.b != 1) {
            e07.j("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", f6c.b);
        } else {
            boolean z = f6c.b;
        }
        int i3 = i(f6c);
        if ((i3 == -1 ? null : (zg9) arrayList.get(i3)) != null) {
            return false;
        }
        zg9 zg9 = new zg9(f6c, this, (icf) this.f, ((god) this.i).w());
        arrayList.add(i2, zg9);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                f6c.q(recyclerView);
            }
        }
        if (zg9.e > 0) {
            ((t93) this.e).p(d(zg9), zg9.e);
        }
        c();
        return true;
    }

    public sm6 b() {
        ArrayList arrayList;
        String str = (String) this.e;
        if (str != null) {
            String l = smc.l(0, (String) this.f, 0, 7, false);
            String l2 = smc.l(0, (String) this.g, 0, 7, false);
            String str2 = (String) this.h;
            if (str2 != null) {
                int e2 = e();
                ArrayList arrayList2 = this.c;
                ArrayList arrayList3 = new ArrayList(q23.H(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(smc.l(0, (String) it.next(), 0, 7, false));
                }
                ArrayList<String> arrayList4 = this.d;
                String str3 = null;
                if (arrayList4 != null) {
                    ArrayList arrayList5 = new ArrayList(q23.H(arrayList4, 10));
                    for (String str4 : arrayList4) {
                        arrayList5.add(str4 != null ? smc.l(0, str4, 0, 3, true) : null);
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                String str5 = (String) this.i;
                if (str5 != null) {
                    str3 = smc.l(0, str5, 0, 7, false);
                }
                return new sm6(str, l, l2, str2, e2, arrayList, str3, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    public void c() {
        int i2;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = 1;
                break;
            }
            zg9 zg9 = (zg9) it.next();
            int i3 = zg9.c.c;
            i2 = 3;
            if (i3 == 3 || (i3 == 2 && zg9.e == 0)) {
                break;
            }
        }
        t93 t93 = (t93) this.e;
        if (i2 != t93.c) {
            t93.c = i2;
            t93.a.g();
        }
    }

    public int d(zg9 zg9) {
        zg9 zg92;
        Iterator it = this.d.iterator();
        int i2 = 0;
        while (it.hasNext() && (zg92 = (zg9) it.next()) != zg9) {
            i2 += zg92.e;
        }
        return i2;
    }

    public int e() {
        int i2;
        int i3 = this.b;
        if (i3 != -1) {
            return i3;
        }
        String str = (String) this.e;
        int hashCode = str.hashCode();
        if (hashCode != 3213448) {
            if (hashCode == 99617003 && str.equals("https")) {
                i2 = 443;
            }
            return -1;
        }
        if (str.equals("http")) {
            i2 = 80;
        }
        return -1;
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: w} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.w f(int r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.h
            w r0 = (defpackage.w) r0
            boolean r1 = r0.b
            if (r1 == 0) goto L_0x000e
            w r0 = new w
            r0.<init>()
            goto L_0x0011
        L_0x000e:
            r1 = 1
            r0.b = r1
        L_0x0011:
            java.util.ArrayList r4 = r4.d
            java.util.Iterator r4 = r4.iterator()
            r1 = r5
        L_0x0018:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r4.next()
            zg9 r2 = (defpackage.zg9) r2
            int r3 = r2.e
            if (r3 <= r1) goto L_0x002d
            r0.c = r2
            r0.a = r1
            goto L_0x002f
        L_0x002d:
            int r1 = r1 - r3
            goto L_0x0018
        L_0x002f:
            java.lang.Object r4 = r0.c
            zg9 r4 = (defpackage.zg9) r4
            if (r4 == 0) goto L_0x0036
            return r0
        L_0x0036:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot find wrapper for "
            java.lang.String r5 = wn6.h(r5, r0)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u93.f(int):w");
    }

    public zg9 g(b7c b7c) {
        zg9 zg9 = (zg9) ((IdentityHashMap) this.g).get(b7c);
        if (zg9 != null) {
            return zg9;
        }
        throw new IllegalStateException("Cannot find wrapper for " + b7c + ", seems like it is not bound by this adapter: " + this);
    }

    public void h(String str) {
        String J = bm3.J(smc.l(0, str, 0, 7, false));
        if (J != null) {
            this.h = J;
            return;
        }
        throw new IllegalArgumentException("unexpected host: ".concat(str));
    }

    public int i(f6c f6c) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((zg9) arrayList.get(i2)).c == f6c) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x027a, code lost:
        if (65535 < r1) goto L_0x027f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0246 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x022c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(defpackage.sm6 r27, java.lang.String r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r10 = r28
            byte[] r2 = defpackage.nze.a
            int r2 = r28.length()
            r11 = 0
            int r8 = defpackage.nze.m(r11, r2, r10)
            int r2 = r28.length()
            int r12 = defpackage.nze.n(r8, r2, r10)
            int r2 = r12 - r8
            r9 = 2
            r13 = 58
            r14 = -1
            if (r2 >= r9) goto L_0x0024
        L_0x0021:
            r15 = r14
            goto L_0x007d
        L_0x0024:
            char r2 = r10.charAt(r8)
            r3 = 97
            int r4 = defpackage.hhd.o(r2, r3)
            r5 = 90
            r6 = 65
            r7 = 122(0x7a, float:1.71E-43)
            if (r4 < 0) goto L_0x003c
            int r4 = defpackage.hhd.o(r2, r7)
            if (r4 <= 0) goto L_0x0049
        L_0x003c:
            int r4 = defpackage.hhd.o(r2, r6)
            if (r4 < 0) goto L_0x0021
            int r2 = defpackage.hhd.o(r2, r5)
            if (r2 <= 0) goto L_0x0049
            goto L_0x0021
        L_0x0049:
            int r2 = r8 + 1
        L_0x004b:
            if (r2 >= r12) goto L_0x0021
            char r4 = r10.charAt(r2)
            if (r3 <= r4) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            if (r7 < r4) goto L_0x0057
            goto L_0x0075
        L_0x0057:
            if (r6 <= r4) goto L_0x005a
            goto L_0x005d
        L_0x005a:
            if (r5 < r4) goto L_0x005d
            goto L_0x0075
        L_0x005d:
            r15 = 48
            if (r15 <= r4) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            r15 = 57
            if (r15 < r4) goto L_0x0067
            goto L_0x0075
        L_0x0067:
            r15 = 43
            if (r4 != r15) goto L_0x006c
            goto L_0x0075
        L_0x006c:
            r15 = 45
            if (r4 != r15) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            r15 = 46
            if (r4 != r15) goto L_0x0078
        L_0x0075:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0078:
            if (r4 != r13) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r2 = r14
        L_0x007c:
            r15 = r2
        L_0x007d:
            r7 = 1
            if (r15 == r14) goto L_0x00c9
            r3 = 0
            r4 = 6
            java.lang.String r6 = "https:"
            r2 = r8
            r5 = r28
            r16 = r7
            boolean r2 = defpackage.p0e.N(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x0096
            java.lang.String r2 = "https"
            r0.e = r2
            int r8 = r8 + 6
            goto L_0x00d1
        L_0x0096:
            r3 = 0
            r4 = 5
            java.lang.String r6 = "http:"
            r2 = r8
            r5 = r28
            r7 = r16
            boolean r2 = defpackage.p0e.N(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x00ac
            java.lang.String r2 = "http"
            r0.e = r2
            int r8 = r8 + 5
            goto L_0x00d1
        L_0x00ac:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
            r1.<init>(r2)
            java.lang.String r2 = r10.substring(r11, r15)
            r1.append(r2)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c9:
            r16 = r7
            if (r1 == 0) goto L_0x0404
            java.lang.String r2 = r1.b
            r0.e = r2
        L_0x00d1:
            r2 = r8
            r3 = r11
        L_0x00d3:
            r15 = 47
            r7 = 92
            if (r2 >= r12) goto L_0x00e6
            char r4 = r10.charAt(r2)
            if (r4 == r7) goto L_0x00e1
            if (r4 != r15) goto L_0x00e6
        L_0x00e1:
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L_0x00d3
        L_0x00e6:
            java.util.ArrayList r6 = r0.c
            r5 = 63
            r4 = 35
            if (r3 >= r9) goto L_0x014e
            if (r1 == 0) goto L_0x014e
            java.lang.Object r2 = r0.e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r9 = r1.b
            boolean r2 = defpackage.hhd.f(r9, r2)
            r9 = r16
            r2 = r2 ^ r9
            if (r2 == 0) goto L_0x0100
            goto L_0x0150
        L_0x0100:
            java.lang.String r2 = r27.e()
            r0.f = r2
            java.lang.String r2 = r27.a()
            r0.g = r2
            java.lang.String r2 = r1.e
            r0.h = r2
            int r2 = r1.f
            r0.b = r2
            r6.clear()
            java.util.ArrayList r2 = r27.c()
            r6.addAll(r2)
            if (r8 == r12) goto L_0x0126
            char r2 = r10.charAt(r8)
            if (r2 != r4) goto L_0x0148
        L_0x0126:
            java.lang.String r16 = r27.d()
            if (r16 == 0) goto L_0x0145
            r21 = 0
            r24 = 211(0xd3, float:2.96E-43)
            r17 = 0
            r18 = 0
            java.lang.String r19 = " \"'<>#"
            r20 = 1
            r22 = 1
            r23 = 0
            java.lang.String r1 = smc.a(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.util.ArrayList r1 = smc.n(r1)
            goto L_0x0146
        L_0x0145:
            r1 = 0
        L_0x0146:
            r0.d = r1
        L_0x0148:
            r20 = r6
            r15 = r11
            r11 = r9
            goto L_0x02c9
        L_0x014e:
            r9 = r16
        L_0x0150:
            int r8 = r8 + r3
            r16 = r11
            r17 = r16
        L_0x0155:
            java.lang.String r1 = "@/\\?#"
            int r3 = defpackage.nze.f(r10, r8, r12, r1)
            if (r3 == r12) goto L_0x0162
            char r1 = r10.charAt(r3)
            goto L_0x0163
        L_0x0162:
            r1 = r14
        L_0x0163:
            if (r1 == r14) goto L_0x0225
            if (r1 == r4) goto L_0x0225
            if (r1 == r15) goto L_0x0225
            if (r1 == r7) goto L_0x0225
            if (r1 == r5) goto L_0x0225
            r2 = 64
            if (r1 == r2) goto L_0x0176
            r20 = r6
            r11 = r9
            goto L_0x0216
        L_0x0176:
            java.lang.String r2 = "%40"
            if (r16 != 0) goto L_0x01e0
            int r1 = defpackage.nze.e(r13, r8, r3, r10)
            r18 = 0
            r19 = 0
            java.lang.String r20 = " \"':;<=>@[]^`{}|/\\?#"
            r21 = 1
            r22 = 0
            r23 = 240(0xf0, float:3.36E-43)
            r27 = r1
            r1 = r28
            r15 = r2
            r2 = r8
            r8 = r3
            r3 = r27
            r4 = r20
            r5 = r21
            r20 = r6
            r6 = r22
            r7 = r18
            r14 = r8
            r8 = r19
            r11 = r9
            r9 = r23
            java.lang.String r1 = smc.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r17 == 0) goto L_0x01bf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Object r3 = r0.f
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            r2.append(r15)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x01bf:
            r0.f = r1
            r1 = r27
            if (r1 == r14) goto L_0x01da
            int r2 = r1 + 1
            r7 = 0
            r8 = 0
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            r5 = 1
            r6 = 0
            r9 = 240(0xf0, float:3.36E-43)
            r1 = r28
            r3 = r14
            java.lang.String r1 = smc.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.g = r1
            r7 = r11
            goto L_0x01dc
        L_0x01da:
            r7 = r16
        L_0x01dc:
            r16 = r7
            r7 = r11
            goto L_0x0212
        L_0x01e0:
            r15 = r2
            r14 = r3
            r20 = r6
            r11 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.io.Serializable r1 = r0.g
            java.lang.String r1 = (java.lang.String) r1
            r9.append(r1)
            r9.append(r15)
            r7 = 0
            r15 = 0
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            r5 = 1
            r6 = 0
            r21 = 240(0xf0, float:3.36E-43)
            r1 = r28
            r2 = r8
            r8 = r15
            r15 = r9
            r9 = r21
            java.lang.String r1 = smc.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r15.append(r1)
            java.lang.String r1 = r15.toString()
            r0.g = r1
            r7 = r17
        L_0x0212:
            int r8 = r14 + 1
            r17 = r7
        L_0x0216:
            r9 = r11
            r6 = r20
            r4 = 35
            r5 = 63
            r7 = 92
            r11 = 0
            r14 = -1
            r15 = 47
            goto L_0x0155
        L_0x0225:
            r14 = r3
            r20 = r6
            r11 = r9
            r3 = r8
        L_0x022a:
            if (r3 >= r14) goto L_0x0246
            char r1 = r10.charAt(r3)
            if (r1 == r13) goto L_0x0244
            r2 = 91
            if (r1 == r2) goto L_0x0237
            goto L_0x0242
        L_0x0237:
            int r3 = r3 + r11
            if (r3 >= r14) goto L_0x0242
            char r1 = r10.charAt(r3)
            r2 = 93
            if (r1 != r2) goto L_0x0237
        L_0x0242:
            int r3 = r3 + r11
            goto L_0x022a
        L_0x0244:
            r13 = r3
            goto L_0x0247
        L_0x0246:
            r13 = r14
        L_0x0247:
            int r15 = r13 + 1
            r1 = 4
            r9 = 34
            if (r15 >= r14) goto L_0x02ac
            r2 = 0
            java.lang.String r1 = smc.l(r8, r10, r13, r1, r2)
            java.lang.String r1 = bm3.J(r1)
            r0.h = r1
            java.lang.String r4 = ""
            r16 = 248(0xf8, float:3.48E-43)
            r5 = 0
            r6 = 0
            r7 = 0
            r17 = 0
            r1 = r28
            r2 = r15
            r3 = r14
            r25 = r8
            r8 = r17
            r9 = r16
            java.lang.String r1 = smc.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ NumberFormatException -> 0x027f }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x027f }
            if (r11 <= r1) goto L_0x0277
            goto L_0x027f
        L_0x0277:
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r2 < r1) goto L_0x027f
            goto L_0x0280
        L_0x027d:
            r25 = r8
        L_0x027f:
            r1 = -1
        L_0x0280:
            r0.b = r1
            r2 = -1
            if (r1 == r2) goto L_0x028b
            r8 = r25
            r2 = 34
            r15 = 0
            goto L_0x02c2
        L_0x028b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid URL port: \""
            r0.<init>(r1)
            java.lang.String r1 = r10.substring(r15, r14)
            r0.append(r1)
            r2 = 34
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x02ac:
            r2 = r9
            r15 = 0
            java.lang.String r1 = smc.l(r8, r10, r13, r1, r15)
            java.lang.String r1 = bm3.J(r1)
            r0.h = r1
            java.lang.Object r1 = r0.e
            java.lang.String r1 = (java.lang.String) r1
            int r1 = smc.i(r1)
            r0.b = r1
        L_0x02c2:
            java.lang.Object r1 = r0.h
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x03e5
            r8 = r14
        L_0x02c9:
            java.lang.String r1 = "?#"
            int r13 = defpackage.nze.f(r10, r8, r12, r1)
            if (r8 != r13) goto L_0x02d3
            goto L_0x039e
        L_0x02d3:
            char r1 = r10.charAt(r8)
            java.lang.String r14 = ""
            r2 = 47
            if (r1 == r2) goto L_0x02e1
            r2 = 92
            if (r1 != r2) goto L_0x02e4
        L_0x02e1:
            r9 = r20
            goto L_0x02ef
        L_0x02e4:
            int r1 = r20.size()
            int r1 = r1 - r11
            r9 = r20
            r9.set(r1, r14)
            goto L_0x02f7
        L_0x02ef:
            r9.clear()
            r9.add(r14)
            int r8 = r8 + 1
        L_0x02f7:
            r2 = r8
        L_0x02f8:
            if (r2 >= r13) goto L_0x039e
            java.lang.String r1 = "/\\"
            int r8 = defpackage.nze.f(r10, r2, r13, r1)
            if (r8 >= r13) goto L_0x0305
            r16 = r11
            goto L_0x0307
        L_0x0305:
            r16 = r15
        L_0x0307:
            r7 = 0
            r17 = 0
            java.lang.String r4 = " \"<>^`{}|/\\?#"
            r5 = 1
            r6 = 0
            r18 = 240(0xf0, float:3.36E-43)
            r1 = r28
            r3 = r8
            r19 = r8
            r8 = r17
            r15 = r9
            r9 = r18
            java.lang.String r1 = smc.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = "."
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0392
            java.lang.String r2 = "%2e"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x032f
            goto L_0x0392
        L_0x032f:
            java.lang.String r2 = ".."
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x036e
            java.lang.String r2 = "%2e."
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x036e
            java.lang.String r2 = ".%2e"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x036e
            java.lang.String r2 = "%2e%2e"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0350
            goto L_0x036e
        L_0x0350:
            java.lang.Object r2 = rf0.e(r15, r11)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0365
            int r2 = r15.size()
            int r2 = r2 - r11
            r15.set(r2, r1)
            goto L_0x0368
        L_0x0365:
            r15.add(r1)
        L_0x0368:
            if (r16 == 0) goto L_0x0392
            r15.add(r14)
            goto L_0x0392
        L_0x036e:
            int r1 = r15.size()
            int r1 = r1 - r11
            java.lang.Object r1 = r15.remove(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x038f
            boolean r1 = r15.isEmpty()
            r1 = r1 ^ r11
            if (r1 == 0) goto L_0x038f
            int r1 = r15.size()
            int r1 = r1 - r11
            r15.set(r1, r14)
            goto L_0x0392
        L_0x038f:
            r15.add(r14)
        L_0x0392:
            if (r16 == 0) goto L_0x0398
            int r8 = r19 + 1
            r2 = r8
            goto L_0x039a
        L_0x0398:
            r2 = r19
        L_0x039a:
            r9 = r15
            r15 = 0
            goto L_0x02f8
        L_0x039e:
            if (r13 >= r12) goto L_0x03c7
            char r1 = r10.charAt(r13)
            r2 = 63
            if (r1 != r2) goto L_0x03c7
            r14 = 35
            int r15 = defpackage.nze.e(r14, r13, r12, r10)
            int r2 = r13 + 1
            r7 = 1
            r8 = 0
            java.lang.String r4 = " \"'<>#"
            r5 = 1
            r6 = 0
            r9 = 208(0xd0, float:2.91E-43)
            r1 = r28
            r3 = r15
            java.lang.String r1 = smc.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r1 = smc.n(r1)
            r0.d = r1
            r13 = r15
            goto L_0x03c9
        L_0x03c7:
            r14 = 35
        L_0x03c9:
            if (r13 >= r12) goto L_0x03e4
            char r1 = r10.charAt(r13)
            if (r1 != r14) goto L_0x03e4
            int r2 = r13 + 1
            r7 = 0
            r8 = 1
            java.lang.String r4 = ""
            r5 = 1
            r6 = 0
            r9 = 176(0xb0, float:2.47E-43)
            r1 = r28
            r3 = r12
            java.lang.String r1 = smc.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.i = r1
        L_0x03e4:
            return
        L_0x03e5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid URL host: \""
            r0.<init>(r1)
            java.lang.String r1 = r10.substring(r8, r13)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0404:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no colon was found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u93.j(sm6, java.lang.String):void");
    }

    public void k(int i2) {
        if (1 > i2 || 65535 < i2) {
            throw new IllegalArgumentException(wn6.h(i2, "unexpected port: ").toString());
        }
        this.b = i2;
    }

    public void l() {
        if (this.d != null) {
            String a2 = smc.a("TAM_TAM_ORIGINAL_HOST", 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219);
            dz6 Q = gwf.Q(new dz6(this.d.size() - 2, 0, -1), 2);
            int i2 = Q.a;
            int i3 = Q.b;
            int i4 = Q.c;
            if (i4 >= 0) {
                if (i2 > i3) {
                    return;
                }
            } else if (i2 < i3) {
                return;
            }
            while (true) {
                if (a2.equals((String) this.d.get(i2))) {
                    this.d.remove(i2 + 1);
                    this.d.remove(i2);
                    if (this.d.isEmpty()) {
                        this.d = null;
                        return;
                    }
                }
                if (i2 != i3) {
                    i2 += i4;
                } else {
                    return;
                }
            }
        }
    }

    public void m(String str) {
        if (str.equalsIgnoreCase("http")) {
            this.e = "http";
        } else if (str.equalsIgnoreCase("https")) {
            this.e = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        if (r1 != r3) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 1: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r8 = super.toString()
            return r8
        L_0x000a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r8.e
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x001e
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L_0x0023
        L_0x001e:
            java.lang.String r1 = "//"
            r0.append(r1)
        L_0x0023:
            java.lang.Object r1 = r8.f
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L_0x0030
            goto L_0x003a
        L_0x0030:
            java.io.Serializable r1 = r8.g
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x005a
        L_0x003a:
            java.lang.Object r1 = r8.f
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.io.Serializable r1 = r8.g
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0055
            r0.append(r2)
            java.io.Serializable r1 = r8.g
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
        L_0x0055:
            r1 = 64
            r0.append(r1)
        L_0x005a:
            java.lang.Object r1 = r8.h
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x007f
            boolean r1 = defpackage.h0e.S(r1, r2)
            if (r1 == 0) goto L_0x0078
            r1 = 91
            r0.append(r1)
            java.lang.Object r1 = r8.h
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L_0x007f
        L_0x0078:
            java.lang.Object r1 = r8.h
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
        L_0x007f:
            int r1 = r8.b
            r3 = -1
            if (r1 != r3) goto L_0x008a
            java.lang.Object r1 = r8.e
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00c0
        L_0x008a:
            int r1 = r8.e()
            java.lang.Object r4 = r8.e
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x00ba
            int r5 = r4.hashCode()
            r6 = 3213448(0x310888, float:4.503E-39)
            if (r5 == r6) goto L_0x00ae
            r6 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r5 == r6) goto L_0x00a3
            goto L_0x00b8
        L_0x00a3:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b8
            r3 = 443(0x1bb, float:6.21E-43)
            goto L_0x00b8
        L_0x00ae:
            java.lang.String r5 = "http"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00b8
            r3 = 80
        L_0x00b8:
            if (r1 == r3) goto L_0x00c0
        L_0x00ba:
            r0.append(r2)
            r0.append(r1)
        L_0x00c0:
            java.util.ArrayList r1 = r8.c
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L_0x00c8:
            if (r4 >= r2) goto L_0x00db
            r5 = 47
            r0.append(r5)
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            r0.append(r5)
            int r4 = r4 + 1
            goto L_0x00c8
        L_0x00db:
            java.util.ArrayList r1 = r8.d
            if (r1 == 0) goto L_0x0126
            r1 = 63
            r0.append(r1)
            java.util.ArrayList r1 = r8.d
            int r2 = r1.size()
            fz6 r2 = defpackage.gwf.S(r3, r2)
            r3 = 2
            dz6 r2 = defpackage.gwf.Q(r2, r3)
            int r3 = r2.a
            int r4 = r2.b
            int r2 = r2.c
            if (r2 < 0) goto L_0x00fe
            if (r3 > r4) goto L_0x0126
            goto L_0x0100
        L_0x00fe:
            if (r3 < r4) goto L_0x0126
        L_0x0100:
            java.lang.Object r5 = r1.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r3 + 1
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r3 <= 0) goto L_0x0115
            r7 = 38
            r0.append(r7)
        L_0x0115:
            r0.append(r5)
            if (r6 == 0) goto L_0x0122
            r5 = 61
            r0.append(r5)
            r0.append(r6)
        L_0x0122:
            if (r3 == r4) goto L_0x0126
            int r3 = r3 + r2
            goto L_0x0100
        L_0x0126:
            java.lang.Object r1 = r8.i
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0138
            r1 = 35
            r0.append(r1)
            java.lang.Object r8 = r8.i
            java.lang.String r8 = (java.lang.String) r8
            r0.append(r8)
        L_0x0138:
            java.lang.String r8 = r0.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u93.toString():java.lang.String");
    }

    public u93() {
        this.a = 1;
        this.f = BuildConfig.FLAVOR;
        this.g = BuildConfig.FLAVOR;
        this.b = -1;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add(BuildConfig.FLAVOR);
    }
}
