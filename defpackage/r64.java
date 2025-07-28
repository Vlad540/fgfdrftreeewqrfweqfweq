package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: r64  reason: default package */
public final class r64 extends Handler {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r64(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: androidx.media3.exoplayer.drm.MediaDrmCallbackException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v71, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v72, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v73, resolved type: androidx.media3.exoplayer.drm.MediaDrmCallbackException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: androidx.media3.exoplayer.drm.MediaDrmCallbackException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v75, resolved type: androidx.media3.exoplayer.drm.MediaDrmCallbackException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: androidx.media3.exoplayer.drm.MediaDrmCallbackException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v77, resolved type: androidx.media3.exoplayer.drm.MediaDrmCallbackException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Throwable, java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r0v28, types: [java.lang.Throwable, java.lang.Exception] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060 A[SYNTHETIC, Splitter:B:18:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c A[SYNTHETIC, Splitter:B:25:0x008c] */
    public final void handleMessage(android.os.Message r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = 5000(0x1388, float:7.006E-42)
            r4 = 2008(0x7d8, float:2.814E-42)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 3
            r8 = 1
            int r0 = r1.a
            switch(r0) {
                case 0: goto L_0x023e;
                case 1: goto L_0x0145;
                default: goto L_0x0014;
            }
        L_0x0014:
            boolean r0 = r1.b
            if (r0 != 0) goto L_0x001a
            goto L_0x0144
        L_0x001a:
            int r0 = r2.what
            java.lang.Object r1 = r1.c
            s48 r1 = (defpackage.s48) r1
            switch(r0) {
                case 1: goto L_0x0136;
                case 2: goto L_0x012e;
                case 3: goto L_0x0126;
                case 4: goto L_0x011e;
                case 5: goto L_0x0116;
                case 6: goto L_0x010e;
                case 7: goto L_0x0103;
                case 8: goto L_0x00fb;
                case 9: goto L_0x00d5;
                case 10: goto L_0x0023;
                case 11: goto L_0x00c8;
                case 12: goto L_0x00a1;
                case 13: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0144
        L_0x0025:
            u48 r0 = r1.e
            boolean r2 = r0.j
            if (r2 != 0) goto L_0x0030
            r0.R()
            goto L_0x0144
        L_0x0030:
            t48 r2 = r0.l
            mn r3 = r0.g
            cya r3 = r3.O()
            cya r11 = defpackage.u48.j(r3)
            mn r3 = r0.g
            java.lang.Object r3 = r3.b
            v38 r3 = (defpackage.v38) r3
            uc8 r3 = r3.e
            mn6 r3 = r3.a()
            r4 = -1
            if (r3 == 0) goto L_0x0051
            int r3 = r3.getRepeatMode()     // Catch:{ RemoteException -> 0x0051 }
            r15 = r3
            goto L_0x0052
        L_0x0051:
            r15 = r4
        L_0x0052:
            mn r3 = r0.g
            java.lang.Object r3 = r3.b
            v38 r3 = (defpackage.v38) r3
            uc8 r3 = r3.e
            mn6 r3 = r3.a()
            if (r3 == 0) goto L_0x0067
            int r3 = r3.getShuffleMode()     // Catch:{ RemoteException -> 0x0067 }
            r16 = r3
            goto L_0x0069
        L_0x0067:
            r16 = r4
        L_0x0069:
            t48 r3 = new t48
            java.lang.CharSequence r14 = r2.e
            a88 r12 = r2.c
            java.util.List r13 = r2.d
            w38 r10 = r2.a
            android.os.Bundle r2 = r2.h
            r9 = r3
            r17 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r0.l = r3
            mn r2 = r0.g
            java.lang.Object r2 = r2.b
            v38 r2 = (defpackage.v38) r2
            uc8 r2 = r2.e
            mn6 r2 = r2.a()
            r3 = 0
            if (r2 == 0) goto L_0x0091
            boolean r2 = r2.isCaptioningEnabled()     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x0092
        L_0x0091:
            r2 = r3
        L_0x0092:
            r1.b(r2)
            android.os.Handler r1 = r1.d
            r1.removeMessages(r8)
            t48 r1 = r0.l
            r0.G(r3, r1)
            goto L_0x0144
        L_0x00a1:
            java.lang.Object r0 = r2.obj
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r9 = r0.intValue()
            u48 r0 = r1.e
            t48 r2 = r0.l
            t48 r11 = new t48
            int r8 = r2.f
            java.util.List r6 = r2.d
            java.lang.CharSequence r7 = r2.e
            w38 r3 = r2.a
            cya r4 = r2.b
            a88 r5 = r2.c
            android.os.Bundle r10 = r2.h
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.l = r11
            r1.k()
            goto L_0x0144
        L_0x00c8:
            java.lang.Object r0 = r2.obj
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1.b(r0)
            goto L_0x0144
        L_0x00d5:
            java.lang.Object r0 = r2.obj
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r8 = r0.intValue()
            u48 r0 = r1.e
            t48 r2 = r0.l
            t48 r11 = new t48
            int r9 = r2.g
            java.util.List r6 = r2.d
            java.lang.CharSequence r7 = r2.e
            w38 r3 = r2.a
            cya r4 = r2.b
            a88 r5 = r2.c
            android.os.Bundle r10 = r2.h
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.l = r11
            r1.k()
            goto L_0x0144
        L_0x00fb:
            u48 r0 = r1.e
            r38 r0 = r0.b
            r0.release()
            goto L_0x0144
        L_0x0103:
            java.lang.Object r0 = r2.obj
            android.os.Bundle r0 = (android.os.Bundle) r0
            defpackage.vc8.a(r0)
            r1.c(r0)
            goto L_0x0144
        L_0x010e:
            java.lang.Object r0 = r2.obj
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.g(r0)
            goto L_0x0144
        L_0x0116:
            java.lang.Object r0 = r2.obj
            java.util.List r0 = (java.util.List) r0
            r1.f(r0)
            goto L_0x0144
        L_0x011e:
            java.lang.Object r0 = r2.obj
            w38 r0 = (defpackage.w38) r0
            r1.a(r0)
            goto L_0x0144
        L_0x0126:
            java.lang.Object r0 = r2.obj
            a88 r0 = (defpackage.a88) r0
            r1.d(r0)
            goto L_0x0144
        L_0x012e:
            java.lang.Object r0 = r2.obj
            cya r0 = (defpackage.cya) r0
            r1.e(r0)
            goto L_0x0144
        L_0x0136:
            android.os.Bundle r0 = r19.getData()
            defpackage.vc8.a(r0)
            java.lang.Object r2 = r2.obj
            java.lang.String r2 = (java.lang.String) r2
            r1.h(r2, r0)
        L_0x0144:
            return
        L_0x0145:
            java.lang.Object r0 = r2.obj
            r9 = r0
            t64 r9 = (defpackage.t64) r9
            int r0 = r2.what     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            if (r0 == r8) goto L_0x016d
            r10 = 2
            if (r0 != r10) goto L_0x0167
            java.lang.Object r0 = r1.c     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            v64 r0 = (defpackage.v64) r0     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            e06 r10 = r0.l     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            java.util.UUID r0 = r0.m     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            java.lang.Object r11 = r9.c     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            i35 r11 = (defpackage.i35) r11     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            byte[] r0 = r10.d(r0, r11)     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            goto L_0x0210
        L_0x0163:
            r0 = move-exception
            goto L_0x017d
        L_0x0165:
            r0 = move-exception
            goto L_0x0184
        L_0x0167:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            r0.<init>()     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            throw r0     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
        L_0x016d:
            java.lang.Object r0 = r1.c     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            v64 r0 = (defpackage.v64) r0     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            e06 r0 = r0.l     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            java.lang.Object r10 = r9.c     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            k35 r10 = (defpackage.k35) r10     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            byte[] r0 = r0.h(r10)     // Catch:{ MediaDrmCallbackException -> 0x0165, Exception -> 0x0163 }
            goto L_0x0210
        L_0x017d:
            java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
            defpackage.ez3.k0(r3, r0)
            goto L_0x0210
        L_0x0184:
            java.lang.Object r10 = r2.obj
            t64 r10 = (defpackage.t64) r10
            boolean r11 = r10.b
            if (r11 != 0) goto L_0x018e
            goto L_0x0210
        L_0x018e:
            int r11 = r10.d
            int r11 = r11 + r8
            r10.d = r11
            java.lang.Object r12 = r1.c
            v64 r12 = (defpackage.v64) r12
            mk9 r12 = r12.j
            r12.getClass()
            if (r11 <= r7) goto L_0x01a0
            goto L_0x0210
        L_0x01a0:
            yi7 r7 = new yi7
            android.os.SystemClock.elapsedRealtime()
            android.os.SystemClock.elapsedRealtime()
            java.lang.Throwable r7 = r0.getCause()
            boolean r7 = r7 instanceof java.io.IOException
            if (r7 == 0) goto L_0x01b7
            java.lang.Throwable r7 = r0.getCause()
            java.io.IOException r7 = (java.io.IOException) r7
            goto L_0x01c0
        L_0x01b7:
            androidx.media3.exoplayer.drm.DefaultDrmSession$UnexpectedDrmSessionException r7 = new androidx.media3.exoplayer.drm.DefaultDrmSession$UnexpectedDrmSessionException
            java.lang.Throwable r11 = r0.getCause()
            r7.<init>(r11)
        L_0x01c0:
            java.lang.Object r11 = r1.c
            v64 r11 = (defpackage.v64) r11
            mk9 r11 = r11.j
            int r10 = r10.d
            r11.getClass()
            boolean r11 = r7 instanceof androidx.media3.common.ParserException
            if (r11 != 0) goto L_0x01f9
            boolean r11 = r7 instanceof java.io.FileNotFoundException
            if (r11 != 0) goto L_0x01f9
            boolean r11 = r7 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r11 != 0) goto L_0x01f9
            boolean r11 = r7 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r11 != 0) goto L_0x01f9
            int r11 = androidx.media3.datasource.DataSourceException.b
        L_0x01dd:
            if (r7 == 0) goto L_0x01f0
            boolean r11 = r7 instanceof androidx.media3.datasource.DataSourceException
            if (r11 == 0) goto L_0x01eb
            r11 = r7
            androidx.media3.datasource.DataSourceException r11 = (androidx.media3.datasource.DataSourceException) r11
            int r11 = r11.a
            if (r11 != r4) goto L_0x01eb
            goto L_0x01f9
        L_0x01eb:
            java.lang.Throwable r7 = r7.getCause()
            goto L_0x01dd
        L_0x01f0:
            int r10 = r10 - r8
            int r10 = r10 * 1000
            int r3 = java.lang.Math.min(r10, r3)
            long r3 = (long) r3
            goto L_0x01fa
        L_0x01f9:
            r3 = r5
        L_0x01fa:
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x01ff
            goto L_0x0210
        L_0x01ff:
            monitor-enter(r18)
            boolean r5 = r1.b     // Catch:{ all -> 0x020d }
            if (r5 != 0) goto L_0x020f
            android.os.Message r0 = android.os.Message.obtain(r19)     // Catch:{ all -> 0x020d }
            r1.sendMessageDelayed(r0, r3)     // Catch:{ all -> 0x020d }
            monitor-exit(r18)     // Catch:{ all -> 0x020d }
            goto L_0x0239
        L_0x020d:
            r0 = move-exception
            goto L_0x023c
        L_0x020f:
            monitor-exit(r18)     // Catch:{ all -> 0x020d }
        L_0x0210:
            java.lang.Object r3 = r1.c
            v64 r3 = (defpackage.v64) r3
            mk9 r3 = r3.j
            long r4 = r9.a
            r3.getClass()
            monitor-enter(r18)
            boolean r3 = r1.b     // Catch:{ all -> 0x0236 }
            if (r3 != 0) goto L_0x0238
            java.lang.Object r3 = r1.c     // Catch:{ all -> 0x0236 }
            v64 r3 = (defpackage.v64) r3     // Catch:{ all -> 0x0236 }
            fx r3 = r3.o     // Catch:{ all -> 0x0236 }
            int r2 = r2.what     // Catch:{ all -> 0x0236 }
            java.lang.Object r4 = r9.c     // Catch:{ all -> 0x0236 }
            android.util.Pair r0 = android.util.Pair.create(r4, r0)     // Catch:{ all -> 0x0236 }
            android.os.Message r0 = r3.obtainMessage(r2, r0)     // Catch:{ all -> 0x0236 }
            r0.sendToTarget()     // Catch:{ all -> 0x0236 }
            goto L_0x0238
        L_0x0236:
            r0 = move-exception
            goto L_0x023a
        L_0x0238:
            monitor-exit(r18)     // Catch:{ all -> 0x0236 }
        L_0x0239:
            return
        L_0x023a:
            monitor-exit(r18)     // Catch:{ all -> 0x0236 }
            throw r0
        L_0x023c:
            monitor-exit(r18)     // Catch:{ all -> 0x020d }
            throw r0
        L_0x023e:
            java.lang.Object r0 = r2.obj
            r9 = r0
            s64 r9 = (defpackage.s64) r9
            int r0 = r2.what     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            if (r0 == 0) goto L_0x0265
            if (r0 != r8) goto L_0x025f
            java.lang.Object r0 = r1.c     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            u64 r0 = (defpackage.u64) r0     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            e06 r10 = r0.l     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            java.util.UUID r0 = r0.m     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            java.lang.Object r11 = r9.c     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            h35 r11 = (defpackage.h35) r11     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            byte[] r0 = r10.c(r0, r11)     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            goto L_0x0308
        L_0x025b:
            r0 = move-exception
            goto L_0x0275
        L_0x025d:
            r0 = move-exception
            goto L_0x027c
        L_0x025f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            r0.<init>()     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            throw r0     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
        L_0x0265:
            java.lang.Object r0 = r1.c     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            u64 r0 = (defpackage.u64) r0     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            e06 r0 = r0.l     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            java.lang.Object r10 = r9.c     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            j35 r10 = (defpackage.j35) r10     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            byte[] r0 = r0.g(r10)     // Catch:{ MediaDrmCallbackException -> 0x025d, Exception -> 0x025b }
            goto L_0x0308
        L_0x0275:
            java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
            defpackage.oyb.b(r3, r0)
            goto L_0x0308
        L_0x027c:
            java.lang.Object r10 = r2.obj
            s64 r10 = (defpackage.s64) r10
            boolean r11 = r10.b
            if (r11 != 0) goto L_0x0286
            goto L_0x0308
        L_0x0286:
            int r11 = r10.d
            int r11 = r11 + r8
            r10.d = r11
            java.lang.Object r12 = r1.c
            u64 r12 = (defpackage.u64) r12
            lk9 r12 = r12.j
            r12.getClass()
            if (r11 <= r7) goto L_0x0298
            goto L_0x0308
        L_0x0298:
            xi7 r7 = new xi7
            android.os.SystemClock.elapsedRealtime()
            android.os.SystemClock.elapsedRealtime()
            java.lang.Throwable r7 = r0.getCause()
            boolean r7 = r7 instanceof java.io.IOException
            if (r7 == 0) goto L_0x02af
            java.lang.Throwable r7 = r0.getCause()
            java.io.IOException r7 = (java.io.IOException) r7
            goto L_0x02b8
        L_0x02af:
            com.google.android.exoplayer2.drm.DefaultDrmSession$UnexpectedDrmSessionException r7 = new com.google.android.exoplayer2.drm.DefaultDrmSession$UnexpectedDrmSessionException
            java.lang.Throwable r11 = r0.getCause()
            r7.<init>(r11)
        L_0x02b8:
            java.lang.Object r11 = r1.c
            u64 r11 = (defpackage.u64) r11
            lk9 r11 = r11.j
            int r10 = r10.d
            r11.getClass()
            boolean r11 = r7 instanceof com.google.android.exoplayer2.ParserException
            if (r11 != 0) goto L_0x02f1
            boolean r11 = r7 instanceof java.io.FileNotFoundException
            if (r11 != 0) goto L_0x02f1
            boolean r11 = r7 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
            if (r11 != 0) goto L_0x02f1
            boolean r11 = r7 instanceof com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException
            if (r11 != 0) goto L_0x02f1
            int r11 = com.google.android.exoplayer2.upstream.DataSourceException.b
        L_0x02d5:
            if (r7 == 0) goto L_0x02e8
            boolean r11 = r7 instanceof com.google.android.exoplayer2.upstream.DataSourceException
            if (r11 == 0) goto L_0x02e3
            r11 = r7
            com.google.android.exoplayer2.upstream.DataSourceException r11 = (com.google.android.exoplayer2.upstream.DataSourceException) r11
            int r11 = r11.a
            if (r11 != r4) goto L_0x02e3
            goto L_0x02f1
        L_0x02e3:
            java.lang.Throwable r7 = r7.getCause()
            goto L_0x02d5
        L_0x02e8:
            int r10 = r10 - r8
            int r10 = r10 * 1000
            int r3 = java.lang.Math.min(r10, r3)
            long r3 = (long) r3
            goto L_0x02f2
        L_0x02f1:
            r3 = r5
        L_0x02f2:
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x02f7
            goto L_0x0308
        L_0x02f7:
            monitor-enter(r18)
            boolean r5 = r1.b     // Catch:{ all -> 0x0305 }
            if (r5 != 0) goto L_0x0307
            android.os.Message r0 = android.os.Message.obtain(r19)     // Catch:{ all -> 0x0305 }
            r1.sendMessageDelayed(r0, r3)     // Catch:{ all -> 0x0305 }
            monitor-exit(r18)     // Catch:{ all -> 0x0305 }
            goto L_0x0331
        L_0x0305:
            r0 = move-exception
            goto L_0x0334
        L_0x0307:
            monitor-exit(r18)     // Catch:{ all -> 0x0305 }
        L_0x0308:
            java.lang.Object r3 = r1.c
            u64 r3 = (defpackage.u64) r3
            lk9 r3 = r3.j
            long r4 = r9.a
            r3.getClass()
            monitor-enter(r18)
            boolean r3 = r1.b     // Catch:{ all -> 0x032e }
            if (r3 != 0) goto L_0x0330
            java.lang.Object r3 = r1.c     // Catch:{ all -> 0x032e }
            u64 r3 = (defpackage.u64) r3     // Catch:{ all -> 0x032e }
            fx r3 = r3.n     // Catch:{ all -> 0x032e }
            int r2 = r2.what     // Catch:{ all -> 0x032e }
            java.lang.Object r4 = r9.c     // Catch:{ all -> 0x032e }
            android.util.Pair r0 = android.util.Pair.create(r4, r0)     // Catch:{ all -> 0x032e }
            android.os.Message r0 = r3.obtainMessage(r2, r0)     // Catch:{ all -> 0x032e }
            r0.sendToTarget()     // Catch:{ all -> 0x032e }
            goto L_0x0330
        L_0x032e:
            r0 = move-exception
            goto L_0x0332
        L_0x0330:
            monitor-exit(r18)     // Catch:{ all -> 0x032e }
        L_0x0331:
            return
        L_0x0332:
            monitor-exit(r18)     // Catch:{ all -> 0x032e }
            throw r0
        L_0x0334:
            monitor-exit(r18)     // Catch:{ all -> 0x0305 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r64.handleMessage(android.os.Message):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r64(s48 s48, Looper looper) {
        super(looper);
        this.a = 2;
        this.c = s48;
        this.b = false;
    }
}
