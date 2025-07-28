package defpackage;

/* renamed from: kla  reason: default package */
public final /* synthetic */ class kla implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zla b;
    public final /* synthetic */ String c;

    public /* synthetic */ kla(zla zla, String str, int i) {
        this.a = i;
        this.b = zla;
        this.c = str;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                zla zla = this.b;
                zla.getClass();
                StringBuilder sb = new StringBuilder("set sdp error ");
                String str = this.c;
                sb.append(str);
                zla.j(sb.toString(), "set.sdp2");
                zla.N0.log(tqd.callError, "setSdpFailed", (String) null);
                zla.G0.post(new ola(zla, str, 3));
                return;
            case 1:
                zla zla2 = this.b;
                zla2.getClass();
                StringBuilder sb2 = new StringBuilder("create sdp error ");
                String str2 = this.c;
                sb2.append(str2);
                zla2.j(sb2.toString(), "create.sdp2");
                zla2.N0.log(tqd.callError, "onCreateSDPFailed", (String) null);
                zla2.G0.post(new ola(zla2, str2, 1));
                return;
            default:
                zla zla3 = this.b;
                yla yla = zla3.d1;
                if (yla != null) {
                    yla.h(zla3, this.c);
                    return;
                }
                return;
        }
    }
}
