package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;

/* renamed from: qk4  reason: default package */
public final class qk4 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ DownloadFileAttachWorker Y;
    public int Z;
    public DownloadFileAttachWorker o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qk4(DownloadFileAttachWorker downloadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.Y = downloadFileAttachWorker;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.doForegroundWork(this);
    }
}
