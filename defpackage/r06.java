package defpackage;

import androidx.fragment.app.b;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* renamed from: r06  reason: default package */
public final /* synthetic */ class r06 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachVideo b;

    public /* synthetic */ r06(FrgAttachVideo frgAttachVideo, int i) {
        this.a = i;
        this.b = frgAttachVideo;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r1();
                return;
            case 1:
                this.b.H1();
                return;
            default:
                b c0 = this.b.c0();
                if (c0 != null) {
                    c0.finish();
                    c0.overridePendingTransition(0, hlb.fullscreen_to_pip);
                    return;
                }
                return;
        }
    }
}
