package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* renamed from: gx6  reason: default package */
public final class gx6 extends InputConnectionWrapper {
    public final /* synthetic */ hy5 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gx6(InputConnection inputConnection, hy5 hy5) {
        super(inputConnection, false);
        this.a = hy5;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (this.a.f(inputContentInfo == null ? null : new mv4(16, new lv1(inputContentInfo)), i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
