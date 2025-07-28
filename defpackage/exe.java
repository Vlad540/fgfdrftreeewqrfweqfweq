package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: exe  reason: default package */
public final class exe extends er3 {
    public UploadFileAttachWorker X;
    public long Y;
    public long Z;
    public UploadFileAttachWorker o;
    public /* synthetic */ Object w0;
    public final /* synthetic */ UploadFileAttachWorker x0;
    public int y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public exe(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.x0 = uploadFileAttachWorker;
    }

    public final Object o(Object obj) {
        this.w0 = obj;
        this.y0 |= Integer.MIN_VALUE;
        return this.x0.l(this);
    }
}
