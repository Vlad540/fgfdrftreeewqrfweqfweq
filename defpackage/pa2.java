package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ClipData;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpStatus;

/* renamed from: pa2  reason: default package */
public abstract class pa2 {
    public static final Object a = new Object();
    public static final am6 b = new am6(HttpStatus.SC_NOT_FOUND, "SC_NOT_FOUND");
    public static final am6 c = new am6(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE, "SC_REQUESTED_RANGE_NOT_SATISFIABLE");
    public static final am6 d = new am6(500, "SC_INTERNAL_SERVER_ERROR");
    public static final am6 e = new am6(HttpStatus.SC_BAD_REQUEST, "SC_BAD_REQUEST");
    public static final am6 f = new am6(HttpStatus.SC_PRECONDITION_FAILED, "SC_PRECONDITION_FAILED");
    public static final am6 g = new am6(HttpStatus.SC_FORBIDDEN, "SC_FORBIDDEN");
    public static final am6 h = new am6(HttpStatus.SC_CONFLICT, "SC_CONFLICT");
    public static final am6 i = new am6(HttpStatus.SC_REQUEST_TOO_LONG, "SC_REQUEST_ENTITY_TOO_LARGE");
    public static final am6 j = new am6(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, "SC_UNSUPPORTED_MEDIA_TYPE");
    public static final am6 k = new am6(HttpStatus.SC_NOT_ACCEPTABLE, "SC_NOT_ACCEPTABLE");
    public static final am6 l = new am6(-1, "UNKNOWN_ERROR");
    public static final am6 m = new am6(-100, "FILE_NOT_FOUND");
    public static final am6 n = new am6(-101, "FILE_ZERO_LENGTH");
    public static final int[] o = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static Constructor p;
    public static Method q;
    public static Method r;

    public static vd6 A() {
        if (at7.b != null) {
            return at7.b;
        }
        synchronized (at7.class) {
            try {
                if (at7.b == null) {
                    at7.b = new vd6(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return at7.b;
    }

    public static void B(Intent intent, ArrayList arrayList) {
        ClipData clipData = new ClipData((CharSequence) null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), (Intent) null, (Uri) arrayList.get(0)));
        int size = arrayList.size();
        for (int i2 = 1; i2 < size; i2++) {
            clipData.addItem(new ClipData.Item((Uri) arrayList.get(i2)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }

    public static final void C(ViewGroup viewGroup, View view, View view2, View view3, float f2) {
        if (view2 != null) {
            view2.setTranslationX(((float) viewGroup.getMeasuredWidth()) * f2);
        }
        if (view3 != null) {
            view3.setAlpha(1.0f - f2);
        }
        if (view != null) {
            view.setScaleX((f2 * 0.05f) + 0.95f);
        }
        if (view != null) {
            view.setScaleY((f2 * 0.05f) + 0.95f);
        }
        if (view != null) {
            view.setPivotX(0.0f);
        }
        if (view != null) {
            view.setPivotY(0.0f);
        }
    }

    public static float D(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return kr4.c(edgeEffect, f2, f3);
        }
        jr4.a(edgeEffect, f2, f3);
        return f2;
    }

    public static final void E(ViewGroup viewGroup, View view, View view2, View view3, float f2) {
        if (view2 != null) {
            view2.setTranslationY(((float) viewGroup.getContext().getResources().getDisplayMetrics().heightPixels) * f2);
        }
        if (view3 != null) {
            view3.setAlpha(1.0f - Math.abs(f2));
        }
        float abs = Math.abs(f2) * ((float) 3);
        if (abs > 1.0f) {
            abs = 1.0f;
        }
        if (view != null) {
            view.setPivotX(((float) view.getWidth()) / 2.0f);
        }
        if (view != null) {
            view.setPivotY(((float) view.getHeight()) / 2.0f);
        }
        if (view != null) {
            view.setScaleX(((((float) 1) - abs) * 0.1f) + 1.0f);
        }
        if (view != null) {
            view.setScaleY(((((float) 1) - abs) * 0.1f) + 1.0f);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|(2:23|24)|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r5 != null) goto L_0x003e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void F(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = a
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x0014
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch:{ all -> 0x0012 }
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x0012:
            r5 = move-exception
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch:{ FileNotFoundException -> 0x004e }
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch:{ all -> 0x0012 }
            r2 = 0
            r1.setOutput(r5, r2)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            r1.startDocument(r3, r4)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            r1.endDocument()     // Catch:{ Exception -> 0x0049, all -> 0x0042 }
            if (r5 == 0) goto L_0x004c
        L_0x003e:
            r5.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x004c
        L_0x0042:
            r6 = move-exception
            if (r5 == 0) goto L_0x0048
            r5.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            throw r6     // Catch:{ all -> 0x0012 }
        L_0x0049:
            if (r5 == 0) goto L_0x004c
            goto L_0x003e
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa2.F(android.content.Context, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r2 != null) goto L_0x0046;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String G(android.content.Context r8) {
        /*
            java.lang.Object r0 = a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch:{ FileNotFoundException -> 0x0063 }
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            int r4 = r3.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
        L_0x0018:
            int r5 = r3.next()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            r6 = 1
            if (r5 == r6) goto L_0x0044
            r6 = 3
            if (r5 != r6) goto L_0x002b
            int r7 = r3.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            if (r7 <= r4) goto L_0x0044
            goto L_0x002b
        L_0x0029:
            r8 = move-exception
            goto L_0x004c
        L_0x002b:
            if (r5 == r6) goto L_0x0018
            r6 = 4
            if (r5 != r6) goto L_0x0031
            goto L_0x0018
        L_0x0031:
            java.lang.String r5 = r3.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
            if (r5 == 0) goto L_0x0018
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch:{ IOException | XmlPullParserException -> 0x0052, all -> 0x0029 }
        L_0x0044:
            if (r2 == 0) goto L_0x0055
        L_0x0046:
            r2.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0055
        L_0x004a:
            r8 = move-exception
            goto L_0x0065
        L_0x004c:
            if (r2 == 0) goto L_0x0051
            r2.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            throw r8     // Catch:{ all -> 0x004a }
        L_0x0052:
            if (r2 == 0) goto L_0x0055
            goto L_0x0046
        L_0x0055:
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch:{ all -> 0x004a }
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x0063:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x0065:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa2.G(android.content.Context):java.lang.String");
    }

    public static String H(int i2, int i3, StringBuilder sb) {
        int i4;
        int i5;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i6 = i2;
        int i7 = i6;
        while (i6 <= i3) {
            if (i6 == i3) {
                i4 = i6;
            } else if (sb.charAt(i6) == '/') {
                i4 = i6 + 1;
            } else {
                i6++;
            }
            int i8 = i7 + 1;
            if (i6 == i8 && sb.charAt(i7) == '.') {
                sb.delete(i7, i4);
                i3 -= i4 - i7;
            } else {
                if (i6 == i7 + 2 && sb.charAt(i7) == '.' && sb.charAt(i8) == '.') {
                    i5 = sb.lastIndexOf("/", i7 - 2) + 1;
                    int i9 = i5 > i2 ? i5 : i2;
                    sb.delete(i9, i4);
                    i3 -= i4 - i9;
                } else {
                    i5 = i6 + 1;
                }
                i7 = i5;
            }
            i6 = i7;
        }
        return sb.toString();
    }

    public static String I(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] q2 = q(str2);
        if (q2[0] != -1) {
            sb.append(str2);
            H(q2[1], q2[2], sb);
            return sb.toString();
        }
        int[] q3 = q(str);
        if (q2[3] == 0) {
            sb.append(str, 0, q3[3]);
            sb.append(str2);
            return sb.toString();
        } else if (q2[2] == 0) {
            sb.append(str, 0, q3[2]);
            sb.append(str2);
            return sb.toString();
        } else {
            int i2 = q2[1];
            if (i2 != 0) {
                int i3 = q3[0] + 1;
                sb.append(str, 0, i3);
                sb.append(str2);
                return H(q2[1] + i3, i3 + q2[2], sb);
            } else if (str2.charAt(i2) == '/') {
                sb.append(str, 0, q3[1]);
                sb.append(str2);
                int i4 = q3[1];
                return H(i4, q2[2] + i4, sb);
            } else {
                int i5 = q3[0] + 2;
                int i6 = q3[1];
                if (i5 >= i6 || i6 != q3[2]) {
                    int lastIndexOf = str.lastIndexOf(47, q3[2] - 1);
                    int i7 = lastIndexOf == -1 ? q3[1] : lastIndexOf + 1;
                    sb.append(str, 0, i7);
                    sb.append(str2);
                    return H(q3[1], i7 + q2[2], sb);
                }
                sb.append(str, 0, i6);
                sb.append('/');
                sb.append(str2);
                int i8 = q3[1];
                return H(i8, q2[2] + i8 + 1, sb);
            }
        }
    }

    public static Uri J(String str, String str2) {
        return Uri.parse(I(str, str2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e5, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fc, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean K(f75 r21, boolean r22, boolean r23) {
        /*
            r0 = r21
            long r1 = r21.x()
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 4096(0x1000, double:2.0237E-320)
            if (r5 == 0) goto L_0x0014
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r6 = r1
        L_0x0014:
            int r6 = (int) r6
            yze r7 = new yze
            r8 = 64
            r7.<init>(r8)
            r8 = 0
            r9 = r8
            r10 = r9
        L_0x001f:
            r11 = 1
            if (r9 >= r6) goto L_0x002f
            r12 = 8
            r7.E(r12)
            byte[] r13 = r7.a
            boolean r13 = r0.r(r13, r8, r12, r11)
            if (r13 != 0) goto L_0x0033
        L_0x002f:
            r5 = r8
            r8 = r11
            goto L_0x00fe
        L_0x0033:
            long r13 = r7.w()
            int r15 = r7.h()
            r16 = 1
            int r16 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r16 != 0) goto L_0x0053
            byte[] r13 = r7.a
            r0.m(r12, r13, r12)
            r13 = 16
            r7.G(r13)
            long r16 = r7.p()
            r3 = r13
            r13 = r16
            goto L_0x006b
        L_0x0053:
            r16 = 0
            int r16 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r16 != 0) goto L_0x006a
            long r16 = r21.x()
            int r18 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r18 == 0) goto L_0x006a
            long r13 = r21.s()
            long r16 = r16 - r13
            long r13 = (long) r12
            long r13 = r16 + r13
        L_0x006a:
            r3 = r12
        L_0x006b:
            long r11 = (long) r3
            int r19 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r19 >= 0) goto L_0x0071
            return r8
        L_0x0071:
            int r9 = r9 + r3
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r15 != r3) goto L_0x0084
            int r3 = (int) r13
            int r6 = r6 + r3
            if (r5 == 0) goto L_0x0081
            long r3 = (long) r6
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0081
            int r6 = (int) r1
        L_0x0081:
            r3 = -1
            goto L_0x001f
        L_0x0084:
            r3 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r15 == r3) goto L_0x008e
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r15 != r3) goto L_0x0092
        L_0x008e:
            r5 = r8
            r8 = 1
            goto L_0x00fc
        L_0x0092:
            r3 = r5
            long r4 = (long) r9
            long r4 = r4 + r13
            long r4 = r4 - r11
            r20 = r9
            long r8 = (long) r6
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x00a1
            r5 = 0
            r8 = 1
            goto L_0x00fe
        L_0x00a1:
            long r13 = r13 - r11
            int r4 = (int) r13
            int r9 = r20 + r4
            r5 = 1718909296(0x66747970, float:2.8862439E23)
            if (r15 != r5) goto L_0x00f3
            r5 = 8
            if (r4 >= r5) goto L_0x00b0
            r5 = 0
            return r5
        L_0x00b0:
            r5 = 0
            r7.E(r4)
            byte[] r8 = r7.a
            r0.m(r5, r8, r4)
            int r4 = r4 / 4
            r5 = 0
        L_0x00bc:
            if (r5 >= r4) goto L_0x00ed
            r8 = 1
            if (r5 != r8) goto L_0x00c6
            r11 = 4
            r7.I(r11)
            goto L_0x00ea
        L_0x00c6:
            int r11 = r7.h()
            int r12 = r11 >>> 8
            r13 = 3368816(0x336770, float:4.720717E-39)
            if (r12 != r13) goto L_0x00d2
            goto L_0x00e5
        L_0x00d2:
            r12 = 1751476579(0x68656963, float:4.333464E24)
            if (r11 != r12) goto L_0x00da
            if (r23 == 0) goto L_0x00da
            goto L_0x00e5
        L_0x00da:
            int[] r12 = o
            r13 = 0
        L_0x00dd:
            r14 = 29
            if (r13 >= r14) goto L_0x00ea
            r14 = r12[r13]
            if (r14 != r11) goto L_0x00e7
        L_0x00e5:
            r10 = r8
            goto L_0x00ed
        L_0x00e7:
            int r13 = r13 + 1
            goto L_0x00dd
        L_0x00ea:
            int r5 = r5 + 1
            goto L_0x00bc
        L_0x00ed:
            if (r10 != 0) goto L_0x00f1
            r5 = 0
            return r5
        L_0x00f1:
            r5 = 0
            goto L_0x00f9
        L_0x00f3:
            r5 = 0
            if (r4 == 0) goto L_0x00f9
            r0.t(r4)
        L_0x00f9:
            r8 = r5
            r5 = r3
            goto L_0x0081
        L_0x00fc:
            r0 = r8
            goto L_0x00ff
        L_0x00fe:
            r0 = r5
        L_0x00ff:
            if (r10 == 0) goto L_0x0106
            r1 = r22
            if (r1 != r0) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r8 = r5
        L_0x0107:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa2.K(f75, boolean, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [kcc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void L(android.text.Spannable r4, defpackage.qt3 r5, int r6, int r7) {
        /*
            r0 = 0
            if (r6 >= 0) goto L_0x0004
            r6 = r0
        L_0x0004:
            int r1 = r4.length()
            if (r6 < r1) goto L_0x000b
            goto L_0x004a
        L_0x000b:
            int r1 = r4.length()
            if (r7 <= r1) goto L_0x0012
            r7 = r1
        L_0x0012:
            java.lang.Class r1 = r5.getClass()     // Catch:{ all -> 0x001d }
            java.lang.Object[] r1 = r4.getSpans(r6, r7, r1)     // Catch:{ all -> 0x001d }
            qt3[] r1 = (defpackage.qt3[]) r1     // Catch:{ all -> 0x001d }
            goto L_0x0024
        L_0x001d:
            r1 = move-exception
            kcc r2 = new kcc
            r2.<init>(r1)
            r1 = r2
        L_0x0024:
            boolean r2 = r1 instanceof kcc
            if (r2 == 0) goto L_0x0029
            r1 = 0
        L_0x0029:
            qt3[] r1 = (defpackage.qt3[]) r1
            if (r1 == 0) goto L_0x003c
            int r2 = r1.length
            if (r2 != 0) goto L_0x0031
            goto L_0x003c
        L_0x0031:
            int r2 = r1.length
        L_0x0032:
            if (r0 >= r2) goto L_0x003c
            r3 = r1[r0]
            mt0.B(r4, r3, r6, r7)
            int r0 = r0 + 1
            goto L_0x0032
        L_0x003c:
            r0 = 33
            r4.setSpan(r5, r6, r7, r0)     // Catch:{ all -> 0x0042 }
            goto L_0x004a
        L_0x0042:
            r4 = move-exception
            java.lang.String r5 = "Markdown"
            java.lang.String r6 = "error while try to set span"
            udd.s(r5, r6, r4)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa2.L(android.text.Spannable, qt3, int, int):void");
    }

    public static final void M(bve bve) {
        bve.e(c4f.class, new vz9(15));
        bve.e(yya.class, new vz9(16));
        bve.e(eid.class, new vz9(17));
        bve.e(g35.class, new vz9(18));
        bve.e(av0.class, new vz9(19));
        bve.e(x2f.class, new vz9(20));
        bve.e(okc.class, new ho7(27));
        bve.e(gza.class, new vz9(21));
    }

    public static final void N(bve bve) {
        bve.c(z24.class, new w8d(9));
    }

    public static final void a(Appendable appendable, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            appendable.append("\t");
        }
    }

    public static final void b(Throwable th, Appendable appendable) {
        c(th, appendable, 0, "", th.getStackTrace(), 0, new IdentityHashMap());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b A[LOOP:1: B:16:0x0059->B:17:0x005b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8 A[LOOP:2: B:24:0x00a6->B:25:0x00a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.Throwable r8, java.lang.Appendable r9, int r10, java.lang.String r11, java.lang.StackTraceElement[] r12, int r13, java.util.IdentityHashMap r14) {
        /*
            boolean r0 = r14.containsKey(r8)
            r1 = 10
            r2 = 1
            if (r0 == 0) goto L_0x0024
            a(r9, r2)
            java.lang.String r10 = "[CIRCULAR REFERENCE: "
            java.lang.Appendable r9 = r9.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.Appendable r8 = r9.append(r8)
            java.lang.String r9 = "]"
            java.lang.Appendable r8 = r8.append(r9)
            r8.append(r1)
            return
        L_0x0024:
            jue r0 = jue.a
            r14.put(r8, r0)
            a(r9, r10)
            java.lang.Appendable r11 = r9.append(r11)
            java.lang.String r0 = r8.toString()
            java.lang.Appendable r11 = r11.append(r0)
            r11.append(r1)
            boolean r11 = r8 instanceof java.lang.StackOverflowError
            r0 = 0
            if (r11 == 0) goto L_0x0051
            r11 = r12[r0]
            int r3 = r12.length
        L_0x0043:
            if (r2 >= r3) goto L_0x0051
            r4 = r12[r2]
            boolean r4 = hhd.f(r11, r4)
            if (r4 == 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            int r2 = r2 + 1
            goto L_0x0043
        L_0x0051:
            r2 = r0
        L_0x0052:
            if (r2 <= 0) goto L_0x0056
            r11 = r2
            goto L_0x0058
        L_0x0056:
            int r11 = r12.length
            int r11 = r11 - r13
        L_0x0058:
            r3 = r0
        L_0x0059:
            if (r3 >= r11) goto L_0x0066
            r4 = r12[r3]
            int r5 = r10 + 1
            r6 = 4
            d(r4, r9, r5, r6)
            int r3 = r3 + 1
            goto L_0x0059
        L_0x0066:
            java.lang.String r11 = "... "
            if (r2 <= 0) goto L_0x0085
            int r13 = r10 + 1
            a(r9, r13)
            java.lang.Appendable r11 = r9.append(r11)
            java.lang.String r13 = java.lang.String.valueOf(r2)
            java.lang.Appendable r11 = r11.append(r13)
            java.lang.String r13 = " calls repeat"
            java.lang.Appendable r11 = r11.append(r13)
            r11.append(r1)
            goto L_0x00a1
        L_0x0085:
            if (r13 == 0) goto L_0x00a1
            int r2 = r10 + 1
            a(r9, r2)
            java.lang.Appendable r11 = r9.append(r11)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.Appendable r11 = r11.append(r13)
            java.lang.String r13 = " more"
            java.lang.Appendable r11 = r11.append(r13)
            r11.append(r1)
        L_0x00a1:
            java.lang.Throwable[] r11 = r8.getSuppressed()
            int r13 = r11.length
        L_0x00a6:
            if (r0 >= r13) goto L_0x00be
            r1 = r11[r0]
            java.lang.StackTraceElement[] r5 = r1.getStackTrace()
            int r3 = r10 + 1
            int r6 = n(r12, r5)
            java.lang.String r4 = "Suppressed: "
            r2 = r9
            r7 = r14
            c(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r0 + 1
            goto L_0x00a6
        L_0x00be:
            java.lang.Throwable r1 = r8.getCause()
            if (r1 == 0) goto L_0x00d4
            java.lang.StackTraceElement[] r5 = r1.getStackTrace()
            int r6 = n(r12, r5)
            java.lang.String r4 = "Caused by: "
            r2 = r9
            r3 = r10
            r7 = r14
            c(r1, r2, r3, r4, r5, r6, r7)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa2.c(java.lang.Throwable, java.lang.Appendable, int, java.lang.String, java.lang.StackTraceElement[], int, java.util.IdentityHashMap):void");
    }

    public static void d(StackTraceElement stackTraceElement, Appendable appendable, int i2, int i3) {
        String str;
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        a(appendable, i2);
        appendable.append("at ");
        if (stackTraceElement.isNativeMethod()) {
            str = "Native Method";
        } else {
            str = stackTraceElement.getFileName();
            if (str == null) {
                str = "Unknown Source";
            }
        }
        appendable.append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(str);
        if (stackTraceElement.getLineNumber() >= 0) {
            appendable.append(":").append(String.valueOf(stackTraceElement.getLineNumber()));
        }
        appendable.append(")").append(10);
    }

    public static yz3 f(kac kac, String str, nxb nxb, int i2) {
        wz3 wz3 = new wz3(1);
        wz3.b = J(str, nxb.c);
        wz3.g = nxb.a;
        wz3.h = nxb.b;
        String a2 = kac.a();
        if (a2 == null) {
            a2 = nxb.b(((hj0) kac.b.get(0)).a).toString();
        }
        wz3.e(a2);
        wz3.c(i2);
        wz3.d();
        return wz3.b();
    }

    public static uaf h(Class cls) {
        try {
            return (uaf) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00da, code lost:
        if (r7 == 1) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dc, code lost:
        if (r7 == 2) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00de, code lost:
        if (r7 == 3) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e0, code lost:
        if (r7 == 4) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e3, code lost:
        r15 = r9 + 1;
        r3[r9] = (byte) (r8 >> 10);
        r9 = r9 + 2;
        r3[r15] = (byte) (r8 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f2, code lost:
        r3[r9] = (byte) (r8 >> 4);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fa, code lost:
        if (r9 != r1) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fd, code lost:
        r15 = new byte[r9];
        java.lang.System.arraycopy(r3, 0, r15, 0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00da A[EDGE_INSN: B:55:0x00da->B:40:0x00da ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] i(java.lang.String r15) {
        /*
            byte[] r15 = r15.getBytes()
            int r0 = r15.length
            int r1 = r0 * 3
            r2 = 4
            int r1 = r1 / r2
            byte[] r3 = new byte[r1]
            int[] r4 = defpackage.kg0.j
            r5 = 0
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0012:
            r10 = 3
            r11 = 2
            r12 = 1
            if (r6 >= r0) goto L_0x00da
            if (r7 != 0) goto L_0x005f
        L_0x0019:
            int r13 = r6 + 4
            if (r13 > r0) goto L_0x005b
            byte r8 = r15[r6]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r4[r8]
            int r8 = r8 << 18
            int r14 = r6 + 1
            byte r14 = r15[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r4[r14]
            int r14 = r14 << 12
            r8 = r8 | r14
            int r14 = r6 + 2
            byte r14 = r15[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r4[r14]
            int r14 = r14 << 6
            r8 = r8 | r14
            int r14 = r6 + 3
            byte r14 = r15[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r4[r14]
            r8 = r8 | r14
            if (r8 < 0) goto L_0x005b
            int r6 = r9 + 2
            byte r14 = (byte) r8
            r3[r6] = r14
            int r6 = r9 + 1
            int r14 = r8 >> 8
            byte r14 = (byte) r14
            r3[r6] = r14
            int r6 = r8 >> 16
            byte r6 = (byte) r6
            r3[r9] = r6
            int r9 = r9 + 3
            r6 = r13
            goto L_0x0019
        L_0x005b:
            if (r6 < r0) goto L_0x005f
            goto L_0x00da
        L_0x005f:
            int r13 = r6 + 1
            byte r6 = r15[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r4[r6]
            r14 = -1
            if (r7 == 0) goto L_0x00d2
            if (r7 == r12) goto L_0x00cc
            r12 = -2
            if (r7 == r11) goto L_0x00b5
            r11 = 5
            if (r7 == r10) goto L_0x0085
            if (r7 == r2) goto L_0x007c
            if (r7 == r11) goto L_0x0078
            goto L_0x00d7
        L_0x0078:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x007c:
            if (r6 != r12) goto L_0x0082
            int r7 = r7 + 1
            goto L_0x00d7
        L_0x0082:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x0085:
            if (r6 < 0) goto L_0x00a0
            int r7 = r8 << 6
            r6 = r6 | r7
            int r7 = r9 + 2
            byte r8 = (byte) r6
            r3[r7] = r8
            int r7 = r9 + 1
            int r8 = r6 >> 8
            byte r8 = (byte) r8
            r3[r7] = r8
            int r7 = r6 >> 16
            byte r7 = (byte) r7
            r3[r9] = r7
            int r9 = r9 + 3
            r7 = r5
        L_0x009e:
            r8 = r6
            goto L_0x00d7
        L_0x00a0:
            if (r6 != r12) goto L_0x00b2
            int r6 = r9 + 1
            int r7 = r8 >> 2
            byte r7 = (byte) r7
            r3[r6] = r7
            int r6 = r8 >> 10
            byte r6 = (byte) r6
            r3[r9] = r6
            int r9 = r9 + 2
            r7 = r11
            goto L_0x00d7
        L_0x00b2:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x00b5:
            if (r6 < 0) goto L_0x00bd
        L_0x00b7:
            int r8 = r8 << 6
            r6 = r6 | r8
        L_0x00ba:
            int r7 = r7 + 1
            goto L_0x009e
        L_0x00bd:
            if (r6 != r12) goto L_0x00c9
            int r6 = r9 + 1
            int r7 = r8 >> 4
            byte r7 = (byte) r7
            r3[r9] = r7
            r7 = r2
            r9 = r6
            goto L_0x00d7
        L_0x00c9:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x00cc:
            if (r6 < 0) goto L_0x00cf
            goto L_0x00b7
        L_0x00cf:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x00d2:
            if (r6 < 0) goto L_0x00d5
            goto L_0x00ba
        L_0x00d5:
            if (r6 != r14) goto L_0x0104
        L_0x00d7:
            r6 = r13
            goto L_0x0012
        L_0x00da:
            if (r7 == r12) goto L_0x0104
            if (r7 == r11) goto L_0x00f2
            if (r7 == r10) goto L_0x00e3
            if (r7 == r2) goto L_0x0104
            goto L_0x00fa
        L_0x00e3:
            int r15 = r9 + 1
            int r0 = r8 >> 10
            byte r0 = (byte) r0
            r3[r9] = r0
            int r9 = r9 + 2
            int r0 = r8 >> 2
            byte r0 = (byte) r0
            r3[r15] = r0
            goto L_0x00fa
        L_0x00f2:
            int r15 = r9 + 1
            int r0 = r8 >> 4
            byte r0 = (byte) r0
            r3[r9] = r0
            r9 = r15
        L_0x00fa:
            if (r9 != r1) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            byte[] r15 = new byte[r9]
            java.lang.System.arraycopy(r3, r5, r15, r5, r9)
            r3 = r15
        L_0x0103:
            return r3
        L_0x0104:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bad base-64"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa2.i(java.lang.String):byte[]");
    }

    public static mh4 j() {
        if (mh4.b != null) {
            return mh4.b;
        }
        synchronized (mh4.class) {
            try {
                if (mh4.b == null) {
                    mh4.b = new mh4(0);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return mh4.b;
    }

    public static void k(Activity activity, nb7 nb7) {
        if (activity instanceof nc7) {
            pc7 R = ((nc7) activity).R();
            if (R instanceof pc7) {
                R.d(nb7);
            }
        }
    }

    public static byte[] l(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = kg0.k;
        int i2 = (length / 3) * 4;
        if (length % 3 > 0) {
            i2 += 4;
        }
        if (length > 0) {
            i2 += ((length - 1) / 57) + 1;
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        int i4 = 19;
        int i5 = 0;
        while (true) {
            int i6 = i3 + 3;
            if (i6 > length) {
                break;
            }
            byte b2 = (bArr[i3 + 2] & 255) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 8);
            bArr3[i5] = bArr2[(b2 >> 18) & 63];
            bArr3[i5 + 1] = bArr2[(b2 >> 12) & 63];
            bArr3[i5 + 2] = bArr2[(b2 >> 6) & 63];
            bArr3[i5 + 3] = bArr2[b2 & 63];
            int i7 = i5 + 4;
            i4--;
            if (i4 == 0) {
                i5 += 5;
                bArr3[i7] = 10;
                i4 = 19;
            } else {
                i5 = i7;
            }
            i3 = i6;
        }
        if (i3 == length - 1) {
            int i8 = (bArr[i3] & 255) << 4;
            bArr3[i5] = bArr2[(i8 >> 6) & 63];
            bArr3[i5 + 1] = bArr2[i8 & 63];
            bArr3[i5 + 2] = 61;
            bArr3[i5 + 3] = 61;
            bArr3[i5 + 4] = 10;
        } else if (i3 == length - 2) {
            int i9 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
            bArr3[i5] = bArr2[(i9 >> 12) & 63];
            bArr3[i5 + 1] = bArr2[(i9 >> 6) & 63];
            bArr3[i5 + 2] = bArr2[i9 & 63];
            bArr3[i5 + 3] = 61;
            bArr3[i5 + 4] = 10;
        } else if (i5 > 0 && i4 != 19) {
            bArr3[i5] = 10;
        }
        return bArr3;
    }

    public static final int n(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int length = stackTraceElementArr.length - 1;
        int length2 = stackTraceElementArr2.length - 1;
        while (length >= 0 && length2 >= 0 && hhd.f(stackTraceElementArr[length], stackTraceElementArr2[length2])) {
            length--;
            length2--;
        }
        return (stackTraceElementArr.length - 1) - length;
    }

    public static am6 o(int i2, String str) {
        am6 am6 = i2 != 400 ? i2 != 406 ? i2 != 409 ? i2 != 500 ? i2 != 403 ? i2 != 404 ? i2 != 412 ? i2 != 413 ? i2 != 415 ? i2 != 416 ? new am6(i2, (String) null) : c : j : i : f : b : g : d : h : k : e;
        return str == null ? am6 : new am6(am6.a, am6.b, str);
    }

    public static float p(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return kr4.b(edgeEffect);
        }
        return 0.0f;
    }

    public static int[] q(String str) {
        int i2;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i3 = indexOf4 + 2;
        if (i3 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i3) == '/') {
            i2 = str.indexOf(47, indexOf4 + 3);
            if (i2 == -1 || i2 > indexOf2) {
                i2 = indexOf2;
            }
        } else {
            i2 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i2;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static yf6 s() {
        if (yf6.c != null) {
            return yf6.c;
        }
        synchronized (yf6.class) {
            try {
                if (yf6.c == null) {
                    yf6.c = new yf6();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return yf6.c;
    }

    public static void t(Activity activity) {
        z9c.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new z9c());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static c27 u() {
        if (c27.c != null) {
            return c27.c;
        }
        synchronized (c27.class) {
            try {
                if (c27.c == null) {
                    c27.c = new c27(0);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return c27.c;
    }

    public static boolean v(am6 am6) {
        return i.equals(am6) || j.equals(am6) || k.equals(am6) || d.equals(am6) || m.equals(am6) || n.equals(am6);
    }

    public static boolean w(rgc rgc) {
        Boolean bool;
        try {
            bool = (Boolean) rgc.b(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException unused) {
            if (zf4.a.j(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", new Object[]{Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)});
            } else {
                String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", new Object[]{Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)});
            }
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    public static cy2 x(qz3 qz3, int i2, kac kac) {
        nxb nxb = kac.X;
        ws6 ws6 = kac.b;
        if (nxb == null) {
            return null;
        }
        xu5 xu5 = kac.a;
        String str = xu5.m;
        hk9 hk9 = s1e.W;
        ay2 qt0 = new qt0((str == null || (!str.startsWith("video/webm") && !str.startsWith("audio/webm"))) ? new ny5(32, hk9) : new yw7(2, hk9), i2, xu5);
        try {
            nxb e2 = kac.e();
            oyb.g(e2);
            nxb d2 = kac.d();
            if (d2 != null) {
                nxb a2 = e2.a(d2, ((hj0) ws6.get(0)).a);
                if (a2 == null) {
                    new qw6(qz3, f(kac, ((hj0) ws6.get(0)).a, e2, 0), kac.a, 0, (Object) null, qt0).load();
                } else {
                    d2 = a2;
                }
                new qw6(qz3, f(kac, ((hj0) ws6.get(0)).a, d2, 0), kac.a, 0, (Object) null, qt0).load();
            }
            qt0.c();
            return qt0.a();
        } catch (Throwable th) {
            qt0.c();
            throw th;
        }
    }

    public static final void y(kh6 kh6, List list) {
        kh6.c("history↓");
        if (list.isEmpty()) {
            kh6.c("empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        rg6 l2 = mt0.l(list);
        if (l2 != null) {
            sb.append(l2.getId());
            sb.append(" ");
        }
        sb.append("║║");
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            rg6 rg6 = (rg6) list.get(i2);
            if (rg6 instanceof qg6) {
                sb.append(" GAP ║║");
            } else {
                rg6 rg62 = null;
                rg6 rg63 = i2 > 0 ? (rg6) list.get(i2 - 1) : null;
                if ((rg63 instanceof qg6) || rg63 == null) {
                    sb.append(" ");
                    sb.append(kh6.b(rg6.k()));
                    sb.append(" - ");
                    i3 = 0;
                }
                i3++;
                if (i2 < list.size() - 1) {
                    rg62 = (rg6) list.get(i2 + 1);
                }
                if ((rg62 instanceof qg6) || rg62 == null) {
                    sb.append(kh6.b(rg6.k()));
                    sb.append(" (" + i3 + ")");
                    sb.append(" ║║");
                }
            }
            i2++;
        }
        rg6 v = mt0.v(list);
        if (v != null) {
            sb.append(" ");
            sb.append(v.getId());
        }
        kh6.c(sb.toString());
    }

    public static final void z(kh6 kh6, og6 og6) {
        kh6.c("bounds↓");
        StringBuilder sb = new StringBuilder("firstId: ");
        sb.append(og6.g());
        sb.append(" ║║ lastId: ");
        sb.append(og6.h());
        sb.append(" ║║ chunks: ");
        if (og6.i().isEmpty()) {
            sb.append("empty");
        } else {
            sb.append("║║");
            for (yx2 yx2 : og6.i()) {
                sb.append(" ");
                sb.append(kh6.b(yx2.a()));
                sb.append(" - ");
                sb.append(kh6.b(yx2.b()));
                sb.append(" ║║");
            }
        }
        kh6.c(sb.toString());
    }

    public og0 e() {
        ete.l(2, "expectedValuesPerKey");
        return new og0(this);
    }

    public abstract Map g();

    public abstract aga m();

    public abstract yh7 r();
}
