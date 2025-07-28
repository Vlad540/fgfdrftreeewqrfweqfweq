package defpackage;

/* renamed from: zve  reason: default package */
public final /* synthetic */ class zve implements j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fwe b;

    public /* synthetic */ zve(fwe fwe, int i) {
        this.a = i;
        this.b = fwe;
    }

    public final void run() {
        fwe fwe = this.b;
        switch (this.a) {
            case 0:
                udd.p("ewe", "getUploadFromRepository: upload not found in cache,  uploadData=%s", new Object[]{fwe});
                return;
            default:
                udd.n("ewe", "removeUploadFromRepository: finished for data=" + fwe);
                return;
        }
    }
}
