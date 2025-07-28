package defpackage;

import android.media.MediaDrmException;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.recyclerview.widget.b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.arch.Widget;

/* renamed from: oa2  reason: default package */
public final class oa2 implements h67, v1b, gm8, m35, ps5, mt7, rm0, jbe {
    public static final oa2 X = new Object();
    public static final oa2 Y = new Object();
    public static final oa2 a = new Object();
    public static final oa2 b = new Object();
    public static final /* synthetic */ oa2 c = new Object();
    public static final lb5 o = new Object();

    public static nac A(byte[] bArr, lg8 lg8, int i) {
        if ((i & 1) != 0) {
            lg8 = null;
        }
        int length = bArr.length;
        long length2 = (long) bArr.length;
        long j = (long) 0;
        long j2 = (long) length;
        byte[] bArr2 = nze.a;
        if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
            return new nac(bArr, lg8, length, 0);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static qqe C(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f31 f31 = (f31) it.next();
            int i = lwf.a[f31.a.a.ordinal()];
            xm1 xm1 = f31.a;
            if (i == 1) {
                hashSet.add(xm1.b);
            } else if (i == 2) {
                hashSet2.add(xm1.b);
            } else if (i == 3) {
                hashSet3.add(xm1.b);
            }
        }
        return new qqe(hashSet2);
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [oa2, java.lang.Object] */
    public static oa2 D(b37[] b37Arr) {
        if (b37Arr.length <= 31) {
            for (b37 b37 : b37Arr) {
                if (b37.a()) {
                    b37.b();
                }
            }
            return new Object();
        }
        throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", new Object[]{b37Arr[0].getClass().getName(), Integer.valueOf(b37Arr.length)}));
    }

    public static boolean E() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.text.SpannableString, bmd] */
    public static bmd F(CharSequence charSequence, boolean z) {
        SpannableString spannableString;
        try {
            spannableString = new SpannableString(charSequence);
            mt0.f(spannableString, z);
        } catch (IndexOutOfBoundsException unused) {
            if (charSequence instanceof Spannable) {
                mt0.f((Spannable) charSequence, z);
            }
            spannableString = new SpannableString(charSequence);
        }
        return new SpannableString(spannableString);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d8 A[Catch:{ all -> 0x01dd, all -> 0x01eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e0 A[Catch:{ all -> 0x01dd, all -> 0x01eb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void H(defpackage.mv3 r16, java.util.List r17) {
        /*
            r0 = r16
            java.lang.String r1 = "CRASH"
            java.lang.String r2 = "MINIDUMP"
            java.lang.String r3 = "NON_FATAL"
            r4 = 1
            r5 = 0
            nne r6 = defpackage.nne.a
            java.lang.String r6 = defpackage.nne.a()
            if (r6 != 0) goto L_0x0013
            return
        L_0x0013:
            java.io.File r7 = new java.io.File
            java.lang.String r8 = r0.d
            r7.<init>(r8)
            boolean r8 = r7.exists()
            if (r8 != 0) goto L_0x0021
            return
        L_0x0021:
            java.lang.String r7 = ng5.M(r7)
            java.io.File r8 = new java.io.File
            java.lang.String r9 = r0.e
            r8.<init>(r9)
            boolean r9 = r8.exists()
            if (r9 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r8 = r5
        L_0x0034:
            if (r8 == 0) goto L_0x003b
            java.lang.String r8 = ng5.M(r8)
            goto L_0x003c
        L_0x003b:
            r8 = r5
        L_0x003c:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>((java.lang.String) r7)
            if (r8 == 0) goto L_0x004d
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>((java.lang.String) r8)
            java.lang.String r8 = "tags"
            r9.put((java.lang.String) r8, (java.lang.Object) r7)
        L_0x004d:
            java.lang.String r7 = r9.toString()
            java.io.File r8 = new java.io.File
            java.lang.String r9 = r0.f
            r8.<init>(r9)
            byte[] r8 = oyb.P(r8)
            java.io.File r9 = new java.io.File
            java.lang.String r10 = r0.g
            r9.<init>(r10)
            boolean r10 = r9.exists()
            if (r10 == 0) goto L_0x006e
            byte[] r9 = oyb.P(r9)
            goto L_0x006f
        L_0x006e:
            r9 = r5
        L_0x006f:
            java.io.File r10 = new java.io.File
            java.lang.String r11 = r0.h
            r10.<init>(r11)
            boolean r11 = r10.exists()
            if (r11 == 0) goto L_0x0081
            byte[] r10 = oyb.P(r10)
            goto L_0x0082
        L_0x0081:
            r10 = r5
        L_0x0082:
            if (r17 == 0) goto L_0x00ca
            boolean r11 = r17.isEmpty()
            r11 = r11 ^ r4
            if (r11 == 0) goto L_0x008e
            r11 = r17
            goto L_0x008f
        L_0x008e:
            r11 = r5
        L_0x008f:
            if (r11 == 0) goto L_0x00ca
            org.json.JSONArray r12 = new org.json.JSONArray
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x009a:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00c5
            java.lang.Object r13 = r11.next()
            fp4 r13 = (defpackage.fp4) r13
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r15 = r13.a
            java.lang.String r4 = "event"
            r14.put((java.lang.String) r4, (java.lang.Object) r15)
            java.lang.String r4 = "reason"
            java.lang.String r15 = r13.b
            r14.put((java.lang.String) r4, (java.lang.Object) r15)
            java.lang.String r4 = "count"
            int r13 = r13.c
            r14.put((java.lang.String) r4, (int) r13)
            r12.put((java.lang.Object) r14)
            r4 = 1
            goto L_0x009a
        L_0x00c5:
            java.lang.String r4 = r12.toString()
            goto L_0x00cb
        L_0x00ca:
            r4 = r5
        L_0x00cb:
            int r0 = r0.b
            int r11 = hr1.t(r0)
            r12 = 9
            r13 = 8
            if (r11 == r13) goto L_0x00dc
            if (r11 == r12) goto L_0x00dc
            java.lang.String r11 = "stackTrace"
            goto L_0x00de
        L_0x00dc:
            java.lang.String r11 = "file"
        L_0x00de:
            int r14 = hr1.t(r0)
            if (r14 == r13) goto L_0x00e9
            if (r14 == r12) goto L_0x00e9
            java.lang.String r14 = "stack.gzip"
            goto L_0x00eb
        L_0x00e9:
            java.lang.String r14 = "file.gzip"
        L_0x00eb:
            int r15 = hr1.t(r0)
            if (r15 == r13) goto L_0x00f9
            if (r15 == r12) goto L_0x00f6
            java.lang.String r12 = "api/crash/upload"
            goto L_0x00fb
        L_0x00f6:
            java.lang.String r12 = "api/crash/uploadAnr"
            goto L_0x00fb
        L_0x00f9:
            java.lang.String r12 = "api/crash/uploadNative"
        L_0x00fb:
            nne r13 = defpackage.nne.a
            java.util.Map r13 = defpackage.nne.c()
            x3a r15 = xie.a
            java.lang.Object r13 = r13.get(r15)
            boolean r15 = r13 instanceof defpackage.cu3
            if (r15 == 0) goto L_0x010e
            cu3 r13 = (defpackage.cu3) r13
            goto L_0x010f
        L_0x010e:
            r13 = r5
        L_0x010f:
            if (r13 != 0) goto L_0x0119
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            ju7.W(r13)
        L_0x0119:
            java.lang.String r13 = "https://sdk-api.apptracer.ru"
            android.net.Uri r13 = android.net.Uri.parse(r13)
            android.net.Uri$Builder r13 = r13.buildUpon()
            android.net.Uri$Builder r12 = r13.appendEncodedPath(r12)
            java.lang.String r13 = "crashToken"
            android.net.Uri$Builder r6 = r12.appendQueryParameter(r13, r6)
            java.lang.String r6 = r6.toString()
            jm6 r12 = new jm6
            r12.<init>()
            switch(r0) {
                case 1: goto L_0x0141;
                case 2: goto L_0x013f;
                case 3: goto L_0x013f;
                case 4: goto L_0x013f;
                case 5: goto L_0x013f;
                case 6: goto L_0x013f;
                case 7: goto L_0x013f;
                case 8: goto L_0x013f;
                case 9: goto L_0x013d;
                case 10: goto L_0x013a;
                default: goto L_0x0139;
            }
        L_0x0139:
            throw r5
        L_0x013a:
            java.lang.String r13 = "ANR"
            goto L_0x0142
        L_0x013d:
            r13 = r2
            goto L_0x0142
        L_0x013f:
            r13 = r3
            goto L_0x0142
        L_0x0141:
            r13 = r1
        L_0x0142:
            java.lang.String r15 = "type"
            r12.c(r15, r13)
            java.lang.String r13 = "JVM_STACKTRACE"
            switch(r0) {
                case 1: goto L_0x0150;
                case 2: goto L_0x0150;
                case 3: goto L_0x0150;
                case 4: goto L_0x0150;
                case 5: goto L_0x0150;
                case 6: goto L_0x0150;
                case 7: goto L_0x0150;
                case 8: goto L_0x0150;
                case 9: goto L_0x0151;
                case 10: goto L_0x014d;
                default: goto L_0x014c;
            }
        L_0x014c:
            throw r5
        L_0x014d:
            java.lang.String r2 = "ANDROID_ANR"
            goto L_0x0151
        L_0x0150:
            r2 = r13
        L_0x0151:
            java.lang.String r13 = "format"
            r12.c(r13, r2)
            switch(r0) {
                case 1: goto L_0x016f;
                case 2: goto L_0x016e;
                case 3: goto L_0x016b;
                case 4: goto L_0x0168;
                case 5: goto L_0x0165;
                case 6: goto L_0x0162;
                case 7: goto L_0x015f;
                case 8: goto L_0x015c;
                case 9: goto L_0x016f;
                case 10: goto L_0x015a;
                default: goto L_0x0159;
            }
        L_0x0159:
            throw r5
        L_0x015a:
            r1 = r5
            goto L_0x016f
        L_0x015c:
            java.lang.String r1 = "DEBUG"
            goto L_0x016f
        L_0x015f:
            java.lang.String r1 = "INFO"
            goto L_0x016f
        L_0x0162:
            java.lang.String r1 = "NOTICE"
            goto L_0x016f
        L_0x0165:
            java.lang.String r1 = "WARNING"
            goto L_0x016f
        L_0x0168:
            java.lang.String r1 = "ERROR"
            goto L_0x016f
        L_0x016b:
            java.lang.String r1 = "FATAL"
            goto L_0x016f
        L_0x016e:
            r1 = r3
        L_0x016f:
            if (r1 == 0) goto L_0x0176
            java.lang.String r0 = "severity"
            r12.c(r0, r1)
        L_0x0176:
            be5 r0 = new be5
            java.lang.String r1 = "application/octet-stream"
            r2 = 1
            r0.<init>(r1, r2, r8)
            r12.a(r11, r14, r0)
            java.lang.String r0 = "application/json; charset=utf-8"
            be5 r0 = mk9.h(r0, r7)
            java.lang.String r3 = "uploadBean"
            r12.a(r3, r5, r0)
            if (r9 == 0) goto L_0x019a
            be5 r0 = new be5
            r0.<init>(r1, r2, r9)
            java.lang.String r3 = "threadDump"
            java.lang.String r7 = "threads.gzip"
            r12.a(r3, r7, r0)
        L_0x019a:
            if (r10 == 0) goto L_0x01a8
            be5 r0 = new be5
            r0.<init>(r1, r2, r10)
            java.lang.String r1 = "logs"
            java.lang.String r2 = "logs.gzip"
            r12.a(r1, r2, r0)
        L_0x01a8:
            if (r4 == 0) goto L_0x01b7
            java.lang.String r0 = "application/json"
            be5 r0 = mk9.h(r0, r4)
            java.lang.String r1 = "drops"
            java.lang.String r2 = "drops.json"
            r12.a(r1, r2, r0)
        L_0x01b7:
            ws4 r0 = r12.d()
            jg8 r1 = new jg8
            r1.<init>((java.lang.String) r6, (defpackage.nm6) r0)
            r7e r0 = defpackage.nne.h
            java.lang.Object r0 = r0.getValue()
            tm6 r0 = (defpackage.tm6) r0
            om6 r1 = r0.b(r1)
            java.io.Closeable r0 = r1.o     // Catch:{ all -> 0x01dd }
            be5 r0 = (be5) r0     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x01e0
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x01dd }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x01e0
            java.lang.String r0 = p0e.L(r0)     // Catch:{ all -> 0x01dd }
            goto L_0x01e1
        L_0x01dd:
            r0 = move-exception
            r2 = r0
            goto L_0x01ea
        L_0x01e0:
            r0 = r5
        L_0x01e1:
            java.lang.String r2 = "CRASH_REPORT"
            qr4.s(r0, r2, r5)     // Catch:{ all -> 0x01dd }
            urd.l(r1, r5)
            return
        L_0x01ea:
            throw r2     // Catch:{ all -> 0x01eb }
        L_0x01eb:
            r0 = move-exception
            r3 = r0
            urd.l(r1, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa2.H(mv3, java.util.List):void");
    }

    public static void I(List list) {
        List list2;
        list.size();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mv3 mv3 = (mv3) list.get(i);
            if (i == 0) {
                nne nne = nne.a;
                list2 = nne.b().d();
            } else {
                list2 = null;
            }
            try {
                H(mv3, list2);
                mv3.getClass();
                ng5.J(new File(mv3.c));
            } catch (Throwable unused) {
                if (list2 != null) {
                    nne nne2 = nne.a;
                    nne.b().a(list2);
                }
            }
        }
    }

    public static ArrayList y(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((vhb) next) != vhb.b) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((vhb) it.next()).a);
        }
        return arrayList2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [wr0, java.lang.Object] */
    public static byte[] z(List list) {
        ? obj = new Object();
        Iterator it = y(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            obj.u0(str.length());
            obj.z0(0, str.length(), str);
        }
        return obj.n0(obj.b);
    }

    public xs7 B(vu5 vu5) {
        String str = vu5.A0;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return new xo(0);
                case 1:
                    return new mo6();
                case 2:
                    return new vo6((so6) null);
                case 3:
                    return new xo(1);
                case 4:
                    return new qmd();
            }
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
    }

    public boolean G(vu5 vu5) {
        String str = vu5.A0;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    public Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    public k35 b() {
        throw new IllegalStateException();
    }

    public mw3 c(byte[] bArr) {
        throw new IllegalStateException();
    }

    public void clear() {
    }

    public byte[] d() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    public boolean e(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    public void f(pl8 pl8, boolean z) {
    }

    public void g(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void h(byte[] bArr) {
    }

    public byte[] i(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    public void j(byte[] bArr) {
        throw new IllegalStateException();
    }

    public i35 k(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
    }

    public int l() {
        return 1;
    }

    public Map m(Map map) {
        return map == null ? new HashMap() : map;
    }

    public long n(int i, long j, float f) {
        if (i > 6) {
            i = 6;
        }
        long pow = ((long) Math.pow(2.0d, (double) i)) * 1000;
        return pow + ((long) (((float) pow) * f)) + j;
    }

    public void o(mv4 mv4) {
    }

    public boolean p(int i) {
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0102, code lost:
        if (r1.equals("error_msg") == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010b, code lost:
        if (r1.equals("error") == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010e, code lost:
        r6 = r13.H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013a, code lost:
        r13.z();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object parse(defpackage.m67 r13) {
        /*
            r12 = this;
            r13.s()
            r12 = 0
            r0 = 0
            r4 = r12
            r12 = r0
            r6 = r12
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
        L_0x000c:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0144
            java.lang.String r1 = r13.T()
            int r2 = r1.hashCode()
            r3 = 110(0x6e, float:1.54E-43)
            switch(r2) {
                case -1125973592: goto L_0x0132;
                case -830722045: goto L_0x0123;
                case -22145738: goto L_0x0114;
                case 96784904: goto L_0x0105;
                case 329868490: goto L_0x00fc;
                case 438353305: goto L_0x00ed;
                case 717465530: goto L_0x00c1;
                case 1635686852: goto L_0x00b1;
                case 1635703681: goto L_0x00a1;
                case 1636060774: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x013a
        L_0x0021:
            java.lang.String r2 = "error_page"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x002b
            goto L_0x013a
        L_0x002b:
            int r1 = r13.peek()
            if (r1 == r3) goto L_0x009c
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x0039
            r13.H()
            goto L_0x000c
        L_0x0039:
            r13.s()
        L_0x003c:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0097
            java.lang.String r1 = r13.T()
            int r5 = r1.hashCode()
            r8 = 954925063(0x38eb0007, float:1.1205678E-4)
            if (r5 == r8) goto L_0x0050
            goto L_0x0093
        L_0x0050:
            java.lang.String r5 = "message"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0093
            int r1 = r13.peek()
            if (r1 == r3) goto L_0x008f
            if (r1 == r2) goto L_0x0064
            r13.H()
            goto L_0x003c
        L_0x0064:
            r13.s()
        L_0x0067:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x008b
            java.lang.String r1 = r13.T()
            int r5 = r1.hashCode()
            r8 = 106748362(0x65cd9ca, float:4.1537407E-35)
            if (r5 == r8) goto L_0x007b
            goto L_0x0087
        L_0x007b:
            java.lang.String r5 = "plain"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0087
            r13.H()
            goto L_0x0067
        L_0x0087:
            r13.z()
            goto L_0x0067
        L_0x008b:
            r13.q()
            goto L_0x003c
        L_0x008f:
            r13.z()
            goto L_0x003c
        L_0x0093:
            r13.z()
            goto L_0x003c
        L_0x0097:
            r13.q()
            goto L_0x000c
        L_0x009c:
            r13.z()
            goto L_0x000c
        L_0x00a1:
            java.lang.String r2 = "error_data"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00ab
            goto L_0x013a
        L_0x00ab:
            java.lang.String r9 = r13.f0()
            goto L_0x000c
        L_0x00b1:
            java.lang.String r2 = "error_code"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00bb
            goto L_0x013a
        L_0x00bb:
            int r4 = r13.D()
            goto L_0x000c
        L_0x00c1:
            java.lang.String r2 = "custom_error"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00cb
            goto L_0x013a
        L_0x00cb:
            int r1 = r13.peek()
            if (r1 == r3) goto L_0x00e8
            r13.s()
        L_0x00d4:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x00e3
            java.lang.String r10 = r13.T()
            java.lang.String r11 = r13.V()
            goto L_0x00d4
        L_0x00e3:
            r13.q()
            goto L_0x000c
        L_0x00e8:
            r13.z()
            goto L_0x000c
        L_0x00ed:
            java.lang.String r2 = "session_secret_key"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00f6
            goto L_0x013a
        L_0x00f6:
            java.lang.String r12 = r13.H()
            goto L_0x000c
        L_0x00fc:
            java.lang.String r2 = "error_msg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x010e
            goto L_0x013a
        L_0x0105:
            java.lang.String r2 = "error"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x010e
            goto L_0x013a
        L_0x010e:
            java.lang.String r6 = r13.H()
            goto L_0x000c
        L_0x0114:
            java.lang.String r2 = "session_key"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x011d
            goto L_0x013a
        L_0x011d:
            java.lang.String r0 = r13.H()
            goto L_0x000c
        L_0x0123:
            java.lang.String r2 = "error_field"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x012c
            goto L_0x013a
        L_0x012c:
            java.lang.String r7 = r13.f0()
            goto L_0x000c
        L_0x0132:
            java.lang.String r2 = "ver_redirect_url"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x013f
        L_0x013a:
            r13.z()
            goto L_0x000c
        L_0x013f:
            r13.H()
            goto L_0x000c
        L_0x0144:
            r13.q()
            r13 = 100
            if (r4 == r13) goto L_0x019d
            r13 = 107(0x6b, float:1.5E-43)
            if (r4 == r13) goto L_0x0183
            r12 = 401(0x191, float:5.62E-43)
            if (r4 == r12) goto L_0x017a
            r12 = 403(0x193, float:5.65E-43)
            if (r4 == r12) goto L_0x0171
            r12 = 102(0x66, float:1.43E-43)
            if (r4 == r12) goto L_0x016b
            r12 = 103(0x67, float:1.44E-43)
            if (r4 == r12) goto L_0x016b
            ru.ok.android.api.core.ApiInvocationException r12 = new ru.ok.android.api.core.ApiInvocationException
            r1 = r12
            r2 = r6
            r3 = r7
            r5 = r9
            r6 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x01a5
        L_0x016b:
            ru.ok.android.api.session.ApiRecreateSessionException r12 = new ru.ok.android.api.session.ApiRecreateSessionException
            r12.<init>(r4, r6)
            goto L_0x01a5
        L_0x0171:
            ru.ok.android.api.core.ApiCaptchaException r12 = new ru.ok.android.api.core.ApiCaptchaException
            r8 = 403(0x193, float:5.65E-43)
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x01a5
        L_0x017a:
            ru.ok.android.api.core.ApiLoginException r12 = new ru.ok.android.api.core.ApiLoginException
            r8 = 401(0x191, float:5.62E-43)
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x01a5
        L_0x0183:
            if (r0 == 0) goto L_0x0195
            if (r12 == 0) goto L_0x018d
            ru.ok.android.api.session.ApiSessionChangedException r13 = new ru.ok.android.api.session.ApiSessionChangedException
            r13.<init>(r6, r0, r12)
            goto L_0x01a6
        L_0x018d:
            ru.ok.android.api.json.JsonParseException r12 = new ru.ok.android.api.json.JsonParseException
            java.lang.String r13 = "No sessionSecretKey"
            r12.<init>(r13)
            throw r12
        L_0x0195:
            ru.ok.android.api.json.JsonParseException r12 = new ru.ok.android.api.json.JsonParseException
            java.lang.String r13 = "No sessionKey"
            r12.<init>(r13)
            throw r12
        L_0x019d:
            ru.ok.android.api.core.ApiInvocationParamException r12 = new ru.ok.android.api.core.ApiInvocationParamException
            r8 = 100
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x01a5:
            r13 = r12
        L_0x01a6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa2.parse(m67):java.lang.Object");
    }

    public e13 q() {
        return null;
    }

    public void r(int i, e13 e13) {
    }

    public void release() {
    }

    public void s(int i, e13 e13) {
    }

    public Widget t(String str, b bVar) {
        ChatsListWidget chatsListWidget = new ChatsListWidget(str);
        chatsListWidget.C0 = bVar;
        if (chatsListWidget.isAttached()) {
            chatsListWidget.n0().setRecycledViewPool(bVar);
        }
        return chatsListWidget;
    }

    public boolean test(Object obj) {
        return lce.a(((Number) obj).intValue());
    }

    public e13 u() {
        return null;
    }

    public e13 v(int i) {
        return null;
    }

    public boolean x(pl8 pl8) {
        return false;
    }
}
