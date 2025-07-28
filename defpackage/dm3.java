package defpackage;

import android.view.View;
import android.widget.ImageView;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: dm3  reason: default package */
public final class dm3 extends b7c {
    public final ImageView J0;
    public final TamAvatarView K0;
    public final View L0;
    public av7 M0;
    public final /* synthetic */ em3 N0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dm3(em3 em3, View view) {
        super(view);
        this.N0 = em3;
        this.J0 = (ImageView) view.findViewById(yqb.row_contact_location__static_image);
        this.K0 = (TamAvatarView) view.findViewById(yqb.row_contact_location__live_image);
        this.L0 = view.findViewById(yqb.row_contact_location__indicator);
        at7.i(view, new f5(4, this));
    }
}
