package defpackage;

import ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl;

/* renamed from: vq0  reason: default package */
public final /* synthetic */ class vq0 implements Runnable {
    public final /* synthetic */ BrushWidthViewImpl a;
    public final /* synthetic */ float b;

    public /* synthetic */ vq0(BrushWidthViewImpl brushWidthViewImpl, float f) {
        this.a = brushWidthViewImpl;
        this.b = f;
    }

    public final void run() {
        BrushWidthViewImpl brushWidthViewImpl = this.a;
        float f = brushWidthViewImpl.E0;
        float f2 = (this.b - f) / (brushWidthViewImpl.F0 - f);
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float f3 = brushWidthViewImpl.C0;
        brushWidthViewImpl.A0 = f3 - ((f3 - brushWidthViewImpl.B0) * f2);
        brushWidthViewImpl.invalidate();
    }
}
