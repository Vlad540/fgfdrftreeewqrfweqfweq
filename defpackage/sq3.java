package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: sq3  reason: default package */
public final class sq3 implements mq3 {
    public final Bundle a = new Bundle();

    public final mq3 a() {
        Rect rect = bg6.b;
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.remove("highlight_radius");
        return this;
    }

    public final mq3 b() {
        Bundle bundle = this.a;
        bundle.remove("highlight_padding");
        bundle.remove("highlight_radius");
        return this;
    }

    public final nq3 build() {
        return new ContextMenuBottomSheet(new Bundle(this.a));
    }

    public final mq3 c(Rect rect, float f) {
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    public final mq3 e(Collection collection) {
        this.a.putBundle("actions", kjd.e(collection));
        return this;
    }

    public final mq3 g(float f) {
        Rect rect = bg6.b;
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    public final mq3 h(Bundle bundle) {
        this.a.putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        return this;
    }

    public final mq3 j(View view) {
        if (view.getId() != -1) {
            int id = view.getId();
            Bundle bundle = this.a;
            bundle.putInt("anchor_id", id);
            bundle.putSerializable("anchor_class", view.getClass());
            return this;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final mq3 k() {
        bqc bqc = BaseBottomSheetWidget.X;
        k77[] k77Arr = ContextMenuBottomSheet.K0;
        BaseBottomSheetWidget.X.getClass();
        this.a.putBoolean(BaseBottomSheetWidget.Z, true);
        return this;
    }
}
