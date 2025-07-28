package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.gms.tasks.Task;
import java.io.BufferedReader;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: it4  reason: default package */
public final class it4 implements jtc, yx4, i75, iae, g1e, hx9 {
    public static it4 X;
    public static final le4 o = new Object();
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ it4(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public bpe B(int i, int i2) {
        i75 i75 = (i75) this.a;
        if (i2 != 3) {
            return i75.B(i, i2);
        }
        SparseArray sparseArray = (SparseArray) this.c;
        w1e w1e = (w1e) sparseArray.get(i);
        if (w1e != null) {
            return w1e;
        }
        w1e w1e2 = new w1e(i75.B(i, i2), (s1e) this.b);
        sparseArray.put(i, w1e2);
        return w1e2;
    }

    public void M(vtc vtc) {
        ((i75) this.a).M(vtc);
    }

    public xm1 a() {
        Objects.requireNonNull((ge1) this.a);
        Objects.requireNonNull((w8f) this.b);
        return new xm1(this);
    }

    public void b(bke bke, h75 h75, pse pse) {
        this.b = bke;
        pse.a();
        pse.b();
        ape B = h75.B(pse.e, 5);
        this.c = B;
        B.d((vu5) this.a);
    }

    public void c(lbe lbe) {
        ybe ybe = (ybe) this.c;
        long j = ((ol) this.a).a;
        CopyOnWriteArraySet copyOnWriteArraySet = ybe.o;
        boolean contains = copyOnWriteArraySet.contains(Long.valueOf(j));
        if (contains) {
            copyOnWriteArraySet.remove(Long.valueOf(j));
            ((jee) ybe.X.getValue()).d(j);
        }
        if (contains) {
            String str = ybe.F0;
            udd.q(str, "executeTask: cancelling task after processing with requestId=" + ((ol) this.a).a);
        } else if (((ExecutorService) ((ybe) this.c).C0.getValue()).isShutdown()) {
            ol olVar = (ol) this.a;
            if (olVar instanceof ip7) {
                ybe ybe2 = (ybe) this.c;
                ybe2.getClass();
                if ((olVar instanceof ip7) && ybe2.b != null) {
                    udd.n(ybe.F0, "countDownSyncLogoutLatch");
                    ybe2.b.countDown();
                }
            }
        } else if (!((qce) this.b).b().a.get()) {
            ((ExecutorService) ((ybe) this.c).C0.getValue()).execute(new tbe(this, (ol) this.a, (qce) this.b, lbe));
        }
    }

    public void d(uae uae) {
        if (!((ExecutorService) ((ybe) this.c).C0.getValue()).isShutdown() && !((qce) this.b).b().a.get()) {
            ((ExecutorService) ((ybe) this.c).C0.getValue()).execute(new ube(this, (qce) this.b, (ol) this.a, uae));
        }
    }

    public void e() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec mediaCodec = (MediaCodec) this.a;
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 10000);
        if (dequeueOutputBuffer != -3) {
            k3f k3f = (k3f) this.b;
            if (dequeueOutputBuffer != -2) {
                if (dequeueOutputBuffer != -1 && dequeueOutputBuffer >= 0) {
                    if (bufferInfo.size > 0 && k3f != null) {
                        ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                        if ((bufferInfo.flags & 2) == 0) {
                            float f = (float) (((double) ((int) (((((double) bufferInfo.presentationTimeUs) / ((double) (k3f.y - k3f.x))) * 100.0d) * 100.0d))) / 100.0d);
                            of3 of3 = (of3) k3f.w.b;
                            if (of3 != null) {
                                try {
                                    of3.accept(Float.valueOf(f));
                                } catch (Throwable th) {
                                    udd.s("o6a", "convertVideo: progress accept failed", th);
                                }
                            }
                        }
                        xc9 xc9 = k3f.c;
                        if (xc9.b()) {
                            boolean z = xc9.c;
                            MediaMuxer mediaMuxer = (MediaMuxer) xc9.f;
                            if (!z) {
                                mediaMuxer.start();
                                xc9.c = true;
                            }
                            xc9.a();
                            mediaMuxer.writeSampleData(xc9.a, outputBuffer, bufferInfo);
                        } else {
                            ((ArrayList) xc9.g).add(new wc9(xc9.a, outputBuffer, bufferInfo));
                        }
                    }
                    mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((bufferInfo.flags & 4) != 0 && k3f != null) {
                        MediaCodec mediaCodec2 = (MediaCodec) k3f.h.a;
                        if (mediaCodec2 != null) {
                            mediaCodec2.stop();
                        }
                        MediaCodec mediaCodec3 = (MediaCodec) k3f.h.a;
                        if (mediaCodec3 != null) {
                            mediaCodec3.release();
                        }
                        k3f.g.a();
                        ((MediaMuxer) k3f.c.f).stop();
                        ((MediaMuxer) k3f.c.f).release();
                        k3f.l = true;
                    }
                }
            } else if (k3f != null) {
                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                xc9 xc92 = k3f.c;
                xc92.a = ((MediaMuxer) xc92.f).addTrack(outputFormat);
            }
        }
    }

    public long f() {
        return ((ol) this.a).a;
    }

    public void g(yze yze) {
        long c2;
        long j;
        swb.i((bke) this.b);
        int i = mze.a;
        bke bke = (bke) this.b;
        synchronized (bke) {
            try {
                long j2 = bke.c;
                c2 = j2 != -9223372036854775807L ? j2 + bke.b : bke.c();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        bke bke2 = (bke) this.b;
        synchronized (bke2) {
            j = bke2.b;
        }
        if (c2 != -9223372036854775807L && j != -9223372036854775807L) {
            vu5 vu5 = (vu5) this.a;
            if (j != vu5.E0) {
                tu5 a2 = vu5.a();
                a2.o = j;
                vu5 vu52 = new vu5(a2);
                this.a = vu52;
                ((ape) this.c).d(vu52);
            }
            int c3 = yze.c();
            ((ape) this.c).c(c3, yze);
            ((ape) this.c).b(c2, 1, c3, 0, (yoe) null);
        }
    }

    public int h(long j) {
        long[] jArr = (long[]) this.c;
        int b2 = mze.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public long i() {
        q74 q74 = (q74) this.c;
        if (q74 != null) {
            return q74.o;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zx4 j(int r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.Object r2 = r0.c
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L_0x001d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r0 = r2.get(r0)
            zx4 r0 = (zx4) r0
            return r0
        L_0x001d:
            java.lang.Object r3 = r0.a
            yx4 r3 = (yx4) r3
            boolean r4 = r3.o(r1)
            if (r4 == 0) goto L_0x00db
            zx4 r3 = r3.r(r1)
            java.util.Objects.requireNonNull(r3)
            java.lang.Object r0 = r0.b
            xe6 r0 = (xe6) r0
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk> r4 = androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.class
            java.util.ArrayList r0 = r0.k(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x003c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0072
            java.lang.Object r4 = r0.next()
            androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk r4 = (androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk) r4
            if (r4 == 0) goto L_0x003c
            r0 = 4
            if (r1 == r0) goto L_0x0068
            r0 = 5
            if (r1 == r0) goto L_0x005e
            r0 = 6
            if (r1 == r0) goto L_0x0054
            goto L_0x0072
        L_0x0054:
            android.util.Size r0 = new android.util.Size
            r4 = 1440(0x5a0, float:2.018E-42)
            r6 = 1080(0x438, float:1.513E-42)
            r0.<init>(r4, r6)
            goto L_0x0073
        L_0x005e:
            android.util.Size r0 = new android.util.Size
            r4 = 960(0x3c0, float:1.345E-42)
            r6 = 720(0x2d0, float:1.009E-42)
            r0.<init>(r4, r6)
            goto L_0x0073
        L_0x0068:
            android.util.Size r0 = new android.util.Size
            r4 = 640(0x280, float:8.97E-43)
            r6 = 480(0x1e0, float:6.73E-43)
            r0.<init>(r4, r6)
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 != 0) goto L_0x0077
            r5 = r3
            goto L_0x00dc
        L_0x0077:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r6 = r3.d()
            java.util.Iterator r6 = r6.iterator()
        L_0x0084:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00c3
            java.lang.Object r7 = r6.next()
            g90 r7 = (g90) r7
            int r9 = r7.a
            int r13 = r0.getWidth()
            int r14 = r0.getHeight()
            g90 r15 = new g90
            int r12 = r7.i
            int r11 = r7.j
            java.lang.String r10 = r7.b
            int r8 = r7.c
            int r5 = r7.d
            r19 = r0
            int r0 = r7.g
            int r7 = r7.h
            r16 = r8
            r8 = r15
            r18 = r11
            r11 = r16
            r17 = r12
            r12 = r5
            r5 = r15
            r15 = r0
            r16 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.add(r5)
            r0 = r19
            goto L_0x0084
        L_0x00c3:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00ca
            goto L_0x00db
        L_0x00ca:
            int r0 = r3.a()
            int r5 = r3.b()
            java.util.List r3 = r3.c()
            f90 r5 = f90.e(r0, r5, r3, r4)
            goto L_0x00dc
        L_0x00db:
            r5 = 0
        L_0x00dc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r2.put(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it4.j(int):zx4");
    }

    public long k(int i) {
        boolean z = false;
        swb.e(i >= 0);
        long[] jArr = (long[]) this.c;
        if (i < jArr.length) {
            z = true;
        }
        swb.e(z);
        return jArr[i];
    }

    public void l(Task task) {
        zgc zgc = (zgc) this.a;
        String str = (String) this.b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.c;
        synchronized (zgc.a) {
            zgc.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a7, code lost:
        if (r0 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02de A[SYNTHETIC, Splitter:B:128:0x02de] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02ef A[SYNTHETIC, Splitter:B:133:0x02ef] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x038b A[SYNTHETIC, Splitter:B:169:0x038b] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03ae A[SYNTHETIC, Splitter:B:179:0x03ae] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x046c  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0482 A[SYNTHETIC, Splitter:B:228:0x0482] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5 A[Catch:{ NameNotFoundException -> 0x00ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0182 A[SYNTHETIC, Splitter:B:69:0x0182] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0200  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m() {
        /*
            r17 = this;
            r1 = r17
            r2 = 2
            r3 = 0
            java.lang.Object r0 = r1.c
            wq3 r0 = (defpackage.wq3) r0
            java.lang.String r4 = "gcm.n.noui"
            boolean r0 = r0.l(r4)
            r4 = 1
            if (r0 == 0) goto L_0x0012
            return r4
        L_0x0012:
            java.lang.Object r0 = r1.b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r5 = "keyguard"
            java.lang.Object r5 = r0.getSystemService(r5)
            android.app.KeyguardManager r5 = (android.app.KeyguardManager) r5
            boolean r5 = r5.inKeyguardRestrictedInputMode()
            if (r5 == 0) goto L_0x0025
            goto L_0x0052
        L_0x0025:
            int r5 = android.os.Process.myPid()
            java.lang.String r6 = "activity"
            java.lang.Object r0 = r0.getSystemService(r6)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x0052
            java.util.Iterator r0 = r0.iterator()
        L_0x003b:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0052
            java.lang.Object r6 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r6 = (android.app.ActivityManager.RunningAppProcessInfo) r6
            int r7 = r6.pid
            if (r7 != r5) goto L_0x003b
            int r0 = r6.importance
            r5 = 100
            if (r0 != r5) goto L_0x0052
            return r3
        L_0x0052:
            java.lang.Object r0 = r1.c
            wq3 r0 = (defpackage.wq3) r0
            java.lang.String r5 = "gcm.n.image"
            java.lang.String r0 = r0.p(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L_0x0064
        L_0x0062:
            r5 = 0
            goto L_0x006e
        L_0x0064:
            jq6 r5 = new jq6     // Catch:{ MalformedURLException -> 0x0062 }
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0062 }
            r7.<init>(r0)     // Catch:{ MalformedURLException -> 0x0062 }
            r5.<init>(r7)     // Catch:{ MalformedURLException -> 0x0062 }
        L_0x006e:
            if (r5 == 0) goto L_0x0089
            java.lang.Object r0 = r1.a
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            vde r7 = new vde
            r7.<init>()
            zo5 r8 = new zo5
            r9 = 5
            r8.<init>(r5, r9, r7)
            java.util.concurrent.Future r0 = r0.submit(r8)
            r5.b = r0
            n6g r0 = r7.a
            r5.c = r0
        L_0x0089:
            java.lang.Object r0 = r1.b
            r7 = r0
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r0 = r1.c
            r8 = r0
            wq3 r8 = (defpackage.wq3) r8
            java.util.concurrent.atomic.AtomicInteger r0 = n53.a
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.lang.String r9 = r7.getPackageName()
            r10 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r9, r10)     // Catch:{ NameNotFoundException -> 0x00ab }
            if (r0 == 0) goto L_0x00af
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x00ab }
            if (r0 == 0) goto L_0x00af
        L_0x00a9:
            r9 = r0
            goto L_0x00b2
        L_0x00ab:
            r0 = move-exception
            r0.toString()
        L_0x00af:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            goto L_0x00a9
        L_0x00b2:
            java.lang.String r0 = "gcm.n.android_channel_id"
            java.lang.String r0 = r8.p(r0)
            r10 = 3
            android.content.pm.PackageManager r11 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00cb }
            java.lang.String r12 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x00cb }
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo(r12, r3)     // Catch:{ NameNotFoundException -> 0x00cb }
            int r11 = r11.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x00cb }
            r12 = 26
            if (r11 >= r12) goto L_0x00cd
        L_0x00cb:
            r0 = 0
            goto L_0x011e
        L_0x00cd:
            java.lang.Class<android.app.NotificationManager> r11 = android.app.NotificationManager.class
            java.lang.Object r11 = r7.getSystemService(r11)
            android.app.NotificationManager r11 = (android.app.NotificationManager) r11
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x00e2
            android.app.NotificationChannel r12 = r11.getNotificationChannel(r0)
            if (r12 == 0) goto L_0x00e2
            goto L_0x011e
        L_0x00e2:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r0 = r9.getString(r0)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x00f5
            android.app.NotificationChannel r12 = r11.getNotificationChannel(r0)
            if (r12 == 0) goto L_0x00f5
            goto L_0x011e
        L_0x00f5:
            java.lang.String r0 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r12 = r11.getNotificationChannel(r0)
            if (r12 != 0) goto L_0x011e
            android.content.res.Resources r12 = r7.getResources()
            java.lang.String r13 = r7.getPackageName()
            java.lang.String r14 = "fcm_fallback_notification_channel_label"
            java.lang.String r15 = "string"
            int r12 = r12.getIdentifier(r14, r15, r13)
            if (r12 != 0) goto L_0x0112
            java.lang.String r12 = "Misc"
            goto L_0x0116
        L_0x0112:
            java.lang.String r12 = r7.getString(r12)
        L_0x0116:
            android.app.NotificationChannel r13 = new android.app.NotificationChannel
            r13.<init>(r0, r12, r10)
            r11.createNotificationChannel(r13)
        L_0x011e:
            java.lang.String r11 = r7.getPackageName()
            android.content.res.Resources r12 = r7.getResources()
            android.content.pm.PackageManager r13 = r7.getPackageManager()
            un9 r14 = new un9
            r14.<init>(r7, r0)
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r0 = r8.o(r12, r11, r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 != 0) goto L_0x013e
            r14.f(r0)
        L_0x013e:
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r0 = r8.o(r12, r11, r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 != 0) goto L_0x015b
            r14.e(r0)
            sn9 r15 = new sn9
            r15.<init>(r3)
            java.lang.CharSequence r0 = un9.c(r0)
            r15.f = r0
            r14.q(r15)
        L_0x015b:
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r0 = r8.p(r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 != 0) goto L_0x0179
            java.lang.String r15 = "drawable"
            int r15 = r12.getIdentifier(r0, r15, r11)
            if (r15 == 0) goto L_0x0170
            goto L_0x0194
        L_0x0170:
            java.lang.String r15 = "mipmap"
            int r15 = r12.getIdentifier(r0, r15, r11)
            if (r15 == 0) goto L_0x0179
            goto L_0x0194
        L_0x0179:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            int r15 = r9.getInt(r0, r3)
            if (r15 == 0) goto L_0x0182
            goto L_0x018d
        L_0x0182:
            android.content.pm.ApplicationInfo r0 = r13.getApplicationInfo(r11, r3)     // Catch:{ NameNotFoundException -> 0x0189 }
            int r15 = r0.icon     // Catch:{ NameNotFoundException -> 0x0189 }
            goto L_0x018d
        L_0x0189:
            r0 = move-exception
            r0.toString()
        L_0x018d:
            if (r15 == 0) goto L_0x0190
            goto L_0x0194
        L_0x0190:
            r0 = 17301651(0x1080093, float:2.4979667E-38)
            r15 = r0
        L_0x0194:
            android.app.Notification r0 = r14.F
            r0.icon = r15
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r0 = r8.p(r0)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 == 0) goto L_0x01aa
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r0 = r8.p(r0)
        L_0x01aa:
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 == 0) goto L_0x01b2
            r0 = 0
            goto L_0x01e1
        L_0x01b2:
            java.lang.String r15 = "default"
            boolean r15 = r15.equals(r0)
            if (r15 != 0) goto L_0x01dd
            java.lang.String r15 = "raw"
            int r12 = r12.getIdentifier(r0, r15, r11)
            if (r12 == 0) goto L_0x01dd
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r15 = "android.resource://"
            r12.<init>(r15)
            r12.append(r11)
            java.lang.String r15 = "/raw/"
            r12.append(r15)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x01e1
        L_0x01dd:
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r2)
        L_0x01e1:
            if (r0 == 0) goto L_0x01e6
            r14.p(r0)
        L_0x01e6:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r0 = r8.p(r0)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x0200
            android.content.Intent r12 = new android.content.Intent
            r12.<init>(r0)
            r12.setPackage(r11)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r12.setFlags(r0)
            goto L_0x0232
        L_0x0200:
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r0 = r8.p(r0)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 == 0) goto L_0x0212
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r0 = r8.p(r0)
        L_0x0212:
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x021d
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x021e
        L_0x021d:
            r0 = 0
        L_0x021e:
            if (r0 == 0) goto L_0x022e
            android.content.Intent r12 = new android.content.Intent
            java.lang.String r13 = "android.intent.action.VIEW"
            r12.<init>(r13)
            r12.setPackage(r11)
            r12.setData(r0)
            goto L_0x0232
        L_0x022e:
            android.content.Intent r12 = r13.getLaunchIntentForPackage(r11)
        L_0x0232:
            java.util.concurrent.atomic.AtomicInteger r0 = n53.a
            r11 = 1140850688(0x44000000, float:512.0)
            java.lang.String r13 = "google.c.a.e"
            if (r12 != 0) goto L_0x023c
            r2 = 0
            goto L_0x0296
        L_0x023c:
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            r12.addFlags(r15)
            android.os.Bundle r15 = new android.os.Bundle
            android.os.Bundle r6 = r8.a
            r15.<init>(r6)
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0250:
            boolean r16 = r6.hasNext()
            if (r16 == 0) goto L_0x027c
            java.lang.Object r16 = r6.next()
            r10 = r16
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r2 = "google.c."
            boolean r2 = r10.startsWith(r2)
            if (r2 != 0) goto L_0x0276
            java.lang.String r2 = "gcm.n."
            boolean r2 = r10.startsWith(r2)
            if (r2 != 0) goto L_0x0276
            java.lang.String r2 = "gcm.notification."
            boolean r2 = r10.startsWith(r2)
            if (r2 == 0) goto L_0x0279
        L_0x0276:
            r15.remove(r10)
        L_0x0279:
            r2 = 2
            r10 = 3
            goto L_0x0250
        L_0x027c:
            r12.putExtras(r15)
            boolean r2 = r8.l(r13)
            if (r2 == 0) goto L_0x028e
            android.os.Bundle r2 = r8.r()
            java.lang.String r6 = "gcm.n.analytics_data"
            r12.putExtra(r6, r2)
        L_0x028e:
            int r2 = r0.incrementAndGet()
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r7, r2, r12, r11)
        L_0x0296:
            r14.g = r2
            boolean r2 = r8.l(r13)
            if (r2 != 0) goto L_0x02a0
            r0 = 0
            goto L_0x02cc
        L_0x02a0:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r6 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r2.<init>(r6)
            android.os.Bundle r6 = r8.r()
            android.content.Intent r2 = r2.putExtras(r6)
            int r0 = r0.incrementAndGet()
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r10 = "com.google.android.c2dm.intent.RECEIVE"
            r6.<init>(r10)
            java.lang.String r10 = r7.getPackageName()
            android.content.Intent r6 = r6.setPackage(r10)
            java.lang.String r10 = "wrapped_intent"
            android.content.Intent r2 = r6.putExtra(r10, r2)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r7, r0, r2, r11)
        L_0x02cc:
            if (r0 == 0) goto L_0x02d2
            android.app.Notification r2 = r14.F
            r2.deleteIntent = r0
        L_0x02d2:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r0 = r8.p(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x02e7
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x02e7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x02e7 }
            goto L_0x02f9
        L_0x02e7:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r9.getInt(r0, r3)
            if (r0 == 0) goto L_0x02f8
            int r0 = hq3.a(r7, r0)     // Catch:{ NotFoundException -> 0x02f8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x02f8 }
            goto L_0x02f9
        L_0x02f8:
            r0 = 0
        L_0x02f9:
            if (r0 == 0) goto L_0x0301
            int r0 = r0.intValue()
            r14.x = r0
        L_0x0301:
            java.lang.String r0 = "gcm.n.sticky"
            boolean r0 = r8.l(r0)
            r0 = r0 ^ r4
            r2 = 16
            r14.i(r2, r0)
            java.lang.String r0 = "gcm.n.local_only"
            boolean r0 = r8.l(r0)
            r14.u = r0
            java.lang.String r0 = "gcm.n.ticker"
            java.lang.String r0 = r8.p(r0)
            if (r0 == 0) goto L_0x0325
            android.app.Notification r2 = r14.F
            java.lang.CharSequence r0 = un9.c(r0)
            r2.tickerText = r0
        L_0x0325:
            java.lang.String r0 = "gcm.n.notification_priority"
            java.lang.Integer r0 = r8.m(r0)
            r2 = -2
            if (r0 != 0) goto L_0x0330
        L_0x032e:
            r0 = 0
            goto L_0x033e
        L_0x0330:
            int r6 = r0.intValue()
            if (r6 < r2) goto L_0x032e
            int r6 = r0.intValue()
            r7 = 2
            if (r6 <= r7) goto L_0x033e
            goto L_0x032e
        L_0x033e:
            if (r0 == 0) goto L_0x0346
            int r0 = r0.intValue()
            r14.k = r0
        L_0x0346:
            java.lang.String r0 = "gcm.n.visibility"
            java.lang.Integer r0 = r8.m(r0)
            if (r0 != 0) goto L_0x0350
        L_0x034e:
            r0 = 0
            goto L_0x035e
        L_0x0350:
            int r6 = r0.intValue()
            r7 = -1
            if (r6 < r7) goto L_0x034e
            int r6 = r0.intValue()
            if (r6 <= r4) goto L_0x035e
            goto L_0x034e
        L_0x035e:
            if (r0 == 0) goto L_0x0366
            int r0 = r0.intValue()
            r14.y = r0
        L_0x0366:
            java.lang.String r0 = "gcm.n.notification_count"
            java.lang.Integer r0 = r8.m(r0)
            if (r0 != 0) goto L_0x0370
        L_0x036e:
            r0 = 0
            goto L_0x0377
        L_0x0370:
            int r6 = r0.intValue()
            if (r6 >= 0) goto L_0x0377
            goto L_0x036e
        L_0x0377:
            if (r0 == 0) goto L_0x037f
            int r0 = r0.intValue()
            r14.j = r0
        L_0x037f:
            java.lang.String r0 = "gcm.n.event_time"
            java.lang.String r6 = r8.p(r0)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0397
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0394 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0394 }
            goto L_0x0398
        L_0x0394:
            defpackage.wq3.s(r0)
        L_0x0397:
            r0 = 0
        L_0x0398:
            if (r0 == 0) goto L_0x03a4
            r14.l = r4
            long r6 = r0.longValue()
            android.app.Notification r0 = r14.F
            r0.when = r6
        L_0x03a4:
            java.lang.String r0 = "gcm.n.vibrate_timings"
            org.json.JSONArray r0 = r8.n(r0)
            if (r0 != 0) goto L_0x03ae
        L_0x03ac:
            r7 = 0
            goto L_0x03d1
        L_0x03ae:
            int r6 = r0.length()     // Catch:{ NumberFormatException | JSONException -> 0x03cd }
            if (r6 <= r4) goto L_0x03c5
            int r6 = r0.length()     // Catch:{ NumberFormatException | JSONException -> 0x03cd }
            long[] r7 = new long[r6]     // Catch:{ NumberFormatException | JSONException -> 0x03cd }
            r9 = r3
        L_0x03bb:
            if (r9 >= r6) goto L_0x03d1
            long r10 = r0.optLong(r9)     // Catch:{ NumberFormatException | JSONException -> 0x03cd }
            r7[r9] = r10     // Catch:{ NumberFormatException | JSONException -> 0x03cd }
            int r9 = r9 + r4
            goto L_0x03bb
        L_0x03c5:
            org.json.JSONException r6 = new org.json.JSONException     // Catch:{ NumberFormatException | JSONException -> 0x03cd }
            java.lang.String r7 = "vibrateTimings have invalid length"
            r6.<init>((java.lang.String) r7)     // Catch:{ NumberFormatException | JSONException -> 0x03cd }
            throw r6     // Catch:{ NumberFormatException | JSONException -> 0x03cd }
        L_0x03cd:
            r0.toString()
            goto L_0x03ac
        L_0x03d1:
            if (r7 == 0) goto L_0x03d7
            android.app.Notification r0 = r14.F
            r0.vibrate = r7
        L_0x03d7:
            java.lang.String r0 = "gcm.n.light_settings"
            org.json.JSONArray r6 = r8.n(r0)
            if (r6 != 0) goto L_0x03e1
        L_0x03df:
            r0 = 0
            goto L_0x0423
        L_0x03e1:
            r7 = 3
            int[] r0 = new int[r7]
            int r9 = r6.length()     // Catch:{ JSONException -> 0x041f, IllegalArgumentException -> 0x0406 }
            if (r9 != r7) goto L_0x0410
            java.lang.String r7 = r6.optString(r3)     // Catch:{ JSONException -> 0x041f, IllegalArgumentException -> 0x0406 }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ JSONException -> 0x041f, IllegalArgumentException -> 0x0406 }
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r7 == r9) goto L_0x0408
            r0[r3] = r7     // Catch:{ JSONException -> 0x041f, IllegalArgumentException -> 0x0406 }
            int r7 = r6.optInt(r4)     // Catch:{ JSONException -> 0x041f, IllegalArgumentException -> 0x0406 }
            r0[r4] = r7     // Catch:{ JSONException -> 0x041f, IllegalArgumentException -> 0x0406 }
            r7 = 2
            int r9 = r6.optInt(r7)     // Catch:{ JSONException -> 0x041f, IllegalArgumentException -> 0x0406 }
            r0[r7] = r9     // Catch:{ JSONException -> 0x041f, IllegalArgumentException -> 0x0406 }
            goto L_0x0423
        L_0x0406:
            r0 = move-exception
            goto L_0x0418
        L_0x0408:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x041f, IllegalArgumentException -> 0x0406 }
            java.lang.String r7 = "Transparent color is invalid"
            r0.<init>(r7)     // Catch:{ JSONException -> 0x041f, IllegalArgumentException -> 0x0406 }
            throw r0     // Catch:{ JSONException -> 0x041f, IllegalArgumentException -> 0x0406 }
        L_0x0410:
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x041f, IllegalArgumentException -> 0x0406 }
            java.lang.String r7 = "lightSettings don't have all three fields"
            r0.<init>((java.lang.String) r7)     // Catch:{ JSONException -> 0x041f, IllegalArgumentException -> 0x0406 }
            throw r0     // Catch:{ JSONException -> 0x041f, IllegalArgumentException -> 0x0406 }
        L_0x0418:
            r6.toString()
            r0.getMessage()
            goto L_0x03df
        L_0x041f:
            r6.toString()
            goto L_0x03df
        L_0x0423:
            if (r0 == 0) goto L_0x0441
            r6 = r0[r3]
            r7 = r0[r4]
            r9 = 2
            r0 = r0[r9]
            android.app.Notification r9 = r14.F
            r9.ledARGB = r6
            r9.ledOnMS = r7
            r9.ledOffMS = r0
            if (r7 == 0) goto L_0x043a
            if (r0 == 0) goto L_0x043a
            r0 = r4
            goto L_0x043b
        L_0x043a:
            r0 = r3
        L_0x043b:
            int r6 = r9.flags
            r2 = r2 & r6
            r0 = r0 | r2
            r9.flags = r0
        L_0x0441:
            java.lang.String r0 = "gcm.n.default_sound"
            boolean r0 = r8.l(r0)
            java.lang.String r2 = "gcm.n.default_vibrate_timings"
            boolean r2 = r8.l(r2)
            if (r2 == 0) goto L_0x0451
            r2 = 2
            r0 = r0 | r2
        L_0x0451:
            java.lang.String r2 = "gcm.n.default_light_settings"
            boolean r2 = r8.l(r2)
            if (r2 == 0) goto L_0x045b
            r0 = r0 | 4
        L_0x045b:
            r14.g(r0)
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r0 = r8.p(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x046c
        L_0x046a:
            r2 = r0
            goto L_0x047f
        L_0x046c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "FCM-Notification:"
            r0.<init>(r2)
            long r6 = android.os.SystemClock.uptimeMillis()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto L_0x046a
        L_0x047f:
            if (r5 != 0) goto L_0x0482
            goto L_0x04c4
        L_0x0482:
            n6g r0 = r5.c     // Catch:{ ExecutionException -> 0x04ac, InterruptedException -> 0x04b2, TimeoutException -> 0x04ae }
            a24.o(r0)     // Catch:{ ExecutionException -> 0x04ac, InterruptedException -> 0x04b2, TimeoutException -> 0x04ae }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x04ac, InterruptedException -> 0x04b2, TimeoutException -> 0x04ae }
            r7 = 5
            java.lang.Object r0 = gwf.b(r0, r7, r6)     // Catch:{ ExecutionException -> 0x04ac, InterruptedException -> 0x04b2, TimeoutException -> 0x04ae }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ ExecutionException -> 0x04ac, InterruptedException -> 0x04b2, TimeoutException -> 0x04ae }
            r14.k(r0)     // Catch:{ ExecutionException -> 0x04ac, InterruptedException -> 0x04b2, TimeoutException -> 0x04ae }
            rn9 r6 = new rn9     // Catch:{ ExecutionException -> 0x04ac, InterruptedException -> 0x04b2, TimeoutException -> 0x04ae }
            r6.<init>()     // Catch:{ ExecutionException -> 0x04ac, InterruptedException -> 0x04b2, TimeoutException -> 0x04ae }
            if (r0 != 0) goto L_0x049d
            r0 = 0
            goto L_0x04a1
        L_0x049d:
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.b(r0)     // Catch:{ ExecutionException -> 0x04ac, InterruptedException -> 0x04b2, TimeoutException -> 0x04ae }
        L_0x04a1:
            r6.e = r0     // Catch:{ ExecutionException -> 0x04ac, InterruptedException -> 0x04b2, TimeoutException -> 0x04ae }
            r7 = 0
            r6.f = r7     // Catch:{ ExecutionException -> 0x04ac, InterruptedException -> 0x04b2, TimeoutException -> 0x04ae }
            r6.g = r4     // Catch:{ ExecutionException -> 0x04ac, InterruptedException -> 0x04b2, TimeoutException -> 0x04ae }
            r14.q(r6)     // Catch:{ ExecutionException -> 0x04ac, InterruptedException -> 0x04b2, TimeoutException -> 0x04ae }
            goto L_0x04c4
        L_0x04ac:
            r0 = move-exception
            goto L_0x04bd
        L_0x04ae:
            r5.close()
            goto L_0x04c4
        L_0x04b2:
            r5.close()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x04c4
        L_0x04bd:
            java.lang.Throwable r0 = r0.getCause()
            java.util.Objects.toString(r0)
        L_0x04c4:
            java.lang.Object r0 = r1.b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            android.app.Notification r1 = r14.b()
            r0.notify(r2, r3, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it4.m():boolean");
    }

    public boolean n() {
        String trim;
        if (((String) this.c) != null) {
            return true;
        }
        Queue queue = (Queue) this.b;
        if (!queue.isEmpty()) {
            String str = (String) queue.poll();
            str.getClass();
            this.c = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.a).readLine();
            this.c = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.c = trim;
        } while (trim.isEmpty());
        return true;
    }

    public boolean o(int i) {
        return ((yx4) this.a).o(i) && j(i) != null;
    }

    public void p(oz3 oz3, Uri uri, Map map, long j, long j2, h75 h75) {
        boolean z;
        boolean z2 = true;
        q74 q74 = new q74(oz3, j, j2);
        this.c = q74;
        if (((d75) this.b) == null) {
            Uri uri2 = uri;
            Map map2 = map;
            d75[] b2 = ((j75) this.a).b(uri, map);
            if (b2.length == 1) {
                this.b = b2[0];
            } else {
                int length = b2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    d75 d75 = b2[i];
                    try {
                        if (d75.h(q74)) {
                            this.b = d75;
                            q74.Y = 0;
                            break;
                        }
                        z = ((d75) this.b) != null || q74.o == j;
                        swb.h(z);
                        q74.Y = 0;
                        i++;
                    } catch (EOFException unused) {
                        z = ((d75) this.b) != null || q74.o == j;
                    } catch (Throwable th) {
                        if (((d75) this.b) == null && q74.o != j) {
                            z2 = false;
                        }
                        swb.h(z2);
                        q74.Y = 0;
                        throw th;
                    }
                }
                if (((d75) this.b) == null) {
                    int i2 = mze.a;
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < b2.length; i3++) {
                        sb.append(b2[i3].getClass().getSimpleName());
                        if (i3 < b2.length - 1) {
                            sb.append(", ");
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder(me4.e(58, sb2));
                    sb3.append("None of the available extractors (");
                    sb3.append(sb2);
                    sb3.append(") could read the stream.");
                    String sb4 = sb3.toString();
                    uri.getClass();
                    throw new ParserException(sb4, (Exception) null, false, 1);
                }
            }
            ((d75) this.b).g(h75);
        }
    }

    public List q(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.a;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = (long[]) this.b;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                iqf iqf = (iqf) list.get(i);
                tw3 tw3 = iqf.a;
                if (tw3.X == -3.4028235E38f) {
                    arrayList2.add(iqf);
                } else {
                    arrayList.add(tw3);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new xb4(29));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            rw3 a2 = ((iqf) arrayList2.get(i3)).a.a();
            a2.e = (float) (-1 - i3);
            a2.f = 1;
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    public zx4 r(int i) {
        return j(i);
    }

    public String s() {
        if (n()) {
            String str = (String) this.c;
            this.c = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void t(nb7 nb7) {
        jr1 jr1 = (jr1) this.c;
        if (jr1 != null) {
            jr1.run();
        }
        jr1 jr12 = new jr1((pc7) this.a, nb7);
        this.c = jr12;
        ((Handler) this.b).postAtFrontOfQueue(jr12);
    }

    public int u() {
        return ((long[]) this.c).length;
    }

    public Bitmap v(hu4 hu4) {
        Bitmap bitmap = (Bitmap) ((xm0) ((jj7) this.a).b).c(hu4);
        if (bitmap != null) {
            return bitmap;
        }
        int i = hu4.a;
        Bitmap bitmap2 = ((Bitmap[]) ((jj7) this.a).a)[i];
        boolean z = true;
        if (bitmap2 != null) {
            cv4 cv4 = (cv4) this.b;
            int X2 = i == 24 ? a24.X(cv4.a() * ((float) 1)) : a24.X(cv4.a() * ((float) 13));
            boolean z2 = bitmap2.getWidth() == X2;
            if (!z2) {
                String name = cv4.class.getName();
                StringBuilder i2 = rf0.i("Sprite is not width enough - index: ", i, "; width: ", bitmap2.getWidth(), "; requiredWidth: ");
                i2.append(X2);
                udd.s(name, "Sprite is not width enough, may be a problem of extracting emoji", new RuntimeException(i2.toString()));
            }
            if (z2) {
                cv4 cv42 = (cv4) this.b;
                int X3 = a24.X(((Number) cv42.b.getValue()).floatValue() * ((float) hu4.b));
                int X4 = a24.X(((Number) cv42.b.getValue()).floatValue() * ((float) hu4.c));
                int X5 = a24.X(cv42.a());
                Rect rect = cv4.c;
                rect.left = 0;
                rect.top = 0;
                rect.right = X5;
                rect.bottom = X5;
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, gwf.j(X3, 0, bitmap2.getWidth() - X5), gwf.j(X4, 0, bitmap2.getHeight() - X5), X5, X5);
                ((xm0) ((jj7) this.a).b).d(new hu4(hu4.a, hu4.b, hu4.c), createBitmap);
                return createBitmap;
            }
        }
        String name2 = it4.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            if (bitmap2 != null) {
                z = false;
            }
            fn6.d(tn7, name2, us8.k("Cannot resolve SpriteBitmap. It's null - ", z), (Throwable) null);
        }
        bv4 bv4 = (bv4) this.c;
        bv4.g.computeIfAbsent(Integer.valueOf(i), new di(9, new q8(i, 2, bv4)));
        return null;
    }

    public void w() {
        ((i75) this.a).w();
    }

    public it4() {
        this.b = w8f.a;
    }

    public it4(String str) {
        tu5 tu5 = new tu5();
        tu5.k = str;
        this.a = new vu5(tu5);
    }

    public it4(i75 i75, s1e s1e) {
        this.a = i75;
        this.b = s1e;
        this.c = new SparseArray();
    }

    public it4(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.b = arrayDeque;
        this.a = bufferedReader;
    }
}
