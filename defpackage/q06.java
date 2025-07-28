package defpackage;

import android.content.Context;
import android.os.Handler;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;

/* renamed from: q06  reason: default package */
public final /* synthetic */ class q06 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachPhoto b;

    public /* synthetic */ q06(FrgAttachPhoto frgAttachPhoto, int i) {
        this.a = i;
        this.b = frgAttachPhoto;
    }

    public final void run() {
        FrgAttachPhoto frgAttachPhoto = this.b;
        switch (this.a) {
            case 0:
                Context e0 = frgAttachPhoto.e0();
                if (e0 != null) {
                    int i = cic.D;
                    Handler handler = a06.h;
                    a06.H(0, e0, e0.getString(i));
                    return;
                }
                return;
            default:
                frgAttachPhoto.G1(false);
                return;
        }
    }
}
