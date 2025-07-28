package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;
import org.json.JSONObject;

/* renamed from: n1g  reason: default package */
public abstract class n1g {
    public static fte b;
    public static final x3a c = new x3a(28, (Object) "HEAP_DUMP");
    public static final byte[] d = {112, 114, 111, 0};
    public static final byte[] e = {112, 114, 109, 0};
    public final /* synthetic */ int a;

    public /* synthetic */ n1g(int i) {
        this.a = i;
    }

    public static final boolean A(ou3 ou3) {
        g37 g37 = (g37) ou3.getCoroutineContext().get(xhd.c);
        if (g37 != null) {
            return g37.isActive();
        }
        return true;
    }

    public static final boolean B(xm8 xm8) {
        vo8 vo8 = xm8.a;
        o00 d2 = vo8.d();
        boolean z = d2 == null || d2.b();
        if (d2 == null) {
            return true;
        }
        if (z) {
            List list = d2.f;
            if (list.size() == 1) {
                long j = vo8.Y;
                Long l = (Long) list.get(0);
                if (l != null && j == l.longValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void C(View view, int i, int i2, int i3, int i4) {
        View view2 = (View) view.getParent();
        if (xy6.w(view)) {
            view.layout(view2.getMeasuredWidth() - i3, i2, view2.getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    public static /* synthetic */ void D(View view, int i, int i2, int i3, int i4) {
        int measuredWidth = view.getMeasuredWidth() + i;
        if ((i4 & 8) != 0) {
            i3 = view.getMeasuredHeight() + i2;
        }
        C(view, i, i2, measuredWidth, i3);
    }

    public static void E(ByteBuffer byteBuffer, h50 h50, ByteBuffer byteBuffer2, h50 h502, j12 j12, int i, boolean z, boolean z2) {
        boolean z3;
        h50 h503;
        ByteBuffer byteBuffer3 = byteBuffer2;
        j12 j122 = j12;
        boolean z4 = true;
        if (h50.c == 2) {
            h503 = h502;
            z3 = true;
        } else {
            h503 = h502;
            z3 = false;
        }
        if (h503.c != 2) {
            z4 = false;
        }
        int i2 = j122.a;
        float[] fArr = new float[i2];
        int i3 = j122.b;
        float[] fArr2 = new float[i3];
        int i4 = i;
        for (int i5 = 0; i5 < i4; i5++) {
            if (z) {
                int position = byteBuffer2.position();
                for (int i6 = 0; i6 < i3; i6++) {
                    fArr2[i6] = t(byteBuffer3, z4, z4);
                }
                byteBuffer3.position(position);
            }
            for (int i7 = 0; i7 < i2; i7++) {
                fArr[i7] = t(byteBuffer, z3, z4);
            }
            ByteBuffer byteBuffer4 = byteBuffer;
            for (int i8 = 0; i8 < i3; i8++) {
                for (int i9 = 0; i9 < i2; i9++) {
                    fArr2[i8] = (j122.c[(i9 * i3) + i8] * fArr[i9]) + fArr2[i8];
                }
                if (z4) {
                    byteBuffer3.putShort((short) ((int) oze.i(fArr2[i8], -32768.0f, 32767.0f)));
                } else {
                    byteBuffer3.putFloat(z2 ? oze.i(fArr2[i8], -1.0f, 1.0f) : fArr2[i8]);
                }
                fArr2[i8] = 0.0f;
            }
        }
    }

    public static MappedByteBuffer F(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        FileInputStream fileInputStream;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", (CancellationSignal) null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
            throw th;
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013a, code lost:
        if (r11 == null) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x016b, code lost:
        r11 = me.leolin.shortcutbadger.BuildConfig.FLAVOR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x016c, code lost:
        r9 = new rr8(r9, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static vr8 G(ws8 r14) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "payloadCatching catch error"
            java.lang.String r2 = "ServerPayload/PayloadCatching"
            r3 = 1
            r4 = 0
            int r5 = defpackage.jjd.K(r14)     // Catch:{ all -> 0x000d }
            goto L_0x003c
        L_0x000d:
            r5 = move-exception
            defpackage.udd.S(r2, r1, r5)
            java.util.concurrent.CopyOnWriteArraySet r6 = uzc.a
            java.util.Iterator r6 = r6.iterator()
        L_0x0017:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x002a
            java.lang.Object r7 = r6.next()
            ny9 r7 = (defpackage.ny9) r7
            r7.getClass()
            defpackage.ny9.a(r5)
            goto L_0x0017
        L_0x002a:
            int r6 = m4b.a
            int r6 = defpackage.hr1.t(r6)
            if (r6 == 0) goto L_0x003b
            if (r6 == r3) goto L_0x003a
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x003a:
            throw r5
        L_0x003b:
            r5 = r4
        L_0x003c:
            r6 = 0
            if (r5 != 0) goto L_0x0040
            return r6
        L_0x0040:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = r4
            r10 = r8
            r9 = r6
        L_0x0048:
            if (r8 >= r5) goto L_0x01a9
            java.lang.String r11 = defpackage.jjd.M(r14)     // Catch:{ all -> 0x004f }
            goto L_0x007e
        L_0x004f:
            r11 = move-exception
            defpackage.udd.S(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = uzc.a
            java.util.Iterator r12 = r12.iterator()
        L_0x0059:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x006c
            java.lang.Object r13 = r12.next()
            ny9 r13 = (defpackage.ny9) r13
            r13.getClass()
            defpackage.ny9.a(r11)
            goto L_0x0059
        L_0x006c:
            int r12 = m4b.a
            int r12 = defpackage.hr1.t(r12)
            if (r12 == 0) goto L_0x007d
            if (r12 == r3) goto L_0x007c
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x007c:
            throw r11
        L_0x007d:
            r11 = r6
        L_0x007e:
            if (r11 == 0) goto L_0x0173
            int r12 = r11.hashCode()
            r13 = -1370485892(0xffffffffae500b7c, float:-4.7303925E-11)
            if (r12 == r13) goto L_0x012b
            r13 = -731385813(0xffffffffd467f02b, float:-3.98466718E12)
            if (r12 == r13) goto L_0x00e0
            r13 = -372020745(0xffffffffe9d369f7, float:-3.194797E25)
            if (r12 == r13) goto L_0x0095
            goto L_0x0173
        L_0x0095:
            java.lang.String r12 = "counters"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x009f
            goto L_0x0173
        L_0x009f:
            int r11 = defpackage.jjd.D(r14)     // Catch:{ all -> 0x00a4 }
            goto L_0x00d3
        L_0x00a4:
            r11 = move-exception
            defpackage.udd.S(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = uzc.a
            java.util.Iterator r12 = r12.iterator()
        L_0x00ae:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00c1
            java.lang.Object r13 = r12.next()
            ny9 r13 = (defpackage.ny9) r13
            r13.getClass()
            defpackage.ny9.a(r11)
            goto L_0x00ae
        L_0x00c1:
            int r12 = m4b.a
            int r12 = defpackage.hr1.t(r12)
            if (r12 == 0) goto L_0x00d2
            if (r12 == r3) goto L_0x00d1
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x00d1:
            throw r11
        L_0x00d2:
            r11 = r4
        L_0x00d3:
            r12 = r4
        L_0x00d4:
            if (r12 >= r11) goto L_0x01a5
            sr8 r13 = defpackage.gwf.C(r14)
            r7.add(r13)
            int r12 = r12 + 1
            goto L_0x00d4
        L_0x00e0:
            java.lang.String r12 = "totalCount"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00ea
            goto L_0x0173
        L_0x00ea:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            int r11 = defpackage.jjd.I(r14)     // Catch:{ all -> 0x00f7 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00f7 }
            goto L_0x0125
        L_0x00f7:
            r11 = move-exception
            defpackage.udd.S(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = uzc.a
            java.util.Iterator r12 = r12.iterator()
        L_0x0101:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0114
            java.lang.Object r13 = r12.next()
            ny9 r13 = (defpackage.ny9) r13
            r13.getClass()
            defpackage.ny9.a(r11)
            goto L_0x0101
        L_0x0114:
            int r12 = m4b.a
            int r12 = defpackage.hr1.t(r12)
            if (r12 == 0) goto L_0x0125
            if (r12 == r3) goto L_0x0124
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x0124:
            throw r11
        L_0x0125:
            int r10 = r10.intValue()
            goto L_0x01a5
        L_0x012b:
            java.lang.String r12 = "yourReaction"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0134
            goto L_0x0173
        L_0x0134:
            wr8 r9 = wr8.c
            java.lang.String r11 = defpackage.jjd.M(r14)     // Catch:{ all -> 0x013d }
            if (r11 != 0) goto L_0x016c
            goto L_0x016b
        L_0x013d:
            r11 = move-exception
            defpackage.udd.S(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = uzc.a
            java.util.Iterator r12 = r12.iterator()
        L_0x0147:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x015a
            java.lang.Object r13 = r12.next()
            ny9 r13 = (defpackage.ny9) r13
            r13.getClass()
            defpackage.ny9.a(r11)
            goto L_0x0147
        L_0x015a:
            int r12 = m4b.a
            int r12 = defpackage.hr1.t(r12)
            if (r12 == 0) goto L_0x016b
            if (r12 == r3) goto L_0x016a
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x016a:
            throw r11
        L_0x016b:
            r11 = r0
        L_0x016c:
            rr8 r12 = new rr8
            r12.<init>(r9, r11)
            r9 = r12
            goto L_0x01a5
        L_0x0173:
            r14.z()     // Catch:{ all -> 0x0177 }
            goto L_0x01a5
        L_0x0177:
            r11 = move-exception
            defpackage.udd.S(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = uzc.a
            java.util.Iterator r12 = r12.iterator()
        L_0x0181:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0194
            java.lang.Object r13 = r12.next()
            ny9 r13 = (defpackage.ny9) r13
            r13.getClass()
            defpackage.ny9.a(r11)
            goto L_0x0181
        L_0x0194:
            int r12 = m4b.a
            int r12 = defpackage.hr1.t(r12)
            if (r12 == 0) goto L_0x01a5
            if (r12 == r3) goto L_0x01a4
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x01a4:
            throw r11
        L_0x01a5:
            int r8 = r8 + 1
            goto L_0x0048
        L_0x01a9:
            vr8 r14 = new vr8
            r14.<init>(r7, r10, r9)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1g.G(ws8):vr8");
    }

    public static final ContextScope M(ou3 ou3, hu3 hu3) {
        return new ContextScope(ou3.getCoroutineContext().plus(hu3));
    }

    public static int[] N(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) am7.A(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static bg4[] O(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, bg4[] bg4Arr) {
        byte[] bArr3 = r1g.i;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(r1g.d, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int A = (int) am7.A(fileInputStream, 1);
                byte[] z = am7.z(fileInputStream, (int) am7.A(fileInputStream, 4), (int) am7.A(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(z);
                    try {
                        bg4[] P = P(byteArrayInputStream, A, bg4Arr);
                        byteArrayInputStream.close();
                        return P;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, r1g.j)) {
            int A2 = (int) am7.A(fileInputStream, 2);
            byte[] z2 = am7.z(fileInputStream, (int) am7.A(fileInputStream, 4), (int) am7.A(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(z2);
                try {
                    bg4[] Q = Q(byteArrayInputStream2, bArr2, A2, bg4Arr);
                    byteArrayInputStream2.close();
                    return Q;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    public static bg4[] P(ByteArrayInputStream byteArrayInputStream, int i, bg4[] bg4Arr) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new bg4[0];
        }
        if (i == bg4Arr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = (int) am7.A(byteArrayInputStream, 2);
                strArr[i3] = new String(am7.y(byteArrayInputStream, (int) am7.A(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            while (i2 < i) {
                bg4 bg4 = bg4Arr[i2];
                if (bg4.b.equals(strArr[i2])) {
                    int i4 = iArr[i2];
                    bg4.e = i4;
                    bg4.h = N(byteArrayInputStream, i4);
                    i2++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bg4Arr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static bg4[] Q(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, bg4[] bg4Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new bg4[0];
        }
        if (i == bg4Arr.length) {
            int i2 = 0;
            while (i2 < i) {
                am7.A(byteArrayInputStream, 2);
                String str = new String(am7.y(byteArrayInputStream, (int) am7.A(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long A = am7.A(byteArrayInputStream, 4);
                int A2 = (int) am7.A(byteArrayInputStream, 2);
                bg4 bg4 = null;
                if (bg4Arr.length > 0) {
                    int indexOf = str.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str.indexOf(":");
                    }
                    String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= bg4Arr.length) {
                            break;
                        } else if (bg4Arr[i3].b.equals(substring)) {
                            bg4 = bg4Arr[i3];
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                if (bg4 != null) {
                    bg4.d = A;
                    int[] N = N(byteArrayInputStream, A2);
                    if (Arrays.equals(bArr, r1g.h)) {
                        bg4.e = A2;
                        bg4.h = N;
                    }
                    i2++;
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str));
                }
            }
            return bg4Arr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static bg4[] R(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, r1g.e)) {
            int A = (int) am7.A(fileInputStream, 1);
            byte[] z = am7.z(fileInputStream, (int) am7.A(fileInputStream, 4), (int) am7.A(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(z);
                try {
                    bg4[] T = T(byteArrayInputStream, str, A);
                    byteArrayInputStream.close();
                    return T;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    public static final String S(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        return stringWriter.toString();
    }

    public static bg4[] T(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        TreeMap treeMap;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i2 = i;
        if (byteArrayInputStream.available() == 0) {
            return new bg4[0];
        }
        bg4[] bg4Arr = new bg4[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int A = (int) am7.A(byteArrayInputStream2, 2);
            String str2 = str;
            bg4Arr[i3] = new bg4(str2, new String(am7.y(byteArrayInputStream2, (int) am7.A(byteArrayInputStream2, 2)), StandardCharsets.UTF_8), am7.A(byteArrayInputStream2, 4), A, (int) am7.A(byteArrayInputStream2, 4), (int) am7.A(byteArrayInputStream2, 4), new int[A], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i2) {
            bg4 bg4 = bg4Arr[i4];
            int available = byteArrayInputStream.available() - bg4.f;
            int i5 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bg4.i;
                if (available2 <= available) {
                    break;
                }
                i5 += (int) am7.A(byteArrayInputStream2, 2);
                treeMap.put(Integer.valueOf(i5), 1);
                for (int A2 = (int) am7.A(byteArrayInputStream2, 2); A2 > 0; A2--) {
                    am7.A(byteArrayInputStream2, 2);
                    int A3 = (int) am7.A(byteArrayInputStream2, 1);
                    if (!(A3 == 6 || A3 == 7)) {
                        while (A3 > 0) {
                            am7.A(byteArrayInputStream2, 1);
                            for (int A4 = (int) am7.A(byteArrayInputStream2, 1); A4 > 0; A4--) {
                                am7.A(byteArrayInputStream2, 2);
                            }
                            A3--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                bg4.h = N(byteArrayInputStream2, bg4.e);
                int i6 = bg4.g;
                BitSet valueOf = BitSet.valueOf(am7.y(byteArrayInputStream2, (((i6 * 2) + 7) & -8) / 8));
                for (int i7 = 0; i7 < i6; i7++) {
                    int i8 = valueOf.get(i7) ? 2 : 0;
                    if (valueOf.get(i7 + i6)) {
                        i8 |= 4;
                    }
                    if (i8 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i7));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i7), Integer.valueOf(i8 | num.intValue()));
                    }
                }
                i4++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return bg4Arr;
    }

    public static final int U(cvc cvc, int i) {
        int i2;
        int i3 = i + 1;
        int length = cvc.X.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= length) {
                i2 = (i4 + length) >>> 1;
                int i5 = cvc.Y[i2];
                if (i5 >= i3) {
                    if (i5 <= i3) {
                        break;
                    }
                    length = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [l7c, java.lang.Object] */
    public static final djc Z(pj5 pj5, long j) {
        ? obj = new Object();
        h37 a2 = lp.a();
        a2.H();
        obj.a = a2;
        return new djc(new erd(new gl5(pj5, new pf0((Object) obj, (Continuation) null, 15)), obj, j, (Continuation) null));
    }

    public static final ContextScope a(hu3 hu3) {
        if (hu3.get(xhd.c) == null) {
            hu3 = hu3.plus(lp.a());
        }
        return new ContextScope(hu3);
    }

    public static boolean a0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, bg4[] bg4Arr) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        long j;
        ArrayList arrayList;
        int length;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th5;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        bg4[] bg4Arr2 = bg4Arr;
        byte[] bArr3 = r1g.d;
        int i = 0;
        if (Arrays.equals(bArr2, bArr3)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                am7.H(bg4Arr2.length, byteArrayOutputStream5);
                int i2 = 2;
                int i3 = 2;
                for (bg4 bg4 : bg4Arr2) {
                    am7.G(byteArrayOutputStream5, bg4.c, 4);
                    am7.G(byteArrayOutputStream5, bg4.d, 4);
                    am7.G(byteArrayOutputStream5, (long) bg4.g, 4);
                    String l = l(bg4.a, bg4.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = l.getBytes(charset).length;
                    am7.H(length2, byteArrayOutputStream5);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream5.write(l.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i3 == byteArray.length) {
                    wuf wuf = new wuf(1, byteArray, false);
                    byteArrayOutputStream5.close();
                    arrayList2.add(wuf);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < bg4Arr2.length) {
                        try {
                            bg4 bg42 = bg4Arr2[i4];
                            am7.H(i4, byteArrayOutputStream6);
                            am7.H(bg42.e, byteArrayOutputStream6);
                            i5 = i5 + 4 + (bg42.e * 2);
                            int[] iArr = bg42.h;
                            int length3 = iArr.length;
                            int i6 = i;
                            while (i < length3) {
                                int i7 = iArr[i];
                                am7.H(i7 - i6, byteArrayOutputStream6);
                                i++;
                                i6 = i7;
                            }
                            i4++;
                            i = 0;
                        } catch (Throwable th6) {
                            th2.addSuppressed(th6);
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i5 == byteArray2.length) {
                        wuf wuf2 = new wuf(3, byteArray2, true);
                        byteArrayOutputStream6.close();
                        arrayList2.add(wuf2);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < bg4Arr2.length) {
                            try {
                                bg4 bg43 = bg4Arr2[i8];
                                int i10 = 0;
                                for (Map.Entry value : bg43.i.entrySet()) {
                                    i10 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                e0(byteArrayOutputStream2, bg43);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                f0(byteArrayOutputStream3, bg43);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                am7.H(i8, byteArrayOutputStream7);
                                int length4 = byteArray3.length + i2 + byteArray4.length;
                                int i11 = i9 + 6;
                                ArrayList arrayList4 = arrayList3;
                                am7.G(byteArrayOutputStream7, (long) length4, 4);
                                am7.H(i10, byteArrayOutputStream7);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i9 = i11 + length4;
                                i8++;
                                arrayList3 = arrayList4;
                                i2 = 2;
                            } catch (Throwable th7) {
                                th3.addSuppressed(th7);
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i9 == byteArray5.length) {
                            wuf wuf3 = new wuf(4, byteArray5, true);
                            byteArrayOutputStream7.close();
                            arrayList2.add(wuf3);
                            long j2 = (long) 4;
                            long size = j2 + j2 + 4 + ((long) (arrayList2.size() * 16));
                            am7.G(byteArrayOutputStream4, (long) arrayList2.size(), 4);
                            int i12 = 0;
                            while (i12 < arrayList2.size()) {
                                wuf wuf4 = (wuf) arrayList2.get(i12);
                                int i13 = wuf4.a;
                                if (i13 == 1) {
                                    j = 0;
                                } else if (i13 == 2) {
                                    j = 1;
                                } else if (i13 == 3) {
                                    j = 2;
                                } else if (i13 == 4) {
                                    j = 3;
                                } else if (i13 == 5) {
                                    j = 4;
                                } else {
                                    throw null;
                                }
                                am7.G(byteArrayOutputStream4, j, 4);
                                am7.G(byteArrayOutputStream4, size, 4);
                                boolean z = wuf4.c;
                                byte[] bArr4 = wuf4.b;
                                if (z) {
                                    byte[] g = am7.g(bArr4);
                                    arrayList = arrayList5;
                                    arrayList.add(g);
                                    am7.G(byteArrayOutputStream4, (long) g.length, 4);
                                    am7.G(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    length = g.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr4);
                                    am7.G(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    am7.G(byteArrayOutputStream4, 0, 4);
                                    length = bArr4.length;
                                }
                                size += (long) length;
                                i12++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                                byteArrayOutputStream4.write((byte[]) arrayList6.get(i14));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th8) {
                th.addSuppressed(th8);
            }
        } else {
            byte[] bArr5 = r1g.e;
            if (Arrays.equals(bArr2, bArr5)) {
                byte[] g2 = g(bg4Arr2, bArr5);
                am7.G(byteArrayOutputStream4, (long) bg4Arr2.length, 1);
                am7.G(byteArrayOutputStream4, (long) g2.length, 4);
                byte[] g3 = am7.g(g2);
                am7.G(byteArrayOutputStream4, (long) g3.length, 4);
                byteArrayOutputStream4.write(g3);
                return true;
            }
            byte[] bArr6 = r1g.g;
            if (Arrays.equals(bArr2, bArr6)) {
                am7.G(byteArrayOutputStream4, (long) bg4Arr2.length, 1);
                for (bg4 bg44 : bg4Arr2) {
                    String l2 = l(bg44.a, bg44.b, bArr6);
                    Charset charset2 = StandardCharsets.UTF_8;
                    am7.H(l2.getBytes(charset2).length, byteArrayOutputStream4);
                    am7.H(bg44.h.length, byteArrayOutputStream4);
                    am7.G(byteArrayOutputStream4, (long) (bg44.i.size() * 4), 4);
                    am7.G(byteArrayOutputStream4, bg44.c, 4);
                    byteArrayOutputStream4.write(l2.getBytes(charset2));
                    for (Integer intValue : bg44.i.keySet()) {
                        am7.H(intValue.intValue(), byteArrayOutputStream4);
                        am7.H(0, byteArrayOutputStream4);
                    }
                    for (int H : bg44.h) {
                        am7.H(H, byteArrayOutputStream4);
                    }
                }
                return true;
            }
            byte[] bArr7 = r1g.f;
            if (Arrays.equals(bArr2, bArr7)) {
                byte[] g4 = g(bg4Arr2, bArr7);
                am7.G(byteArrayOutputStream4, (long) bg4Arr2.length, 1);
                am7.G(byteArrayOutputStream4, (long) g4.length, 4);
                byte[] g5 = am7.g(g4);
                am7.G(byteArrayOutputStream4, (long) g5.length, 4);
                byteArrayOutputStream4.write(g5);
                return true;
            }
            byte[] bArr8 = r1g.h;
            if (!Arrays.equals(bArr2, bArr8)) {
                return false;
            }
            am7.H(bg4Arr2.length, byteArrayOutputStream4);
            for (bg4 bg45 : bg4Arr2) {
                String l3 = l(bg45.a, bg45.b, bArr8);
                Charset charset3 = StandardCharsets.UTF_8;
                am7.H(l3.getBytes(charset3).length, byteArrayOutputStream4);
                TreeMap treeMap = bg45.i;
                am7.H(treeMap.size(), byteArrayOutputStream4);
                am7.H(bg45.h.length, byteArrayOutputStream4);
                am7.G(byteArrayOutputStream4, bg45.c, 4);
                byteArrayOutputStream4.write(l3.getBytes(charset3));
                for (Integer intValue2 : treeMap.keySet()) {
                    am7.H(intValue2.intValue(), byteArrayOutputStream4);
                }
                for (int H2 : bg45.h) {
                    am7.H(H2, byteArrayOutputStream4);
                }
            }
            return true;
        }
        throw th2;
        throw th;
        throw th4;
        throw th5;
        throw th3;
    }

    public static boolean b(h50 h50) {
        if (h50.a == -1 || h50.b == -1) {
            return false;
        }
        int i = h50.c;
        return i == 2 || i == 4;
    }

    public static final void b0(bve bve) {
        bve.e(zr8.class, new n5b(5));
        bve.e(hzb.class, new n5b(6));
    }

    public static final void c(ou3 ou3, CancellationException cancellationException) {
        g37 g37 = (g37) ou3.getCoroutineContext().get(xhd.c);
        if (g37 != null) {
            g37.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + ou3).toString());
    }

    public static final int c0(int i, float f) {
        return Color.argb(a24.X(f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static void d0(ByteArrayOutputStream byteArrayOutputStream, bg4 bg4, String str) {
        Charset charset = StandardCharsets.UTF_8;
        am7.H(str.getBytes(charset).length, byteArrayOutputStream);
        am7.H(bg4.e, byteArrayOutputStream);
        am7.G(byteArrayOutputStream, (long) bg4.f, 4);
        am7.G(byteArrayOutputStream, bg4.c, 4);
        am7.G(byteArrayOutputStream, (long) bg4.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void e0(ByteArrayOutputStream byteArrayOutputStream, bg4 bg4) {
        byte[] bArr = new byte[((((bg4.g * 2) + 7) & -8) / 8)];
        for (Map.Entry entry : bg4.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i = intValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i2 = intValue + bg4.g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final Object f(i26 i26, Continuation continuation) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation.getContext(), continuation);
        return h2g.D(scopeCoroutine, scopeCoroutine, i26);
    }

    public static void f0(ByteArrayOutputStream byteArrayOutputStream, bg4 bg4) {
        int i = 0;
        for (Map.Entry entry : bg4.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                am7.H(intValue - i, byteArrayOutputStream);
                am7.H(0, byteArrayOutputStream);
                i = intValue;
            }
        }
    }

    public static byte[] g(bg4[] bg4Arr, byte[] bArr) {
        int i = 0;
        for (bg4 bg4 : bg4Arr) {
            i += ((((bg4.g * 2) + 7) & -8) / 8) + (bg4.e * 2) + l(bg4.a, bg4.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bg4.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        if (Arrays.equals(bArr, r1g.f)) {
            for (bg4 bg42 : bg4Arr) {
                d0(byteArrayOutputStream, bg42, l(bg42.a, bg42.b, bArr));
                f0(byteArrayOutputStream, bg42);
                int[] iArr = bg42.h;
                int length = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = iArr[i2];
                    am7.H(i4 - i3, byteArrayOutputStream);
                    i2++;
                    i3 = i4;
                }
                e0(byteArrayOutputStream, bg42);
            }
        } else {
            for (bg4 bg43 : bg4Arr) {
                d0(byteArrayOutputStream, bg43, l(bg43.a, bg43.b, bArr));
            }
            for (bg4 bg44 : bg4Arr) {
                f0(byteArrayOutputStream, bg44);
                int[] iArr2 = bg44.h;
                int length2 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = iArr2[i5];
                    am7.H(i7 - i6, byteArrayOutputStream);
                    i5++;
                    i6 = i7;
                }
                e0(byteArrayOutputStream, bg44);
            }
        }
        if (byteArrayOutputStream.size() == i) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i);
    }

    public static void h(String str, String str2, Object obj) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, new Object[]{obj});
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int i(defpackage.rfc r17, defpackage.hbc r18, defpackage.ax4 r19, int r20) {
        /*
            r0 = r18
            r1 = r19
            boolean r2 = defpackage.ax4.U(r19)
            r3 = 1
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            boolean r2 = defpackage.ax4.U(r19)
            java.lang.String r4 = "Check failed."
            if (r2 == 0) goto L_0x011a
            if (r0 == 0) goto L_0x00a3
            int r2 = r0.b
            if (r2 <= 0) goto L_0x00a3
            int r5 = r0.a
            if (r5 <= 0) goto L_0x00a3
            r19.n0()
            int r6 = r1.Y
            if (r6 == 0) goto L_0x00a3
            r19.n0()
            int r6 = r1.Z
            if (r6 != 0) goto L_0x002e
            goto L_0x00a3
        L_0x002e:
            r17.getClass()
            r19.n0()
            int r6 = r1.o
            r7 = 270(0x10e, float:3.78E-43)
            r8 = 90
            if (r6 == 0) goto L_0x004f
            if (r6 == r8) goto L_0x004f
            r9 = 180(0xb4, float:2.52E-43)
            if (r6 == r9) goto L_0x004f
            if (r6 != r7) goto L_0x0045
            goto L_0x004f
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x004f:
            if (r6 == r8) goto L_0x0056
            if (r6 != r7) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r4 = 0
            goto L_0x0057
        L_0x0056:
            r4 = r3
        L_0x0057:
            if (r4 == 0) goto L_0x005f
            r19.n0()
            int r6 = r1.Z
            goto L_0x0064
        L_0x005f:
            r19.n0()
            int r6 = r1.Y
        L_0x0064:
            if (r4 == 0) goto L_0x006c
            r19.n0()
            int r4 = r1.Y
            goto L_0x0071
        L_0x006c:
            r19.n0()
            int r4 = r1.Z
        L_0x0071:
            float r7 = (float) r5
            float r8 = (float) r6
            float r7 = r7 / r8
            float r8 = (float) r2
            float r9 = (float) r4
            float r8 = r8 / r9
            float r9 = defpackage.gwf.g(r7, r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
            java.lang.Float r14 = java.lang.Float.valueOf(r7)
            java.lang.Float r15 = java.lang.Float.valueOf(r8)
            java.lang.Float r16 = java.lang.Float.valueOf(r9)
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r11, r12, r13, r14, r15, r16}
            java.lang.String r4 = "DownsampleUtil"
            java.lang.String r5 = "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f"
            defpackage.m75.h(r4, r5, r2)
            goto L_0x00a5
        L_0x00a3:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x00a5:
            r19.n0()
            lq6 r2 = r1.c
            lq6 r4 = defpackage.o84.a
            r5 = 2
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r10 = 1059760811(0x3f2aaaab, float:0.6666667)
            if (r2 != r4) goto L_0x00cd
            int r2 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00bc
            goto L_0x00e8
        L_0x00bc:
            r3 = r5
        L_0x00bd:
            int r2 = r3 * 2
            double r4 = (double) r2
            double r4 = r7 / r4
            double r10 = (double) r6
            double r10 = r10 * r4
            double r10 = r10 + r4
            double r4 = (double) r9
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x00cb
            goto L_0x00e8
        L_0x00cb:
            r3 = r2
            goto L_0x00bd
        L_0x00cd:
            int r2 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00d2
            goto L_0x00e8
        L_0x00d2:
            double r10 = (double) r5
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = java.lang.Math.pow(r10, r12)
            double r12 = r12 - r10
            double r12 = r7 / r12
            double r10 = r7 / r10
            double r14 = (double) r6
            double r12 = r12 * r14
            double r12 = r12 + r10
            double r10 = (double) r9
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x0115
            int r3 = r5 + -1
        L_0x00e8:
            r19.n0()
            int r2 = r1.Z
            r19.n0()
            int r4 = r1.Y
            int r2 = java.lang.Math.max(r2, r4)
            if (r0 == 0) goto L_0x00fb
            float r0 = r0.c
            goto L_0x00fe
        L_0x00fb:
            r10 = r20
            float r0 = (float) r10
        L_0x00fe:
            int r4 = r2 / r3
            float r4 = (float) r4
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0114
            r19.n0()
            lq6 r4 = r1.c
            lq6 r5 = defpackage.o84.a
            if (r4 != r5) goto L_0x0111
            int r3 = r3 * 2
            goto L_0x00fe
        L_0x0111:
            int r3 = r3 + 1
            goto L_0x00fe
        L_0x0114:
            return r3
        L_0x0115:
            r10 = r20
            int r5 = r5 + 1
            goto L_0x00d2
        L_0x011a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1g.i(rfc, hbc, ax4, int):int");
    }

    public static final void k(ou3 ou3) {
        lp.m(ou3.getCoroutineContext());
    }

    public static String l(String str, String str2, byte[] bArr) {
        byte[] bArr2 = r1g.h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = r1g.g;
        String str3 = "!";
        String str4 = (!equals && !Arrays.equals(bArr, bArr3)) ? str3 : ":";
        if (str.length() <= 0) {
            return str3.equals(str4) ? str2.replace(":", str3) : ":".equals(str4) ? str2.replace(str3, ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains(str3) || str2.contains(":")) {
            return str3.equals(str4) ? str2.replace(":", str3) : ":".equals(str4) ? str2.replace(str3, ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder l = hr1.l(str);
        if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
            str3 = ":";
        }
        return wn6.l(l, str3, str2);
    }

    public static final Boolean n(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        return null;
    }

    public static final PackageInfo s(PackageManager packageManager, String str) {
        return Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of((long) 0)) : packageManager.getPackageInfo(str, 0);
    }

    public static float t(ByteBuffer byteBuffer, boolean z, boolean z2) {
        int i = 32767;
        if (z2) {
            if (z) {
                return (float) byteBuffer.getShort();
            }
            float f = byteBuffer.getFloat();
            if (f < 0.0f) {
                i = 32768;
            }
            return oze.i(f * ((float) i), -32768.0f, 32767.0f);
        } else if (!z) {
            return byteBuffer.getFloat();
        } else {
            short s = byteBuffer.getShort();
            float f2 = (float) s;
            if (s < 0) {
                i = 32768;
            }
            return f2 / ((float) i);
        }
    }

    public static String v(String str) {
        return "TRuntime.".concat(str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int x(java.lang.String r23) {
        /*
            r0 = 21
            r1 = 20
            r2 = 19
            r3 = 18
            r4 = 17
            r5 = 16
            r6 = 15
            r7 = 14
            r8 = 13
            r9 = 12
            r12 = 9
            r13 = 8
            r14 = 7
            r15 = 6
            r16 = 5
            r17 = 4
            r18 = 3
            r19 = 1
            r20 = 0
            r21 = -1
            if (r23 != 0) goto L_0x0029
            return r21
        L_0x0029:
            java.lang.String r11 = defpackage.c49.l(r23)
            r11.getClass()
            int r22 = r11.hashCode()
            switch(r22) {
                case -2123537834: goto L_0x01ce;
                case -1662384011: goto L_0x01c1;
                case -1662384007: goto L_0x01b5;
                case -1662095187: goto L_0x01a8;
                case -1606874997: goto L_0x019b;
                case -1487656890: goto L_0x018e;
                case -1487464693: goto L_0x0182;
                case -1487464690: goto L_0x0176;
                case -1487394660: goto L_0x0169;
                case -1487018032: goto L_0x015c;
                case -1248337486: goto L_0x014e;
                case -1079884372: goto L_0x0140;
                case -1004728940: goto L_0x0133;
                case -879272239: goto L_0x0126;
                case -879258763: goto L_0x0119;
                case -387023398: goto L_0x010c;
                case -43467528: goto L_0x00ff;
                case 13915911: goto L_0x00f2;
                case 187078296: goto L_0x00e5;
                case 187078297: goto L_0x00d8;
                case 187078669: goto L_0x00cb;
                case 187090232: goto L_0x00be;
                case 187091926: goto L_0x00b0;
                case 187099443: goto L_0x00a3;
                case 1331848029: goto L_0x0096;
                case 1503095341: goto L_0x0089;
                case 1504578661: goto L_0x007c;
                case 1504619009: goto L_0x006f;
                case 1504824762: goto L_0x0062;
                case 1504831518: goto L_0x0055;
                case 1505118770: goto L_0x0048;
                case 2039520277: goto L_0x003b;
                default: goto L_0x0037;
            }
        L_0x0037:
            r10 = r21
            goto L_0x01da
        L_0x003b:
            java.lang.String r10 = "video/x-matroska"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0044
            goto L_0x0037
        L_0x0044:
            r10 = 31
            goto L_0x01da
        L_0x0048:
            java.lang.String r10 = "audio/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0051
            goto L_0x0037
        L_0x0051:
            r10 = 30
            goto L_0x01da
        L_0x0055:
            java.lang.String r10 = "audio/mpeg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x005e
            goto L_0x0037
        L_0x005e:
            r10 = 29
            goto L_0x01da
        L_0x0062:
            java.lang.String r10 = "audio/midi"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x006b
            goto L_0x0037
        L_0x006b:
            r10 = 28
            goto L_0x01da
        L_0x006f:
            java.lang.String r10 = "audio/flac"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0078
            goto L_0x0037
        L_0x0078:
            r10 = 27
            goto L_0x01da
        L_0x007c:
            java.lang.String r10 = "audio/eac3"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0085
            goto L_0x0037
        L_0x0085:
            r10 = 26
            goto L_0x01da
        L_0x0089:
            java.lang.String r10 = "audio/3gpp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0092
            goto L_0x0037
        L_0x0092:
            r10 = 25
            goto L_0x01da
        L_0x0096:
            java.lang.String r10 = "video/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x009f
            goto L_0x0037
        L_0x009f:
            r10 = 24
            goto L_0x01da
        L_0x00a3:
            java.lang.String r10 = "audio/wav"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ac
            goto L_0x0037
        L_0x00ac:
            r10 = 23
            goto L_0x01da
        L_0x00b0:
            java.lang.String r10 = "audio/ogg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ba
            goto L_0x0037
        L_0x00ba:
            r10 = 22
            goto L_0x01da
        L_0x00be:
            java.lang.String r10 = "audio/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00c8
            goto L_0x0037
        L_0x00c8:
            r10 = r0
            goto L_0x01da
        L_0x00cb:
            java.lang.String r10 = "audio/amr"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00d5
            goto L_0x0037
        L_0x00d5:
            r10 = r1
            goto L_0x01da
        L_0x00d8:
            java.lang.String r10 = "audio/ac4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00e2
            goto L_0x0037
        L_0x00e2:
            r10 = r2
            goto L_0x01da
        L_0x00e5:
            java.lang.String r10 = "audio/ac3"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00ef
            goto L_0x0037
        L_0x00ef:
            r10 = r3
            goto L_0x01da
        L_0x00f2:
            java.lang.String r10 = "video/x-flv"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00fc
            goto L_0x0037
        L_0x00fc:
            r10 = r4
            goto L_0x01da
        L_0x00ff:
            java.lang.String r10 = "application/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0109
            goto L_0x0037
        L_0x0109:
            r10 = r5
            goto L_0x01da
        L_0x010c:
            java.lang.String r10 = "audio/x-matroska"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0116
            goto L_0x0037
        L_0x0116:
            r10 = r6
            goto L_0x01da
        L_0x0119:
            java.lang.String r10 = "image/png"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0123
            goto L_0x0037
        L_0x0123:
            r10 = r7
            goto L_0x01da
        L_0x0126:
            java.lang.String r10 = "image/bmp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0130
            goto L_0x0037
        L_0x0130:
            r10 = r8
            goto L_0x01da
        L_0x0133:
            java.lang.String r10 = "text/vtt"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x013d
            goto L_0x0037
        L_0x013d:
            r10 = r9
            goto L_0x01da
        L_0x0140:
            java.lang.String r10 = "video/x-msvideo"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x014a
            goto L_0x0037
        L_0x014a:
            r10 = 11
            goto L_0x01da
        L_0x014e:
            java.lang.String r10 = "application/mp4"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0158
            goto L_0x0037
        L_0x0158:
            r10 = 10
            goto L_0x01da
        L_0x015c:
            java.lang.String r10 = "image/webp"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0166
            goto L_0x0037
        L_0x0166:
            r10 = r12
            goto L_0x01da
        L_0x0169:
            java.lang.String r10 = "image/jpeg"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0173
            goto L_0x0037
        L_0x0173:
            r10 = r13
            goto L_0x01da
        L_0x0176:
            java.lang.String r10 = "image/heif"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0180
            goto L_0x0037
        L_0x0180:
            r10 = r14
            goto L_0x01da
        L_0x0182:
            java.lang.String r10 = "image/heic"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x018c
            goto L_0x0037
        L_0x018c:
            r10 = r15
            goto L_0x01da
        L_0x018e:
            java.lang.String r10 = "image/avif"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x0198
            goto L_0x0037
        L_0x0198:
            r10 = r16
            goto L_0x01da
        L_0x019b:
            java.lang.String r10 = "audio/amr-wb"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01a5
            goto L_0x0037
        L_0x01a5:
            r10 = r17
            goto L_0x01da
        L_0x01a8:
            java.lang.String r10 = "video/webm"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01b2
            goto L_0x0037
        L_0x01b2:
            r10 = r18
            goto L_0x01da
        L_0x01b5:
            java.lang.String r10 = "video/mp2t"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01bf
            goto L_0x0037
        L_0x01bf:
            r10 = 2
            goto L_0x01da
        L_0x01c1:
            java.lang.String r10 = "video/mp2p"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01cb
            goto L_0x0037
        L_0x01cb:
            r10 = r19
            goto L_0x01da
        L_0x01ce:
            java.lang.String r10 = "audio/eac3-joc"
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x01d8
            goto L_0x0037
        L_0x01d8:
            r10 = r20
        L_0x01da:
            switch(r10) {
                case 0: goto L_0x01f6;
                case 1: goto L_0x01f3;
                case 2: goto L_0x01f0;
                case 3: goto L_0x01ef;
                case 4: goto L_0x01ee;
                case 5: goto L_0x01ed;
                case 6: goto L_0x01ec;
                case 7: goto L_0x01ec;
                case 8: goto L_0x01eb;
                case 9: goto L_0x01ea;
                case 10: goto L_0x01e9;
                case 11: goto L_0x01e8;
                case 12: goto L_0x01e7;
                case 13: goto L_0x01e6;
                case 14: goto L_0x01e5;
                case 15: goto L_0x01ef;
                case 16: goto L_0x01ef;
                case 17: goto L_0x01e4;
                case 18: goto L_0x01f6;
                case 19: goto L_0x01e3;
                case 20: goto L_0x01ee;
                case 21: goto L_0x01e9;
                case 22: goto L_0x01e2;
                case 23: goto L_0x01e1;
                case 24: goto L_0x01e9;
                case 25: goto L_0x01ee;
                case 26: goto L_0x01f6;
                case 27: goto L_0x01e0;
                case 28: goto L_0x01df;
                case 29: goto L_0x01de;
                case 30: goto L_0x01ef;
                case 31: goto L_0x01ef;
                default: goto L_0x01dd;
            }
        L_0x01dd:
            return r21
        L_0x01de:
            return r14
        L_0x01df:
            return r6
        L_0x01e0:
            return r17
        L_0x01e1:
            return r9
        L_0x01e2:
            return r12
        L_0x01e3:
            return r19
        L_0x01e4:
            return r16
        L_0x01e5:
            return r4
        L_0x01e6:
            return r2
        L_0x01e7:
            return r8
        L_0x01e8:
            return r5
        L_0x01e9:
            return r13
        L_0x01ea:
            return r3
        L_0x01eb:
            return r7
        L_0x01ec:
            return r1
        L_0x01ed:
            return r0
        L_0x01ee:
            return r18
        L_0x01ef:
            return r15
        L_0x01f0:
            r0 = 11
            return r0
        L_0x01f3:
            r0 = 10
            return r0
        L_0x01f6:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1g.x(java.lang.String):int");
    }

    public static int y(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public abstract void H();

    public void I() {
    }

    public abstract boolean J(int i, KeyEvent keyEvent);

    public boolean K(KeyEvent keyEvent) {
        return false;
    }

    public boolean L() {
        return false;
    }

    public abstract void V(boolean z);

    public abstract void W(boolean z);

    public abstract void X(CharSequence charSequence);

    public n7 Y(b2b b2b) {
        return null;
    }

    public boolean d() {
        return false;
    }

    public abstract boolean e();

    public abstract void j(boolean z);

    public abstract int m(View view, int i, int i2);

    public yb6 o() {
        return new yb6();
    }

    public abstract String p();

    public abstract int q();

    public abstract int r(View view, int i);

    public String toString() {
        switch (this.a) {
            case 10:
                return "Alignment:" + p();
            default:
                return super.toString();
        }
    }

    public int u(int i, int i2) {
        return i;
    }

    public abstract Context w();

    public boolean z() {
        return false;
    }
}
