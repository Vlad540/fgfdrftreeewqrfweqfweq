package defpackage;

import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* renamed from: xk4  reason: default package */
public final /* synthetic */ class xk4 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DownloadFileFromWebAppWorker b;

    public /* synthetic */ xk4(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker, int i) {
        this.a = i;
        this.b = downloadFileFromWebAppWorker;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                zy3 inputData = this.b.getInputData();
                long d = inputData.d("requestId", 0);
                long d2 = inputData.d("botId", 0);
                String e = inputData.e("fileName");
                String str = e == null ? "" : e;
                String e2 = inputData.e("fileUrl");
                return new dee(e2 == null ? "" : e2, str, d, d2);
            case 1:
                DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.b;
                return Integer.valueOf((Long.hashCode(downloadFileFromWebAppWorker.c().b) * 31) + downloadFileFromWebAppWorker.c().c.hashCode());
            case 2:
                return ((nqc) this.b.getTamComponent()).j();
            case 3:
                return ((nqc) this.b.getTamComponent()).e();
            case 4:
                return (j5e) ((nqc) this.b.getTamComponent()).getAccessor().c(j5e.class);
            case 5:
                return (wd5) ((nqc) this.b.getTamComponent()).getAccessor().c(wd5.class);
            case 6:
                return ((nqc) this.b.getTamComponent()).k();
            case 7:
                return ((nqc) this.b.getTamComponent()).s();
            case 8:
                return (ed3) ((nqc) this.b.getTamComponent()).getAccessor().c(ed3.class);
            default:
                return (ap3) ((nqc) this.b.getTamComponent()).getAccessor().c(ap3.class);
        }
    }
}
