package defpackage;

import java.lang.Thread;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: x4a  reason: default package */
public final class x4a {
    public static final /* synthetic */ k77[] p;
    public final zb8 a;
    public volatile eie b;
    public final Thread.UncaughtExceptionHandler c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final r7e e = new r7e(new v4a(this, 1));
    public final q15 f;
    public final q15 g;
    public final q15 h;
    public final q15 i;
    public final q15 j;
    public final q15 k;
    public final r7e l;
    public final r7e m;
    public final r7e n;
    public final r7e o;

    static {
        Class<x4a> cls = x4a.class;
        p = new k77[]{new khb(cls, "ioExecutor", "getIoExecutor()Ljava/util/concurrent/ExecutorService;", 0), m4b.g(m7c.a, cls, "computationExecutor", "getComputationExecutor()Ljava/util/concurrent/ExecutorService;", 0), new khb(cls, "singleExecutor", "getSingleExecutor()Ljava/util/concurrent/ExecutorService;", 0), new khb(cls, "singleLowPriorityExecutor", "getSingleLowPriorityExecutor()Ljava/util/concurrent/ExecutorService;", 0), new khb(cls, "network", "getNetwork()Ljava/util/concurrent/ExecutorService;", 0), new khb(cls, "singleTransmitExecutor", "getSingleTransmitExecutor()Ljava/util/concurrent/ExecutorService;", 0)};
        int i2 = zp4.o;
        eq4 eq4 = eq4.o;
        new zb8(false, mt0.P(Integer.MAX_VALUE, eq4), mt0.P(Integer.MAX_VALUE, eq4), new qq9(9), new qq9(9));
    }

    public x4a(zb8 zb8, x93 x93, q15 q15, q15 q152, q15 q153) {
        q15 q154 = q15;
        q15 q155 = q153;
        he heVar = he.a;
        q15 q156 = new q15("single", 1, 0, false, true, 0, 72);
        q15 q157 = new q15("single-low", 1, 0, false, true, 1, 8);
        q15 q158 = new q15("trnsmt", 1, 1, 0, true, false, 10);
        this.a = zb8;
        this.b = heVar;
        this.c = x93;
        this.f = q154;
        this.g = q155;
        this.h = q156;
        this.i = q157;
        this.j = q152;
        this.k = q158;
        this.l = new r7e(new u4a(this, q154, 1));
        this.m = new r7e(new u4a(this, q155, 2));
        this.n = new r7e(new u4a(this, q156, 3));
        this.o = new r7e(new u4a(this, q156, 0));
    }

    public final ExecutorService a() {
        k77 k77 = p[1];
        return d(this.g);
    }

    public final ExecutorService b() {
        k77 k77 = p[0];
        return d(this.f);
    }

    public final ExecutorService c() {
        k77 k77 = p[2];
        return d(this.h);
    }

    public final ExecutorService d(q15 q15) {
        return (ExecutorService) this.d.computeIfAbsent(q15, new di(11, new ka(this, 24, q15)));
    }

    public final ExecutorService e(int i2, String str, int i3, int i4) {
        t4a t4a = (t4a) this.e.getValue();
        t4a.getClass();
        LinkedTransferQueue linkedTransferQueue = new LinkedTransferQueue();
        int i5 = i2;
        int i6 = i3;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i5, i6, 60000, TimeUnit.MILLISECONDS, linkedTransferQueue, t4a.a.t(str, Integer.valueOf(i4)));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.setRejectedExecutionHandler(new xt1(1));
        return i(threadPoolExecutor, str);
    }

    public final ExecutorService f(int i2, String str) {
        t4a t4a = (t4a) this.e.getValue();
        t4a.getClass();
        LinkedTransferQueue linkedTransferQueue = new LinkedTransferQueue();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, linkedTransferQueue, t4a.a.t(str, Integer.valueOf(i2)));
        threadPoolExecutor.setRejectedExecutionHandler(new xt1(1));
        return i(threadPoolExecutor, str);
    }

    public final ExecutorService g() {
        t4a t4a = (t4a) this.e.getValue();
        t4a.getClass();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 60000, TimeUnit.MILLISECONDS, new LinkedTransferQueue(), t4a.a.t("tam-srvc", 5));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.setRejectedExecutionHandler(new xt1(1));
        return i(threadPoolExecutor, "tam-srvc");
    }

    public final ScheduledExecutorService h(ExecutorService executorService, String str) {
        boolean z = executorService instanceof f25;
        r7e r7e = this.o;
        return z ? new zd4(executorService, r7e) : j(new zd4(executorService, r7e), str);
    }

    public final ExecutorService i(vg5 vg5, String str) {
        return this.a.b ? new f25(vg5, new w4a(this, 0), new uy1(str, 3)) : vg5;
    }

    public final ScheduledExecutorService j(ScheduledExecutorService scheduledExecutorService, String str) {
        return (!this.a.b || (scheduledExecutorService instanceof rlc)) ? scheduledExecutorService : new rlc(scheduledExecutorService, new w4a(this, 1), new uy1(str, 4));
    }
}
