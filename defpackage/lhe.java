package defpackage;

import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface;

/* renamed from: lhe  reason: default package */
public final /* synthetic */ class lhe implements VideoRendererInterface.FrameSizeListener {
    public final /* synthetic */ i26 a;

    public /* synthetic */ lhe(i26 i26) {
        this.a = i26;
    }

    public final void onFrame(int i, int i2) {
        TextureViewRenderer.setFrameSizeListener$lambda$2(this.a, i, i2);
    }
}
