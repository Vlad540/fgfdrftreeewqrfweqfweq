package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: h4e  reason: default package */
public final class h4e {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final String i;
    public final oq1 j;
    public final et1 k;
    public final lhd l;
    public final int m;
    public final boolean n = false;
    public final boolean o = false;
    public final boolean p = false;
    public final boolean q = false;
    public final boolean r = false;
    public db0 s;
    public final ArrayList t = new ArrayList();
    public final si4 u;
    public final zl3 v = new Object();
    public final nfc w = new nfc(25);
    public final ud x;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v60, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r4v1, types: [zl3, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h4e(android.content.Context r18, java.lang.String r19, defpackage.ku1 r20, defpackage.oq1 r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = 1
            r17.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.a = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.b = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.c = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.d = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r0.e = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.g = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.h = r3
            r3 = 0
            r0.n = r3
            r0.o = r3
            r0.p = r3
            r0.q = r3
            r0.r = r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.t = r4
            zl3 r4 = new zl3
            r4.<init>()
            r0.v = r4
            nfc r4 = new nfc
            r5 = 25
            r4.<init>((int) r5)
            r0.w = r4
            r19.getClass()
            r0.i = r1
            r21.getClass()
            r4 = r21
            r0.j = r4
            lhd r4 = new lhd
            r5 = 14
            r4.<init>(r5, r3)
            r0.l = r4
            si4 r4 = defpackage.si4.b(r18)
            r0.u = r4
            r4 = r20
            et1 r1 = r4.a(r1)     // Catch:{ CameraAccessExceptionCompat -> 0x0095 }
            r0.k = r1     // Catch:{ CameraAccessExceptionCompat -> 0x0095 }
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ CameraAccessExceptionCompat -> 0x0095 }
            java.lang.Object r4 = r1.a(r4)     // Catch:{ CameraAccessExceptionCompat -> 0x0095 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ CameraAccessExceptionCompat -> 0x0095 }
            r5 = 2
            if (r4 == 0) goto L_0x0098
            int r4 = r4.intValue()     // Catch:{ CameraAccessExceptionCompat -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r0 = move-exception
            goto L_0x085a
        L_0x0098:
            r4 = r5
        L_0x0099:
            r0.m = r4     // Catch:{ CameraAccessExceptionCompat -> 0x0095 }
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r1 = r1.a(r4)
            int[] r1 = (int[]) r1
            r4 = 3
            if (r1 == 0) goto L_0x00c5
            int r6 = r1.length
            r7 = r3
        L_0x00a8:
            if (r7 >= r6) goto L_0x00c5
            r8 = r1[r7]
            if (r8 != r4) goto L_0x00b1
            r0.n = r2
            goto L_0x00c3
        L_0x00b1:
            r9 = 6
            if (r8 != r9) goto L_0x00b7
            r0.o = r2
            goto L_0x00c3
        L_0x00b7:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 31
            if (r9 < r10) goto L_0x00c3
            r9 = 16
            if (r8 != r9) goto L_0x00c3
            r0.r = r2
        L_0x00c3:
            int r7 = r7 + r2
            goto L_0x00a8
        L_0x00c5:
            ud r1 = new ud
            et1 r6 = r0.k
            r1.<init>((defpackage.et1) r6)
            r0.x = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            i4e r7 = new i4e
            r7.<init>()
            j4e r8 = defpackage.j4e.MAXIMUM
            r9 = 0
            c3d.l(r2, r8, r9, r7)
            i4e r7 = c3d.h(r6, r7)
            c3d.l(r4, r8, r9, r7)
            i4e r7 = c3d.h(r6, r7)
            c3d.l(r5, r8, r9, r7)
            i4e r7 = c3d.h(r6, r7)
            j4e r11 = defpackage.j4e.PREVIEW
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r7.a(r12)
            c3d.l(r4, r8, r9, r7)
            i4e r7 = c3d.h(r6, r7)
            xa0 r12 = new xa0
            r12.<init>(r5, r11, r9)
            r7.a(r12)
            c3d.l(r4, r8, r9, r7)
            i4e r7 = c3d.h(r6, r7)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r7.a(r12)
            c3d.l(r2, r11, r9, r7)
            i4e r7 = c3d.h(r6, r7)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r7.a(r12)
            c3d.l(r5, r11, r9, r7)
            i4e r7 = c3d.h(r6, r7)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r7.a(r12)
            xa0 r12 = new xa0
            r12.<init>(r5, r11, r9)
            r7.a(r12)
            c3d.l(r4, r8, r9, r7)
            r6.add(r7)
            r1.addAll(r6)
            int r6 = r0.m
            j4e r7 = defpackage.j4e.RECORD
            if (r6 == 0) goto L_0x0157
            if (r6 == r2) goto L_0x0157
            if (r6 != r4) goto L_0x01d5
        L_0x0157:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            i4e r13 = new i4e
            r13.<init>()
            xa0 r14 = new xa0
            r14.<init>(r2, r11, r9)
            r13.a(r14)
            c3d.l(r2, r7, r9, r13)
            i4e r13 = c3d.h(r12, r13)
            xa0 r14 = new xa0
            r14.<init>(r2, r11, r9)
            r13.a(r14)
            c3d.l(r5, r7, r9, r13)
            i4e r13 = c3d.h(r12, r13)
            xa0 r14 = new xa0
            r14.<init>(r5, r11, r9)
            r13.a(r14)
            c3d.l(r5, r7, r9, r13)
            i4e r13 = c3d.h(r12, r13)
            xa0 r14 = new xa0
            r14.<init>(r2, r11, r9)
            r13.a(r14)
            xa0 r14 = new xa0
            r14.<init>(r2, r7, r9)
            r13.a(r14)
            c3d.l(r4, r7, r9, r13)
            i4e r13 = c3d.h(r12, r13)
            xa0 r14 = new xa0
            r14.<init>(r2, r11, r9)
            r13.a(r14)
            xa0 r14 = new xa0
            r14.<init>(r5, r7, r9)
            r13.a(r14)
            c3d.l(r4, r7, r9, r13)
            i4e r13 = c3d.h(r12, r13)
            xa0 r14 = new xa0
            r14.<init>(r5, r11, r9)
            r13.a(r14)
            xa0 r14 = new xa0
            r14.<init>(r5, r11, r9)
            r13.a(r14)
            c3d.l(r4, r8, r9, r13)
            r12.add(r13)
            r1.addAll(r12)
        L_0x01d5:
            j4e r12 = defpackage.j4e.VGA
            if (r6 == r2) goto L_0x01db
            if (r6 != r4) goto L_0x0259
        L_0x01db:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            i4e r14 = new i4e
            r14.<init>()
            xa0 r15 = new xa0
            r15.<init>(r2, r11, r9)
            r14.a(r15)
            c3d.l(r2, r8, r9, r14)
            i4e r14 = c3d.h(r13, r14)
            xa0 r15 = new xa0
            r15.<init>(r2, r11, r9)
            r14.a(r15)
            c3d.l(r5, r8, r9, r14)
            i4e r14 = c3d.h(r13, r14)
            xa0 r15 = new xa0
            r15.<init>(r5, r11, r9)
            r14.a(r15)
            c3d.l(r5, r8, r9, r14)
            i4e r14 = c3d.h(r13, r14)
            xa0 r15 = new xa0
            r15.<init>(r2, r11, r9)
            r14.a(r15)
            xa0 r15 = new xa0
            r15.<init>(r2, r11, r9)
            r14.a(r15)
            c3d.l(r4, r8, r9, r14)
            i4e r14 = c3d.h(r13, r14)
            xa0 r15 = new xa0
            r15.<init>(r5, r12, r9)
            r14.a(r15)
            xa0 r15 = new xa0
            r15.<init>(r2, r11, r9)
            r14.a(r15)
            c3d.l(r5, r8, r9, r14)
            i4e r14 = c3d.h(r13, r14)
            xa0 r15 = new xa0
            r15.<init>(r5, r12, r9)
            r14.a(r15)
            xa0 r15 = new xa0
            r15.<init>(r5, r11, r9)
            r14.a(r15)
            c3d.l(r5, r8, r9, r14)
            r13.add(r14)
            r1.addAll(r13)
        L_0x0259:
            boolean r13 = r0.n
            r14 = 5
            if (r13 == 0) goto L_0x0302
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            i4e r15 = new i4e
            r15.<init>()
            c3d.l(r14, r8, r9, r15)
            i4e r15 = c3d.h(r13, r15)
            xa0 r3 = new xa0
            r3.<init>(r2, r11, r9)
            r15.a(r3)
            c3d.l(r14, r8, r9, r15)
            i4e r3 = c3d.h(r13, r15)
            xa0 r15 = new xa0
            r15.<init>(r5, r11, r9)
            r3.a(r15)
            c3d.l(r14, r8, r9, r3)
            i4e r3 = c3d.h(r13, r3)
            xa0 r15 = new xa0
            r15.<init>(r2, r11, r9)
            r3.a(r15)
            xa0 r15 = new xa0
            r15.<init>(r2, r11, r9)
            r3.a(r15)
            c3d.l(r14, r8, r9, r3)
            i4e r3 = c3d.h(r13, r3)
            xa0 r15 = new xa0
            r15.<init>(r2, r11, r9)
            r3.a(r15)
            xa0 r15 = new xa0
            r15.<init>(r5, r11, r9)
            r3.a(r15)
            c3d.l(r14, r8, r9, r3)
            i4e r3 = c3d.h(r13, r3)
            xa0 r15 = new xa0
            r15.<init>(r5, r11, r9)
            r3.a(r15)
            xa0 r15 = new xa0
            r15.<init>(r5, r11, r9)
            r3.a(r15)
            c3d.l(r14, r8, r9, r3)
            i4e r3 = c3d.h(r13, r3)
            xa0 r15 = new xa0
            r15.<init>(r2, r11, r9)
            r3.a(r15)
            xa0 r15 = new xa0
            r15.<init>(r4, r8, r9)
            r3.a(r15)
            c3d.l(r14, r8, r9, r3)
            i4e r3 = c3d.h(r13, r3)
            xa0 r15 = new xa0
            r15.<init>(r5, r11, r9)
            r3.a(r15)
            xa0 r15 = new xa0
            r15.<init>(r4, r8, r9)
            r3.a(r15)
            c3d.l(r14, r8, r9, r3)
            r13.add(r3)
            r1.addAll(r13)
        L_0x0302:
            boolean r3 = r0.o
            if (r3 == 0) goto L_0x0341
            if (r6 != 0) goto L_0x0341
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            i4e r13 = new i4e
            r13.<init>()
            xa0 r15 = new xa0
            r15.<init>(r2, r11, r9)
            r13.a(r15)
            c3d.l(r2, r8, r9, r13)
            i4e r13 = c3d.h(r3, r13)
            xa0 r15 = new xa0
            r15.<init>(r2, r11, r9)
            r13.a(r15)
            c3d.l(r5, r8, r9, r13)
            i4e r13 = c3d.h(r3, r13)
            xa0 r15 = new xa0
            r15.<init>(r5, r11, r9)
            r13.a(r15)
            c3d.l(r5, r8, r9, r13)
            r3.add(r13)
            r1.addAll(r3)
        L_0x0341:
            if (r6 != r4) goto L_0x038d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            i4e r6 = new i4e
            r6.<init>()
            xa0 r13 = new xa0
            r13.<init>(r2, r11, r9)
            r6.a(r13)
            xa0 r13 = new xa0
            r13.<init>(r2, r12, r9)
            r6.a(r13)
            xa0 r13 = new xa0
            r13.<init>(r5, r8, r9)
            r6.a(r13)
            c3d.l(r14, r8, r9, r6)
            i4e r6 = c3d.h(r3, r6)
            xa0 r13 = new xa0
            r13.<init>(r2, r11, r9)
            r6.a(r13)
            xa0 r13 = new xa0
            r13.<init>(r2, r12, r9)
            r6.a(r13)
            xa0 r12 = new xa0
            r12.<init>(r4, r8, r9)
            r6.a(r12)
            c3d.l(r14, r8, r9, r6)
            r3.add(r6)
            r1.addAll(r3)
        L_0x038d:
            java.util.ArrayList r3 = r0.a
            r3.addAll(r1)
            lhd r1 = r0.l
            java.lang.Object r1 = r1.b
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk r1 = (androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk) r1
            if (r1 != 0) goto L_0x03a0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x03f8
        L_0x03a0:
            i4e r1 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.a
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r6 = "heroqltevzw"
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 != 0) goto L_0x03e4
            java.lang.String r6 = "heroqltetmo"
            boolean r1 = r6.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x03b5
            goto L_0x03e4
        L_0x03b5:
            java.lang.String r1 = "google"
            java.lang.String r6 = android.os.Build.BRAND
            boolean r1 = r1.equalsIgnoreCase(r6)
            if (r1 != 0) goto L_0x03c1
            r1 = 0
            goto L_0x03cf
        L_0x03c1:
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r6)
            java.util.HashSet r6 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.c
            boolean r1 = r6.contains(r1)
        L_0x03cf:
            if (r1 != 0) goto L_0x03dd
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.e()
            if (r1 == 0) goto L_0x03d8
            goto L_0x03dd
        L_0x03d8:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x03f8
        L_0x03dd:
            i4e r1 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.b
            java.util.List r1 = java.util.Collections.singletonList(r1)
            goto L_0x03f8
        L_0x03e4:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r6 = "1"
            java.lang.String r12 = r0.i
            boolean r6 = r12.equals(r6)
            if (r6 == 0) goto L_0x03f8
            i4e r6 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.a
            r1.add(r6)
        L_0x03f8:
            r3.addAll(r1)
            boolean r1 = r0.r
            if (r1 == 0) goto L_0x0523
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            i4e r3 = new i4e
            r3.<init>()
            j4e r6 = defpackage.j4e.ULTRA_MAXIMUM
            xa0 r12 = new xa0
            r12.<init>(r5, r6, r9)
            r3.a(r12)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            c3d.l(r2, r7, r9, r3)
            i4e r3 = c3d.h(r1, r3)
            xa0 r12 = new xa0
            r12.<init>(r4, r6, r9)
            r3.a(r12)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            c3d.l(r2, r7, r9, r3)
            i4e r3 = c3d.h(r1, r3)
            xa0 r12 = new xa0
            r12.<init>(r14, r6, r9)
            r3.a(r12)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            c3d.l(r2, r7, r9, r3)
            i4e r3 = c3d.h(r1, r3)
            xa0 r12 = new xa0
            r12.<init>(r5, r6, r9)
            r3.a(r12)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            c3d.l(r4, r8, r9, r3)
            i4e r3 = c3d.h(r1, r3)
            xa0 r12 = new xa0
            r12.<init>(r4, r6, r9)
            r3.a(r12)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            c3d.l(r4, r8, r9, r3)
            i4e r3 = c3d.h(r1, r3)
            xa0 r12 = new xa0
            r12.<init>(r14, r6, r9)
            r3.a(r12)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            c3d.l(r4, r8, r9, r3)
            i4e r3 = c3d.h(r1, r3)
            xa0 r12 = new xa0
            r12.<init>(r5, r6, r9)
            r3.a(r12)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            c3d.l(r5, r8, r9, r3)
            i4e r3 = c3d.h(r1, r3)
            xa0 r12 = new xa0
            r12.<init>(r4, r6, r9)
            r3.a(r12)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            c3d.l(r5, r8, r9, r3)
            i4e r3 = c3d.h(r1, r3)
            xa0 r12 = new xa0
            r12.<init>(r14, r6, r9)
            r3.a(r12)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            c3d.l(r5, r8, r9, r3)
            i4e r3 = c3d.h(r1, r3)
            xa0 r12 = new xa0
            r12.<init>(r5, r6, r9)
            r3.a(r12)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            c3d.l(r14, r8, r9, r3)
            i4e r3 = c3d.h(r1, r3)
            xa0 r12 = new xa0
            r12.<init>(r4, r6, r9)
            r3.a(r12)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            c3d.l(r14, r8, r9, r3)
            i4e r3 = c3d.h(r1, r3)
            xa0 r12 = new xa0
            r12.<init>(r14, r6, r9)
            r3.a(r12)
            xa0 r6 = new xa0
            r6.<init>(r2, r11, r9)
            r3.a(r6)
            c3d.l(r14, r8, r9, r3)
            r1.add(r3)
            java.util.ArrayList r3 = r0.b
            r3.addAll(r1)
        L_0x0523:
            android.content.pm.PackageManager r1 = r18.getPackageManager()
            java.lang.String r3 = "android.hardware.camera.concurrent"
            boolean r1 = r1.hasSystemFeature(r3)
            r0.p = r1
            j4e r3 = defpackage.j4e.s1440p
            if (r1 == 0) goto L_0x05b2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            i4e r6 = new i4e
            r6.<init>()
            c3d.l(r5, r3, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            c3d.l(r2, r3, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            c3d.l(r4, r3, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            j4e r12 = defpackage.j4e.s720p
            xa0 r13 = new xa0
            r13.<init>(r5, r12, r9)
            r6.a(r13)
            c3d.l(r4, r3, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            xa0 r13 = new xa0
            r13.<init>(r2, r12, r9)
            r6.a(r13)
            c3d.l(r4, r3, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            xa0 r13 = new xa0
            r13.<init>(r5, r12, r9)
            r6.a(r13)
            c3d.l(r5, r3, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            xa0 r13 = new xa0
            r13.<init>(r5, r12, r9)
            r6.a(r13)
            c3d.l(r2, r3, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            xa0 r13 = new xa0
            r13.<init>(r2, r12, r9)
            r6.a(r13)
            c3d.l(r5, r3, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            xa0 r13 = new xa0
            r13.<init>(r2, r12, r9)
            r6.a(r13)
            c3d.l(r2, r3, r9, r6)
            r1.add(r6)
            java.util.ArrayList r6 = r0.c
            r6.addAll(r1)
        L_0x05b2:
            ud r1 = r0.x
            boolean r1 = r1.b
            if (r1 == 0) goto L_0x063e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            i4e r6 = new i4e
            r6.<init>()
            c3d.l(r2, r8, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            c3d.l(r5, r8, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r6.a(r12)
            c3d.l(r4, r8, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r6.a(r12)
            c3d.l(r5, r8, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            xa0 r12 = new xa0
            r12.<init>(r5, r11, r9)
            r6.a(r12)
            c3d.l(r5, r8, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r6.a(r12)
            c3d.l(r2, r7, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r6.a(r12)
            xa0 r12 = new xa0
            r12.<init>(r2, r7, r9)
            r6.a(r12)
            c3d.l(r5, r7, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            xa0 r12 = new xa0
            r12.<init>(r2, r11, r9)
            r6.a(r12)
            xa0 r12 = new xa0
            r12.<init>(r2, r7, r9)
            r6.a(r12)
            c3d.l(r4, r7, r9, r6)
            r1.add(r6)
            java.util.ArrayList r6 = r0.f
            r6.addAll(r1)
        L_0x063e:
            et1 r1 = r0.k
            j8e r1 = r1.b()
            java.lang.Object r1 = r1.a
            fzd r1 = (defpackage.fzd) r1
            r1.getClass()
            r6 = 0
            java.lang.Object r1 = r1.b     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0655 }
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0655 }
            int[] r1 = r1.getOutputFormats()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0655 }
            goto L_0x0656
        L_0x0655:
            r1 = r6
        L_0x0656:
            if (r1 != 0) goto L_0x0659
            goto L_0x0660
        L_0x0659:
            java.lang.Object r1 = r1.clone()
            r6 = r1
            int[] r6 = (int[]) r6
        L_0x0660:
            if (r6 != 0) goto L_0x0663
            goto L_0x0695
        L_0x0663:
            int r1 = r6.length
            r12 = 0
        L_0x0665:
            if (r12 >= r1) goto L_0x0695
            r13 = r6[r12]
            r14 = 4101(0x1005, float:5.747E-42)
            if (r13 != r14) goto L_0x0693
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            i4e r6 = new i4e
            r6.<init>()
            r12 = 4
            c3d.l(r12, r8, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            xa0 r13 = new xa0
            r13.<init>(r2, r11, r9)
            r6.a(r13)
            c3d.l(r12, r8, r9, r6)
            r1.add(r6)
            java.util.ArrayList r6 = r0.g
            r6.addAll(r1)
            goto L_0x0695
        L_0x0693:
            int r12 = r12 + r2
            goto L_0x0665
        L_0x0695:
            et1 r1 = r0.k
            z80 r6 = defpackage.pzd.a
            int r6 = android.os.Build.VERSION.SDK_INT
            r12 = 33
            if (r6 >= r12) goto L_0x06a1
        L_0x069f:
            r1 = 0
            goto L_0x06b2
        L_0x06a1:
            android.hardware.camera2.CameraCharacteristics$Key r13 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            java.lang.Object r1 = r1.a(r13)
            long[] r1 = (long[]) r1
            if (r1 == 0) goto L_0x069f
            int r1 = r1.length
            if (r1 != 0) goto L_0x06b1
            goto L_0x069f
        L_0x06b1:
            r1 = r2
        L_0x06b2:
            r0.q = r1
            if (r1 == 0) goto L_0x0794
            if (r6 < r12) goto L_0x0794
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            i4e r13 = new i4e
            r13.<init>()
            r14 = 4
            c3d.l(r2, r3, r14, r13)
            i4e r13 = c3d.h(r1, r13)
            c3d.l(r5, r3, r14, r13)
            i4e r13 = c3d.h(r1, r13)
            r14 = 3
            c3d.l(r2, r7, r14, r13)
            i4e r13 = c3d.h(r1, r13)
            c3d.l(r5, r7, r14, r13)
            i4e r13 = c3d.h(r1, r13)
            r9 = 2
            c3d.l(r4, r8, r9, r13)
            i4e r13 = c3d.h(r1, r13)
            c3d.l(r5, r8, r9, r13)
            i4e r13 = c3d.h(r1, r13)
            xa0 r12 = new xa0
            r14 = 1
            r12.<init>(r2, r11, r14)
            r13.a(r12)
            c3d.l(r4, r8, r9, r13)
            i4e r12 = c3d.h(r1, r13)
            xa0 r13 = new xa0
            r13.<init>(r2, r11, r14)
            r12.a(r13)
            c3d.l(r5, r8, r9, r12)
            i4e r12 = c3d.h(r1, r12)
            xa0 r13 = new xa0
            r13.<init>(r2, r11, r14)
            r12.a(r13)
            r9 = 3
            c3d.l(r2, r7, r9, r12)
            i4e r12 = c3d.h(r1, r12)
            xa0 r13 = new xa0
            r13.<init>(r2, r11, r14)
            r12.a(r13)
            c3d.l(r5, r7, r9, r12)
            i4e r9 = c3d.h(r1, r12)
            xa0 r10 = new xa0
            r10.<init>(r2, r11, r14)
            r9.a(r10)
            c3d.l(r5, r11, r14, r9)
            i4e r9 = c3d.h(r1, r9)
            xa0 r10 = new xa0
            r10.<init>(r2, r11, r14)
            r9.a(r10)
            xa0 r10 = new xa0
            r12 = 3
            r10.<init>(r2, r7, r12)
            r9.a(r10)
            r12 = 2
            c3d.l(r4, r7, r12, r9)
            i4e r9 = c3d.h(r1, r9)
            xa0 r10 = new xa0
            r10.<init>(r2, r11, r14)
            r9.a(r10)
            xa0 r10 = new xa0
            r12 = 3
            r10.<init>(r5, r7, r12)
            r9.a(r10)
            r12 = 2
            c3d.l(r4, r7, r12, r9)
            i4e r7 = c3d.h(r1, r9)
            xa0 r9 = new xa0
            r9.<init>(r2, r11, r14)
            r7.a(r9)
            xa0 r9 = new xa0
            r9.<init>(r5, r11, r14)
            r7.a(r9)
            r9 = 2
            c3d.l(r4, r8, r9, r7)
            r1.add(r7)
            java.util.ArrayList r7 = r0.h
            r7.addAll(r1)
        L_0x0794:
            et1 r1 = r0.k
            r7 = 33
            if (r6 >= r7) goto L_0x079d
        L_0x079a:
            r16 = 0
            goto L_0x07b8
        L_0x079d:
            android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES
            java.lang.Object r1 = r1.a(r6)
            int[] r1 = (int[]) r1
            if (r1 == 0) goto L_0x079a
            int r6 = r1.length
            if (r6 != 0) goto L_0x07ab
            goto L_0x079a
        L_0x07ab:
            int r6 = r1.length
            r7 = 0
        L_0x07ad:
            if (r7 >= r6) goto L_0x079a
            r9 = r1[r7]
            if (r9 != r5) goto L_0x07b6
            r16 = r2
            goto L_0x07b8
        L_0x07b6:
            int r7 = r7 + r2
            goto L_0x07ad
        L_0x07b8:
            if (r16 == 0) goto L_0x0856
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 33
            if (r1 < r6) goto L_0x0856
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            i4e r6 = new i4e
            r6.<init>()
            r9 = 0
            c3d.l(r2, r3, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            c3d.l(r5, r3, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            xa0 r7 = new xa0
            r7.<init>(r2, r3, r9)
            r6.a(r7)
            c3d.l(r4, r8, r9, r6)
            i4e r6 = c3d.h(r1, r6)
            xa0 r7 = new xa0
            r7.<init>(r5, r3, r9)
            r6.a(r7)
            c3d.l(r4, r8, r9, r6)
            i4e r4 = c3d.h(r1, r6)
            xa0 r6 = new xa0
            r6.<init>(r2, r3, r9)
            r4.a(r6)
            c3d.l(r5, r8, r9, r4)
            i4e r4 = c3d.h(r1, r4)
            xa0 r6 = new xa0
            r6.<init>(r5, r3, r9)
            r4.a(r6)
            c3d.l(r5, r8, r9, r4)
            i4e r4 = c3d.h(r1, r4)
            xa0 r6 = new xa0
            r6.<init>(r2, r11, r9)
            r4.a(r6)
            c3d.l(r2, r3, r9, r4)
            i4e r4 = c3d.h(r1, r4)
            xa0 r6 = new xa0
            r6.<init>(r5, r11, r9)
            r4.a(r6)
            c3d.l(r2, r3, r9, r4)
            i4e r4 = c3d.h(r1, r4)
            xa0 r6 = new xa0
            r6.<init>(r2, r11, r9)
            r4.a(r6)
            c3d.l(r5, r3, r9, r4)
            i4e r2 = c3d.h(r1, r4)
            xa0 r4 = new xa0
            r4.<init>(r5, r11, r9)
            r2.a(r4)
            c3d.l(r5, r3, r9, r2)
            r1.add(r2)
            java.util.ArrayList r2 = r0.d
            r2.addAll(r1)
        L_0x0856:
            r17.b()
            return
        L_0x085a:
            androidx.camera.core.CameraUnavailableException r1 = new androidx.camera.core.CameraUnavailableException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h4e.<init>(android.content.Context, java.lang.String, ku1, oq1):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.util.Size} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Size c(android.hardware.camera2.params.StreamConfigurationMap r3, int r4, boolean r5) {
        /*
            r0 = 34
            if (r4 != r0) goto L_0x000b
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            android.util.Size[] r0 = r3.getOutputSizes(r0)
            goto L_0x000f
        L_0x000b:
            android.util.Size[] r0 = r3.getOutputSizes(r4)
        L_0x000f:
            if (r0 == 0) goto L_0x004c
            int r1 = r0.length
            if (r1 != 0) goto L_0x0015
            goto L_0x004c
        L_0x0015:
            d63 r1 = new d63
            r2 = 0
            r1.<init>(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.Object r0 = java.util.Collections.max(r0, r1)
            android.util.Size r0 = (android.util.Size) r0
            android.util.Size r2 = defpackage.hjd.a
            if (r5 == 0) goto L_0x003d
            android.util.Size[] r3 = r3.getHighResolutionOutputSizes(r4)
            if (r3 == 0) goto L_0x003d
            int r4 = r3.length
            if (r4 <= 0) goto L_0x003d
            java.util.List r3 = java.util.Arrays.asList(r3)
            java.lang.Object r3 = java.util.Collections.max(r3, r1)
            r2 = r3
            android.util.Size r2 = (android.util.Size) r2
        L_0x003d:
            android.util.Size[] r3 = new android.util.Size[]{r0, r2}
            java.util.List r3 = java.util.Arrays.asList(r3)
            java.lang.Object r3 = java.util.Collections.max(r3, r1)
            android.util.Size r3 = (android.util.Size) r3
            return r3
        L_0x004c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h4e.c(android.hardware.camera2.params.StreamConfigurationMap, int, boolean):android.util.Size");
    }

    public static int e(Range range, Range range2) {
        e07.p("Ranges must not intersect", !range.contains((Integer) range2.getUpper()) && !range.contains((Integer) range2.getLower()));
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean a(wa0 wa0, List list) {
        List<i4e> list2;
        HashMap hashMap = this.e;
        if (hashMap.containsKey(wa0)) {
            list2 = (List) hashMap.get(wa0);
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z = wa0.d;
            int i2 = wa0.a;
            if (!z) {
                int i3 = wa0.b;
                if (i3 == 8) {
                    if (i2 != 1) {
                        ArrayList arrayList2 = this.a;
                        if (i2 != 2) {
                            if (wa0.c) {
                                arrayList2 = this.d;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.b);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        list2 = this.c;
                        hashMap.put(wa0, list2);
                    }
                } else if (i3 == 10 && i2 == 0) {
                    arrayList.addAll(this.f);
                }
            } else if (i2 == 0) {
                arrayList.addAll(this.g);
            }
            list2 = arrayList;
            hashMap.put(wa0, list2);
        }
        boolean z2 = false;
        for (i4e c2 : list2) {
            if (c2.c(list) != null) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        return z2;
    }

    public final void b() {
        Size size;
        Size size2;
        Size e2 = this.u.e();
        try {
            int parseInt = Integer.parseInt(this.i);
            oq1 oq1 = this.j;
            CamcorderProfile camcorderProfile = null;
            CamcorderProfile a2 = oq1.b(parseInt, 1) ? oq1.a(parseInt, 1) : null;
            if (a2 != null) {
                size = new Size(a2.videoFrameWidth, a2.videoFrameHeight);
                this.s = new db0(hjd.c, new HashMap(), e2, new HashMap(), size, new HashMap(), new HashMap());
            }
            size2 = hjd.d;
            if (oq1.b(parseInt, 10)) {
                camcorderProfile = oq1.a(parseInt, 10);
            } else if (oq1.b(parseInt, 8)) {
                camcorderProfile = oq1.a(parseInt, 8);
            } else if (oq1.b(parseInt, 12)) {
                camcorderProfile = oq1.a(parseInt, 12);
            } else if (oq1.b(parseInt, 6)) {
                camcorderProfile = oq1.a(parseInt, 6);
            } else if (oq1.b(parseInt, 5)) {
                camcorderProfile = oq1.a(parseInt, 5);
            } else if (oq1.b(parseInt, 4)) {
                camcorderProfile = oq1.a(parseInt, 4);
            }
            if (camcorderProfile != null) {
                size2 = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
            size = size2;
            this.s = new db0(hjd.c, new HashMap(), e2, new HashMap(), size, new HashMap(), new HashMap());
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) ((fzd) this.k.b().a).b).getOutputSizes(MediaRecorder.class);
            if (outputSizes != null) {
                Arrays.sort(outputSizes, new d63(true));
                int length = outputSizes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        size2 = hjd.d;
                        break;
                    }
                    Size size3 = outputSizes[i2];
                    int width = size3.getWidth();
                    Size size4 = hjd.f;
                    if (width <= size4.getWidth() && size3.getHeight() <= size4.getHeight()) {
                        size2 = size3;
                        break;
                    }
                    i2++;
                }
            } else {
                size2 = hjd.d;
            }
        }
    }

    public final List d(wa0 wa0, List list) {
        z80 z80 = pzd.a;
        if (wa0.a == 0 && wa0.b == 8) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                List c2 = ((i4e) it.next()).c(list);
                if (c2 != null) {
                    return c2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: android.util.Range} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: android.util.Range} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: android.util.Range} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: android.util.Range} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v54, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x07cb, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0a61, code lost:
        if (r1 < r4) goto L_0x0a8e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0b03, code lost:
        if (f(r6) < f(r11)) goto L_0x0abc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d0, code lost:
        if (r5.contains(r13) != false) goto L_0x01d2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0acf  */
    /* JADX WARNING: Removed duplicated region for block: B:645:0x0289 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:673:0x04de A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0272  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair g(int r40, java.util.ArrayList r41, java.util.HashMap r42, boolean r43, boolean r44) {
        /*
            r39 = this;
            r9 = r39
            r10 = r40
            r11 = r41
            r0 = r42
            si4 r1 = r9.u
            android.util.Size r2 = r1.a()
            r1.b = r2
            db0 r1 = r9.s
            if (r1 != 0) goto L_0x0018
            r39.b()
            goto L_0x0045
        L_0x0018:
            si4 r1 = r9.u
            android.util.Size r16 = r1.e()
            db0 r1 = r9.s
            android.util.Size r14 = r1.a
            java.util.Map r2 = r1.b
            java.util.Map r3 = r1.d
            android.util.Size r4 = r1.e
            java.util.Map r5 = r1.f
            java.util.Map r1 = r1.g
            db0 r6 = new db0
            r15 = r2
            java.util.HashMap r15 = (java.util.HashMap) r15
            r17 = r3
            java.util.HashMap r17 = (java.util.HashMap) r17
            r19 = r5
            java.util.HashMap r19 = (java.util.HashMap) r19
            r20 = r1
            java.util.HashMap r20 = (java.util.HashMap) r20
            r13 = r6
            r18 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r9.s = r6
        L_0x0045:
            java.util.ArrayList r13 = new java.util.ArrayList
            java.util.Set r1 = r42.keySet()
            r13.<init>(r1)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r13.iterator()
        L_0x005c:
            boolean r3 = r2.hasNext()
            r15 = 0
            if (r3 == 0) goto L_0x0082
            java.lang.Object r3 = r2.next()
            pye r3 = (defpackage.pye) r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            z80 r5 = defpackage.pye.o0
            java.lang.Object r3 = r3.d(r5, r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            boolean r4 = r1.contains(r3)
            if (r4 != 0) goto L_0x005c
            r1.add(r3)
            goto L_0x005c
        L_0x0082:
            java.util.Collections.sort(r1)
            java.util.Collections.reverse(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x008c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ca
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Iterator r3 = r13.iterator()
        L_0x00a0:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r3.next()
            pye r4 = (defpackage.pye) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            z80 r6 = defpackage.pye.o0
            java.lang.Object r5 = r4.d(r6, r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r2 != r5) goto L_0x00a0
            int r4 = r13.indexOf(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r14.add(r4)
            goto L_0x00a0
        L_0x00ca:
            ud r1 = r9.x
            r1.getClass()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r3 = r41.iterator()
        L_0x00d8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00ea
            java.lang.Object r4 = r3.next()
            k80 r4 = (defpackage.k80) r4
            zq4 r4 = r4.d
            r2.add(r4)
            goto L_0x00d8
        L_0x00ea:
            java.lang.Object r3 = r1.o
            mod r3 = (defpackage.mod) r3
            java.lang.Object r4 = r3.b
            dr4 r4 = (defpackage.dr4) r4
            java.util.Set r4 = r4.a()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r4)
            java.util.Iterator r6 = r2.iterator()
        L_0x00ff:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x010f
            java.lang.Object r7 = r6.next()
            zq4 r7 = (defpackage.zq4) r7
            defpackage.ud.w(r5, r7, r3)
            goto L_0x00ff
        L_0x010f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r16 = r14.iterator()
        L_0x0122:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x0169
            java.lang.Object r17 = r16.next()
            java.lang.Integer r17 = (java.lang.Integer) r17
            int r12 = r17.intValue()
            java.lang.Object r12 = r13.get(r12)
            pye r12 = (defpackage.pye) r12
            zq4 r15 = r12.n()
            zq4 r11 = defpackage.zq4.c
            boolean r11 = r15.equals(r11)
            if (r11 == 0) goto L_0x014a
            r8.add(r12)
            r20 = r13
            goto L_0x0163
        L_0x014a:
            int r11 = r15.a
            r20 = r13
            r13 = 2
            if (r11 == r13) goto L_0x0160
            int r13 = r15.b
            if (r11 == 0) goto L_0x0157
            if (r13 == 0) goto L_0x0160
        L_0x0157:
            if (r11 != 0) goto L_0x015c
            if (r13 == 0) goto L_0x015c
            goto L_0x0160
        L_0x015c:
            r6.add(r12)
            goto L_0x0163
        L_0x0160:
            r7.add(r12)
        L_0x0163:
            r11 = r41
            r13 = r20
            r15 = 0
            goto L_0x0122
        L_0x0169:
            r20 = r13
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.addAll(r6)
            r13.addAll(r7)
            r13.addAll(r8)
            java.util.Iterator r6 = r13.iterator()
        L_0x0187:
            boolean r7 = r6.hasNext()
            zq4 r13 = defpackage.zq4.d
            if (r7 == 0) goto L_0x02c7
            java.lang.Object r7 = r6.next()
            pye r7 = (defpackage.pye) r7
            zq4 r15 = r7.n()
            z80 r8 = defpackage.gde.c0
            java.lang.Object r8 = r7.h(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r15.b()
            if (r8 == 0) goto L_0x01bf
            boolean r8 = r5.contains(r15)
            if (r8 == 0) goto L_0x01b6
            r16 = r1
            r23 = r6
            r24 = r14
            r13 = r15
            goto L_0x0270
        L_0x01b6:
            r16 = r1
            r23 = r6
            r24 = r14
        L_0x01bc:
            r13 = 0
            goto L_0x0270
        L_0x01bf:
            int r8 = r15.a
            r23 = r6
            int r6 = r15.b
            r24 = r14
            r14 = 1
            if (r8 != r14) goto L_0x01d9
            if (r6 != 0) goto L_0x01d9
            boolean r6 = r5.contains(r13)
            if (r6 == 0) goto L_0x01d6
        L_0x01d2:
            r16 = r1
            goto L_0x0270
        L_0x01d6:
            r16 = r1
            goto L_0x01bc
        L_0x01d9:
            zq4 r14 = defpackage.ud.q(r15, r2, r5)
            if (r14 == 0) goto L_0x01ea
            r15.toString()
            r14.toString()
        L_0x01e5:
            r16 = r1
            r13 = r14
            goto L_0x0270
        L_0x01ea:
            zq4 r14 = defpackage.ud.q(r15, r12, r5)
            if (r14 == 0) goto L_0x01f7
            r15.toString()
            r14.toString()
            goto L_0x01e5
        L_0x01f7:
            boolean r14 = defpackage.ud.k(r15, r13, r5)
            if (r14 == 0) goto L_0x0204
            r15.toString()
            r13.toString()
            goto L_0x01d2
        L_0x0204:
            r14 = 2
            if (r8 != r14) goto L_0x023f
            r8 = 10
            if (r6 == r8) goto L_0x020d
            if (r6 != 0) goto L_0x023f
        L_0x020d:
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            int r8 = android.os.Build.VERSION.SDK_INT
            r14 = 33
            if (r8 < r14) goto L_0x0226
            java.lang.Object r8 = r1.c
            et1 r8 = (defpackage.et1) r8
            zq4 r8 = defpackage.br4.b(r8)
            if (r8 == 0) goto L_0x0227
            r6.add(r8)
            goto L_0x0227
        L_0x0226:
            r8 = 0
        L_0x0227:
            zq4 r14 = defpackage.zq4.e
            r6.add(r14)
            zq4 r6 = defpackage.ud.q(r15, r6, r5)
            if (r6 == 0) goto L_0x023f
            r6.equals(r8)
            r15.toString()
            r6.toString()
            r16 = r1
            r13 = r6
            goto L_0x0270
        L_0x023f:
            java.util.Iterator r6 = r5.iterator()
        L_0x0243:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x01d6
            java.lang.Object r8 = r6.next()
            zq4 r8 = (defpackage.zq4) r8
            boolean r14 = r8.b()
            r16 = r1
            java.lang.String r1 = "Candidate dynamic range must be fully specified."
            defpackage.e07.p(r1, r14)
            boolean r1 = r8.equals(r13)
            if (r1 == 0) goto L_0x0263
        L_0x0260:
            r1 = r16
            goto L_0x0243
        L_0x0263:
            boolean r1 = defpackage.ud.i(r15, r8)
            if (r1 == 0) goto L_0x0260
            r15.toString()
            r8.toString()
            r13 = r8
        L_0x0270:
            if (r13 == 0) goto L_0x0289
            defpackage.ud.w(r5, r13, r3)
            r11.put(r7, r13)
            boolean r1 = r2.contains(r13)
            if (r1 != 0) goto L_0x0281
            r12.add(r13)
        L_0x0281:
            r1 = r16
            r6 = r23
            r14 = r24
            goto L_0x0187
        L_0x0289:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            z80 r1 = defpackage.gde.c0
            java.lang.Object r1 = r7.h(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "\n  "
            java.lang.String r3 = android.text.TextUtils.join(r2, r4)
            java.lang.String r2 = android.text.TextUtils.join(r2, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = "\nRequested dynamic range:\n  "
            r4.append(r1)
            r4.append(r15)
            java.lang.String r1 = "\nSupported dynamic ranges:\n  "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = "\nConstrained set of concurrent dynamic ranges:\n  "
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x02c7:
            r24 = r14
            java.util.Iterator r1 = r41.iterator()
        L_0x02cd:
            boolean r2 = r1.hasNext()
            r3 = 4101(0x1005, float:5.747E-42)
            if (r2 == 0) goto L_0x02e1
            java.lang.Object r2 = r1.next()
            k80 r2 = (defpackage.k80) r2
            int r2 = r2.b
            if (r2 != r3) goto L_0x02cd
        L_0x02df:
            r1 = 1
            goto L_0x02fd
        L_0x02e1:
            java.util.Set r1 = r42.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x02e9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02fc
            java.lang.Object r2 = r1.next()
            pye r2 = (defpackage.pye) r2
            int r2 = r2.getInputFormat()
            if (r2 != r3) goto L_0x02e9
            goto L_0x02df
        L_0x02fc:
            r1 = 0
        L_0x02fd:
            java.util.Collection r2 = r11.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0305:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x031a
            java.lang.Object r3 = r2.next()
            zq4 r3 = (defpackage.zq4) r3
            int r3 = r3.b
            r4 = 10
            if (r3 != r4) goto L_0x0305
            r8 = 10
            goto L_0x031c
        L_0x031a:
            r8 = 8
        L_0x031c:
            java.lang.String r2 = r9.i
            java.lang.String r3 = "CONCURRENT_CAMERA"
            java.lang.String r4 = "ULTRA_HIGH_RESOLUTION_CAMERA"
            java.lang.String r5 = "DEFAULT"
            java.lang.String r6 = " camera mode."
            java.lang.String r7 = "Camera device id is "
            if (r10 == 0) goto L_0x0342
            if (r1 != 0) goto L_0x032d
            goto L_0x0342
        L_0x032d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            if (r10 == r1) goto L_0x0338
            r1 = 2
            if (r10 == r1) goto L_0x0337
            r3 = r5
            goto L_0x0338
        L_0x0337:
            r3 = r4
        L_0x0338:
            java.lang.String r1 = ". Ultra HDR is not currently supported in "
            java.lang.String r1 = c3d.i(r7, r2, r1, r3, r6)
            r0.<init>(r1)
            throw r0
        L_0x0342:
            if (r10 == 0) goto L_0x035e
            r12 = 10
            if (r8 == r12) goto L_0x0349
            goto L_0x035e
        L_0x0349:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            if (r10 == r1) goto L_0x0354
            r1 = 2
            if (r10 == r1) goto L_0x0353
            r3 = r5
            goto L_0x0354
        L_0x0353:
            r3 = r4
        L_0x0354:
            java.lang.String r1 = ". 10 bit dynamic range is not currently supported in "
            java.lang.String r1 = c3d.i(r7, r2, r1, r3, r6)
            r0.<init>(r1)
            throw r0
        L_0x035e:
            wa0 r12 = new wa0
            r2 = r43
            r12.<init>(r10, r8, r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r41.iterator()
        L_0x036e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0380
            java.lang.Object r3 = r2.next()
            k80 r3 = (defpackage.k80) r3
            xa0 r3 = r3.a
            r1.add(r3)
            goto L_0x036e
        L_0x0380:
            d63 r2 = new d63
            r3 = 0
            r2.<init>(r3)
            java.util.Set r3 = r42.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x038e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03d9
            java.lang.Object r4 = r3.next()
            pye r4 = (defpackage.pye) r4
            java.lang.Object r5 = r0.get(r4)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x03aa
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x03aa
            r6 = 1
            goto L_0x03ab
        L_0x03aa:
            r6 = 0
        L_0x03ab:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "No available output size is found for "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r8 = "."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            defpackage.e07.j(r7, r6)
            java.lang.Object r5 = java.util.Collections.min(r5, r2)
            android.util.Size r5 = (android.util.Size) r5
            int r4 = r4.getInputFormat()
            int r6 = r12.a
            db0 r7 = r9.i(r4)
            xa0 r4 = defpackage.xa0.b(r6, r4, r5, r7)
            r1.add(r4)
            goto L_0x038e
        L_0x03d9:
            boolean r14 = r9.a(r12, r1)
            java.lang.String r15 = ".  May be attempting to bind too many use cases. Existing surfaces: "
            java.lang.String r8 = " New configs: "
            java.lang.String r7 = "No supported surface combination is found for camera device - Id : "
            if (r14 == 0) goto L_0x0f04
            java.util.Iterator r1 = r41.iterator()
            r2 = 0
        L_0x03ea:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0403
            java.lang.Object r3 = r1.next()
            k80 r3 = (defpackage.k80) r3
            android.util.Range r3 = r3.g
            if (r2 != 0) goto L_0x03fc
            r2 = r3
            goto L_0x03ea
        L_0x03fc:
            if (r3 == 0) goto L_0x03ea
            android.util.Range r2 = r2.intersect(r3)     // Catch:{ IllegalArgumentException -> 0x03ea }
            goto L_0x03ea
        L_0x0403:
            java.util.Iterator r1 = r24.iterator()
            r6 = r2
        L_0x0408:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0437
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5 = r20
            java.lang.Object r2 = r5.get(r2)
            pye r2 = (defpackage.pye) r2
            z80 r3 = defpackage.pye.p0
            r4 = 0
            java.lang.Object r2 = r2.d(r3, r4)
            android.util.Range r2 = (android.util.Range) r2
            if (r6 != 0) goto L_0x042d
        L_0x042b:
            r6 = r2
            goto L_0x0434
        L_0x042d:
            if (r2 == 0) goto L_0x0434
            android.util.Range r2 = r6.intersect(r2)     // Catch:{ IllegalArgumentException -> 0x0434 }
            goto L_0x042b
        L_0x0434:
            r20 = r5
            goto L_0x0408
        L_0x0437:
            r5 = r20
            r4 = 0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r2 = r42.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0447:
            boolean r3 = r2.hasNext()
            r20 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            if (r3 == 0) goto L_0x0504
            java.lang.Object r3 = r2.next()
            pye r3 = (defpackage.pye) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.Object r23 = r0.get(r3)
            java.util.List r23 = (java.util.List) r23
            java.util.Iterator r23 = r23.iterator()
        L_0x046c:
            boolean r25 = r23.hasNext()
            if (r25 == 0) goto L_0x04ee
            java.lang.Object r25 = r23.next()
            r0 = r25
            android.util.Size r0 = (android.util.Size) r0
            r25 = r2
            int r2 = r3.getInputFormat()
            r26 = r7
            int r7 = r12.a
            r27 = r8
            db0 r8 = r9.i(r2)
            xa0 r7 = defpackage.xa0.b(r7, r2, r0, r8)
            if (r6 == 0) goto L_0x04af
            et1 r8 = r9.k
            r28 = r6
            android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ Exception -> 0x04a9 }
            java.lang.Object r6 = r8.a(r6)     // Catch:{ Exception -> 0x04a9 }
            android.hardware.camera2.params.StreamConfigurationMap r6 = (android.hardware.camera2.params.StreamConfigurationMap) r6     // Catch:{ Exception -> 0x04a9 }
            r29 = r13
            r30 = r14
            long r13 = r6.getOutputMinFrameDuration(r2, r0)     // Catch:{ Exception -> 0x04ad }
            double r13 = (double) r13
            double r13 = r20 / r13
            int r2 = (int) r13
            goto L_0x04b8
        L_0x04a9:
            r29 = r13
            r30 = r14
        L_0x04ad:
            r2 = 0
            goto L_0x04b8
        L_0x04af:
            r28 = r6
            r29 = r13
            r30 = r14
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x04b8:
            j4e r6 = r7.b
            java.lang.Object r7 = r10.get(r6)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 != 0) goto L_0x04ca
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r10.put(r6, r7)
        L_0x04ca:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r6 = r7.contains(r6)
            if (r6 != 0) goto L_0x04de
            r4.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r7.add(r0)
        L_0x04de:
            r0 = r42
            r2 = r25
            r7 = r26
            r8 = r27
            r6 = r28
            r13 = r29
            r14 = r30
            goto L_0x046c
        L_0x04ee:
            r25 = r2
            r28 = r6
            r26 = r7
            r27 = r8
            r29 = r13
            r30 = r14
            r1.put(r3, r4)
            r10 = r40
            r0 = r42
            r4 = 0
            goto L_0x0447
        L_0x0504:
            r28 = r6
            r26 = r7
            r27 = r8
            r29 = r13
            r30 = r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r24.iterator()
        L_0x0517:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x05fd
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r3 = r5.get(r3)
            pye r3 = (defpackage.pye) r3
            java.lang.Object r4 = r1.get(r3)
            java.util.List r4 = (java.util.List) r4
            int r3 = r3.getInputFormat()
            zl3 r6 = r9.v
            et1 r7 = r9.k
            r6.getClass()
            xe6 r6 = defpackage.zf4.a
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.class
            zkb r6 = r6.j(r8)
            androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk r6 = (androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk) r6
            if (r6 == 0) goto L_0x054c
        L_0x054a:
            r13 = 2
            goto L_0x055c
        L_0x054c:
            xe6 r6 = ct0.k(r7)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk> r7 = androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk.class
            zkb r6 = r6.j(r7)
            androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk r6 = (androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk) r6
            if (r6 == 0) goto L_0x055b
            goto L_0x054a
        L_0x055b:
            r13 = 3
        L_0x055c:
            if (r13 == 0) goto L_0x058a
            r6 = 1
            if (r13 == r6) goto L_0x0586
            r6 = 2
            if (r13 == r6) goto L_0x0566
            r8 = 0
            goto L_0x058d
        L_0x0566:
            r7 = 256(0x100, float:3.59E-43)
            db0 r8 = r9.i(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.Map r8 = r8.f
            java.lang.Object r7 = r8.get(r7)
            android.util.Size r7 = (android.util.Size) r7
            android.util.Rational r8 = new android.util.Rational
            int r10 = r7.getWidth()
            int r7 = r7.getHeight()
            r8.<init>(r10, r7)
            goto L_0x058d
        L_0x0586:
            r6 = 2
            android.util.Rational r8 = defpackage.os.c
            goto L_0x058d
        L_0x058a:
            r6 = 2
            android.util.Rational r8 = defpackage.os.a
        L_0x058d:
            if (r8 != 0) goto L_0x0590
            goto L_0x05c1
        L_0x0590:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x059e:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x05bc
            java.lang.Object r13 = r4.next()
            android.util.Size r13 = (android.util.Size) r13
            android.util.Rational r14 = defpackage.os.a
            android.util.Size r14 = defpackage.hjd.c
            boolean r14 = defpackage.os.a(r13, r8, r14)
            if (r14 == 0) goto L_0x05b8
            r7.add(r13)
            goto L_0x059e
        L_0x05b8:
            r10.add(r13)
            goto L_0x059e
        L_0x05bc:
            r13 = 0
            r10.addAll(r13, r7)
            r4 = r10
        L_0x05c1:
            nfc r7 = r9.w
            int r3 = defpackage.xa0.a(r3)
            java.lang.Object r7 = r7.b
            androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk r7 = (androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk) r7
            if (r7 != 0) goto L_0x05ce
            goto L_0x05f8
        L_0x05ce:
            android.util.Size r3 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.e(r3)
            if (r3 != 0) goto L_0x05d5
            goto L_0x05f8
        L_0x05d5:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r7.add(r3)
            java.util.Iterator r4 = r4.iterator()
        L_0x05e1:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x05f7
            java.lang.Object r8 = r4.next()
            android.util.Size r8 = (android.util.Size) r8
            boolean r10 = r8.equals(r3)
            if (r10 != 0) goto L_0x05e1
            r7.add(r8)
            goto L_0x05e1
        L_0x05f7:
            r4 = r7
        L_0x05f8:
            r0.add(r4)
            goto L_0x0517
        L_0x05fd:
            java.util.Iterator r1 = r0.iterator()
            r2 = 1
        L_0x0602:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0614
            java.lang.Object r3 = r1.next()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            int r2 = r2 * r3
            goto L_0x0602
        L_0x0614:
            if (r2 == 0) goto L_0x0efc
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r1 = 0
        L_0x061c:
            if (r1 >= r2) goto L_0x0629
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10.add(r3)
            r3 = 1
            int r1 = r1 + r3
            goto L_0x061c
        L_0x0629:
            r1 = 0
            java.lang.Object r3 = r0.get(r1)
            java.util.List r3 = (java.util.List) r3
            int r1 = r3.size()
            int r1 = r2 / r1
            r4 = r2
            r3 = 0
        L_0x0638:
            int r6 = r0.size()
            if (r3 >= r6) goto L_0x0679
            java.lang.Object r6 = r0.get(r3)
            java.util.List r6 = (java.util.List) r6
            r7 = 0
        L_0x0645:
            if (r7 >= r2) goto L_0x065c
            java.lang.Object r8 = r10.get(r7)
            java.util.List r8 = (java.util.List) r8
            int r13 = r7 % r4
            int r13 = r13 / r1
            java.lang.Object r13 = r6.get(r13)
            android.util.Size r13 = (android.util.Size) r13
            r8.add(r13)
            r8 = 1
            int r7 = r7 + r8
            goto L_0x0645
        L_0x065c:
            r8 = 1
            int r6 = r0.size()
            int r6 = r6 - r8
            if (r3 >= r6) goto L_0x0677
            int r4 = r3 + 1
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            int r4 = r1 / r4
            r38 = r4
            r4 = r1
            r1 = r38
        L_0x0677:
            int r3 = r3 + r8
            goto L_0x0638
        L_0x0679:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            z80 r0 = defpackage.pzd.a
            java.util.Iterator r0 = r41.iterator()
        L_0x0693:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x06b2
            java.lang.Object r1 = r0.next()
            k80 r1 = (defpackage.k80) r1
            java.util.List r2 = r1.e
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            rye r2 = (defpackage.rye) r2
            ia3 r1 = r1.f
            boolean r1 = defpackage.pzd.c(r1, r2)
            if (r1 == 0) goto L_0x0693
        L_0x06b0:
            r0 = 1
            goto L_0x06ce
        L_0x06b2:
            java.util.Iterator r0 = r5.iterator()
        L_0x06b6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x06cd
            java.lang.Object r1 = r0.next()
            pye r1 = (defpackage.pye) r1
            rye r2 = r1.t()
            boolean r1 = defpackage.pzd.c(r1, r2)
            if (r1 == 0) goto L_0x06b6
            goto L_0x06b0
        L_0x06cd:
            r0 = 0
        L_0x06ce:
            java.util.Iterator r1 = r41.iterator()
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x06d5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0702
            java.lang.Object r2 = r1.next()
            k80 r2 = (defpackage.k80) r2
            int r3 = r2.b
            android.util.Size r2 = r2.c
            et1 r4 = r9.k
            r42 = r1
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ Exception -> 0x06fa }
            java.lang.Object r1 = r4.a(r1)     // Catch:{ Exception -> 0x06fa }
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1     // Catch:{ Exception -> 0x06fa }
            long r1 = r1.getOutputMinFrameDuration(r3, r2)     // Catch:{ Exception -> 0x06fa }
            double r1 = (double) r1
            double r1 = r20 / r1
            int r3 = (int) r1
            goto L_0x06fb
        L_0x06fa:
            r3 = 0
        L_0x06fb:
            int r6 = java.lang.Math.min(r6, r3)
            r1 = r42
            goto L_0x06d5
        L_0x0702:
            boolean r1 = r9.q
            java.lang.String r4 = "SurfaceConfig does not map to any use case"
            if (r1 == 0) goto L_0x0889
            if (r0 != 0) goto L_0x0889
            java.util.Iterator r17 = r10.iterator()
            r0 = 0
        L_0x070f:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0845
            java.lang.Object r0 = r17.next()
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            r0 = r39
            r1 = r40
            r2 = r41
            r42 = r13
            r20 = 0
            r13 = r4
            r4 = r5
            r21 = r14
            r14 = r5
            r5 = r24
            r23 = r6
            r22 = r11
            r11 = r28
            r25 = r7
            r11 = r26
            r7 = r8
            r26 = r10
            r10 = r27
            r27 = r14
            r14 = r8
            r8 = r25
            android.util.Pair r0 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.first
            java.util.List r0 = (java.util.List) r0
            java.util.List r4 = r9.d(r12, r0)
            if (r4 == 0) goto L_0x07d9
            r3 = 0
        L_0x0750:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x07d9
            java.lang.Object r0 = r4.get(r3)
            xa0 r0 = (defpackage.xa0) r0
            long r0 = r0.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r14.containsKey(r2)
            rye r5 = defpackage.rye.X
            if (r2 == 0) goto L_0x0795
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r14.get(r2)
            k80 r2 = (defpackage.k80) r2
            java.util.List r6 = r2.e
            int r6 = r6.size()
            java.util.List r2 = r2.e
            r7 = 1
            if (r6 != r7) goto L_0x0787
            r8 = 0
            java.lang.Object r5 = r2.get(r8)
            rye r5 = (defpackage.rye) r5
            goto L_0x0788
        L_0x0787:
            r8 = 0
        L_0x0788:
            boolean r0 = defpackage.pzd.b(r5, r0, r2)
            if (r0 != 0) goto L_0x0791
            r7 = r25
            goto L_0x07cb
        L_0x0791:
            r7 = r25
        L_0x0793:
            r0 = 1
            goto L_0x07ce
        L_0x0795:
            r8 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r7 = r25
            boolean r2 = r7.containsKey(r2)
            if (r2 == 0) goto L_0x07d3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r7.get(r2)
            pye r2 = (defpackage.pye) r2
            rye r6 = r2.t()
            rye r8 = r2.t()
            if (r8 != r5) goto L_0x07c1
            ozd r2 = (defpackage.ozd) r2
            z80 r5 = defpackage.ozd.b
            java.lang.Object r2 = r2.h(r5)
            java.util.List r2 = (java.util.List) r2
            goto L_0x07c5
        L_0x07c1:
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x07c5:
            boolean r0 = defpackage.pzd.b(r6, r0, r2)
            if (r0 != 0) goto L_0x0793
        L_0x07cb:
            r4 = r20
            goto L_0x07db
        L_0x07ce:
            int r3 = r3 + r0
            r25 = r7
            goto L_0x0750
        L_0x07d3:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r13)
            throw r0
        L_0x07d9:
            r7 = r25
        L_0x07db:
            if (r4 == 0) goto L_0x082a
            et1 r0 = r9.k
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 >= r2) goto L_0x07e6
            goto L_0x0827
        L_0x07e6:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            java.lang.Object r0 = r0.a(r1)
            long[] r0 = (long[]) r0
            if (r0 == 0) goto L_0x0827
            int r1 = r0.length
            if (r1 != 0) goto L_0x07f6
            goto L_0x0827
        L_0x07f6:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        L_0x07fd:
            if (r3 >= r2) goto L_0x080b
            r5 = r0[r3]
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r1.add(r5)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x07fd
        L_0x080b:
            java.util.Iterator r0 = r4.iterator()
        L_0x080f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x085a
            java.lang.Object r2 = r0.next()
            xa0 r2 = (defpackage.xa0) r2
            long r2 = r2.c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L_0x080f
        L_0x0827:
            r0 = r20
            goto L_0x082b
        L_0x082a:
            r0 = r4
        L_0x082b:
            r14.clear()
            r7.clear()
            r4 = r13
            r8 = r14
            r14 = r21
            r6 = r23
            r5 = r27
            r13 = r42
            r27 = r10
            r10 = r26
            r26 = r11
            r11 = r22
            goto L_0x070f
        L_0x0845:
            r23 = r6
            r22 = r11
            r42 = r13
            r21 = r14
            r11 = r26
            r20 = 0
            r13 = r4
            r14 = r8
            r26 = r10
            r10 = r27
            r27 = r5
            r4 = r0
        L_0x085a:
            if (r4 != 0) goto L_0x085e
            if (r30 == 0) goto L_0x0863
        L_0x085e:
            r15 = r41
            r8 = r27
            goto L_0x0887
        L_0x0863:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r11)
            java.lang.String r2 = r9.i
            r1.append(r2)
            r1.append(r15)
            r15 = r41
            r1.append(r15)
            r1.append(r10)
            r8 = r27
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0887:
            r6 = r4
            goto L_0x08a0
        L_0x0889:
            r15 = r41
            r23 = r6
            r22 = r11
            r42 = r13
            r21 = r14
            r11 = r26
            r20 = 0
            r13 = r4
            r14 = r8
            r26 = r10
            r10 = r27
            r8 = r5
            r6 = r20
        L_0x08a0:
            java.util.Iterator r17 = r26.iterator()
            r25 = r20
            r26 = r25
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r27 = 0
            r30 = 0
        L_0x08b2:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x096f
            java.lang.Object r0 = r17.next()
            r31 = r0
            java.util.List r31 = (java.util.List) r31
            r32 = 0
            r33 = 0
            r0 = r39
            r1 = r40
            r2 = r41
            r3 = r31
            r34 = r4
            r4 = r8
            r35 = r5
            r5 = r24
            r36 = r6
            r6 = r23
            r37 = r10
            r10 = r7
            r7 = r32
            r32 = r8
            r18 = 0
            r8 = r33
            android.util.Pair r0 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r0.first
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r5 = r0.intValue()
            if (r28 == 0) goto L_0x0905
            if (r6 <= r5) goto L_0x0905
            java.lang.Comparable r0 = r28.getLower()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r5 >= r0) goto L_0x0905
            r0 = r18
            goto L_0x0906
        L_0x0905:
            r0 = 1
        L_0x0906:
            if (r27 != 0) goto L_0x0934
            boolean r2 = r9.a(r12, r1)
            if (r2 == 0) goto L_0x0934
            r3 = r35
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto L_0x0916
            goto L_0x0918
        L_0x0916:
            if (r3 >= r5) goto L_0x091b
        L_0x0918:
            r3 = r5
            r25 = r31
        L_0x091b:
            if (r0 == 0) goto L_0x0931
            if (r30 == 0) goto L_0x0929
            r1 = r26
            r0 = r31
            r2 = r34
            r4 = r36
            goto L_0x097d
        L_0x0929:
            r3 = r5
            r25 = r31
            r4 = r36
            r27 = 1
            goto L_0x0937
        L_0x0931:
            r4 = r36
            goto L_0x0937
        L_0x0934:
            r3 = r35
            goto L_0x0931
        L_0x0937:
            if (r4 == 0) goto L_0x095e
            if (r30 != 0) goto L_0x095e
            java.util.List r1 = r9.d(r12, r1)
            if (r1 == 0) goto L_0x095e
            r2 = r34
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x0949
            goto L_0x094b
        L_0x0949:
            if (r2 >= r5) goto L_0x094e
        L_0x094b:
            r2 = r5
            r26 = r31
        L_0x094e:
            if (r0 == 0) goto L_0x0963
            r2 = r5
            if (r27 == 0) goto L_0x0959
            r0 = r25
            r1 = r31
            r5 = r3
            goto L_0x097d
        L_0x0959:
            r26 = r31
            r30 = 1
            goto L_0x0963
        L_0x095e:
            r2 = r34
            r1 = 2147483647(0x7fffffff, float:NaN)
        L_0x0963:
            r5 = r3
            r23 = r6
            r7 = r10
            r8 = r32
            r10 = r37
            r6 = r4
            r4 = r2
            goto L_0x08b2
        L_0x096f:
            r2 = r4
            r3 = r5
            r4 = r6
            r32 = r8
            r37 = r10
            r18 = 0
            r10 = r7
            r0 = r25
            r1 = r26
        L_0x097d:
            if (r0 == 0) goto L_0x0ecb
            if (r28 == 0) goto L_0x0b38
            android.util.Range r3 = defpackage.va0.f
            r6 = r28
            boolean r7 = r6.equals(r3)
            if (r7 == 0) goto L_0x099b
        L_0x098b:
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r26 = r10
            r23 = r13
            r25 = r14
            goto L_0x0b48
        L_0x099b:
            et1 r7 = r9.k
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r7 = r7.a(r8)
            android.util.Range[] r7 = (android.util.Range[]) r7
            if (r7 != 0) goto L_0x09a8
            goto L_0x098b
        L_0x09a8:
            android.util.Range r8 = new android.util.Range
            java.lang.Comparable r11 = r6.getLower()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            int r11 = java.lang.Math.min(r11, r5)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Comparable r6 = r6.getUpper()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = java.lang.Math.min(r6, r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.<init>(r11, r6)
            int r6 = r7.length
            r11 = r3
            r3 = r18
            r12 = r3
        L_0x09d6:
            if (r3 >= r6) goto L_0x0b2c
            r17 = r6
            r6 = r7[r3]
            java.lang.Comparable r20 = r6.getLower()
            java.lang.Integer r20 = (java.lang.Integer) r20
            r40 = r7
            int r7 = r20.intValue()
            if (r5 < r7) goto L_0x0b06
            android.util.Range r7 = defpackage.va0.f
            boolean r7 = r11.equals(r7)
            if (r7 == 0) goto L_0x09f3
            r11 = r6
        L_0x09f3:
            boolean r7 = r6.equals(r8)
            if (r7 == 0) goto L_0x0a0a
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r11 = r6
        L_0x0a02:
            r26 = r10
            r23 = r13
            r25 = r14
            goto L_0x0b36
        L_0x0a0a:
            android.util.Range r7 = r6.intersect(r8)     // Catch:{ IllegalArgumentException -> 0x0abf }
            int r7 = f(r7)     // Catch:{ IllegalArgumentException -> 0x0abf }
            if (r12 != 0) goto L_0x0a25
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r12 = r7
            r26 = r10
            r23 = r13
            r25 = r14
            goto L_0x0abc
        L_0x0a25:
            if (r7 < r12) goto L_0x0aad
            android.util.Range r7 = r11.intersect(r8)     // Catch:{ IllegalArgumentException -> 0x0abf }
            int r7 = f(r7)     // Catch:{ IllegalArgumentException -> 0x0abf }
            r23 = r13
            r25 = r14
            double r13 = (double) r7
            android.util.Range r7 = r6.intersect(r8)     // Catch:{ IllegalArgumentException -> 0x0aa2 }
            int r7 = f(r7)     // Catch:{ IllegalArgumentException -> 0x0aa2 }
            r26 = r10
            double r9 = (double) r7
            int r7 = f(r6)     // Catch:{ IllegalArgumentException -> 0x0a9d }
            r43 = r1
            r27 = r2
            double r1 = (double) r7
            double r1 = r9 / r1
            int r7 = f(r11)     // Catch:{ IllegalArgumentException -> 0x0a98 }
            r36 = r4
            r28 = r5
            double r4 = (double) r7
            double r4 = r13 / r4
            int r7 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r7 <= 0) goto L_0x0a65
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0a63
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x0a8e
        L_0x0a63:
            r11 = r6
            goto L_0x0a8e
        L_0x0a65:
            if (r7 != 0) goto L_0x0a85
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0a6c
            goto L_0x0a63
        L_0x0a6c:
            if (r1 != 0) goto L_0x0a8e
            java.lang.Comparable r1 = r6.getLower()     // Catch:{ IllegalArgumentException -> 0x0acd }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalArgumentException -> 0x0acd }
            int r1 = r1.intValue()     // Catch:{ IllegalArgumentException -> 0x0acd }
            java.lang.Comparable r2 = r11.getLower()     // Catch:{ IllegalArgumentException -> 0x0acd }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ IllegalArgumentException -> 0x0acd }
            int r2 = r2.intValue()     // Catch:{ IllegalArgumentException -> 0x0acd }
            if (r1 <= r2) goto L_0x0a8e
            goto L_0x0a63
        L_0x0a85:
            int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0a8e
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x0a8e
            goto L_0x0a63
        L_0x0a8e:
            android.util.Range r1 = r8.intersect(r11)     // Catch:{ IllegalArgumentException -> 0x0acd }
            int r12 = f(r1)     // Catch:{ IllegalArgumentException -> 0x0acd }
        L_0x0a96:
            r6 = r11
            goto L_0x0abc
        L_0x0a98:
            r36 = r4
            r28 = r5
            goto L_0x0acd
        L_0x0a9d:
            r43 = r1
            r27 = r2
            goto L_0x0a98
        L_0x0aa2:
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r26 = r10
            goto L_0x0acd
        L_0x0aad:
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r26 = r10
            r23 = r13
            r25 = r14
            goto L_0x0a96
        L_0x0abc:
            r11 = r6
        L_0x0abd:
            r1 = 1
            goto L_0x0b15
        L_0x0abf:
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r26 = r10
            r23 = r13
            r25 = r14
        L_0x0acd:
            if (r12 != 0) goto L_0x0abd
            int r1 = e(r6, r8)
            int r2 = e(r11, r8)
            if (r1 >= r2) goto L_0x0ada
            goto L_0x0b05
        L_0x0ada:
            int r1 = e(r6, r8)
            int r2 = e(r11, r8)
            if (r1 != r2) goto L_0x0abd
            java.lang.Comparable r1 = r6.getLower()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Comparable r2 = r11.getUpper()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 <= r2) goto L_0x0afb
            goto L_0x0b05
        L_0x0afb:
            int r1 = f(r6)
            int r2 = f(r11)
            if (r1 >= r2) goto L_0x0abd
        L_0x0b05:
            goto L_0x0abc
        L_0x0b06:
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r26 = r10
            r23 = r13
            r25 = r14
            goto L_0x0abd
        L_0x0b15:
            int r3 = r3 + r1
            r9 = r39
            r7 = r40
            r1 = r43
            r6 = r17
            r13 = r23
            r14 = r25
            r10 = r26
            r2 = r27
            r5 = r28
            r4 = r36
            goto L_0x09d6
        L_0x0b2c:
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            goto L_0x0a02
        L_0x0b36:
            r3 = r11
            goto L_0x0b48
        L_0x0b38:
            r43 = r1
            r27 = r2
            r36 = r4
            r28 = r5
            r26 = r10
            r23 = r13
            r25 = r14
            r3 = r20
        L_0x0b48:
            java.util.Iterator r1 = r32.iterator()
        L_0x0b4c:
            boolean r2 = r1.hasNext()
            java.lang.String r4 = "Null resolution"
            java.lang.String r5 = "Null expectedFrameRateRange"
            if (r2 == 0) goto L_0x0c12
            java.lang.Object r2 = r1.next()
            pye r2 = (defpackage.pye) r2
            r6 = r32
            int r7 = r6.indexOf(r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = r24
            int r7 = r8.indexOf(r7)
            java.lang.Object r7 = r0.get(r7)
            android.util.Size r7 = (android.util.Size) r7
            android.util.Range r9 = defpackage.va0.f
            uwb r9 = new uwb
            r10 = 1
            r9.<init>(r10)
            if (r7 == 0) goto L_0x0c0c
            r9.b = r7
            android.util.Range r4 = defpackage.va0.f
            if (r4 == 0) goto L_0x0c06
            r9.d = r4
            r7 = r29
            r9.c = r7
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r9.f = r4
            r4 = r22
            java.lang.Object r5 = r4.get(r2)
            zq4 r5 = (defpackage.zq4) r5
            r5.getClass()
            r9.c = r5
            fc9 r5 = defpackage.fc9.c()
            z80 r10 = defpackage.js1.Y
            boolean r11 = r2.l(r10)
            if (r11 == 0) goto L_0x0bae
            java.lang.Object r11 = r2.h(r10)
            java.lang.Long r11 = (java.lang.Long) r11
            r5.j(r10, r11)
        L_0x0bae:
            z80 r10 = defpackage.pye.q0
            boolean r11 = r2.l(r10)
            if (r11 == 0) goto L_0x0bbf
            java.lang.Object r11 = r2.h(r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r5.j(r10, r11)
        L_0x0bbf:
            z80 r10 = defpackage.cq6.b
            boolean r11 = r2.l(r10)
            if (r11 == 0) goto L_0x0bd0
            java.lang.Object r11 = r2.h(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            r5.j(r10, r11)
        L_0x0bd0:
            z80 r10 = defpackage.qq6.z
            boolean r11 = r2.l(r10)
            if (r11 == 0) goto L_0x0be1
            java.lang.Object r11 = r2.h(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            r5.j(r10, r11)
        L_0x0be1:
            js1 r10 = new js1
            r11 = 7
            r10.<init>(r11, r5)
            r9.e = r10
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r44)
            r9.f = r5
            if (r3 == 0) goto L_0x0bf3
            r9.d = r3
        L_0x0bf3:
            va0 r5 = r9.i()
            r9 = r21
            r9.put(r2, r5)
            r22 = r4
            r32 = r6
            r29 = r7
            r24 = r8
            goto L_0x0b4c
        L_0x0c06:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x0c0c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0c12:
            r9 = r21
            r7 = r29
            if (r36 == 0) goto L_0x0c42
            r2 = r27
            r3 = r28
            if (r3 != r2) goto L_0x0c42
            int r1 = r0.size()
            int r2 = r43.size()
            if (r1 != r2) goto L_0x0c42
            r3 = r18
        L_0x0c2a:
            int r1 = r0.size()
            if (r3 >= r1) goto L_0x0c4b
            java.lang.Object r1 = r0.get(r3)
            android.util.Size r1 = (android.util.Size) r1
            r2 = r43
            java.lang.Object r6 = r2.get(r3)
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0c46
        L_0x0c42:
            r8 = r42
            goto L_0x0ec5
        L_0x0c46:
            r1 = 1
            int r3 = r3 + r1
            r43 = r2
            goto L_0x0c2a
        L_0x0c4b:
            r1 = r39
            et1 r0 = r1.k
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "Null dynamicRange"
            r3 = 33
            if (r1 >= r3) goto L_0x0c5b
        L_0x0c57:
            r8 = r42
            goto L_0x0e0c
        L_0x0c5b:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r3 = r9.keySet()
            r1.<init>(r3)
            java.util.Iterator r3 = r41.iterator()
        L_0x0c68:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0c7a
            java.lang.Object r6 = r3.next()
            k80 r6 = (defpackage.k80) r6
            ia3 r6 = r6.f
            r6.getClass()
            goto L_0x0c68
        L_0x0c7a:
            java.util.Iterator r3 = r1.iterator()
        L_0x0c7e:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0c99
            java.lang.Object r6 = r3.next()
            pye r6 = (defpackage.pye) r6
            java.lang.Object r6 = r9.get(r6)
            va0 r6 = (defpackage.va0) r6
            r6.getClass()
            ia3 r6 = r6.d
            r6.getClass()
            goto L_0x0c7e
        L_0x0c99:
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            java.lang.Object r0 = r0.a(r3)
            long[] r0 = (long[]) r0
            if (r0 == 0) goto L_0x0c57
            int r3 = r0.length
            if (r3 != 0) goto L_0x0ca9
            goto L_0x0c57
        L_0x0ca9:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            int r6 = r0.length
            r8 = r18
        L_0x0cb1:
            if (r8 >= r6) goto L_0x0cbf
            r10 = r0[r8]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r3.add(r10)
            r10 = 1
            int r8 = r8 + r10
            goto L_0x0cb1
        L_0x0cbf:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r6 = r41.iterator()
            boolean r8 = r6.hasNext()
            r10 = 0
            if (r8 == 0) goto L_0x0cf9
            java.lang.Object r6 = r6.next()
            k80 r6 = (defpackage.k80) r6
            ia3 r8 = r6.f
            z80 r12 = defpackage.js1.Y
            boolean r8 = r8.l(r12)
            if (r8 != 0) goto L_0x0ce4
        L_0x0ce0:
            r6 = r18
            r8 = 1
            goto L_0x0cfc
        L_0x0ce4:
            ia3 r6 = r6.f
            java.lang.Object r6 = r6.h(r12)
            java.lang.Long r6 = (java.lang.Long) r6
            long r12 = r6.longValue()
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0cf5
            goto L_0x0ce0
        L_0x0cf5:
            r8 = r18
            r6 = 1
            goto L_0x0cfc
        L_0x0cf9:
            r6 = r18
            r8 = r6
        L_0x0cfc:
            java.util.Iterator r12 = r1.iterator()
        L_0x0d00:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0d4b
            java.lang.Object r13 = r12.next()
            pye r13 = (defpackage.pye) r13
            z80 r14 = defpackage.js1.Y
            boolean r16 = r13.l(r14)
            java.lang.String r10 = "Either all use cases must have non-default stream use case assigned or none should have it"
            if (r16 != 0) goto L_0x0d22
            if (r6 != 0) goto L_0x0d1c
            r8 = 1
            r16 = 0
            goto L_0x0d42
        L_0x0d1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x0d22:
            java.lang.Object r11 = r13.h(r14)
            java.lang.Long r11 = (java.lang.Long) r11
            long r13 = r11.longValue()
            r16 = 0
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x0d3c
            if (r6 != 0) goto L_0x0d36
            r8 = 1
            goto L_0x0d42
        L_0x0d36:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x0d3c:
            if (r8 != 0) goto L_0x0d45
            r0.add(r11)
            r6 = 1
        L_0x0d42:
            r10 = r16
            goto L_0x0d00
        L_0x0d45:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x0d4b:
            if (r8 != 0) goto L_0x0c57
            java.util.Iterator r0 = r0.iterator()
        L_0x0d51:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0d65
            java.lang.Object r6 = r0.next()
            java.lang.Long r6 = (java.lang.Long) r6
            boolean r6 = r3.contains(r6)
            if (r6 != 0) goto L_0x0d51
            goto L_0x0c57
        L_0x0d65:
            java.util.Iterator r0 = r41.iterator()
        L_0x0d69:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0dd2
            java.lang.Object r3 = r0.next()
            k80 r3 = (defpackage.k80) r3
            ia3 r6 = r3.f
            z80 r8 = defpackage.js1.Y
            java.lang.Object r8 = r6.h(r8)
            java.lang.Long r8 = (java.lang.Long) r8
            long r10 = r8.longValue()
            js1 r6 = defpackage.pzd.a(r6, r10)
            if (r6 == 0) goto L_0x0dcd
            android.util.Range r8 = defpackage.va0.f
            uwb r8 = new uwb
            r10 = 1
            r8.<init>(r10)
            android.util.Size r10 = r3.c
            if (r10 == 0) goto L_0x0dc7
            r8.b = r10
            android.util.Range r10 = defpackage.va0.f
            if (r10 == 0) goto L_0x0dc1
            r8.d = r10
            r8.c = r7
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r8.f = r10
            zq4 r10 = r3.d
            if (r10 == 0) goto L_0x0dbb
            r8.c = r10
            r8.e = r6
            android.util.Range r6 = r3.g
            if (r6 == 0) goto L_0x0db1
            r8.d = r6
        L_0x0db1:
            va0 r6 = r8.i()
            r8 = r42
            r8.put(r3, r6)
            goto L_0x0dcf
        L_0x0dbb:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x0dc1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x0dc7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0dcd:
            r8 = r42
        L_0x0dcf:
            r42 = r8
            goto L_0x0d69
        L_0x0dd2:
            r8 = r42
            java.util.Iterator r0 = r1.iterator()
        L_0x0dd8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0ec5
            java.lang.Object r1 = r0.next()
            pye r1 = (defpackage.pye) r1
            java.lang.Object r2 = r9.get(r1)
            va0 r2 = (defpackage.va0) r2
            ia3 r3 = r2.d
            z80 r4 = defpackage.js1.Y
            java.lang.Object r4 = r3.h(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            js1 r3 = defpackage.pzd.a(r3, r4)
            if (r3 == 0) goto L_0x0dd8
            uwb r2 = r2.a()
            r2.e = r3
            va0 r2 = r2.i()
            r9.put(r1, r2)
            goto L_0x0dd8
        L_0x0e0c:
            r15 = r18
        L_0x0e0e:
            int r0 = r36.size()
            if (r15 >= r0) goto L_0x0ec5
            r0 = r36
            java.lang.Object r1 = r0.get(r15)
            xa0 r1 = (defpackage.xa0) r1
            long r10 = r1.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r3 = r25
            boolean r1 = r3.containsKey(r1)
            if (r1 == 0) goto L_0x0e82
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            java.lang.Object r1 = r3.get(r1)
            k80 r1 = (defpackage.k80) r1
            ia3 r6 = r1.f
            js1 r6 = defpackage.pzd.a(r6, r10)
            if (r6 == 0) goto L_0x0e7e
            android.util.Range r10 = defpackage.va0.f
            uwb r10 = new uwb
            r11 = 1
            r10.<init>(r11)
            android.util.Size r11 = r1.c
            if (r11 == 0) goto L_0x0e78
            r10.b = r11
            android.util.Range r11 = defpackage.va0.f
            if (r11 == 0) goto L_0x0e72
            r10.d = r11
            r10.c = r7
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r10.f = r11
            zq4 r11 = r1.d
            if (r11 == 0) goto L_0x0e6c
            r10.c = r11
            r10.e = r6
            android.util.Range r6 = r1.g
            if (r6 == 0) goto L_0x0e64
            r10.d = r6
        L_0x0e64:
            va0 r6 = r10.i()
            r8.put(r1, r6)
            goto L_0x0e7e
        L_0x0e6c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x0e72:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x0e78:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0e7e:
            r6 = r26
        L_0x0e80:
            r1 = 1
            goto L_0x0eb4
        L_0x0e82:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r6 = r26
            boolean r1 = r6.containsKey(r1)
            if (r1 == 0) goto L_0x0ebd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            java.lang.Object r1 = r6.get(r1)
            pye r1 = (defpackage.pye) r1
            java.lang.Object r12 = r9.get(r1)
            va0 r12 = (defpackage.va0) r12
            ia3 r13 = r12.d
            js1 r10 = defpackage.pzd.a(r13, r10)
            if (r10 == 0) goto L_0x0e80
            uwb r11 = r12.a()
            r11.e = r10
            va0 r10 = r11.i()
            r9.put(r1, r10)
            goto L_0x0e80
        L_0x0eb4:
            int r15 = r15 + r1
            r36 = r0
            r25 = r3
            r26 = r6
            goto L_0x0e0e
        L_0x0ebd:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r23
            r0.<init>(r1)
            throw r0
        L_0x0ec5:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r9, r8)
            return r0
        L_0x0ecb:
            r1 = r9
            r6 = r32
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            java.lang.String r3 = r1.i
            r2.append(r3)
            java.lang.String r3 = " and Hardware level: "
            r2.append(r3)
            int r1 = r1.m
            r2.append(r1)
            java.lang.String r1 = ". May be the specified resolution is too large and not supported. Existing surfaces: "
            r2.append(r1)
            r2.append(r15)
            r3 = r37
            r2.append(r3)
            r2.append(r6)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0efc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to find supported resolutions."
            r0.<init>(r1)
            throw r0
        L_0x0f04:
            r0 = r41
            r11 = r7
            r3 = r8
            r1 = r9
            r6 = r20
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
            java.lang.String r1 = r1.i
            r4.append(r1)
            r4.append(r15)
            r4.append(r0)
            r4.append(r3)
            r4.append(r6)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h4e.g(int, java.util.ArrayList, java.util.HashMap, boolean, boolean):android.util.Pair");
    }

    public final Pair h(int i2, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i3, HashMap hashMap, HashMap hashMap2) {
        int i4;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k80 k80 = (k80) it.next();
            arrayList4.add(k80.a);
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(arrayList4.size() - 1), k80);
            }
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            Size size = (Size) list.get(i5);
            pye pye = (pye) arrayList2.get(((Integer) arrayList3.get(i5)).intValue());
            int inputFormat = pye.getInputFormat();
            arrayList4.add(xa0.b(i2, inputFormat, size, i(inputFormat)));
            if (hashMap2 != null) {
                hashMap2.put(Integer.valueOf(arrayList4.size() - 1), pye);
            }
            try {
                i4 = (int) (1.0E9d / ((double) ((StreamConfigurationMap) this.k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(pye.getInputFormat(), size)));
            } catch (Exception unused) {
                i4 = 0;
            }
            i3 = Math.min(i3, i4);
        }
        return new Pair(arrayList4, Integer.valueOf(i3));
    }

    public final db0 i(int i2) {
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = this.t;
        if (!arrayList.contains(Integer.valueOf(i2))) {
            j((HashMap) this.s.b, hjd.e, i2);
            j((HashMap) this.s.d, hjd.g, i2);
            Map map = this.s.f;
            et1 et1 = this.k;
            Size c2 = c((StreamConfigurationMap) ((fzd) et1.b().a).b, i2, true);
            if (c2 != null) {
                map.put(Integer.valueOf(i2), c2);
            }
            Map map2 = this.s.g;
            if (Build.VERSION.SDK_INT >= 31 && this.r && (streamConfigurationMap = (StreamConfigurationMap) et1.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(Integer.valueOf(i2), c(streamConfigurationMap, i2, true));
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return this.s;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.util.Size} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(java.util.HashMap r2, android.util.Size r3, int r4) {
        /*
            r1 = this;
            boolean r0 = r1.p
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            et1 r1 = r1.k
            j8e r1 = r1.b()
            java.lang.Object r1 = r1.a
            fzd r1 = (defpackage.fzd) r1
            java.lang.Object r1 = r1.b
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1
            r0 = 0
            android.util.Size r1 = c(r1, r4, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            if (r1 != 0) goto L_0x001f
            goto L_0x0033
        L_0x001f:
            android.util.Size[] r1 = new android.util.Size[]{r3, r1}
            java.util.List r1 = java.util.Arrays.asList(r1)
            d63 r3 = new d63
            r3.<init>(r0)
            java.lang.Object r1 = java.util.Collections.min(r1, r3)
            r3 = r1
            android.util.Size r3 = (android.util.Size) r3
        L_0x0033:
            r2.put(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h4e.j(java.util.HashMap, android.util.Size, int):void");
    }
}
