package ru.ok.tamtam.upload.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000  2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H@¢\u0006\u0004\b\u0011\u0010\nR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00158\u0014XD¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lhu5;", "getForegroundInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "newProgress", "", "needToShowNotification", "(F)Z", "Lgh7;", "doWork", "Lyg9;", "needUpdateWorkerProgressNotifUseCase", "Lyg9;", "", "startTime", "J", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isGetForegroundInfoCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "oldProgress", "F", "workDelay", "getWorkDelay", "()J", "Companion", "lu5", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public abstract class ForegroundWorker extends SdkCoroutineWorker {
    public static final lu5 Companion = new Object();
    private static final long WORK_DELAY = 1000;
    private AtomicBoolean isGetForegroundInfoCalled = new AtomicBoolean(false);
    private final yg9 needUpdateWorkerProgressNotifUseCase = new yg9(gt0.p(new gz3(14, this)));
    private float oldProgress;
    private long startTime;
    private final long workDelay = WORK_DELAY;

    public ForegroundWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract Object createForegroundInfo(Continuation continuation);

    public abstract Object doForegroundWork(Continuation continuation);

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super gh7> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.mu5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            mu5 r0 = (defpackage.mu5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            mu5 r0 = new mu5
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            ru.ok.tamtam.upload.workers.ForegroundWorker r6 = r0.o
            wx3.H(r7)
            goto L_0x0056
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            wx3.H(r7)
            long r4 = java.lang.System.currentTimeMillis()
            r6.startTime = r4
            kae r7 = r6.getTamComponent()
            nqc r7 = (defpackage.nqc) r7
            rf4 r7 = r7.h()
            java.lang.String r2 = r6.getName()
            r7.f(r2)
            r0.o = r6
            r0.Z = r3
            java.lang.Object r7 = r6.doForegroundWork(r0)
            if (r7 != r1) goto L_0x0056
            return r1
        L_0x0056:
            gh7 r7 = (gh7) r7
            kae r0 = r6.getTamComponent()
            nqc r0 = (defpackage.nqc) r0
            rf4 r0 = r0.h()
            java.lang.String r6 = r6.getName()
            r0.g(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.ForegroundWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getForegroundInfo(kotlin.coroutines.Continuation<? super hu5> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.nu5
            if (r0 == 0) goto L_0x0013
            r0 = r5
            nu5 r0 = (defpackage.nu5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            nu5 r0 = new nu5
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            ru.ok.tamtam.upload.workers.ForegroundWorker r4 = r0.o
            wx3.H(r5)
            goto L_0x0044
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            wx3.H(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.isGetForegroundInfoCalled
            r5.set(r3)
            r0.o = r4
            r0.Z = r3
            java.lang.Object r5 = r4.createForegroundInfo(r0)
            if (r5 != r1) goto L_0x0044
            return r1
        L_0x0044:
            hu5 r5 = (hu5) r5
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "foreground info = %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            udd.p(r4, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.ForegroundWorker.getForegroundInfo(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract String getName();

    public long getWorkDelay() {
        return this.workDelay;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
        if ((java.lang.System.currentTimeMillis() - r4) > r0.o(ru.ok.tamtam.android.prefs.PmsKey.f133workerprogresstimedifffornotifyms, 10000)) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean needToShowNotification(float r11) {
        /*
            r10 = this;
            boolean r0 = java.lang.Float.isNaN(r11)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.isGetForegroundInfoCalled
            boolean r0 = r0.get()
            java.lang.String r2 = r10.getName()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "needToShowNotification: 1 %b"
            udd.p(r2, r4, r3)
            if (r0 == 0) goto L_0x0037
            int r2 = a24.X(r11)
            float r3 = r10.oldProgress
            int r3 = a24.X(r3)
            if (r2 != r3) goto L_0x0037
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "needToShowNotification: 2 – needToShow && newProgress.roundToInt() == oldProgress.roundToInt()"
            udd.q(r10, r11)
            return r1
        L_0x0037:
            r2 = 1
            if (r0 != 0) goto L_0x00a2
            yg9 r0 = r10.needUpdateWorkerProgressNotifUseCase
            float r3 = r10.oldProgress
            long r4 = r10.startTime
            r0.getClass()
            r6 = 0
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00a3
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x00a3
            int r6 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0051
            goto L_0x00a3
        L_0x0051:
            int r6 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a3
            int r6 = a24.X(r11)
            if (r2 > r6) goto L_0x00a3
            r7 = 101(0x65, float:1.42E-43)
            if (r6 >= r7) goto L_0x00a3
            float r3 = r11 - r3
            k77[] r6 = defpackage.yg9.b
            r7 = r6[r1]
            nj4 r0 = r0.a
            java.lang.Object r7 = r0.get()
            xzc r7 = (defpackage.xzc) r7
            vqc r7 = (defpackage.vqc) r7
            r7.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r8 = ru.ok.tamtam.android.prefs.PmsKey.f92progressdifffornotify
            java.lang.String r8 = r8.name()
            x97 r7 = r7.g
            r9 = 1101004800(0x41a00000, float:20.0)
            float r7 = r7.getFloat(r8, r9)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a2
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r4
            r3 = r6[r1]
            java.lang.Object r0 = r0.get()
            xzc r0 = (defpackage.xzc) r0
            vqc r0 = (defpackage.vqc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r3 = ru.ok.tamtam.android.prefs.PmsKey.f133workerprogresstimedifffornotifyms
            r4 = 10000(0x2710, double:4.9407E-320)
            long r3 = r0.o(r3, r4)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a3
        L_0x00a2:
            r1 = r2
        L_0x00a3:
            java.lang.String r0 = r10.getName()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            float r3 = r10.oldProgress
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Float r4 = java.lang.Float.valueOf(r11)
            long r5 = r10.startTime
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5}
            java.lang.String r3 = "needToShowNotification: 3 %b, oldProgress = %f, newProgress = %f, startTime = %d"
            udd.p(r0, r3, r2)
            r10.oldProgress = r11
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.upload.workers.ForegroundWorker.needToShowNotification(float):boolean");
    }
}
