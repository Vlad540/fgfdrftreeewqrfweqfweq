package defpackage;

import android.view.MenuItem;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;

/* renamed from: ke  reason: default package */
public final class ke extends b97 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke(int i, Object obj) {
        super(0);
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0140, code lost:
        if (r0 == false) goto L_0x0143;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r17 = this;
            r0 = r17
            r1 = 11
            r2 = 0
            r3 = 1
            int r4 = r0.a
            switch(r4) {
                case 0: goto L_0x02e4;
                case 1: goto L_0x02d9;
                case 2: goto L_0x028f;
                case 3: goto L_0x028a;
                case 4: goto L_0x0281;
                case 5: goto L_0x027c;
                case 6: goto L_0x0279;
                case 7: goto L_0x0235;
                case 8: goto L_0x0224;
                case 9: goto L_0x0148;
                case 10: goto L_0x00f9;
                case 11: goto L_0x00e7;
                case 12: goto L_0x00a7;
                case 13: goto L_0x0043;
                case 14: goto L_0x0027;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r0.b
            um1 r0 = (um1) r0
            p7 r1 = r0.e
            monitor-enter(r1)
            long r4 = r1.c     // Catch:{ all -> 0x0024 }
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            r2 = r3
        L_0x001e:
            monitor-exit(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0024:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0024 }
            throw r0
        L_0x0027:
            java.lang.Object r0 = r0.b
            ydc r0 = (ydc) r0
            java.lang.Object r0 = r0.b
            v4b r0 = (v4b) r0
            java.lang.Object r0 = r0.c
            r7e r0 = (defpackage.r7e) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L_0x0043:
            java.lang.Object r0 = r0.b
            mv4 r0 = (mv4) r0
            r0.getClass()
            android.media.MediaCodecList r0 = new android.media.MediaCodecList
            r0.<init>(r2)
            android.media.MediaCodecInfo[] r0 = r0.getCodecInfos()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r0.length
            r5 = r2
        L_0x005a:
            java.lang.String r6 = "video/avc"
            if (r5 >= r4) goto L_0x007b
            r7 = r0[r5]
            java.lang.String[] r8 = r7.getSupportedTypes()
            boolean r6 = defpackage.cs.N(r8, r6)
            if (r6 == 0) goto L_0x0079
            boolean r6 = r7.isEncoder()
            if (r6 != 0) goto L_0x0079
            boolean r6 = r7.isHardwareAccelerated()
            if (r6 == 0) goto L_0x0079
            r1.add(r7)
        L_0x0079:
            int r5 = r5 + r3
            goto L_0x005a
        L_0x007b:
            java.util.Iterator r0 = r1.iterator()
        L_0x007f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0099
            java.lang.Object r1 = r0.next()
            android.media.MediaCodecInfo r1 = (android.media.MediaCodecInfo) r1
            android.media.MediaCodecInfo$CodecCapabilities r1 = r1.getCapabilitiesForType(r6)
            int r3 = r1.getMaxSupportedInstances()
            if (r3 <= 0) goto L_0x007f
            int r2 = r1.getMaxSupportedInstances()
        L_0x0099:
            int r2 = r2 + -5
            r0 = 4
            r1 = 10
            int r0 = defpackage.gwf.j(r2, r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x00a7:
            java.lang.Object r0 = r0.b
            w4g r0 = (defpackage.w4g) r0
            java.lang.Object r1 = r0.b
            android.content.Context r1 = (android.content.Context) r1
            tm6 r2 = new tm6
            java.lang.String r3 = r1.getPackageName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "TracerSDK/1.1.1 Lib/"
            r4.<init>(r5)
            java.lang.Object r0 = r0.c
            java.lang.String r0 = (java.lang.String) r0
            r4.append(r0)
            java.lang.String r0 = " App/"
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = " "
            r4.append(r0)
            java.lang.String r0 = "http.agent"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L_0x00d9
            goto L_0x00db
        L_0x00d9:
            java.lang.String r0 = "Dalvik/Unknown (Linux; U; Android Unknown; Device Unknown Build/Unknown)"
        L_0x00db:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3 = -1
            r2.<init>(r3, r1, r0)
            return r2
        L_0x00e7:
            tne r1 = new tne
            java.lang.Object r0 = r0.b
            aoe r0 = (aoe) r0
            r7e r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            zne r0 = (zne) r0
            r1.<init>(r0)
            return r1
        L_0x00f9:
            java.lang.Object r0 = r0.b
            tne r0 = (tne) r0
            lu7 r0 = r0.b
            r0.getClass()
            java.lang.String r0 = "ru.ok.tracer.lite.crash.report"
            jxb r1 = defpackage.kxb.a     // Catch:{ all -> 0x0138 }
            r1.getClass()     // Catch:{ all -> 0x0138 }
            d3 r1 = defpackage.kxb.b     // Catch:{ all -> 0x0138 }
            int r1 = r1.f()     // Catch:{ all -> 0x0138 }
            java.lang.String r4 = "0"
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x0138 }
            int r1 = r1 * r4
            int r1 = r1 + 46
            char r1 = (char) r1     // Catch:{ all -> 0x0138 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r4.<init>(r0)     // Catch:{ all -> 0x0138 }
            r4.append(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = "SeemsUnused"
            r4.append(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0138 }
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0138 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0138 }
            r0 = r0 ^ r3
            goto L_0x0139
        L_0x0138:
            r0 = r3
        L_0x0139:
            if (r0 == 0) goto L_0x0142
            nne r0 = nne.a     // Catch:{ all -> 0x013f }
            r0 = r3
            goto L_0x0140
        L_0x013f:
            r0 = r2
        L_0x0140:
            if (r0 == 0) goto L_0x0143
        L_0x0142:
            r2 = r3
        L_0x0143:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0148:
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            java.lang.Object r0 = r0.b
            v2b r0 = (v2b) r0
            r0.getClass()
            iw4 r4 = defpackage.iw4.a
            java.lang.Object r0 = r0.b     // Catch:{ Exception -> 0x0220 }
            s16 r0 = (defpackage.s16) r0     // Catch:{ Exception -> 0x0220 }
            java.lang.Object r0 = r0.invoke()     // Catch:{ Exception -> 0x0220 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ Exception -> 0x0220 }
            boolean r5 = r0.exists()     // Catch:{ Exception -> 0x0220 }
            if (r5 != 0) goto L_0x0165
            goto L_0x0220
        L_0x0165:
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0220 }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0220 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0220 }
            r7.<init>(r0)     // Catch:{ Exception -> 0x0220 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0220 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0220 }
            int r0 = r5.readInt()     // Catch:{ all -> 0x01b3 }
            if (r0 <= r3) goto L_0x017d
            r6 = r4
            goto L_0x0213
        L_0x017d:
            int r0 = r5.readInt()     // Catch:{ all -> 0x01b3 }
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x01b3 }
            r6.<init>()     // Catch:{ all -> 0x01b3 }
            if (r3 > r0) goto L_0x0213
            r7 = r3
        L_0x0189:
            java.lang.String r8 = r5.readUTF()     // Catch:{ all -> 0x01b3 }
            int r9 = r5.readInt()     // Catch:{ all -> 0x01b3 }
            switch(r9) {
                case 1: goto L_0x0207;
                case 2: goto L_0x01fe;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01ec;
                case 5: goto L_0x01e3;
                case 6: goto L_0x01da;
                case 7: goto L_0x01b6;
                default: goto L_0x0194;
            }     // Catch:{ all -> 0x01b3 }
        L_0x0194:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01b3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b3 }
            r2.<init>()     // Catch:{ all -> 0x01b3 }
            java.lang.String r3 = "Read unknown type "
            r2.append(r3)     // Catch:{ all -> 0x01b3 }
            r2.append(r9)     // Catch:{ all -> 0x01b3 }
            java.lang.String r3 = " with key "
            r2.append(r3)     // Catch:{ all -> 0x01b3 }
            r2.append(r8)     // Catch:{ all -> 0x01b3 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01b3 }
            r0.<init>(r2)     // Catch:{ all -> 0x01b3 }
            throw r0     // Catch:{ all -> 0x01b3 }
        L_0x01b3:
            r0 = move-exception
            r2 = r0
            goto L_0x0219
        L_0x01b6:
            int r9 = r5.readInt()     // Catch:{ all -> 0x01b3 }
            int r10 = r5.readInt()     // Catch:{ all -> 0x01b3 }
            r11 = r2
        L_0x01bf:
            if (r11 >= r10) goto L_0x01d7
            r5.readUTF()     // Catch:{ all -> 0x01b3 }
            r5.readLong()     // Catch:{ all -> 0x01b3 }
            r5.readUTF()     // Catch:{ all -> 0x01b3 }
            r5.readUTF()     // Catch:{ all -> 0x01b3 }
            r5.readLong()     // Catch:{ all -> 0x01b3 }
            if (r9 != r3) goto L_0x01d5
            r5.readInt()     // Catch:{ all -> 0x01b3 }
        L_0x01d5:
            int r11 = r11 + r3
            goto L_0x01bf
        L_0x01d7:
            jue r9 = defpackage.jue.a     // Catch:{ all -> 0x01b3 }
            goto L_0x020b
        L_0x01da:
            double r9 = r5.readDouble()     // Catch:{ all -> 0x01b3 }
            java.lang.Double r9 = java.lang.Double.valueOf(r9)     // Catch:{ all -> 0x01b3 }
            goto L_0x020b
        L_0x01e3:
            float r9 = r5.readFloat()     // Catch:{ all -> 0x01b3 }
            java.lang.Float r9 = java.lang.Float.valueOf(r9)     // Catch:{ all -> 0x01b3 }
            goto L_0x020b
        L_0x01ec:
            long r9 = r5.readLong()     // Catch:{ all -> 0x01b3 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x01b3 }
            goto L_0x020b
        L_0x01f5:
            int r9 = r5.readInt()     // Catch:{ all -> 0x01b3 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01b3 }
            goto L_0x020b
        L_0x01fe:
            boolean r9 = r5.readBoolean()     // Catch:{ all -> 0x01b3 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x01b3 }
            goto L_0x020b
        L_0x0207:
            java.lang.String r9 = r5.readUTF()     // Catch:{ all -> 0x01b3 }
        L_0x020b:
            r6.put(r8, r9)     // Catch:{ all -> 0x01b3 }
            if (r7 == r0) goto L_0x0213
            int r7 = r7 + r3
            goto L_0x0189
        L_0x0213:
            r0 = 0
            defpackage.urd.l(r5, r0)     // Catch:{ Exception -> 0x0220 }
            r4 = r6
            goto L_0x0220
        L_0x0219:
            throw r2     // Catch:{ all -> 0x021a }
        L_0x021a:
            r0 = move-exception
            r3 = r0
            defpackage.urd.l(r5, r2)     // Catch:{ Exception -> 0x0220 }
            throw r3     // Catch:{ Exception -> 0x0220 }
        L_0x0220:
            r1.<init>(r4)
            return r1
        L_0x0224:
            java.lang.Object r0 = r0.b
            v2 r0 = (v2) r0
            java.lang.String r1 = r0.g()
            java.lang.Object r0 = r0.a
            aec r0 = (defpackage.aec) r0
            yz5 r0 = r0.d(r1)
            return r0
        L_0x0235:
            java.lang.Object r0 = r0.b
            i3d r0 = (i3d) r0
            android.content.Context r0 = r0.a
            java.lang.String r1 = defpackage.xs7.B()
            java.lang.String r2 = r0.getPackageName()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x024c
            java.lang.String r1 = "tracer"
            goto L_0x0266
        L_0x024c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "tracer-"
            r2.<init>(r3)
            r3 = 58
            r4 = 45
            java.lang.String r1 = r1.replace(r3, r4)
            java.lang.String r1 = android.net.Uri.encode(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x0266:
            java.io.File r2 = new java.io.File
            java.io.File r0 = r0.getCacheDir()
            r2.<init>(r0, r1)
            defpackage.h2g.t(r2)
            java.lang.String r0 = "session.data"
            java.io.File r0 = defpackage.ng5.N(r2, r0)
            return r0
        L_0x0279:
            java.lang.Object r0 = r0.b
            return r0
        L_0x027c:
            java.lang.Object r0 = r0.b
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            return r0
        L_0x0281:
            java.lang.Object r0 = r0.b
            cbf r0 = (defpackage.cbf) r0
            androidx.lifecycle.SavedStateHandlesVM r0 = gp0.r(r0)
            return r0
        L_0x028a:
            java.lang.Object r0 = r0.b
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x028f:
            java.lang.Object r0 = r0.b
            wz5 r0 = (defpackage.wz5) r0
            java.lang.String r2 = r0.b
            if (r2 == 0) goto L_0x02be
            boolean r2 = r0.o
            if (r2 == 0) goto L_0x02be
            java.io.File r2 = new java.io.File
            android.content.Context r3 = r0.a
            java.io.File r3 = r3.getNoBackupFilesDir()
            java.lang.String r4 = r0.b
            r2.<init>(r3, r4)
            vz5 r3 = new vz5
            java.lang.String r7 = r2.getAbsolutePath()
            c9 r8 = new c9
            r8.<init>((int) r1)
            ope r9 = r0.c
            boolean r10 = r0.X
            android.content.Context r6 = r0.a
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x02d3
        L_0x02be:
            vz5 r3 = new vz5
            c9 r14 = new c9
            r14.<init>((int) r1)
            ope r15 = r0.c
            boolean r1 = r0.X
            android.content.Context r12 = r0.a
            java.lang.String r13 = r0.b
            r11 = r3
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x02d3:
            boolean r0 = r0.Z
            r3.setWriteAheadLoggingEnabled(r0)
            return r3
        L_0x02d9:
            u1 r1 = new u1
            java.lang.Object r0 = r0.b
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r2 = 2
            r1.<init>(r2, r0)
            return r1
        L_0x02e4:
            java.lang.Object r0 = r0.b
            com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl r0 = (com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl) r0
            r0.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke.invoke():java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ke(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, MenuItem menuItem) {
        super(0);
        this.a = 0;
        this.b = androidXLifecycleHandlerImpl;
    }
}
