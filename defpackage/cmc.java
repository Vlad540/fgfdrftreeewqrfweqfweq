package defpackage;

import android.os.Bundle;
import android.view.Window;

/* renamed from: cmc  reason: default package */
public final class cmc extends fq0 {
    /* JADX WARNING: type inference failed for: r2v0, types: [fq0, cmc, android.app.Dialog] */
    public final void onCreate(Bundle bundle) {
        int i;
        cmc.super.onCreate(bundle);
        try {
            i = getContext().getResources().getDimensionPixelSize(omb.picker_width);
        } catch (Throwable unused) {
            i = -1;
        }
        Window window = getWindow();
        if (window != null) {
            window.setLayout(i, -1);
        }
    }
}
