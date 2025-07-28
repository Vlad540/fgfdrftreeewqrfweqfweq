package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: lo8  reason: default package */
public final class lo8 implements mq3 {
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
        return new MessageContextMenuBottomSheet(new Bundle(this.a));
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

    public final mq3 l(int i) {
        this.a.putInt("parent_id", i);
        return this;
    }
}
