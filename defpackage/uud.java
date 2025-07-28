package defpackage;

import ru.ok.messages.stickers.widgets.StickerView;

/* renamed from: uud  reason: default package */
public final /* synthetic */ class uud implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickerView b;

    public /* synthetic */ uud(StickerView stickerView, int i) {
        this.a = i;
        this.b = stickerView;
    }

    public final void run() {
        StickerView stickerView = this.b;
        switch (this.a) {
            case 0:
                stickerView.o.setClickable(true);
                return;
            case 1:
                if (!(!stickerView.w0)) {
                    throw null;
                }
                return;
            default:
                int i = StickerView.B0;
                stickerView.getClass();
                udd.n("ru.ok.messages.stickers.widgets.StickerView", "startAnimation");
                stickerView.w0 = false;
                throw null;
        }
    }
}
