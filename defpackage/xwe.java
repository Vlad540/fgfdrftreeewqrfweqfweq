package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: xwe  reason: default package */
public final class xwe extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ UploadFileAttachWorker Y;
    public int Z;
    public UploadFileAttachWorker o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xwe(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(continuation);
        this.Y = uploadFileAttachWorker;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.doForegroundWork(this);
    }
}
