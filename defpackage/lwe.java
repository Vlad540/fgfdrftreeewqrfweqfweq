package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* renamed from: lwe  reason: default package */
public final class lwe extends l5e implements i26 {
    public int X;
    public final /* synthetic */ UploadDraftMediaWorker Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lwe(UploadDraftMediaWorker uploadDraftMediaWorker, Continuation continuation) {
        super(2, continuation);
        this.Y = uploadDraftMediaWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lwe(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        UploadDraftMediaWorker uploadDraftMediaWorker = this.Y;
        if (i == 0) {
            wx3.H(obj);
            w63 w63 = new w63(((om4) uploadDraftMediaWorker.b.getValue()).a(), 2, new mb1(9, uploadDraftMediaWorker.d()));
            this.X = 1;
            if (e07.c(w63, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                udd.s("UploadDraftMediaWorker", "storeDraftUpload: failed", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fm4 d = uploadDraftMediaWorker.d();
        udd.q("UploadDraftMediaWorker", "storeDraftUpload: finish store upload = " + d);
        return jue.a;
    }
}
