package defpackage;

import android.graphics.Picture;
import android.text.BoringLayout;
import android.util.ArraySet;
import java.util.function.Supplier;

/* renamed from: tj  reason: default package */
public final /* synthetic */ class tj implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ tj(int i) {
        this.a = i;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return new Picture();
            case 1:
                return new BoringLayout.Metrics();
            default:
                return new ArraySet();
        }
    }
}
