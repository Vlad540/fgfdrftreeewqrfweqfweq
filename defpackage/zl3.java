package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: zl3  reason: default package */
public final class zl3 implements o20, gu3, v1b, gl0, fod, c6c {
    public static final zl3 X = new Object();
    public static final zl3 a = new Object();
    public static final /* synthetic */ zl3 b = new Object();
    public static final zl3 c = new Object();
    public static final zl3 o = new Object();

    public static boolean e(File file) {
        Boolean bool;
        try {
            bool = Boolean.valueOf(file.exists() && file.canRead());
        } catch (Throwable th) {
            bool = new kcc(th);
        }
        Boolean bool2 = Boolean.FALSE;
        if (bool instanceof kcc) {
            bool = bool2;
        }
        return bool.booleanValue();
    }

    public static boolean f(String str) {
        Boolean bool;
        try {
            bool = Boolean.valueOf(e(new File(str)));
        } catch (Throwable th) {
            bool = new kcc(th);
        }
        Boolean bool2 = Boolean.FALSE;
        if (bool instanceof kcc) {
            bool = bool2;
        }
        return bool.booleanValue();
    }

    public static File g(File file, String str) {
        String str2;
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return file2;
        }
        int e0 = h0e.e0(str, '.', 0, 6);
        int i = 0;
        while (i < 100) {
            if (e0 != -1) {
                str2 = str.substring(0, e0) + "(" + (i + 1) + ")" + str.substring(e0);
            } else {
                str2 = str + "(" + (i + 1) + ")";
            }
            File file3 = new File(file, str2);
            if (!file3.exists()) {
                return file3;
            }
            i++;
            file2 = file3;
        }
        return file2;
    }

    public static void j(String str) {
        Boolean bool;
        Boolean bool2;
        try {
            File file = new File(str);
            bool2 = Boolean.valueOf(file.exists() ? file.delete() : false);
        } catch (Throwable th) {
            bool = new kcc(th);
        }
        Boolean bool3 = Boolean.FALSE;
        if (bool2 instanceof kcc) {
            bool2 = bool3;
        }
        bool = bool2;
        Boolean bool4 = Boolean.FALSE;
        if (bool instanceof kcc) {
            bool = bool4;
        }
        Boolean bool5 = bool;
    }

    public long a(long j) {
        return j;
    }

    public long b(long j) {
        return -1;
    }

    public at7 c(xu5 xu5) {
        String str = xu5.n;
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
                    return new yo(0);
                case 1:
                    return new no6();
                case 2:
                    return new wo6((to6) null);
                case 3:
                    return new yo(1);
                case 4:
                    return new rmd();
            }
        }
        throw new IllegalArgumentException(rf0.h("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public f55[] d(d55[] d55Arr, bf0 bf0) {
        zi0 zi0;
        double d;
        d55[] d55Arr2 = d55Arr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (d55 d55 : d55Arr2) {
            if (d55 == null || d55.b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                ts6 i2 = ws6.i();
                i2.d(new d9(0, 0));
                arrayList.add(i2);
            }
        }
        int length = d55Arr2.length;
        long[][] jArr = new long[length][];
        for (int i3 = 0; i3 < d55Arr2.length; i3++) {
            d55 d552 = d55Arr2[i3];
            if (d552 == null) {
                jArr[i3] = new long[0];
            } else {
                int[] iArr = d552.b;
                jArr[i3] = new long[iArr.length];
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    jArr[i3][i4] = (long) d552.a.c[iArr[i4]].w0;
                }
                Arrays.sort(jArr[i3]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr2 = new long[length];
        for (int i5 = 0; i5 < length; i5++) {
            long[] jArr3 = jArr[i5];
            jArr2[i5] = jArr3.length == 0 ? 0 : jArr3[0];
        }
        f9.v(arrayList, jArr2);
        ia9 g = og0.H().e().g();
        int i6 = 0;
        while (i6 < length) {
            long[] jArr4 = jArr[i6];
            if (jArr4.length > 1) {
                int length2 = jArr4.length;
                double[] dArr = new double[length2];
                int i7 = i;
                while (true) {
                    long[] jArr5 = jArr[i6];
                    d = 0.0d;
                    if (i7 >= jArr5.length) {
                        break;
                    }
                    long j = jArr5[i7];
                    if (j != -1) {
                        d = Math.log((double) j);
                    }
                    dArr[i7] = d;
                    i7++;
                }
                int i8 = length2 - 1;
                double d2 = dArr[i8] - dArr[i];
                int i9 = i;
                while (i9 < i8) {
                    double d3 = dArr[i9];
                    i9++;
                    g.g(Double.valueOf(d2 == d ? 1.0d : (((d3 + dArr[i9]) * 0.5d) - dArr[i]) / d2), Integer.valueOf(i6));
                    i = 0;
                    d = 0.0d;
                }
            }
            i6++;
            i = 0;
        }
        ws6 j2 = ws6.j(g.h());
        for (int i10 = 0; i10 < j2.size(); i10++) {
            int intValue = ((Integer) j2.get(i10)).intValue();
            int i11 = iArr2[intValue] + 1;
            iArr2[intValue] = i11;
            jArr2[intValue] = jArr[intValue][i11];
            f9.v(arrayList, jArr2);
        }
        for (int i12 = 0; i12 < d55Arr2.length; i12++) {
            if (arrayList.get(i12) != null) {
                jArr2[i12] = jArr2[i12] * 2;
            }
        }
        f9.v(arrayList, jArr2);
        ts6 i13 = ws6.i();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ts6 ts6 = (ts6) arrayList.get(i14);
            i13.d(ts6 == null ? ws6.m() : ts6.j());
        }
        e8c j3 = i13.j();
        f55[] f55Arr = new f55[d55Arr2.length];
        for (int i15 = 0; i15 < d55Arr2.length; i15++) {
            d55 d553 = d55Arr2[i15];
            if (d553 != null) {
                int[] iArr3 = d553.b;
                if (iArr3.length != 0) {
                    if (iArr3.length == 1) {
                        int i16 = iArr3[0];
                        int i17 = d553.c;
                        zi0 = new zi0(d553.a, new int[]{i16});
                    } else {
                        long j4 = (long) 25000;
                        zi0 = new f9(d553.a, iArr3, d553.c, bf0, (long) 10000, j4, j4, 1279, 719, 0.7f, 0.75f, (ws6) j3.get(i15), y7e.a);
                    }
                    f55Arr[i15] = zi0;
                }
            }
        }
        return f55Arr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.OutputStream} */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.io.Closeable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object h(java.io.File r13, java.io.InputStream r14, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.lg5
            if (r0 == 0) goto L_0x0013
            r0 = r15
            lg5 r0 = (defpackage.lg5) r0
            int r1 = r0.A0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.A0 = r1
            goto L_0x0018
        L_0x0013:
            lg5 r0 = new lg5
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r12 = r0.y0
            pu3 r15 = pu3.a
            int r1 = r0.A0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0043
            if (r1 != r3) goto L_0x003b
            long r13 = r0.x0
            byte[] r1 = r0.w0
            java.io.OutputStream r4 = r0.Z
            java.io.Closeable r5 = r0.Y
            java.io.InputStream r6 = r0.X
            java.io.Closeable r7 = r0.o
            wx3.H(r12)     // Catch:{ all -> 0x0038 }
            r12 = r6
            r10 = r13
            r14 = r7
            r6 = r10
            goto L_0x007a
        L_0x0038:
            r12 = move-exception
            r14 = r7
            goto L_0x0093
        L_0x003b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0043:
            wx3.H(r12)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream
            r5.<init>(r13, r2)
            r12 = 8192(0x2000, float:1.14794E-41)
            byte[] r12 = new byte[r12]     // Catch:{ all -> 0x0082 }
            java.lang.System.nanoTime()     // Catch:{ all -> 0x0082 }
            int r13 = r14.read(r12)     // Catch:{ all -> 0x0082 }
            r6 = 0
            r1 = r12
            r12 = r14
            r4 = r5
        L_0x005b:
            if (r13 < 0) goto L_0x0084
            java.lang.System.nanoTime()     // Catch:{ all -> 0x0082 }
            r4.write(r1, r2, r13)     // Catch:{ all -> 0x0082 }
            long r8 = (long) r13     // Catch:{ all -> 0x0082 }
            long r6 = r6 + r8
            r0.o = r14     // Catch:{ all -> 0x0082 }
            r0.X = r12     // Catch:{ all -> 0x0082 }
            r0.Y = r5     // Catch:{ all -> 0x0082 }
            r0.Z = r4     // Catch:{ all -> 0x0082 }
            r0.w0 = r1     // Catch:{ all -> 0x0082 }
            r0.x0 = r6     // Catch:{ all -> 0x0082 }
            r0.A0 = r3     // Catch:{ all -> 0x0082 }
            java.lang.Object r13 = e07.O(r0)     // Catch:{ all -> 0x0082 }
            if (r13 != r15) goto L_0x007a
            return r15
        L_0x007a:
            java.lang.System.nanoTime()     // Catch:{ all -> 0x0082 }
            int r13 = r12.read(r1)     // Catch:{ all -> 0x0082 }
            goto L_0x005b
        L_0x0082:
            r12 = move-exception
            goto L_0x0093
        L_0x0084:
            r4.flush()     // Catch:{ all -> 0x0082 }
            r12 = 0
            urd.l(r5, r12)     // Catch:{ all -> 0x0091 }
            urd.l(r14, r12)
            jue r12 = jue.a
            return r12
        L_0x0091:
            r12 = move-exception
            goto L_0x0099
        L_0x0093:
            throw r12     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r13 = move-exception
            urd.l(r5, r12)     // Catch:{ all -> 0x0091 }
            throw r13     // Catch:{ all -> 0x0091 }
        L_0x0099:
            throw r12     // Catch:{ all -> 0x009a }
        L_0x009a:
            r13 = move-exception
            urd.l(r14, r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zl3.h(java.io.File, java.io.InputStream, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean i(UnsatisfiedLinkError unsatisfiedLinkError, ild[] ildArr) {
        String str = unsatisfiedLinkError instanceof hld ? ((hld) unsatisfiedLinkError).a : null;
        Objects.toString(unsatisfiedLinkError);
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (uue uue : ildArr) {
            if (uue instanceof uue) {
                uue uue2 = uue;
                uue.b();
                uue2.getClass();
                File file = uue2.a;
                try {
                    t7e.d(file, new File(file, "dso_lock")).close();
                } catch (Exception unused) {
                    Objects.toString(file);
                }
            }
        }
        return true;
    }

    public void k(afc afc, float f) {
        egc egc = (Drawable) afc.a;
        CardView cardView = (CardView) afc.b;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (!(f == egc.e && egc.f == useCompatPadding && egc.g == preventCornerOverlap)) {
            egc.e = f;
            egc.f = useCompatPadding;
            egc.g = preventCornerOverlap;
            egc.b((Rect) null);
            egc.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            afc.I(0, 0, 0, 0);
            return;
        }
        egc egc2 = (Drawable) afc.a;
        float f2 = egc2.e;
        float f3 = egc2.a;
        int ceil = (int) Math.ceil((double) fgc.a(f2, f3, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil((double) fgc.b(f2, f3, cardView.getPreventCornerOverlap()));
        afc.I(ceil, ceil2, ceil, ceil2);
    }

    public boolean l(xu5 xu5) {
        String str = xu5.n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    public boolean test(Object obj) {
        return lce.a(((Number) obj).intValue());
    }
}
