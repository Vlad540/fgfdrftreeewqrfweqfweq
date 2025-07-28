package defpackage;

import java.io.File;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* renamed from: uwe  reason: default package */
public final class uwe implements bm6 {
    public final /* synthetic */ UploadExternalGifWorker a;

    public uwe(UploadExternalGifWorker uploadExternalGifWorker) {
        this.a = uploadExternalGifWorker;
    }

    public final void a() {
        udd.s("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadFailed", (Throwable) null);
        this.a.D0 = hk9.Z;
    }

    public final void b() {
        udd.s("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onUrlExpired", (Throwable) null);
        ((g15) this.a.A0.getValue()).c(new Exception("Tenor gif url expired"), true);
        this.a.D0 = kk9.z0;
    }

    public final void d() {
        udd.q("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCancelled");
        this.a.D0 = gk9.Y;
    }

    public final void e(File file) {
        udd.q("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCompleted");
        ((jee) this.a.w0.getValue()).d(this.a.d().a);
        UploadExternalGifWorker.c(this.a);
        vo8 q = ((to8) this.a.o.getValue()).q(this.a.d().d);
        if (q == null || q.z0 == ls8.DELETED) {
            udd.q("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadCompleted: Message was deleted");
            this.a.D0 = qwe.a;
            return;
        }
        File l = ((mg5) ((bf5) this.a.c.getValue())).l(this.a.d().f);
        if (!lp.n(l)) {
            ((xh0) ((u98) this.a.x0.getValue())).b(file, l);
        }
        this.a.D0 = new pwe(new r65(file.getAbsolutePath(), 0, 0, (String) null, (String) null, (String) null));
    }

    public final String getDownloadContext() {
        UploadExternalGifWorker uploadExternalGifWorker = this.a;
        long j = uploadExternalGifWorker.d().d;
        String str = uploadExternalGifWorker.d().c;
        return j + "_" + str;
    }

    public final void j() {
        udd.s("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadInterrupted: Can't download video", (Throwable) null);
        ((jee) this.a.w0.getValue()).n(this.a.d().a, lee.WAITING);
        this.a.D0 = jk9.z0;
    }

    public final void k(float f, long j) {
        udd.q("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadProgress progress = %s " + f);
        long nanoTime = System.nanoTime();
        if ((f > 0.0f || f < 100.0f) && Math.abs(nanoTime - this.a.C0) < 500000000) {
            udd.q("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "Skip progress");
            return;
        }
        UploadExternalGifWorker uploadExternalGifWorker = this.a;
        uploadExternalGifWorker.C0 = nanoTime;
        vo8 q = ((to8) uploadExternalGifWorker.o.getValue()).q(this.a.d().d);
        if (q == null || q.z0 == ls8.DELETED) {
            udd.q("ru.ok.tamtam.upload.workers.UploadExternalGifWorker", "onFileDownloadProgress: Message was deleted");
            ((cm6) this.a.Y.getValue()).a(((mg5) ((bf5) this.a.c.getValue())).n(this.a.d().f), this.a.d().f);
            ((jee) this.a.w0.getValue()).d(this.a.d().a);
            UploadExternalGifWorker.c(this.a);
            return;
        }
        this.a.D0 = new rwe(f, q.o);
    }
}
