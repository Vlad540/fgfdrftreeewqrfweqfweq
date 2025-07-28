package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: wk4  reason: default package */
public final class wk4 extends er3 {
    public vo8 X;
    public long Y;
    public /* synthetic */ Object Z;
    public DownloadFileAttachWorker o;
    public final /* synthetic */ DownloadFileAttachWorker w0;
    public int x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wk4(DownloadFileAttachWorker downloadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.w0 = downloadFileAttachWorker;
    }

    public final Object o(Object obj) {
        this.Z = obj;
        this.x0 |= Integer.MIN_VALUE;
        return this.w0.h((vo8) null, (g10) null, 0, 0, 0, (File) null, this);
    }
}
