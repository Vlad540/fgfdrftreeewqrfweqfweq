package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: zwe  reason: default package */
public final class zwe extends l5e implements i26 {
    public int X;
    public final /* synthetic */ UploadFileAttachWorker Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zwe(UploadFileAttachWorker uploadFileAttachWorker, Continuation continuation) {
        super(2, continuation);
        this.Y = uploadFileAttachWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zwe(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        UploadFileAttachWorker uploadFileAttachWorker = this.Y;
        if (i == 0) {
            wx3.H(obj);
            udd.p("UploadFileAttachWorker", "save %s", new Object[]{uploadFileAttachWorker.c()});
            w63 w63 = new w63(((ft8) uploadFileAttachWorker.b.getValue()).b(), 2, new ss8(1, (Object) uploadFileAttachWorker.c()));
            this.X = 1;
            if (e07.c(w63, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                udd.s("UploadFileAttachWorker", "save failed!", th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        udd.p("UploadFileAttachWorker", "save finish %s", new Object[]{uploadFileAttachWorker.c()});
        return jue.a;
    }
}
