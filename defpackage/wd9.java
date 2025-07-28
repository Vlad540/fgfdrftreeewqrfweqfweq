package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: wd9  reason: default package */
public final /* synthetic */ class wd9 implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xd9 b;

    public /* synthetic */ wd9(xd9 xd9, int i) {
        this.a = i;
        this.b = xd9;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [ru.ok.messages.messages.widgets.MessageComposeEditText, android.view.View] */
    public final void accept(Object obj) {
        i16 s1;
        switch (this.a) {
            case 0:
                xd9 xd9 = this.b;
                u2f u2f = (u2f) obj;
                ((al7) xd9.c).r(u2f, xd9);
                o7f a2 = xd9.x0.a();
                a2.j = ((jj0) u2f).a;
                a2.n = u2f;
                p7f p7f = new p7f(a2);
                xd9.x0 = p7f;
                lf9 lf9 = (lf9) ((ge9) xd9.b);
                lf9.d(p7f);
                lf9.b(xd9);
                return;
            case 1:
                Throwable th = (Throwable) obj;
                FrgLocalVideo frgLocalVideo = this.b.Z;
                if (frgLocalVideo != null) {
                    frgLocalVideo.Y(th);
                    return;
                }
                return;
            case 2:
                Long l = (Long) obj;
                xd9 xd92 = this.b;
                ty7 ty7 = xd92.B0;
                if (ty7 != null) {
                    ActLocalMedias actLocalMedias = (ActLocalMedias) ty7;
                    if (actLocalMedias.j1.U0.isFocused() && actLocalMedias.k1.b.X) {
                        return;
                    }
                }
                o7f a3 = xd92.x0.a();
                a3.a = false;
                p7f p7f2 = new p7f(a3);
                xd92.x0 = p7f2;
                ((lf9) ((ge9) xd92.b)).d(p7f2);
                FrgLocalVideo frgLocalVideo2 = xd92.Z;
                if (frgLocalVideo2 != null && (s1 = frgLocalVideo2.s1()) != null) {
                    s1.c(false, true, false);
                    return;
                }
                return;
            default:
                Long l2 = (Long) obj;
                xd9 xd93 = this.b;
                o7f a4 = xd93.x0.a();
                al7 al7 = (al7) xd93.c;
                a4.k = al7.e();
                a4.l = al7.c();
                p7f p7f3 = new p7f(a4);
                xd93.x0 = p7f3;
                ((lf9) ((ge9) xd93.b)).d(p7f3);
                return;
        }
    }
}
