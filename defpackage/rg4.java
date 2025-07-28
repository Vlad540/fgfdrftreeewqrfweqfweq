package defpackage;

/* renamed from: rg4  reason: default package */
public final /* synthetic */ class rg4 implements fhc {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg4 b;

    public /* synthetic */ rg4(sg4 sg4, int i) {
        this.a = i;
        this.b = sg4;
    }

    public void a(ahc ahc, khc khc) {
        int i = this.a;
        gve gve = (gve) ahc;
        ive ive = (ive) khc;
        sg4 sg4 = this.b;
        sg4.getClass();
        switch (i) {
            case 0:
                if (!ive.a.isEmpty()) {
                    sg4.a.log("DisplayLayouts", "Resend next time after response with errors");
                    sg4.e = true;
                    return;
                }
                return;
            default:
                sg4.a.log("DisplayLayouts", "Stop stream on participant removed response: " + ive);
                return;
        }
    }

    public void b(ahc ahc, Throwable th) {
        gve gve = (gve) ahc;
        switch (this.a) {
            case 1:
                sg4 sg4 = this.b;
                sg4.a.log("DisplayLayouts", "Resend next time after error");
                sg4.e = true;
                return;
            default:
                sg4 sg42 = this.b;
                sg42.getClass();
                sg42.a.log("DisplayLayouts", "Stop stream on participant removed error: " + th.getMessage());
                return;
        }
    }
}
