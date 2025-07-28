package ru.ok.tracer.heap.dumps.exceptions;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ok/tracer/heap/dumps/exceptions/ShrinkDumpWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "tracer-heap-dumps_release"}, k = 1, mv = {1, 7, 1})
public final class ShrinkDumpWorker extends Worker {
    public ShrinkDumpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        urd.l(r7, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        urd.l(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a4, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final gh7 b() {
        /*
            r10 = this;
            zy3 r0 = r10.getInputData()
            java.lang.String r1 = "param_dump_path"
            java.lang.String r0 = r0.e(r1)
            if (r0 == 0) goto L_0x00ae
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0014
            goto L_0x00ae
        L_0x0014:
            zy3 r1 = r10.getInputData()
            java.lang.String r2 = "param_tag"
            java.lang.String r6 = r1.e(r2)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            long r2 = r1.length()
            r4 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
            r1.delete()
            fh7 r10 = gh7.b()
            return r10
        L_0x0036:
            x3a r4 = n1g.c
            boolean r0 = defpackage.xhd.h(r4)
            if (r0 == 0) goto L_0x0046
            r1.delete()
            fh7 r10 = gh7.b()
            return r10
        L_0x0046:
            android.content.Context r0 = r10.getApplicationContext()     // Catch:{ IOException -> 0x00a9 }
            java.io.File r5 = gf6.j(r0, r4)     // Catch:{ IOException -> 0x00a9 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0094 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0094 }
            r7.<init>(r1)     // Catch:{ all -> 0x0094 }
            r0.<init>(r7)     // Catch:{ all -> 0x0094 }
            int r7 = defpackage.pk6.A0     // Catch:{ all -> 0x0094 }
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch:{ all -> 0x0094 }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0094 }
            r8.<init>(r0)     // Catch:{ all -> 0x0094 }
            r7.<init>(r8)     // Catch:{ all -> 0x0094 }
            pk6 r0 = new pk6     // Catch:{ all -> 0x0094 }
            r0.<init>(r7)     // Catch:{ all -> 0x0094 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0096 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x0096 }
            r8.<init>(r5)     // Catch:{ all -> 0x0096 }
            r7.<init>(r8)     // Catch:{ all -> 0x0096 }
            oyb.q(r0, r7)     // Catch:{ all -> 0x0098 }
            r8 = 0
            urd.l(r7, r8)     // Catch:{ all -> 0x0096 }
            urd.l(r0, r8)     // Catch:{ all -> 0x0094 }
            r1.delete()
            android.content.Context r10 = r10.getApplicationContext()
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            r9 = 200(0xc8, float:2.8E-43)
            r8 = 0
            r3 = r10
            defpackage.xhd.l(r3, r4, r5, r6, r7, r8, r9)
            fh7 r10 = gh7.b()
            return r10
        L_0x0094:
            r10 = move-exception
            goto L_0x00a5
        L_0x0096:
            r10 = move-exception
            goto L_0x009f
        L_0x0098:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x009a }
        L_0x009a:
            r2 = move-exception
            urd.l(r7, r10)     // Catch:{ all -> 0x0096 }
            throw r2     // Catch:{ all -> 0x0096 }
        L_0x009f:
            throw r10     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r2 = move-exception
            urd.l(r0, r10)     // Catch:{ all -> 0x0094 }
            throw r2     // Catch:{ all -> 0x0094 }
        L_0x00a5:
            r1.delete()
            throw r10
        L_0x00a9:
            dh7 r10 = gh7.a()
            return r10
        L_0x00ae:
            dh7 r10 = gh7.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.heap.dumps.exceptions.ShrinkDumpWorker.b():gh7");
    }
}
