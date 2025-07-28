package defpackage;

import java.util.Collections;
import org.apache.http.cookie.ClientCookie;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: vwe  reason: default package */
public final /* synthetic */ class vwe implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UploadFileAttachWorker b;

    public /* synthetic */ vwe(UploadFileAttachWorker uploadFileAttachWorker, int i) {
        this.a = i;
        this.b = uploadFileAttachWorker;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, xs8] */
    public final Object invoke() {
        f3f f3f;
        switch (this.a) {
            case 0:
                zy3 inputData = this.b.getInputData();
                ? obj = new Object();
                String e = inputData.e(ClientCookie.PATH_ATTR);
                String str = "";
                if (e == null) {
                    e = str;
                }
                obj.b = e;
                String e2 = inputData.e("attachLocalId");
                if (e2 == null) {
                    e2 = str;
                }
                obj.f = e2;
                obj.c = inputData.d("lastModified", 0);
                long d = inputData.d("key.messageId", 0);
                long d2 = inputData.d("key.chatId", 0);
                String e3 = inputData.e("key.attachLocalId");
                obj.a = new dr8(d, e3 == null ? str : e3, d2);
                String e4 = inputData.e("uploadType");
                if (e4 == null) {
                    e4 = str;
                }
                obj.d = sxe.v(e4);
                if (Collections.unmodifiableMap(inputData.a).get("messageUpload.videoConvertOptions") != null) {
                    l10 l10 = new l10(1);
                    l10.d = inputData.b("messageUpload.videoConvertOptions.mute", false);
                    String e5 = inputData.e("messageUpload.videoConvertOptions.quality");
                    if (e5 != null) {
                        str = e5;
                    }
                    l10.a = qjb.valueOf(str);
                    l10.b = inputData.c("messageUpload.videoConvertOptions.startTrimPosition");
                    l10.c = inputData.c("messageUpload.videoConvertOptions.endTrimPosition");
                    f3f = new f3f(l10);
                } else {
                    f3f = null;
                }
                obj.e = f3f;
                return new ys8(obj);
            case 1:
                return (uc5) ((nqc) this.b.getTamComponent()).getAccessor().c(uc5.class);
            case 2:
                return ((nqc) this.b.getTamComponent()).f();
            case 3:
                return (eha) ((nqc) this.b.getTamComponent()).getAccessor().c(eha.class);
            case 4:
                return (hxe) ((nqc) this.b.getTamComponent()).getAccessor().c(hxe.class);
            case 5:
                return (n6e) ((nqc) this.b.getTamComponent()).getAccessor().c(n6e.class);
            case 6:
                return ((nqc) this.b.getTamComponent()).k();
            case 7:
                return ((nqc) this.b.getTamComponent()).q();
            case 8:
                return ((nqc) this.b.getTamComponent()).s();
            case 9:
                return (gz) ((nqc) this.b.getTamComponent()).getAccessor().c(gz.class);
            case 10:
                return (ed3) ((nqc) this.b.getTamComponent()).getAccessor().c(ed3.class);
            case 11:
                return (ft8) ((nqc) this.b.getTamComponent()).getAccessor().c(ft8.class);
            case Protos.Attaches.Attach.PRESENT:
                return ((nqc) this.b.getTamComponent()).e();
            case 13:
                return ((nqc) this.b.getTamComponent()).n();
            default:
                return ((nqc) this.b.getTamComponent()).u();
        }
    }
}
