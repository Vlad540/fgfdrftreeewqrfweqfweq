package defpackage;

/* renamed from: nic  reason: default package */
public final /* synthetic */ class nic implements h73, bid {
    public final /* synthetic */ ou3 a = ha6.a;
    public final /* synthetic */ hu3 b;
    public final /* synthetic */ i26 c;

    public /* synthetic */ nic(hu3 hu3, ip3 ip3) {
        this.b = hu3;
        this.c = ip3;
    }

    public void b(x63 x63) {
        mic mic = new mic(xie.x(this.a, this.b), x63, 0);
        bj4.d(x63, new bw1((Object) new lic(mic)));
        mic.start(ru3.a, mic, this.c);
    }

    public void j(ihd ihd) {
        mic mic = new mic(xie.x(this.a, this.b), ihd, 1);
        bj4.d(ihd, new bw1((Object) new lic(mic)));
        mic.start(ru3.a, mic, this.c);
    }

    public /* synthetic */ nic(hu3 hu3, x8e x8e) {
        this.b = hu3;
        this.c = x8e;
    }
}
