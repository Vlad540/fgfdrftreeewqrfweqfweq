package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* renamed from: kwe  reason: default package */
public final class kwe extends er3 {
    public UploadDraftMediaWorker X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ UploadDraftMediaWorker Z;
    public UploadDraftMediaWorker o;
    public int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kwe(UploadDraftMediaWorker uploadDraftMediaWorker, Continuation continuation) {
        super(continuation);
        this.Z = uploadDraftMediaWorker;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.Z.doForegroundWork(this);
    }
}
