package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;

/* renamed from: g6  reason: default package */
public final class g6 implements qf3 {
    public final /* synthetic */ ActLocalMedias a;

    public g6(ActLocalMedias actLocalMedias) {
        this.a = actLocalMedias;
    }

    public final void accept(Object obj) {
        qjb qjb = (qjb) obj;
        vd9 vd9 = this.a.m1;
        vd9.getClass();
        udd.p("vd9", "onQualitySelected: %s", new Object[]{qjb.toString()});
        l10 a2 = vd9.x0.a();
        a2.a = qjb;
        vd9.x0 = new f3f(a2);
        vd9.e2();
        vd9.f2(new pt1(1, qjb));
        vd9.f2(new od9(vd9, 4));
        vd9.z0.g("VIDEO_UPLOAD_QUALITY_SELECTED", vd9.x0.a.name());
    }
}
