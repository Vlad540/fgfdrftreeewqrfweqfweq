package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadExternalGifWorker;

/* renamed from: mwe  reason: default package */
public final /* synthetic */ class mwe implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UploadExternalGifWorker b;

    public /* synthetic */ mwe(UploadExternalGifWorker uploadExternalGifWorker, int i) {
        this.a = i;
        this.b = uploadExternalGifWorker;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                zy3 inputData = this.b.getInputData();
                long d = inputData.d("requestId", 0);
                String e = inputData.e("externalUrl");
                String str = e == null ? "" : e;
                String e2 = inputData.e("attachLocalId");
                String str2 = e2 == null ? "" : e2;
                long d2 = inputData.d("messageId", 0);
                long d3 = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0);
                String e3 = inputData.e("stickerId");
                if (e3 == null) {
                    e3 = "";
                }
                return new owe(d, str, str2, d2, d3, e3);
            case 1:
                return (jee) ((nqc) this.b.getTamComponent()).getAccessor().c(jee.class);
            case 2:
                return (u98) ((nqc) this.b.getTamComponent()).getAccessor().c(u98.class);
            case 3:
                return (wd5) ((nqc) this.b.getTamComponent()).getAccessor().c(wd5.class);
            case 4:
                return (uc5) ((nqc) this.b.getTamComponent()).getAccessor().c(uc5.class);
            case 5:
                return ((nqc) this.b.getTamComponent()).i();
            case 6:
                return ((nqc) this.b.getTamComponent()).k();
            case 7:
                return Integer.valueOf(this.b.d().hashCode());
            case 8:
                return ((nqc) this.b.getTamComponent()).j();
            case 9:
                return ((nqc) this.b.getTamComponent()).n();
            case 10:
                return ((nqc) this.b.getTamComponent()).f();
            case 11:
                return (cm6) ((nqc) this.b.getTamComponent()).getAccessor().c(cm6.class);
            default:
                return (eha) ((nqc) this.b.getTamComponent()).getAccessor().c(eha.class);
        }
    }
}
