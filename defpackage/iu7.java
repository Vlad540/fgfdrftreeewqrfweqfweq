package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: iu7  reason: default package */
public abstract class iu7 {
    public static boolean a = false;
    public static int b = 1;
    public static final zo4 c = new zo4(24);
    public static final String[] d = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] e = {44100, 48000, 32000};
    public static final int[] f = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] h = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] i = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] j = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final int[] k = new int[0];
    public static final long[] l = new long[0];
    public static final float[] m = new float[0];
    public static final String[] n = new String[0];
    public static final byte[] o = new byte[0];
    public static final /* synthetic */ int p = 0;
    public static volatile lg7 q;

    public static String A(Context context, String str) {
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", packageName);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:7|8|9|10|(1:12)(1:13)|14|15|16|17|18|(1:20)|23|24|25|(2:27|(1:29)(1:30))(1:31)|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[Catch:{ RemoteException -> 0x0079, all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070 A[Catch:{ RemoteException -> 0x0079, all -> 0x004c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized int D(android.content.Context r5) {
        /*
            java.lang.Class<iu7> r0 = defpackage.iu7.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            defpackage.a24.p(r5, r1)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "null"
            java.lang.String r2 = "preferredRenderer: "
            r2.concat(r1)     // Catch:{ all -> 0x004c }
            boolean r1 = a     // Catch:{ all -> 0x004c }
            r2 = 0
            if (r1 == 0) goto L_0x0015
            goto L_0x0077
        L_0x0015:
            b3g r1 = defpackage.pfa.H(r5)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0080 }
            m1g r3 = r1.I0()     // Catch:{ RemoteException -> 0x0079 }
            defpackage.a24.o(r3)     // Catch:{ RemoteException -> 0x0079 }
            defpackage.mt0.i = r3     // Catch:{ RemoteException -> 0x0079 }
            r4g r3 = r1.K0()     // Catch:{ RemoteException -> 0x0079 }
            r4g r4 = defpackage.n06.e     // Catch:{ RemoteException -> 0x0079 }
            if (r4 == 0) goto L_0x002b
            goto L_0x0032
        L_0x002b:
            java.lang.String r4 = "delegate must not be null"
            defpackage.a24.p(r3, r4)     // Catch:{ RemoteException -> 0x0079 }
            defpackage.n06.e = r3     // Catch:{ RemoteException -> 0x0079 }
        L_0x0032:
            r3 = 1
            a = r3     // Catch:{ all -> 0x004c }
            android.os.Parcel r3 = r1.G0()     // Catch:{ RemoteException -> 0x0062 }
            r4 = 9
            android.os.Parcel r3 = r1.R(r3, r4)     // Catch:{ RemoteException -> 0x0062 }
            int r4 = r3.readInt()     // Catch:{ RemoteException -> 0x0062 }
            r3.recycle()     // Catch:{ RemoteException -> 0x0062 }
            r3 = 2
            if (r4 != r3) goto L_0x004e
            b = r3     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x004e
        L_0x004c:
            r5 = move-exception
            goto L_0x0085
        L_0x004e:
            ks9 r3 = new ks9     // Catch:{ RemoteException -> 0x0062 }
            r3.<init>(r5)     // Catch:{ RemoteException -> 0x0062 }
            android.os.Parcel r5 = r1.G0()     // Catch:{ RemoteException -> 0x0062 }
            defpackage.u1g.c(r5, r3)     // Catch:{ RemoteException -> 0x0062 }
            r5.writeInt(r2)     // Catch:{ RemoteException -> 0x0062 }
            r3 = 10
            r1.H0(r5, r3)     // Catch:{ RemoteException -> 0x0062 }
        L_0x0062:
            int r5 = b     // Catch:{ all -> 0x004c }
            r1 = 1
            if (r5 == r1) goto L_0x0070
            r1 = 2
            if (r5 == r1) goto L_0x006d
            java.lang.String r5 = "null"
            goto L_0x0072
        L_0x006d:
            java.lang.String r5 = "LATEST"
            goto L_0x0072
        L_0x0070:
            java.lang.String r5 = "LEGACY"
        L_0x0072:
            java.lang.String r1 = "loadedRenderer: "
            r1.concat(r5)     // Catch:{ all -> 0x004c }
        L_0x0077:
            monitor-exit(r0)
            return r2
        L_0x0079:
            r5 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException     // Catch:{ all -> 0x004c }
            r1.<init>(r5)     // Catch:{ all -> 0x004c }
            throw r1     // Catch:{ all -> 0x004c }
        L_0x0080:
            r5 = move-exception
            int r5 = r5.a     // Catch:{ all -> 0x004c }
            monitor-exit(r0)
            return r5
        L_0x0085:
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu7.D(android.content.Context):int");
    }

    public static aj4 E(long j2, Runnable runnable, hu3 hu3) {
        return p74.a.invokeOnTimeout(j2, runnable, hu3);
    }

    public static boolean F(String str) {
        return "service.unavailable".equals(str) || "io.exception".equals(str) || "service.timeout".equals(str);
    }

    public static boolean G(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static void H(MediaFormat mediaFormat, z23 z23) {
        if (z23 != null) {
            I(mediaFormat, "color-transfer", z23.c);
            I(mediaFormat, "color-standard", z23.a);
            I(mediaFormat, "color-range", z23.b);
            byte[] bArr = z23.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    public static void I(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static int N(int i2) {
        int i3;
        int i4;
        if (!((i2 & -2097152) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        if (i4 == 1) {
            return i3 == 3 ? 1152 : 576;
        }
        if (i4 == 2) {
            return 1152;
        }
        if (i4 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean O(Parcel parcel, int i2) {
        g0(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static byte P(Parcel parcel, int i2) {
        g0(parcel, i2, 4);
        return (byte) parcel.readInt();
    }

    public static float Q(Parcel parcel, int i2) {
        g0(parcel, i2, 4);
        return parcel.readFloat();
    }

    public static Float R(Parcel parcel, int i2) {
        int V = V(parcel, i2);
        if (V == 0) {
            return null;
        }
        f0(parcel, V);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder S(Parcel parcel, int i2) {
        int V = V(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + V);
        return readStrongBinder;
    }

    public static int T(Parcel parcel, int i2) {
        g0(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long U(Parcel parcel, int i2) {
        g0(parcel, i2, 8);
        return parcel.readLong();
    }

    public static int V(Parcel parcel, int i2) {
        return (i2 & -65536) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static final void W(int i2, int i3, Object[] objArr) {
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static void X(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(wn6.h(i2, "csd-"), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    public static void Y(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + V(parcel, i2));
    }

    public static e9e Z(int i2, pda pda) {
        int t = hr1.t(i2);
        if (t == 0) {
            yn6 icon = pda.getIcon();
            cfe text = pda.getText();
            pda.b().a.getClass();
            return new e9e(icon.f, text.e, -16745729, true);
        } else if (t == 1) {
            yn6 icon2 = pda.getIcon();
            cfe text2 = pda.getText();
            return new e9e(icon2.i, text2.f, pda.b().a.g, true);
        } else if (t == 2) {
            return new e9e(pda.c().b.f, pda.c().c.h, pda.c().c.h, false);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final int a(int i2, int i3, int i4) {
        int i5 = i2 - (i2 % 16);
        int i6 = i5 / i3;
        if (i6 == 9) {
            return i5;
        }
        int i7 = i3 * 9;
        int i8 = i7 % 16;
        if (i8 == 0) {
            return i7;
        }
        int i9 = i7 - i8;
        int i10 = 9 - i6;
        int i11 = i4 - i9;
        return (i10 <= 0 || i11 <= 0) ? i9 : i9 + (Math.min(i10, i11 / 16) * 16);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a0(defpackage.ms9 r1, defpackage.of3 r2, defpackage.of3 r3, defpackage.j6 r4) {
        /*
            c97 r0 = new c97
            r0.<init>(r2, r3, r4)
            java.util.concurrent.LinkedBlockingQueue r2 = new java.util.concurrent.LinkedBlockingQueue
            r2.<init>()
            x63 r3 = new x63
            r4 = 1
            r3.<init>(r4, r2)
            r0.d(r3)
            r1.a(r3)
        L_0x0016:
            boolean r1 = r3.h()
            if (r1 == 0) goto L_0x001d
            goto L_0x0040
        L_0x001d:
            java.lang.Object r1 = r2.poll()
            if (r1 != 0) goto L_0x0030
            java.lang.Object r1 = r2.take()     // Catch:{ InterruptedException -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r1 = move-exception
            r3.f()
            r0.onError(r1)
            goto L_0x0040
        L_0x0030:
            boolean r4 = r3.h()
            if (r4 != 0) goto L_0x0040
            java.lang.Object r4 = defpackage.x63.c
            if (r1 == r4) goto L_0x0040
            boolean r1 = defpackage.ap9.b(r0, r1)
            if (r1 == 0) goto L_0x0016
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu7.a0(ms9, of3, of3, j6):void");
    }

    public static final boolean b(Object[] objArr, int i2, int i3, List list) {
        if (i3 != list.size()) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!hhd.f(objArr[i2 + i4], list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public static int b0(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final String c(Object[] objArr, int i2, int i3, Collection collection) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Collection collection2 = objArr[i2 + i4];
            if (collection2 == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(collection2);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void d(e4e e4e, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i2 = 0;
            while (i2 < length) {
                byte[] bArr = objArr[i2];
                i2++;
                if (bArr == null) {
                    e4e.W(i2);
                } else if (bArr instanceof byte[]) {
                    e4e.k(i2, bArr);
                } else if (bArr instanceof Float) {
                    e4e.h(i2, (double) ((Number) bArr).floatValue());
                } else if (bArr instanceof Double) {
                    e4e.h(i2, ((Number) bArr).doubleValue());
                } else if (bArr instanceof Long) {
                    e4e.j(i2, ((Number) bArr).longValue());
                } else if (bArr instanceof Integer) {
                    e4e.j(i2, (long) ((Number) bArr).intValue());
                } else if (bArr instanceof Short) {
                    e4e.j(i2, (long) ((Number) bArr).shortValue());
                } else if (bArr instanceof Byte) {
                    e4e.j(i2, (long) ((Number) bArr).byteValue());
                } else if (bArr instanceof String) {
                    e4e.f(i2, (String) bArr);
                } else if (bArr instanceof Boolean) {
                    e4e.j(i2, ((Boolean) bArr).booleanValue() ? 1 : 0);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + bArr + " at index " + i2 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
            }
        }
    }

    public static final void d0(bve bve) {
        bve.c(z24.class, new lq9(21));
        bve.e(r43.class, new ho7(28));
        Class<pf4> cls = pf4.class;
        bve.c(cls, new lq9(22));
        bve.e(pab.class, new ho7(29));
        bve.e(o5b.class, new n5b(0));
        bve.e(qb.class, new n5b(1));
        bve.e(p5b.class, new n5b(2));
        bve.c(cls, new lq9(23));
        bve.c(cls, new lq9(24));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: wg4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: wg4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: wg4} */
    /* JADX WARNING: type inference failed for: r5v0, types: [wg4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v37, types: [xg4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v28, types: [xg4, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ug4 e(defpackage.hhd r20) {
        /*
            r0 = r20
            int r1 = r20.C()
            int r2 = r20.B()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            wg4 r5 = new wg4
            r5.<init>()
            r6 = 0
            r5.a = r6
            r5.b = r1
            r5.c = r6
            r5.d = r2
            r4.add(r5)
            int r1 = r1 + r2
            r2 = 1
            int r1 = r1 + r2
            int r1 = r1 / 2
            int r1 = r1 * 2
            int r1 = r1 + r2
            int[] r5 = new int[r1]
            int r7 = r1 / 2
            int[] r1 = new int[r1]
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0038:
            boolean r9 = r4.isEmpty()
            if (r9 != 0) goto L_0x0271
            int r9 = r4.size()
            int r9 = r9 - r2
            java.lang.Object r9 = r4.remove(r9)
            wg4 r9 = (defpackage.wg4) r9
            int r10 = r9.b()
            if (r10 < r2) goto L_0x01cc
            int r10 = r9.a()
            if (r10 >= r2) goto L_0x0057
            goto L_0x01cc
        L_0x0057:
            int r10 = r9.b()
            int r12 = r9.a()
            int r12 = r12 + r10
            int r12 = r12 + r2
            int r12 = r12 / 2
            int r10 = r9.a
            int r13 = r2 + r7
            r5[r13] = r10
            int r10 = r9.b
            r1[r13] = r10
            r10 = r6
        L_0x006e:
            if (r10 >= r12) goto L_0x01cc
            int r13 = r9.b()
            int r14 = r9.a()
            int r13 = r13 - r14
            int r13 = java.lang.Math.abs(r13)
            int r13 = r13 % 2
            if (r13 != r2) goto L_0x0083
            r13 = r2
            goto L_0x0084
        L_0x0083:
            r13 = r6
        L_0x0084:
            int r14 = r9.b()
            int r15 = r9.a()
            int r14 = r14 - r15
            int r15 = -r10
            r11 = r15
        L_0x008f:
            if (r11 > r10) goto L_0x0118
            if (r11 == r15) goto L_0x00ae
            if (r11 == r10) goto L_0x00a4
            int r16 = r11 + 1
            int r16 = r16 + r7
            r2 = r5[r16]
            int r16 = r11 + -1
            int r16 = r16 + r7
            r6 = r5[r16]
            if (r2 <= r6) goto L_0x00a4
            goto L_0x00ae
        L_0x00a4:
            int r2 = r11 + -1
            int r2 = r2 + r7
            r2 = r5[r2]
            int r6 = r2 + 1
        L_0x00ab:
            r16 = r12
            goto L_0x00b5
        L_0x00ae:
            int r2 = r11 + 1
            int r2 = r2 + r7
            r2 = r5[r2]
            r6 = r2
            goto L_0x00ab
        L_0x00b5:
            int r12 = r9.c
            r17 = r4
            int r4 = r9.a
            int r4 = r6 - r4
            int r4 = r4 + r12
            int r4 = r4 - r11
            if (r10 == 0) goto L_0x00c7
            if (r6 == r2) goto L_0x00c4
            goto L_0x00c7
        L_0x00c4:
            int r12 = r4 + -1
            goto L_0x00c8
        L_0x00c7:
            r12 = r4
        L_0x00c8:
            r18 = r8
        L_0x00ca:
            int r8 = r9.b
            if (r6 >= r8) goto L_0x00dd
            int r8 = r9.d
            if (r4 >= r8) goto L_0x00dd
            boolean r8 = r0.g(r6, r4)
            if (r8 == 0) goto L_0x00dd
            int r6 = r6 + 1
            int r4 = r4 + 1
            goto L_0x00ca
        L_0x00dd:
            int r8 = r11 + r7
            r5[r8] = r6
            if (r13 == 0) goto L_0x0107
            int r8 = r14 - r11
            r19 = r13
            int r13 = r15 + 1
            if (r8 < r13) goto L_0x0105
            int r13 = r10 + -1
            if (r8 > r13) goto L_0x0105
            int r8 = r8 + r7
            r8 = r1[r8]
            if (r8 > r6) goto L_0x0105
            xg4 r8 = new xg4
            r8.<init>()
            r8.a = r2
            r8.b = r12
            r8.c = r6
            r8.d = r4
            r2 = 0
            r8.e = r2
            goto L_0x0120
        L_0x0105:
            r2 = 0
            goto L_0x010a
        L_0x0107:
            r19 = r13
            goto L_0x0105
        L_0x010a:
            int r11 = r11 + 2
            r6 = r2
            r12 = r16
            r4 = r17
            r8 = r18
            r13 = r19
            r2 = 1
            goto L_0x008f
        L_0x0118:
            r17 = r4
            r2 = r6
            r18 = r8
            r16 = r12
            r8 = 0
        L_0x0120:
            if (r8 == 0) goto L_0x0127
            r11 = r8
            r19 = r9
            goto L_0x01d3
        L_0x0127:
            int r4 = r9.b()
            int r6 = r9.a()
            int r4 = r4 - r6
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0136
            r4 = 1
            goto L_0x0137
        L_0x0136:
            r4 = r2
        L_0x0137:
            int r6 = r9.b()
            int r8 = r9.a()
            int r6 = r6 - r8
            r8 = r15
        L_0x0141:
            if (r8 > r10) goto L_0x01b7
            if (r8 == r15) goto L_0x015c
            if (r8 == r10) goto L_0x0154
            int r11 = r8 + 1
            int r11 = r11 + r7
            r11 = r1[r11]
            int r12 = r8 + -1
            int r12 = r12 + r7
            r12 = r1[r12]
            if (r11 >= r12) goto L_0x0154
            goto L_0x015c
        L_0x0154:
            int r11 = r8 + -1
            int r11 = r11 + r7
            r11 = r1[r11]
            int r12 = r11 + -1
            goto L_0x0162
        L_0x015c:
            int r11 = r8 + 1
            int r11 = r11 + r7
            r11 = r1[r11]
            r12 = r11
        L_0x0162:
            int r13 = r9.d
            int r14 = r9.b
            int r14 = r14 - r12
            int r14 = r14 - r8
            int r13 = r13 - r14
            if (r10 == 0) goto L_0x0171
            if (r12 == r11) goto L_0x016e
            goto L_0x0171
        L_0x016e:
            int r14 = r13 + 1
            goto L_0x0172
        L_0x0171:
            r14 = r13
        L_0x0172:
            int r2 = r9.a
            if (r12 <= r2) goto L_0x018d
            int r2 = r9.c
            if (r13 <= r2) goto L_0x018d
            int r2 = r12 + -1
            r19 = r9
            int r9 = r13 + -1
            boolean r2 = r0.g(r2, r9)
            if (r2 == 0) goto L_0x018f
            int r12 = r12 + -1
            int r13 = r13 + -1
            r9 = r19
            goto L_0x0172
        L_0x018d:
            r19 = r9
        L_0x018f:
            int r2 = r8 + r7
            r1[r2] = r12
            if (r4 == 0) goto L_0x01b1
            int r2 = r6 - r8
            if (r2 < r15) goto L_0x01b1
            if (r2 > r10) goto L_0x01b1
            int r2 = r2 + r7
            r2 = r5[r2]
            if (r2 < r12) goto L_0x01b1
            xg4 r2 = new xg4
            r2.<init>()
            r2.a = r12
            r2.b = r13
            r2.c = r11
            r2.d = r14
            r4 = 1
            r2.e = r4
            goto L_0x01ba
        L_0x01b1:
            int r8 = r8 + 2
            r9 = r19
            r2 = 0
            goto L_0x0141
        L_0x01b7:
            r19 = r9
            r2 = 0
        L_0x01ba:
            if (r2 == 0) goto L_0x01be
            r11 = r2
            goto L_0x01d3
        L_0x01be:
            int r10 = r10 + 1
            r12 = r16
            r4 = r17
            r8 = r18
            r9 = r19
            r2 = 1
            r6 = 0
            goto L_0x006e
        L_0x01cc:
            r17 = r4
            r18 = r8
            r19 = r9
            r11 = 0
        L_0x01d3:
            if (r11 == 0) goto L_0x0261
            int r2 = r11.a()
            if (r2 <= 0) goto L_0x0217
            int r2 = r11.d
            int r4 = r11.b
            int r2 = r2 - r4
            int r6 = r11.c
            int r8 = r11.a
            int r6 = r6 - r8
            if (r2 == r6) goto L_0x020f
            boolean r9 = r11.e
            if (r9 == 0) goto L_0x01f5
            tg4 r2 = new tg4
            int r6 = r11.a()
            r2.<init>(r8, r4, r6)
            goto L_0x0214
        L_0x01f5:
            if (r2 <= r6) goto L_0x0203
            tg4 r2 = new tg4
            int r4 = r4 + 1
            int r6 = r11.a()
            r2.<init>(r8, r4, r6)
            goto L_0x0214
        L_0x0203:
            tg4 r2 = new tg4
            int r8 = r8 + 1
            int r6 = r11.a()
            r2.<init>(r8, r4, r6)
            goto L_0x0214
        L_0x020f:
            tg4 r2 = new tg4
            r2.<init>(r8, r4, r6)
        L_0x0214:
            r3.add(r2)
        L_0x0217:
            boolean r2 = r18.isEmpty()
            if (r2 == 0) goto L_0x0228
            wg4 r2 = new wg4
            r2.<init>()
            r6 = r18
            r9 = r19
            r4 = 1
            goto L_0x0238
        L_0x0228:
            int r2 = r18.size()
            r4 = 1
            int r2 = r2 - r4
            r6 = r18
            java.lang.Object r2 = r6.remove(r2)
            wg4 r2 = (defpackage.wg4) r2
            r9 = r19
        L_0x0238:
            int r8 = r9.a
            r2.a = r8
            int r8 = r9.c
            r2.c = r8
            int r8 = r11.a
            r2.b = r8
            int r8 = r11.b
            r2.d = r8
            r8 = r17
            r8.add(r2)
            int r2 = r9.b
            r9.b = r2
            int r2 = r9.d
            r9.d = r2
            int r2 = r11.c
            r9.a = r2
            int r2 = r11.d
            r9.c = r2
            r8.add(r9)
            goto L_0x026b
        L_0x0261:
            r8 = r17
            r6 = r18
            r9 = r19
            r4 = 1
            r6.add(r9)
        L_0x026b:
            r2 = r4
            r4 = r8
            r8 = r6
            r6 = 0
            goto L_0x0038
        L_0x0271:
            zo4 r2 = c
            java.util.Collections.sort(r3, r2)
            ug4 r2 = new ug4
            r2.<init>((defpackage.hhd) r0, (java.util.ArrayList) r3, (int[]) r5, (int[]) r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu7.e(hhd):ug4");
    }

    public static int e0(Parcel parcel) {
        int readInt = parcel.readInt();
        int V = V(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 == 20293) {
            int i2 = V + dataPosition;
            if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
                return i2;
            }
            throw new SafeParcelReader$ParseException(parcel, me4.g("Size read is invalid start=", dataPosition, i2, " end="));
        }
        throw new SafeParcelReader$ParseException(parcel, "Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))));
    }

    public static void f(int i2) {
        if (2 > i2 || i2 >= 37) {
            StringBuilder m2 = me4.m(i2, "radix ", " was not in valid range ");
            m2.append(new dz6(2, 36, 1));
            throw new IllegalArgumentException(m2.toString());
        }
    }

    public static void f0(Parcel parcel, int i2) {
        if (i2 != 4) {
            String hexString = Integer.toHexString(i2);
            throw new SafeParcelReader$ParseException(parcel, "Expected size 4 got " + i2 + " (0x" + hexString + ")");
        }
    }

    public static void g0(Parcel parcel, int i2, int i3) {
        int V = V(parcel, i2);
        if (V != i3) {
            throw new SafeParcelReader$ParseException(parcel, wn6.l(rf0.i("Expected size ", i3, " got ", V, " (0x"), Integer.toHexString(V), ")"));
        }
    }

    public static d10 i(RectF rectF) {
        if (rectF == null) {
            return null;
        }
        return new d10(rectF.left, rectF.top, rectF.right, rectF.bottom, 2);
    }

    public static Bundle j(Parcel parcel, int i2) {
        int V = V(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + V);
        return readBundle;
    }

    public static xu5 k(MediaFormat mediaFormat) {
        float f2;
        byte[] bArr;
        uu5 uu5 = new uu5();
        uu5.m = c49.l(mediaFormat.getString("mime"));
        uu5.d = mediaFormat.getString("language");
        uu5.h = w(mediaFormat, "max-bitrate", -1);
        uu5.g = w(mediaFormat, "bitrate", -1);
        uu5.i = mediaFormat.getString("codecs-string");
        if (mediaFormat.containsKey("frame-rate")) {
            try {
                f2 = mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                f2 = (float) mediaFormat.getInteger("frame-rate");
            }
        } else {
            f2 = -1.0f;
        }
        uu5.u = f2;
        uu5.s = w(mediaFormat, "width", -1);
        uu5.t = w(mediaFormat, "height", -1);
        uu5.w = (!mediaFormat.containsKey("sar-width") || !mediaFormat.containsKey("sar-height")) ? 1.0f : ((float) mediaFormat.getInteger("sar-width")) / ((float) mediaFormat.getInteger("sar-height"));
        uu5.n = w(mediaFormat, "max-input-size", -1);
        int i2 = 0;
        uu5.v = w(mediaFormat, "rotation-degrees", 0);
        z23 z23 = null;
        if (oze.a >= 24) {
            int w = w(mediaFormat, "color-standard", -1);
            int w2 = w(mediaFormat, "color-range", -1);
            int w3 = w(mediaFormat, "color-transfer", -1);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            if (byteBuffer != null) {
                byte[] bArr2 = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr2);
                bArr = bArr2;
            } else {
                bArr = null;
            }
            if (!(w == -1 && w2 == -1 && w3 == -1 && bArr == null)) {
                z23 = new z23(w, w2, w3, -1, -1, bArr);
            }
        }
        uu5.z = z23;
        uu5.B = w(mediaFormat, "sample-rate", -1);
        uu5.A = w(mediaFormat, "channel-count", -1);
        uu5.C = w(mediaFormat, "pcm-encoding", -1);
        ete.l(4, "initialCapacity");
        int i3 = 0;
        Object[] objArr = new Object[4];
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-" + i2);
            if (byteBuffer2 == null) {
                uu5.p = ws6.h(i3, objArr);
                return new xu5(uu5);
            }
            byte[] bArr3 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr3);
            byteBuffer2.rewind();
            int i4 = i3 + 1;
            Object[] copyOf = objArr.length < i4 ? Arrays.copyOf(objArr, ms6.h(objArr.length, i4)) : objArr;
            copyOf[i3] = bArr3;
            i2++;
            i3 = i4;
            objArr = copyOf;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r4 != 22) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.media.MediaFormat l(defpackage.xu5 r8) {
        /*
            android.media.MediaFormat r0 = new android.media.MediaFormat
            r0.<init>()
            int r1 = r8.i
            java.lang.String r2 = "bitrate"
            I(r0, r2, r1)
            java.lang.String r1 = "max-bitrate"
            int r2 = r8.h
            I(r0, r1, r2)
            java.lang.String r1 = "channel-count"
            int r2 = r8.B
            I(r0, r1, r2)
            z23 r1 = r8.A
            H(r0, r1)
            java.lang.String r1 = r8.n
            if (r1 == 0) goto L_0x0028
            java.lang.String r2 = "mime"
            r0.setString(r2, r1)
        L_0x0028:
            java.lang.String r1 = r8.j
            if (r1 == 0) goto L_0x0031
            java.lang.String r2 = "codecs-string"
            r0.setString(r2, r1)
        L_0x0031:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r8.v
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x003e
            java.lang.String r1 = "frame-rate"
            r0.setFloat(r1, r2)
        L_0x003e:
            java.lang.String r1 = "width"
            int r2 = r8.t
            I(r0, r1, r2)
            java.lang.String r1 = "height"
            int r2 = r8.u
            I(r0, r1, r2)
            java.util.List r1 = r8.q
            X(r0, r1)
            r1 = 0
            r2 = -1
            r3 = 2
            int r4 = r8.D
            if (r4 != r2) goto L_0x0059
            goto L_0x0079
        L_0x0059:
            java.lang.String r2 = "exo-pcm-encoding-int"
            I(r0, r2, r4)
            if (r4 == 0) goto L_0x0073
            if (r4 == r3) goto L_0x0071
            r2 = 3
            if (r4 == r2) goto L_0x0074
            r2 = 4
            if (r4 == r2) goto L_0x0074
            r2 = 21
            if (r4 == r2) goto L_0x0074
            r2 = 22
            if (r4 == r2) goto L_0x0074
            goto L_0x0079
        L_0x0071:
            r2 = r3
            goto L_0x0074
        L_0x0073:
            r2 = r1
        L_0x0074:
            java.lang.String r4 = "pcm-encoding"
            r0.setInteger(r4, r2)
        L_0x0079:
            java.lang.String r2 = r8.d
            if (r2 == 0) goto L_0x0082
            java.lang.String r4 = "language"
            r0.setString(r4, r2)
        L_0x0082:
            java.lang.String r2 = "max-input-size"
            int r4 = r8.o
            I(r0, r2, r4)
            java.lang.String r2 = "sample-rate"
            int r4 = r8.C
            I(r0, r2, r4)
            java.lang.String r2 = "caption-service-number"
            int r4 = r8.G
            I(r0, r2, r4)
            java.lang.String r2 = "rotation-degrees"
            int r4 = r8.w
            r0.setInteger(r2, r4)
            int r2 = r8.e
            r4 = r2 & 4
            r5 = 1
            if (r4 == 0) goto L_0x00a7
            r4 = r5
            goto L_0x00a8
        L_0x00a7:
            r4 = r1
        L_0x00a8:
            java.lang.String r6 = "is-autoselect"
            r0.setInteger(r6, r4)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x00b3
            r4 = r5
            goto L_0x00b4
        L_0x00b3:
            r4 = r1
        L_0x00b4:
            java.lang.String r6 = "is-default"
            r0.setInteger(r6, r4)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x00bd
            r1 = r5
        L_0x00bd:
            java.lang.String r2 = "is-forced-subtitle"
            r0.setInteger(r2, r1)
            java.lang.String r1 = "encoder-delay"
            int r2 = r8.E
            r0.setInteger(r1, r2)
            java.lang.String r1 = "encoder-padding"
            int r2 = r8.F
            r0.setInteger(r1, r2)
            java.lang.String r1 = "exo-pixel-width-height-ratio-float"
            float r8 = r8.x
            r0.setFloat(r1, r8)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 >= 0) goto L_0x00e3
            float r1 = (float) r3
            float r8 = r8 * r1
            int r5 = (int) r8
            goto L_0x00ef
        L_0x00e3:
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ee
            float r1 = (float) r3
            float r1 = r1 / r8
            int r5 = (int) r1
            r7 = r5
            r5 = r3
            r3 = r7
            goto L_0x00ef
        L_0x00ee:
            r3 = r5
        L_0x00ef:
            java.lang.String r8 = "sar-width"
            r0.setInteger(r8, r5)
            java.lang.String r8 = "sar-height"
            r0.setInteger(r8, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu7.l(xu5):android.media.MediaFormat");
    }

    public static Parcelable m(Parcel parcel, int i2, Parcelable.Creator creator) {
        int V = V(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + V);
        return parcelable;
    }

    public static String n(Parcel parcel, int i2) {
        int V = V(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + V);
        return readString;
    }

    public static Object[] o(Parcel parcel, int i2, Parcelable.Creator creator) {
        int V = V(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + V);
        return createTypedArray;
    }

    public static ArrayList p(Parcel parcel, int i2, Parcelable.Creator creator) {
        int V = V(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + V);
        return createTypedArrayList;
    }

    public static Object q(hd4 hd4, long j2, Continuation continuation) {
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        jue jue = jue.a;
        if (i2 <= 0) {
            return jue;
        }
        zv1 zv1 = new zv1(1, urd.y(continuation));
        zv1.n();
        hd4.scheduleResumeAfterDelay(j2, zv1);
        Object m2 = zv1.m();
        return m2 == pu3.a ? m2 : jue;
    }

    public static void r(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new SafeParcelReader$ParseException(parcel, wn6.h(i2, "Overread allowed size end="));
        }
    }

    public static final boolean s(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final coe t(String str) {
        lg7 lg7 = q;
        if (lg7 == null) {
            lg7 c2 = hwf.c();
            try {
                for (Object add : Arrays.asList(new coe[]{new pne()})) {
                    c2.add(add);
                }
                q = c2;
                lg7 = hwf.a(c2);
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
        if (lg7.getSize() > 1) {
            throw new IllegalStateException("More then one manifest found: ".concat(o23.c0(lg7, (String) null, (String) null, (String) null, x51.C0, 31)).toString());
        } else if (lg7.getSize() != 1) {
            return null;
        } else {
            coe coe = (coe) lg7.get(0);
            if (hhd.f(coe.a(), str)) {
                return coe;
            }
            throw new IllegalStateException(("Unexpected " + coe.getClass().getName() + ".applicationId()").toString());
        }
    }

    public static final w67 u(syc syc) {
        if (syc instanceof tyc) {
            return u(((tyc) syc).a);
        }
        return null;
    }

    public static int v(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!((i2 & -2097152) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = e[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? f[i5 - 1] : g[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? h[i5 - 1] : i[i5 - 1] : j[i5 - 1];
        int i10 = 144;
        if (i3 == 3) {
            return ((i9 * 144) / i7) + i8;
        }
        if (i4 == 1) {
            i10 = 72;
        }
        return ((i10 * i9) / i7) + i8;
    }

    public static int w(MediaFormat mediaFormat, String str, int i2) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i2;
    }

    public static final l77 x() {
        d0e d0e = d0e.a;
        d0e d0e2 = d0e.a;
        return new xr9();
    }

    public static final int z(n13 n13, int i2) {
        int c2 = n13.c();
        n13.u(i2);
        int i3 = 1;
        while (n13.s() == i2) {
            n13.u(i2);
            i3++;
        }
        n13.t(c2);
        return i3;
    }

    public int B(View view) {
        return 0;
    }

    public int C(View view) {
        return 0;
    }

    public void J(View view, int i2) {
    }

    public void K(int i2) {
    }

    public abstract void L(View view, int i2, int i3);

    public abstract void M(View view, float f2, float f3);

    public abstract boolean c0(View view, int i2);

    public int g(View view, int i2) {
        return 0;
    }

    public int h(View view, int i2) {
        return 0;
    }

    public int y(int i2) {
        return i2;
    }
}
