package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* renamed from: hwe  reason: default package */
public final /* synthetic */ class hwe implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UploadDraftMediaWorker b;

    public /* synthetic */ hwe(UploadDraftMediaWorker uploadDraftMediaWorker, int i) {
        this.a = i;
        this.b = uploadDraftMediaWorker;
    }

    public final Object invoke() {
        f3f f3f;
        switch (this.a) {
            case 0:
                zy3 inputData = this.b.getInputData();
                long d = inputData.d(ApiProtocol.PARAM_CHAT_ID, 0);
                String e = inputData.e("attachLocalId");
                String str = "";
                if (e == null) {
                    e = str;
                }
                yl4 yl4 = new yl4(d, e);
                String e2 = inputData.e("draft.path");
                String str2 = e2 == null ? str : e2;
                long d2 = inputData.d("draft.lastModified", 0);
                String e3 = inputData.e("draft.uploadType");
                if (e3 == null) {
                    e3 = str;
                }
                int v = sxe.v(e3);
                if (Collections.unmodifiableMap(inputData.a).get("draft.videoConvertOptions") != null) {
                    l10 l10 = new l10(1);
                    l10.d = inputData.b("draft.videoConvertOptions.mute", false);
                    String e4 = inputData.e("draft.videoConvertOptions.quality");
                    if (e4 != null) {
                        str = e4;
                    }
                    l10.a = qjb.valueOf(str);
                    l10.b = inputData.c("draft.videoConvertOptions.startTrimPosition");
                    l10.c = inputData.c("draft.videoConvertOptions.endTrimPosition");
                    f3f = new f3f(l10);
                } else {
                    f3f = null;
                }
                return new fm4(yl4, str2, d2, v, f3f);
            case 1:
                return ((nqc) this.b.getTamComponent()).k();
            case 2:
                return (uc5) ((nqc) this.b.getTamComponent()).getAccessor().c(uc5.class);
            case 3:
                return ((nqc) this.b.getTamComponent()).s();
            case 4:
                return (om4) ((nqc) this.b.getTamComponent()).getAccessor().c(om4.class);
            case 5:
                return ((nqc) this.b.getTamComponent()).u();
            case 6:
                return ((nqc) this.b.getTamComponent()).f();
            case 7:
                return (dm4) ((nqc) this.b.getTamComponent()).getAccessor().c(dm4.class);
            case 8:
                return (jee) ((nqc) this.b.getTamComponent()).getAccessor().c(jee.class);
            case 9:
                return (hxe) ((nqc) this.b.getTamComponent()).getAccessor().c(hxe.class);
            default:
                mbe t = ((nqc) this.b.getTamComponent()).t();
                t.getClass();
                return ((nbe) t).a();
        }
    }
}
