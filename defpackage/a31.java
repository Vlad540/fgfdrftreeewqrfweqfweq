package defpackage;

import android.os.Bundle;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* renamed from: a31  reason: default package */
public final class a31 implements i34 {
    public final /* synthetic */ Bundle a;

    public a31(Bundle bundle) {
        this.a = bundle;
    }

    public final Object a() {
        Bundle bundle = this.a;
        return new CallRateBottomSheet(x87.G0("call_id", bundle), x87.B0("is_video", bundle), bundle.containsKey("sdk_reasons") ? h0e.q0(x87.G0("sdk_reasons", bundle), new String[]{","}, true, 4) : null);
    }
}
