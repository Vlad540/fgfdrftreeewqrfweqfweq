package defpackage;

import androidx.camera.core.ImageProcessingUtil;

/* renamed from: kr6  reason: default package */
public final /* synthetic */ class kr6 implements pw5 {
    public final /* synthetic */ lr6 a;
    public final /* synthetic */ lr6 b;

    public /* synthetic */ kr6(lr6 lr6, lr6 lr62) {
        this.a = lr6;
        this.b = lr62;
    }

    public final void a(lr6 lr6) {
        lr6 lr62;
        int i = ImageProcessingUtil.a;
        if (this.a != null && (lr62 = this.b) != null) {
            lr62.close();
        }
    }
}
