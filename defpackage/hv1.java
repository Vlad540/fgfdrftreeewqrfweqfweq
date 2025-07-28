package defpackage;

import android.os.Handler;
import android.util.SparseArray;
import java.util.concurrent.Executor;

/* renamed from: hv1  reason: default package */
public final class hv1 {
    public static final Object l = new Object();
    public static final SparseArray m = new SparseArray();
    public final otf a = new otf(9);
    public final Object b = new Object();
    public final iv1 c;
    public final Executor d;
    public final Handler e;
    public zd2 f;
    public mn g;
    public ls1 h;
    public final ucc i;
    public final vn1 j;
    public int k;

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hv1(android.content.Context r8) {
        /*
            r7 = this;
            r7.<init>()
            otf r0 = new otf
            r1 = 9
            r0.<init>(r1)
            r7.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r7.b = r0
            r0 = 1
            r7.k = r0
            android.content.Context r1 = defpackage.fja.g(r8)
        L_0x001a:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            r3 = 0
            if (r2 == 0) goto L_0x002d
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L_0x0026
            android.app.Application r1 = (android.app.Application) r1
            goto L_0x002d
        L_0x0026:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x001a
        L_0x002d:
            r1 = 640(0x280, float:8.97E-43)
            android.content.Context r2 = defpackage.fja.g(r8)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0050 }
            android.content.pm.PackageManager r4 = r2.getPackageManager()     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0050 }
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0050 }
            java.lang.Class<androidx.camera.core.impl.MetadataHolderService> r6 = androidx.camera.core.impl.MetadataHolderService.class
            r5.<init>(r2, r6)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0050 }
            android.content.pm.ServiceInfo r2 = r4.getServiceInfo(r5, r1)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0050 }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0050 }
            if (r2 == 0) goto L_0x004d
            java.lang.String r4 = "androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER"
            java.lang.String r2 = r2.getString(r4)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0050 }
            goto L_0x004e
        L_0x004d:
            r2 = r3
        L_0x004e:
            if (r2 != 0) goto L_0x0052
        L_0x0050:
            r2 = r3
            goto L_0x0060
        L_0x0052:
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0050 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0050 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0050 }
            androidx.camera.camera2.Camera2Config$DefaultProvider r2 = (androidx.camera.camera2.Camera2Config$DefaultProvider) r2     // Catch:{ NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException -> 0x0050 }
        L_0x0060:
            if (r2 == 0) goto L_0x01b7
            iv1 r2 = r2.getCameraXConfig()
            r7.c = r2
            z80 r4 = defpackage.iv1.z0
            hga r2 = r2.a
            r2.getClass()
            java.lang.Object r2 = r2.h(r4)     // Catch:{ IllegalArgumentException -> 0x0074 }
            goto L_0x0075
        L_0x0074:
            r2 = r3
        L_0x0075:
            alb r2 = (defpackage.alb) r2
            if (r2 == 0) goto L_0x007d
            r2.toString()
            goto L_0x009a
        L_0x007d:
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0090 }
            java.lang.Class<dlb> r5 = defpackage.dlb.class
            r4.<init>(r8, r5)     // Catch:{ NameNotFoundException -> 0x0090 }
            android.content.pm.ServiceInfo r1 = r2.getServiceInfo(r4, r1)     // Catch:{ NameNotFoundException -> 0x0090 }
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0090 }
            if (r1 != 0) goto L_0x0092
        L_0x0090:
            r2 = r3
            goto L_0x0097
        L_0x0092:
            alb r1 = defpackage.elb.a(r8, r1)     // Catch:{ NameNotFoundException -> 0x0090 }
            r2 = r1
        L_0x0097:
            java.util.Objects.toString(r2)
        L_0x009a:
            if (r2 != 0) goto L_0x00a1
            alb r2 = defpackage.clb.b
            java.util.Objects.toString(r2)
        L_0x00a1:
            clb r1 = defpackage.clb.c
            k96 r1 = r1.a
            r1.v(r2)
            iv1 r1 = r7.c
            z80 r2 = defpackage.iv1.X
            hga r1 = r1.a
            r1.getClass()
            java.lang.Object r1 = r1.h(r2)     // Catch:{ IllegalArgumentException -> 0x00b6 }
            goto L_0x00b7
        L_0x00b6:
            r1 = r3
        L_0x00b7:
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            iv1 r2 = r7.c
            z80 r4 = defpackage.iv1.Y
            hga r2 = r2.a
            r2.getClass()
            java.lang.Object r2 = r2.h(r4)     // Catch:{ IllegalArgumentException -> 0x00c7 }
            goto L_0x00c8
        L_0x00c7:
            r2 = r3
        L_0x00c8:
            android.os.Handler r2 = (android.os.Handler) r2
            if (r1 != 0) goto L_0x00d1
            yt1 r1 = new yt1
            r1.<init>()
        L_0x00d1:
            r7.d = r1
            if (r2 != 0) goto L_0x00ec
            android.os.HandlerThread r1 = new android.os.HandlerThread
            java.lang.String r2 = "CameraX-scheduler"
            r4 = 10
            r1.<init>(r2, r4)
            r1.start()
            android.os.Looper r1 = r1.getLooper()
            android.os.Handler r1 = android.os.Handler.createAsync(r1)
            r7.e = r1
            goto L_0x00ee
        L_0x00ec:
            r7.e = r2
        L_0x00ee:
            iv1 r1 = r7.c
            z80 r2 = defpackage.iv1.Z
            java.lang.Object r1 = r1.d(r2, r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r2 = l
            monitor-enter(r2)
            if (r1 != 0) goto L_0x0102
            monitor-exit(r2)     // Catch:{ all -> 0x00ff }
            goto L_0x0164
        L_0x00ff:
            r7 = move-exception
            goto L_0x01b5
        L_0x0102:
            int r3 = r1.intValue()     // Catch:{ all -> 0x00ff }
            java.lang.String r4 = "minLogLevel"
            r5 = 6
            r6 = 3
            defpackage.e07.l(r3, r4, r6, r5)     // Catch:{ all -> 0x00ff }
            android.util.SparseArray r3 = m     // Catch:{ all -> 0x00ff }
            int r4 = r1.intValue()     // Catch:{ all -> 0x00ff }
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x00ff }
            if (r4 == 0) goto L_0x0129
            int r4 = r1.intValue()     // Catch:{ all -> 0x00ff }
            java.lang.Object r4 = r3.get(r4)     // Catch:{ all -> 0x00ff }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00ff }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00ff }
            int r4 = r4 + r0
            goto L_0x012a
        L_0x0129:
            r4 = r0
        L_0x012a:
            int r1 = r1.intValue()     // Catch:{ all -> 0x00ff }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00ff }
            r3.put(r1, r4)     // Catch:{ all -> 0x00ff }
            int r1 = r3.size()     // Catch:{ all -> 0x00ff }
            if (r1 != 0) goto L_0x013e
            defpackage.hwf.c = r6     // Catch:{ all -> 0x00ff }
            goto L_0x0163
        L_0x013e:
            java.lang.Object r1 = r3.get(r6)     // Catch:{ all -> 0x00ff }
            if (r1 == 0) goto L_0x0147
            defpackage.hwf.c = r6     // Catch:{ all -> 0x00ff }
            goto L_0x0163
        L_0x0147:
            r1 = 4
            java.lang.Object r4 = r3.get(r1)     // Catch:{ all -> 0x00ff }
            if (r4 == 0) goto L_0x0151
            defpackage.hwf.c = r1     // Catch:{ all -> 0x00ff }
            goto L_0x0163
        L_0x0151:
            r1 = 5
            java.lang.Object r4 = r3.get(r1)     // Catch:{ all -> 0x00ff }
            if (r4 == 0) goto L_0x015b
            defpackage.hwf.c = r1     // Catch:{ all -> 0x00ff }
            goto L_0x0163
        L_0x015b:
            java.lang.Object r1 = r3.get(r5)     // Catch:{ all -> 0x00ff }
            if (r1 == 0) goto L_0x0163
            defpackage.hwf.c = r5     // Catch:{ all -> 0x00ff }
        L_0x0163:
            monitor-exit(r2)     // Catch:{ all -> 0x00ff }
        L_0x0164:
            iv1 r1 = r7.c
            r1.getClass()
            z80 r2 = defpackage.iv1.y0
            vu1 r3 = defpackage.ucc.a
            hga r1 = r1.a
            r1.getClass()
            java.lang.Object r3 = r1.h(r2)     // Catch:{ IllegalArgumentException -> 0x0176 }
        L_0x0176:
            ucc r3 = (defpackage.ucc) r3
            java.util.Objects.requireNonNull(r3)
            long r1 = r3.a()
            boolean r4 = r3 instanceof defpackage.vu1
            if (r4 == 0) goto L_0x018a
            vu1 r3 = (defpackage.vu1) r3
            ucc r1 = r3.c(r1)
            goto L_0x0190
        L_0x018a:
            ake r4 = new ake
            r4.<init>(r1, r3)
            r1 = r4
        L_0x0190:
            r7.i = r1
            java.lang.Object r1 = r7.b
            monitor-enter(r1)
            int r2 = r7.k     // Catch:{ all -> 0x01b2 }
            if (r2 != r0) goto L_0x019a
            goto L_0x019b
        L_0x019a:
            r0 = 0
        L_0x019b:
            java.lang.String r2 = "CameraX.initInternal() should only be called once per instance"
            defpackage.e07.p(r2, r0)     // Catch:{ all -> 0x01b2 }
            r0 = 2
            r7.k = r0     // Catch:{ all -> 0x01b2 }
            j9 r0 = new j9     // Catch:{ all -> 0x01b2 }
            r2 = 14
            r0.<init>(r7, r2, r8)     // Catch:{ all -> 0x01b2 }
            vn1 r8 = defpackage.hwf.f(r0)     // Catch:{ all -> 0x01b2 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b2 }
            r7.j = r8
            return
        L_0x01b2:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b2 }
            throw r7
        L_0x01b5:
            monitor-exit(r2)     // Catch:{ all -> 0x00ff }
            throw r7
        L_0x01b7:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.<init>(android.content.Context):void");
    }
}
